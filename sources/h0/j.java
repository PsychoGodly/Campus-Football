package h0;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: SingleProcessDataStore.kt */
final class j<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f18456a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Throwable th) {
        super((h) null);
        m.e(th, "readException");
        this.f18456a = th;
    }

    public final Throwable a() {
        return this.f18456a;
    }
}
