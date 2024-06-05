package hf;

import com.google.android.gms.common.api.a;
import hf.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lf.c;
import lf.d;

/* compiled from: Http2Writer */
final class j implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    private static final Logger f33224h = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final d f33225a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f33226b;

    /* renamed from: c  reason: collision with root package name */
    private final c f33227c;

    /* renamed from: d  reason: collision with root package name */
    private int f33228d = 16384;

    /* renamed from: f  reason: collision with root package name */
    private boolean f33229f;

    /* renamed from: g  reason: collision with root package name */
    final d.b f33230g;

    j(lf.d dVar, boolean z10) {
        this.f33225a = dVar;
        this.f33226b = z10;
        c cVar = new c();
        this.f33227c = cVar;
        this.f33230g = new d.b(cVar);
    }

    private void L(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int min = (int) Math.min((long) this.f33228d, j10);
            long j11 = (long) min;
            j10 -= j11;
            j(i10, min, (byte) 9, j10 == 0 ? (byte) 4 : 0);
            this.f33225a.V0(this.f33227c, j11);
        }
    }

    private static void R(lf.d dVar, int i10) throws IOException {
        dVar.G((i10 >>> 16) & 255);
        dVar.G((i10 >>> 8) & 255);
        dVar.G(i10 & 255);
    }

    public synchronized void A(int i10, b bVar) throws IOException {
        if (this.f33229f) {
            throw new IOException("closed");
        } else if (bVar.f33077a != -1) {
            j(i10, 4, (byte) 3, (byte) 0);
            this.f33225a.y(bVar.f33077a);
            this.f33225a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void B(m mVar) throws IOException {
        if (!this.f33229f) {
            int i10 = 0;
            j(0, mVar.j() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (mVar.g(i10)) {
                    this.f33225a.v(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f33225a.y(mVar.b(i10));
                }
                i10++;
            }
            this.f33225a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void H() throws IOException {
        if (this.f33229f) {
            throw new IOException("closed");
        } else if (this.f33226b) {
            Logger logger = f33224h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(cf.c.r(">> CONNECTION %s", e.f33107a.j()));
            }
            this.f33225a.t0(e.f33107a.t());
            this.f33225a.flush();
        }
    }

    public synchronized void H0(boolean z10, int i10, c cVar, int i11) throws IOException {
        if (!this.f33229f) {
            byte b10 = 0;
            if (z10) {
                b10 = (byte) 1;
            }
            i(i10, b10, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void J(boolean z10, int i10, int i11, List<c> list) throws IOException {
        if (!this.f33229f) {
            q(z10, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public int L0() {
        return this.f33228d;
    }

    public synchronized void a(int i10, long j10) throws IOException {
        if (this.f33229f) {
            throw new IOException("closed");
        } else if (j10 == 0 || j10 > 2147483647L) {
            throw e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        } else {
            j(i10, 4, (byte) 8, (byte) 0);
            this.f33225a.y((int) j10);
            this.f33225a.flush();
        }
    }

    public synchronized void b(boolean z10, int i10, int i11) throws IOException {
        if (!this.f33229f) {
            j(0, 8, (byte) 6, z10 ? (byte) 1 : 0);
            this.f33225a.y(i10);
            this.f33225a.y(i11);
            this.f33225a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() throws IOException {
        this.f33229f = true;
        this.f33225a.close();
    }

    public synchronized void flush() throws IOException {
        if (!this.f33229f) {
            this.f33225a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void h(m mVar) throws IOException {
        if (!this.f33229f) {
            this.f33228d = mVar.f(this.f33228d);
            if (mVar.c() != -1) {
                this.f33230g.e(mVar.c());
            }
            j(0, 0, (byte) 4, (byte) 1);
            this.f33225a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    public void i(int i10, byte b10, c cVar, int i11) throws IOException {
        j(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f33225a.V0(cVar, (long) i11);
        }
    }

    public void j(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f33224h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i10, i11, b10, b11));
        }
        int i12 = this.f33228d;
        if (i11 > i12) {
            throw e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        } else if ((Integer.MIN_VALUE & i10) == 0) {
            R(this.f33225a, i11);
            this.f33225a.G(b10 & 255);
            this.f33225a.G(b11 & 255);
            this.f33225a.y(i10 & a.e.API_PRIORITY_OTHER);
        } else {
            throw e.c("reserved bit set: %s", Integer.valueOf(i10));
        }
    }

    public synchronized void n(int i10, b bVar, byte[] bArr) throws IOException {
        if (this.f33229f) {
            throw new IOException("closed");
        } else if (bVar.f33077a != -1) {
            j(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f33225a.y(i10);
            this.f33225a.y(bVar.f33077a);
            if (bArr.length > 0) {
                this.f33225a.t0(bArr);
            }
            this.f33225a.flush();
        } else {
            throw e.c("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10, int i10, List<c> list) throws IOException {
        if (!this.f33229f) {
            this.f33230g.g(list);
            long v02 = this.f33227c.v0();
            int min = (int) Math.min((long) this.f33228d, v02);
            long j10 = (long) min;
            int i11 = (v02 > j10 ? 1 : (v02 == j10 ? 0 : -1));
            byte b10 = i11 == 0 ? (byte) 4 : 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            j(i10, min, (byte) 1, b10);
            this.f33225a.V0(this.f33227c, j10);
            if (i11 > 0) {
                L(i10, v02 - j10);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public synchronized void u(int i10, int i11, List<c> list) throws IOException {
        if (!this.f33229f) {
            this.f33230g.g(list);
            long v02 = this.f33227c.v0();
            int min = (int) Math.min((long) (this.f33228d - 4), v02);
            long j10 = (long) min;
            int i12 = (v02 > j10 ? 1 : (v02 == j10 ? 0 : -1));
            j(i10, min + 4, (byte) 5, i12 == 0 ? (byte) 4 : 0);
            this.f33225a.y(i11 & a.e.API_PRIORITY_OTHER);
            this.f33225a.V0(this.f33227c, j10);
            if (i12 > 0) {
                L(i10, v02 - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
