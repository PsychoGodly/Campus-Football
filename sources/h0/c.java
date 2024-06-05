package h0;

import kotlin.jvm.internal.h;

/* compiled from: SingleProcessDataStore.kt */
final class c<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f18434a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18435b;

    public c(T t10, int i10) {
        super((h) null);
        this.f18434a = t10;
        this.f18435b = i10;
    }

    public final void a() {
        T t10 = this.f18434a;
        boolean z10 = false;
        if ((t10 != null ? t10.hashCode() : 0) == this.f18435b) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final T b() {
        return this.f18434a;
    }
}
