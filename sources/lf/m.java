package lf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: RealBufferedSink */
final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f36277a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final r f36278b;

    /* renamed from: c  reason: collision with root package name */
    boolean f36279c;

    m(r rVar) {
        Objects.requireNonNull(rVar, "sink == null");
        this.f36278b = rVar;
    }

    public d G(int i10) throws IOException {
        if (!this.f36279c) {
            this.f36277a.G(i10);
            return K();
        }
        throw new IllegalStateException("closed");
    }

    public d K() throws IOException {
        if (!this.f36279c) {
            long B = this.f36277a.B();
            if (B > 0) {
                this.f36278b.V0(this.f36277a, B);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public d T(String str) throws IOException {
        if (!this.f36279c) {
            this.f36277a.T(str);
            return K();
        }
        throw new IllegalStateException("closed");
    }

    public void V0(c cVar, long j10) throws IOException {
        if (!this.f36279c) {
            this.f36277a.V0(cVar, j10);
            K();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public d b0(long j10) throws IOException {
        if (!this.f36279c) {
            this.f36277a.b0(j10);
            return K();
        }
        throw new IllegalStateException("closed");
    }

    public c c() {
        return this.f36277a;
    }

    public void close() throws IOException {
        if (!this.f36279c) {
            Throwable th = null;
            try {
                c cVar = this.f36277a;
                long j10 = cVar.f36252b;
                if (j10 > 0) {
                    this.f36278b.V0(cVar, j10);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f36278b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f36279c = true;
            if (th != null) {
                u.e(th);
            }
        }
    }

    public t e() {
        return this.f36278b.e();
    }

    public d f(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f36279c) {
            this.f36277a.f(bArr, i10, i11);
            return K();
        }
        throw new IllegalStateException("closed");
    }

    public void flush() throws IOException {
        if (!this.f36279c) {
            c cVar = this.f36277a;
            long j10 = cVar.f36252b;
            if (j10 > 0) {
                this.f36278b.V0(cVar, j10);
            }
            this.f36278b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f36279c;
    }

    public long p(s sVar) throws IOException {
        if (sVar != null) {
            long j10 = 0;
            while (true) {
                long P = sVar.P(this.f36277a, 8192);
                if (P == -1) {
                    return j10;
                }
                j10 += P;
                K();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public d t0(byte[] bArr) throws IOException {
        if (!this.f36279c) {
            this.f36277a.t0(bArr);
            return K();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f36278b + ")";
    }

    public d v(int i10) throws IOException {
        if (!this.f36279c) {
            this.f36277a.v(i10);
            return K();
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f36279c) {
            int write = this.f36277a.write(byteBuffer);
            K();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public d y(int i10) throws IOException {
        if (!this.f36279c) {
            this.f36277a.y(i10);
            return K();
        }
        throw new IllegalStateException("closed");
    }
}
