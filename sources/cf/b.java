package cf;

/* compiled from: NamedRunnable */
public abstract class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final String f31982a;

    public b(String str, Object... objArr) {
        this.f31982a = c.r(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f31982a);
        try {
            k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
