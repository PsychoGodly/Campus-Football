package bf;

import bf.o;
import bf.q;
import bf.z;
import cf.c;
import df.d;
import ef.g;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: OkHttpClient */
public class u implements Cloneable {
    static final List<v> C = c.u(v.HTTP_2, v.HTTP_1_1);
    static final List<j> D = c.u(j.f31776h, j.f31778j);
    final int A;
    final int B;

    /* renamed from: a  reason: collision with root package name */
    final m f31841a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f31842b;

    /* renamed from: c  reason: collision with root package name */
    final List<v> f31843c;

    /* renamed from: d  reason: collision with root package name */
    final List<j> f31844d;

    /* renamed from: f  reason: collision with root package name */
    final List<s> f31845f;

    /* renamed from: g  reason: collision with root package name */
    final List<s> f31846g;

    /* renamed from: h  reason: collision with root package name */
    final o.c f31847h;

    /* renamed from: i  reason: collision with root package name */
    final ProxySelector f31848i;

    /* renamed from: j  reason: collision with root package name */
    final l f31849j;

    /* renamed from: k  reason: collision with root package name */
    final d f31850k;

    /* renamed from: l  reason: collision with root package name */
    final SocketFactory f31851l;

    /* renamed from: m  reason: collision with root package name */
    final SSLSocketFactory f31852m;

    /* renamed from: n  reason: collision with root package name */
    final kf.c f31853n;

    /* renamed from: o  reason: collision with root package name */
    final HostnameVerifier f31854o;

    /* renamed from: p  reason: collision with root package name */
    final f f31855p;

    /* renamed from: q  reason: collision with root package name */
    final b f31856q;

    /* renamed from: r  reason: collision with root package name */
    final b f31857r;

    /* renamed from: s  reason: collision with root package name */
    final i f31858s;

    /* renamed from: t  reason: collision with root package name */
    final n f31859t;

    /* renamed from: u  reason: collision with root package name */
    final boolean f31860u;

    /* renamed from: v  reason: collision with root package name */
    final boolean f31861v;

    /* renamed from: w  reason: collision with root package name */
    final boolean f31862w;

    /* renamed from: x  reason: collision with root package name */
    final int f31863x;

    /* renamed from: y  reason: collision with root package name */
    final int f31864y;

    /* renamed from: z  reason: collision with root package name */
    final int f31865z;

    /* compiled from: OkHttpClient */
    class a extends cf.a {
        a() {
        }

        public void a(q.a aVar, String str) {
            aVar.b(str);
        }

        public void b(q.a aVar, String str, String str2) {
            aVar.c(str, str2);
        }

        public void c(j jVar, SSLSocket sSLSocket, boolean z10) {
            jVar.a(sSLSocket, z10);
        }

        public int d(z.a aVar) {
            return aVar.f31940c;
        }

        public boolean e(i iVar, ef.c cVar) {
            return iVar.b(cVar);
        }

        public Socket f(i iVar, a aVar, g gVar) {
            return iVar.c(aVar, gVar);
        }

        public boolean g(a aVar, a aVar2) {
            return aVar.d(aVar2);
        }

        public ef.c h(i iVar, a aVar, g gVar, b0 b0Var) {
            return iVar.d(aVar, gVar, b0Var);
        }

        public void i(i iVar, ef.c cVar) {
            iVar.f(cVar);
        }

        public ef.d j(i iVar) {
            return iVar.f31770e;
        }

        public IOException k(d dVar, IOException iOException) {
            return ((w) dVar).j(iOException);
        }
    }

    static {
        cf.a.f31981a = new a();
    }

    public u() {
        this(new b());
    }

    private static SSLSocketFactory w(X509TrustManager x509TrustManager) {
        try {
            SSLContext m10 = p002if.g.l().m();
            m10.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return m10.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw c.b("No System TLS", e10);
        }
    }

    public b B() {
        return this.f31856q;
    }

    public ProxySelector C() {
        return this.f31848i;
    }

    public int D() {
        return this.f31865z;
    }

    public boolean E() {
        return this.f31862w;
    }

    public SocketFactory F() {
        return this.f31851l;
    }

    public SSLSocketFactory G() {
        return this.f31852m;
    }

    public int H() {
        return this.A;
    }

    public b a() {
        return this.f31857r;
    }

    public int b() {
        return this.f31863x;
    }

    public f c() {
        return this.f31855p;
    }

    public int d() {
        return this.f31864y;
    }

    public i e() {
        return this.f31858s;
    }

    public List<j> f() {
        return this.f31844d;
    }

    public l g() {
        return this.f31849j;
    }

    public m i() {
        return this.f31841a;
    }

    public n j() {
        return this.f31859t;
    }

    public o.c k() {
        return this.f31847h;
    }

    public boolean l() {
        return this.f31861v;
    }

    public boolean m() {
        return this.f31860u;
    }

    public HostnameVerifier o() {
        return this.f31854o;
    }

    public List<s> p() {
        return this.f31845f;
    }

    /* access modifiers changed from: package-private */
    public d r() {
        return this.f31850k;
    }

    public List<s> s() {
        return this.f31846g;
    }

    public b t() {
        return new b(this);
    }

    public d v(x xVar) {
        return w.g(this, xVar, false);
    }

    public int x() {
        return this.B;
    }

    public List<v> y() {
        return this.f31843c;
    }

    public Proxy z() {
        return this.f31842b;
    }

    u(b bVar) {
        boolean z10;
        this.f31841a = bVar.f31866a;
        this.f31842b = bVar.f31867b;
        this.f31843c = bVar.f31868c;
        List<j> list = bVar.f31869d;
        this.f31844d = list;
        this.f31845f = c.t(bVar.f31870e);
        this.f31846g = c.t(bVar.f31871f);
        this.f31847h = bVar.f31872g;
        this.f31848i = bVar.f31873h;
        this.f31849j = bVar.f31874i;
        this.f31850k = bVar.f31875j;
        this.f31851l = bVar.f31876k;
        Iterator<j> it = list.iterator();
        loop0:
        while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                j next = it.next();
                if (z10 || next.d()) {
                    z10 = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f31877l;
        if (sSLSocketFactory != null || !z10) {
            this.f31852m = sSLSocketFactory;
            this.f31853n = bVar.f31878m;
        } else {
            X509TrustManager C2 = c.C();
            this.f31852m = w(C2);
            this.f31853n = kf.c.b(C2);
        }
        if (this.f31852m != null) {
            p002if.g.l().f(this.f31852m);
        }
        this.f31854o = bVar.f31879n;
        this.f31855p = bVar.f31880o.f(this.f31853n);
        this.f31856q = bVar.f31881p;
        this.f31857r = bVar.f31882q;
        this.f31858s = bVar.f31883r;
        this.f31859t = bVar.f31884s;
        this.f31860u = bVar.f31885t;
        this.f31861v = bVar.f31886u;
        this.f31862w = bVar.f31887v;
        this.f31863x = bVar.f31888w;
        this.f31864y = bVar.f31889x;
        this.f31865z = bVar.f31890y;
        this.A = bVar.f31891z;
        this.B = bVar.A;
        if (this.f31845f.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f31845f);
        } else if (this.f31846g.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f31846g);
        }
    }

    /* compiled from: OkHttpClient */
    public static final class b {
        int A;

        /* renamed from: a  reason: collision with root package name */
        m f31866a;

        /* renamed from: b  reason: collision with root package name */
        Proxy f31867b;

        /* renamed from: c  reason: collision with root package name */
        List<v> f31868c;

        /* renamed from: d  reason: collision with root package name */
        List<j> f31869d;

        /* renamed from: e  reason: collision with root package name */
        final List<s> f31870e;

        /* renamed from: f  reason: collision with root package name */
        final List<s> f31871f;

        /* renamed from: g  reason: collision with root package name */
        o.c f31872g;

        /* renamed from: h  reason: collision with root package name */
        ProxySelector f31873h;

        /* renamed from: i  reason: collision with root package name */
        l f31874i;

        /* renamed from: j  reason: collision with root package name */
        d f31875j;

        /* renamed from: k  reason: collision with root package name */
        SocketFactory f31876k;

        /* renamed from: l  reason: collision with root package name */
        SSLSocketFactory f31877l;

        /* renamed from: m  reason: collision with root package name */
        kf.c f31878m;

        /* renamed from: n  reason: collision with root package name */
        HostnameVerifier f31879n;

        /* renamed from: o  reason: collision with root package name */
        f f31880o;

        /* renamed from: p  reason: collision with root package name */
        b f31881p;

        /* renamed from: q  reason: collision with root package name */
        b f31882q;

        /* renamed from: r  reason: collision with root package name */
        i f31883r;

        /* renamed from: s  reason: collision with root package name */
        n f31884s;

        /* renamed from: t  reason: collision with root package name */
        boolean f31885t;

        /* renamed from: u  reason: collision with root package name */
        boolean f31886u;

        /* renamed from: v  reason: collision with root package name */
        boolean f31887v;

        /* renamed from: w  reason: collision with root package name */
        int f31888w;

        /* renamed from: x  reason: collision with root package name */
        int f31889x;

        /* renamed from: y  reason: collision with root package name */
        int f31890y;

        /* renamed from: z  reason: collision with root package name */
        int f31891z;

        public b() {
            this.f31870e = new ArrayList();
            this.f31871f = new ArrayList();
            this.f31866a = new m();
            this.f31868c = u.C;
            this.f31869d = u.D;
            this.f31872g = o.k(o.f31809a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f31873h = proxySelector;
            if (proxySelector == null) {
                this.f31873h = new jf.a();
            }
            this.f31874i = l.f31800a;
            this.f31876k = SocketFactory.getDefault();
            this.f31879n = kf.d.f36027a;
            this.f31880o = f.f31687c;
            b bVar = b.f31653a;
            this.f31881p = bVar;
            this.f31882q = bVar;
            this.f31883r = new i();
            this.f31884s = n.f31808a;
            this.f31885t = true;
            this.f31886u = true;
            this.f31887v = true;
            this.f31888w = 0;
            this.f31889x = 10000;
            this.f31890y = 10000;
            this.f31891z = 10000;
            this.A = 0;
        }

        public u a() {
            return new u(this);
        }

        public b b(long j10, TimeUnit timeUnit) {
            this.f31889x = c.e("timeout", j10, timeUnit);
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f31890y = c.e("timeout", j10, timeUnit);
            return this;
        }

        b(u uVar) {
            ArrayList arrayList = new ArrayList();
            this.f31870e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f31871f = arrayList2;
            this.f31866a = uVar.f31841a;
            this.f31867b = uVar.f31842b;
            this.f31868c = uVar.f31843c;
            this.f31869d = uVar.f31844d;
            arrayList.addAll(uVar.f31845f);
            arrayList2.addAll(uVar.f31846g);
            this.f31872g = uVar.f31847h;
            this.f31873h = uVar.f31848i;
            this.f31874i = uVar.f31849j;
            this.f31875j = uVar.f31850k;
            this.f31876k = uVar.f31851l;
            this.f31877l = uVar.f31852m;
            this.f31878m = uVar.f31853n;
            this.f31879n = uVar.f31854o;
            this.f31880o = uVar.f31855p;
            this.f31881p = uVar.f31856q;
            this.f31882q = uVar.f31857r;
            this.f31883r = uVar.f31858s;
            this.f31884s = uVar.f31859t;
            this.f31885t = uVar.f31860u;
            this.f31886u = uVar.f31861v;
            this.f31887v = uVar.f31862w;
            this.f31888w = uVar.f31863x;
            this.f31889x = uVar.f31864y;
            this.f31890y = uVar.f31865z;
            this.f31891z = uVar.A;
            this.A = uVar.B;
        }
    }
}
