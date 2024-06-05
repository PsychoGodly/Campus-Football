package bf;

import cf.c;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpec */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    private static final g[] f31773e;

    /* renamed from: f  reason: collision with root package name */
    private static final g[] f31774f;

    /* renamed from: g  reason: collision with root package name */
    public static final j f31775g;

    /* renamed from: h  reason: collision with root package name */
    public static final j f31776h;

    /* renamed from: i  reason: collision with root package name */
    public static final j f31777i;

    /* renamed from: j  reason: collision with root package name */
    public static final j f31778j = new a(false).a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f31779a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f31780b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f31781c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f31782d;

    static {
        g gVar = g.f31735n1;
        g gVar2 = g.f31738o1;
        g gVar3 = g.f31741p1;
        g gVar4 = g.f31744q1;
        g gVar5 = g.f31747r1;
        g gVar6 = g.Z0;
        g gVar7 = g.f31705d1;
        g gVar8 = g.f31696a1;
        g gVar9 = g.f31708e1;
        g gVar10 = g.f31726k1;
        g gVar11 = g.f31723j1;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f31773e = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.K0, g.L0, g.f31719i0, g.f31722j0, g.G, g.K, g.f31724k};
        f31774f = gVarArr2;
        a b10 = new a(true).b(gVarArr);
        c0 c0Var = c0.TLS_1_3;
        c0 c0Var2 = c0.TLS_1_2;
        f31775g = b10.e(c0Var, c0Var2).d(true).a();
        a b11 = new a(true).b(gVarArr2);
        c0 c0Var3 = c0.TLS_1_0;
        f31776h = b11.e(c0Var, c0Var2, c0.TLS_1_1, c0Var3).d(true).a();
        f31777i = new a(true).b(gVarArr2).e(c0Var3).d(true).a();
    }

    j(a aVar) {
        this.f31779a = aVar.f31783a;
        this.f31781c = aVar.f31784b;
        this.f31782d = aVar.f31785c;
        this.f31780b = aVar.f31786d;
    }

    private j e(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        String[] strArr2;
        if (this.f31781c != null) {
            strArr = c.z(g.f31697b, sSLSocket.getEnabledCipherSuites(), this.f31781c);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f31782d != null) {
            strArr2 = c.z(c.f31999q, sSLSocket.getEnabledProtocols(), this.f31782d);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int w10 = c.w(g.f31697b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && w10 != -1) {
            strArr = c.i(strArr, supportedCipherSuites[w10]);
        }
        return new a(this).c(strArr).f(strArr2).a();
    }

    /* access modifiers changed from: package-private */
    public void a(SSLSocket sSLSocket, boolean z10) {
        j e10 = e(sSLSocket, z10);
        String[] strArr = e10.f31782d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e10.f31781c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public List<g> b() {
        String[] strArr = this.f31781c;
        if (strArr != null) {
            return g.b(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f31779a) {
            return false;
        }
        String[] strArr = this.f31782d;
        if (strArr != null && !c.B(c.f31999q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f31781c;
        if (strArr2 == null || c.B(g.f31697b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public boolean d() {
        return this.f31779a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z10 = this.f31779a;
        if (z10 != jVar.f31779a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f31781c, jVar.f31781c) && Arrays.equals(this.f31782d, jVar.f31782d) && this.f31780b == jVar.f31780b);
    }

    public boolean f() {
        return this.f31780b;
    }

    public List<c0> g() {
        String[] strArr = this.f31782d;
        if (strArr != null) {
            return c0.c(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f31779a) {
            return ((((527 + Arrays.hashCode(this.f31781c)) * 31) + Arrays.hashCode(this.f31782d)) * 31) + (this.f31780b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f31779a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f31781c != null ? b().toString() : str;
        if (this.f31782d != null) {
            str = g().toString();
        }
        return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + str + ", supportsTlsExtensions=" + this.f31780b + ")";
    }

    /* compiled from: ConnectionSpec */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f31783a;

        /* renamed from: b  reason: collision with root package name */
        String[] f31784b;

        /* renamed from: c  reason: collision with root package name */
        String[] f31785c;

        /* renamed from: d  reason: collision with root package name */
        boolean f31786d;

        a(boolean z10) {
            this.f31783a = z10;
        }

        public j a() {
            return new j(this);
        }

        public a b(g... gVarArr) {
            if (this.f31783a) {
                String[] strArr = new String[gVarArr.length];
                for (int i10 = 0; i10 < gVarArr.length; i10++) {
                    strArr[i10] = gVarArr[i10].f31764a;
                }
                return c(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a c(String... strArr) {
            if (!this.f31783a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f31784b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a d(boolean z10) {
            if (this.f31783a) {
                this.f31786d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a e(c0... c0VarArr) {
            if (this.f31783a) {
                String[] strArr = new String[c0VarArr.length];
                for (int i10 = 0; i10 < c0VarArr.length; i10++) {
                    strArr[i10] = c0VarArr[i10].f31686a;
                }
                return f(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a f(String... strArr) {
            if (!this.f31783a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f31785c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a(j jVar) {
            this.f31783a = jVar.f31779a;
            this.f31784b = jVar.f31781c;
            this.f31785c = jVar.f31782d;
            this.f31786d = jVar.f31780b;
        }
    }
}
