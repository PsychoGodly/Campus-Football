package xa;

/* compiled from: QueuedOperation */
public class g {

    /* renamed from: a  reason: collision with root package name */
    final e f23695a;

    /* renamed from: b  reason: collision with root package name */
    final Runnable f23696b;

    public g(e eVar, Runnable runnable) {
        this.f23695a = eVar;
        this.f23696b = runnable;
    }

    public void a() {
        this.f23696b.run();
    }
}
