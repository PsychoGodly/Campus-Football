package lf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource */
public final class k implements s {

    /* renamed from: a  reason: collision with root package name */
    private final e f36267a;

    /* renamed from: b  reason: collision with root package name */
    private final Inflater f36268b;

    /* renamed from: c  reason: collision with root package name */
    private int f36269c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36270d;

    k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f36267a = eVar;
            this.f36268b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void i() throws IOException {
        int i10 = this.f36269c;
        if (i10 != 0) {
            int remaining = i10 - this.f36268b.getRemaining();
            this.f36269c -= remaining;
            this.f36267a.skip((long) remaining);
        }
    }

    public long P(c cVar, long j10) throws IOException {
        o C0;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        } else if (this.f36270d) {
            throw new IllegalStateException("closed");
        } else if (i10 == 0) {
            return 0;
        } else {
            while (true) {
                boolean h10 = h();
                try {
                    C0 = cVar.C0(1);
                    int inflate = this.f36268b.inflate(C0.f36283a, C0.f36285c, (int) Math.min(j10, (long) (8192 - C0.f36285c)));
                    if (inflate > 0) {
                        C0.f36285c += inflate;
                        long j11 = (long) inflate;
                        cVar.f36252b += j11;
                        return j11;
                    } else if (this.f36268b.finished()) {
                        break;
                    } else if (this.f36268b.needsDictionary()) {
                        break;
                    } else if (h10) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            i();
            if (C0.f36284b != C0.f36285c) {
                return -1;
            }
            cVar.f36251a = C0.b();
            p.a(C0);
            return -1;
        }
    }

    public void close() throws IOException {
        if (!this.f36270d) {
            this.f36268b.end();
            this.f36270d = true;
            this.f36267a.close();
        }
    }

    public t e() {
        return this.f36267a.e();
    }

    public final boolean h() throws IOException {
        if (!this.f36268b.needsInput()) {
            return false;
        }
        i();
        if (this.f36268b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f36267a.F()) {
            return true;
        } else {
            o oVar = this.f36267a.c().f36251a;
            int i10 = oVar.f36285c;
            int i11 = oVar.f36284b;
            int i12 = i10 - i11;
            this.f36269c = i12;
            this.f36268b.setInput(oVar.f36283a, i11, i12);
            return false;
        }
    }
}
