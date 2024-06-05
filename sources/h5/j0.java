package h5;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class j0 extends l0 {

    /* renamed from: f  reason: collision with root package name */
    private final Callable f18848f;

    /* synthetic */ j0(Callable callable, i0 i0Var) {
        super(false, 1, 5, (String) null, (Throwable) null, (k0) null);
        this.f18848f = callable;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        try {
            return (String) this.f18848f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
