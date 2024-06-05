package s2;

import j4.i;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import k4.n0;
import n2.o1;

/* compiled from: DefaultExtractorInput */
public final class f implements m {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f22403a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final i f22404b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22405c;

    /* renamed from: d  reason: collision with root package name */
    private long f22406d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f22407e = new byte[65536];

    /* renamed from: f  reason: collision with root package name */
    private int f22408f;

    /* renamed from: g  reason: collision with root package name */
    private int f22409g;

    static {
        o1.a("goog.exo.extractor");
    }

    public f(i iVar, long j10, long j11) {
        this.f22404b = iVar;
        this.f22406d = j10;
        this.f22405c = j11;
    }

    private void q(int i10) {
        if (i10 != -1) {
            this.f22406d += (long) i10;
        }
    }

    private void r(int i10) {
        int i11 = this.f22408f + i10;
        byte[] bArr = this.f22407e;
        if (i11 > bArr.length) {
            this.f22407e = Arrays.copyOf(this.f22407e, n0.q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int s(byte[] bArr, int i10, int i11) {
        int i12 = this.f22409g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f22407e, 0, bArr, i10, min);
        w(min);
        return min;
    }

    private int t(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f22404b.read(bArr, i10 + i12, i11 - i12);
            if (read != -1) {
                return i12 + read;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    private int u(int i10) {
        int min = Math.min(this.f22409g, i10);
        w(min);
        return min;
    }

    private void w(int i10) {
        int i11 = this.f22409g - i10;
        this.f22409g = i11;
        this.f22408f = 0;
        byte[] bArr = this.f22407e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[(65536 + i11)] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f22407e = bArr2;
    }

    public int a(int i10) throws IOException {
        int u10 = u(i10);
        if (u10 == 0) {
            byte[] bArr = this.f22403a;
            u10 = t(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        q(u10);
        return u10;
    }

    public long b() {
        return this.f22405c;
    }

    public long c() {
        return this.f22406d;
    }

    public boolean d(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int s10 = s(bArr, i10, i11);
        while (s10 < i11 && s10 != -1) {
            s10 = t(bArr, i10, i11, s10, z10);
        }
        q(s10);
        return s10 != -1;
    }

    public boolean g(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!n(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f22407e, this.f22408f - i11, bArr, i10, i11);
        return true;
    }

    public long h() {
        return this.f22406d + ((long) this.f22408f);
    }

    public void i(int i10) throws IOException {
        n(i10, false);
    }

    public int j(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        r(i11);
        int i13 = this.f22409g;
        int i14 = this.f22408f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = t(this.f22407e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f22409g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f22407e, this.f22408f, bArr, i10, i12);
        this.f22408f += i12;
        return i12;
    }

    public void l() {
        this.f22408f = 0;
    }

    public void m(int i10) throws IOException {
        v(i10, false);
    }

    public boolean n(int i10, boolean z10) throws IOException {
        r(i10);
        int i11 = this.f22409g - this.f22408f;
        while (i11 < i10) {
            i11 = t(this.f22407e, this.f22408f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f22409g = this.f22408f + i11;
        }
        this.f22408f += i10;
        return true;
    }

    public void p(byte[] bArr, int i10, int i11) throws IOException {
        g(bArr, i10, i11, false);
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int s10 = s(bArr, i10, i11);
        if (s10 == 0) {
            s10 = t(bArr, i10, i11, 0, true);
        }
        q(s10);
        return s10;
    }

    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        d(bArr, i10, i11, false);
    }

    public boolean v(int i10, boolean z10) throws IOException {
        int u10 = u(i10);
        while (u10 < i10 && u10 != -1) {
            u10 = t(this.f22403a, -u10, Math.min(i10, this.f22403a.length + u10), u10, z10);
        }
        q(u10);
        return u10 != -1;
    }
}
