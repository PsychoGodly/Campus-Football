package dd;

/* compiled from: StatusException */
public class k1 extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final j1 f32283a;

    /* renamed from: b  reason: collision with root package name */
    private final y0 f32284b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f32285c;

    public k1(j1 j1Var) {
        this(j1Var, (y0) null);
    }

    public final j1 a() {
        return this.f32283a;
    }

    public synchronized Throwable fillInStackTrace() {
        return this.f32285c ? super.fillInStackTrace() : this;
    }

    public k1(j1 j1Var, y0 y0Var) {
        this(j1Var, y0Var, true);
    }

    k1(j1 j1Var, y0 y0Var, boolean z10) {
        super(j1.g(j1Var), j1Var.l());
        this.f32283a = j1Var;
        this.f32284b = y0Var;
        this.f32285c = z10;
        fillInStackTrace();
    }
}
