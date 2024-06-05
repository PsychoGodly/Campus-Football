package ef;

import bf.a;
import bf.b0;
import bf.h;
import bf.i;
import bf.o;
import bf.p;
import bf.r;
import bf.s;
import bf.u;
import bf.v;
import bf.x;
import bf.y;
import bf.z;
import com.google.android.gms.common.api.a;
import hf.b;
import hf.f;
import hf.g;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import lf.d;
import lf.e;
import lf.l;
import lf.s;

/* compiled from: RealConnection */
public final class c extends g.j implements h {

    /* renamed from: b  reason: collision with root package name */
    private final i f32535b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f32536c;

    /* renamed from: d  reason: collision with root package name */
    private Socket f32537d;

    /* renamed from: e  reason: collision with root package name */
    private Socket f32538e;

    /* renamed from: f  reason: collision with root package name */
    private p f32539f;

    /* renamed from: g  reason: collision with root package name */
    private v f32540g;

    /* renamed from: h  reason: collision with root package name */
    private g f32541h;

    /* renamed from: i  reason: collision with root package name */
    private e f32542i;

    /* renamed from: j  reason: collision with root package name */
    private d f32543j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f32544k;

    /* renamed from: l  reason: collision with root package name */
    public int f32545l;

    /* renamed from: m  reason: collision with root package name */
    public int f32546m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final List<Reference<g>> f32547n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public long f32548o = Long.MAX_VALUE;

    public c(i iVar, b0 b0Var) {
        this.f32535b = iVar;
        this.f32536c = b0Var;
    }

    private void e(int i10, int i11, bf.d dVar, o oVar) throws IOException {
        Socket socket;
        Proxy b10 = this.f32536c.b();
        a a10 = this.f32536c.a();
        if (b10.type() == Proxy.Type.DIRECT || b10.type() == Proxy.Type.HTTP) {
            socket = a10.j().createSocket();
        } else {
            socket = new Socket(b10);
        }
        this.f32537d = socket;
        oVar.f(dVar, this.f32536c.d(), b10);
        this.f32537d.setSoTimeout(i11);
        try {
            p002if.g.l().h(this.f32537d, this.f32536c.d(), i10);
            try {
                this.f32542i = l.b(l.j(this.f32537d));
                this.f32543j = l.a(l.g(this.f32537d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f32536c.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0135 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(ef.b r8) throws java.io.IOException {
        /*
            r7 = this;
            bf.b0 r0 = r7.f32536c
            bf.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            java.net.Socket r3 = r7.f32537d     // Catch:{ AssertionError -> 0x012e }
            bf.r r4 = r0.l()     // Catch:{ AssertionError -> 0x012e }
            java.lang.String r4 = r4.l()     // Catch:{ AssertionError -> 0x012e }
            bf.r r5 = r0.l()     // Catch:{ AssertionError -> 0x012e }
            int r5 = r5.w()     // Catch:{ AssertionError -> 0x012e }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x012e }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x012e }
            bf.j r8 = r8.a(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r8.f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 == 0) goto L_0x0041
            if.g r3 = p002if.g.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            bf.r r4 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r4 = r4.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r0.f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.g(r1, r4, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            bf.p r4 = bf.p.b(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            bf.r r6 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r6 = r6.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.c()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            bf.r r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = bf.f.c(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r8 = kf.d.a(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r2     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            bf.r r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00d8:
            bf.f r3 = r0.a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            bf.r r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r4.c()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.a(r0, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r8 = r8.f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r8 == 0) goto L_0x00f9
            if.g r8 = p002if.g.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r2 = r8.n(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00f9:
            r7.f32538e = r1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            lf.s r8 = lf.l.j(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            lf.e r8 = lf.l.b(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f32542i = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.net.Socket r8 = r7.f32538e     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            lf.r r8 = lf.l.g(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            lf.d r8 = lf.l.a(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f32543j = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f32539f = r4     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r2 == 0) goto L_0x011a
            bf.v r8 = bf.v.a(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            goto L_0x011c
        L_0x011a:
            bf.v r8 = bf.v.HTTP_1_1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x011c:
            r7.f32540g = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if.g r8 = p002if.g.l()
            r8.a(r1)
            return
        L_0x0126:
            r8 = move-exception
            r2 = r1
            goto L_0x013c
        L_0x0129:
            r8 = move-exception
            r2 = r1
            goto L_0x012f
        L_0x012c:
            r8 = move-exception
            goto L_0x013c
        L_0x012e:
            r8 = move-exception
        L_0x012f:
            boolean r0 = cf.c.A(r8)     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x013b
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012c }
            r0.<init>(r8)     // Catch:{ all -> 0x012c }
            throw r0     // Catch:{ all -> 0x012c }
        L_0x013b:
            throw r8     // Catch:{ all -> 0x012c }
        L_0x013c:
            if (r2 == 0) goto L_0x0145
            if.g r0 = p002if.g.l()
            r0.a(r2)
        L_0x0145:
            cf.c.h(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.c.f(ef.b):void");
    }

    private void g(int i10, int i11, int i12, bf.d dVar, o oVar) throws IOException {
        x i13 = i();
        r h10 = i13.h();
        int i14 = 0;
        while (i14 < 21) {
            e(i10, i11, dVar, oVar);
            i13 = h(i11, i12, i13, h10);
            if (i13 != null) {
                cf.c.h(this.f32537d);
                this.f32537d = null;
                this.f32543j = null;
                this.f32542i = null;
                oVar.d(dVar, this.f32536c.d(), this.f32536c.b(), (v) null);
                i14++;
            } else {
                return;
            }
        }
    }

    private x h(int i10, int i11, x xVar, r rVar) throws IOException {
        String str = "CONNECT " + cf.c.s(rVar, true) + " HTTP/1.1";
        while (true) {
            gf.a aVar = new gf.a((u) null, (g) null, this.f32542i, this.f32543j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f32542i.e().g((long) i10, timeUnit);
            this.f32543j.e().g((long) i11, timeUnit);
            aVar.o(xVar.d(), str);
            aVar.a();
            z c10 = aVar.e(false).p(xVar).c();
            long b10 = ff.e.b(c10);
            if (b10 == -1) {
                b10 = 0;
            }
            s k10 = aVar.k(b10);
            cf.c.D(k10, a.e.API_PRIORITY_OTHER, timeUnit);
            k10.close();
            int j10 = c10.j();
            if (j10 != 200) {
                if (j10 == 407) {
                    x a10 = this.f32536c.a().h().a(this.f32536c, c10);
                    if (a10 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c10.q("Connection"))) {
                        return a10;
                    } else {
                        xVar = a10;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c10.j());
                }
            } else if (this.f32542i.c().F() && this.f32543j.c().F()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    private x i() throws IOException {
        x a10 = new x.a().f(this.f32536c.a().l()).d("CONNECT", (y) null).b("Host", cf.c.s(this.f32536c.a().l(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", cf.d.a()).a();
        x a11 = this.f32536c.a().h().a(this.f32536c, new z.a().p(a10).n(v.HTTP_1_1).g(407).k("Preemptive Authenticate").b(cf.c.f31985c).q(-1).o(-1).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a11 != null ? a11 : a10;
    }

    private void j(b bVar, int i10, bf.d dVar, o oVar) throws IOException {
        if (this.f32536c.a().k() == null) {
            List<v> f10 = this.f32536c.a().f();
            v vVar = v.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(vVar)) {
                this.f32538e = this.f32537d;
                this.f32540g = vVar;
                r(i10);
                return;
            }
            this.f32538e = this.f32537d;
            this.f32540g = v.HTTP_1_1;
            return;
        }
        oVar.u(dVar);
        f(bVar);
        oVar.t(dVar, this.f32539f);
        if (this.f32540g == v.HTTP_2) {
            r(i10);
        }
    }

    private void r(int i10) throws IOException {
        this.f32538e.setSoTimeout(0);
        g a10 = new g.h(true).d(this.f32538e, this.f32536c.a().l().l(), this.f32542i, this.f32543j).b(this).c(i10).a();
        this.f32541h = a10;
        a10.Y0();
    }

    public void a(g gVar) {
        synchronized (this.f32535b) {
            this.f32546m = gVar.i0();
        }
    }

    public void b(hf.i iVar) throws IOException {
        iVar.f(b.REFUSED_STREAM);
    }

    public void c() {
        cf.c.h(this.f32537d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(int r17, int r18, int r19, int r20, boolean r21, bf.d r22, bf.o r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            bf.v r0 = r7.f32540g
            if (r0 != 0) goto L_0x0150
            bf.b0 r0 = r7.f32536c
            bf.a r0 = r0.a()
            java.util.List r0 = r0.b()
            ef.b r10 = new ef.b
            r10.<init>(r0)
            bf.b0 r1 = r7.f32536c
            bf.a r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0074
            bf.j r1 = bf.j.f31778j
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            bf.b0 r0 = r7.f32536c
            bf.a r0 = r0.a()
            bf.r r0 = r0.l()
            java.lang.String r0 = r0.l()
            if.g r1 = p002if.g.l()
            boolean r1 = r1.q(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            ef.e r1 = new ef.e
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            ef.e r0 = new ef.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            bf.b0 r0 = r7.f32536c
            bf.a r0 = r0.a()
            java.util.List r0 = r0.f()
            bf.v r1 = bf.v.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            bf.b0 r0 = r7.f32536c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.g(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f32537d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.e(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.j(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            bf.b0 r0 = r7.f32536c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00f5 }
            bf.b0 r1 = r7.f32536c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00f5 }
            bf.v r2 = r7.f32540g     // Catch:{ IOException -> 0x00f5 }
            r9.d(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            bf.b0 r0 = r7.f32536c
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f32537d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            ef.e r1 = new ef.e
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            hf.g r0 = r7.f32541h
            if (r0 == 0) goto L_0x00f4
            bf.i r1 = r7.f32535b
            monitor-enter(r1)
            hf.g r0 = r7.f32541h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.i0()     // Catch:{ all -> 0x00f1 }
            r7.f32546m = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f32538e
            cf.c.h(r1)
            java.net.Socket r1 = r7.f32537d
            cf.c.h(r1)
            r7.f32538e = r11
            r7.f32537d = r11
            r7.f32542i = r11
            r7.f32543j = r11
            r7.f32539f = r11
            r7.f32540g = r11
            r7.f32541h = r11
            bf.b0 r1 = r7.f32536c
            java.net.InetSocketAddress r3 = r1.d()
            bf.b0 r1 = r7.f32536c
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.e(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            ef.e r12 = new ef.e
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            ef.e r0 = new ef.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.c.d(int, int, int, int, boolean, bf.d, bf.o):void");
    }

    public p k() {
        return this.f32539f;
    }

    public boolean l(bf.a aVar, b0 b0Var) {
        if (this.f32547n.size() >= this.f32546m || this.f32544k || !cf.a.f31981a.g(this.f32536c.a(), aVar)) {
            return false;
        }
        if (aVar.l().l().equals(p().a().l().l())) {
            return true;
        }
        if (this.f32541h == null || b0Var == null || b0Var.b().type() != Proxy.Type.DIRECT || this.f32536c.b().type() != Proxy.Type.DIRECT || !this.f32536c.d().equals(b0Var.d()) || b0Var.a().e() != kf.d.f36027a || !s(aVar.l())) {
            return false;
        }
        try {
            aVar.a().a(aVar.l().l(), k().c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean m(boolean z10) {
        int soTimeout;
        if (this.f32538e.isClosed() || this.f32538e.isInputShutdown() || this.f32538e.isOutputShutdown()) {
            return false;
        }
        g gVar = this.f32541h;
        if (gVar != null) {
            return gVar.h0(System.nanoTime());
        }
        if (z10) {
            try {
                soTimeout = this.f32538e.getSoTimeout();
                this.f32538e.setSoTimeout(1);
                if (this.f32542i.F()) {
                    this.f32538e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f32538e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f32538e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public boolean n() {
        return this.f32541h != null;
    }

    public ff.c o(u uVar, s.a aVar, g gVar) throws SocketException {
        if (this.f32541h != null) {
            return new f(uVar, aVar, gVar, this.f32541h);
        }
        this.f32538e.setSoTimeout(aVar.a());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f32542i.e().g((long) aVar.a(), timeUnit);
        this.f32543j.e().g((long) aVar.b(), timeUnit);
        return new gf.a(uVar, gVar, this.f32542i, this.f32543j);
    }

    public b0 p() {
        return this.f32536c;
    }

    public Socket q() {
        return this.f32538e;
    }

    public boolean s(r rVar) {
        if (rVar.w() != this.f32536c.a().l().w()) {
            return false;
        }
        if (rVar.l().equals(this.f32536c.a().l().l())) {
            return true;
        }
        if (this.f32539f == null || !kf.d.f36027a.c(rVar.l(), (X509Certificate) this.f32539f.c().get(0))) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f32536c.a().l().l());
        sb2.append(":");
        sb2.append(this.f32536c.a().l().w());
        sb2.append(", proxy=");
        sb2.append(this.f32536c.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f32536c.d());
        sb2.append(" cipherSuite=");
        p pVar = this.f32539f;
        sb2.append(pVar != null ? pVar.a() : "none");
        sb2.append(" protocol=");
        sb2.append(this.f32540g);
        sb2.append('}');
        return sb2.toString();
    }
}
