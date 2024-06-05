package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r6.o;

/* compiled from: SharedResourceHolder */
public final class f2 {

    /* renamed from: d  reason: collision with root package name */
    private static final f2 f34900d = new f2(new a());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final IdentityHashMap<d<?>, c> f34901a = new IdentityHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final e f34902b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ScheduledExecutorService f34903c;

    /* compiled from: SharedResourceHolder */
    class a implements e {
        a() {
        }

        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(r0.i("grpc-shared-destroyer-%d", true));
        }
    }

    /* compiled from: SharedResourceHolder */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f34904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f34905b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f34906c;

        b(c cVar, d dVar, Object obj) {
            this.f34904a = cVar;
            this.f34905b = dVar;
            this.f34906c = obj;
        }

        /* JADX INFO: finally extract failed */
        public void run() {
            synchronized (f2.this) {
                if (this.f34904a.f34909b == 0) {
                    try {
                        this.f34905b.b(this.f34906c);
                        f2.this.f34901a.remove(this.f34905b);
                        if (f2.this.f34901a.isEmpty()) {
                            f2.this.f34903c.shutdown();
                            ScheduledExecutorService unused = f2.this.f34903c = null;
                        }
                    } catch (Throwable th) {
                        f2.this.f34901a.remove(this.f34905b);
                        if (f2.this.f34901a.isEmpty()) {
                            f2.this.f34903c.shutdown();
                            ScheduledExecutorService unused2 = f2.this.f34903c = null;
                        }
                        throw th;
                    }
                }
            }
        }
    }

    /* compiled from: SharedResourceHolder */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final Object f34908a;

        /* renamed from: b  reason: collision with root package name */
        int f34909b;

        /* renamed from: c  reason: collision with root package name */
        ScheduledFuture<?> f34910c;

        c(Object obj) {
            this.f34908a = obj;
        }
    }

    /* compiled from: SharedResourceHolder */
    public interface d<T> {
        T a();

        void b(T t10);
    }

    /* compiled from: SharedResourceHolder */
    interface e {
        ScheduledExecutorService a();
    }

    f2(e eVar) {
        this.f34902b = eVar;
    }

    public static <T> T d(d<T> dVar) {
        return f34900d.e(dVar);
    }

    public static <T> T f(d<T> dVar, T t10) {
        return f34900d.g(dVar, t10);
    }

    /* access modifiers changed from: package-private */
    public synchronized <T> T e(d<T> dVar) {
        c cVar;
        cVar = this.f34901a.get(dVar);
        if (cVar == null) {
            cVar = new c(dVar.a());
            this.f34901a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f34910c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f34910c = null;
        }
        cVar.f34909b++;
        return cVar.f34908a;
    }

    /* access modifiers changed from: package-private */
    public synchronized <T> T g(d<T> dVar, T t10) {
        c cVar = this.f34901a.get(dVar);
        if (cVar != null) {
            boolean z10 = false;
            o.e(t10 == cVar.f34908a, "Releasing the wrong instance");
            o.v(cVar.f34909b > 0, "Refcount has already reached zero");
            int i10 = cVar.f34909b - 1;
            cVar.f34909b = i10;
            if (i10 == 0) {
                if (cVar.f34910c == null) {
                    z10 = true;
                }
                o.v(z10, "Destroy task already scheduled");
                if (this.f34903c == null) {
                    this.f34903c = this.f34902b.a();
                }
                cVar.f34910c = this.f34903c.schedule(new d1(new b(cVar, dVar, t10)), 1, TimeUnit.SECONDS);
            }
        } else {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        return null;
    }
}
