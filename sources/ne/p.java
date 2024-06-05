package ne;

import fe.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import me.d;
import sd.s;
import td.e0;

/* compiled from: Strings.kt */
class p extends o {

    /* compiled from: Strings.kt */
    static final class a extends n implements fe.p<CharSequence, Integer, sd.n<? extends Integer, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ char[] f36532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f36533b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f36532a = cArr;
            this.f36533b = z10;
        }

        public final sd.n<Integer, Integer> a(CharSequence charSequence, int i10) {
            m.e(charSequence, "$this$$receiver");
            int G = p.G(charSequence, this.f36532a, i10, this.f36533b);
            if (G < 0) {
                return null;
            }
            return s.a(Integer.valueOf(G), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: Strings.kt */
    static final class b extends n implements fe.p<CharSequence, Integer, sd.n<? extends Integer, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f36534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f36535b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f36534a = list;
            this.f36535b = z10;
        }

        public final sd.n<Integer, Integer> a(CharSequence charSequence, int i10) {
            m.e(charSequence, "$this$$receiver");
            sd.n s10 = p.x(charSequence, this.f36534a, i10, this.f36535b, false);
            if (s10 != null) {
                return s.a(s10.c(), Integer.valueOf(((String) s10.d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: Strings.kt */
    static final class c extends n implements l<ke.c, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f36536a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f36536a = charSequence;
        }

        /* renamed from: a */
        public final String invoke(ke.c cVar) {
            m.e(cVar, "it");
            return p.k0(this.f36536a, cVar);
        }
    }

    public static final int A(CharSequence charSequence, char c10, int i10, boolean z10) {
        m.e(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return G(charSequence, new char[]{c10}, i10, z10);
    }

    public static String A0(String str, char... cArr) {
        m.e(str, "<this>");
        m.e(cArr, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean h10 = m.h(cArr, str.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!h10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!h10) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static final int B(CharSequence charSequence, String str, int i10, boolean z10) {
        m.e(charSequence, "<this>");
        m.e(str, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return D(charSequence, str, i10, charSequence.length(), z10, false, 16, (Object) null);
    }

    private static final int C(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        ke.a aVar;
        if (!z11) {
            aVar = new ke.c(i.a(i10, 0), i.c(i11, charSequence.length()));
        } else {
            aVar = i.g(i.c(i10, z(charSequence)), i.a(i11, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int b10 = aVar.b();
            int e10 = aVar.e();
            int f10 = aVar.f();
            if ((f10 <= 0 || b10 > e10) && (f10 >= 0 || e10 > b10)) {
                return -1;
            }
            while (true) {
                if (X(charSequence2, 0, charSequence, b10, charSequence2.length(), z10)) {
                    return b10;
                }
                if (b10 == e10) {
                    return -1;
                }
                b10 += f10;
            }
        } else {
            int b11 = aVar.b();
            int e11 = aVar.e();
            int f11 = aVar.f();
            if ((f11 <= 0 || b11 > e11) && (f11 >= 0 || e11 > b11)) {
                return -1;
            }
            while (true) {
                if (o.n((String) charSequence2, 0, (String) charSequence, b11, charSequence2.length(), z10)) {
                    return b11;
                }
                if (b11 == e11) {
                    return -1;
                }
                b11 += f11;
            }
        }
    }

    static /* synthetic */ int D(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        return C(charSequence, charSequence2, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return A(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return B(charSequence, str, i10, z10);
    }

    public static final int G(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        m.e(charSequence, "<this>");
        m.e(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            e0 g10 = new ke.c(i.a(i10, 0), z(charSequence)).iterator();
            while (g10.hasNext()) {
                int a10 = g10.a();
                char charAt = charSequence.charAt(a10);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        continue;
                        break;
                    } else if (b.d(cArr[i11], charAt, z10)) {
                        z11 = true;
                        continue;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return a10;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(m.J(cArr), i10);
    }

    public static final int H(CharSequence charSequence, char c10, int i10, boolean z10) {
        m.e(charSequence, "<this>");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return L(charSequence, new char[]{c10}, i10, z10);
    }

    public static final int I(CharSequence charSequence, String str, int i10, boolean z10) {
        m.e(charSequence, "<this>");
        m.e(str, "string");
        if (z10 || !(charSequence instanceof String)) {
            return C(charSequence, str, i10, 0, z10, true);
        }
        return ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ int J(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return H(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int K(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = z(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return I(charSequence, str, i10, z10);
    }

    public static final int L(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        m.e(charSequence, "<this>");
        m.e(cArr, "chars");
        if (z10 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c10 = i.c(i10, z(charSequence)); -1 < c10; c10--) {
                char charAt = charSequence.charAt(c10);
                int length = cArr.length;
                boolean z11 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (b.d(cArr[i11], charAt, z10)) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z11) {
                    return c10;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(m.J(cArr), i10);
    }

    public static final d<String> M(CharSequence charSequence) {
        m.e(charSequence, "<this>");
        return h0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> N(CharSequence charSequence) {
        m.e(charSequence, "<this>");
        return l.j(M(charSequence));
    }

    public static final CharSequence O(CharSequence charSequence, int i10, char c10) {
        m.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(charSequence);
            e0 g10 = new ke.c(1, i10 - charSequence.length()).iterator();
            while (g10.hasNext()) {
                g10.a();
                sb2.append(c10);
            }
            return sb2;
        }
    }

    public static final String P(String str, int i10, char c10) {
        m.e(str, "<this>");
        return O(str, i10, c10).toString();
    }

    public static /* synthetic */ String Q(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return P(str, i10, c10);
    }

    public static final CharSequence R(CharSequence charSequence, int i10, char c10) {
        m.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            e0 g10 = new ke.c(1, i10 - charSequence.length()).iterator();
            while (g10.hasNext()) {
                g10.a();
                sb2.append(c10);
            }
            sb2.append(charSequence);
            return sb2;
        }
    }

    public static String S(String str, int i10, char c10) {
        m.e(str, "<this>");
        return R(str, i10, c10).toString();
    }

    private static final d<ke.c> T(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        a0(i11);
        return new d(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final d<ke.c> U(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        a0(i11);
        return new d(charSequence, i10, i11, new b(l.b(strArr), z10));
    }

    static /* synthetic */ d V(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return T(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ d W(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return U(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean X(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        m.e(charSequence, "<this>");
        m.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String Y(String str, CharSequence charSequence) {
        m.e(str, "<this>");
        m.e(charSequence, "prefix");
        if (!j0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        m.d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String Z(String str, CharSequence charSequence) {
        m.e(str, "<this>");
        m.e(charSequence, "suffix");
        if (!w(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void a0(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
        }
    }

    public static final List<String> b0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        m.e(charSequence, "<this>");
        m.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return d0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable<ke.c> f10 = l.f(V(charSequence, cArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(r.j(f10, 10));
        for (ke.c k02 : f10) {
            arrayList.add(k0(charSequence, k02));
        }
        return arrayList;
    }

    public static final List<String> c0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        m.e(charSequence, "<this>");
        m.e(strArr, "delimiters");
        boolean z11 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                return d0(charSequence, str, z10, i10);
            }
        }
        Iterable<ke.c> f10 = l.f(W(charSequence, strArr, 0, z10, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(r.j(f10, 10));
        for (ke.c k02 : f10) {
            arrayList.add(k0(charSequence, k02));
        }
        return arrayList;
    }

    private static final List<String> d0(CharSequence charSequence, String str, boolean z10, int i10) {
        a0(i10);
        int i11 = 0;
        int B = B(charSequence, str, 0, z10);
        if (B == -1 || i10 == 1) {
            return p.b(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = i.c(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, B).toString());
            i11 = str.length() + B;
            if ((z11 && arrayList.size() == i10 - 1) || (B = B(charSequence, str, i11, z10)) == -1) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i11, B).toString());
            i11 = str.length() + B;
            break;
        } while ((B = B(charSequence, str, i11, z10)) == -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List e0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return b0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List f0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return c0(charSequence, strArr, z10, i10);
    }

    public static final d<String> g0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        m.e(charSequence, "<this>");
        m.e(strArr, "delimiters");
        return l.h(W(charSequence, strArr, 0, z10, i10, 2, (Object) null), new c(charSequence));
    }

    public static /* synthetic */ d h0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return g0(charSequence, strArr, z10, i10);
    }

    public static final boolean i0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        m.e(charSequence, "<this>");
        m.e(charSequence2, "prefix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return o.r((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return X(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean j0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i0(charSequence, charSequence2, z10);
    }

    public static final String k0(CharSequence charSequence, ke.c cVar) {
        m.e(charSequence, "<this>");
        m.e(cVar, "range");
        return charSequence.subSequence(cVar.o().intValue(), cVar.n().intValue() + 1).toString();
    }

    public static final String l0(String str, char c10, String str2) {
        m.e(str, "<this>");
        m.e(str2, "missingDelimiterValue");
        int E = E(str, c10, 0, false, 6, (Object) null);
        if (E == -1) {
            return str2;
        }
        String substring = str.substring(E + 1, str.length());
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String m0(String str, String str2, String str3) {
        m.e(str, "<this>");
        m.e(str2, "delimiter");
        m.e(str3, "missingDelimiterValue");
        int F = F(str, str2, 0, false, 6, (Object) null);
        if (F == -1) {
            return str3;
        }
        String substring = str.substring(F + str2.length(), str.length());
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String n0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return l0(str, c10, str2);
    }

    public static /* synthetic */ String o0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m0(str, str2, str3);
    }

    public static final String p0(String str, char c10, String str2) {
        m.e(str, "<this>");
        m.e(str2, "missingDelimiterValue");
        int J = J(str, c10, 0, false, 6, (Object) null);
        if (J == -1) {
            return str2;
        }
        String substring = str.substring(J + 1, str.length());
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String q0(String str, String str2, String str3) {
        m.e(str, "<this>");
        m.e(str2, "delimiter");
        m.e(str3, "missingDelimiterValue");
        int K = K(str, str2, 0, false, 6, (Object) null);
        if (K == -1) {
            return str3;
        }
        String substring = str.substring(K + str2.length(), str.length());
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String r0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return p0(str, c10, str2);
    }

    public static /* synthetic */ String s0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return q0(str, str2, str3);
    }

    public static final boolean t(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        m.e(charSequence, "<this>");
        m.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (F(charSequence, (String) charSequence2, 0, z10, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (D(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static final String t0(String str, char c10, String str2) {
        m.e(str, "<this>");
        m.e(str2, "missingDelimiterValue");
        int E = E(str, c10, 0, false, 6, (Object) null);
        if (E == -1) {
            return str2;
        }
        String substring = str.substring(0, E);
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t(charSequence, charSequence2, z10);
    }

    public static final String u0(String str, String str2, String str3) {
        m.e(str, "<this>");
        m.e(str2, "delimiter");
        m.e(str3, "missingDelimiterValue");
        int F = F(str, str2, 0, false, 6, (Object) null);
        if (F == -1) {
            return str3;
        }
        String substring = str.substring(0, F);
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean v(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        m.e(charSequence, "<this>");
        m.e(charSequence2, "suffix");
        if (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return o.k((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return X(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ String v0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return t0(str, c10, str2);
    }

    public static /* synthetic */ boolean w(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String w0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return u0(str, str2, str3);
    }

    /* access modifiers changed from: private */
    public static final sd.n<Integer, String> x(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        T t10;
        T t11;
        if (z10 || collection.size() != 1) {
            ke.a cVar = !z11 ? new ke.c(i.a(i10, 0), charSequence.length()) : i.g(i.c(i10, z(charSequence)), 0);
            if (charSequence instanceof String) {
                int b10 = cVar.b();
                int e10 = cVar.e();
                int f10 = cVar.f();
                if ((f10 > 0 && b10 <= e10) || (f10 < 0 && e10 <= b10)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t11 = null;
                                break;
                            }
                            t11 = it.next();
                            String str = (String) t11;
                            if (o.n(str, 0, (String) charSequence, b10, str.length(), z10)) {
                                break;
                            }
                        }
                        String str2 = (String) t11;
                        if (str2 == null) {
                            if (b10 == e10) {
                                break;
                            }
                            b10 += f10;
                        } else {
                            return s.a(Integer.valueOf(b10), str2);
                        }
                    }
                }
            } else {
                int b11 = cVar.b();
                int e11 = cVar.e();
                int f11 = cVar.f();
                if ((f11 > 0 && b11 <= e11) || (f11 < 0 && e11 <= b11)) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t10 = null;
                                break;
                            }
                            t10 = it2.next();
                            String str3 = (String) t10;
                            if (X(str3, 0, charSequence, b11, str3.length(), z10)) {
                                break;
                            }
                        }
                        String str4 = (String) t10;
                        if (str4 == null) {
                            if (b11 == e11) {
                                break;
                            }
                            b11 += f11;
                        } else {
                            return s.a(Integer.valueOf(b11), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) y.E(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i11 = i10;
        int F = !z11 ? F(charSequence2, str6, i11, false, 4, (Object) null) : K(charSequence2, str6, i11, false, 4, (Object) null);
        if (F < 0) {
            return null;
        }
        return s.a(Integer.valueOf(F), str5);
    }

    public static final String x0(String str, String str2, String str3) {
        m.e(str, "<this>");
        m.e(str2, "delimiter");
        m.e(str3, "missingDelimiterValue");
        int K = K(str, str2, 0, false, 6, (Object) null);
        if (K == -1) {
            return str3;
        }
        String substring = str.substring(0, K);
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final ke.c y(CharSequence charSequence) {
        m.e(charSequence, "<this>");
        return new ke.c(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String y0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return x0(str, str2, str3);
    }

    public static final int z(CharSequence charSequence) {
        m.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static CharSequence z0(CharSequence charSequence) {
        m.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean c10 = a.c(charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
