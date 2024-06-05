package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w6.f;

/* compiled from: CallbackToFutureAdapter */
public final class c {

    /* compiled from: CallbackToFutureAdapter */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Object f2025a;

        /* renamed from: b  reason: collision with root package name */
        d<T> f2026b;

        /* renamed from: c  reason: collision with root package name */
        private d<Void> f2027c = d.u();

        /* renamed from: d  reason: collision with root package name */
        private boolean f2028d;

        a() {
        }

        private void d() {
            this.f2025a = null;
            this.f2026b = null;
            this.f2027c = null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f2025a = null;
            this.f2026b = null;
            this.f2027c.q(null);
        }

        public boolean b(T t10) {
            boolean z10 = true;
            this.f2028d = true;
            d<T> dVar = this.f2026b;
            if (dVar == null || !dVar.c(t10)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean c() {
            boolean z10 = true;
            this.f2028d = true;
            d<T> dVar = this.f2026b;
            if (dVar == null || !dVar.b(true)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        public boolean e(Throwable th) {
            boolean z10 = true;
            this.f2028d = true;
            d<T> dVar = this.f2026b;
            if (dVar == null || !dVar.d(th)) {
                z10 = false;
            }
            if (z10) {
                d();
            }
            return z10;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            d<Void> dVar;
            d<T> dVar2 = this.f2026b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2025a));
            }
            if (!this.f2028d && (dVar = this.f2027c) != null) {
                dVar.q(null);
            }
        }
    }

    /* compiled from: CallbackToFutureAdapter */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c  reason: collision with other inner class name */
    /* compiled from: CallbackToFutureAdapter */
    public interface C0023c<T> {
        Object a(a<T> aVar) throws Exception;
    }

    /* compiled from: CallbackToFutureAdapter */
    private static final class d<T> implements f<T> {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<a<T>> f2029a;

        /* renamed from: b  reason: collision with root package name */
        private final a<T> f2030b = new a();

        /* compiled from: CallbackToFutureAdapter */
        class a extends a<T> {
            a() {
            }

            /* access modifiers changed from: protected */
            public String n() {
                a aVar = (a) d.this.f2029a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f2025a + "]";
            }
        }

        d(a<T> aVar) {
            this.f2029a = new WeakReference<>(aVar);
        }

        public void a(Runnable runnable, Executor executor) {
            this.f2030b.a(runnable, executor);
        }

        /* access modifiers changed from: package-private */
        public boolean b(boolean z10) {
            return this.f2030b.cancel(z10);
        }

        /* access modifiers changed from: package-private */
        public boolean c(T t10) {
            return this.f2030b.q(t10);
        }

        public boolean cancel(boolean z10) {
            a aVar = (a) this.f2029a.get();
            boolean cancel = this.f2030b.cancel(z10);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        /* access modifiers changed from: package-private */
        public boolean d(Throwable th) {
            return this.f2030b.r(th);
        }

        public T get() throws InterruptedException, ExecutionException {
            return this.f2030b.get();
        }

        public boolean isCancelled() {
            return this.f2030b.isCancelled();
        }

        public boolean isDone() {
            return this.f2030b.isDone();
        }

        public String toString() {
            return this.f2030b.toString();
        }

        public T get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.f2030b.get(j10, timeUnit);
        }
    }

    public static <T> f<T> a(C0023c<T> cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f2026b = dVar;
        aVar.f2025a = cVar.getClass();
        try {
            Object a10 = cVar.a(aVar);
            if (a10 != null) {
                aVar.f2025a = a10;
            }
        } catch (Exception e10) {
            dVar.d(e10);
        }
        return dVar;
    }
}
