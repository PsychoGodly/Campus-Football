package lf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource */
public final class j implements s {

    /* renamed from: a  reason: collision with root package name */
    private int f36262a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final e f36263b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f36264c;

    /* renamed from: d  reason: collision with root package name */
    private final k f36265d;

    /* renamed from: f  reason: collision with root package name */
    private final CRC32 f36266f = new CRC32();

    public j(s sVar) {
        if (sVar != null) {
            Inflater inflater = new Inflater(true);
            this.f36264c = inflater;
            e b10 = l.b(sVar);
            this.f36263b = b10;
            this.f36265d = new k(b10, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void h(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}));
        }
    }

    private void i() throws IOException {
        this.f36263b.O0(10);
        byte R = this.f36263b.c().R(3);
        boolean z10 = ((R >> 1) & 1) == 1;
        if (z10) {
            n(this.f36263b.c(), 0, 10);
        }
        h("ID1ID2", 8075, this.f36263b.readShort());
        this.f36263b.skip(8);
        if (((R >> 2) & 1) == 1) {
            this.f36263b.O0(2);
            if (z10) {
                n(this.f36263b.c(), 0, 2);
            }
            long x02 = (long) this.f36263b.c().x0();
            this.f36263b.O0(x02);
            if (z10) {
                n(this.f36263b.c(), 0, x02);
            }
            this.f36263b.skip(x02);
        }
        if (((R >> 3) & 1) == 1) {
            long T0 = this.f36263b.T0((byte) 0);
            if (T0 != -1) {
                if (z10) {
                    n(this.f36263b.c(), 0, T0 + 1);
                }
                this.f36263b.skip(T0 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((R >> 4) & 1) == 1) {
            long T02 = this.f36263b.T0((byte) 0);
            if (T02 != -1) {
                if (z10) {
                    n(this.f36263b.c(), 0, T02 + 1);
                }
                this.f36263b.skip(T02 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z10) {
            h("FHCRC", this.f36263b.x0(), (short) ((int) this.f36266f.getValue()));
            this.f36266f.reset();
        }
    }

    private void j() throws IOException {
        h("CRC", this.f36263b.m0(), (int) this.f36266f.getValue());
        h("ISIZE", this.f36263b.m0(), (int) this.f36264c.getBytesWritten());
    }

    private void n(c cVar, long j10, long j11) {
        o oVar = cVar.f36251a;
        while (true) {
            int i10 = oVar.f36285c;
            int i11 = oVar.f36284b;
            if (j10 < ((long) (i10 - i11))) {
                break;
            }
            j10 -= (long) (i10 - i11);
            oVar = oVar.f36288f;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) oVar.f36284b) + j10);
            int min = (int) Math.min((long) (oVar.f36285c - i12), j11);
            this.f36266f.update(oVar.f36283a, i12, min);
            j11 -= (long) min;
            oVar = oVar.f36288f;
            j10 = 0;
        }
    }

    public long P(c cVar, long j10) throws IOException {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (i10 == 0) {
            return 0;
        } else {
            if (this.f36262a == 0) {
                i();
                this.f36262a = 1;
            }
            if (this.f36262a == 1) {
                long j11 = cVar.f36252b;
                long P = this.f36265d.P(cVar, j10);
                if (P != -1) {
                    n(cVar, j11, P);
                    return P;
                }
                this.f36262a = 2;
            }
            if (this.f36262a == 2) {
                j();
                this.f36262a = 3;
                if (!this.f36263b.F()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() throws IOException {
        this.f36265d.close();
    }

    public t e() {
        return this.f36263b.e();
    }
}
