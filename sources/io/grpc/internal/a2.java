package io.grpc.internal;

import dd.j1;
import java.util.Set;
import r6.i;
import r6.k;
import s6.x;

/* compiled from: RetryPolicy */
final class a2 {

    /* renamed from: a  reason: collision with root package name */
    final int f34731a;

    /* renamed from: b  reason: collision with root package name */
    final long f34732b;

    /* renamed from: c  reason: collision with root package name */
    final long f34733c;

    /* renamed from: d  reason: collision with root package name */
    final double f34734d;

    /* renamed from: e  reason: collision with root package name */
    final Long f34735e;

    /* renamed from: f  reason: collision with root package name */
    final Set<j1.b> f34736f;

    a2(int i10, long j10, long j11, double d10, Long l10, Set<j1.b> set) {
        this.f34731a = i10;
        this.f34732b = j10;
        this.f34733c = j11;
        this.f34734d = d10;
        this.f34735e = l10;
        this.f34736f = x.p(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        if (this.f34731a == a2Var.f34731a && this.f34732b == a2Var.f34732b && this.f34733c == a2Var.f34733c && Double.compare(this.f34734d, a2Var.f34734d) == 0 && k.a(this.f34735e, a2Var.f34735e) && k.a(this.f34736f, a2Var.f34736f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(Integer.valueOf(this.f34731a), Long.valueOf(this.f34732b), Long.valueOf(this.f34733c), Double.valueOf(this.f34734d), this.f34735e, this.f34736f);
    }

    public String toString() {
        return i.c(this).b("maxAttempts", this.f34731a).c("initialBackoffNanos", this.f34732b).c("maxBackoffNanos", this.f34733c).a("backoffMultiplier", this.f34734d).d("perAttemptRecvTimeoutNanos", this.f34735e).d("retryableStatusCodes", this.f34736f).toString();
    }
}
