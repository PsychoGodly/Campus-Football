package hf;

import bf.a0;
import bf.q;
import bf.s;
import bf.u;
import bf.v;
import bf.x;
import bf.z;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import ef.g;
import ff.c;
import ff.e;
import ff.i;
import ff.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import lf.h;
import lf.l;
import lf.r;

/* compiled from: Http2Codec */
public final class f implements c {

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f33111f = cf.c.u("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f33112g = cf.c.u("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    private final s.a f33113a;

    /* renamed from: b  reason: collision with root package name */
    final g f33114b;

    /* renamed from: c  reason: collision with root package name */
    private final g f33115c;

    /* renamed from: d  reason: collision with root package name */
    private i f33116d;

    /* renamed from: e  reason: collision with root package name */
    private final v f33117e;

    /* compiled from: Http2Codec */
    class a extends h {

        /* renamed from: b  reason: collision with root package name */
        boolean f33118b = false;

        /* renamed from: c  reason: collision with root package name */
        long f33119c = 0;

        a(lf.s sVar) {
            super(sVar);
        }

        private void i(IOException iOException) {
            if (!this.f33118b) {
                this.f33118b = true;
                f fVar = f.this;
                fVar.f33114b.r(false, fVar, this.f33119c, iOException);
            }
        }

        public long P(lf.c cVar, long j10) throws IOException {
            try {
                long P = h().P(cVar, j10);
                if (P > 0) {
                    this.f33119c += P;
                }
                return P;
            } catch (IOException e10) {
                i(e10);
                throw e10;
            }
        }

        public void close() throws IOException {
            super.close();
            i((IOException) null);
        }
    }

    public f(u uVar, s.a aVar, g gVar, g gVar2) {
        this.f33113a = aVar;
        this.f33114b = gVar;
        this.f33115c = gVar2;
        List<v> y10 = uVar.y();
        v vVar = v.H2_PRIOR_KNOWLEDGE;
        this.f33117e = !y10.contains(vVar) ? v.HTTP_2 : vVar;
    }

    public static List<c> g(x xVar) {
        q d10 = xVar.d();
        ArrayList arrayList = new ArrayList(d10.g() + 4);
        arrayList.add(new c(c.f33080f, xVar.f()));
        arrayList.add(new c(c.f33081g, i.c(xVar.h())));
        String c10 = xVar.c("Host");
        if (c10 != null) {
            arrayList.add(new c(c.f33083i, c10));
        }
        arrayList.add(new c(c.f33082h, xVar.h().B()));
        int g10 = d10.g();
        for (int i10 = 0; i10 < g10; i10++) {
            lf.f h10 = lf.f.h(d10.e(i10).toLowerCase(Locale.US));
            if (!f33111f.contains(h10.u())) {
                arrayList.add(new c(h10, d10.i(i10)));
            }
        }
        return arrayList;
    }

    public static z.a h(q qVar, v vVar) throws IOException {
        q.a aVar = new q.a();
        int g10 = qVar.g();
        k kVar = null;
        for (int i10 = 0; i10 < g10; i10++) {
            String e10 = qVar.e(i10);
            String i11 = qVar.i(i10);
            if (e10.equals(":status")) {
                kVar = k.a("HTTP/1.1 " + i11);
            } else if (!f33112g.contains(e10)) {
                cf.a.f31981a.b(aVar, e10, i11);
            }
        }
        if (kVar != null) {
            return new z.a().n(vVar).g(kVar.f32801b).k(kVar.f32802c).j(aVar.d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public void a() throws IOException {
        this.f33116d.j().close();
    }

    public a0 b(z zVar) throws IOException {
        g gVar = this.f33114b;
        gVar.f32567f.q(gVar.f32566e);
        return new ff.h(zVar.q("Content-Type"), e.b(zVar), l.b(new a(this.f33116d.k())));
    }

    public void c(x xVar) throws IOException {
        if (this.f33116d == null) {
            i n02 = this.f33115c.n0(g(xVar), xVar.a() != null);
            this.f33116d = n02;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            n02.n().g((long) this.f33113a.a(), timeUnit);
            this.f33116d.u().g((long) this.f33113a.b(), timeUnit);
        }
    }

    public void cancel() {
        i iVar = this.f33116d;
        if (iVar != null) {
            iVar.h(b.CANCEL);
        }
    }

    public r d(x xVar, long j10) {
        return this.f33116d.j();
    }

    public z.a e(boolean z10) throws IOException {
        z.a h10 = h(this.f33116d.s(), this.f33117e);
        if (!z10 || cf.a.f31981a.d(h10) != 100) {
            return h10;
        }
        return null;
    }

    public void f() throws IOException {
        this.f33115c.flush();
    }
}
