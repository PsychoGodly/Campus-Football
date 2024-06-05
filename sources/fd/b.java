package fd;

import fd.j;
import hd.c;
import hd.d;
import hd.i;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lf.f;
import r6.o;

/* compiled from: ExceptionHandlingFrameWriter */
final class b implements c {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f32610d = Logger.getLogger(i.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final a f32611a;

    /* renamed from: b  reason: collision with root package name */
    private final c f32612b;

    /* renamed from: c  reason: collision with root package name */
    private final j f32613c = new j(Level.FINE, (Class<?>) i.class);

    /* compiled from: ExceptionHandlingFrameWriter */
    interface a {
        void f(Throwable th);
    }

    b(a aVar, c cVar) {
        this.f32611a = (a) o.p(aVar, "transportExceptionHandler");
        this.f32612b = (c) o.p(cVar, "frameWriter");
    }

    static Level h(Throwable th) {
        if (th.getClass().equals(IOException.class)) {
            return Level.FINE;
        }
        return Level.INFO;
    }

    public void H() {
        try {
            this.f32612b.H();
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public void H0(boolean z10, int i10, lf.c cVar, int i11) {
        this.f32613c.b(j.a.OUTBOUND, i10, cVar.c(), i11, z10);
        try {
            this.f32612b.H0(z10, i10, cVar, i11);
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public int L0() {
        return this.f32612b.L0();
    }

    public void M0(int i10, hd.a aVar, byte[] bArr) {
        this.f32613c.c(j.a.OUTBOUND, i10, aVar, f.k(bArr));
        try {
            this.f32612b.M0(i10, aVar, bArr);
            this.f32612b.flush();
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public void N0(boolean z10, boolean z11, int i10, int i11, List<d> list) {
        try {
            this.f32612b.N0(z10, z11, i10, i11, list);
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public void W(i iVar) {
        this.f32613c.j(j.a.OUTBOUND);
        try {
            this.f32612b.W(iVar);
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public void W0(i iVar) {
        this.f32613c.i(j.a.OUTBOUND, iVar);
        try {
            this.f32612b.W0(iVar);
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public void a(int i10, long j10) {
        this.f32613c.k(j.a.OUTBOUND, i10, j10);
        try {
            this.f32612b.a(i10, j10);
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public void b(boolean z10, int i10, int i11) {
        if (z10) {
            this.f32613c.f(j.a.OUTBOUND, (4294967295L & ((long) i11)) | (((long) i10) << 32));
        } else {
            this.f32613c.e(j.a.OUTBOUND, (4294967295L & ((long) i11)) | (((long) i10) << 32));
        }
        try {
            this.f32612b.b(z10, i10, i11);
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public void close() {
        try {
            this.f32612b.close();
        } catch (IOException e10) {
            f32610d.log(h(e10), "Failed closing connection", e10);
        }
    }

    public void flush() {
        try {
            this.f32612b.flush();
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }

    public void g(int i10, hd.a aVar) {
        this.f32613c.h(j.a.OUTBOUND, i10, aVar);
        try {
            this.f32612b.g(i10, aVar);
        } catch (IOException e10) {
            this.f32611a.f(e10);
        }
    }
}
