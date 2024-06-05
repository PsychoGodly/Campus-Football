package pe;

import java.util.concurrent.Future;

/* compiled from: Executors.kt */
final class h1 implements i1 {

    /* renamed from: a  reason: collision with root package name */
    private final Future<?> f37318a;

    public h1(Future<?> future) {
        this.f37318a = future;
    }

    public void dispose() {
        this.f37318a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f37318a + ']';
    }
}
