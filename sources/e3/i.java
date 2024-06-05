package e3;

import java.nio.ByteBuffer;
import k4.a;
import k4.r;
import n2.r1;
import p2.h0;
import q2.g;

/* compiled from: C2Mp3TimestampTracker */
final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f17835a;

    /* renamed from: b  reason: collision with root package name */
    private long f17836b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17837c;

    i() {
    }

    private long a(long j10) {
        return this.f17835a + Math.max(0, ((this.f17836b - 529) * 1000000) / j10);
    }

    public long b(r1 r1Var) {
        return a((long) r1Var.A);
    }

    public void c() {
        this.f17835a = 0;
        this.f17836b = 0;
        this.f17837c = false;
    }

    public long d(r1 r1Var, g gVar) {
        if (this.f17836b == 0) {
            this.f17835a = gVar.f21757f;
        }
        if (this.f17837c) {
            return gVar.f21757f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) a.e(gVar.f21755c);
        byte b10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            b10 = (b10 << 8) | (byteBuffer.get(i10) & 255);
        }
        int m10 = h0.m(b10);
        if (m10 == -1) {
            this.f17837c = true;
            this.f17836b = 0;
            this.f17835a = gVar.f21757f;
            r.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f21757f;
        }
        long a10 = a((long) r1Var.A);
        this.f17836b += (long) m10;
        return a10;
    }
}
