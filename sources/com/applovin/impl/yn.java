package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.regex.Pattern;

final class yn {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f13654d = Pattern.compile("\\s+");

    /* renamed from: e  reason: collision with root package name */
    private static final eb f13655e = eb.a((Object) "auto", (Object) "none");

    /* renamed from: f  reason: collision with root package name */
    private static final eb f13656f = eb.a("dot", "sesame", "circle");

    /* renamed from: g  reason: collision with root package name */
    private static final eb f13657g = eb.a((Object) "filled", (Object) "open");

    /* renamed from: h  reason: collision with root package name */
    private static final eb f13658h = eb.a("after", "before", "outside");

    /* renamed from: a  reason: collision with root package name */
    public final int f13659a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13660b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13661c;

    private yn(int i10, int i11, int i12) {
        this.f13659a = i10;
        this.f13660b = i11;
        this.f13661c = i12;
    }

    public static yn a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a(eb.a((Object[]) TextUtils.split(lowerCase, f13654d)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.impl.yn a(com.applovin.impl.eb r9) {
        /*
            com.applovin.impl.eb r0 = f13658h
            com.applovin.impl.nj$c r0 = com.applovin.impl.nj.a((java.util.Set) r0, (java.util.Set) r9)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = com.applovin.impl.rb.a(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r2 == r7) goto L_0x0038
            r7 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r2 == r7) goto L_0x0030
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
            if (r0 == r6) goto L_0x0049
            r0 = 1
            goto L_0x004c
        L_0x0049:
            r0 = -2
            goto L_0x004c
        L_0x004b:
            r0 = 2
        L_0x004c:
            com.applovin.impl.eb r1 = f13655e
            com.applovin.impl.nj$c r1 = com.applovin.impl.nj.a((java.util.Set) r1, (java.util.Set) r9)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0086
            java.util.Iterator r9 = r1.iterator()
            java.lang.Object r9 = r9.next()
            java.lang.String r9 = (java.lang.String) r9
            int r1 = r9.hashCode()
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L_0x007b
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L_0x0071
            goto L_0x0080
        L_0x0071:
            java.lang.String r1 = "none"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0080
            r3 = 0
            goto L_0x0080
        L_0x007b:
            java.lang.String r1 = "auto"
            r9.equals(r1)
        L_0x0080:
            com.applovin.impl.yn r9 = new com.applovin.impl.yn
            r9.<init>(r3, r4, r0)
            return r9
        L_0x0086:
            com.applovin.impl.eb r1 = f13657g
            com.applovin.impl.nj$c r1 = com.applovin.impl.nj.a((java.util.Set) r1, (java.util.Set) r9)
            com.applovin.impl.eb r2 = f13656f
            com.applovin.impl.nj$c r9 = com.applovin.impl.nj.a((java.util.Set) r2, (java.util.Set) r9)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00a4
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00a4
            com.applovin.impl.yn r9 = new com.applovin.impl.yn
            r9.<init>(r3, r4, r0)
            return r9
        L_0x00a4:
            java.lang.String r2 = "filled"
            java.lang.Object r1 = com.applovin.impl.rb.a(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r7 = r1.hashCode()
            r8 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r7 == r8) goto L_0x00c5
            r2 = 3417674(0x34264a, float:4.789181E-39)
            if (r7 == r2) goto L_0x00bb
            goto L_0x00c8
        L_0x00bb:
            java.lang.String r2 = "open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00c8
            r1 = 2
            goto L_0x00c9
        L_0x00c5:
            r1.equals(r2)
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            java.lang.String r2 = "circle"
            java.lang.Object r9 = com.applovin.impl.rb.a(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            int r7 = r9.hashCode()
            r8 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r7 == r8) goto L_0x00f9
            r2 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r7 == r2) goto L_0x00ef
            r2 = 99657(0x18549, float:1.39649E-40)
            if (r7 == r2) goto L_0x00e5
            goto L_0x0100
        L_0x00e5:
            java.lang.String r2 = "dot"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0100
            r3 = 0
            goto L_0x0100
        L_0x00ef:
            java.lang.String r2 = "sesame"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0100
            r3 = 1
            goto L_0x0100
        L_0x00f9:
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0100
            r3 = 2
        L_0x0100:
            if (r3 == 0) goto L_0x0107
            if (r3 == r6) goto L_0x0106
            r5 = 1
            goto L_0x0107
        L_0x0106:
            r5 = 3
        L_0x0107:
            com.applovin.impl.yn r9 = new com.applovin.impl.yn
            r9.<init>(r5, r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.yn.a(com.applovin.impl.eb):com.applovin.impl.yn");
    }
}
