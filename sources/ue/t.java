package ue;

/* compiled from: LimitedDispatcher.kt */
public final class t {
    public static final void a(int i10) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
        }
    }
}
