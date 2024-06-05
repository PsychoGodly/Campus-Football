package gf;

import bf.a0;
import bf.q;
import bf.u;
import bf.x;
import bf.z;
import ff.h;
import ff.k;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import lf.i;
import lf.l;
import lf.r;
import lf.s;
import lf.t;

/* compiled from: Http1Codec */
public final class a implements ff.c {

    /* renamed from: a  reason: collision with root package name */
    final u f32939a;

    /* renamed from: b  reason: collision with root package name */
    final ef.g f32940b;

    /* renamed from: c  reason: collision with root package name */
    final lf.e f32941c;

    /* renamed from: d  reason: collision with root package name */
    final lf.d f32942d;

    /* renamed from: e  reason: collision with root package name */
    int f32943e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f32944f = 262144;

    /* compiled from: Http1Codec */
    private abstract class b implements s {

        /* renamed from: a  reason: collision with root package name */
        protected final i f32945a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f32946b;

        /* renamed from: c  reason: collision with root package name */
        protected long f32947c;

        private b() {
            this.f32945a = new i(a.this.f32941c.e());
            this.f32947c = 0;
        }

        public long P(lf.c cVar, long j10) throws IOException {
            try {
                long P = a.this.f32941c.P(cVar, j10);
                if (P > 0) {
                    this.f32947c += P;
                }
                return P;
            } catch (IOException e10) {
                h(false, e10);
                throw e10;
            }
        }

        public t e() {
            return this.f32945a;
        }

        /* access modifiers changed from: protected */
        public final void h(boolean z10, IOException iOException) throws IOException {
            a aVar = a.this;
            int i10 = aVar.f32943e;
            if (i10 != 6) {
                if (i10 == 5) {
                    aVar.g(this.f32945a);
                    a aVar2 = a.this;
                    aVar2.f32943e = 6;
                    ef.g gVar = aVar2.f32940b;
                    if (gVar != null) {
                        gVar.r(!z10, aVar2, this.f32947c, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + a.this.f32943e);
            }
        }
    }

    /* compiled from: Http1Codec */
    private final class c implements r {

        /* renamed from: a  reason: collision with root package name */
        private final i f32949a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f32950b;

        c() {
            this.f32949a = new i(a.this.f32942d.e());
        }

        public void V0(lf.c cVar, long j10) throws IOException {
            if (this.f32950b) {
                throw new IllegalStateException("closed");
            } else if (j10 != 0) {
                a.this.f32942d.b0(j10);
                a.this.f32942d.T("\r\n");
                a.this.f32942d.V0(cVar, j10);
                a.this.f32942d.T("\r\n");
            }
        }

        public synchronized void close() throws IOException {
            if (!this.f32950b) {
                this.f32950b = true;
                a.this.f32942d.T("0\r\n\r\n");
                a.this.g(this.f32949a);
                a.this.f32943e = 3;
            }
        }

        public t e() {
            return this.f32949a;
        }

        public synchronized void flush() throws IOException {
            if (!this.f32950b) {
                a.this.f32942d.flush();
            }
        }
    }

    /* compiled from: Http1Codec */
    private class d extends b {

        /* renamed from: f  reason: collision with root package name */
        private final bf.r f32952f;

        /* renamed from: g  reason: collision with root package name */
        private long f32953g = -1;

        /* renamed from: h  reason: collision with root package name */
        private boolean f32954h = true;

        d(bf.r rVar) {
            super();
            this.f32952f = rVar;
        }

        private void i() throws IOException {
            if (this.f32953g != -1) {
                a.this.f32941c.k0();
            }
            try {
                this.f32953g = a.this.f32941c.U0();
                String trim = a.this.f32941c.k0().trim();
                if (this.f32953g < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f32953g + trim + "\"");
                } else if (this.f32953g == 0) {
                    this.f32954h = false;
                    ff.e.e(a.this.f32939a.g(), this.f32952f, a.this.n());
                    h(true, (IOException) null);
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        public long P(lf.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (this.f32946b) {
                throw new IllegalStateException("closed");
            } else if (!this.f32954h) {
                return -1;
            } else {
                long j11 = this.f32953g;
                if (j11 == 0 || j11 == -1) {
                    i();
                    if (!this.f32954h) {
                        return -1;
                    }
                }
                long P = super.P(cVar, Math.min(j10, this.f32953g));
                if (P != -1) {
                    this.f32953g -= P;
                    return P;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                h(false, protocolException);
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.f32946b) {
                if (this.f32954h && !cf.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                    h(false, (IOException) null);
                }
                this.f32946b = true;
            }
        }
    }

    /* compiled from: Http1Codec */
    private final class e implements r {

        /* renamed from: a  reason: collision with root package name */
        private final i f32956a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f32957b;

        /* renamed from: c  reason: collision with root package name */
        private long f32958c;

        e(long j10) {
            this.f32956a = new i(a.this.f32942d.e());
            this.f32958c = j10;
        }

        public void V0(lf.c cVar, long j10) throws IOException {
            if (!this.f32957b) {
                cf.c.f(cVar.v0(), 0, j10);
                if (j10 <= this.f32958c) {
                    a.this.f32942d.V0(cVar, j10);
                    this.f32958c -= j10;
                    return;
                }
                throw new ProtocolException("expected " + this.f32958c + " bytes but received " + j10);
            }
            throw new IllegalStateException("closed");
        }

        public void close() throws IOException {
            if (!this.f32957b) {
                this.f32957b = true;
                if (this.f32958c <= 0) {
                    a.this.g(this.f32956a);
                    a.this.f32943e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public t e() {
            return this.f32956a;
        }

        public void flush() throws IOException {
            if (!this.f32957b) {
                a.this.f32942d.flush();
            }
        }
    }

    /* compiled from: Http1Codec */
    private class f extends b {

        /* renamed from: f  reason: collision with root package name */
        private long f32960f;

        f(long j10) throws IOException {
            super();
            this.f32960f = j10;
            if (j10 == 0) {
                h(true, (IOException) null);
            }
        }

        public long P(lf.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (!this.f32946b) {
                long j11 = this.f32960f;
                if (j11 == 0) {
                    return -1;
                }
                long P = super.P(cVar, Math.min(j11, j10));
                if (P != -1) {
                    long j12 = this.f32960f - P;
                    this.f32960f = j12;
                    if (j12 == 0) {
                        h(true, (IOException) null);
                    }
                    return P;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                h(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f32946b) {
                if (this.f32960f != 0 && !cf.c.p(this, 100, TimeUnit.MILLISECONDS)) {
                    h(false, (IOException) null);
                }
                this.f32946b = true;
            }
        }
    }

    /* compiled from: Http1Codec */
    private class g extends b {

        /* renamed from: f  reason: collision with root package name */
        private boolean f32962f;

        g() {
            super();
        }

        public long P(lf.c cVar, long j10) throws IOException {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (this.f32946b) {
                throw new IllegalStateException("closed");
            } else if (this.f32962f) {
                return -1;
            } else {
                long P = super.P(cVar, j10);
                if (P != -1) {
                    return P;
                }
                this.f32962f = true;
                h(true, (IOException) null);
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.f32946b) {
                if (!this.f32962f) {
                    h(false, (IOException) null);
                }
                this.f32946b = true;
            }
        }
    }

    public a(u uVar, ef.g gVar, lf.e eVar, lf.d dVar) {
        this.f32939a = uVar;
        this.f32940b = gVar;
        this.f32941c = eVar;
        this.f32942d = dVar;
    }

    private String m() throws IOException {
        String M = this.f32941c.M(this.f32944f);
        this.f32944f -= (long) M.length();
        return M;
    }

    public void a() throws IOException {
        this.f32942d.flush();
    }

    public a0 b(z zVar) throws IOException {
        ef.g gVar = this.f32940b;
        gVar.f32567f.q(gVar.f32566e);
        String q10 = zVar.q("Content-Type");
        if (!ff.e.c(zVar)) {
            return new h(q10, 0, l.b(k(0)));
        }
        if ("chunked".equalsIgnoreCase(zVar.q("Transfer-Encoding"))) {
            return new h(q10, -1, l.b(i(zVar.Z().h())));
        }
        long b10 = ff.e.b(zVar);
        if (b10 != -1) {
            return new h(q10, b10, l.b(k(b10)));
        }
        return new h(q10, -1, l.b(l()));
    }

    public void c(x xVar) throws IOException {
        o(xVar.d(), ff.i.a(xVar, this.f32940b.d().p().b().type()));
    }

    public void cancel() {
        ef.c d10 = this.f32940b.d();
        if (d10 != null) {
            d10.c();
        }
    }

    public r d(x xVar, long j10) {
        if ("chunked".equalsIgnoreCase(xVar.c("Transfer-Encoding"))) {
            return h();
        }
        if (j10 != -1) {
            return j(j10);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public z.a e(boolean z10) throws IOException {
        int i10 = this.f32943e;
        if (i10 == 1 || i10 == 3) {
            try {
                k a10 = k.a(m());
                z.a j10 = new z.a().n(a10.f32800a).g(a10.f32801b).k(a10.f32802c).j(n());
                if (z10 && a10.f32801b == 100) {
                    return null;
                }
                if (a10.f32801b == 100) {
                    this.f32943e = 3;
                    return j10;
                }
                this.f32943e = 4;
                return j10;
            } catch (EOFException e10) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f32940b);
                iOException.initCause(e10);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f32943e);
        }
    }

    public void f() throws IOException {
        this.f32942d.flush();
    }

    /* access modifiers changed from: package-private */
    public void g(i iVar) {
        t i10 = iVar.i();
        iVar.j(t.f36294d);
        i10.a();
        i10.b();
    }

    public r h() {
        if (this.f32943e == 1) {
            this.f32943e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f32943e);
    }

    public s i(bf.r rVar) throws IOException {
        if (this.f32943e == 4) {
            this.f32943e = 5;
            return new d(rVar);
        }
        throw new IllegalStateException("state: " + this.f32943e);
    }

    public r j(long j10) {
        if (this.f32943e == 1) {
            this.f32943e = 2;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f32943e);
    }

    public s k(long j10) throws IOException {
        if (this.f32943e == 4) {
            this.f32943e = 5;
            return new f(j10);
        }
        throw new IllegalStateException("state: " + this.f32943e);
    }

    public s l() throws IOException {
        if (this.f32943e == 4) {
            ef.g gVar = this.f32940b;
            if (gVar != null) {
                this.f32943e = 5;
                gVar.j();
                return new g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f32943e);
    }

    public q n() throws IOException {
        q.a aVar = new q.a();
        while (true) {
            String m10 = m();
            if (m10.length() == 0) {
                return aVar.d();
            }
            cf.a.f31981a.a(aVar, m10);
        }
    }

    public void o(q qVar, String str) throws IOException {
        if (this.f32943e == 0) {
            this.f32942d.T(str).T("\r\n");
            int g10 = qVar.g();
            for (int i10 = 0; i10 < g10; i10++) {
                this.f32942d.T(qVar.e(i10)).T(": ").T(qVar.i(i10)).T("\r\n");
            }
            this.f32942d.T("\r\n");
            this.f32943e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f32943e);
    }
}
