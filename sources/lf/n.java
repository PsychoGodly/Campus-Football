package lf;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: RealBufferedSource */
final class n implements e {

    /* renamed from: a  reason: collision with root package name */
    public final c f36280a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final s f36281b;

    /* renamed from: c  reason: collision with root package name */
    boolean f36282c;

    n(s sVar) {
        Objects.requireNonNull(sVar, "source == null");
        this.f36281b = sVar;
    }

    public byte[] D() throws IOException {
        this.f36280a.p(this.f36281b);
        return this.f36280a.D();
    }

    public c E() {
        return this.f36280a;
    }

    public boolean F() throws IOException {
        if (!this.f36282c) {
            return this.f36280a.F() && this.f36281b.P(this.f36280a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public String M(long j10) throws IOException {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            long h10 = h((byte) 10, 0, j11);
            if (h10 != -1) {
                return this.f36280a.u0(h10);
            }
            if (j11 < Long.MAX_VALUE && j(j11) && this.f36280a.R(j11 - 1) == 13 && j(1 + j11) && this.f36280a.R(j11) == 10) {
                return this.f36280a.u0(j11);
            }
            c cVar = new c();
            c cVar2 = this.f36280a;
            cVar2.J(cVar, 0, Math.min(32, cVar2.v0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f36280a.v0(), j10) + " content=" + cVar.h0().j() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j10);
    }

    public void O0(long j10) throws IOException {
        if (!j(j10)) {
            throw new EOFException();
        }
    }

    public long P(c cVar, long j10) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (!this.f36282c) {
            c cVar2 = this.f36280a;
            if (cVar2.f36252b == 0 && this.f36281b.P(cVar2, 8192) == -1) {
                return -1;
            }
            return this.f36280a.P(cVar, Math.min(j10, this.f36280a.f36252b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public long T0(byte b10) throws IOException {
        return h(b10, 0, Long.MAX_VALUE);
    }

    public long U0() throws IOException {
        O0(1);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!j((long) i11)) {
                break;
            }
            byte R = this.f36280a.R((long) i10);
            if ((R >= 48 && R <= 57) || ((R >= 97 && R <= 102) || (R >= 65 && R <= 70))) {
                i10 = i11;
            } else if (i10 == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(R)}));
            }
        }
        return this.f36280a.U0();
    }

    public String X(Charset charset) throws IOException {
        if (charset != null) {
            this.f36280a.p(this.f36281b);
            return this.f36280a.X(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public c c() {
        return this.f36280a;
    }

    public void close() throws IOException {
        if (!this.f36282c) {
            this.f36282c = true;
            this.f36281b.close();
            this.f36280a.i();
        }
    }

    public boolean d0(long j10, f fVar) throws IOException {
        return i(j10, fVar, 0, fVar.p());
    }

    public t e() {
        return this.f36281b.e();
    }

    public long h(byte b10, long j10, long j11) throws IOException {
        if (this.f36282c) {
            throw new IllegalStateException("closed");
        } else if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j10), Long.valueOf(j11)}));
        } else {
            while (j10 < j11) {
                long Z = this.f36280a.Z(b10, j10, j11);
                if (Z == -1) {
                    c cVar = this.f36280a;
                    long j12 = cVar.f36252b;
                    if (j12 >= j11 || this.f36281b.P(cVar, 8192) == -1) {
                        break;
                    }
                    j10 = Math.max(j10, j12);
                } else {
                    return Z;
                }
            }
            return -1;
        }
    }

    public boolean i(long j10, f fVar, int i10, int i11) throws IOException {
        if (this.f36282c) {
            throw new IllegalStateException("closed");
        } else if (j10 < 0 || i10 < 0 || i11 < 0 || fVar.p() - i10 < i11) {
            return false;
        } else {
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = ((long) i12) + j10;
                if (!j(1 + j11) || this.f36280a.R(j11) != fVar.i(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
    }

    public boolean isOpen() {
        return !this.f36282c;
    }

    public boolean j(long j10) throws IOException {
        c cVar;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (!this.f36282c) {
            do {
                cVar = this.f36280a;
                if (cVar.f36252b >= j10) {
                    return true;
                }
            } while (this.f36281b.P(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String k0() throws IOException {
        return M(Long.MAX_VALUE);
    }

    public int m0() throws IOException {
        O0(4);
        return this.f36280a.m0();
    }

    public byte[] p0(long j10) throws IOException {
        O0(j10);
        return this.f36280a.p0(j10);
    }

    public f r(long j10) throws IOException {
        O0(j10);
        return this.f36280a.r(j10);
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        c cVar = this.f36280a;
        if (cVar.f36252b == 0 && this.f36281b.P(cVar, 8192) == -1) {
            return -1;
        }
        return this.f36280a.read(byteBuffer);
    }

    public byte readByte() throws IOException {
        O0(1);
        return this.f36280a.readByte();
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            O0((long) bArr.length);
            this.f36280a.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                c cVar = this.f36280a;
                long j10 = cVar.f36252b;
                if (j10 > 0) {
                    int read = cVar.read(bArr, i10, (int) j10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e10;
                }
            }
        }
    }

    public int readInt() throws IOException {
        O0(4);
        return this.f36280a.readInt();
    }

    public short readShort() throws IOException {
        O0(2);
        return this.f36280a.readShort();
    }

    public void skip(long j10) throws IOException {
        if (!this.f36282c) {
            while (j10 > 0) {
                c cVar = this.f36280a;
                if (cVar.f36252b == 0 && this.f36281b.P(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f36280a.v0());
                this.f36280a.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f36281b + ")";
    }

    public short x0() throws IOException {
        O0(2);
        return this.f36280a.x0();
    }
}
