package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow */
public class o0 extends m0 implements n0 {
    private static Method L;
    private n0 K;

    /* compiled from: MenuPopupWindow */
    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow */
    static class b {
        static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* compiled from: MenuPopupWindow */
    public static class c extends i0 {

        /* renamed from: o  reason: collision with root package name */
        final int f1748o;

        /* renamed from: p  reason: collision with root package name */
        final int f1749p;

        /* renamed from: q  reason: collision with root package name */
        private n0 f1750q;

        /* renamed from: r  reason: collision with root package name */
        private MenuItem f1751r;

        /* compiled from: MenuPopupWindow */
        static class a {
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != a.a(configuration)) {
                this.f1748o = 22;
                this.f1749p = 21;
                return;
            }
            this.f1748o = 21;
            this.f1749p = 22;
        }

        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            f fVar;
            int pointToPosition;
            int i11;
            if (this.f1750q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                    fVar = (f) adapter;
                }
                i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < fVar.getCount()) {
                    iVar = fVar.getItem(i11);
                }
                MenuItem menuItem = this.f1751r;
                if (menuItem != iVar) {
                    g b10 = fVar.b();
                    if (menuItem != null) {
                        this.f1750q.g(b10, menuItem);
                    }
                    this.f1751r = iVar;
                    if (iVar != null) {
                        this.f1750q.d(b10, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            f fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1748o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.f1749p) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (f) adapter;
                }
                fVar.b().e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(n0 n0Var) {
            this.f1750q = n0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                L = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public o0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void M(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(this.G, (Transition) obj);
        }
    }

    public void N(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(this.G, (Transition) obj);
        }
    }

    public void O(n0 n0Var) {
        this.K = n0Var;
    }

    public void P(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = L;
            if (method != null) {
                try {
                    method.invoke(this.G, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.a(this.G, z10);
        }
    }

    public void d(g gVar, MenuItem menuItem) {
        n0 n0Var = this.K;
        if (n0Var != null) {
            n0Var.d(gVar, menuItem);
        }
    }

    public void g(g gVar, MenuItem menuItem) {
        n0 n0Var = this.K;
        if (n0Var != null) {
            n0Var.g(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public i0 r(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
