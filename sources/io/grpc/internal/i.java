package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicLongCounter */
final class i implements e1 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f35091a = new AtomicLong();

    i() {
    }

    public void a(long j10) {
        this.f35091a.getAndAdd(j10);
    }
}
