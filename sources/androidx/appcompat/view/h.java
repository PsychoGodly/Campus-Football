package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet */
public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<g0> f1067a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f1068b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f1069c;

    /* renamed from: d  reason: collision with root package name */
    h0 f1070d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1071e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f1072f = new a();

    /* compiled from: ViewPropertyAnimatorCompatSet */
    class a extends i0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1073a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f1074b = 0;

        a() {
        }

        public void b(View view) {
            int i10 = this.f1074b + 1;
            this.f1074b = i10;
            if (i10 == h.this.f1067a.size()) {
                h0 h0Var = h.this.f1070d;
                if (h0Var != null) {
                    h0Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f1073a) {
                this.f1073a = true;
                h0 h0Var = h.this.f1070d;
                if (h0Var != null) {
                    h0Var.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f1074b = 0;
            this.f1073a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f1071e) {
            Iterator<g0> it = this.f1067a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f1071e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f1071e = false;
    }

    public h c(g0 g0Var) {
        if (!this.f1071e) {
            this.f1067a.add(g0Var);
        }
        return this;
    }

    public h d(g0 g0Var, g0 g0Var2) {
        this.f1067a.add(g0Var);
        g0Var2.j(g0Var.d());
        this.f1067a.add(g0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f1071e) {
            this.f1068b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f1071e) {
            this.f1069c = interpolator;
        }
        return this;
    }

    public h g(h0 h0Var) {
        if (!this.f1071e) {
            this.f1070d = h0Var;
        }
        return this;
    }

    public void h() {
        if (!this.f1071e) {
            Iterator<g0> it = this.f1067a.iterator();
            while (it.hasNext()) {
                g0 next = it.next();
                long j10 = this.f1068b;
                if (j10 >= 0) {
                    next.f(j10);
                }
                Interpolator interpolator = this.f1069c;
                if (interpolator != null) {
                    next.g(interpolator);
                }
                if (this.f1070d != null) {
                    next.h(this.f1072f);
                }
                next.l();
            }
            this.f1071e = true;
        }
    }
}
