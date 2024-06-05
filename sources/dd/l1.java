package dd;

/* compiled from: StatusRuntimeException */
public class l1 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final j1 f32287a;

    /* renamed from: b  reason: collision with root package name */
    private final y0 f32288b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f32289c;

    public l1(j1 j1Var) {
        this(j1Var, (y0) null);
    }

    public final j1 a() {
        return this.f32287a;
    }

    public synchronized Throwable fillInStackTrace() {
        return this.f32289c ? super.fillInStackTrace() : this;
    }

    public l1(j1 j1Var, y0 y0Var) {
        this(j1Var, y0Var, true);
    }

    l1(j1 j1Var, y0 y0Var, boolean z10) {
        super(j1.g(j1Var), j1Var.l());
        this.f32287a = j1Var;
        this.f32288b = y0Var;
        this.f32289c = z10;
        fillInStackTrace();
    }
}
