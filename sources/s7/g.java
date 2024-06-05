package s7;

import com.google.protobuf.i;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: OrderedCodeWriter */
public class g {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[][] f30302c = {new byte[]{0, 0}, new byte[]{Byte.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, Byte.MIN_VALUE}, new byte[]{-1, -64}};

    /* renamed from: a  reason: collision with root package name */
    private byte[] f30303a = new byte[1024];

    /* renamed from: b  reason: collision with root package name */
    private int f30304b = 0;

    private void b(int i10) {
        int i11 = i10 + this.f30304b;
        byte[] bArr = this.f30303a;
        if (i11 > bArr.length) {
            int length = bArr.length * 2;
            if (length >= i11) {
                i11 = length;
            }
            this.f30303a = Arrays.copyOf(bArr, i11);
        }
    }

    private int d(long j10) {
        if (j10 < 0) {
            j10 = ~j10;
        }
        return f.a((64 - Long.numberOfLeadingZeros(j10)) + 1, 7, RoundingMode.UP);
    }

    private int e(long j10) {
        return f.a(64 - Long.numberOfLeadingZeros(j10), 8, RoundingMode.UP);
    }

    private void f(byte b10) {
        if (b10 == 0) {
            l((byte) 0);
            l((byte) -1);
        } else if (b10 == -1) {
            l((byte) -1);
            l((byte) 0);
        } else {
            l(b10);
        }
    }

    private void g(byte b10) {
        if (b10 == 0) {
            m((byte) 0);
            m((byte) -1);
        } else if (b10 == -1) {
            m((byte) -1);
            m((byte) 0);
        } else {
            m(b10);
        }
    }

    private void l(byte b10) {
        b(1);
        byte[] bArr = this.f30303a;
        int i10 = this.f30304b;
        this.f30304b = i10 + 1;
        bArr[i10] = b10;
    }

    private void m(byte b10) {
        b(1);
        byte[] bArr = this.f30303a;
        int i10 = this.f30304b;
        this.f30304b = i10 + 1;
        bArr[i10] = (byte) (~b10);
    }

    private void p() {
        l((byte) 0);
        l((byte) 1);
    }

    private void q() {
        m((byte) 0);
        m((byte) 1);
    }

    public byte[] a() {
        return Arrays.copyOf(this.f30303a, this.f30304b);
    }

    public void c(byte[] bArr) {
        b(bArr.length);
        for (byte b10 : bArr) {
            byte[] bArr2 = this.f30303a;
            int i10 = this.f30304b;
            this.f30304b = i10 + 1;
            bArr2[i10] = b10;
        }
    }

    public void h(i iVar) {
        for (int i10 = 0; i10 < iVar.size(); i10++) {
            f(iVar.f(i10));
        }
        p();
    }

    public void i(i iVar) {
        for (int i10 = 0; i10 < iVar.size(); i10++) {
            g(iVar.f(i10));
        }
        q();
    }

    public void j(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        t(doubleToLongBits ^ (doubleToLongBits < 0 ? -1 : Long.MIN_VALUE));
    }

    public void k(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        u(doubleToLongBits ^ (doubleToLongBits < 0 ? -1 : Long.MIN_VALUE));
    }

    public void n() {
        l((byte) -1);
        l((byte) -1);
    }

    public void o() {
        m((byte) -1);
        m((byte) -1);
    }

    public void r(long j10) {
        int i10;
        int i11 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        long j11 = i11 < 0 ? ~j10 : j10;
        if (j11 < 64) {
            b(1);
            byte[] bArr = this.f30303a;
            int i12 = this.f30304b;
            this.f30304b = i12 + 1;
            bArr[i12] = (byte) ((int) (j10 ^ ((long) f30302c[1][0])));
            return;
        }
        int d10 = d(j11);
        b(d10);
        if (d10 >= 2) {
            byte b10 = i11 < 0 ? (byte) -1 : 0;
            int i13 = this.f30304b;
            if (d10 == 10) {
                i10 = i13 + 2;
                byte[] bArr2 = this.f30303a;
                bArr2[i13] = b10;
                bArr2[i13 + 1] = b10;
            } else if (d10 == 9) {
                i10 = i13 + 1;
                this.f30303a[i13] = b10;
            } else {
                i10 = i13;
            }
            for (int i14 = (d10 - 1) + i13; i14 >= i10; i14--) {
                this.f30303a[i14] = (byte) ((int) (255 & j10));
                j10 >>= 8;
            }
            byte[] bArr3 = this.f30303a;
            int i15 = this.f30304b;
            byte b11 = bArr3[i15];
            byte[][] bArr4 = f30302c;
            bArr3[i15] = (byte) (b11 ^ bArr4[d10][0]);
            int i16 = i15 + 1;
            bArr3[i16] = (byte) (bArr4[d10][1] ^ bArr3[i16]);
            this.f30304b = i15 + d10;
            return;
        }
        throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", new Object[]{Integer.valueOf(d10)}));
    }

    public void s(long j10) {
        r(~j10);
    }

    public void t(long j10) {
        int e10 = e(j10);
        b(e10 + 1);
        byte[] bArr = this.f30303a;
        int i10 = this.f30304b;
        int i11 = i10 + 1;
        this.f30304b = i11;
        bArr[i10] = (byte) e10;
        int i12 = i11 + e10;
        while (true) {
            i12--;
            int i13 = this.f30304b;
            if (i12 >= i13) {
                this.f30303a[i12] = (byte) ((int) (255 & j10));
                j10 >>>= 8;
            } else {
                this.f30304b = i13 + e10;
                return;
            }
        }
    }

    public void u(long j10) {
        int e10 = e(j10);
        b(e10 + 1);
        byte[] bArr = this.f30303a;
        int i10 = this.f30304b;
        int i11 = i10 + 1;
        this.f30304b = i11;
        bArr[i10] = (byte) (~e10);
        int i12 = i11 + e10;
        while (true) {
            i12--;
            int i13 = this.f30304b;
            if (i12 >= i13) {
                this.f30303a[i12] = (byte) ((int) (~(255 & j10)));
                j10 >>>= 8;
            } else {
                this.f30304b = i13 + e10;
                return;
            }
        }
    }

    public void v(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt < 128) {
                f((byte) charAt);
            } else if (charAt < 2048) {
                f((byte) ((charAt >>> 6) | 960));
                f((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                f((byte) ((charAt >>> 12) | 480));
                f((byte) (((charAt >>> 6) & 63) | 128));
                f((byte) ((charAt & '?') | 128));
            } else {
                int codePointAt = Character.codePointAt(charSequence, i10);
                i10++;
                f((byte) ((codePointAt >>> 18) | 240));
                f((byte) (((codePointAt >>> 12) & 63) | 128));
                f((byte) (((codePointAt >>> 6) & 63) | 128));
                f((byte) ((codePointAt & 63) | 128));
            }
            i10++;
        }
        p();
    }

    public void w(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt < 128) {
                g((byte) charAt);
            } else if (charAt < 2048) {
                g((byte) ((charAt >>> 6) | 960));
                g((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                g((byte) ((charAt >>> 12) | 480));
                g((byte) (((charAt >>> 6) & 63) | 128));
                g((byte) ((charAt & '?') | 128));
            } else {
                int codePointAt = Character.codePointAt(charSequence, i10);
                i10++;
                g((byte) ((codePointAt >>> 18) | 240));
                g((byte) (((codePointAt >>> 12) & 63) | 128));
                g((byte) (((codePointAt >>> 6) & 63) | 128));
                g((byte) ((codePointAt & 63) | 128));
            }
            i10++;
        }
        q();
    }
}
