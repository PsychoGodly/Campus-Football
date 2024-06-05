package ye;

import fe.l;
import fe.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import pe.k0;
import pe.k3;
import pe.o;
import pe.p;
import pe.r;
import pe.t0;
import pe.u0;
import sd.w;
import ue.i0;
import ue.l0;
import xd.d;
import xd.g;

/* compiled from: Mutex.kt */
public class b extends d implements a {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f39439i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h  reason: collision with root package name */
    private final q<xe.b<?>, Object, Object, l<Throwable, w>> f39440h;
    private volatile Object owner;

    /* compiled from: Mutex.kt */
    private final class a implements o<w>, k3 {

        /* renamed from: a  reason: collision with root package name */
        public final p<w> f39441a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f39442b;

        /* renamed from: ye.b$a$a  reason: collision with other inner class name */
        /* compiled from: Mutex.kt */
        static final class C0465a extends n implements l<Throwable, w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f39444a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f39445b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0465a(b bVar, a aVar) {
                super(1);
                this.f39444a = bVar;
                this.f39445b = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.f38141a;
            }

            public final void invoke(Throwable th) {
                this.f39444a.a(this.f39445b.f39442b);
            }
        }

        /* renamed from: ye.b$a$b  reason: collision with other inner class name */
        /* compiled from: Mutex.kt */
        static final class C0466b extends n implements l<Throwable, w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f39446a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f39447b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0466b(b bVar, a aVar) {
                super(1);
                this.f39446a = bVar;
                this.f39447b = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.f38141a;
            }

            public final void invoke(Throwable th) {
                b bVar = this.f39446a;
                a aVar = this.f39447b;
                if (t0.a()) {
                    Object obj = b.f39439i.get(bVar);
                    if (!(obj == c.f39451a || obj == aVar.f39442b)) {
                        throw new AssertionError();
                    }
                }
                b.f39439i.set(this.f39446a, this.f39447b.f39442b);
                this.f39446a.a(this.f39447b.f39442b);
            }
        }

        public a(p<? super w> pVar, Object obj) {
            this.f39441a = pVar;
            this.f39442b = obj;
        }

        public void a(i0<?> i0Var, int i10) {
            this.f39441a.a(i0Var, i10);
        }

        /* renamed from: b */
        public void l(w wVar, l<? super Throwable, w> lVar) {
            b bVar = b.this;
            if (t0.a()) {
                if (!(b.f39439i.get(bVar) == c.f39451a)) {
                    throw new AssertionError();
                }
            }
            b.f39439i.set(b.this, this.f39442b);
            this.f39441a.l(wVar, new C0465a(b.this, this));
        }

        /* renamed from: c */
        public void j(k0 k0Var, w wVar) {
            this.f39441a.j(k0Var, wVar);
        }

        /* renamed from: d */
        public Object k(w wVar, Object obj, l<? super Throwable, w> lVar) {
            b bVar = b.this;
            boolean z10 = true;
            if (t0.a()) {
                if (!(b.f39439i.get(bVar) == c.f39451a)) {
                    throw new AssertionError();
                }
            }
            Object k10 = this.f39441a.k(wVar, obj, new C0466b(b.this, this));
            if (k10 != null) {
                b bVar2 = b.this;
                if (t0.a()) {
                    if (b.f39439i.get(bVar2) != c.f39451a) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
                b.f39439i.set(b.this, this.f39442b);
            }
            return k10;
        }

        public g getContext() {
            return this.f39441a.getContext();
        }

        public boolean h() {
            return this.f39441a.h();
        }

        public Object m(Throwable th) {
            return this.f39441a.m(th);
        }

        public void o(l<? super Throwable, w> lVar) {
            this.f39441a.o(lVar);
        }

        public boolean p(Throwable th) {
            return this.f39441a.p(th);
        }

        public void r(Object obj) {
            this.f39441a.r(obj);
        }

        public void resumeWith(Object obj) {
            this.f39441a.resumeWith(obj);
        }
    }

    /* renamed from: ye.b$b  reason: collision with other inner class name */
    /* compiled from: Mutex.kt */
    static final class C0467b extends n implements q<xe.b<?>, Object, Object, l<? super Throwable, ? extends w>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f39448a;

        /* renamed from: ye.b$b$a */
        /* compiled from: Mutex.kt */
        static final class a extends n implements l<Throwable, w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f39449a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f39450b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f39449a = bVar;
                this.f39450b = obj;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.f38141a;
            }

            public final void invoke(Throwable th) {
                this.f39449a.a(this.f39450b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0467b(b bVar) {
            super(3);
            this.f39448a = bVar;
        }

        /* renamed from: a */
        public final l<Throwable, w> invoke(xe.b<?> bVar, Object obj, Object obj2) {
            return new a(this.f39448a, obj);
        }
    }

    public b(boolean z10) {
        super(1, z10 ? 1 : 0);
        l0 l0Var;
        if (z10) {
            l0Var = null;
        } else {
            l0Var = c.f39451a;
        }
        this.owner = l0Var;
        this.f39440h = new C0467b(this);
    }

    static /* synthetic */ Object o(b bVar, Object obj, d<? super w> dVar) {
        if (bVar.q(obj)) {
            return w.f38141a;
        }
        Object p10 = bVar.p(obj, dVar);
        return p10 == d.c() ? p10 : w.f38141a;
    }

    private final Object p(Object obj, d<? super w> dVar) {
        p b10 = r.b(c.b(dVar));
        try {
            c(new a(b10, obj));
            Object z10 = b10.z();
            if (z10 == d.c()) {
                h.c(dVar);
            }
            if (z10 == d.c()) {
                return z10;
            }
            return w.f38141a;
        } catch (Throwable th) {
            b10.K();
            throw th;
        }
    }

    private final int r(Object obj) {
        do {
            boolean z10 = true;
            if (i()) {
                if (t0.a()) {
                    if (f39439i.get(this) != c.f39451a) {
                        z10 = false;
                    }
                    if (!z10) {
                        throw new AssertionError();
                    }
                }
                f39439i.set(this, obj);
                return 0;
            } else if (obj == null) {
                break;
            } else if (m(obj)) {
                return 2;
            }
        } while (!n());
        return 1;
    }

    public void a(Object obj) {
        while (n()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39439i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != c.f39451a) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, c.f39451a)) {
                    h();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public Object b(Object obj, d<? super w> dVar) {
        return o(this, obj, dVar);
    }

    public boolean m(Object obj) {
        while (n()) {
            Object obj2 = f39439i.get(this);
            if (obj2 != c.f39451a) {
                if (obj2 == obj) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean n() {
        return g() == 0;
    }

    public boolean q(Object obj) {
        int r10 = r(obj);
        if (r10 == 0) {
            return true;
        }
        if (r10 == 1) {
            return false;
        }
        if (r10 != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + u0.b(this) + "[isLocked=" + n() + ",owner=" + f39439i.get(this) + ']';
    }
}
