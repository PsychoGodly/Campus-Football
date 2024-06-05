package ne;

import kotlin.jvm.internal.m;

/* compiled from: StringsJVM.kt */
class o extends n {
    public static final boolean j(String str, String str2, boolean z10) {
        m.e(str, "<this>");
        m.e(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return n(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j(str, str2, z10);
    }

    public static boolean l(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        if (!z10) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            ke.c r0 = ne.p.y(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            td.e0 r3 = (td.e0) r3
            int r3 = r3.a()
            char r3 = r4.charAt(r3)
            boolean r3 = ne.a.c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.o.m(java.lang.CharSequence):boolean");
    }

    public static final boolean n(String str, int i10, String str2, int i11, int i12, boolean z10) {
        m.e(str, "<this>");
        m.e(str2, "other");
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final String o(String str, String str2, String str3, boolean z10) {
        m.e(str, "<this>");
        m.e(str2, "oldValue");
        m.e(str3, "newValue");
        int i10 = 0;
        int B = p.B(str, str2, 0, z10);
        if (B < 0) {
            return str;
        }
        int length = str2.length();
        int a10 = i.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append(str, i10, B);
                sb2.append(str3);
                i10 = B + length;
                if (B >= str.length() || (B = p.B(str, str2, B + a10, z10)) <= 0) {
                    sb2.append(str, i10, str.length());
                    String sb3 = sb2.toString();
                    m.d(sb3, "stringBuilder.append(this, i, length).toString()");
                }
                sb2.append(str, i10, B);
                sb2.append(str3);
                i10 = B + length;
                break;
            } while ((B = p.B(str, str2, B + a10, z10)) <= 0);
            sb2.append(str, i10, str.length());
            String sb32 = sb2.toString();
            m.d(sb32, "stringBuilder.append(this, i, length).toString()");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String p(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return o(str, str2, str3, z10);
    }

    public static final boolean q(String str, String str2, boolean z10) {
        m.e(str, "<this>");
        m.e(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return n(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean r(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return q(str, str2, z10);
    }
}
