package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o0;
import androidx.core.view.a0;
import androidx.core.view.e;
import h.g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup */
final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = g.f18271e;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1142b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1143c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1144d;

    /* renamed from: f  reason: collision with root package name */
    private final int f1145f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1146g;

    /* renamed from: h  reason: collision with root package name */
    final Handler f1147h;

    /* renamed from: i  reason: collision with root package name */
    private final List<g> f1148i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final List<C0014d> f1149j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1150k = new a();

    /* renamed from: l  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1151l = new b();

    /* renamed from: m  reason: collision with root package name */
    private final n0 f1152m = new c();

    /* renamed from: n  reason: collision with root package name */
    private int f1153n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f1154o = 0;

    /* renamed from: p  reason: collision with root package name */
    private View f1155p;

    /* renamed from: q  reason: collision with root package name */
    View f1156q;

    /* renamed from: r  reason: collision with root package name */
    private int f1157r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1158s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1159t;

    /* renamed from: u  reason: collision with root package name */
    private int f1160u;

    /* renamed from: v  reason: collision with root package name */
    private int f1161v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1162w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1163x;

    /* renamed from: y  reason: collision with root package name */
    private m.a f1164y;

    /* renamed from: z  reason: collision with root package name */
    ViewTreeObserver f1165z;

    /* compiled from: CascadingMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (d.this.b() && d.this.f1149j.size() > 0 && !d.this.f1149j.get(0).f1173a.w()) {
                View view = d.this.f1156q;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0014d dVar : d.this.f1149j) {
                    dVar.f1173a.show();
                }
            }
        }
    }

    /* compiled from: CascadingMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.f1165z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f1165z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f1165z.removeGlobalOnLayoutListener(dVar.f1150k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup */
    class c implements n0 {

        /* compiled from: CascadingMenuPopup */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0014d f1169a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MenuItem f1170b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g f1171c;

            a(C0014d dVar, MenuItem menuItem, g gVar) {
                this.f1169a = dVar;
                this.f1170b = menuItem;
                this.f1171c = gVar;
            }

            public void run() {
                C0014d dVar = this.f1169a;
                if (dVar != null) {
                    d.this.B = true;
                    dVar.f1174b.e(false);
                    d.this.B = false;
                }
                if (this.f1170b.isEnabled() && this.f1170b.hasSubMenu()) {
                    this.f1171c.L(this.f1170b, 4);
                }
            }
        }

        c() {
        }

        public void d(g gVar, MenuItem menuItem) {
            C0014d dVar = null;
            d.this.f1147h.removeCallbacksAndMessages((Object) null);
            int size = d.this.f1149j.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (gVar == d.this.f1149j.get(i10).f1174b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                int i11 = i10 + 1;
                if (i11 < d.this.f1149j.size()) {
                    dVar = d.this.f1149j.get(i11);
                }
                d.this.f1147h.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void g(g gVar, MenuItem menuItem) {
            d.this.f1147h.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    /* compiled from: CascadingMenuPopup */
    private static class C0014d {

        /* renamed from: a  reason: collision with root package name */
        public final o0 f1173a;

        /* renamed from: b  reason: collision with root package name */
        public final g f1174b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1175c;

        public C0014d(o0 o0Var, g gVar, int i10) {
            this.f1173a = o0Var;
            this.f1174b = gVar;
            this.f1175c = i10;
        }

        public ListView a() {
            return this.f1173a.i();
        }
    }

    public d(Context context, View view, int i10, int i11, boolean z10) {
        this.f1142b = context;
        this.f1155p = view;
        this.f1144d = i10;
        this.f1145f = i11;
        this.f1146g = z10;
        this.f1162w = false;
        this.f1157r = C();
        Resources resources = context.getResources();
        this.f1143c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(h.d.f18203d));
        this.f1147h = new Handler();
    }

    private MenuItem A(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(C0014d dVar, g gVar) {
        int i10;
        f fVar;
        int firstVisiblePosition;
        MenuItem A2 = A(dVar.f1174b, gVar);
        if (A2 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i10 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (A2 == fVar.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return a0.B(this.f1155p) == 1 ? 0 : 1;
    }

    private int D(int i10) {
        List<C0014d> list = this.f1149j;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1156q.getWindowVisibleDisplayFrame(rect);
        if (this.f1157r == 1) {
            if (iArr[0] + a10.getWidth() + i10 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i10 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void E(g gVar) {
        View view;
        C0014d dVar;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f1142b);
        f fVar = new f(gVar, from, this.f1146g, C);
        if (!b() && this.f1162w) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.w(gVar));
        }
        int n10 = k.n(fVar, (ViewGroup) null, this.f1142b, this.f1143c);
        o0 y10 = y();
        y10.o(fVar);
        y10.A(n10);
        y10.B(this.f1154o);
        if (this.f1149j.size() > 0) {
            List<C0014d> list = this.f1149j;
            dVar = list.get(list.size() - 1);
            view = B(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y10.P(false);
            y10.M((Object) null);
            int D = D(n10);
            boolean z10 = D == 1;
            this.f1157r = D;
            if (Build.VERSION.SDK_INT >= 26) {
                y10.y(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1155p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1154o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1155p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1154o & 5) != 5) {
                if (z10) {
                    n10 = view.getWidth();
                }
                i12 = i10 - n10;
                y10.e(i12);
                y10.H(true);
                y10.k(i11);
            } else if (!z10) {
                n10 = view.getWidth();
                i12 = i10 - n10;
                y10.e(i12);
                y10.H(true);
                y10.k(i11);
            }
            i12 = i10 + n10;
            y10.e(i12);
            y10.H(true);
            y10.k(i11);
        } else {
            if (this.f1158s) {
                y10.e(this.f1160u);
            }
            if (this.f1159t) {
                y10.k(this.f1161v);
            }
            y10.C(m());
        }
        this.f1149j.add(new C0014d(y10, gVar, this.f1157r));
        y10.show();
        ListView i13 = y10.i();
        i13.setOnKeyListener(this);
        if (dVar == null && this.f1163x && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.f18278l, i13, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.x());
            i13.addHeaderView(frameLayout, (Object) null, false);
            y10.show();
        }
    }

    private o0 y() {
        o0 o0Var = new o0(this.f1142b, (AttributeSet) null, this.f1144d, this.f1145f);
        o0Var.O(this.f1152m);
        o0Var.G(this);
        o0Var.F(this);
        o0Var.y(this.f1155p);
        o0Var.B(this.f1154o);
        o0Var.E(true);
        o0Var.D(2);
        return o0Var;
    }

    private int z(g gVar) {
        int size = this.f1149j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (gVar == this.f1149j.get(i10).f1174b) {
                return i10;
            }
        }
        return -1;
    }

    public void a(g gVar, boolean z10) {
        int z11 = z(gVar);
        if (z11 >= 0) {
            int i10 = z11 + 1;
            if (i10 < this.f1149j.size()) {
                this.f1149j.get(i10).f1174b.e(false);
            }
            C0014d remove = this.f1149j.remove(z11);
            remove.f1174b.O(this);
            if (this.B) {
                remove.f1173a.N((Object) null);
                remove.f1173a.z(0);
            }
            remove.f1173a.dismiss();
            int size = this.f1149j.size();
            if (size > 0) {
                this.f1157r = this.f1149j.get(size - 1).f1175c;
            } else {
                this.f1157r = C();
            }
            if (size == 0) {
                dismiss();
                m.a aVar = this.f1164y;
                if (aVar != null) {
                    aVar.a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1165z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1165z.removeGlobalOnLayoutListener(this.f1150k);
                    }
                    this.f1165z = null;
                }
                this.f1156q.removeOnAttachStateChangeListener(this.f1151l);
                this.A.onDismiss();
            } else if (z10) {
                this.f1149j.get(0).f1174b.e(false);
            }
        }
    }

    public boolean b() {
        return this.f1149j.size() > 0 && this.f1149j.get(0).f1173a.b();
    }

    public void c(boolean z10) {
        for (C0014d a10 : this.f1149j) {
            k.x(a10.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean d() {
        return false;
    }

    public void dismiss() {
        int size = this.f1149j.size();
        if (size > 0) {
            C0014d[] dVarArr = (C0014d[]) this.f1149j.toArray(new C0014d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C0014d dVar = dVarArr[i10];
                if (dVar.f1173a.b()) {
                    dVar.f1173a.dismiss();
                }
            }
        }
    }

    public void g(m.a aVar) {
        this.f1164y = aVar;
    }

    public ListView i() {
        if (this.f1149j.isEmpty()) {
            return null;
        }
        List<C0014d> list = this.f1149j;
        return list.get(list.size() - 1).a();
    }

    public boolean j(r rVar) {
        for (C0014d next : this.f1149j) {
            if (rVar == next.f1174b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        k(rVar);
        m.a aVar = this.f1164y;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    public void k(g gVar) {
        gVar.c(this, this.f1142b);
        if (b()) {
            E(gVar);
        } else {
            this.f1148i.add(gVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return false;
    }

    public void o(View view) {
        if (this.f1155p != view) {
            this.f1155p = view;
            this.f1154o = e.b(this.f1153n, a0.B(view));
        }
    }

    public void onDismiss() {
        C0014d dVar;
        int size = this.f1149j.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1149j.get(i10);
            if (!dVar.f1173a.b()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f1174b.e(false);
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void q(boolean z10) {
        this.f1162w = z10;
    }

    public void r(int i10) {
        if (this.f1153n != i10) {
            this.f1153n = i10;
            this.f1154o = e.b(i10, a0.B(this.f1155p));
        }
    }

    public void s(int i10) {
        this.f1158s = true;
        this.f1160u = i10;
    }

    public void show() {
        if (!b()) {
            for (g E : this.f1148i) {
                E(E);
            }
            this.f1148i.clear();
            View view = this.f1155p;
            this.f1156q = view;
            if (view != null) {
                boolean z10 = this.f1165z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f1165z = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f1150k);
                }
                this.f1156q.addOnAttachStateChangeListener(this.f1151l);
            }
        }
    }

    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public void u(boolean z10) {
        this.f1163x = z10;
    }

    public void v(int i10) {
        this.f1159t = true;
        this.f1161v = i10;
    }
}
