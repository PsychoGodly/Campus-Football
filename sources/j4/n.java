package j4;

import java.io.IOException;
import java.io.InputStream;
import k4.a;

/* compiled from: DataSourceInputStream */
public final class n extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final l f19365a;

    /* renamed from: b  reason: collision with root package name */
    private final p f19366b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f19367c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19368d = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19369f = false;

    /* renamed from: g  reason: collision with root package name */
    private long f19370g;

    public n(l lVar, p pVar) {
        this.f19365a = lVar;
        this.f19366b = pVar;
        this.f19367c = new byte[1];
    }

    private void h() throws IOException {
        if (!this.f19368d) {
            this.f19365a.f(this.f19366b);
            this.f19368d = true;
        }
    }

    public void close() throws IOException {
        if (!this.f19369f) {
            this.f19365a.close();
            this.f19369f = true;
        }
    }

    public void i() throws IOException {
        h();
    }

    public int read() throws IOException {
        if (read(this.f19367c) == -1) {
            return -1;
        }
        return this.f19367c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        a.f(!this.f19369f);
        h();
        int read = this.f19365a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f19370g += (long) read;
        return read;
    }
}
