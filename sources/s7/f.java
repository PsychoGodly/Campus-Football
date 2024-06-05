package s7;

/* compiled from: IntMath */
public final class f {

    /* compiled from: IntMath */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30301a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                java.math.RoundingMode[] r0 = java.math.RoundingMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30301a = r0
                java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30301a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.math.RoundingMode r1 = java.math.RoundingMode.DOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30301a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.math.RoundingMode r1 = java.math.RoundingMode.UP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30301a     // Catch:{ NoSuchFieldError -> 0x0033 }
                java.math.RoundingMode r1 = java.math.RoundingMode.CEILING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30301a     // Catch:{ NoSuchFieldError -> 0x003e }
                java.math.RoundingMode r1 = java.math.RoundingMode.FLOOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30301a     // Catch:{ NoSuchFieldError -> 0x0049 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_EVEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30301a     // Catch:{ NoSuchFieldError -> 0x0054 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_DOWN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30301a     // Catch:{ NoSuchFieldError -> 0x0060 }
                java.math.RoundingMode r1 = java.math.RoundingMode.HALF_UP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s7.f.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (((r7 == java.math.RoundingMode.HALF_EVEN) & ((r0 & 1) != 0)) != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r1 > 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r5 < 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r5 > 0) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r5, int r6, java.math.RoundingMode r7) {
        /*
            if (r6 == 0) goto L_0x0052
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r5 = r5 ^ r6
            int r5 = r5 >> 31
            r2 = 1
            r5 = r5 | r2
            int[] r3 = s7.f.a.f30301a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 0
            switch(r3) {
                case 1: goto L_0x004d;
                case 2: goto L_0x004d;
                case 3: goto L_0x004e;
                case 4: goto L_0x004a;
                case 5: goto L_0x0047;
                case 6: goto L_0x0022;
                case 7: goto L_0x0022;
                case 8: goto L_0x0022;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L_0x0022:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L_0x0044
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L_0x004e
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L_0x0038
            r6 = 1
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r7 = r0 & 1
            if (r7 == 0) goto L_0x003f
            r7 = 1
            goto L_0x0040
        L_0x003f:
            r7 = 0
        L_0x0040:
            r6 = r6 & r7
            if (r6 == 0) goto L_0x004d
            goto L_0x004e
        L_0x0044:
            if (r1 <= 0) goto L_0x004d
            goto L_0x004e
        L_0x0047:
            if (r5 >= 0) goto L_0x004d
            goto L_0x004e
        L_0x004a:
            if (r5 <= 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = 0
        L_0x004e:
            if (r2 == 0) goto L_0x0051
            int r0 = r0 + r5
        L_0x0051:
            return r0
        L_0x0052:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.f.a(int, int, java.math.RoundingMode):int");
    }
}
