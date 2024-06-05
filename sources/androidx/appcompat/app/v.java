package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.s0;
import androidx.core.view.a0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import androidx.core.view.j0;
import h.f;
import h.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar */
public class v extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;
    final h0 B = new a();
    final h0 C = new b();
    final j0 D = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f976a;

    /* renamed from: b  reason: collision with root package name */
    private Context f977b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f978c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f979d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f980e;

    /* renamed from: f  reason: collision with root package name */
    g0 f981f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f982g;

    /* renamed from: h  reason: collision with root package name */
    View f983h;

    /* renamed from: i  reason: collision with root package name */
    s0 f984i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Object> f985j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private int f986k = -1;

    /* renamed from: l  reason: collision with root package name */
    private boolean f987l;

    /* renamed from: m  reason: collision with root package name */
    d f988m;

    /* renamed from: n  reason: collision with root package name */
    androidx.appcompat.view.b f989n;

    /* renamed from: o  reason: collision with root package name */
    b.a f990o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f991p;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<a.b> f992q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private boolean f993r;

    /* renamed from: s  reason: collision with root package name */
    private int f994s = 0;

    /* renamed from: t  reason: collision with root package name */
    boolean f995t = true;

    /* renamed from: u  reason: collision with root package name */
    boolean f996u;

    /* renamed from: v  reason: collision with root package name */
    boolean f997v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f998w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f999x = true;

    /* renamed from: y  reason: collision with root package name */
    h f1000y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1001z;

    /* compiled from: WindowDecorActionBar */
    class a extends i0 {
        a() {
        }

        public void b(View view) {
            View view2;
            v vVar = v.this;
            if (vVar.f995t && (view2 = vVar.f983h) != null) {
                view2.setTranslationY(0.0f);
                v.this.f980e.setTranslationY(0.0f);
            }
            v.this.f980e.setVisibility(8);
            v.this.f980e.setTransitioning(false);
            v vVar2 = v.this;
            vVar2.f1000y = null;
            vVar2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = v.this.f979d;
            if (actionBarOverlayLayout != null) {
                a0.k0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar */
    class b extends i0 {
        b() {
        }

        public void b(View view) {
            v vVar = v.this;
            vVar.f1000y = null;
            vVar.f980e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar */
    class c implements j0 {
        c() {
        }

        public void a(View view) {
            ((View) v.this.f980e.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar */
    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f1005c;

        /* renamed from: d  reason: collision with root package name */
        private final g f1006d;

        /* renamed from: f  reason: collision with root package name */
        private b.a f1007f;

        /* renamed from: g  reason: collision with root package name */
        private WeakReference<View> f1008g;

        public d(Context context, b.a aVar) {
            this.f1005c = context;
            this.f1007f = aVar;
            g S = new g(context).S(1);
            this.f1006d = S;
            S.R(this);
        }

        public boolean a(g gVar, MenuItem menuItem) {
            b.a aVar = this.f1007f;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        public void b(g gVar) {
            if (this.f1007f != null) {
                k();
                v.this.f982g.l();
            }
        }

        public void c() {
            v vVar = v.this;
            if (vVar.f988m == this) {
                if (!v.B(vVar.f996u, vVar.f997v, false)) {
                    v vVar2 = v.this;
                    vVar2.f989n = this;
                    vVar2.f990o = this.f1007f;
                } else {
                    this.f1007f.a(this);
                }
                this.f1007f = null;
                v.this.A(false);
                v.this.f982g.g();
                v vVar3 = v.this;
                vVar3.f979d.setHideOnContentScrollEnabled(vVar3.A);
                v.this.f988m = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f1008g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f1006d;
        }

        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f1005c);
        }

        public CharSequence g() {
            return v.this.f982g.getSubtitle();
        }

        public CharSequence i() {
            return v.this.f982g.getTitle();
        }

        public void k() {
            if (v.this.f988m == this) {
                this.f1006d.e0();
                try {
                    this.f1007f.c(this, this.f1006d);
                } finally {
                    this.f1006d.d0();
                }
            }
        }

        public boolean l() {
            return v.this.f982g.j();
        }

        public void m(View view) {
            v.this.f982g.setCustomView(view);
            this.f1008g = new WeakReference<>(view);
        }

        public void n(int i10) {
            o(v.this.f976a.getResources().getString(i10));
        }

        public void o(CharSequence charSequence) {
            v.this.f982g.setSubtitle(charSequence);
        }

        public void q(int i10) {
            r(v.this.f976a.getResources().getString(i10));
        }

        public void r(CharSequence charSequence) {
            v.this.f982g.setTitle(charSequence);
        }

        public void s(boolean z10) {
            super.s(z10);
            v.this.f982g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f1006d.e0();
            try {
                return this.f1007f.b(this, this.f1006d);
            } finally {
                this.f1006d.d0();
            }
        }
    }

    public v(Activity activity, boolean z10) {
        this.f978c = activity;
        View decorView = activity.getWindow().getDecorView();
        K(decorView);
        if (!z10) {
            this.f983h = decorView.findViewById(16908290);
        }
    }

    static boolean B(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return !z10 && !z11;
    }

    private g0 F(View view) {
        if (view instanceof g0) {
            return (g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void J() {
        if (this.f998w) {
            this.f998w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f979d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T(false);
        }
    }

    private void K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f18256p);
        this.f979d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f981f = F(view.findViewById(f.f18241a));
        this.f982g = (ActionBarContextView) view.findViewById(f.f18246f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f18243c);
        this.f980e = actionBarContainer;
        g0 g0Var = this.f981f;
        if (g0Var == null || this.f982g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f976a = g0Var.getContext();
        boolean z10 = (this.f981f.u() & 4) != 0;
        if (z10) {
            this.f987l = true;
        }
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f976a);
        Q(b10.a() || z10);
        O(b10.g());
        TypedArray obtainStyledAttributes = this.f976a.obtainStyledAttributes((AttributeSet) null, j.f18304a, h.a.f18167c, 0);
        if (obtainStyledAttributes.getBoolean(j.f18354k, false)) {
            P(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f18344i, 0);
        if (dimensionPixelSize != 0) {
            N((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void O(boolean z10) {
        this.f993r = z10;
        if (!z10) {
            this.f981f.j((s0) null);
            this.f980e.setTabContainer(this.f984i);
        } else {
            this.f980e.setTabContainer((s0) null);
            this.f981f.j(this.f984i);
        }
        boolean z11 = true;
        boolean z12 = I() == 2;
        s0 s0Var = this.f984i;
        if (s0Var != null) {
            if (z12) {
                s0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f979d;
                if (actionBarOverlayLayout != null) {
                    a0.k0(actionBarOverlayLayout);
                }
            } else {
                s0Var.setVisibility(8);
            }
        }
        this.f981f.x(!this.f993r && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f979d;
        if (this.f993r || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    private boolean R() {
        return a0.R(this.f980e);
    }

    private void S() {
        if (!this.f998w) {
            this.f998w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f979d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            T(false);
        }
    }

    private void T(boolean z10) {
        if (B(this.f996u, this.f997v, this.f998w)) {
            if (!this.f999x) {
                this.f999x = true;
                E(z10);
            }
        } else if (this.f999x) {
            this.f999x = false;
            D(z10);
        }
    }

    public void A(boolean z10) {
        androidx.core.view.g0 g0Var;
        androidx.core.view.g0 g0Var2;
        if (z10) {
            S();
        } else {
            J();
        }
        if (R()) {
            if (z10) {
                g0Var = this.f981f.p(4, 100);
                g0Var2 = this.f982g.f(0, 200);
            } else {
                g0Var2 = this.f981f.p(0, 200);
                g0Var = this.f982g.f(8, 100);
            }
            h hVar = new h();
            hVar.d(g0Var, g0Var2);
            hVar.h();
        } else if (z10) {
            this.f981f.r(4);
            this.f982g.setVisibility(0);
        } else {
            this.f981f.r(0);
            this.f982g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        b.a aVar = this.f990o;
        if (aVar != null) {
            aVar.a(this.f989n);
            this.f989n = null;
            this.f990o = null;
        }
    }

    public void D(boolean z10) {
        View view;
        h hVar = this.f1000y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f994s != 0 || (!this.f1001z && !z10)) {
            this.B.b((View) null);
            return;
        }
        this.f980e.setAlpha(1.0f);
        this.f980e.setTransitioning(true);
        h hVar2 = new h();
        float f10 = (float) (-this.f980e.getHeight());
        if (z10) {
            int[] iArr = {0, 0};
            this.f980e.getLocationInWindow(iArr);
            f10 -= (float) iArr[1];
        }
        androidx.core.view.g0 m10 = a0.d(this.f980e).m(f10);
        m10.k(this.D);
        hVar2.c(m10);
        if (this.f995t && (view = this.f983h) != null) {
            hVar2.c(a0.d(view).m(f10));
        }
        hVar2.f(E);
        hVar2.e(250);
        hVar2.g(this.B);
        this.f1000y = hVar2;
        hVar2.h();
    }

    public void E(boolean z10) {
        View view;
        View view2;
        h hVar = this.f1000y;
        if (hVar != null) {
            hVar.a();
        }
        this.f980e.setVisibility(0);
        if (this.f994s != 0 || (!this.f1001z && !z10)) {
            this.f980e.setAlpha(1.0f);
            this.f980e.setTranslationY(0.0f);
            if (this.f995t && (view = this.f983h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b((View) null);
        } else {
            this.f980e.setTranslationY(0.0f);
            float f10 = (float) (-this.f980e.getHeight());
            if (z10) {
                int[] iArr = {0, 0};
                this.f980e.getLocationInWindow(iArr);
                f10 -= (float) iArr[1];
            }
            this.f980e.setTranslationY(f10);
            h hVar2 = new h();
            androidx.core.view.g0 m10 = a0.d(this.f980e).m(0.0f);
            m10.k(this.D);
            hVar2.c(m10);
            if (this.f995t && (view2 = this.f983h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(a0.d(this.f983h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250);
            hVar2.g(this.C);
            this.f1000y = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f979d;
        if (actionBarOverlayLayout != null) {
            a0.k0(actionBarOverlayLayout);
        }
    }

    public int G() {
        return this.f980e.getHeight();
    }

    public int H() {
        return this.f979d.getActionBarHideOffset();
    }

    public int I() {
        return this.f981f.o();
    }

    public void L(boolean z10) {
        M(z10 ? 4 : 0, 4);
    }

    public void M(int i10, int i11) {
        int u10 = this.f981f.u();
        if ((i11 & 4) != 0) {
            this.f987l = true;
        }
        this.f981f.l((i10 & i11) | ((~i11) & u10));
    }

    public void N(float f10) {
        a0.v0(this.f980e, f10);
    }

    public void P(boolean z10) {
        if (!z10 || this.f979d.q()) {
            this.A = z10;
            this.f979d.setHideOnContentScrollEnabled(z10);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void Q(boolean z10) {
        this.f981f.t(z10);
    }

    public void a() {
        if (this.f997v) {
            this.f997v = false;
            T(true);
        }
    }

    public void b() {
    }

    public void c(boolean z10) {
        this.f995t = z10;
    }

    public void d() {
        if (!this.f997v) {
            this.f997v = true;
            T(true);
        }
    }

    public void e() {
        h hVar = this.f1000y;
        if (hVar != null) {
            hVar.a();
            this.f1000y = null;
        }
    }

    public boolean g() {
        g0 g0Var = this.f981f;
        if (g0Var == null || !g0Var.k()) {
            return false;
        }
        this.f981f.collapseActionView();
        return true;
    }

    public void h(boolean z10) {
        if (z10 != this.f991p) {
            this.f991p = z10;
            int size = this.f992q.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f992q.get(i10).a(z10);
            }
        }
    }

    public int i() {
        return this.f981f.u();
    }

    public Context j() {
        if (this.f977b == null) {
            TypedValue typedValue = new TypedValue();
            this.f976a.getTheme().resolveAttribute(h.a.f18171g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f977b = new ContextThemeWrapper(this.f976a, i10);
            } else {
                this.f977b = this.f976a;
            }
        }
        return this.f977b;
    }

    public void k() {
        if (!this.f996u) {
            this.f996u = true;
            T(false);
        }
    }

    public boolean m() {
        int G = G();
        return this.f999x && (G == 0 || H() < G);
    }

    public void n(Configuration configuration) {
        O(androidx.appcompat.view.a.b(this.f976a).g());
    }

    public void onWindowVisibilityChanged(int i10) {
        this.f994s = i10;
    }

    public boolean p(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f988m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        e10.setQwertyMode(z10);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    public void s(Drawable drawable) {
        this.f980e.setPrimaryBackground(drawable);
    }

    public void t(boolean z10) {
        if (!this.f987l) {
            L(z10);
        }
    }

    public void u(boolean z10) {
        M(z10 ? 8 : 0, 8);
    }

    public void v(boolean z10) {
        h hVar;
        this.f1001z = z10;
        if (!z10 && (hVar = this.f1000y) != null) {
            hVar.a();
        }
    }

    public void w(CharSequence charSequence) {
        this.f981f.setTitle(charSequence);
    }

    public void x(CharSequence charSequence) {
        this.f981f.setWindowTitle(charSequence);
    }

    public void y() {
        if (this.f996u) {
            this.f996u = false;
            T(false);
        }
    }

    public androidx.appcompat.view.b z(b.a aVar) {
        d dVar = this.f988m;
        if (dVar != null) {
            dVar.c();
        }
        this.f979d.setHideOnContentScrollEnabled(false);
        this.f982g.k();
        d dVar2 = new d(this.f982g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f988m = dVar2;
        dVar2.k();
        this.f982g.h(dVar2);
        A(true);
        return dVar2;
    }

    public v(Dialog dialog) {
        K(dialog.getWindow().getDecorView());
    }
}
