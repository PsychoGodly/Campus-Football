package p3;

import com.applovin.exoplayer2.common.base.Ascii;
import j4.b;
import j4.i;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k4.a0;
import p3.p0;
import q2.c;
import q2.g;
import s2.e0;

/* compiled from: SampleDataQueue */
class n0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f21562a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21563b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f21564c = new a0(32);

    /* renamed from: d  reason: collision with root package name */
    private a f21565d;

    /* renamed from: e  reason: collision with root package name */
    private a f21566e;

    /* renamed from: f  reason: collision with root package name */
    private a f21567f;

    /* renamed from: g  reason: collision with root package name */
    private long f21568g;

    /* compiled from: SampleDataQueue */
    private static final class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public long f21569a;

        /* renamed from: b  reason: collision with root package name */
        public long f21570b;

        /* renamed from: c  reason: collision with root package name */
        public j4.a f21571c;

        /* renamed from: d  reason: collision with root package name */
        public a f21572d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        public j4.a a() {
            return (j4.a) k4.a.e(this.f21571c);
        }

        public a b() {
            this.f21571c = null;
            a aVar = this.f21572d;
            this.f21572d = null;
            return aVar;
        }

        public void c(j4.a aVar, a aVar2) {
            this.f21571c = aVar;
            this.f21572d = aVar2;
        }

        public void d(long j10, int i10) {
            k4.a.f(this.f21571c == null);
            this.f21569a = j10;
            this.f21570b = j10 + ((long) i10);
        }

        public int e(long j10) {
            return ((int) (j10 - this.f21569a)) + this.f21571c.f19286b;
        }

        public b.a next() {
            a aVar = this.f21572d;
            if (aVar == null || aVar.f21571c == null) {
                return null;
            }
            return aVar;
        }
    }

    public n0(b bVar) {
        this.f21562a = bVar;
        int e10 = bVar.e();
        this.f21563b = e10;
        a aVar = new a(0, e10);
        this.f21565d = aVar;
        this.f21566e = aVar;
        this.f21567f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f21571c != null) {
            this.f21562a.a(aVar);
            aVar.b();
        }
    }

    private static a d(a aVar, long j10) {
        while (j10 >= aVar.f21570b) {
            aVar = aVar.f21572d;
        }
        return aVar;
    }

    private void g(int i10) {
        long j10 = this.f21568g + ((long) i10);
        this.f21568g = j10;
        a aVar = this.f21567f;
        if (j10 == aVar.f21570b) {
            this.f21567f = aVar.f21572d;
        }
    }

    private int h(int i10) {
        a aVar = this.f21567f;
        if (aVar.f21571c == null) {
            aVar.c(this.f21562a.c(), new a(this.f21567f.f21570b, this.f21563b));
        }
        return Math.min(i10, (int) (this.f21567f.f21570b - this.f21568g));
    }

    private static a i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a d10 = d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (d10.f21570b - j10));
            byteBuffer.put(d10.f21571c.f19285a, d10.e(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == d10.f21570b) {
                d10 = d10.f21572d;
            }
        }
        return d10;
    }

    private static a j(a aVar, long j10, byte[] bArr, int i10) {
        a d10 = d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d10.f21570b - j10));
            System.arraycopy(d10.f21571c.f19285a, d10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == d10.f21570b) {
                d10 = d10.f21572d;
            }
        }
        return d10;
    }

    private static a k(a aVar, g gVar, p0.b bVar, a0 a0Var) {
        int i10;
        p0.b bVar2 = bVar;
        a0 a0Var2 = a0Var;
        long j10 = bVar2.f21606b;
        a0Var2.P(1);
        a j11 = j(aVar, j10, a0Var.e(), 1);
        long j12 = j10 + 1;
        byte b10 = a0Var.e()[0];
        boolean z10 = (b10 & 128) != 0;
        byte b11 = b10 & Ascii.DEL;
        c cVar = gVar.f21754b;
        byte[] bArr = cVar.f21730a;
        if (bArr == null) {
            cVar.f21730a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j13 = j(j11, j12, cVar.f21730a, b11);
        long j14 = j12 + ((long) b11);
        if (z10) {
            a0Var2.P(2);
            j13 = j(j13, j14, a0Var.e(), 2);
            j14 += 2;
            i10 = a0Var.M();
        } else {
            i10 = 1;
        }
        int[] iArr = cVar.f21733d;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f21734e;
        if (iArr3 == null || iArr3.length < i10) {
            iArr3 = new int[i10];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i11 = i10 * 6;
            a0Var2.P(i11);
            j13 = j(j13, j14, a0Var.e(), i11);
            j14 += (long) i11;
            a0Var2.T(0);
            for (int i12 = 0; i12 < i10; i12++) {
                iArr2[i12] = a0Var.M();
                iArr4[i12] = a0Var.K();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar2.f21605a - ((int) (j14 - bVar2.f21606b));
        }
        e0.a aVar2 = (e0.a) k4.n0.j(bVar2.f21607c);
        cVar.c(i10, iArr2, iArr4, aVar2.f22400b, cVar.f21730a, aVar2.f22399a, aVar2.f22401c, aVar2.f22402d);
        long j15 = bVar2.f21606b;
        int i13 = (int) (j14 - j15);
        bVar2.f21606b = j15 + ((long) i13);
        bVar2.f21605a -= i13;
        return j13;
    }

    private static a l(a aVar, g gVar, p0.b bVar, a0 a0Var) {
        if (gVar.t()) {
            aVar = k(aVar, gVar, bVar, a0Var);
        }
        if (gVar.j()) {
            a0Var.P(4);
            a j10 = j(aVar, bVar.f21606b, a0Var.e(), 4);
            int K = a0Var.K();
            bVar.f21606b += 4;
            bVar.f21605a -= 4;
            gVar.r(K);
            a i10 = i(j10, bVar.f21606b, gVar.f21755c, K);
            bVar.f21606b += (long) K;
            int i11 = bVar.f21605a - K;
            bVar.f21605a = i11;
            gVar.v(i11);
            return i(i10, bVar.f21606b, gVar.f21758g, bVar.f21605a);
        }
        gVar.r(bVar.f21605a);
        return i(aVar, bVar.f21606b, gVar.f21755c, bVar.f21605a);
    }

    public void b(long j10) {
        a aVar;
        if (j10 != -1) {
            while (true) {
                aVar = this.f21565d;
                if (j10 < aVar.f21570b) {
                    break;
                }
                this.f21562a.b(aVar.f21571c);
                this.f21565d = this.f21565d.b();
            }
            if (this.f21566e.f21569a < aVar.f21569a) {
                this.f21566e = aVar;
            }
        }
    }

    public void c(long j10) {
        k4.a.a(j10 <= this.f21568g);
        this.f21568g = j10;
        if (j10 != 0) {
            a aVar = this.f21565d;
            if (j10 != aVar.f21569a) {
                while (this.f21568g > aVar.f21570b) {
                    aVar = aVar.f21572d;
                }
                a aVar2 = (a) k4.a.e(aVar.f21572d);
                a(aVar2);
                a aVar3 = new a(aVar.f21570b, this.f21563b);
                aVar.f21572d = aVar3;
                if (this.f21568g == aVar.f21570b) {
                    aVar = aVar3;
                }
                this.f21567f = aVar;
                if (this.f21566e == aVar2) {
                    this.f21566e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f21565d);
        a aVar4 = new a(this.f21568g, this.f21563b);
        this.f21565d = aVar4;
        this.f21566e = aVar4;
        this.f21567f = aVar4;
    }

    public long e() {
        return this.f21568g;
    }

    public void f(g gVar, p0.b bVar) {
        l(this.f21566e, gVar, bVar, this.f21564c);
    }

    public void m(g gVar, p0.b bVar) {
        this.f21566e = l(this.f21566e, gVar, bVar, this.f21564c);
    }

    public void n() {
        a(this.f21565d);
        this.f21565d.d(0, this.f21563b);
        a aVar = this.f21565d;
        this.f21566e = aVar;
        this.f21567f = aVar;
        this.f21568g = 0;
        this.f21562a.d();
    }

    public void o() {
        this.f21566e = this.f21565d;
    }

    public int p(i iVar, int i10, boolean z10) throws IOException {
        int h10 = h(i10);
        a aVar = this.f21567f;
        int read = iVar.read(aVar.f21571c.f19285a, aVar.e(this.f21568g), h10);
        if (read != -1) {
            g(read);
            return read;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void q(a0 a0Var, int i10) {
        while (i10 > 0) {
            int h10 = h(i10);
            a aVar = this.f21567f;
            a0Var.l(aVar.f21571c.f19285a, aVar.e(this.f21568g), h10);
            i10 -= h10;
            g(h10);
        }
    }
}
