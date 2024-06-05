package w;

import v.d;
import v.e;
import v.h;
import w.f;
import w.p;

/* compiled from: HorizontalWidgetRun */
public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f23457k = new int[2];

    /* compiled from: HorizontalWidgetRun */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23458a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w.p$b[] r0 = w.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23458a = r0
                w.p$b r1 = w.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23458a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.p$b r1 = w.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23458a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.p$b r1 = w.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f23492h.f23436e = f.a.LEFT;
        this.f23493i.f23436e = f.a.RIGHT;
        this.f23490f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02bc, code lost:
        if (r14 != 1) goto L_0x0324;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(w.d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = w.l.a.f23458a
            w.p$b r1 = r8.f23494j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            v.e r0 = r8.f23486b
            v.d r1 = r0.O
            v.d r0 = r0.Q
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            w.g r0 = r8.f23489e
            boolean r0 = r0.f23441j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x0324
            v.e$b r0 = r8.f23488d
            v.e$b r3 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x0324
            v.e r0 = r8.f23486b
            int r3 = r0.f23113w
            if (r3 == r1) goto L_0x0306
            if (r3 == r2) goto L_0x0046
            goto L_0x0324
        L_0x0046:
            int r1 = r0.f23115x
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.u()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            v.e r0 = r8.f23486b
            w.n r1 = r0.f23079f
            w.g r1 = r1.f23489e
            int r1 = r1.f23438g
            float r1 = (float) r1
            float r0 = r0.t()
            goto L_0x0084
        L_0x0068:
            v.e r0 = r8.f23486b
            w.n r1 = r0.f23079f
            w.g r1 = r1.f23489e
            int r1 = r1.f23438g
            float r1 = (float) r1
            float r0 = r0.t()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            v.e r0 = r8.f23486b
            w.n r1 = r0.f23079f
            w.g r1 = r1.f23489e
            int r1 = r1.f23438g
            float r1 = (float) r1
            float r0 = r0.t()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            w.g r1 = r8.f23489e
            r1.d(r0)
            goto L_0x0324
        L_0x008f:
            w.n r1 = r0.f23079f
            w.f r12 = r1.f23492h
            w.f r13 = r1.f23493i
            v.d r1 = r0.O
            v.d r1 = r1.f23054f
            if (r1 == 0) goto L_0x009d
            r1 = 1
            goto L_0x009e
        L_0x009d:
            r1 = 0
        L_0x009e:
            v.d r2 = r0.P
            v.d r2 = r2.f23054f
            if (r2 == 0) goto L_0x00a6
            r2 = 1
            goto L_0x00a7
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            v.d r4 = r0.Q
            v.d r4 = r4.f23054f
            if (r4 == 0) goto L_0x00af
            r4 = 1
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            v.d r5 = r0.R
            v.d r5 = r5.f23054f
            if (r5 == 0) goto L_0x00b8
            r5 = 1
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            int r14 = r0.u()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            v.e r0 = r8.f23486b
            float r15 = r0.t()
            boolean r0 = r12.f23441j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f23441j
            if (r0 == 0) goto L_0x012e
            w.f r0 = r8.f23492h
            boolean r1 = r0.f23434c
            if (r1 == 0) goto L_0x012d
            w.f r1 = r8.f23493i
            boolean r1 = r1.f23434c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List<w.f> r0 = r0.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f23438g
            w.f r1 = r8.f23492h
            int r1 = r1.f23437f
            int r2 = r0 + r1
            w.f r0 = r8.f23493i
            java.util.List<w.f> r0 = r0.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f23438g
            w.f r1 = r8.f23493i
            int r1 = r1.f23437f
            int r3 = r0 - r1
            int r0 = r12.f23438g
            int r1 = r12.f23437f
            int r4 = r0 + r1
            int r0 = r13.f23438g
            int r1 = r13.f23437f
            int r5 = r0 - r1
            int[] r1 = f23457k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f23489e
            int[] r1 = f23457k
            r1 = r1[r10]
            r0.d(r1)
            v.e r0 = r8.f23486b
            w.n r0 = r0.f23079f
            w.g r0 = r0.f23489e
            int[] r1 = f23457k
            r1 = r1[r9]
            r0.d(r1)
        L_0x012d:
            return
        L_0x012e:
            w.f r0 = r8.f23492h
            boolean r1 = r0.f23441j
            if (r1 == 0) goto L_0x018b
            w.f r1 = r8.f23493i
            boolean r2 = r1.f23441j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f23434c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f23434c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f23438g
            int r0 = r0.f23437f
            int r2 = r2 + r0
            int r0 = r1.f23438g
            int r1 = r1.f23437f
            int r3 = r0 - r1
            java.util.List<w.f> r0 = r12.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f23438g
            int r1 = r12.f23437f
            int r4 = r0 + r1
            java.util.List<w.f> r0 = r13.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f23438g
            int r1 = r13.f23437f
            int r5 = r0 - r1
            int[] r1 = f23457k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f23489e
            int[] r1 = f23457k
            r1 = r1[r10]
            r0.d(r1)
            v.e r0 = r8.f23486b
            w.n r0 = r0.f23079f
            w.g r0 = r0.f23489e
            int[] r1 = f23457k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            w.f r0 = r8.f23492h
            boolean r1 = r0.f23434c
            if (r1 == 0) goto L_0x01ff
            w.f r1 = r8.f23493i
            boolean r1 = r1.f23434c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f23434c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f23434c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List<w.f> r0 = r0.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f23438g
            w.f r1 = r8.f23492h
            int r1 = r1.f23437f
            int r2 = r0 + r1
            w.f r0 = r8.f23493i
            java.util.List<w.f> r0 = r0.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f23438g
            w.f r1 = r8.f23493i
            int r1 = r1.f23437f
            int r3 = r0 - r1
            java.util.List<w.f> r0 = r12.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f23438g
            int r1 = r12.f23437f
            int r4 = r0 + r1
            java.util.List<w.f> r0 = r13.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f23438g
            int r1 = r13.f23437f
            int r5 = r0 - r1
            int[] r1 = f23457k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f23489e
            int[] r1 = f23457k
            r1 = r1[r10]
            r0.d(r1)
            v.e r0 = r8.f23486b
            w.n r0 = r0.f23079f
            w.g r0 = r0.f23489e
            int[] r1 = f23457k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x0324
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x028b
            if (r4 == 0) goto L_0x028b
            w.f r0 = r8.f23492h
            boolean r0 = r0.f23434c
            if (r0 == 0) goto L_0x028a
            w.f r0 = r8.f23493i
            boolean r0 = r0.f23434c
            if (r0 != 0) goto L_0x0212
            goto L_0x028a
        L_0x0212:
            v.e r0 = r8.f23486b
            float r0 = r0.t()
            w.f r1 = r8.f23492h
            java.util.List<w.f> r1 = r1.f23443l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r1 = r1.f23438g
            w.f r2 = r8.f23492h
            int r2 = r2.f23437f
            int r1 = r1 + r2
            w.f r2 = r8.f23493i
            java.util.List<w.f> r2 = r2.f23443l
            java.lang.Object r2 = r2.get(r10)
            w.f r2 = (w.f) r2
            int r2 = r2.f23438g
            w.f r4 = r8.f23493i
            int r4 = r4.f23437f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0266
            if (r14 == 0) goto L_0x0266
            if (r14 == r9) goto L_0x0242
            goto L_0x0324
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0256
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0256:
            w.g r0 = r8.f23489e
            r0.d(r1)
            v.e r0 = r8.f23486b
            w.n r0 = r0.f23079f
            w.g r0 = r0.f23489e
            r0.d(r3)
            goto L_0x0324
        L_0x0266:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x027a
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x027a:
            w.g r0 = r8.f23489e
            r0.d(r1)
            v.e r0 = r8.f23486b
            w.n r0 = r0.f23079f
            w.g r0 = r0.f23489e
            r0.d(r3)
            goto L_0x0324
        L_0x028a:
            return
        L_0x028b:
            if (r2 == 0) goto L_0x0324
            if (r5 == 0) goto L_0x0324
            boolean r0 = r12.f23434c
            if (r0 == 0) goto L_0x0305
            boolean r0 = r13.f23434c
            if (r0 != 0) goto L_0x0298
            goto L_0x0305
        L_0x0298:
            v.e r0 = r8.f23486b
            float r0 = r0.t()
            java.util.List<w.f> r1 = r12.f23443l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r1 = r1.f23438g
            int r2 = r12.f23437f
            int r1 = r1 + r2
            java.util.List<w.f> r2 = r13.f23443l
            java.lang.Object r2 = r2.get(r10)
            w.f r2 = (w.f) r2
            int r2 = r2.f23438g
            int r4 = r13.f23437f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02e2
            if (r14 == 0) goto L_0x02bf
            if (r14 == r9) goto L_0x02e2
            goto L_0x0324
        L_0x02bf:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02d3
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d3:
            w.g r0 = r8.f23489e
            r0.d(r3)
            v.e r0 = r8.f23486b
            w.n r0 = r0.f23079f
            w.g r0 = r0.f23489e
            r0.d(r1)
            goto L_0x0324
        L_0x02e2:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02f6
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f6:
            w.g r0 = r8.f23489e
            r0.d(r3)
            v.e r0 = r8.f23486b
            w.n r0 = r0.f23079f
            w.g r0 = r0.f23489e
            r0.d(r1)
            goto L_0x0324
        L_0x0305:
            return
        L_0x0306:
            v.e r0 = r0.I()
            if (r0 == 0) goto L_0x0324
            w.l r0 = r0.f23077e
            w.g r0 = r0.f23489e
            boolean r1 = r0.f23441j
            if (r1 == 0) goto L_0x0324
            v.e r1 = r8.f23486b
            float r1 = r1.B
            int r0 = r0.f23438g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            w.g r1 = r8.f23489e
            r1.d(r0)
        L_0x0324:
            w.f r0 = r8.f23492h
            boolean r1 = r0.f23434c
            if (r1 == 0) goto L_0x0446
            w.f r1 = r8.f23493i
            boolean r2 = r1.f23434c
            if (r2 != 0) goto L_0x0332
            goto L_0x0446
        L_0x0332:
            boolean r0 = r0.f23441j
            if (r0 == 0) goto L_0x0341
            boolean r0 = r1.f23441j
            if (r0 == 0) goto L_0x0341
            w.g r0 = r8.f23489e
            boolean r0 = r0.f23441j
            if (r0 == 0) goto L_0x0341
            return
        L_0x0341:
            w.g r0 = r8.f23489e
            boolean r0 = r0.f23441j
            if (r0 != 0) goto L_0x038b
            v.e$b r0 = r8.f23488d
            v.e$b r1 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x038b
            v.e r0 = r8.f23486b
            int r1 = r0.f23113w
            if (r1 != 0) goto L_0x038b
            boolean r0 = r0.g0()
            if (r0 != 0) goto L_0x038b
            w.f r0 = r8.f23492h
            java.util.List<w.f> r0 = r0.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f23493i
            java.util.List<w.f> r1 = r1.f23443l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r0 = r0.f23438g
            w.f r2 = r8.f23492h
            int r3 = r2.f23437f
            int r0 = r0 + r3
            int r1 = r1.f23438g
            w.f r3 = r8.f23493i
            int r3 = r3.f23437f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            w.f r0 = r8.f23493i
            r0.d(r1)
            w.g r0 = r8.f23489e
            r0.d(r3)
            return
        L_0x038b:
            w.g r0 = r8.f23489e
            boolean r0 = r0.f23441j
            if (r0 != 0) goto L_0x03ef
            v.e$b r0 = r8.f23488d
            v.e$b r1 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ef
            int r0 = r8.f23485a
            if (r0 != r9) goto L_0x03ef
            w.f r0 = r8.f23492h
            java.util.List<w.f> r0 = r0.f23443l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            w.f r0 = r8.f23493i
            java.util.List<w.f> r0 = r0.f23443l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ef
            w.f r0 = r8.f23492h
            java.util.List<w.f> r0 = r0.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f23493i
            java.util.List<w.f> r1 = r1.f23443l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r0 = r0.f23438g
            w.f r2 = r8.f23492h
            int r2 = r2.f23437f
            int r0 = r0 + r2
            int r1 = r1.f23438g
            w.f r2 = r8.f23493i
            int r2 = r2.f23437f
            int r1 = r1 + r2
            int r1 = r1 - r0
            w.g r0 = r8.f23489e
            int r0 = r0.f23453m
            int r0 = java.lang.Math.min(r1, r0)
            v.e r1 = r8.f23486b
            int r2 = r1.A
            int r1 = r1.f23119z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03ea
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03ea:
            w.g r1 = r8.f23489e
            r1.d(r0)
        L_0x03ef:
            w.g r0 = r8.f23489e
            boolean r0 = r0.f23441j
            if (r0 != 0) goto L_0x03f6
            return
        L_0x03f6:
            w.f r0 = r8.f23492h
            java.util.List<w.f> r0 = r0.f23443l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f23493i
            java.util.List<w.f> r1 = r1.f23443l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r2 = r0.f23438g
            w.f r3 = r8.f23492h
            int r3 = r3.f23437f
            int r2 = r2 + r3
            int r3 = r1.f23438g
            w.f r4 = r8.f23493i
            int r4 = r4.f23437f
            int r3 = r3 + r4
            v.e r4 = r8.f23486b
            float r4 = r4.w()
            if (r0 != r1) goto L_0x0426
            int r2 = r0.f23438g
            int r3 = r1.f23438g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0426:
            int r3 = r3 - r2
            w.g r0 = r8.f23489e
            int r0 = r0.f23438g
            int r3 = r3 - r0
            w.f r0 = r8.f23492h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            w.f r0 = r8.f23493i
            w.f r1 = r8.f23492h
            int r1 = r1.f23438g
            w.g r2 = r8.f23489e
            int r2 = r2.f23438g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x0446:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.a(w.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e I;
        e I2;
        e eVar = this.f23486b;
        if (eVar.f23069a) {
            this.f23489e.d(eVar.U());
        }
        if (!this.f23489e.f23441j) {
            e.b y10 = this.f23486b.y();
            this.f23488d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y10 == bVar && (I2 = this.f23486b.I()) != null && (I2.y() == e.b.FIXED || I2.y() == bVar)) {
                    int U = (I2.U() - this.f23486b.O.e()) - this.f23486b.Q.e();
                    b(this.f23492h, I2.f23077e.f23492h, this.f23486b.O.e());
                    b(this.f23493i, I2.f23077e.f23493i, -this.f23486b.Q.e());
                    this.f23489e.d(U);
                    return;
                } else if (this.f23488d == e.b.FIXED) {
                    this.f23489e.d(this.f23486b.U());
                }
            }
        } else {
            e.b bVar2 = this.f23488d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (I = this.f23486b.I()) != null && (I.y() == e.b.FIXED || I.y() == bVar3)) {
                b(this.f23492h, I.f23077e.f23492h, this.f23486b.O.e());
                b(this.f23493i, I.f23077e.f23493i, -this.f23486b.Q.e());
                return;
            }
        }
        g gVar = this.f23489e;
        if (gVar.f23441j) {
            e eVar2 = this.f23486b;
            if (eVar2.f23069a) {
                d[] dVarArr = eVar2.W;
                if (dVarArr[0].f23054f == null || dVarArr[1].f23054f == null) {
                    if (dVarArr[0].f23054f != null) {
                        f h10 = h(dVarArr[0]);
                        if (h10 != null) {
                            b(this.f23492h, h10, this.f23486b.W[0].e());
                            b(this.f23493i, this.f23492h, this.f23489e.f23438g);
                            return;
                        }
                        return;
                    } else if (dVarArr[1].f23054f != null) {
                        f h11 = h(dVarArr[1]);
                        if (h11 != null) {
                            b(this.f23493i, h11, -this.f23486b.W[1].e());
                            b(this.f23492h, this.f23493i, -this.f23489e.f23438g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof h) && eVar2.I() != null && this.f23486b.m(d.b.CENTER).f23054f == null) {
                        b(this.f23492h, this.f23486b.I().f23077e.f23492h, this.f23486b.V());
                        b(this.f23493i, this.f23492h, this.f23489e.f23438g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.g0()) {
                    this.f23492h.f23437f = this.f23486b.W[0].e();
                    this.f23493i.f23437f = -this.f23486b.W[1].e();
                    return;
                } else {
                    f h12 = h(this.f23486b.W[0]);
                    if (h12 != null) {
                        b(this.f23492h, h12, this.f23486b.W[0].e());
                    }
                    f h13 = h(this.f23486b.W[1]);
                    if (h13 != null) {
                        b(this.f23493i, h13, -this.f23486b.W[1].e());
                    }
                    this.f23492h.f23433b = true;
                    this.f23493i.f23433b = true;
                    return;
                }
            }
        }
        if (this.f23488d == e.b.MATCH_CONSTRAINT) {
            e eVar3 = this.f23486b;
            int i10 = eVar3.f23113w;
            if (i10 == 2) {
                e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f23079f.f23489e;
                    this.f23489e.f23443l.add(gVar2);
                    gVar2.f23442k.add(this.f23489e);
                    g gVar3 = this.f23489e;
                    gVar3.f23433b = true;
                    gVar3.f23442k.add(this.f23492h);
                    this.f23489e.f23442k.add(this.f23493i);
                }
            } else if (i10 == 3) {
                if (eVar3.f23115x == 3) {
                    this.f23492h.f23432a = this;
                    this.f23493i.f23432a = this;
                    n nVar = eVar3.f23079f;
                    nVar.f23492h.f23432a = this;
                    nVar.f23493i.f23432a = this;
                    gVar.f23432a = this;
                    if (eVar3.i0()) {
                        this.f23489e.f23443l.add(this.f23486b.f23079f.f23489e);
                        this.f23486b.f23079f.f23489e.f23442k.add(this.f23489e);
                        n nVar2 = this.f23486b.f23079f;
                        nVar2.f23489e.f23432a = this;
                        this.f23489e.f23443l.add(nVar2.f23492h);
                        this.f23489e.f23443l.add(this.f23486b.f23079f.f23493i);
                        this.f23486b.f23079f.f23492h.f23442k.add(this.f23489e);
                        this.f23486b.f23079f.f23493i.f23442k.add(this.f23489e);
                    } else if (this.f23486b.g0()) {
                        this.f23486b.f23079f.f23489e.f23443l.add(this.f23489e);
                        this.f23489e.f23442k.add(this.f23486b.f23079f.f23489e);
                    } else {
                        this.f23486b.f23079f.f23489e.f23443l.add(this.f23489e);
                    }
                } else {
                    g gVar4 = eVar3.f23079f.f23489e;
                    gVar.f23443l.add(gVar4);
                    gVar4.f23442k.add(this.f23489e);
                    this.f23486b.f23079f.f23492h.f23442k.add(this.f23489e);
                    this.f23486b.f23079f.f23493i.f23442k.add(this.f23489e);
                    g gVar5 = this.f23489e;
                    gVar5.f23433b = true;
                    gVar5.f23442k.add(this.f23492h);
                    this.f23489e.f23442k.add(this.f23493i);
                    this.f23492h.f23443l.add(this.f23489e);
                    this.f23493i.f23443l.add(this.f23489e);
                }
            }
        }
        e eVar4 = this.f23486b;
        d[] dVarArr2 = eVar4.W;
        if (dVarArr2[0].f23054f == null || dVarArr2[1].f23054f == null) {
            if (dVarArr2[0].f23054f != null) {
                f h14 = h(dVarArr2[0]);
                if (h14 != null) {
                    b(this.f23492h, h14, this.f23486b.W[0].e());
                    c(this.f23493i, this.f23492h, 1, this.f23489e);
                }
            } else if (dVarArr2[1].f23054f != null) {
                f h15 = h(dVarArr2[1]);
                if (h15 != null) {
                    b(this.f23493i, h15, -this.f23486b.W[1].e());
                    c(this.f23492h, this.f23493i, -1, this.f23489e);
                }
            } else if (!(eVar4 instanceof h) && eVar4.I() != null) {
                b(this.f23492h, this.f23486b.I().f23077e.f23492h, this.f23486b.V());
                c(this.f23493i, this.f23492h, 1, this.f23489e);
            }
        } else if (eVar4.g0()) {
            this.f23492h.f23437f = this.f23486b.W[0].e();
            this.f23493i.f23437f = -this.f23486b.W[1].e();
        } else {
            f h16 = h(this.f23486b.W[0]);
            f h17 = h(this.f23486b.W[1]);
            if (h16 != null) {
                h16.b(this);
            }
            if (h17 != null) {
                h17.b(this);
            }
            this.f23494j = p.b.CENTER;
        }
    }

    public void e() {
        f fVar = this.f23492h;
        if (fVar.f23441j) {
            this.f23486b.j1(fVar.f23438g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f23487c = null;
        this.f23492h.c();
        this.f23493i.c();
        this.f23489e.c();
        this.f23491g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f23488d != e.b.MATCH_CONSTRAINT || this.f23486b.f23113w == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f23491g = false;
        this.f23492h.c();
        this.f23492h.f23441j = false;
        this.f23493i.c();
        this.f23493i.f23441j = false;
        this.f23489e.f23441j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f23486b.r();
    }
}
