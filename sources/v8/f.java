package v8;

/* compiled from: FormatException */
public final class f extends m {

    /* renamed from: c  reason: collision with root package name */
    private static final f f30757c;

    static {
        f fVar = new f();
        f30757c = fVar;
        fVar.setStackTrace(m.f30770b);
    }

    private f() {
    }

    public static f a() {
        return m.f30769a ? new f() : f30757c;
    }

    public static f b(Throwable th) {
        return m.f30769a ? new f(th) : f30757c;
    }

    private f(Throwable th) {
        super(th);
    }
}
