package o7;

import java.util.concurrent.Executor;

/* compiled from: Subscriber */
public interface d {
    <T> void a(Class<T> cls, Executor executor, b<? super T> bVar);

    <T> void c(Class<T> cls, b<? super T> bVar);

    <T> void d(Class<T> cls, b<? super T> bVar);
}
