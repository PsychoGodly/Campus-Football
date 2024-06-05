package io.grpc.internal;

import io.grpc.internal.k2;
import io.grpc.internal.l1;

/* compiled from: ForwardingDeframerListener */
abstract class l0 implements l1.b {
    l0() {
    }

    public void a(k2.a aVar) {
        b().a(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract l1.b b();

    public void c(boolean z10) {
        b().c(z10);
    }

    public void d(int i10) {
        b().d(i10);
    }

    public void e(Throwable th) {
        b().e(th);
    }
}
