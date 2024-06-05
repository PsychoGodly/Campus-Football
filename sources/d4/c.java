package d4;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.n0;
import k4.r;
import v6.e;

/* compiled from: SsaStyle */
final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f17714a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17715b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f17716c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f17717d;

    /* renamed from: e  reason: collision with root package name */
    public final float f17718e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f17719f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f17720g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f17721h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f17722i;

    /* renamed from: j  reason: collision with root package name */
    public final int f17723j;

    /* compiled from: SsaStyle */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f17724a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17725b;

        /* renamed from: c  reason: collision with root package name */
        public final int f17726c;

        /* renamed from: d  reason: collision with root package name */
        public final int f17727d;

        /* renamed from: e  reason: collision with root package name */
        public final int f17728e;

        /* renamed from: f  reason: collision with root package name */
        public final int f17729f;

        /* renamed from: g  reason: collision with root package name */
        public final int f17730g;

        /* renamed from: h  reason: collision with root package name */
        public final int f17731h;

        /* renamed from: i  reason: collision with root package name */
        public final int f17732i;

        /* renamed from: j  reason: collision with root package name */
        public final int f17733j;

        /* renamed from: k  reason: collision with root package name */
        public final int f17734k;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f17724a = i10;
            this.f17725b = i11;
            this.f17726c = i12;
            this.f17727d = i13;
            this.f17728e = i14;
            this.f17729f = i15;
            this.f17730g = i16;
            this.f17731h = i17;
            this.f17732i = i18;
            this.f17733j = i19;
            this.f17734k = i20;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static d4.c.a a(java.lang.String r17) {
            /*
                r0 = 7
                r1 = r17
                java.lang.String r1 = r1.substring(r0)
                java.lang.String r2 = ","
                java.lang.String[] r1 = android.text.TextUtils.split(r1, r2)
                r2 = 0
                r3 = -1
                r4 = 0
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
                r13 = -1
                r14 = -1
                r15 = -1
            L_0x001a:
                int r5 = r1.length
                if (r4 >= r5) goto L_0x00c1
                r5 = r1[r4]
                java.lang.String r5 = r5.trim()
                java.lang.String r5 = r6.c.e(r5)
                r5.hashCode()
                int r16 = r5.hashCode()
                switch(r16) {
                    case -1178781136: goto L_0x009b;
                    case -1026963764: goto L_0x0090;
                    case -192095652: goto L_0x0085;
                    case -70925746: goto L_0x007a;
                    case 3029637: goto L_0x006f;
                    case 3373707: goto L_0x0064;
                    case 366554320: goto L_0x0059;
                    case 767321349: goto L_0x004e;
                    case 1767875043: goto L_0x0041;
                    case 1988365454: goto L_0x0034;
                    default: goto L_0x0031;
                }
            L_0x0031:
                r0 = -1
                goto L_0x00a5
            L_0x0034:
                java.lang.String r0 = "outlinecolour"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x003d
                goto L_0x0031
            L_0x003d:
                r0 = 9
                goto L_0x00a5
            L_0x0041:
                java.lang.String r0 = "alignment"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x004a
                goto L_0x0031
            L_0x004a:
                r0 = 8
                goto L_0x00a5
            L_0x004e:
                java.lang.String r0 = "borderstyle"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0057
                goto L_0x0031
            L_0x0057:
                r0 = 7
                goto L_0x00a5
            L_0x0059:
                java.lang.String r0 = "fontsize"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0062
                goto L_0x0031
            L_0x0062:
                r0 = 6
                goto L_0x00a5
            L_0x0064:
                java.lang.String r0 = "name"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x006d
                goto L_0x0031
            L_0x006d:
                r0 = 5
                goto L_0x00a5
            L_0x006f:
                java.lang.String r0 = "bold"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0078
                goto L_0x0031
            L_0x0078:
                r0 = 4
                goto L_0x00a5
            L_0x007a:
                java.lang.String r0 = "primarycolour"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0083
                goto L_0x0031
            L_0x0083:
                r0 = 3
                goto L_0x00a5
            L_0x0085:
                java.lang.String r0 = "strikeout"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x008e
                goto L_0x0031
            L_0x008e:
                r0 = 2
                goto L_0x00a5
            L_0x0090:
                java.lang.String r0 = "underline"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0099
                goto L_0x0031
            L_0x0099:
                r0 = 1
                goto L_0x00a5
            L_0x009b:
                java.lang.String r0 = "italic"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x00a4
                goto L_0x0031
            L_0x00a4:
                r0 = 0
            L_0x00a5:
                switch(r0) {
                    case 0: goto L_0x00bb;
                    case 1: goto L_0x00b9;
                    case 2: goto L_0x00b7;
                    case 3: goto L_0x00b5;
                    case 4: goto L_0x00b3;
                    case 5: goto L_0x00b1;
                    case 6: goto L_0x00af;
                    case 7: goto L_0x00ad;
                    case 8: goto L_0x00ab;
                    case 9: goto L_0x00a9;
                    default: goto L_0x00a8;
                }
            L_0x00a8:
                goto L_0x00bc
            L_0x00a9:
                r9 = r4
                goto L_0x00bc
            L_0x00ab:
                r7 = r4
                goto L_0x00bc
            L_0x00ad:
                r15 = r4
                goto L_0x00bc
            L_0x00af:
                r10 = r4
                goto L_0x00bc
            L_0x00b1:
                r6 = r4
                goto L_0x00bc
            L_0x00b3:
                r11 = r4
                goto L_0x00bc
            L_0x00b5:
                r8 = r4
                goto L_0x00bc
            L_0x00b7:
                r14 = r4
                goto L_0x00bc
            L_0x00b9:
                r13 = r4
                goto L_0x00bc
            L_0x00bb:
                r12 = r4
            L_0x00bc:
                int r4 = r4 + 1
                r0 = 7
                goto L_0x001a
            L_0x00c1:
                if (r6 == r3) goto L_0x00cd
                d4.c$a r0 = new d4.c$a
                int r1 = r1.length
                r5 = r0
                r16 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                goto L_0x00ce
            L_0x00cd:
                r0 = 0
            L_0x00ce:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d4.c.a.a(java.lang.String):d4.c$a");
        }
    }

    /* compiled from: SsaStyle */
    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f17735c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f17736d = Pattern.compile(n0.C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f17737e = Pattern.compile(n0.C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f17738f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f17739a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f17740b;

        private b(int i10, PointF pointF) {
            this.f17739a = i10;
            this.f17740b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f17738f.matcher(str);
            if (matcher.find()) {
                return c.e((String) k4.a.e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static d4.c.b b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f17735c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x002b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = k4.a.e(r3)
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
                d4.c$b r5 = new d4.c$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: d4.c.b.b(java.lang.String):d4.c$b");
        }

        private static PointF c(String str) {
            String str2;
            String str3;
            Matcher matcher = f17736d.matcher(str);
            Matcher matcher2 = f17737e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    r.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) k4.a.e(str2)).trim()), Float.parseFloat(((String) k4.a.e(str3)).trim()));
        }

        public static String d(String str) {
            return f17735c.matcher(str).replaceAll(MaxReward.DEFAULT_LABEL);
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f17714a = str;
        this.f17715b = i10;
        this.f17716c = num;
        this.f17717d = num2;
        this.f17718e = f10;
        this.f17719f = z10;
        this.f17720g = z11;
        this.f17721h = z12;
        this.f17722i = z13;
        this.f17723j = i11;
    }

    public static c b(String str, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        k4.a.a(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), ",");
        int length = split.length;
        int i10 = aVar2.f17734k;
        if (length != i10) {
            r.i("SsaStyle", n0.C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str2));
            return null;
        }
        try {
            String trim = split[aVar2.f17724a].trim();
            int i11 = aVar2.f17725b;
            int e10 = i11 != -1 ? e(split[i11].trim()) : -1;
            int i12 = aVar2.f17726c;
            Integer h10 = i12 != -1 ? h(split[i12].trim()) : null;
            int i13 = aVar2.f17727d;
            Integer h11 = i13 != -1 ? h(split[i13].trim()) : null;
            int i14 = aVar2.f17728e;
            float i15 = i14 != -1 ? i(split[i14].trim()) : -3.4028235E38f;
            int i16 = aVar2.f17729f;
            boolean z10 = i16 != -1 && f(split[i16].trim());
            int i17 = aVar2.f17730g;
            boolean z11 = i17 != -1 && f(split[i17].trim());
            int i18 = aVar2.f17731h;
            boolean z12 = i18 != -1 && f(split[i18].trim());
            int i19 = aVar2.f17732i;
            boolean z13 = i19 != -1 && f(split[i19].trim());
            int i20 = aVar2.f17733j;
            return new c(trim, e10, h10, h11, i15, z10, z11, z12, z13, i20 != -1 ? g(split[i20].trim()) : -1);
        } catch (RuntimeException e11) {
            r.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str2 + "'", e11);
            return null;
        }
    }

    private static boolean c(int i10) {
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

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* access modifiers changed from: private */
    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        r.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            r.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    private static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        r.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        long j10;
        try {
            if (str.startsWith("&H")) {
                j10 = Long.parseLong(str.substring(2), 16);
            } else {
                j10 = Long.parseLong(str);
            }
            k4.a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(e.d(((j10 >> 24) & 255) ^ 255), e.d(j10 & 255), e.d((j10 >> 8) & 255), e.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            r.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            r.j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
