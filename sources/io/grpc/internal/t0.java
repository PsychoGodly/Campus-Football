package io.grpc.internal;

import dd.j1;
import java.util.Set;
import r6.i;
import r6.k;
import s6.x;

/* compiled from: HedgingPolicy */
final class t0 {

    /* renamed from: a  reason: collision with root package name */
    final int f35386a;

    /* renamed from: b  reason: collision with root package name */
    final long f35387b;

    /* renamed from: c  reason: collision with root package name */
    final Set<j1.b> f35388c;

    t0(int i10, long j10, Set<j1.b> set) {
        this.f35386a = i10;
        this.f35387b = j10;
        this.f35388c = x.p(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f35386a == t0Var.f35386a && this.f35387b == t0Var.f35387b && k.a(this.f35388c, t0Var.f35388c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Integer.valueOf(this.f35386a), Long.valueOf(this.f35387b), this.f35388c);
    }

    public String toString() {
        return i.c(this).b("maxAttempts", this.f35386a).c("hedgingDelayNanos", this.f35387b).d("nonFatalStatusCodes", this.f35388c).toString();
    }
}
