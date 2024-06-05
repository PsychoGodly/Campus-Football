package io.grpc.internal;

import dd.r;

/* compiled from: ContextRunnable */
abstract class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final r f35435a;

    protected x(r rVar) {
        this.f35435a = rVar;
    }

    public abstract void a();

    public final void run() {
        r b10 = this.f35435a.b();
        try {
            a();
        } finally {
            this.f35435a.f(b10);
        }
    }
}
