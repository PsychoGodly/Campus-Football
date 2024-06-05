package j4;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BandwidthMeter */
public interface f {

    /* compiled from: BandwidthMeter */
    public interface a {

        /* renamed from: j4.f$a$a  reason: collision with other inner class name */
        /* compiled from: BandwidthMeter */
        public static final class C0206a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList<C0207a> f19303a = new CopyOnWriteArrayList<>();

            /* renamed from: j4.f$a$a$a  reason: collision with other inner class name */
            /* compiled from: BandwidthMeter */
            private static final class C0207a {
                /* access modifiers changed from: private */

                /* renamed from: a  reason: collision with root package name */
                public final Handler f19304a;
                /* access modifiers changed from: private */

                /* renamed from: b  reason: collision with root package name */
                public final a f19305b;
                /* access modifiers changed from: private */

                /* renamed from: c  reason: collision with root package name */
                public boolean f19306c;

                public C0207a(Handler handler, a aVar) {
                    this.f19304a = handler;
                    this.f19305b = aVar;
                }

                public void d() {
                    this.f19306c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                k4.a.e(handler);
                k4.a.e(aVar);
                e(aVar);
                this.f19303a.add(new C0207a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                Iterator<C0207a> it = this.f19303a.iterator();
                while (it.hasNext()) {
                    C0207a next = it.next();
                    if (!next.f19306c) {
                        next.f19304a.post(new e(next, i10, j10, j11));
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0207a> it = this.f19303a.iterator();
                while (it.hasNext()) {
                    C0207a next = it.next();
                    if (next.f19305b == aVar) {
                        next.d();
                        this.f19303a.remove(next);
                    }
                }
            }
        }

        void P(int i10, long j10, long j11);
    }

    void b(a aVar);

    long d();

    p0 f();

    long h();

    void i(Handler handler, a aVar);
}
