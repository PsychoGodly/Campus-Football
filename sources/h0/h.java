package h0;

import kotlin.jvm.internal.m;

/* compiled from: SingleProcessDataStore.kt */
final class h<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f18455a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Throwable th) {
        super((kotlin.jvm.internal.h) null);
        m.e(th, "finalException");
        this.f18455a = th;
    }

    public final Throwable a() {
        return this.f18455a;
    }
}
