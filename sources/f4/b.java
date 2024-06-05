package f4;

import android.text.TextUtils;
import java.util.regex.Pattern;
import r6.c;
import s6.x;

/* compiled from: TextEmphasis */
final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f18000d = Pattern.compile("\\s+");

    /* renamed from: e  reason: collision with root package name */
    private static final x<String> f18001e = x.y("auto", "none");

    /* renamed from: f  reason: collision with root package name */
    private static final x<String> f18002f = x.z("dot", "sesame", "circle");

    /* renamed from: g  reason: collision with root package name */
    private static final x<String> f18003g = x.y("filled", "open");

    /* renamed from: h  reason: collision with root package name */
    private static final x<String> f18004h = x.z("after", "before", "outside");

    /* renamed from: a  reason: collision with root package name */
    public final int f18005a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18006b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18007c;

    private b(int i10, int i11, int i12) {
        this.f18005a = i10;
        this.f18006b = i11;
        this.f18007c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String e10 = c.e(str.trim());
        if (e10.isEmpty()) {
            return null;
        }
        return b(x.q(TextUtils.split(e10, f18000d)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r9.equals("auto") != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static f4.b b(s6.x<java.lang.String> r9) {
        /*
            s6.x<java.lang.String> r0 = f18004h
            s6.y0$e r0 = s6.y0.e(r0, r9)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = s6.b0.c(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            r4 = 2
            r5 = -1
            r6 = 0
            r7 = 1
            if (r2 == r3) goto L_0x0038
            r3 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r2 == r3) goto L_0x0030
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r1) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            java.lang.String r1 = "after"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0030:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "before"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x004b
            if (r0 == r7) goto L_0x0049
            r0 = 1
            goto L_0x004c
        L_0x0049:
            r0 = -2
            goto L_0x004c
        L_0x004b:
            r0 = 2
        L_0x004c:
            s6.x<java.lang.String> r1 = f18001e
            s6.y0$e r1 = s6.y0.e(r1, r9)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x008f
            java.util.Iterator r9 = r1.iterator()
            java.lang.Object r9 = r9.next()
            java.lang.String r9 = (java.lang.String) r9
            int r1 = r9.hashCode()
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L_0x007b
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L_0x0071
            goto L_0x0084
        L_0x0071:
            java.lang.String r1 = "none"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0084
            r7 = 0
            goto L_0x0085
        L_0x007b:
            java.lang.String r1 = "auto"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r7 = -1
        L_0x0085:
            if (r7 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r5 = 0
        L_0x0089:
            f4.b r9 = new f4.b
            r9.<init>(r5, r6, r0)
            return r9
        L_0x008f:
            s6.x<java.lang.String> r1 = f18003g
            s6.y0$e r1 = s6.y0.e(r1, r9)
            s6.x<java.lang.String> r2 = f18002f
            s6.y0$e r9 = s6.y0.e(r2, r9)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00ad
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00ad
            f4.b r9 = new f4.b
            r9.<init>(r5, r6, r0)
            return r9
        L_0x00ad:
            java.lang.String r2 = "filled"
            java.lang.Object r1 = s6.b0.c(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.hashCode()
            r8 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r3 == r8) goto L_0x00ce
            r2 = 3417674(0x34264a, float:4.789181E-39)
            if (r3 == r2) goto L_0x00c4
            goto L_0x00d6
        L_0x00c4:
            java.lang.String r2 = "open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d6
            r1 = 0
            goto L_0x00d7
        L_0x00ce:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d6
            r1 = 1
            goto L_0x00d7
        L_0x00d6:
            r1 = -1
        L_0x00d7:
            if (r1 == 0) goto L_0x00db
            r1 = 1
            goto L_0x00dc
        L_0x00db:
            r1 = 2
        L_0x00dc:
            java.lang.String r2 = "circle"
            java.lang.Object r9 = s6.b0.c(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            int r3 = r9.hashCode()
            r8 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r3 == r8) goto L_0x010c
            r2 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r3 == r2) goto L_0x0102
            r2 = 99657(0x18549, float:1.39649E-40)
            if (r3 == r2) goto L_0x00f8
            goto L_0x0113
        L_0x00f8:
            java.lang.String r2 = "dot"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = 0
            goto L_0x0113
        L_0x0102:
            java.lang.String r2 = "sesame"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = 1
            goto L_0x0113
        L_0x010c:
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0113
            r5 = 2
        L_0x0113:
            if (r5 == 0) goto L_0x011a
            if (r5 == r7) goto L_0x0119
            r4 = 1
            goto L_0x011a
        L_0x0119:
            r4 = 3
        L_0x011a:
            f4.b r9 = new f4.b
            r9.<init>(r4, r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.b.b(s6.x):f4.b");
    }
}
