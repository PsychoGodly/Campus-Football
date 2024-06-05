package bf;

import cf.c;
import com.facebook.ads.AdError;
import ff.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Cookie */
public final class k {

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f31787j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f31788k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    private static final Pattern f31789l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    private static final Pattern f31790m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    private final String f31791a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31792b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31793c;

    /* renamed from: d  reason: collision with root package name */
    private final String f31794d;

    /* renamed from: e  reason: collision with root package name */
    private final String f31795e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f31796f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f31797g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f31798h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f31799i;

    private k(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f31791a = str;
        this.f31792b = str2;
        this.f31793c = j10;
        this.f31794d = str3;
        this.f31795e = str4;
        this.f31796f = z10;
        this.f31797g = z11;
        this.f31799i = z12;
        this.f31798h = z13;
    }

    private static int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || c.J(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static bf.k d(long r23, bf.r r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = cf.c.n(r0, r2, r1, r3)
            r5 = 61
            int r6 = cf.c.n(r0, r2, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = cf.c.I(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0135
            int r8 = cf.c.x(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0135
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = cf.c.I(r0, r6, r4)
            int r11 = cf.c.x(r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r14 = r8
            r19 = r10
            r21 = r12
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
        L_0x004c:
            if (r4 >= r1) goto L_0x00ba
            int r7 = cf.c.n(r0, r4, r1, r3)
            int r3 = cf.c.n(r0, r4, r7, r5)
            java.lang.String r4 = cf.c.I(r0, r4, r3)
            if (r3 >= r7) goto L_0x0063
            int r3 = r3 + 1
            java.lang.String r3 = cf.c.I(r0, r3, r7)
            goto L_0x0065
        L_0x0063:
            java.lang.String r3 = ""
        L_0x0065:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            long r21 = h(r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            goto L_0x0082
        L_0x0076:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            long r19 = i(r3)     // Catch:{  }
        L_0x0082:
            r18 = 1
            goto L_0x00b2
        L_0x0085:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r14 = g(r3)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r17 = 0
            goto L_0x00b2
        L_0x0094:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x009e
            r8 = r3
            goto L_0x00b2
        L_0x009e:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00a8
            r15 = 1
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00b2
            r16 = 1
        L_0x00b2:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L_0x004c
        L_0x00ba:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            r11 = r0
            goto L_0x00e7
        L_0x00c2:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00d4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00d9
        L_0x00d4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d9:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c0
        L_0x00e3:
            r11 = r12
            goto L_0x00e7
        L_0x00e5:
            r11 = r21
        L_0x00e7:
            java.lang.String r0 = r25.l()
            if (r14 != 0) goto L_0x00f0
            r13 = r0
            r1 = 0
            goto L_0x00fa
        L_0x00f0:
            boolean r1 = b(r0, r14)
            if (r1 != 0) goto L_0x00f8
            r1 = 0
            return r1
        L_0x00f8:
            r1 = 0
            r13 = r14
        L_0x00fa:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L_0x010f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.c()
            java.lang.String r0 = r0.d(r13)
            if (r0 != 0) goto L_0x010f
            return r1
        L_0x010f:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x011c
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r14 = r8
            goto L_0x012d
        L_0x011c:
            java.lang.String r1 = r25.g()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L_0x012c
            java.lang.String r0 = r1.substring(r2, r3)
        L_0x012c:
            r14 = r0
        L_0x012d:
            bf.k r0 = new bf.k
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0135:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.k.d(long, bf.r, java.lang.String):bf.k");
    }

    public static k e(r rVar, String str) {
        return d(System.currentTimeMillis(), rVar, str);
    }

    public static List<k> f(r rVar, q qVar) {
        List<String> j10 = qVar.j("Set-Cookie");
        int size = j10.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            k e10 = e(rVar, j10.get(i10));
            if (e10 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e10);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private static String g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String d10 = c.d(str);
            if (d10 != null) {
                return d10;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static long h(String str, int i10, int i11) {
        int a10 = a(str, i10, i11, false);
        Matcher matcher = f31790m.matcher(str);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (a10 < i11) {
            int a11 = a(str, a10 + 1, i11, true);
            matcher.region(a10, a11);
            if (i13 == -1 && matcher.usePattern(f31790m).matches()) {
                i13 = Integer.parseInt(matcher.group(1));
                i16 = Integer.parseInt(matcher.group(2));
                i17 = Integer.parseInt(matcher.group(3));
            } else if (i14 != -1 || !matcher.usePattern(f31789l).matches()) {
                if (i15 == -1) {
                    Pattern pattern = f31788k;
                    if (matcher.usePattern(pattern).matches()) {
                        i15 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i12 == -1 && matcher.usePattern(f31787j).matches()) {
                    i12 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i14 = Integer.parseInt(matcher.group(1));
            }
            a10 = a(str, a11 + 1, i11, false);
        }
        if (i12 >= 70 && i12 <= 99) {
            i12 += 1900;
        }
        if (i12 >= 0 && i12 <= 69) {
            i12 += AdError.SERVER_ERROR_CODE;
        }
        if (i12 < 1601) {
            throw new IllegalArgumentException();
        } else if (i15 == -1) {
            throw new IllegalArgumentException();
        } else if (i14 < 1 || i14 > 31) {
            throw new IllegalArgumentException();
        } else if (i13 < 0 || i13 > 23) {
            throw new IllegalArgumentException();
        } else if (i16 < 0 || i16 > 59) {
            throw new IllegalArgumentException();
        } else if (i17 < 0 || i17 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f31998p);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, i15 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i16);
            gregorianCalendar.set(13, i17);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    private static long i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e10) {
            if (!str.matches("-?\\d+")) {
                throw e10;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public String c() {
        return this.f31791a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f31791a.equals(this.f31791a) && kVar.f31792b.equals(this.f31792b) && kVar.f31794d.equals(this.f31794d) && kVar.f31795e.equals(this.f31795e) && kVar.f31793c == this.f31793c && kVar.f31796f == this.f31796f && kVar.f31797g == this.f31797g && kVar.f31798h == this.f31798h && kVar.f31799i == this.f31799i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f31793c;
        return ((((((((((((((((527 + this.f31791a.hashCode()) * 31) + this.f31792b.hashCode()) * 31) + this.f31794d.hashCode()) * 31) + this.f31795e.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f31796f ^ true ? 1 : 0)) * 31) + (this.f31797g ^ true ? 1 : 0)) * 31) + (this.f31798h ^ true ? 1 : 0)) * 31) + (this.f31799i ^ true ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public String j(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31791a);
        sb2.append('=');
        sb2.append(this.f31792b);
        if (this.f31798h) {
            if (this.f31793c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(d.a(new Date(this.f31793c)));
            }
        }
        if (!this.f31799i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f31794d);
        }
        sb2.append("; path=");
        sb2.append(this.f31795e);
        if (this.f31796f) {
            sb2.append("; secure");
        }
        if (this.f31797g) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    public String k() {
        return this.f31792b;
    }

    public String toString() {
        return j(false);
    }
}
