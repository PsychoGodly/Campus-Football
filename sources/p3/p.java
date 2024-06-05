package p3;

import android.net.Uri;
import j4.l;
import j4.p0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import k4.a0;

/* compiled from: IcyDataSource */
final class p implements l {

    /* renamed from: a  reason: collision with root package name */
    private final l f21574a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21575b;

    /* renamed from: c  reason: collision with root package name */
    private final a f21576c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f21577d;

    /* renamed from: e  reason: collision with root package name */
    private int f21578e;

    /* compiled from: IcyDataSource */
    public interface a {
        void b(a0 a0Var);
    }

    public p(l lVar, int i10, a aVar) {
        k4.a.a(i10 > 0);
        this.f21574a = lVar;
        this.f21575b = i10;
        this.f21576c = aVar;
        this.f21577d = new byte[1];
        this.f21578e = i10;
    }

    private boolean q() throws IOException {
        if (this.f21574a.read(this.f21577d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f21577d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int read = this.f21574a.read(bArr, i12, i11);
            if (read == -1) {
                return false;
            }
            i12 += read;
            i11 -= read;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f21576c.b(new a0(bArr, i10));
        }
        return true;
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public void e(p0 p0Var) {
        k4.a.e(p0Var);
        this.f21574a.e(p0Var);
    }

    public long f(j4.p pVar) {
        throw new UnsupportedOperationException();
    }

    public Map<String, List<String>> k() {
        return this.f21574a.k();
    }

    public Uri o() {
        return this.f21574a.o();
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f21578e == 0) {
            if (!q()) {
                return -1;
            }
            this.f21578e = this.f21575b;
        }
        int read = this.f21574a.read(bArr, i10, Math.min(this.f21578e, i11));
        if (read != -1) {
            this.f21578e -= read;
        }
        return read;
    }
}
