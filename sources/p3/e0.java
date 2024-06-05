package p3;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.n0;
import n2.r1;
import p3.x;

/* compiled from: MediaSourceEventListener */
public interface e0 {

    /* compiled from: MediaSourceEventListener */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f21436a;

        /* renamed from: b  reason: collision with root package name */
        public final x.b f21437b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0224a> f21438c;

        /* renamed from: d  reason: collision with root package name */
        private final long f21439d;

        /* renamed from: p3.e0$a$a  reason: collision with other inner class name */
        /* compiled from: MediaSourceEventListener */
        private static final class C0224a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f21440a;

            /* renamed from: b  reason: collision with root package name */
            public e0 f21441b;

            public C0224a(Handler handler, e0 e0Var) {
                this.f21440a = handler;
                this.f21441b = e0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (x.b) null, 0);
        }

        private long h(long j10) {
            long Z0 = n0.Z0(j10);
            if (Z0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f21439d + Z0;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(e0 e0Var, t tVar) {
            e0Var.V(this.f21436a, this.f21437b, tVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(e0 e0Var, q qVar, t tVar) {
            e0Var.O(this.f21436a, this.f21437b, qVar, tVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(e0 e0Var, q qVar, t tVar) {
            e0Var.g0(this.f21436a, this.f21437b, qVar, tVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(e0 e0Var, q qVar, t tVar, IOException iOException, boolean z10) {
            e0Var.T(this.f21436a, this.f21437b, qVar, tVar, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(e0 e0Var, q qVar, t tVar) {
            e0Var.E(this.f21436a, this.f21437b, qVar, tVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(e0 e0Var, x.b bVar, t tVar) {
            e0Var.o0(this.f21436a, bVar, tVar);
        }

        public void A(q qVar, int i10, int i11, r1 r1Var, int i12, Object obj, long j10, long j11) {
            q qVar2 = qVar;
            B(qVar, new t(i10, i11, r1Var, i12, obj, h(j10), h(j11)));
        }

        public void B(q qVar, t tVar) {
            Iterator<C0224a> it = this.f21438c.iterator();
            while (it.hasNext()) {
                C0224a next = it.next();
                n0.L0(next.f21440a, new z(this, next.f21441b, qVar, tVar));
            }
        }

        public void C(e0 e0Var) {
            Iterator<C0224a> it = this.f21438c.iterator();
            while (it.hasNext()) {
                C0224a next = it.next();
                if (next.f21441b == e0Var) {
                    this.f21438c.remove(next);
                }
            }
        }

        public void D(int i10, long j10, long j11) {
            long j12 = j10;
            E(new t(1, i10, (r1) null, 3, (Object) null, h(j10), h(j11)));
        }

        public void E(t tVar) {
            x.b bVar = (x.b) k4.a.e(this.f21437b);
            Iterator<C0224a> it = this.f21438c.iterator();
            while (it.hasNext()) {
                C0224a next = it.next();
                n0.L0(next.f21440a, new d0(this, next.f21441b, bVar, tVar));
            }
        }

        public a F(int i10, x.b bVar, long j10) {
            return new a(this.f21438c, i10, bVar, j10);
        }

        public void g(Handler handler, e0 e0Var) {
            k4.a.e(handler);
            k4.a.e(e0Var);
            this.f21438c.add(new C0224a(handler, e0Var));
        }

        public void i(int i10, r1 r1Var, int i11, Object obj, long j10) {
            j(new t(1, i10, r1Var, i11, obj, h(j10), -9223372036854775807L));
        }

        public void j(t tVar) {
            Iterator<C0224a> it = this.f21438c.iterator();
            while (it.hasNext()) {
                C0224a next = it.next();
                n0.L0(next.f21440a, new c0(this, next.f21441b, tVar));
            }
        }

        public void q(q qVar, int i10) {
            r(qVar, i10, -1, (r1) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(q qVar, int i10, int i11, r1 r1Var, int i12, Object obj, long j10, long j11) {
            q qVar2 = qVar;
            s(qVar, new t(i10, i11, r1Var, i12, obj, h(j10), h(j11)));
        }

        public void s(q qVar, t tVar) {
            Iterator<C0224a> it = this.f21438c.iterator();
            while (it.hasNext()) {
                C0224a next = it.next();
                n0.L0(next.f21440a, new a0(this, next.f21441b, qVar, tVar));
            }
        }

        public void t(q qVar, int i10) {
            u(qVar, i10, -1, (r1) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(q qVar, int i10, int i11, r1 r1Var, int i12, Object obj, long j10, long j11) {
            q qVar2 = qVar;
            v(qVar, new t(i10, i11, r1Var, i12, obj, h(j10), h(j11)));
        }

        public void v(q qVar, t tVar) {
            Iterator<C0224a> it = this.f21438c.iterator();
            while (it.hasNext()) {
                C0224a next = it.next();
                n0.L0(next.f21440a, new y(this, next.f21441b, qVar, tVar));
            }
        }

        public void w(q qVar, int i10, int i11, r1 r1Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            q qVar2 = qVar;
            y(qVar, new t(i10, i11, r1Var, i12, obj, h(j10), h(j11)), iOException, z10);
        }

        public void x(q qVar, int i10, IOException iOException, boolean z10) {
            w(qVar, i10, -1, (r1) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void y(q qVar, t tVar, IOException iOException, boolean z10) {
            Iterator<C0224a> it = this.f21438c.iterator();
            while (it.hasNext()) {
                C0224a next = it.next();
                n0.L0(next.f21440a, new b0(this, next.f21441b, qVar, tVar, iOException, z10));
            }
        }

        public void z(q qVar, int i10) {
            A(qVar, i10, -1, (r1) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        private a(CopyOnWriteArrayList<C0224a> copyOnWriteArrayList, int i10, x.b bVar, long j10) {
            this.f21438c = copyOnWriteArrayList;
            this.f21436a = i10;
            this.f21437b = bVar;
            this.f21439d = j10;
        }
    }

    void E(int i10, x.b bVar, q qVar, t tVar);

    void O(int i10, x.b bVar, q qVar, t tVar);

    void T(int i10, x.b bVar, q qVar, t tVar, IOException iOException, boolean z10);

    void V(int i10, x.b bVar, t tVar);

    void g0(int i10, x.b bVar, q qVar, t tVar);

    void o0(int i10, x.b bVar, t tVar);
}
