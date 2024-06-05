package pe;

import fe.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import ue.s;
import ue.t;
import xd.b;
import xd.d;
import xd.e;
import xd.g;

/* compiled from: CoroutineDispatcher.kt */
public abstract class k0 extends xd.a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37328a = new a((h) null);

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends b<e, k0> {

        /* renamed from: pe.k0$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineDispatcher.kt */
        static final class C0423a extends n implements l<g.b, k0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0423a f37329a = new C0423a();

            C0423a() {
                super(1);
            }

            /* renamed from: a */
            public final k0 invoke(g.b bVar) {
                if (bVar instanceof k0) {
                    return (k0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(e.E1, C0423a.f37329a);
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public k0() {
        super(e.E1);
    }

    public final void G0(d<?> dVar) {
        m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((ue.l) dVar).v();
    }

    public final <T> d<T> J(d<? super T> dVar) {
        return new ue.l(this, dVar);
    }

    public abstract void X0(g gVar, Runnable runnable);

    public void Y0(g gVar, Runnable runnable) {
        X0(gVar, runnable);
    }

    public boolean Z0(g gVar) {
        return true;
    }

    public k0 a1(int i10) {
        t.a(i10);
        return new s(this, i10);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return e.a.a(this, cVar);
    }

    public g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return u0.a(this) + '@' + u0.b(this);
    }
}
