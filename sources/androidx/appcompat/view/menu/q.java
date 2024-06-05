package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.o0;
import androidx.core.view.a0;
import h.d;
import h.g;

/* compiled from: StandardMenuPopup */
final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: w  reason: collision with root package name */
    private static final int f1276w = g.f18279m;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1277b;

    /* renamed from: c  reason: collision with root package name */
    private final g f1278c;

    /* renamed from: d  reason: collision with root package name */
    private final f f1279d;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1280f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1281g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1282h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1283i;

    /* renamed from: j  reason: collision with root package name */
    final o0 f1284j;

    /* renamed from: k  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1285k = new a();

    /* renamed from: l  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1286l = new b();

    /* renamed from: m  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1287m;

    /* renamed from: n  reason: collision with root package name */
    private View f1288n;

    /* renamed from: o  reason: collision with root package name */
    View f1289o;

    /* renamed from: p  reason: collision with root package name */
    private m.a f1290p;

    /* renamed from: q  reason: collision with root package name */
    ViewTreeObserver f1291q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1292r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1293s;

    /* renamed from: t  reason: collision with root package name */
    private int f1294t;

    /* renamed from: u  reason: collision with root package name */
    private int f1295u = 0;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1296v;

    /* compiled from: StandardMenuPopup */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (q.this.b() && !q.this.f1284j.w()) {
                View view = q.this.f1289o;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.f1284j.show();
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.f1291q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f1291q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f1291q.removeGlobalOnLayoutListener(qVar.f1285k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i10, int i11, boolean z10) {
        this.f1277b = context;
        this.f1278c = gVar;
        this.f1280f = z10;
        this.f1279d = new f(gVar, LayoutInflater.from(context), z10, f1276w);
        this.f1282h = i10;
        this.f1283i = i11;
        Resources resources = context.getResources();
        this.f1281g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.f18203d));
        this.f1288n = view;
        this.f1284j = new o0(context, (AttributeSet) null, i10, i11);
        gVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (b()) {
            return true;
        }
        if (this.f1292r || (view = this.f1288n) == null) {
            return false;
        }
        this.f1289o = view;
        this.f1284j.F(this);
        this.f1284j.G(this);
        this.f1284j.E(true);
        View view2 = this.f1289o;
        boolean z10 = this.f1291q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1291q = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1285k);
        }
        view2.addOnAttachStateChangeListener(this.f1286l);
        this.f1284j.y(view2);
        this.f1284j.B(this.f1295u);
        if (!this.f1293s) {
            this.f1294t = k.n(this.f1279d, (ViewGroup) null, this.f1277b, this.f1281g);
            this.f1293s = true;
        }
        this.f1284j.A(this.f1294t);
        this.f1284j.D(2);
        this.f1284j.C(m());
        this.f1284j.show();
        ListView i10 = this.f1284j.i();
        i10.setOnKeyListener(this);
        if (this.f1296v && this.f1278c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1277b).inflate(g.f18278l, i10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1278c.x());
            }
            frameLayout.setEnabled(false);
            i10.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f1284j.o(this.f1279d);
        this.f1284j.show();
        return true;
    }

    public void a(g gVar, boolean z10) {
        if (gVar == this.f1278c) {
            dismiss();
            m.a aVar = this.f1290p;
            if (aVar != null) {
                aVar.a(gVar, z10);
            }
        }
    }

    public boolean b() {
        return !this.f1292r && this.f1284j.b();
    }

    public void c(boolean z10) {
        this.f1293s = false;
        f fVar = this.f1279d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public boolean d() {
        return false;
    }

    public void dismiss() {
        if (b()) {
            this.f1284j.dismiss();
        }
    }

    public void g(m.a aVar) {
        this.f1290p = aVar;
    }

    public ListView i() {
        return this.f1284j.i();
    }

    public boolean j(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f1277b, rVar, this.f1289o, this.f1280f, this.f1282h, this.f1283i);
            lVar.j(this.f1290p);
            lVar.g(k.w(rVar));
            lVar.i(this.f1287m);
            this.f1287m = null;
            this.f1278c.e(false);
            int c10 = this.f1284j.c();
            int n10 = this.f1284j.n();
            if ((Gravity.getAbsoluteGravity(this.f1295u, a0.B(this.f1288n)) & 7) == 5) {
                c10 += this.f1288n.getWidth();
            }
            if (lVar.n(c10, n10)) {
                m.a aVar = this.f1290p;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    public void k(g gVar) {
    }

    public void o(View view) {
        this.f1288n = view;
    }

    public void onDismiss() {
        this.f1292r = true;
        this.f1278c.close();
        ViewTreeObserver viewTreeObserver = this.f1291q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1291q = this.f1289o.getViewTreeObserver();
            }
            this.f1291q.removeGlobalOnLayoutListener(this.f1285k);
            this.f1291q = null;
        }
        this.f1289o.removeOnAttachStateChangeListener(this.f1286l);
        PopupWindow.OnDismissListener onDismissListener = this.f1287m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f1279d.d(z10);
    }

    public void r(int i10) {
        this.f1295u = i10;
    }

    public void s(int i10) {
        this.f1284j.e(i10);
    }

    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1287m = onDismissListener;
    }

    public void u(boolean z10) {
        this.f1296v = z10;
    }

    public void v(int i10) {
        this.f1284j.k(i10);
    }
}
