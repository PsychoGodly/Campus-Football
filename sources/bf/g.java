package bf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: CipherSuite */
public final class g {
    public static final g A = c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final g A0 = c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final g B = c("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final g B0 = c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final g C = c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final g C0 = c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final g D = c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final g D0 = c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final g E = c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final g E0 = c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final g F = c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final g F0 = c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final g G = c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final g G0 = c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final g H = c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final g H0 = c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final g I = c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final g I0 = c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final g J = c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final g J0 = c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final g K = c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final g K0 = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final g L = c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final g L0 = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final g M = c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final g M0 = c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final g N = c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final g N0 = c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final g O = c("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final g O0 = c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final g P = c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final g P0 = c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final g Q = c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final g Q0 = c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final g R = c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final g R0 = c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final g S = c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final g S0 = c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final g T = c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final g T0 = c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final g U = c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final g U0 = c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final g V = c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final g V0 = c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final g W = c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final g W0 = c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final g X = c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final g X0 = c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final g Y = c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final g Y0 = c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final g Z = c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
    public static final g Z0 = c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: a0  reason: collision with root package name */
    public static final g f31695a0 = c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: a1  reason: collision with root package name */
    public static final g f31696a1 = c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: b  reason: collision with root package name */
    static final Comparator<String> f31697b = new a();

    /* renamed from: b0  reason: collision with root package name */
    public static final g f31698b0 = c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: b1  reason: collision with root package name */
    public static final g f31699b1 = c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, g> f31700c = new LinkedHashMap();

    /* renamed from: c0  reason: collision with root package name */
    public static final g f31701c0 = c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: c1  reason: collision with root package name */
    public static final g f31702c1 = c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: d  reason: collision with root package name */
    public static final g f31703d = c("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: d0  reason: collision with root package name */
    public static final g f31704d0 = c("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: d1  reason: collision with root package name */
    public static final g f31705d1 = c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: e  reason: collision with root package name */
    public static final g f31706e = c("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: e0  reason: collision with root package name */
    public static final g f31707e0 = c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* renamed from: e1  reason: collision with root package name */
    public static final g f31708e1 = c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: f  reason: collision with root package name */
    public static final g f31709f = c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: f0  reason: collision with root package name */
    public static final g f31710f0 = c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* renamed from: f1  reason: collision with root package name */
    public static final g f31711f1 = c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: g  reason: collision with root package name */
    public static final g f31712g = c("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: g0  reason: collision with root package name */
    public static final g f31713g0 = c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* renamed from: g1  reason: collision with root package name */
    public static final g f31714g1 = c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: h  reason: collision with root package name */
    public static final g f31715h = c("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: h0  reason: collision with root package name */
    public static final g f31716h0 = c("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* renamed from: h1  reason: collision with root package name */
    public static final g f31717h1 = c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: i  reason: collision with root package name */
    public static final g f31718i = c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: i0  reason: collision with root package name */
    public static final g f31719i0 = c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: i1  reason: collision with root package name */
    public static final g f31720i1 = c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: j  reason: collision with root package name */
    public static final g f31721j = c("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: j0  reason: collision with root package name */
    public static final g f31722j0 = c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: j1  reason: collision with root package name */
    public static final g f31723j1 = c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: k  reason: collision with root package name */
    public static final g f31724k = c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: k0  reason: collision with root package name */
    public static final g f31725k0 = c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: k1  reason: collision with root package name */
    public static final g f31726k1 = c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: l  reason: collision with root package name */
    public static final g f31727l = c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: l0  reason: collision with root package name */
    public static final g f31728l0 = c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: l1  reason: collision with root package name */
    public static final g f31729l1 = c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: m  reason: collision with root package name */
    public static final g f31730m = c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: m0  reason: collision with root package name */
    public static final g f31731m0 = c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* renamed from: m1  reason: collision with root package name */
    public static final g f31732m1 = c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: n  reason: collision with root package name */
    public static final g f31733n = c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: n0  reason: collision with root package name */
    public static final g f31734n0 = c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: n1  reason: collision with root package name */
    public static final g f31735n1 = c("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: o  reason: collision with root package name */
    public static final g f31736o = c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: o0  reason: collision with root package name */
    public static final g f31737o0 = c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* renamed from: o1  reason: collision with root package name */
    public static final g f31738o1 = c("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: p  reason: collision with root package name */
    public static final g f31739p = c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: p0  reason: collision with root package name */
    public static final g f31740p0 = c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: p1  reason: collision with root package name */
    public static final g f31741p1 = c("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: q  reason: collision with root package name */
    public static final g f31742q = c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: q0  reason: collision with root package name */
    public static final g f31743q0 = c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: q1  reason: collision with root package name */
    public static final g f31744q1 = c("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: r  reason: collision with root package name */
    public static final g f31745r = c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: r0  reason: collision with root package name */
    public static final g f31746r0 = c("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: r1  reason: collision with root package name */
    public static final g f31747r1 = c("TLS_AES_256_CCM_8_SHA256", 4869);

    /* renamed from: s  reason: collision with root package name */
    public static final g f31748s = c("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: s0  reason: collision with root package name */
    public static final g f31749s0 = c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: t  reason: collision with root package name */
    public static final g f31750t = c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: t0  reason: collision with root package name */
    public static final g f31751t0 = c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: u  reason: collision with root package name */
    public static final g f31752u = c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: u0  reason: collision with root package name */
    public static final g f31753u0 = c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: v  reason: collision with root package name */
    public static final g f31754v = c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: v0  reason: collision with root package name */
    public static final g f31755v0 = c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: w  reason: collision with root package name */
    public static final g f31756w = c("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: w0  reason: collision with root package name */
    public static final g f31757w0 = c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: x  reason: collision with root package name */
    public static final g f31758x = c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: x0  reason: collision with root package name */
    public static final g f31759x0 = c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: y  reason: collision with root package name */
    public static final g f31760y = c("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: y0  reason: collision with root package name */
    public static final g f31761y0 = c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: z  reason: collision with root package name */
    public static final g f31762z = c("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* renamed from: z0  reason: collision with root package name */
    public static final g f31763z0 = c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* renamed from: a  reason: collision with root package name */
    final String f31764a;

    /* compiled from: CipherSuite */
    class a implements Comparator<String> {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            int i10 = 4;
            while (i10 < min) {
                char charAt = str.charAt(i10);
                char charAt2 = str2.charAt(i10);
                if (charAt == charAt2) {
                    i10++;
                } else if (charAt < charAt2) {
                    return -1;
                } else {
                    return 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    }

    private g(String str) {
        Objects.requireNonNull(str);
        this.f31764a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        synchronized (g.class) {
            Map<String, g> map = f31700c;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = map.get(d(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    static List<g> b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a10 : strArr) {
            arrayList.add(a(a10));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static g c(String str, int i10) {
        g gVar = new g(str);
        f31700c.put(str, gVar);
        return gVar;
    }

    private static String d(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            return "TLS_" + str.substring(4);
        }
    }

    public String toString() {
        return this.f31764a;
    }
}
