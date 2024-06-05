package v8;

/* compiled from: ReaderException */
public abstract class m extends Exception {

    /* renamed from: a  reason: collision with root package name */
    protected static final boolean f30769a = (System.getProperty("surefire.test.class.path") != null);

    /* renamed from: b  reason: collision with root package name */
    protected static final StackTraceElement[] f30770b = new StackTraceElement[0];

    m() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    m(Throwable th) {
        super(th);
    }
}
