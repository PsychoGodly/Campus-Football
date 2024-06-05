package io.grpc.internal;

import io.grpc.internal.k2;
import io.grpc.internal.l1;
import java.io.Closeable;

/* compiled from: SquelchLateMessagesAvailableDeframerListener */
final class h2 extends l0 {

    /* renamed from: a  reason: collision with root package name */
    private final l1.b f35089a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f35090b;

    public h2(l1.b bVar) {
        this.f35089a = bVar;
    }

    public void a(k2.a aVar) {
        if (!this.f35090b) {
            super.a(aVar);
        } else if (aVar instanceof Closeable) {
            r0.e((Closeable) aVar);
        }
    }

    /* access modifiers changed from: protected */
    public l1.b b() {
        return this.f35089a;
    }

    public void c(boolean z10) {
        this.f35090b = true;
        super.c(z10);
    }

    public void e(Throwable th) {
        this.f35090b = true;
        super.e(th);
    }
}
