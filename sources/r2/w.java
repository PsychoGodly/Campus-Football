package r2;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.n0;
import p3.x;

/* compiled from: DrmSessionEventListener */
public interface w {

    /* compiled from: DrmSessionEventListener */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f22092a;

        /* renamed from: b  reason: collision with root package name */
        public final x.b f22093b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList<C0229a> f22094c;

        /* renamed from: r2.w$a$a  reason: collision with other inner class name */
        /* compiled from: DrmSessionEventListener */
        private static final class C0229a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f22095a;

            /* renamed from: b  reason: collision with root package name */
            public w f22096b;

            public C0229a(Handler handler, w wVar) {
                this.f22095a = handler;
                this.f22096b = wVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (x.b) null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(w wVar) {
            wVar.U(this.f22092a, this.f22093b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(w wVar) {
            wVar.Z(this.f22092a, this.f22093b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(w wVar) {
            wVar.e0(this.f22092a, this.f22093b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(w wVar, int i10) {
            wVar.m0(this.f22092a, this.f22093b);
            wVar.i0(this.f22092a, this.f22093b, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(w wVar, Exception exc) {
            wVar.a0(this.f22092a, this.f22093b, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(w wVar) {
            wVar.k0(this.f22092a, this.f22093b);
        }

        public void g(Handler handler, w wVar) {
            k4.a.e(handler);
            k4.a.e(wVar);
            this.f22094c.add(new C0229a(handler, wVar));
        }

        public void h() {
            Iterator<C0229a> it = this.f22094c.iterator();
            while (it.hasNext()) {
                C0229a next = it.next();
                n0.L0(next.f22095a, new s(this, next.f22096b));
            }
        }

        public void i() {
            Iterator<C0229a> it = this.f22094c.iterator();
            while (it.hasNext()) {
                C0229a next = it.next();
                n0.L0(next.f22095a, new r(this, next.f22096b));
            }
        }

        public void j() {
            Iterator<C0229a> it = this.f22094c.iterator();
            while (it.hasNext()) {
                C0229a next = it.next();
                n0.L0(next.f22095a, new t(this, next.f22096b));
            }
        }

        public void k(int i10) {
            Iterator<C0229a> it = this.f22094c.iterator();
            while (it.hasNext()) {
                C0229a next = it.next();
                n0.L0(next.f22095a, new u(this, next.f22096b, i10));
            }
        }

        public void l(Exception exc) {
            Iterator<C0229a> it = this.f22094c.iterator();
            while (it.hasNext()) {
                C0229a next = it.next();
                n0.L0(next.f22095a, new v(this, next.f22096b, exc));
            }
        }

        public void m() {
            Iterator<C0229a> it = this.f22094c.iterator();
            while (it.hasNext()) {
                C0229a next = it.next();
                n0.L0(next.f22095a, new q(this, next.f22096b));
            }
        }

        public void t(w wVar) {
            Iterator<C0229a> it = this.f22094c.iterator();
            while (it.hasNext()) {
                C0229a next = it.next();
                if (next.f22096b == wVar) {
                    this.f22094c.remove(next);
                }
            }
        }

        public a u(int i10, x.b bVar) {
            return new a(this.f22094c, i10, bVar);
        }

        private a(CopyOnWriteArrayList<C0229a> copyOnWriteArrayList, int i10, x.b bVar) {
            this.f22094c = copyOnWriteArrayList;
            this.f22092a = i10;
            this.f22093b = bVar;
        }
    }

    void U(int i10, x.b bVar);

    void Z(int i10, x.b bVar);

    void a0(int i10, x.b bVar, Exception exc);

    void e0(int i10, x.b bVar);

    void i0(int i10, x.b bVar, int i11);

    void k0(int i10, x.b bVar);

    @Deprecated
    void m0(int i10, x.b bVar);
}
