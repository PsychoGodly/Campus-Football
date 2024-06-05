package ff;

import bf.a;
import bf.a0;
import bf.b0;
import bf.d;
import bf.f;
import bf.o;
import bf.r;
import bf.s;
import bf.u;
import bf.x;
import bf.y;
import bf.z;
import com.google.android.gms.common.api.a;
import ef.c;
import ef.e;
import ef.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: RetryAndFollowUpInterceptor */
public final class j implements s {

    /* renamed from: a  reason: collision with root package name */
    private final u f32795a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f32796b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f32797c;

    /* renamed from: d  reason: collision with root package name */
    private Object f32798d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f32799e;

    public j(u uVar, boolean z10) {
        this.f32795a = uVar;
        this.f32796b = z10;
    }

    private a c(r rVar) {
        f fVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (rVar.m()) {
            SSLSocketFactory G = this.f32795a.G();
            hostnameVerifier = this.f32795a.o();
            sSLSocketFactory = G;
            fVar = this.f32795a.c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new a(rVar.l(), rVar.w(), this.f32795a.j(), this.f32795a.F(), sSLSocketFactory, hostnameVerifier, fVar, this.f32795a.B(), this.f32795a.z(), this.f32795a.y(), this.f32795a.f(), this.f32795a.C());
    }

    private x d(z zVar, b0 b0Var) throws IOException {
        String q10;
        r A;
        if (zVar != null) {
            int j10 = zVar.j();
            String f10 = zVar.Z().f();
            y yVar = null;
            if (j10 == 307 || j10 == 308) {
                if (!f10.equals("GET") && !f10.equals("HEAD")) {
                    return null;
                }
            } else if (j10 == 401) {
                return this.f32795a.a().a(b0Var, zVar);
            } else {
                if (j10 != 503) {
                    if (j10 != 407) {
                        if (j10 != 408) {
                            switch (j10) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
                                    return null;
                            }
                        } else if (!this.f32795a.E()) {
                            return null;
                        } else {
                            zVar.Z().a();
                            if ((zVar.J() == null || zVar.J().j() != 408) && i(zVar, 0) <= 0) {
                                return zVar.Z();
                            }
                            return null;
                        }
                    } else if (b0Var.b().type() == Proxy.Type.HTTP) {
                        return this.f32795a.B().a(b0Var, zVar);
                    } else {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                } else if ((zVar.J() == null || zVar.J().j() != 503) && i(zVar, a.e.API_PRIORITY_OTHER) == 0) {
                    return zVar.Z();
                } else {
                    return null;
                }
            }
            if (!this.f32795a.l() || (q10 = zVar.q("Location")) == null || (A = zVar.Z().h().A(q10)) == null) {
                return null;
            }
            if (!A.B().equals(zVar.Z().h().B()) && !this.f32795a.m()) {
                return null;
            }
            x.a g10 = zVar.Z().g();
            if (f.b(f10)) {
                boolean d10 = f.d(f10);
                if (f.c(f10)) {
                    g10.d("GET", (y) null);
                } else {
                    if (d10) {
                        yVar = zVar.Z().a();
                    }
                    g10.d(f10, yVar);
                }
                if (!d10) {
                    g10.e("Transfer-Encoding");
                    g10.e("Content-Length");
                    g10.e("Content-Type");
                }
            }
            if (!j(zVar, A)) {
                g10.e("Authorization");
            }
            return g10.f(A).a();
        }
        throw new IllegalStateException();
    }

    private boolean f(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z10) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean g(IOException iOException, g gVar, boolean z10, x xVar) {
        gVar.q(iOException);
        if (!this.f32795a.E()) {
            return false;
        }
        if ((!z10 || !h(iOException, xVar)) && f(iOException, z10) && gVar.h()) {
            return true;
        }
        return false;
    }

    private boolean h(IOException iOException, x xVar) {
        xVar.a();
        return iOException instanceof FileNotFoundException;
    }

    private int i(z zVar, int i10) {
        String q10 = zVar.q("Retry-After");
        if (q10 == null) {
            return i10;
        }
        return q10.matches("\\d+") ? Integer.valueOf(q10).intValue() : a.e.API_PRIORITY_OTHER;
    }

    private boolean j(z zVar, r rVar) {
        r h10 = zVar.Z().h();
        return h10.l().equals(rVar.l()) && h10.w() == rVar.w() && h10.B().equals(rVar.B());
    }

    public z a(s.a aVar) throws IOException {
        x h10 = aVar.h();
        g gVar = (g) aVar;
        d e10 = gVar.e();
        o g10 = gVar.g();
        g gVar2 = new g(this.f32795a.e(), c(h10.h()), e10, g10, this.f32798d);
        this.f32797c = gVar2;
        z zVar = null;
        int i10 = 0;
        while (!this.f32799e) {
            try {
                z j10 = gVar.j(h10, gVar2, (c) null, (c) null);
                if (zVar != null) {
                    j10 = j10.B().m(zVar.B().b((a0) null).c()).c();
                }
                try {
                    x d10 = d(j10, gVar2.o());
                    if (d10 == null) {
                        gVar2.k();
                        return j10;
                    }
                    cf.c.g(j10.h());
                    int i11 = i10 + 1;
                    if (i11 <= 20) {
                        d10.a();
                        if (!j(j10, d10.h())) {
                            gVar2.k();
                            gVar2 = new g(this.f32795a.e(), c(d10.h()), e10, g10, this.f32798d);
                            this.f32797c = gVar2;
                        } else if (gVar2.c() != null) {
                            throw new IllegalStateException("Closing the body of " + j10 + " didn't close its backing stream. Bad interceptor?");
                        }
                        zVar = j10;
                        h10 = d10;
                        i10 = i11;
                    } else {
                        gVar2.k();
                        throw new ProtocolException("Too many follow-up requests: " + i11);
                    }
                } catch (IOException e11) {
                    gVar2.k();
                    throw e11;
                }
            } catch (e e12) {
                if (!g(e12.c(), gVar2, false, h10)) {
                    throw e12.b();
                }
            } catch (IOException e13) {
                if (!g(e13, gVar2, !(e13 instanceof hf.a), h10)) {
                    throw e13;
                }
            } catch (Throwable th) {
                gVar2.q((IOException) null);
                gVar2.k();
                throw th;
            }
        }
        gVar2.k();
        throw new IOException("Canceled");
    }

    public void b() {
        this.f32799e = true;
        g gVar = this.f32797c;
        if (gVar != null) {
            gVar.b();
        }
    }

    public boolean e() {
        return this.f32799e;
    }

    public void k(Object obj) {
        this.f32798d = obj;
    }
}
