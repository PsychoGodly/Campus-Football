package gd;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpec */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    private static final a[] f32870e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f32871f;

    /* renamed from: g  reason: collision with root package name */
    public static final b f32872g;

    /* renamed from: h  reason: collision with root package name */
    public static final b f32873h = new C0373b(false).e();

    /* renamed from: a  reason: collision with root package name */
    final boolean f32874a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String[] f32875b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String[] f32876c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f32877d;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f32870e = aVarArr;
        C0373b f10 = new C0373b(true).f(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        b e10 = f10.i(kVar, kVar2).h(true).e();
        f32871f = e10;
        f32872g = new C0373b(e10).i(kVar, kVar2, k.TLS_1_1, k.TLS_1_0).h(true).e();
    }

    private b e(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        Class<String> cls = String.class;
        if (this.f32875b != null) {
            strArr = (String[]) l.c(cls, this.f32875b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z10 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        return new C0373b(this).g(strArr).j((String[]) l.c(cls, this.f32876c, enabledProtocols)).e();
    }

    public void c(SSLSocket sSLSocket, boolean z10) {
        b e10 = e(sSLSocket, z10);
        sSLSocket.setEnabledProtocols(e10.f32876c);
        String[] strArr = e10.f32875b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List<a> d() {
        String[] strArr = this.f32875b;
        if (strArr == null) {
            return null;
        }
        a[] aVarArr = new a[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f32875b;
            if (i10 >= strArr2.length) {
                return l.a(aVarArr);
            }
            aVarArr[i10] = a.a(strArr2[i10]);
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z10 = this.f32874a;
        if (z10 != bVar.f32874a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f32875b, bVar.f32875b) && Arrays.equals(this.f32876c, bVar.f32876c) && this.f32877d == bVar.f32877d);
    }

    public boolean f() {
        return this.f32877d;
    }

    public List<k> g() {
        k[] kVarArr = new k[this.f32876c.length];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f32876c;
            if (i10 >= strArr.length) {
                return l.a(kVarArr);
            }
            kVarArr[i10] = k.a(strArr[i10]);
            i10++;
        }
    }

    public int hashCode() {
        if (this.f32874a) {
            return ((((527 + Arrays.hashCode(this.f32875b)) * 31) + Arrays.hashCode(this.f32876c)) * 31) + (this.f32877d ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        if (!this.f32874a) {
            return "ConnectionSpec()";
        }
        List<a> d10 = d();
        if (d10 == null) {
            str = "[use default]";
        } else {
            str = d10.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + g() + ", supportsTlsExtensions=" + this.f32877d + ")";
    }

    /* renamed from: gd.b$b  reason: collision with other inner class name */
    /* compiled from: ConnectionSpec */
    public static final class C0373b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f32878a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String[] f32879b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String[] f32880c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f32881d;

        public C0373b(boolean z10) {
            this.f32878a = z10;
        }

        public b e() {
            return new b(this);
        }

        public C0373b f(a... aVarArr) {
            if (this.f32878a) {
                String[] strArr = new String[aVarArr.length];
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    strArr[i10] = aVarArr[i10].f32869a;
                }
                this.f32879b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public C0373b g(String... strArr) {
            if (this.f32878a) {
                if (strArr == null) {
                    this.f32879b = null;
                } else {
                    this.f32879b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public C0373b h(boolean z10) {
            if (this.f32878a) {
                this.f32881d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public C0373b i(k... kVarArr) {
            if (!this.f32878a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (kVarArr.length != 0) {
                String[] strArr = new String[kVarArr.length];
                for (int i10 = 0; i10 < kVarArr.length; i10++) {
                    strArr[i10] = kVarArr[i10].f32936a;
                }
                this.f32880c = strArr;
                return this;
            } else {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
        }

        public C0373b j(String... strArr) {
            if (this.f32878a) {
                if (strArr == null) {
                    this.f32880c = null;
                } else {
                    this.f32880c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C0373b(b bVar) {
            this.f32878a = bVar.f32874a;
            this.f32879b = bVar.f32875b;
            this.f32880c = bVar.f32876c;
            this.f32881d = bVar.f32877d;
        }
    }

    private b(C0373b bVar) {
        this.f32874a = bVar.f32878a;
        this.f32875b = bVar.f32879b;
        this.f32876c = bVar.f32880c;
        this.f32877d = bVar.f32881d;
    }
}
