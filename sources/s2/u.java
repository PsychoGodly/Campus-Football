package s2;

import k4.a;
import k4.n0;
import s2.b0;
import s2.v;

/* compiled from: FlacSeekTableSeekMap */
public final class u implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final v f22466a;

    /* renamed from: b  reason: collision with root package name */
    private final long f22467b;

    public u(v vVar, long j10) {
        this.f22466a = vVar;
        this.f22467b = j10;
    }

    private c0 b(long j10, long j11) {
        return new c0((j10 * 1000000) / ((long) this.f22466a.f22472e), this.f22467b + j11);
    }

    public boolean f() {
        return true;
    }

    public b0.a h(long j10) {
        long j11;
        a.h(this.f22466a.f22478k);
        v vVar = this.f22466a;
        v.a aVar = vVar.f22478k;
        long[] jArr = aVar.f22480a;
        long[] jArr2 = aVar.f22481b;
        int i10 = n0.i(jArr, vVar.i(j10), true, false);
        long j12 = 0;
        if (i10 == -1) {
            j11 = 0;
        } else {
            j11 = jArr[i10];
        }
        if (i10 != -1) {
            j12 = jArr2[i10];
        }
        c0 b10 = b(j11, j12);
        if (b10.f22384a == j10 || i10 == jArr.length - 1) {
            return new b0.a(b10);
        }
        int i11 = i10 + 1;
        return new b0.a(b10, b(jArr[i11], jArr2[i11]));
    }

    public long i() {
        return this.f22466a.f();
    }
}
