package bf;

import cf.c;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: HttpUrl */
public final class r {

    /* renamed from: j  reason: collision with root package name */
    private static final char[] f31817j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    final String f31818a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31819b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31820c;

    /* renamed from: d  reason: collision with root package name */
    final String f31821d;

    /* renamed from: e  reason: collision with root package name */
    final int f31822e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f31823f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f31824g;

    /* renamed from: h  reason: collision with root package name */
    private final String f31825h;

    /* renamed from: i  reason: collision with root package name */
    private final String f31826i;

    /* compiled from: HttpUrl */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f31827a;

        /* renamed from: b  reason: collision with root package name */
        String f31828b = MaxReward.DEFAULT_LABEL;

        /* renamed from: c  reason: collision with root package name */
        String f31829c = MaxReward.DEFAULT_LABEL;

        /* renamed from: d  reason: collision with root package name */
        String f31830d;

        /* renamed from: e  reason: collision with root package name */
        int f31831e = -1;

        /* renamed from: f  reason: collision with root package name */
        final List<String> f31832f;

        /* renamed from: g  reason: collision with root package name */
        List<String> f31833g;

        /* renamed from: h  reason: collision with root package name */
        String f31834h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f31832f = arrayList;
            arrayList.add(MaxReward.DEFAULT_LABEL);
        }

        private static String b(String str, int i10, int i11) {
            return c.d(r.r(str, i10, i11, false));
        }

        private boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int i(String str, int i10, int i11) {
            try {
                int parseInt = Integer.parseInt(r.a(str, i10, i11, MaxReward.DEFAULT_LABEL, false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private void k() {
            List<String> list = this.f31832f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f31832f.isEmpty()) {
                this.f31832f.add(MaxReward.DEFAULT_LABEL);
                return;
            }
            List<String> list2 = this.f31832f;
            list2.set(list2.size() - 1, MaxReward.DEFAULT_LABEL);
        }

        private static int m(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) == ']');
                }
                i10++;
            }
            return i11;
        }

        private void n(String str, int i10, int i11, boolean z10, boolean z11) {
            String a10 = r.a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, (Charset) null);
            if (!f(a10)) {
                if (g(a10)) {
                    k();
                    return;
                }
                List<String> list = this.f31832f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f31832f;
                    list2.set(list2.size() - 1, a10);
                } else {
                    this.f31832f.add(a10);
                }
                if (z10) {
                    this.f31832f.add(MaxReward.DEFAULT_LABEL);
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private void p(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f31832f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f31832f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f31832f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = cf.c.o(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.n(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.r.a.p(java.lang.String, int, int):void");
        }

        private static int r(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i10;
                        }
                    }
                }
            }
            return -1;
        }

        private static int s(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public r a() {
            if (this.f31827a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f31830d != null) {
                return new r(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        public int c() {
            int i10 = this.f31831e;
            return i10 != -1 ? i10 : r.d(this.f31827a);
        }

        public a d(String str) {
            this.f31833g = str != null ? r.y(r.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a e(String str) {
            Objects.requireNonNull(str, "host == null");
            String b10 = b(str, 0, str.length());
            if (b10 != null) {
                this.f31830d = b10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* access modifiers changed from: package-private */
        public a h(r rVar, String str) {
            int o10;
            int i10;
            r rVar2 = rVar;
            String str2 = str;
            int E = c.E(str2, 0, str.length());
            int F = c.F(str2, E, str.length());
            int r10 = r(str2, E, F);
            if (r10 != -1) {
                if (str.regionMatches(true, E, "https:", 0, 6)) {
                    this.f31827a = HttpRequest.DEFAULT_SCHEME;
                    E += 6;
                } else if (str.regionMatches(true, E, "http:", 0, 5)) {
                    this.f31827a = "http";
                    E += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, r10) + "'");
                }
            } else if (rVar2 != null) {
                this.f31827a = rVar2.f31818a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int s10 = s(str2, E, F);
            char c10 = '?';
            char c11 = '#';
            if (s10 >= 2 || rVar2 == null || !rVar2.f31818a.equals(this.f31827a)) {
                int i11 = E + s10;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    o10 = c.o(str2, i11, F, "@/\\?#");
                    char charAt = o10 != F ? str2.charAt(o10) : 65535;
                    if (charAt == 65535 || charAt == c11 || charAt == '/' || charAt == '\\' || charAt == c10) {
                        int i12 = o10;
                        int m10 = m(str2, i11, i12);
                        int i13 = m10 + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z10) {
                                int n10 = c.n(str2, i11, o10, ':');
                                int i14 = n10;
                                String str3 = "%40";
                                i10 = o10;
                                String a10 = r.a(str, i11, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z11) {
                                    a10 = this.f31828b + str3 + a10;
                                }
                                this.f31828b = a10;
                                if (i14 != i10) {
                                    this.f31829c = r.a(str, i14 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z10 = true;
                                }
                                z11 = true;
                            } else {
                                i10 = o10;
                                this.f31829c += "%40" + r.a(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i11 = i10 + 1;
                        }
                        c10 = '?';
                        c11 = '#';
                    }
                }
                int i122 = o10;
                int m102 = m(str2, i11, i122);
                int i132 = m102 + 1;
                if (i132 < i122) {
                    this.f31830d = b(str2, i11, m102);
                    int i15 = i(str2, i132, i122);
                    this.f31831e = i15;
                    if (i15 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i132, i122) + '\"');
                    }
                } else {
                    this.f31830d = b(str2, i11, m102);
                    this.f31831e = r.d(this.f31827a);
                }
                if (this.f31830d != null) {
                    E = i122;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i11, m102) + '\"');
                }
            } else {
                this.f31828b = rVar.j();
                this.f31829c = rVar.f();
                this.f31830d = rVar2.f31821d;
                this.f31831e = rVar2.f31822e;
                this.f31832f.clear();
                this.f31832f.addAll(rVar.h());
                if (E == F || str2.charAt(E) == '#') {
                    d(rVar.i());
                }
            }
            int o11 = c.o(str2, E, F, "?#");
            p(str2, E, o11);
            if (o11 < F && str2.charAt(o11) == '?') {
                int n11 = c.n(str2, o11, F, '#');
                this.f31833g = r.y(r.a(str, o11 + 1, n11, " \"'<>#", true, false, true, true, (Charset) null));
                o11 = n11;
            }
            if (o11 < F && str2.charAt(o11) == '#') {
                this.f31834h = r.a(str, 1 + o11, F, MaxReward.DEFAULT_LABEL, true, false, false, false, (Charset) null);
            }
            return this;
        }

        public a j(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f31829c = r.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a l(int i10) {
            if (i10 <= 0 || i10 > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i10);
            }
            this.f31831e = i10;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a o() {
            int size = this.f31832f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f31832f.set(i10, r.b(this.f31832f.get(i10), "[]", true, true, false, true));
            }
            List<String> list = this.f31833g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f31833g.get(i11);
                    if (str != null) {
                        this.f31833g.set(i11, r.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f31834h;
            if (str2 != null) {
                this.f31834h = r.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a q(String str) {
            Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase("http")) {
                this.f31827a = "http";
            } else if (str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                this.f31827a = HttpRequest.DEFAULT_SCHEME;
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public a t(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f31828b = r.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f31827a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f31828b.isEmpty() || !this.f31829c.isEmpty()) {
                sb2.append(this.f31828b);
                if (!this.f31829c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f31829c);
                }
                sb2.append('@');
            }
            String str2 = this.f31830d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f31830d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f31830d);
                }
            }
            if (!(this.f31831e == -1 && this.f31827a == null)) {
                int c10 = c();
                String str3 = this.f31827a;
                if (str3 == null || c10 != r.d(str3)) {
                    sb2.append(':');
                    sb2.append(c10);
                }
            }
            r.q(sb2, this.f31832f);
            if (this.f31833g != null) {
                sb2.append('?');
                r.n(sb2, this.f31833g);
            }
            if (this.f31834h != null) {
                sb2.append('#');
                sb2.append(this.f31834h);
            }
            return sb2.toString();
        }
    }

    r(a aVar) {
        this.f31818a = aVar.f31827a;
        this.f31819b = s(aVar.f31828b, false);
        this.f31820c = s(aVar.f31829c, false);
        this.f31821d = aVar.f31830d;
        this.f31822e = aVar.c();
        this.f31823f = t(aVar.f31832f, false);
        List<String> list = aVar.f31833g;
        String str = null;
        this.f31824g = list != null ? t(list, true) : null;
        String str2 = aVar.f31834h;
        this.f31825h = str2 != null ? s(str2, false) : str;
        this.f31826i = aVar.toString();
    }

    static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        String str3 = str;
        int i12 = i11;
        int i13 = i10;
        while (i13 < i12) {
            int codePointAt = str.codePointAt(i13);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z13)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || v(str, i13, i11)))) && (codePointAt != 43 || !z12))) {
                    i13 += Character.charCount(codePointAt);
                }
            }
            lf.c cVar = new lf.c();
            int i14 = i10;
            cVar.e1(str, i10, i13);
            c(cVar, str, i13, i11, str2, z10, z11, z12, z13, charset);
            return cVar.l0();
        }
        int i15 = i10;
        return str.substring(i10, i11);
    }

    static String b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, (Charset) null);
    }

    static void c(lf.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        lf.c cVar2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z12) {
                    cVar.T(z10 ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z13) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z10 || (z11 && !v(str, i10, i11)))))) {
                    if (cVar2 == null) {
                        cVar2 = new lf.c();
                    }
                    if (charset == null || charset.equals(c.f31992j)) {
                        cVar2.f1(codePointAt);
                    } else {
                        cVar2.b1(str, i10, Character.charCount(codePointAt) + i10, charset);
                    }
                    while (!cVar2.F()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.G(37);
                        char[] cArr = f31817j;
                        cVar.G(cArr[(readByte >> 4) & 15]);
                        cVar.G(cArr[readByte & Ascii.SI]);
                    }
                } else {
                    cVar.f1(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static r k(String str) {
        return new a().h((r) null, str).a();
    }

    static void n(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    static void q(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    static String r(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                lf.c cVar = new lf.c();
                cVar.e1(str, i10, i12);
                u(cVar, str, i12, i11, z10);
                return cVar.l0();
            }
        }
        return str.substring(i10, i11);
    }

    static String s(String str, boolean z10) {
        return r(str, 0, str.length(), z10);
    }

    private List<String> t(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? s(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void u(lf.c cVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                int k10 = c.k(str.charAt(i10 + 1));
                int k11 = c.k(str.charAt(i12));
                if (!(k10 == -1 || k11 == -1)) {
                    cVar.G((k10 << 4) + k11);
                    i10 = i12;
                    i10 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z10) {
                cVar.G(32);
                i10 += Character.charCount(codePointAt);
            }
            cVar.f1(codePointAt);
            i10 += Character.charCount(codePointAt);
        }
    }

    static boolean v(String str, int i10, int i11) {
        int i12 = i10 + 2;
        if (i12 >= i11 || str.charAt(i10) != '%' || c.k(str.charAt(i10 + 1)) == -1 || c.k(str.charAt(i12)) == -1) {
            return false;
        }
        return true;
    }

    static List<String> y(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    public r A(String str) {
        a p10 = p(str);
        if (p10 != null) {
            return p10.a();
        }
        return null;
    }

    public String B() {
        return this.f31818a;
    }

    public URI C() {
        String aVar = o().o().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", MaxReward.DEFAULT_LABEL));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public String e() {
        if (this.f31825h == null) {
            return null;
        }
        return this.f31826i.substring(this.f31826i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && ((r) obj).f31826i.equals(this.f31826i);
    }

    public String f() {
        if (this.f31820c.isEmpty()) {
            return MaxReward.DEFAULT_LABEL;
        }
        int indexOf = this.f31826i.indexOf(64);
        return this.f31826i.substring(this.f31826i.indexOf(58, this.f31818a.length() + 3) + 1, indexOf);
    }

    public String g() {
        int indexOf = this.f31826i.indexOf(47, this.f31818a.length() + 3);
        String str = this.f31826i;
        return this.f31826i.substring(indexOf, c.o(str, indexOf, str.length(), "?#"));
    }

    public List<String> h() {
        int indexOf = this.f31826i.indexOf(47, this.f31818a.length() + 3);
        String str = this.f31826i;
        int o10 = c.o(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < o10) {
            int i10 = indexOf + 1;
            int n10 = c.n(this.f31826i, i10, o10, '/');
            arrayList.add(this.f31826i.substring(i10, n10));
            indexOf = n10;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f31826i.hashCode();
    }

    public String i() {
        if (this.f31824g == null) {
            return null;
        }
        int indexOf = this.f31826i.indexOf(63) + 1;
        String str = this.f31826i;
        return this.f31826i.substring(indexOf, c.n(str, indexOf, str.length(), '#'));
    }

    public String j() {
        if (this.f31819b.isEmpty()) {
            return MaxReward.DEFAULT_LABEL;
        }
        int length = this.f31818a.length() + 3;
        String str = this.f31826i;
        return this.f31826i.substring(length, c.o(str, length, str.length(), ":@"));
    }

    public String l() {
        return this.f31821d;
    }

    public boolean m() {
        return this.f31818a.equals(HttpRequest.DEFAULT_SCHEME);
    }

    public a o() {
        a aVar = new a();
        aVar.f31827a = this.f31818a;
        aVar.f31828b = j();
        aVar.f31829c = f();
        aVar.f31830d = this.f31821d;
        aVar.f31831e = this.f31822e != d(this.f31818a) ? this.f31822e : -1;
        aVar.f31832f.clear();
        aVar.f31832f.addAll(h());
        aVar.d(i());
        aVar.f31834h = e();
        return aVar;
    }

    public a p(String str) {
        try {
            return new a().h(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f31826i;
    }

    public int w() {
        return this.f31822e;
    }

    public String x() {
        if (this.f31824g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        n(sb2, this.f31824g);
        return sb2.toString();
    }

    public String z() {
        return p("/...").t(MaxReward.DEFAULT_LABEL).j(MaxReward.DEFAULT_LABEL).a().toString();
    }
}
