package io.grpc.internal;

/* compiled from: CallTracer */
final class m {

    /* renamed from: f  reason: collision with root package name */
    static final b f35172f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final l2 f35173a;

    /* renamed from: b  reason: collision with root package name */
    private final e1 f35174b = f1.a();

    /* renamed from: c  reason: collision with root package name */
    private final e1 f35175c = f1.a();

    /* renamed from: d  reason: collision with root package name */
    private final e1 f35176d = f1.a();

    /* renamed from: e  reason: collision with root package name */
    private volatile long f35177e;

    /* compiled from: CallTracer */
    class a implements b {
        a() {
        }

        public m a() {
            return new m(l2.f35171a);
        }
    }

    /* compiled from: CallTracer */
    public interface b {
        m a();
    }

    m(l2 l2Var) {
        this.f35173a = l2Var;
    }

    public void a(boolean z10) {
        if (z10) {
            this.f35175c.a(1);
        } else {
            this.f35176d.a(1);
        }
    }

    public void b() {
        this.f35174b.a(1);
        this.f35177e = this.f35173a.a();
    }
}
