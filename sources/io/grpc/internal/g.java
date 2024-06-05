package io.grpc.internal;

import io.grpc.internal.k2;
import io.grpc.internal.l1;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import r6.o;

/* compiled from: ApplicationThreadDeframerListener */
final class g implements l1.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f34911a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l1.b f34912b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue<InputStream> f34913c = new ArrayDeque();

    /* compiled from: ApplicationThreadDeframerListener */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34914a;

        a(int i10) {
            this.f34914a = i10;
        }

        public void run() {
            g.this.f34912b.d(this.f34914a);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f34916a;

        b(boolean z10) {
            this.f34916a = z10;
        }

        public void run() {
            g.this.f34912b.c(this.f34916a);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f34918a;

        c(Throwable th) {
            this.f34918a = th;
        }

        public void run() {
            g.this.f34912b.e(this.f34918a);
        }
    }

    /* compiled from: ApplicationThreadDeframerListener */
    public interface d {
        void f(Runnable runnable);
    }

    public g(l1.b bVar, d dVar) {
        this.f34912b = (l1.b) o.p(bVar, "listener");
        this.f34911a = (d) o.p(dVar, "transportExecutor");
    }

    public void a(k2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                this.f34913c.add(next);
            } else {
                return;
            }
        }
    }

    public void c(boolean z10) {
        this.f34911a.f(new b(z10));
    }

    public void d(int i10) {
        this.f34911a.f(new a(i10));
    }

    public void e(Throwable th) {
        this.f34911a.f(new c(th));
    }

    public InputStream f() {
        return this.f34913c.poll();
    }
}
