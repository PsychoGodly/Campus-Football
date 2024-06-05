package pe;

import fe.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sd.w;

/* compiled from: JobSupport.kt */
final class a2 extends e2 {

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f37268g = AtomicIntegerFieldUpdater.newUpdater(a2.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f  reason: collision with root package name */
    private final l<Throwable, w> f37269f;

    public a2(l<? super Throwable, w> lVar) {
        this.f37269f = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q((Throwable) obj);
        return w.f38141a;
    }

    public void q(Throwable th) {
        if (f37268g.compareAndSet(this, 0, 1)) {
            this.f37269f.invoke(th);
        }
    }
}
