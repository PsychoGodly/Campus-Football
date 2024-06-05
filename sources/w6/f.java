package w6;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture */
public interface f<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
