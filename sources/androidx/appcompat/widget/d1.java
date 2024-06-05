package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.a0;
import androidx.core.view.g0;
import androidx.core.view.i0;
import h.e;
import h.f;
import h.h;
import h.j;

/* compiled from: ToolbarWidgetWrapper */
public class d1 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1568a;

    /* renamed from: b  reason: collision with root package name */
    private int f1569b;

    /* renamed from: c  reason: collision with root package name */
    private View f1570c;

    /* renamed from: d  reason: collision with root package name */
    private View f1571d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1572e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1573f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1574g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1575h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1576i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1577j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1578k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1579l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1580m;

    /* renamed from: n  reason: collision with root package name */
    private c f1581n;

    /* renamed from: o  reason: collision with root package name */
    private int f1582o;

    /* renamed from: p  reason: collision with root package name */
    private int f1583p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1584q;

    /* compiled from: ToolbarWidgetWrapper */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1585a;

        a() {
            this.f1585a = new androidx.appcompat.view.menu.a(d1.this.f1568a.getContext(), 0, 16908332, 0, 0, d1.this.f1576i);
        }

        public void onClick(View view) {
            d1 d1Var = d1.this;
            Window.Callback callback = d1Var.f1579l;
            if (callback != null && d1Var.f1580m) {
                callback.onMenuItemSelected(0, this.f1585a);
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper */
    class b extends i0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1587a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1588b;

        b(int i10) {
            this.f1588b = i10;
        }

        public void a(View view) {
            this.f1587a = true;
        }

        public void b(View view) {
            if (!this.f1587a) {
                d1.this.f1568a.setVisibility(this.f1588b);
            }
        }

        public void c(View view) {
            d1.this.f1568a.setVisibility(0);
        }
    }

    public d1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, h.f18287a, e.f18228n);
    }

    private void G(CharSequence charSequence) {
        this.f1576i = charSequence;
        if ((this.f1569b & 8) != 0) {
            this.f1568a.setTitle(charSequence);
            if (this.f1575h) {
                a0.q0(this.f1568a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f1569b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1578k)) {
            this.f1568a.setNavigationContentDescription(this.f1583p);
        } else {
            this.f1568a.setNavigationContentDescription(this.f1578k);
        }
    }

    private void I() {
        if ((this.f1569b & 4) != 0) {
            Toolbar toolbar = this.f1568a;
            Drawable drawable = this.f1574g;
            if (drawable == null) {
                drawable = this.f1584q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1568a.setNavigationIcon((Drawable) null);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f1569b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f1573f;
            if (drawable == null) {
                drawable = this.f1572e;
            }
        } else {
            drawable = this.f1572e;
        }
        this.f1568a.setLogo(drawable);
    }

    private int y() {
        if (this.f1568a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1584q = this.f1568a.getNavigationIcon();
        return 15;
    }

    public void A(int i10) {
        if (i10 != this.f1583p) {
            this.f1583p = i10;
            if (TextUtils.isEmpty(this.f1568a.getNavigationContentDescription())) {
                C(this.f1583p);
            }
        }
    }

    public void B(Drawable drawable) {
        this.f1573f = drawable;
        J();
    }

    public void C(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void D(CharSequence charSequence) {
        this.f1578k = charSequence;
        H();
    }

    public void E(Drawable drawable) {
        this.f1574g = drawable;
        I();
    }

    public void F(CharSequence charSequence) {
        this.f1577j = charSequence;
        if ((this.f1569b & 8) != 0) {
            this.f1568a.setSubtitle(charSequence);
        }
    }

    public void a(Drawable drawable) {
        a0.r0(this.f1568a, drawable);
    }

    public void b(Menu menu, m.a aVar) {
        if (this.f1581n == null) {
            c cVar = new c(this.f1568a.getContext());
            this.f1581n = cVar;
            cVar.p(f.f18247g);
        }
        this.f1581n.g(aVar);
        this.f1568a.K((g) menu, this.f1581n);
    }

    public boolean c() {
        return this.f1568a.B();
    }

    public void collapseActionView() {
        this.f1568a.e();
    }

    public void d() {
        this.f1580m = true;
    }

    public boolean e() {
        return this.f1568a.d();
    }

    public boolean f() {
        return this.f1568a.A();
    }

    public boolean g() {
        return this.f1568a.w();
    }

    public Context getContext() {
        return this.f1568a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1568a.getTitle();
    }

    public int getVisibility() {
        return this.f1568a.getVisibility();
    }

    public boolean h() {
        return this.f1568a.Q();
    }

    public void i() {
        this.f1568a.f();
    }

    public void j(s0 s0Var) {
        Toolbar toolbar;
        View view = this.f1570c;
        if (view != null && view.getParent() == (toolbar = this.f1568a)) {
            toolbar.removeView(this.f1570c);
        }
        this.f1570c = s0Var;
        if (s0Var != null && this.f1582o == 2) {
            this.f1568a.addView(s0Var, 0);
            Toolbar.g gVar = (Toolbar.g) this.f1570c.getLayoutParams();
            gVar.width = -2;
            gVar.height = -2;
            gVar.f834a = 8388691;
            s0Var.setAllowCollapse(true);
        }
    }

    public boolean k() {
        return this.f1568a.v();
    }

    public void l(int i10) {
        View view;
        int i11 = this.f1569b ^ i10;
        this.f1569b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1568a.setTitle(this.f1576i);
                    this.f1568a.setSubtitle(this.f1577j);
                } else {
                    this.f1568a.setTitle((CharSequence) null);
                    this.f1568a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1571d) != null) {
                if ((i10 & 16) != 0) {
                    this.f1568a.addView(view);
                } else {
                    this.f1568a.removeView(view);
                }
            }
        }
    }

    public Menu m() {
        return this.f1568a.getMenu();
    }

    public void n(int i10) {
        B(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public int o() {
        return this.f1582o;
    }

    public g0 p(int i10, long j10) {
        return a0.d(this.f1568a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    public void q(m.a aVar, g.a aVar2) {
        this.f1568a.L(aVar, aVar2);
    }

    public void r(int i10) {
        this.f1568a.setVisibility(i10);
    }

    public ViewGroup s() {
        return this.f1568a;
    }

    public void setIcon(int i10) {
        setIcon(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1575h = true;
        G(charSequence);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1579l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1575h) {
            G(charSequence);
        }
    }

    public void t(boolean z10) {
    }

    public int u() {
        return this.f1569b;
    }

    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void x(boolean z10) {
        this.f1568a.setCollapsible(z10);
    }

    public void z(View view) {
        View view2 = this.f1571d;
        if (!(view2 == null || (this.f1569b & 16) == 0)) {
            this.f1568a.removeView(view2);
        }
        this.f1571d = view;
        if (view != null && (this.f1569b & 16) != 0) {
            this.f1568a.addView(view);
        }
    }

    public d1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1582o = 0;
        this.f1583p = 0;
        this.f1568a = toolbar;
        this.f1576i = toolbar.getTitle();
        this.f1577j = toolbar.getSubtitle();
        this.f1575h = this.f1576i != null;
        this.f1574g = toolbar.getNavigationIcon();
        z0 v10 = z0.v(toolbar.getContext(), (AttributeSet) null, j.f18304a, h.a.f18167c, 0);
        this.f1584q = v10.g(j.f18359l);
        if (z10) {
            CharSequence p10 = v10.p(j.f18389r);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(j.f18379p);
            if (!TextUtils.isEmpty(p11)) {
                F(p11);
            }
            Drawable g10 = v10.g(j.f18369n);
            if (g10 != null) {
                B(g10);
            }
            Drawable g11 = v10.g(j.f18364m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f1574g == null && (drawable = this.f1584q) != null) {
                E(drawable);
            }
            l(v10.k(j.f18339h, 0));
            int n10 = v10.n(j.f18334g, 0);
            if (n10 != 0) {
                z(LayoutInflater.from(this.f1568a.getContext()).inflate(n10, this.f1568a, false));
                l(this.f1569b | 16);
            }
            int m10 = v10.m(j.f18349j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1568a.getLayoutParams();
                layoutParams.height = m10;
                this.f1568a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(j.f18329f, -1);
            int e11 = v10.e(j.f18324e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f1568a.J(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(j.f18394s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f1568a;
                toolbar2.N(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(j.f18384q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f1568a;
                toolbar3.M(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(j.f18374o, 0);
            if (n13 != 0) {
                this.f1568a.setPopupTheme(n13);
            }
        } else {
            this.f1569b = y();
        }
        v10.w();
        A(i10);
        this.f1578k = this.f1568a.getNavigationContentDescription();
        this.f1568a.setNavigationOnClickListener(new a());
    }

    public void setIcon(Drawable drawable) {
        this.f1572e = drawable;
        J();
    }
}
