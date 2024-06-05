package y2;

import java.io.IOException;
import k4.a0;
import s2.m;

/* compiled from: Sniffer */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f23814a = new a0(8);

    /* renamed from: b  reason: collision with root package name */
    private int f23815b;

    private long a(m mVar) throws IOException {
        int i10 = 0;
        mVar.p(this.f23814a.e(), 0, 1);
        byte b10 = this.f23814a.e()[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (~i11);
        mVar.p(this.f23814a.e(), 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (this.f23814a.e()[i10] & 255) + (i13 << 8);
        }
        this.f23815b += i12 + 1;
        return (long) i13;
    }

    public boolean b(m mVar) throws IOException {
        long a10;
        int i10;
        m mVar2 = mVar;
        long b10 = mVar.b();
        long j10 = 1024;
        int i11 = (b10 > -1 ? 1 : (b10 == -1 ? 0 : -1));
        if (i11 != 0 && b10 <= 1024) {
            j10 = b10;
        }
        int i12 = (int) j10;
        mVar2.p(this.f23814a.e(), 0, 4);
        this.f23815b = 4;
        for (long I = this.f23814a.I(); I != 440786851; I = ((I << 8) & -256) | ((long) (this.f23814a.e()[0] & 255))) {
            int i13 = this.f23815b + 1;
            this.f23815b = i13;
            if (i13 == i12) {
                return false;
            }
            mVar2.p(this.f23814a.e(), 0, 1);
        }
        long a11 = a(mVar);
        long j11 = (long) this.f23815b;
        if (a11 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j11 + a11 >= b10) {
            return false;
        }
        while (true) {
            int i14 = this.f23815b;
            long j12 = j11 + a11;
            if (((long) i14) < j12) {
                if (a(mVar) != Long.MIN_VALUE && a10 >= 0 && a10 <= 2147483647L) {
                    if (i10 != 0) {
                        int a12 = (int) (a10 = a(mVar));
                        mVar2.i(a12);
                        this.f23815b += a12;
                    }
                }
            } else if (((long) i14) == j12) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
