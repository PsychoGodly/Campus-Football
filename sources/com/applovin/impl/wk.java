package com.applovin.impl;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class wk {

    /* renamed from: a  reason: collision with root package name */
    public final String f13076a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13077b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f13078c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13079d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13080e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13081f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13082g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13083h;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13084a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13085b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13086c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13087d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13088e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13089f;

        /* renamed from: g  reason: collision with root package name */
        public final int f13090g;

        /* renamed from: h  reason: collision with root package name */
        public final int f13091h;

        /* renamed from: i  reason: collision with root package name */
        public final int f13092i;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f13084a = i10;
            this.f13085b = i11;
            this.f13086c = i12;
            this.f13087d = i13;
            this.f13088e = i14;
            this.f13089f = i15;
            this.f13090g = i16;
            this.f13091h = i17;
            this.f13092i = i18;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.applovin.impl.wk.a a(java.lang.String r14) {
            /*
                r0 = 7
                java.lang.String r14 = r14.substring(r0)
                java.lang.String r1 = ","
                java.lang.String[] r14 = android.text.TextUtils.split(r14, r1)
                r1 = 0
                r2 = -1
                r3 = 0
                r5 = -1
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
            L_0x0016:
                int r4 = r14.length
                if (r3 >= r4) goto L_0x009e
                r4 = r14[r3]
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r4)
                r4.hashCode()
                int r13 = r4.hashCode()
                switch(r13) {
                    case -1178781136: goto L_0x007d;
                    case -1026963764: goto L_0x0072;
                    case -192095652: goto L_0x0067;
                    case -70925746: goto L_0x005c;
                    case 3029637: goto L_0x0051;
                    case 3373707: goto L_0x0046;
                    case 366554320: goto L_0x003b;
                    case 1767875043: goto L_0x0030;
                    default: goto L_0x002d;
                }
            L_0x002d:
                r4 = -1
                goto L_0x0087
            L_0x0030:
                java.lang.String r13 = "alignment"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0039
                goto L_0x002d
            L_0x0039:
                r4 = 7
                goto L_0x0087
            L_0x003b:
                java.lang.String r13 = "fontsize"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0044
                goto L_0x002d
            L_0x0044:
                r4 = 6
                goto L_0x0087
            L_0x0046:
                java.lang.String r13 = "name"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x004f
                goto L_0x002d
            L_0x004f:
                r4 = 5
                goto L_0x0087
            L_0x0051:
                java.lang.String r13 = "bold"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x005a
                goto L_0x002d
            L_0x005a:
                r4 = 4
                goto L_0x0087
            L_0x005c:
                java.lang.String r13 = "primarycolour"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0065
                goto L_0x002d
            L_0x0065:
                r4 = 3
                goto L_0x0087
            L_0x0067:
                java.lang.String r13 = "strikeout"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0070
                goto L_0x002d
            L_0x0070:
                r4 = 2
                goto L_0x0087
            L_0x0072:
                java.lang.String r13 = "underline"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x007b
                goto L_0x002d
            L_0x007b:
                r4 = 1
                goto L_0x0087
            L_0x007d:
                java.lang.String r13 = "italic"
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0086
                goto L_0x002d
            L_0x0086:
                r4 = 0
            L_0x0087:
                switch(r4) {
                    case 0: goto L_0x0099;
                    case 1: goto L_0x0097;
                    case 2: goto L_0x0095;
                    case 3: goto L_0x0093;
                    case 4: goto L_0x0091;
                    case 5: goto L_0x008f;
                    case 6: goto L_0x008d;
                    case 7: goto L_0x008b;
                    default: goto L_0x008a;
                }
            L_0x008a:
                goto L_0x009a
            L_0x008b:
                r6 = r3
                goto L_0x009a
            L_0x008d:
                r8 = r3
                goto L_0x009a
            L_0x008f:
                r5 = r3
                goto L_0x009a
            L_0x0091:
                r9 = r3
                goto L_0x009a
            L_0x0093:
                r7 = r3
                goto L_0x009a
            L_0x0095:
                r12 = r3
                goto L_0x009a
            L_0x0097:
                r11 = r3
                goto L_0x009a
            L_0x0099:
                r10 = r3
            L_0x009a:
                int r3 = r3 + 1
                goto L_0x0016
            L_0x009e:
                if (r5 == r2) goto L_0x00a8
                com.applovin.impl.wk$a r0 = new com.applovin.impl.wk$a
                int r13 = r14.length
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x00a9
            L_0x00a8:
                r0 = 0
            L_0x00a9:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.wk.a.a(java.lang.String):com.applovin.impl.wk$a");
        }
    }

    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f13093c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f13094d = Pattern.compile(yp.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f13095e = Pattern.compile(yp.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f13096f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f13097a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f13098b;

        private b(int i10, PointF pointF) {
            this.f13097a = i10;
            this.f13098b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f13096f.matcher(str);
            if (matcher.find()) {
                return wk.b((String) a1.a((Object) matcher.group(1)));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.applovin.impl.wk.b b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f13093c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x002b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = com.applovin.impl.a1.a((java.lang.Object) r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = a(r3)     // Catch:{ RuntimeException -> 0x0029 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                goto L_0x0009
            L_0x002b:
                com.applovin.impl.wk$b r5 = new com.applovin.impl.wk$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.wk.b.b(java.lang.String):com.applovin.impl.wk$b");
        }

        private static PointF c(String str) {
            String str2;
            String str3;
            Matcher matcher = f13094d.matcher(str);
            Matcher matcher2 = f13095e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    kc.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) a1.a((Object) str2)).trim()), Float.parseFloat(((String) a1.a((Object) str3)).trim()));
        }

        public static String d(String str) {
            return f13093c.matcher(str).replaceAll(MaxReward.DEFAULT_LABEL);
        }
    }

    private wk(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f13076a = str;
        this.f13077b = i10;
        this.f13078c = num;
        this.f13079d = f10;
        this.f13080e = z10;
        this.f13081f = z11;
        this.f13082g = z12;
        this.f13083h = z13;
    }

    private static boolean a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public static int b(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (a(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        kc.d("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean c(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            kc.c("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer d(String str) {
        long j10;
        try {
            if (str.startsWith("&H")) {
                j10 = Long.parseLong(str.substring(2), 16);
            } else {
                j10 = Long.parseLong(str);
            }
            a1.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(pb.a(((j10 >> 24) & 255) ^ 255), pb.a(j10 & 255), pb.a((j10 >> 8) & 255), pb.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            kc.c("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float e(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            kc.c("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }

    public static wk a(String str, a aVar) {
        a1.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f13092i;
        if (length != i10) {
            kc.d("SsaStyle", yp.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f13084a].trim();
            int i11 = aVar.f13085b;
            int b10 = i11 != -1 ? b(split[i11].trim()) : -1;
            int i12 = aVar.f13086c;
            Integer d10 = i12 != -1 ? d(split[i12].trim()) : null;
            int i13 = aVar.f13087d;
            float e10 = i13 != -1 ? e(split[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f13088e;
            boolean z10 = i14 != -1 && c(split[i14].trim());
            int i15 = aVar.f13089f;
            boolean z11 = i15 != -1 && c(split[i15].trim());
            int i16 = aVar.f13090g;
            boolean z12 = i16 != -1 && c(split[i16].trim());
            int i17 = aVar.f13091h;
            return new wk(trim, b10, d10, e10, z10, z11, z12, i17 != -1 && c(split[i17].trim()));
        } catch (RuntimeException e11) {
            kc.c("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e11);
            return null;
        }
    }
}
