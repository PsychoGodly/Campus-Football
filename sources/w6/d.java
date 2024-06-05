package w6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import r6.i;
import r6.o;
import x6.b;

/* compiled from: Futures */
public final class d extends e {

    /* compiled from: Futures */
    private static final class a<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Future<V> f30821a;

        /* renamed from: b  reason: collision with root package name */
        final c<? super V> f30822b;

        a(Future<V> future, c<? super V> cVar) {
            this.f30821a = future;
            this.f30822b = cVar;
        }

        public void run() {
            Throwable a10;
            Future<V> future = this.f30821a;
            if (!(future instanceof x6.a) || (a10 = b.a((x6.a) future)) == null) {
                try {
                    this.f30822b.onSuccess(d.b(this.f30821a));
                } catch (ExecutionException e10) {
                    this.f30822b.a(e10.getCause());
                } catch (Error | RuntimeException e11) {
                    this.f30822b.a(e11);
                }
            } else {
                this.f30822b.a(a10);
            }
        }

        public String toString() {
            return i.c(this).k(this.f30822b).toString();
        }
    }

    public static <V> void a(f<V> fVar, c<? super V> cVar, Executor executor) {
        o.o(cVar);
        fVar.a(new a(fVar, cVar), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        o.x(future.isDone(), "Future was expected to be done: %s", future);
        return j.a(future);
    }
}
