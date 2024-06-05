package a;

/* compiled from: CoroutineDebugging.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1a = "_COROUTINE";

    /* access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f1a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final String c() {
        return f1a;
    }
}
