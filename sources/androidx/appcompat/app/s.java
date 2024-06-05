package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.g0;
import androidx.core.view.a0;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar */
class s extends a {

    /* renamed from: a  reason: collision with root package name */
    final g0 f951a;

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f952b;

    /* renamed from: c  reason: collision with root package name */
    final h.i f953c;

    /* renamed from: d  reason: collision with root package name */
    boolean f954d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f955e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f956f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<a.b> f957g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f958h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Toolbar.h f959i;

    /* compiled from: ToolbarActionBar */
    class a implements Runnable {
        a() {
        }

        public void run() {
            s.this.B();
        }
    }

    /* compiled from: ToolbarActionBar */
    class b implements Toolbar.h {
        b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return s.this.f952b.onMenuItemSelected(0, menuItem);
        }
    }

    /* compiled from: ToolbarActionBar */
    private final class c implements m.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f962a;

        c() {
        }

        public void a(g gVar, boolean z10) {
            if (!this.f962a) {
                this.f962a = true;
                s.this.f951a.i();
                s.this.f952b.onPanelClosed(108, gVar);
                this.f962a = false;
            }
        }

        public boolean b(g gVar) {
            s.this.f952b.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar */
    private final class d implements g.a {
        d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            return false;
        }

        public void b(g gVar) {
            if (s.this.f951a.c()) {
                s.this.f952b.onPanelClosed(108, gVar);
            } else if (s.this.f952b.onPreparePanel(0, (View) null, gVar)) {
                s.this.f952b.onMenuOpened(108, gVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    private class e implements h.i {
        e() {
        }

        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            s sVar = s.this;
            if (sVar.f954d) {
                return false;
            }
            sVar.f951a.d();
            s.this.f954d = true;
            return false;
        }

        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(s.this.f951a.getContext());
            }
            return null;
        }
    }

    s(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f959i = bVar;
        androidx.core.util.h.f(toolbar);
        d1 d1Var = new d1(toolbar, false);
        this.f951a = d1Var;
        this.f952b = (Window.Callback) androidx.core.util.h.f(callback);
        d1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        d1Var.setWindowTitle(charSequence);
        this.f953c = new e();
    }

    private Menu A() {
        if (!this.f955e) {
            this.f951a.q(new c(), new d());
            this.f955e = true;
        }
        return this.f951a.m();
    }

    /* access modifiers changed from: package-private */
    public void B() {
        Menu A = A();
        g gVar = A instanceof g ? (g) A : null;
        if (gVar != null) {
            gVar.e0();
        }
        try {
            A.clear();
            if (!this.f952b.onCreatePanelMenu(0, A) || !this.f952b.onPreparePanel(0, (View) null, A)) {
                A.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.d0();
            }
        }
    }

    public void C(int i10, int i11) {
        this.f951a.l((i10 & i11) | ((~i11) & this.f951a.u()));
    }

    public boolean f() {
        return this.f951a.g();
    }

    public boolean g() {
        if (!this.f951a.k()) {
            return false;
        }
        this.f951a.collapseActionView();
        return true;
    }

    public void h(boolean z10) {
        if (z10 != this.f956f) {
            this.f956f = z10;
            int size = this.f957g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f957g.get(i10).a(z10);
            }
        }
    }

    public int i() {
        return this.f951a.u();
    }

    public Context j() {
        return this.f951a.getContext();
    }

    public void k() {
        this.f951a.r(8);
    }

    public boolean l() {
        this.f951a.s().removeCallbacks(this.f958h);
        a0.f0(this.f951a.s(), this.f958h);
        return true;
    }

    public boolean m() {
        return this.f951a.getVisibility() == 0;
    }

    public void n(Configuration configuration) {
        super.n(configuration);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f951a.s().removeCallbacks(this.f958h);
    }

    public boolean p(int i10, KeyEvent keyEvent) {
        Menu A = A();
        if (A == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        A.setQwertyMode(z10);
        return A.performShortcut(i10, keyEvent, 0);
    }

    public boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            r();
        }
        return true;
    }

    public boolean r() {
        return this.f951a.h();
    }

    public void s(Drawable drawable) {
        this.f951a.a(drawable);
    }

    public void t(boolean z10) {
    }

    public void u(boolean z10) {
        C(z10 ? 8 : 0, 8);
    }

    public void v(boolean z10) {
    }

    public void w(CharSequence charSequence) {
        this.f951a.setTitle(charSequence);
    }

    public void x(CharSequence charSequence) {
        this.f951a.setWindowTitle(charSequence);
    }

    public void y() {
        this.f951a.r(0);
    }
}
