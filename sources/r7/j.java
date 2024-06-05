package r7;

import android.content.Context;
import com.google.firebase.firestore.a0;
import t7.e1;
import t7.g4;
import t7.i0;
import t7.k;
import x7.n;
import x7.q;
import x7.r0;
import y7.b;
import y7.g;

/* compiled from: ComponentProvider */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private e1 f29910a;

    /* renamed from: b  reason: collision with root package name */
    private i0 f29911b;

    /* renamed from: c  reason: collision with root package name */
    private e1 f29912c;

    /* renamed from: d  reason: collision with root package name */
    private r0 f29913d;

    /* renamed from: e  reason: collision with root package name */
    private o f29914e;

    /* renamed from: f  reason: collision with root package name */
    private n f29915f;

    /* renamed from: g  reason: collision with root package name */
    private k f29916g;

    /* renamed from: h  reason: collision with root package name */
    private g4 f29917h;

    /* compiled from: ComponentProvider */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f29918a;

        /* renamed from: b  reason: collision with root package name */
        private final g f29919b;

        /* renamed from: c  reason: collision with root package name */
        private final l f29920c;

        /* renamed from: d  reason: collision with root package name */
        private final q f29921d;

        /* renamed from: e  reason: collision with root package name */
        private final p7.j f29922e;

        /* renamed from: f  reason: collision with root package name */
        private final int f29923f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f29924g;

        public a(Context context, g gVar, l lVar, q qVar, p7.j jVar, int i10, a0 a0Var) {
            this.f29918a = context;
            this.f29919b = gVar;
            this.f29920c = lVar;
            this.f29921d = qVar;
            this.f29922e = jVar;
            this.f29923f = i10;
            this.f29924g = a0Var;
        }

        /* access modifiers changed from: package-private */
        public g a() {
            return this.f29919b;
        }

        /* access modifiers changed from: package-private */
        public Context b() {
            return this.f29918a;
        }

        /* access modifiers changed from: package-private */
        public l c() {
            return this.f29920c;
        }

        /* access modifiers changed from: package-private */
        public q d() {
            return this.f29921d;
        }

        /* access modifiers changed from: package-private */
        public p7.j e() {
            return this.f29922e;
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return this.f29923f;
        }

        /* access modifiers changed from: package-private */
        public a0 g() {
            return this.f29924g;
        }
    }

    /* access modifiers changed from: protected */
    public abstract n a(a aVar);

    /* access modifiers changed from: protected */
    public abstract o b(a aVar);

    /* access modifiers changed from: protected */
    public abstract g4 c(a aVar);

    /* access modifiers changed from: protected */
    public abstract k d(a aVar);

    /* access modifiers changed from: protected */
    public abstract i0 e(a aVar);

    /* access modifiers changed from: protected */
    public abstract e1 f(a aVar);

    /* access modifiers changed from: protected */
    public abstract r0 g(a aVar);

    /* access modifiers changed from: protected */
    public abstract e1 h(a aVar);

    /* access modifiers changed from: protected */
    public n i() {
        return (n) b.e(this.f29915f, "connectivityMonitor not initialized yet", new Object[0]);
    }

    public o j() {
        return (o) b.e(this.f29914e, "eventManager not initialized yet", new Object[0]);
    }

    public g4 k() {
        return this.f29917h;
    }

    public k l() {
        return this.f29916g;
    }

    public i0 m() {
        return (i0) b.e(this.f29911b, "localStore not initialized yet", new Object[0]);
    }

    public e1 n() {
        return (e1) b.e(this.f29910a, "persistence not initialized yet", new Object[0]);
    }

    public r0 o() {
        return (r0) b.e(this.f29913d, "remoteStore not initialized yet", new Object[0]);
    }

    public e1 p() {
        return (e1) b.e(this.f29912c, "syncEngine not initialized yet", new Object[0]);
    }

    public void q(a aVar) {
        e1 f10 = f(aVar);
        this.f29910a = f10;
        f10.m();
        this.f29911b = e(aVar);
        this.f29915f = a(aVar);
        this.f29913d = g(aVar);
        this.f29912c = h(aVar);
        this.f29914e = b(aVar);
        this.f29911b.m0();
        this.f29913d.Q();
        this.f29917h = c(aVar);
        this.f29916g = d(aVar);
    }
}
