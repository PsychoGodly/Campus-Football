package com.google.protobuf;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.b2;
import com.google.protobuf.c2;
import com.google.protobuf.d0;
import com.google.protobuf.f;
import com.google.protobuf.i;
import com.google.protobuf.o0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: MessageSchema */
final class y0<T> implements n1<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f27274r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f27275s = z1.H();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f27276a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f27277b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27278c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27279d;

    /* renamed from: e  reason: collision with root package name */
    private final v0 f27280e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f27281f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f27282g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f27283h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f27284i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f27285j;

    /* renamed from: k  reason: collision with root package name */
    private final int f27286k;

    /* renamed from: l  reason: collision with root package name */
    private final int f27287l;

    /* renamed from: m  reason: collision with root package name */
    private final a1 f27288m;

    /* renamed from: n  reason: collision with root package name */
    private final l0 f27289n;

    /* renamed from: o  reason: collision with root package name */
    private final v1<?, ?> f27290o;

    /* renamed from: p  reason: collision with root package name */
    private final r<?> f27291p;

    /* renamed from: q  reason: collision with root package name */
    private final q0 f27292q;

    /* compiled from: MessageSchema */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27293a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.b2.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27293a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f27293a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.a.<clinit>():void");
        }
    }

    private y0(int[] iArr, Object[] objArr, int i10, int i11, v0 v0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, r<?> rVar, q0 q0Var) {
        this.f27276a = iArr;
        this.f27277b = objArr;
        this.f27278c = i10;
        this.f27279d = i11;
        this.f27282g = v0Var instanceof z;
        this.f27283h = z10;
        this.f27281f = rVar != null && rVar.e(v0Var);
        this.f27284i = z11;
        this.f27285j = iArr2;
        this.f27286k = i12;
        this.f27287l = i13;
        this.f27288m = a1Var;
        this.f27289n = l0Var;
        this.f27290o = v1Var;
        this.f27291p = rVar;
        this.f27280e = v0Var;
        this.f27292q = q0Var;
    }

    private <UT, UB> int A(v1<UT, UB> v1Var, T t10) {
        return v1Var.h(v1Var.g(t10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0(T r13, com.google.protobuf.c2 r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f27281f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.r<?> r0 = r12.f27291p
            com.google.protobuf.v r0 = r0.c(r13)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.t()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f27276a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.y0(r5)
            int r7 = r12.Y(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.r<?> r8 = r12.f27291p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.r<?> r8 = r12.f27291p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = x0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            com.google.protobuf.n1 r8 = r12.w(r5)
            r14.s(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = e0(r13, r8)
            r14.F(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = d0(r13, r8)
            r14.N(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = e0(r13, r8)
            r14.z(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = d0(r13, r8)
            r14.t(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = d0(r13, r8)
            r14.J(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = d0(r13, r8)
            r14.d(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            r14.v(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            com.google.protobuf.n1 r8 = r12.w(r5)
            r14.j(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            r12.D0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            boolean r6 = a0(r13, r8)
            r14.r(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = d0(r13, r8)
            r14.f(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = e0(r13, r8)
            r14.k(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = d0(r13, r8)
            r14.w(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = e0(r13, r8)
            r14.o(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = e0(r13, r8)
            r14.q(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            float r6 = c0(r13, r8)
            r14.G(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            double r8 = b0(r13, r8)
            r14.g(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            r12.C0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1 r8 = r12.w(r5)
            com.google.protobuf.p1.U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.Y(r5)
            long r10 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1 r8 = r12.w(r5)
            com.google.protobuf.p1.X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.Y(r5)
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.p1.P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            com.google.protobuf.n1 r8 = r12.w(r5)
            r14.s(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = N(r13, r8)
            r14.F(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = B(r13, r8)
            r14.N(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = N(r13, r8)
            r14.z(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = B(r13, r8)
            r14.t(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = B(r13, r8)
            r14.J(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = B(r13, r8)
            r14.d(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            r14.v(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            com.google.protobuf.n1 r8 = r12.w(r5)
            r14.j(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            java.lang.Object r6 = com.google.protobuf.z1.G(r13, r8)
            r12.D0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            boolean r6 = l(r13, r8)
            r14.r(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = B(r13, r8)
            r14.f(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = N(r13, r8)
            r14.k(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            int r6 = B(r13, r8)
            r14.w(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = N(r13, r8)
            r14.o(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            long r8 = N(r13, r8)
            r14.q(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            float r6 = t(r13, r8)
            r14.G(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = Z(r6)
            double r8 = p(r13, r8)
            r14.g(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.protobuf.r<?> r3 = r12.f27291p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.protobuf.v1<?, ?> r0 = r12.f27290o
            r12.E0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.A0(java.lang.Object, com.google.protobuf.c2):void");
    }

    private static <T> int B(T t10, long j10) {
        return z1.C(t10, j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B0(T r11, com.google.protobuf.c2 r12) throws java.io.IOException {
        /*
            r10 = this;
            com.google.protobuf.v1<?, ?> r0 = r10.f27290o
            r10.E0(r0, r11, r12)
            boolean r0 = r10.f27281f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.r<?> r0 = r10.f27291p
            com.google.protobuf.v r0 = r0.c(r11)
            boolean r2 = r0.n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f27276a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.y0(r3)
            int r5 = r10.Y(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.r<?> r6 = r10.f27291p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.r<?> r6 = r10.f27291p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = x0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            com.google.protobuf.n1 r6 = r10.w(r3)
            r12.s(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = e0(r11, r6)
            r12.F(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = d0(r11, r6)
            r12.N(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = e0(r11, r6)
            r12.z(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = d0(r11, r6)
            r12.t(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = d0(r11, r6)
            r12.J(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = d0(r11, r6)
            r12.d(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            com.google.protobuf.i r4 = (com.google.protobuf.i) r4
            r12.v(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            com.google.protobuf.n1 r6 = r10.w(r3)
            r12.j(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            r10.D0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            boolean r4 = a0(r11, r6)
            r12.r(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = d0(r11, r6)
            r12.f(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = e0(r11, r6)
            r12.k(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = d0(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = e0(r11, r6)
            r12.o(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = e0(r11, r6)
            r12.q(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            float r4 = c0(r11, r6)
            r12.G(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            double r6 = b0(r11, r6)
            r12.g(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            r10.C0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1 r6 = r10.w(r3)
            com.google.protobuf.p1.U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.Y(r3)
            long r8 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1 r6 = r10.w(r3)
            com.google.protobuf.p1.X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.Y(r3)
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.p1.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            com.google.protobuf.n1 r6 = r10.w(r3)
            r12.s(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = N(r11, r6)
            r12.F(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = B(r11, r6)
            r12.N(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = N(r11, r6)
            r12.z(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = B(r11, r6)
            r12.t(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = B(r11, r6)
            r12.J(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = B(r11, r6)
            r12.d(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            com.google.protobuf.i r4 = (com.google.protobuf.i) r4
            r12.v(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            com.google.protobuf.n1 r6 = r10.w(r3)
            r12.j(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            java.lang.Object r4 = com.google.protobuf.z1.G(r11, r6)
            r10.D0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            boolean r4 = l(r11, r6)
            r12.r(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = B(r11, r6)
            r12.f(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = N(r11, r6)
            r12.k(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            int r4 = B(r11, r6)
            r12.w(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = N(r11, r6)
            r12.o(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            long r6 = N(r11, r6)
            r12.q(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            float r4 = t(r11, r6)
            r12.G(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = Z(r4)
            double r6 = p(r11, r6)
            r12.g(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.r<?> r11 = r10.f27291p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.B0(java.lang.Object, com.google.protobuf.c2):void");
    }

    private static boolean C(int i10) {
        return (i10 & 536870912) != 0;
    }

    private <K, V> void C0(c2 c2Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            c2Var.C(i10, this.f27292q.c(v(i11)), this.f27292q.h(obj));
        }
    }

    private boolean D(T t10, int i10) {
        int m02 = m0(i10);
        long j10 = (long) (1048575 & m02);
        if (j10 == 1048575) {
            int y02 = y0(i10);
            long Z = Z(y02);
            switch (x0(y02)) {
                case 0:
                    if (Double.doubleToRawLongBits(z1.A(t10, Z)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(z1.B(t10, Z)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (z1.E(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (z1.E(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (z1.C(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (z1.E(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (z1.C(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return z1.t(t10, Z);
                case 8:
                    Object G = z1.G(t10, Z);
                    if (G instanceof String) {
                        return !((String) G).isEmpty();
                    }
                    if (G instanceof i) {
                        return !i.f27039b.equals(G);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (z1.G(t10, Z) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !i.f27039b.equals(z1.G(t10, Z));
                case 11:
                    if (z1.C(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (z1.C(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (z1.C(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (z1.E(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (z1.C(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (z1.E(t10, Z) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (z1.G(t10, Z) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((z1.C(t10, j10) & (1 << (m02 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    private void D0(int i10, Object obj, c2 c2Var) throws IOException {
        if (obj instanceof String) {
            c2Var.n(i10, (String) obj);
        } else {
            c2Var.v(i10, (i) obj);
        }
    }

    private boolean E(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return D(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    private <UT, UB> void E0(v1<UT, UB> v1Var, T t10, c2 c2Var) throws IOException {
        v1Var.t(v1Var.g(t10), c2Var);
    }

    private static boolean F(Object obj, int i10, n1 n1Var) {
        return n1Var.d(z1.G(obj, Z(i10)));
    }

    private <N> boolean G(Object obj, int i10, int i11) {
        List list = (List) z1.G(obj, Z(i10));
        if (list.isEmpty()) {
            return true;
        }
        n1 w10 = w(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!w10.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean H(T t10, int i10, int i11) {
        Map<?, ?> h10 = this.f27292q.h(z1.G(t10, Z(i10)));
        if (h10.isEmpty()) {
            return true;
        }
        if (this.f27292q.c(v(i11)).f27167c.c() != b2.c.MESSAGE) {
            return true;
        }
        n1<?> n1Var = null;
        for (Object next : h10.values()) {
            if (n1Var == null) {
                n1Var = i1.a().c(next.getClass());
            }
            if (!n1Var.d(next)) {
                return false;
            }
        }
        return true;
    }

    private static boolean I(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof z) {
            return ((z) obj).M();
        }
        return true;
    }

    private boolean J(T t10, T t11, int i10) {
        long m02 = (long) (m0(i10) & 1048575);
        return z1.C(t10, m02) == z1.C(t11, m02);
    }

    private boolean K(T t10, int i10, int i11) {
        return z1.C(t10, (long) (m0(i11) & 1048575)) == i10;
    }

    private static boolean L(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List<?> M(Object obj, long j10) {
        return (List) z1.G(obj, j10);
    }

    private static <T> long N(T t10, long j10) {
        return z1.E(t10, j10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:98|97|157|174|175|(0)(0)|196|219|211) */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x06a1, code lost:
        r0 = th;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0194, code lost:
        r12 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0247, code lost:
        r14 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x0643 */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0649 A[Catch:{ all -> 0x06a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x06b3 A[LOOP:6: B:205:0x06af->B:207:0x06b3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x06c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <UT, UB, ET extends com.google.protobuf.v.b<ET>> void O(com.google.protobuf.v1<UT, UB> r19, com.google.protobuf.r<ET> r20, T r21, com.google.protobuf.l1 r22, com.google.protobuf.q r23) throws java.io.IOException {
        /*
            r18 = this;
            r8 = r18
            r7 = r19
            r15 = r21
            r0 = r22
            r6 = r23
            r17 = 0
            r5 = r17
            r9 = r5
        L_0x000f:
            int r2 = r22.B()     // Catch:{ all -> 0x06a7 }
            int r3 = r8.k0(r2)     // Catch:{ all -> 0x06a7 }
            if (r3 >= 0) goto L_0x00b9
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x003e
            int r0 = r8.f27286k
            r4 = r5
        L_0x0021:
            int r1 = r8.f27287l
            if (r0 >= r1) goto L_0x0038
            int[] r1 = r8.f27285j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            r7.o(r15, r4)
        L_0x003d:
            return
        L_0x003e:
            boolean r1 = r8.f27281f     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x0047
            r4 = r20
            r12 = r17
            goto L_0x0050
        L_0x0047:
            com.google.protobuf.v0 r1 = r8.f27280e     // Catch:{ all -> 0x00b5 }
            r4 = r20
            java.lang.Object r1 = r4.b(r6, r1, r2)     // Catch:{ all -> 0x00b5 }
            r12 = r1
        L_0x0050:
            if (r12 == 0) goto L_0x0071
            if (r9 != 0) goto L_0x005c
            com.google.protobuf.v r1 = r20.d(r21)     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            goto L_0x06a9
        L_0x005c:
            r1 = r9
        L_0x005d:
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r1
            r3 = r15
            r15 = r5
            r16 = r19
            java.lang.Object r5 = r9.g(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00b1 }
            r9 = r1
        L_0x006f:
            r15 = r3
            goto L_0x000f
        L_0x0071:
            r3 = r15
            boolean r1 = r7.q(r0)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x007f
            boolean r1 = r22.J()     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x008d
        L_0x007e:
            goto L_0x006f
        L_0x007f:
            if (r5 != 0) goto L_0x0086
            java.lang.Object r1 = r7.f(r3)     // Catch:{ all -> 0x00b1 }
            r5 = r1
        L_0x0086:
            boolean r1 = r7.m(r5, r0)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x008d
            goto L_0x007e
        L_0x008d:
            int r0 = r8.f27286k
            r4 = r5
        L_0x0090:
            int r1 = r8.f27287l
            if (r0 >= r1) goto L_0x00aa
            int[] r1 = r8.f27285j
            r5 = r1[r0]
            r1 = r18
            r2 = r21
            r10 = r3
            r3 = r5
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r3 = r10
            goto L_0x0090
        L_0x00aa:
            r10 = r3
            if (r4 == 0) goto L_0x00b0
            r7.o(r10, r4)
        L_0x00b0:
            return
        L_0x00b1:
            r0 = move-exception
            r10 = r3
            goto L_0x06a5
        L_0x00b5:
            r0 = move-exception
            r10 = r15
            goto L_0x06a5
        L_0x00b9:
            r4 = r20
            r10 = r15
            int r11 = r8.y0(r3)     // Catch:{ all -> 0x06a3 }
            int r1 = x0(r11)     // Catch:{ a -> 0x0640 }
            switch(r1) {
                case 0: goto L_0x05fd;
                case 1: goto L_0x05eb;
                case 2: goto L_0x05d9;
                case 3: goto L_0x05c7;
                case 4: goto L_0x05b5;
                case 5: goto L_0x05a2;
                case 6: goto L_0x058f;
                case 7: goto L_0x057c;
                case 8: goto L_0x0571;
                case 9: goto L_0x055c;
                case 10: goto L_0x0549;
                case 11: goto L_0x0536;
                case 12: goto L_0x0510;
                case 13: goto L_0x04fd;
                case 14: goto L_0x04ea;
                case 15: goto L_0x04d7;
                case 16: goto L_0x04c4;
                case 17: goto L_0x04af;
                case 18: goto L_0x049d;
                case 19: goto L_0x048b;
                case 20: goto L_0x0479;
                case 21: goto L_0x0467;
                case 22: goto L_0x0455;
                case 23: goto L_0x0443;
                case 24: goto L_0x0431;
                case 25: goto L_0x041f;
                case 26: goto L_0x0417;
                case 27: goto L_0x0402;
                case 28: goto L_0x03f0;
                case 29: goto L_0x03de;
                case 30: goto L_0x03bd;
                case 31: goto L_0x03ab;
                case 32: goto L_0x0399;
                case 33: goto L_0x0387;
                case 34: goto L_0x0375;
                case 35: goto L_0x0363;
                case 36: goto L_0x0351;
                case 37: goto L_0x033f;
                case 38: goto L_0x032d;
                case 39: goto L_0x031b;
                case 40: goto L_0x0309;
                case 41: goto L_0x02f7;
                case 42: goto L_0x02e5;
                case 43: goto L_0x02d3;
                case 44: goto L_0x02b2;
                case 45: goto L_0x02a0;
                case 46: goto L_0x028e;
                case 47: goto L_0x027c;
                case 48: goto L_0x026a;
                case 49: goto L_0x024a;
                case 50: goto L_0x0235;
                case 51: goto L_0x021e;
                case 52: goto L_0x020a;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01e4;
                case 55: goto L_0x01d1;
                case 56: goto L_0x01be;
                case 57: goto L_0x01ab;
                case 58: goto L_0x0198;
                case 59: goto L_0x018e;
                case 60: goto L_0x017d;
                case 61: goto L_0x016e;
                case 62: goto L_0x015b;
                case 63: goto L_0x0133;
                case 64: goto L_0x0120;
                case 65: goto L_0x010c;
                case 66: goto L_0x00f8;
                case 67: goto L_0x00e4;
                case 68: goto L_0x00d2;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            r12 = r5
            r13 = r6
            r14 = r7
            if (r12 != 0) goto L_0x0619
            java.lang.Object r1 = r14.f(r10)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x0617
        L_0x00d2:
            java.lang.Object r1 = r8.U(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.v0 r1 = (com.google.protobuf.v0) r1     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.n1 r11 = r8.w(r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r0.j(r1, r11, r6)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.w0(r10, r2, r3, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x00e4:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.x()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x00f8:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.w()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x010c:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.n()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x0120:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.K()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x0133:
            int r1 = r22.u()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.d0$e r12 = r8.u(r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            if (r12 == 0) goto L_0x014c
            boolean r12 = r12.a(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            if (r12 == 0) goto L_0x0144
            goto L_0x014c
        L_0x0144:
            java.lang.Object r5 = com.google.protobuf.p1.L(r10, r2, r1, r5, r7)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r13 = r6
            r14 = r7
            goto L_0x069c
        L_0x014c:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x015b:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.p()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x016e:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.i r1 = r22.G()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x017d:
            java.lang.Object r1 = r8.U(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.v0 r1 = (com.google.protobuf.v0) r1     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.n1 r11 = r8.w(r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r0.D(r1, r11, r6)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.w0(r10, r2, r3, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x018e:
            r8.p0(r10, r11, r0)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
        L_0x0194:
            r12 = r5
            r13 = r6
            goto L_0x0247
        L_0x0198:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            boolean r1 = r22.l()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01ab:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.k()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01be:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.c()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01d1:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.I()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01e4:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.b()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01f7:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.N()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x020a:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            float r1 = r22.readFloat()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x021e:
            long r11 = Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            double r13 = r22.readDouble()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Double r1 = java.lang.Double.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.z1.V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x0232:
            r0 = move-exception
            goto L_0x06a5
        L_0x0235:
            java.lang.Object r11 = r8.v(r3)     // Catch:{ a -> 0x0640 }
            r1 = r18
            r2 = r21
            r4 = r11
            r12 = r5
            r5 = r23
            r13 = r6
            r6 = r22
            r1.P(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0267, all -> 0x0263 }
        L_0x0247:
            r14 = r7
            goto L_0x060e
        L_0x024a:
            r12 = r5
            r13 = r6
            long r4 = Z(r11)     // Catch:{ a -> 0x0267, all -> 0x0263 }
            com.google.protobuf.n1 r6 = r8.w(r3)     // Catch:{ a -> 0x0267, all -> 0x0263 }
            r1 = r18
            r2 = r21
            r3 = r4
            r5 = r22
            r14 = r7
            r7 = r23
            r1.n0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0263:
            r0 = move-exception
            r14 = r7
            goto L_0x0612
        L_0x0267:
            r14 = r7
            goto L_0x0615
        L_0x026a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.e(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x027c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.a(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x028e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.r(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x02a0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.d(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x02b2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r4 = r1.e(r10, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.t(r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.d0$e r5 = r8.u(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.protobuf.p1.A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x069c
        L_0x02d3:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.h(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x02e5:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.y(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x02f7:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.v(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0309:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.P(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x031b:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.s(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x032d:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.o(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x033f:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.q(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0351:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.H(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0363:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.M(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0375:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.e(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0387:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.a(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0399:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.r(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x03ab:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.d(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x03bd:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r4 = r1.e(r10, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.t(r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.d0$e r5 = r8.u(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.protobuf.p1.A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x069c
        L_0x03de:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.h(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x03f0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.L(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0402:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.n1 r5 = r8.w(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r1 = r18
            r2 = r21
            r3 = r11
            r4 = r22
            r6 = r23
            r1.o0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0417:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.q0(r10, r11, r0)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x041f:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.y(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0431:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.v(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0443:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.P(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0455:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.s(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0467:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.o(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0479:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.q(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x048b:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.H(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x049d:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f27289n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.M(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04af:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.T(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.v0 r1 = (com.google.protobuf.v0) r1     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.n1 r2 = r8.w(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.j(r1, r2, r13)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.v0(r10, r3, r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04c4:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.x()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04d7:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.w()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04ea:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.n()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04fd:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.K()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0510:
            r12 = r5
            r13 = r6
            r14 = r7
            int r1 = r22.u()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.d0$e r4 = r8.u(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            if (r4 == 0) goto L_0x052a
            boolean r4 = r4.a(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            if (r4 == 0) goto L_0x0524
            goto L_0x052a
        L_0x0524:
            java.lang.Object r5 = com.google.protobuf.p1.L(r10, r2, r1, r12, r14)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x069c
        L_0x052a:
            long r4 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.T(r10, r4, r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0536:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.p()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0549:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.i r4 = r22.G()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.V(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x055c:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.T(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.v0 r1 = (com.google.protobuf.v0) r1     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.n1 r2 = r8.w(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.D(r1, r2, r13)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.v0(r10, r3, r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0571:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.p0(r10, r11, r0)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x057c:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            boolean r4 = r22.l()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.L(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x058f:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.k()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05a2:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.c()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05b5:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.I()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05c7:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.b()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05d9:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.N()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05eb:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            float r4 = r22.readFloat()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.S(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05fd:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            double r4 = r22.readDouble()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.z1.R(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
        L_0x060e:
            r5 = r12
            goto L_0x069c
        L_0x0611:
            r0 = move-exception
        L_0x0612:
            r5 = r12
            goto L_0x06ab
        L_0x0615:
            r5 = r12
            goto L_0x0643
        L_0x0617:
            r5 = r1
            goto L_0x061a
        L_0x0619:
            r5 = r12
        L_0x061a:
            boolean r1 = r14.m(r5, r0)     // Catch:{ a -> 0x0643 }
            if (r1 != 0) goto L_0x069c
            int r0 = r8.f27286k
            r4 = r5
        L_0x0623:
            int r1 = r8.f27287l
            if (r0 >= r1) goto L_0x063a
            int[] r1 = r8.f27285j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0623
        L_0x063a:
            if (r4 == 0) goto L_0x063f
            r14.o(r10, r4)
        L_0x063f:
            return
        L_0x0640:
            r12 = r5
        L_0x0641:
            r13 = r6
            r14 = r7
        L_0x0643:
            boolean r1 = r14.q(r0)     // Catch:{ all -> 0x06a1 }
            if (r1 == 0) goto L_0x066f
            boolean r1 = r22.J()     // Catch:{ all -> 0x06a1 }
            if (r1 != 0) goto L_0x069c
            int r0 = r8.f27286k
            r4 = r5
        L_0x0652:
            int r1 = r8.f27287l
            if (r0 >= r1) goto L_0x0669
            int[] r1 = r8.f27285j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0652
        L_0x0669:
            if (r4 == 0) goto L_0x066e
            r14.o(r10, r4)
        L_0x066e:
            return
        L_0x066f:
            if (r5 != 0) goto L_0x0676
            java.lang.Object r1 = r14.f(r10)     // Catch:{ all -> 0x06a1 }
            r5 = r1
        L_0x0676:
            boolean r1 = r14.m(r5, r0)     // Catch:{ all -> 0x06a1 }
            if (r1 != 0) goto L_0x069c
            int r0 = r8.f27286k
            r4 = r5
        L_0x067f:
            int r1 = r8.f27287l
            if (r0 >= r1) goto L_0x0696
            int[] r1 = r8.f27285j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x067f
        L_0x0696:
            if (r4 == 0) goto L_0x069b
            r14.o(r10, r4)
        L_0x069b:
            return
        L_0x069c:
            r15 = r10
            r6 = r13
            r7 = r14
            goto L_0x000f
        L_0x06a1:
            r0 = move-exception
            goto L_0x06ab
        L_0x06a3:
            r0 = move-exception
            r12 = r5
        L_0x06a5:
            r14 = r7
            goto L_0x06ab
        L_0x06a7:
            r0 = move-exception
            r12 = r5
        L_0x06a9:
            r14 = r7
            r10 = r15
        L_0x06ab:
            int r1 = r8.f27286k
            r7 = r1
            r4 = r5
        L_0x06af:
            int r1 = r8.f27287l
            if (r7 >= r1) goto L_0x06c6
            int[] r1 = r8.f27285j
            r3 = r1[r7]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.r(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x06af
        L_0x06c6:
            if (r4 == 0) goto L_0x06cb
            r14.o(r10, r4)
        L_0x06cb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.O(com.google.protobuf.v1, com.google.protobuf.r, java.lang.Object, com.google.protobuf.l1, com.google.protobuf.q):void");
    }

    private final <K, V> void P(Object obj, int i10, Object obj2, q qVar, l1 l1Var) throws IOException {
        long Z = Z(y0(i10));
        Object G = z1.G(obj, Z);
        if (G == null) {
            G = this.f27292q.e(obj2);
            z1.V(obj, Z, G);
        } else if (this.f27292q.g(G)) {
            Object e10 = this.f27292q.e(obj2);
            this.f27292q.a(e10, G);
            z1.V(obj, Z, e10);
            G = e10;
        }
        l1Var.E(this.f27292q.d(G), this.f27292q.c(obj2), qVar);
    }

    private void Q(T t10, T t11, int i10) {
        if (D(t11, i10)) {
            long Z = Z(y0(i10));
            Unsafe unsafe = f27275s;
            Object object = unsafe.getObject(t11, Z);
            if (object != null) {
                n1 w10 = w(i10);
                if (!D(t10, i10)) {
                    if (!I(object)) {
                        unsafe.putObject(t10, Z, object);
                    } else {
                        Object i11 = w10.i();
                        w10.a(i11, object);
                        unsafe.putObject(t10, Z, i11);
                    }
                    s0(t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, Z);
                if (!I(object2)) {
                    Object i12 = w10.i();
                    w10.a(i12, object2);
                    unsafe.putObject(t10, Z, i12);
                    object2 = i12;
                }
                w10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + Y(i10) + " is present but null: " + t11);
        }
    }

    private void R(T t10, T t11, int i10) {
        int Y = Y(i10);
        if (K(t11, Y, i10)) {
            long Z = Z(y0(i10));
            Unsafe unsafe = f27275s;
            Object object = unsafe.getObject(t11, Z);
            if (object != null) {
                n1 w10 = w(i10);
                if (!K(t10, Y, i10)) {
                    if (!I(object)) {
                        unsafe.putObject(t10, Z, object);
                    } else {
                        Object i11 = w10.i();
                        w10.a(i11, object);
                        unsafe.putObject(t10, Z, i11);
                    }
                    t0(t10, Y, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, Z);
                if (!I(object2)) {
                    Object i12 = w10.i();
                    w10.a(i12, object2);
                    unsafe.putObject(t10, Z, i12);
                    object2 = i12;
                }
                w10.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + Y(i10) + " is present but null: " + t11);
        }
    }

    private void S(T t10, T t11, int i10) {
        int y02 = y0(i10);
        long Z = Z(y02);
        int Y = Y(i10);
        switch (x0(y02)) {
            case 0:
                if (D(t11, i10)) {
                    z1.R(t10, Z, z1.A(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (D(t11, i10)) {
                    z1.S(t10, Z, z1.B(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (D(t11, i10)) {
                    z1.U(t10, Z, z1.E(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 3:
                if (D(t11, i10)) {
                    z1.U(t10, Z, z1.E(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 4:
                if (D(t11, i10)) {
                    z1.T(t10, Z, z1.C(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 5:
                if (D(t11, i10)) {
                    z1.U(t10, Z, z1.E(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 6:
                if (D(t11, i10)) {
                    z1.T(t10, Z, z1.C(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 7:
                if (D(t11, i10)) {
                    z1.L(t10, Z, z1.t(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (D(t11, i10)) {
                    z1.V(t10, Z, z1.G(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 9:
                Q(t10, t11, i10);
                return;
            case 10:
                if (D(t11, i10)) {
                    z1.V(t10, Z, z1.G(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 11:
                if (D(t11, i10)) {
                    z1.T(t10, Z, z1.C(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 12:
                if (D(t11, i10)) {
                    z1.T(t10, Z, z1.C(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 13:
                if (D(t11, i10)) {
                    z1.T(t10, Z, z1.C(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 14:
                if (D(t11, i10)) {
                    z1.U(t10, Z, z1.E(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 15:
                if (D(t11, i10)) {
                    z1.T(t10, Z, z1.C(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 16:
                if (D(t11, i10)) {
                    z1.U(t10, Z, z1.E(t11, Z));
                    s0(t10, i10);
                    return;
                }
                return;
            case 17:
                Q(t10, t11, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f27289n.d(t10, t11, Z);
                return;
            case 50:
                p1.F(this.f27292q, t10, t11, Z);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (K(t11, Y, i10)) {
                    z1.V(t10, Z, z1.G(t11, Z));
                    t0(t10, Y, i10);
                    return;
                }
                return;
            case 60:
                R(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (K(t11, Y, i10)) {
                    z1.V(t10, Z, z1.G(t11, Z));
                    t0(t10, Y, i10);
                    return;
                }
                return;
            case 68:
                R(t10, t11, i10);
                return;
            default:
                return;
        }
    }

    private Object T(T t10, int i10) {
        n1 w10 = w(i10);
        long Z = Z(y0(i10));
        if (!D(t10, i10)) {
            return w10.i();
        }
        Object object = f27275s.getObject(t10, Z);
        if (I(object)) {
            return object;
        }
        Object i11 = w10.i();
        if (object != null) {
            w10.a(i11, object);
        }
        return i11;
    }

    private Object U(T t10, int i10, int i11) {
        n1 w10 = w(i11);
        if (!K(t10, i10, i11)) {
            return w10.i();
        }
        Object object = f27275s.getObject(t10, Z(y0(i11)));
        if (I(object)) {
            return object;
        }
        Object i12 = w10.i();
        if (object != null) {
            w10.a(i12, object);
        }
        return i12;
    }

    static <T> y0<T> V(Class<T> cls, t0 t0Var, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, r<?> rVar, q0 q0Var) {
        if (t0Var instanceof k1) {
            return X((k1) t0Var, a1Var, l0Var, v1Var, rVar, q0Var);
        }
        return W((r1) t0Var, a1Var, l0Var, v1Var, rVar, q0Var);
    }

    static <T> y0<T> W(r1 r1Var, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, r<?> rVar, q0 q0Var) {
        boolean z10 = r1Var.c() == h1.PROTO3;
        u[] e10 = r1Var.e();
        if (e10.length == 0) {
            int length = e10.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e10.length <= 0) {
                int[] d10 = r1Var.d();
                if (d10 == null) {
                    d10 = f27274r;
                }
                if (e10.length <= 0) {
                    int[] iArr2 = f27274r;
                    int[] iArr3 = f27274r;
                    int[] iArr4 = new int[(d10.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d10, 0, iArr4, 0, d10.length);
                    System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
                    return new y0(iArr, objArr, 0, 0, r1Var.b(), z10, true, iArr4, d10.length, d10.length + iArr2.length, a1Var, l0Var, v1Var, rVar, q0Var);
                }
                u uVar = e10[0];
                throw null;
            }
            u uVar2 = e10[0];
            throw null;
        }
        u uVar3 = e10[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.protobuf.y0<T> X(com.google.protobuf.k1 r34, com.google.protobuf.a1 r35, com.google.protobuf.l0 r36, com.google.protobuf.v1<?, ?> r37, com.google.protobuf.r<?> r38, com.google.protobuf.q0 r39) {
        /*
            com.google.protobuf.h1 r0 = r34.c()
            com.google.protobuf.h1 r1 = com.google.protobuf.h1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r34.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f27274r
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0161
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0161:
            sun.misc.Unsafe r15 = f27275s
            java.lang.Object[] r17 = r34.d()
            com.google.protobuf.v0 r18 = r34.b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0180:
            if (r4 >= r1) goto L_0x03c0
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0190:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0190
        L_0x01a2:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01aa
        L_0x01a8:
            r3 = r24
        L_0x01aa:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b8:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d1
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b8
        L_0x01d1:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01db
        L_0x01d7:
            r28 = r1
            r1 = r24
        L_0x01db:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e8
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e8:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0217
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fd:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0212
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fd
        L_0x0212:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0217:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0237
            r14 = 17
            if (r12 != r14) goto L_0x0224
            goto L_0x0237
        L_0x0224:
            r14 = 12
            if (r12 != r14) goto L_0x0245
            if (r10 != 0) goto L_0x0245
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0243
        L_0x0237:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0243:
            r16 = r14
        L_0x0245:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0250
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0258
        L_0x0250:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = r0(r2, r12)
            r17[r1] = r12
        L_0x0258:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r9 = (int) r8
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026b
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0273
        L_0x026b:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = r0(r2, r8)
            r17[r1] = r8
        L_0x0273:
            r1 = r9
            long r8 = r15.objectFieldOffset(r8)
            int r9 = (int) r8
            r31 = r0
            r0 = r10
            r8 = r11
            r29 = r32
            r25 = 1
            r10 = r9
            r9 = r1
            r1 = 0
            goto L_0x0388
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = r0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r9 = (int) r8
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r8 != r12) goto L_0x031c
            r8 = 1
            goto L_0x031d
        L_0x031c:
            r8 = 0
        L_0x031d:
            if (r8 == 0) goto L_0x036e
            r8 = 17
            if (r5 > r8) goto L_0x036e
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r29 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r12) goto L_0x0344
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r1 = r1 | r8
            int r26 = r26 + 13
            r8 = r29
            goto L_0x0332
        L_0x0344:
            int r8 = r8 << r26
            r1 = r1 | r8
            goto L_0x034a
        L_0x0348:
            r29 = r8
        L_0x034a:
            int r8 = r6 * 2
            int r26 = r1 / 32
            int r8 = r8 + r26
            r12 = r17[r8]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035b
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0363
        L_0x035b:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = r0(r2, r12)
            r17[r8] = r12
        L_0x0363:
            r0 = r10
            r8 = r11
            long r10 = r15.objectFieldOffset(r12)
            int r11 = (int) r10
            int r1 = r1 % 32
            r10 = r11
            goto L_0x0378
        L_0x036e:
            r31 = r0
            r0 = r10
            r8 = r11
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0378:
            r11 = 18
            if (r5 < r11) goto L_0x0386
            r11 = 49
            if (r5 > r11) goto L_0x0386
            int r11 = r23 + 1
            r13[r23] = r9
            r23 = r11
        L_0x0386:
            r16 = r27
        L_0x0388:
            int r11 = r21 + 1
            r7[r21] = r4
            int r4 = r11 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0395
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0396
        L_0x0395:
            r12 = 0
        L_0x0396:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039d
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039e
        L_0x039d:
            r3 = 0
        L_0x039e:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r9
            r7[r11] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r10
            r7[r4] = r1
            r10 = r0
            r11 = r8
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0180
        L_0x03c0:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            r8 = r11
            com.google.protobuf.y0 r1 = new com.google.protobuf.y0
            com.google.protobuf.v0 r9 = r34.b()
            r11 = 0
            r4 = r1
            r5 = r7
            r6 = r8
            r7 = r14
            r8 = r33
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.X(com.google.protobuf.k1, com.google.protobuf.a1, com.google.protobuf.l0, com.google.protobuf.v1, com.google.protobuf.r, com.google.protobuf.q0):com.google.protobuf.y0");
    }

    private int Y(int i10) {
        return this.f27276a[i10];
    }

    private static long Z(int i10) {
        return (long) (i10 & 1048575);
    }

    private static <T> boolean a0(T t10, long j10) {
        return ((Boolean) z1.G(t10, j10)).booleanValue();
    }

    private static <T> double b0(T t10, long j10) {
        return ((Double) z1.G(t10, j10)).doubleValue();
    }

    private static <T> float c0(T t10, long j10) {
        return ((Float) z1.G(t10, j10)).floatValue();
    }

    private static <T> int d0(T t10, long j10) {
        return ((Integer) z1.G(t10, j10)).intValue();
    }

    private static <T> long e0(T t10, long j10) {
        return ((Long) z1.G(t10, j10)).longValue();
    }

    private <K, V> int f0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, f.b bVar) throws IOException {
        T t11 = t10;
        long j11 = j10;
        Unsafe unsafe = f27275s;
        int i13 = i12;
        Object v10 = v(i12);
        Object object = unsafe.getObject(t10, j11);
        if (this.f27292q.g(object)) {
            Object e10 = this.f27292q.e(v10);
            this.f27292q.a(e10, object);
            unsafe.putObject(t10, j11, e10);
            object = e10;
        }
        return n(bArr, i10, i11, this.f27292q.c(v10), this.f27292q.d(object), bVar);
    }

    private int g0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, f.b bVar) throws IOException {
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        f.b bVar2 = bVar;
        Unsafe unsafe = f27275s;
        long j12 = (long) (this.f27276a[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(f.d(bArr, i10)));
                    int i23 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(f.l(bArr, i10)));
                    int i24 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int L = f.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(bVar2.f27004b));
                    unsafe.putInt(t11, j12, i20);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int I = f.I(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(bVar2.f27003a));
                    unsafe.putInt(t11, j12, i20);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(f.j(bArr, i10)));
                    int i25 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(f.h(bArr, i10)));
                    int i26 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i26;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int L2 = f.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Boolean.valueOf(bVar2.f27004b != 0));
                    unsafe.putInt(t11, j12, i20);
                    return L2;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int I2 = f.I(bArr2, i18, bVar2);
                    int i27 = bVar2.f27003a;
                    if (i27 == 0) {
                        unsafe.putObject(t11, j11, MaxReward.DEFAULT_LABEL);
                    } else if ((i15 & 536870912) == 0 || a2.t(bArr2, I2, I2 + i27)) {
                        unsafe.putObject(t11, j11, new String(bArr2, I2, i27, d0.f26986b));
                        I2 += i27;
                    } else {
                        throw e0.d();
                    }
                    unsafe.putInt(t11, j12, i20);
                    return I2;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object U = U(t11, i20, i22);
                    int O = f.O(U, w(i22), bArr, i10, i11, bVar);
                    w0(t11, i20, i22, U);
                    return O;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int b10 = f.b(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, bVar2.f27005c);
                    unsafe.putInt(t11, j12, i20);
                    return b10;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int I3 = f.I(bArr2, i18, bVar2);
                    int i28 = bVar2.f27003a;
                    d0.e u10 = u(i22);
                    if (u10 == null || u10.a(i28)) {
                        unsafe.putObject(t11, j11, Integer.valueOf(i28));
                        unsafe.putInt(t11, j12, i20);
                    } else {
                        x(t10).n(i19, Long.valueOf((long) i28));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int I4 = f.I(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(j.b(bVar2.f27003a)));
                    unsafe.putInt(t11, j12, i20);
                    return I4;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int L3 = f.L(bArr2, i18, bVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(j.c(bVar2.f27004b)));
                    unsafe.putInt(t11, j12, i20);
                    return L3;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object U2 = U(t11, i20, i22);
                    int N = f.N(U2, w(i22), bArr, i10, i11, (i19 & -8) | 4, bVar);
                    w0(t11, i20, i22, U2);
                    return N;
                }
                break;
        }
        return i18;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0297, code lost:
        if (r0 != r15) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ba, code lost:
        if (r0 != r15) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02bd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r13 = r19;
        r19 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018d, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a2, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b4, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b7, code lost:
        r2 = r4;
        r28 = r10;
        r20 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0250, code lost:
        if (r0 != r15) goto L_0x0252;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int i0(T r31, byte[] r32, int r33, int r34, com.google.protobuf.f.b r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            m(r31)
            sun.misc.Unsafe r9 = f27275s
            r10 = -1
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x02e2
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.protobuf.f.H(r0, r12, r3, r11)
            int r3 = r11.f27003a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.l0(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.k0(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r19 = r5
            r28 = r9
            r18 = -1
            r20 = 0
            goto L_0x02bf
        L_0x004e:
            int[] r0 = r15.f27276a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = x0(r1)
            r18 = r9
            long r8 = Z(r1)
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x01c0
            int[] r10 = r15.f27276a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            r23 = r1
            r19 = r2
            if (r10 == r7) goto L_0x0092
            if (r7 == r13) goto L_0x0082
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0084
        L_0x0082:
            r7 = r18
        L_0x0084:
            if (r10 == r13) goto L_0x008c
            long r1 = (long) r10
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008c:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0094
        L_0x0092:
            r10 = r18
        L_0x0094:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01a5;
                case 1: goto L_0x0195;
                case 2: goto L_0x017a;
                case 3: goto L_0x017a;
                case 4: goto L_0x016a;
                case 5: goto L_0x0153;
                case 6: goto L_0x0145;
                case 7: goto L_0x012c;
                case 8: goto L_0x010f;
                case 9: goto L_0x00ef;
                case 10: goto L_0x00dd;
                case 11: goto L_0x016a;
                case 12: goto L_0x00cc;
                case 13: goto L_0x0145;
                case 14: goto L_0x0153;
                case 15: goto L_0x00b7;
                case 16: goto L_0x009e;
                default: goto L_0x0098;
            }
        L_0x0098:
            r13 = r19
            r19 = r33
            goto L_0x01b7
        L_0x009e:
            if (r3 != 0) goto L_0x0098
            int r17 = com.google.protobuf.f.L(r12, r4, r11)
            long r0 = r11.f27004b
            long r4 = com.google.protobuf.j.c(r0)
            r0 = r10
            r1 = r31
            r13 = r19
            r2 = r8
            r19 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x018d
        L_0x00b7:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r0 = com.google.protobuf.f.I(r12, r4, r11)
            int r1 = r11.f27003a
            int r1 = com.google.protobuf.j.b(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x01b4
        L_0x00cc:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r0 = com.google.protobuf.f.I(r12, r4, r11)
            int r1 = r11.f27003a
            r10.putInt(r14, r8, r1)
            goto L_0x01b4
        L_0x00dd:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x01b7
            int r0 = com.google.protobuf.f.b(r12, r4, r11)
            java.lang.Object r1 = r11.f27005c
            r10.putObject(r14, r8, r1)
            goto L_0x01b4
        L_0x00ef:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x01b7
            java.lang.Object r8 = r15.T(r14, r13)
            com.google.protobuf.n1 r1 = r15.w(r13)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.google.protobuf.f.O(r0, r1, r2, r3, r4, r5)
            r15.v0(r14, r13, r8)
            goto L_0x01b4
        L_0x010f:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x01b7
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0121
            int r0 = com.google.protobuf.f.C(r12, r4, r11)
            goto L_0x0125
        L_0x0121:
            int r0 = com.google.protobuf.f.F(r12, r4, r11)
        L_0x0125:
            java.lang.Object r1 = r11.f27005c
            r10.putObject(r14, r8, r1)
            goto L_0x01b4
        L_0x012c:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r0 = com.google.protobuf.f.L(r12, r4, r11)
            long r1 = r11.f27004b
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r5 = 0
        L_0x0140:
            com.google.protobuf.z1.L(r14, r8, r5)
            goto L_0x01b4
        L_0x0145:
            r13 = r19
            r19 = r33
            if (r3 != r1) goto L_0x01b7
            int r0 = com.google.protobuf.f.h(r12, r4)
            r10.putInt(r14, r8, r0)
            goto L_0x01a2
        L_0x0153:
            r13 = r19
            r19 = r33
            if (r3 != r5) goto L_0x01b7
            long r22 = com.google.protobuf.f.j(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x01b4
        L_0x016a:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r0 = com.google.protobuf.f.I(r12, r4, r11)
            int r1 = r11.f27003a
            r10.putInt(r14, r8, r1)
            goto L_0x01b4
        L_0x017a:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r17 = com.google.protobuf.f.L(r12, r4, r11)
            long r4 = r11.f27004b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x018d:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x0202
        L_0x0195:
            r13 = r19
            r19 = r33
            if (r3 != r1) goto L_0x01b7
            float r0 = com.google.protobuf.f.l(r12, r4)
            com.google.protobuf.z1.S(r14, r8, r0)
        L_0x01a2:
            int r0 = r4 + 4
            goto L_0x01b4
        L_0x01a5:
            r13 = r19
            r19 = r33
            if (r3 != r5) goto L_0x01b7
            double r0 = com.google.protobuf.f.d(r12, r4)
            com.google.protobuf.z1.R(r14, r8, r0)
            int r0 = r4 + 8
        L_0x01b4:
            r6 = r6 | r21
            goto L_0x0200
        L_0x01b7:
            r2 = r4
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x02bf
        L_0x01c0:
            r19 = r33
            r23 = r1
            r13 = r2
            r10 = r18
            r1 = 27
            if (r0 != r1) goto L_0x0216
            r1 = 2
            if (r3 != r1) goto L_0x0209
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.protobuf.d0$j r0 = (com.google.protobuf.d0.j) r0
            boolean r1 = r0.t()
            if (r1 != 0) goto L_0x01ec
            int r1 = r0.size()
            if (r1 != 0) goto L_0x01e3
            r1 = 10
            goto L_0x01e5
        L_0x01e3:
            int r1 = r1 * 2
        L_0x01e5:
            com.google.protobuf.d0$j r0 = r0.d(r1)
            r10.putObject(r14, r8, r0)
        L_0x01ec:
            r5 = r0
            com.google.protobuf.n1 r0 = r15.w(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.protobuf.f.q(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0200:
            r9 = r10
            r2 = r13
        L_0x0202:
            r1 = r19
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0209:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x029a
        L_0x0216:
            r1 = 49
            if (r0 > r1) goto L_0x0266
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r19
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r20 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.j0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02bd
        L_0x0252:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r2 = r20
            r6 = r24
            r7 = r25
            goto L_0x02dd
        L_0x0266:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r20 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02a0
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x029a
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r26
            r8 = r35
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02bd
            goto L_0x0252
        L_0x029a:
            r2 = r15
        L_0x029b:
            r6 = r24
            r7 = r25
            goto L_0x02bf
        L_0x02a0:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r19
            r10 = r26
            r12 = r20
            r13 = r35
            int r0 = r0.g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02bd
            goto L_0x0252
        L_0x02bd:
            r2 = r0
            goto L_0x029b
        L_0x02bf:
            com.google.protobuf.w1 r4 = x(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.protobuf.f.G(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r2 = r20
        L_0x02dd:
            r9 = r28
            r10 = -1
            goto L_0x001a
        L_0x02e2:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x02f5
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x02f5:
            r1 = r34
            if (r0 != r1) goto L_0x02fa
            return r0
        L_0x02fa:
            com.google.protobuf.e0 r0 = com.google.protobuf.e0.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.i0(java.lang.Object, byte[], int, int, com.google.protobuf.f$b):int");
    }

    private int j0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, f.b bVar) throws IOException {
        int i17;
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i14;
        int i20 = i15;
        long j12 = j11;
        f.b bVar2 = bVar;
        Unsafe unsafe = f27275s;
        d0.j jVar = (d0.j) unsafe.getObject(t10, j12);
        if (!jVar.t()) {
            int size = jVar.size();
            jVar = jVar.d(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j12, jVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i19 == 2) {
                    return f.s(bArr, i18, jVar, bVar2);
                }
                if (i19 == 1) {
                    return f.e(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i19 == 2) {
                    return f.v(bArr, i18, jVar, bVar2);
                }
                if (i19 == 5) {
                    return f.m(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i19 == 2) {
                    return f.z(bArr, i18, jVar, bVar2);
                }
                if (i19 == 0) {
                    return f.M(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i19 == 2) {
                    return f.y(bArr, i18, jVar, bVar2);
                }
                if (i19 == 0) {
                    return f.J(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i19 == 2) {
                    return f.u(bArr, i18, jVar, bVar2);
                }
                if (i19 == 1) {
                    return f.k(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i19 == 2) {
                    return f.t(bArr, i18, jVar, bVar2);
                }
                if (i19 == 5) {
                    return f.i(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i19 == 2) {
                    return f.r(bArr, i18, jVar, bVar2);
                }
                if (i19 == 0) {
                    return f.a(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 26:
                if (i19 == 2) {
                    if ((j10 & 536870912) == 0) {
                        return f.D(i12, bArr, i10, i11, jVar, bVar);
                    }
                    return f.E(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 27:
                if (i19 == 2) {
                    return f.q(w(i20), i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 28:
                if (i19 == 2) {
                    return f.c(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i19 == 2) {
                    i17 = f.y(bArr, i18, jVar, bVar2);
                } else if (i19 == 0) {
                    i17 = f.J(i12, bArr, i10, i11, jVar, bVar);
                }
                p1.A(t10, i13, jVar, u(i20), null, this.f27290o);
                return i17;
            case 33:
            case 47:
                if (i19 == 2) {
                    return f.w(bArr, i18, jVar, bVar2);
                }
                if (i19 == 0) {
                    return f.A(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i19 == 2) {
                    return f.x(bArr, i18, jVar, bVar2);
                }
                if (i19 == 0) {
                    return f.B(i12, bArr, i10, i11, jVar, bVar);
                }
                break;
            case 49:
                if (i19 == 3) {
                    return f.o(w(i20), i12, bArr, i10, i11, jVar, bVar);
                }
                break;
        }
        return i18;
    }

    private boolean k(T t10, T t11, int i10) {
        return D(t10, i10) == D(t11, i10);
    }

    private int k0(int i10) {
        if (i10 < this.f27278c || i10 > this.f27279d) {
            return -1;
        }
        return u0(i10, 0);
    }

    private static <T> boolean l(T t10, long j10) {
        return z1.t(t10, j10);
    }

    private int l0(int i10, int i11) {
        if (i10 < this.f27278c || i10 > this.f27279d) {
            return -1;
        }
        return u0(i10, i11);
    }

    private static void m(Object obj) {
        if (!I(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    private int m0(int i10) {
        return this.f27276a[i10 + 2];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <K, V> int n(byte[] r15, int r16, int r17, com.google.protobuf.o0.a<K, V> r18, java.util.Map<K, V> r19, com.google.protobuf.f.b r20) throws java.io.IOException {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = com.google.protobuf.f.I(r15, r0, r10)
            int r1 = r10.f27003a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.f27166b
            V r2 = r9.f27168d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.protobuf.f.H(r0, r15, r1, r10)
            int r1 = r10.f27003a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            com.google.protobuf.b2$b r1 = r9.f27167c
            int r1 = r1.d()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.b2$b r4 = r9.f27167c
            V r0 = r9.f27168d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.f27005c
            goto L_0x001d
        L_0x0057:
            com.google.protobuf.b2$b r1 = r9.f27165a
            int r1 = r1.d()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.b2$b r4 = r9.f27165a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.f27005c
            goto L_0x001d
        L_0x006f:
            int r0 = com.google.protobuf.f.P(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            com.google.protobuf.e0 r0 = com.google.protobuf.e0.h()
            throw r0
        L_0x0081:
            com.google.protobuf.e0 r0 = com.google.protobuf.e0.m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.n(byte[], int, int, com.google.protobuf.o0$a, java.util.Map, com.google.protobuf.f$b):int");
    }

    private <E> void n0(Object obj, long j10, l1 l1Var, n1<E> n1Var, q qVar) throws IOException {
        l1Var.f(this.f27289n.e(obj, j10), n1Var, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r3 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int o(byte[] r2, int r3, int r4, com.google.protobuf.b2.b r5, java.lang.Class<?> r6, com.google.protobuf.f.b r7) throws java.io.IOException {
        /*
            r1 = this;
            int[] r0 = com.google.protobuf.y0.a.f27293a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = com.google.protobuf.f.F(r2, r3, r7)
            goto L_0x00ae
        L_0x0019:
            int r2 = com.google.protobuf.f.L(r2, r3, r7)
            long r3 = r7.f27004b
            long r3 = com.google.protobuf.j.c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f27005c = r3
            goto L_0x00ae
        L_0x002b:
            int r2 = com.google.protobuf.f.I(r2, r3, r7)
            int r3 = r7.f27003a
            int r3 = com.google.protobuf.j.b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f27005c = r3
            goto L_0x00ae
        L_0x003d:
            com.google.protobuf.i1 r5 = com.google.protobuf.i1.a()
            com.google.protobuf.n1 r5 = r5.c(r6)
            int r2 = com.google.protobuf.f.p(r5, r2, r3, r4, r7)
            goto L_0x00ae
        L_0x004a:
            int r2 = com.google.protobuf.f.L(r2, r3, r7)
            long r3 = r7.f27004b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f27005c = r3
            goto L_0x00ae
        L_0x0057:
            int r2 = com.google.protobuf.f.I(r2, r3, r7)
            int r3 = r7.f27003a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f27005c = r3
            goto L_0x00ae
        L_0x0064:
            float r2 = com.google.protobuf.f.l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.f27005c = r2
            goto L_0x0084
        L_0x006f:
            long r4 = com.google.protobuf.f.j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.f27005c = r2
            goto L_0x0091
        L_0x007a:
            int r2 = com.google.protobuf.f.h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.f27005c = r2
        L_0x0084:
            int r2 = r3 + 4
            goto L_0x00ae
        L_0x0087:
            double r4 = com.google.protobuf.f.d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.f27005c = r2
        L_0x0091:
            int r2 = r3 + 8
            goto L_0x00ae
        L_0x0094:
            int r2 = com.google.protobuf.f.b(r2, r3, r7)
            goto L_0x00ae
        L_0x0099:
            int r2 = com.google.protobuf.f.L(r2, r3, r7)
            long r3 = r7.f27004b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.f27005c = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.o(byte[], int, int, com.google.protobuf.b2$b, java.lang.Class, com.google.protobuf.f$b):int");
    }

    private <E> void o0(Object obj, int i10, l1 l1Var, n1<E> n1Var, q qVar) throws IOException {
        l1Var.m(this.f27289n.e(obj, Z(i10)), n1Var, qVar);
    }

    private static <T> double p(T t10, long j10) {
        return z1.A(t10, j10);
    }

    private void p0(Object obj, int i10, l1 l1Var) throws IOException {
        if (C(i10)) {
            z1.V(obj, Z(i10), l1Var.O());
        } else if (this.f27282g) {
            z1.V(obj, Z(i10), l1Var.z());
        } else {
            z1.V(obj, Z(i10), l1Var.G());
        }
    }

    private boolean q(T t10, T t11, int i10) {
        int y02 = y0(i10);
        long Z = Z(y02);
        switch (x0(y02)) {
            case 0:
                if (!k(t10, t11, i10) || Double.doubleToLongBits(z1.A(t10, Z)) != Double.doubleToLongBits(z1.A(t11, Z))) {
                    return false;
                }
                return true;
            case 1:
                if (!k(t10, t11, i10) || Float.floatToIntBits(z1.B(t10, Z)) != Float.floatToIntBits(z1.B(t11, Z))) {
                    return false;
                }
                return true;
            case 2:
                if (!k(t10, t11, i10) || z1.E(t10, Z) != z1.E(t11, Z)) {
                    return false;
                }
                return true;
            case 3:
                if (!k(t10, t11, i10) || z1.E(t10, Z) != z1.E(t11, Z)) {
                    return false;
                }
                return true;
            case 4:
                if (!k(t10, t11, i10) || z1.C(t10, Z) != z1.C(t11, Z)) {
                    return false;
                }
                return true;
            case 5:
                if (!k(t10, t11, i10) || z1.E(t10, Z) != z1.E(t11, Z)) {
                    return false;
                }
                return true;
            case 6:
                if (!k(t10, t11, i10) || z1.C(t10, Z) != z1.C(t11, Z)) {
                    return false;
                }
                return true;
            case 7:
                if (!k(t10, t11, i10) || z1.t(t10, Z) != z1.t(t11, Z)) {
                    return false;
                }
                return true;
            case 8:
                if (!k(t10, t11, i10) || !p1.K(z1.G(t10, Z), z1.G(t11, Z))) {
                    return false;
                }
                return true;
            case 9:
                if (!k(t10, t11, i10) || !p1.K(z1.G(t10, Z), z1.G(t11, Z))) {
                    return false;
                }
                return true;
            case 10:
                if (!k(t10, t11, i10) || !p1.K(z1.G(t10, Z), z1.G(t11, Z))) {
                    return false;
                }
                return true;
            case 11:
                if (!k(t10, t11, i10) || z1.C(t10, Z) != z1.C(t11, Z)) {
                    return false;
                }
                return true;
            case 12:
                if (!k(t10, t11, i10) || z1.C(t10, Z) != z1.C(t11, Z)) {
                    return false;
                }
                return true;
            case 13:
                if (!k(t10, t11, i10) || z1.C(t10, Z) != z1.C(t11, Z)) {
                    return false;
                }
                return true;
            case 14:
                if (!k(t10, t11, i10) || z1.E(t10, Z) != z1.E(t11, Z)) {
                    return false;
                }
                return true;
            case 15:
                if (!k(t10, t11, i10) || z1.C(t10, Z) != z1.C(t11, Z)) {
                    return false;
                }
                return true;
            case 16:
                if (!k(t10, t11, i10) || z1.E(t10, Z) != z1.E(t11, Z)) {
                    return false;
                }
                return true;
            case 17:
                if (!k(t10, t11, i10) || !p1.K(z1.G(t10, Z), z1.G(t11, Z))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return p1.K(z1.G(t10, Z), z1.G(t11, Z));
            case 50:
                return p1.K(z1.G(t10, Z), z1.G(t11, Z));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!J(t10, t11, i10) || !p1.K(z1.G(t10, Z), z1.G(t11, Z))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private void q0(Object obj, int i10, l1 l1Var) throws IOException {
        if (C(i10)) {
            l1Var.F(this.f27289n.e(obj, Z(i10)));
        } else {
            l1Var.C(this.f27289n.e(obj, Z(i10)));
        }
    }

    private <UT, UB> UB r(Object obj, int i10, UB ub2, v1<UT, UB> v1Var, Object obj2) {
        d0.e u10;
        int Y = Y(i10);
        Object G = z1.G(obj, Z(y0(i10)));
        if (G == null || (u10 = u(i10)) == null) {
            return ub2;
        }
        return s(i10, Y, this.f27292q.d(G), u10, ub2, v1Var, obj2);
    }

    private static Field r0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private <K, V, UT, UB> UB s(int i10, int i11, Map<K, V> map, d0.e eVar, UB ub2, v1<UT, UB> v1Var, Object obj) {
        o0.a<?, ?> c10 = this.f27292q.c(v(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = v1Var.f(obj);
                }
                i.h C = i.C(o0.b(c10, next.getKey(), next.getValue()));
                try {
                    o0.e(C.b(), c10, next.getKey(), next.getValue());
                    v1Var.d(ub2, i11, C.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void s0(T t10, int i10) {
        int m02 = m0(i10);
        long j10 = (long) (1048575 & m02);
        if (j10 != 1048575) {
            z1.T(t10, j10, (1 << (m02 >>> 20)) | z1.C(t10, j10));
        }
    }

    private static <T> float t(T t10, long j10) {
        return z1.B(t10, j10);
    }

    private void t0(T t10, int i10, int i11) {
        z1.T(t10, (long) (m0(i11) & 1048575), i10);
    }

    private d0.e u(int i10) {
        return (d0.e) this.f27277b[((i10 / 3) * 2) + 1];
    }

    private int u0(int i10, int i11) {
        int length = (this.f27276a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int Y = Y(i13);
            if (i10 == Y) {
                return i13;
            }
            if (i10 < Y) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private Object v(int i10) {
        return this.f27277b[(i10 / 3) * 2];
    }

    private void v0(T t10, int i10, Object obj) {
        f27275s.putObject(t10, Z(y0(i10)), obj);
        s0(t10, i10);
    }

    private n1 w(int i10) {
        int i11 = (i10 / 3) * 2;
        n1 n1Var = (n1) this.f27277b[i11];
        if (n1Var != null) {
            return n1Var;
        }
        n1 c10 = i1.a().c((Class) this.f27277b[i11 + 1]);
        this.f27277b[i11] = c10;
        return c10;
    }

    private void w0(T t10, int i10, int i11, Object obj) {
        f27275s.putObject(t10, Z(y0(i11)), obj);
        t0(t10, i10, i11);
    }

    static w1 x(Object obj) {
        z zVar = (z) obj;
        w1 w1Var = zVar.unknownFields;
        if (w1Var != w1.c()) {
            return w1Var;
        }
        w1 k10 = w1.k();
        zVar.unknownFields = k10;
        return k10;
    }

    private static int x0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0346, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0460, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0517, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int y(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f27275s
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.f27276a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x051e
            int r9 = r0.y0(r5)
            int r10 = r0.Y(r5)
            int r11 = x0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x003a
            int[] r12 = r0.f27276a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r3
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0058
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0058
        L_0x003a:
            boolean r12 = r0.f27284i
            if (r12 == 0) goto L_0x0056
            com.google.protobuf.w r12 = com.google.protobuf.w.DOUBLE_LIST_PACKED
            int r12 = r12.c()
            if (r11 < r12) goto L_0x0056
            com.google.protobuf.w r12 = com.google.protobuf.w.SINT64_LIST_PACKED
            int r12 = r12.c()
            if (r11 > r12) goto L_0x0056
            int[] r12 = r0.f27276a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r3
            goto L_0x0057
        L_0x0056:
            r12 = 0
        L_0x0057:
            r15 = 0
        L_0x0058:
            long r13 = Z(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050b;
                case 1: goto L_0x0501;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e5;
                case 4: goto L_0x04d7;
                case 5: goto L_0x04cd;
                case 6: goto L_0x04c3;
                case 7: goto L_0x04b8;
                case 8: goto L_0x049c;
                case 9: goto L_0x048b;
                case 10: goto L_0x047c;
                case 11: goto L_0x046f;
                case 12: goto L_0x0462;
                case 13: goto L_0x0457;
                case 14: goto L_0x044e;
                case 15: goto L_0x0441;
                case 16: goto L_0x0434;
                case 17: goto L_0x0421;
                case 18: goto L_0x0412;
                case 19: goto L_0x0406;
                case 20: goto L_0x03fa;
                case 21: goto L_0x03ee;
                case 22: goto L_0x03e2;
                case 23: goto L_0x03d6;
                case 24: goto L_0x03ca;
                case 25: goto L_0x03be;
                case 26: goto L_0x03b3;
                case 27: goto L_0x03a4;
                case 28: goto L_0x0398;
                case 29: goto L_0x038b;
                case 30: goto L_0x037e;
                case 31: goto L_0x0371;
                case 32: goto L_0x0364;
                case 33: goto L_0x0357;
                case 34: goto L_0x034a;
                case 35: goto L_0x032a;
                case 36: goto L_0x030d;
                case 37: goto L_0x02f0;
                case 38: goto L_0x02d3;
                case 39: goto L_0x02b5;
                case 40: goto L_0x0297;
                case 41: goto L_0x0279;
                case 42: goto L_0x025b;
                case 43: goto L_0x023d;
                case 44: goto L_0x021f;
                case 45: goto L_0x0201;
                case 46: goto L_0x01e3;
                case 47: goto L_0x01c5;
                case 48: goto L_0x01a7;
                case 49: goto L_0x0197;
                case 50: goto L_0x0187;
                case 51: goto L_0x0179;
                case 52: goto L_0x016d;
                case 53: goto L_0x015d;
                case 54: goto L_0x014d;
                case 55: goto L_0x013d;
                case 56: goto L_0x0131;
                case 57: goto L_0x0124;
                case 58: goto L_0x0117;
                case 59: goto L_0x00f9;
                case 60: goto L_0x00e5;
                case 61: goto L_0x00d3;
                case 62: goto L_0x00c3;
                case 63: goto L_0x00b3;
                case 64: goto L_0x00a6;
                case 65: goto L_0x009a;
                case 66: goto L_0x008a;
                case 67: goto L_0x007a;
                case 68: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x041e
        L_0x0064:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.v0 r3 = (com.google.protobuf.v0) r3
            com.google.protobuf.n1 r4 = r0.w(r5)
            int r3 = com.google.protobuf.l.t(r10, r3, r4)
            goto L_0x041d
        L_0x007a:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = e0(r1, r13)
            int r3 = com.google.protobuf.l.R(r10, r3)
            goto L_0x041d
        L_0x008a:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = d0(r1, r13)
            int r3 = com.google.protobuf.l.P(r10, r3)
            goto L_0x041d
        L_0x009a:
            boolean r9 = r0.K(r1, r10, r5)
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.l.N(r10, r3)
            goto L_0x041d
        L_0x00a6:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.l.L(r10, r3)
            goto L_0x0460
        L_0x00b3:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = d0(r1, r13)
            int r3 = com.google.protobuf.l.l(r10, r3)
            goto L_0x041d
        L_0x00c3:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = d0(r1, r13)
            int r3 = com.google.protobuf.l.W(r10, r3)
            goto L_0x041d
        L_0x00d3:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            int r3 = com.google.protobuf.l.h(r10, r3)
            goto L_0x041d
        L_0x00e5:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.n1 r4 = r0.w(r5)
            int r3 = com.google.protobuf.p1.o(r10, r3, r4)
            goto L_0x041d
        L_0x00f9:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.i
            if (r4 == 0) goto L_0x010f
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            int r3 = com.google.protobuf.l.h(r10, r3)
            goto L_0x041d
        L_0x010f:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.l.T(r10, r3)
            goto L_0x041d
        L_0x0117:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 1
            int r3 = com.google.protobuf.l.e(r10, r3)
            goto L_0x041d
        L_0x0124:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.l.n(r10, r3)
            goto L_0x0460
        L_0x0131:
            boolean r9 = r0.K(r1, r10, r5)
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.l.p(r10, r3)
            goto L_0x041d
        L_0x013d:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = d0(r1, r13)
            int r3 = com.google.protobuf.l.w(r10, r3)
            goto L_0x041d
        L_0x014d:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = e0(r1, r13)
            int r3 = com.google.protobuf.l.Y(r10, r3)
            goto L_0x041d
        L_0x015d:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = e0(r1, r13)
            int r3 = com.google.protobuf.l.y(r10, r3)
            goto L_0x041d
        L_0x016d:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = com.google.protobuf.l.r(r10, r9)
            goto L_0x041d
        L_0x0179:
            boolean r3 = r0.K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r3 = com.google.protobuf.l.j(r10, r3)
            goto L_0x041d
        L_0x0187:
            com.google.protobuf.q0 r3 = r0.f27292q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.v(r5)
            int r3 = r3.f(r10, r4, r9)
            goto L_0x041d
        L_0x0197:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.n1 r4 = r0.w(r5)
            int r3 = com.google.protobuf.p1.j(r10, r3, r4)
            goto L_0x041d
        L_0x01a7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.t(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x01bb
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01bb:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x01c5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.r(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x01d9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01d9:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x01e3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x01f7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01f7:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x0201:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x0215
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0215:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x021f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.e(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x0233
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0233:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x023d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.w(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x0251
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0251:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x025b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.b(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x026f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x026f:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x0279:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x028d
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x028d:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x0297:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x02ab
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02ab:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x02b5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.l(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x02c9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02c9:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x02d3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.y(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x02e7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02e7:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x02f0:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.n(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x0304
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0304:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x030d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x0321
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0321:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
            goto L_0x0346
        L_0x032a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f27284i
            if (r4 == 0) goto L_0x033e
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x033e:
            int r4 = com.google.protobuf.l.V(r10)
            int r9 = com.google.protobuf.l.X(r3)
        L_0x0346:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x0460
        L_0x034a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.p1.s(r10, r3, r4)
            goto L_0x041d
        L_0x0357:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.q(r10, r3, r4)
            goto L_0x041d
        L_0x0364:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.h(r10, r3, r4)
            goto L_0x041d
        L_0x0371:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.f(r10, r3, r4)
            goto L_0x041d
        L_0x037e:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.d(r10, r3, r4)
            goto L_0x041d
        L_0x038b:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.v(r10, r3, r4)
            goto L_0x041d
        L_0x0398:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.c(r10, r3)
            goto L_0x041d
        L_0x03a4:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.n1 r4 = r0.w(r5)
            int r3 = com.google.protobuf.p1.p(r10, r3, r4)
            goto L_0x041d
        L_0x03b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.u(r10, r3)
            goto L_0x041d
        L_0x03be:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.p1.a(r10, r3, r4)
            goto L_0x041d
        L_0x03ca:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.f(r10, r3, r4)
            goto L_0x041d
        L_0x03d6:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.h(r10, r3, r4)
            goto L_0x041d
        L_0x03e2:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.k(r10, r3, r4)
            goto L_0x041d
        L_0x03ee:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.x(r10, r3, r4)
            goto L_0x041d
        L_0x03fa:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.m(r10, r3, r4)
            goto L_0x041d
        L_0x0406:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.f(r10, r3, r4)
            goto L_0x041d
        L_0x0412:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.p1.h(r10, r3, r4)
        L_0x041d:
            int r6 = r6 + r3
        L_0x041e:
            r11 = 0
            goto L_0x0517
        L_0x0421:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.v0 r3 = (com.google.protobuf.v0) r3
            com.google.protobuf.n1 r4 = r0.w(r5)
            int r3 = com.google.protobuf.l.t(r10, r3, r4)
            goto L_0x041d
        L_0x0434:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.l.R(r10, r3)
            goto L_0x041d
        L_0x0441:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.l.P(r10, r3)
            goto L_0x041d
        L_0x044e:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.l.N(r10, r3)
            goto L_0x041d
        L_0x0457:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.l.L(r10, r3)
        L_0x0460:
            int r6 = r6 + r4
            goto L_0x041e
        L_0x0462:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.l.l(r10, r3)
            goto L_0x041d
        L_0x046f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.l.W(r10, r3)
            goto L_0x041d
        L_0x047c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            int r3 = com.google.protobuf.l.h(r10, r3)
            goto L_0x041d
        L_0x048b:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.n1 r4 = r0.w(r5)
            int r3 = com.google.protobuf.p1.o(r10, r3, r4)
            goto L_0x041d
        L_0x049c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.i
            if (r4 == 0) goto L_0x04b0
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            int r3 = com.google.protobuf.l.h(r10, r3)
            goto L_0x041d
        L_0x04b0:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.l.T(r10, r3)
            goto L_0x041d
        L_0x04b8:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r3 = 1
            int r3 = com.google.protobuf.l.e(r10, r3)
            goto L_0x041d
        L_0x04c3:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r11 = 0
            int r3 = com.google.protobuf.l.n(r10, r11)
            goto L_0x0516
        L_0x04cd:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0517
            int r3 = com.google.protobuf.l.p(r10, r3)
            goto L_0x0516
        L_0x04d7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.l.w(r10, r3)
            goto L_0x0516
        L_0x04e5:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.l.Y(r10, r3)
            goto L_0x0516
        L_0x04f3:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.l.y(r10, r3)
            goto L_0x0516
        L_0x0501:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            int r3 = com.google.protobuf.l.r(r10, r9)
            goto L_0x0516
        L_0x050b:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            r3 = 0
            int r3 = com.google.protobuf.l.j(r10, r3)
        L_0x0516:
            int r6 = r6 + r3
        L_0x0517:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x051e:
            com.google.protobuf.v1<?, ?> r2 = r0.f27290o
            int r2 = r0.A(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f27281f
            if (r2 == 0) goto L_0x0534
            com.google.protobuf.r<?> r2 = r0.f27291p
            com.google.protobuf.v r1 = r2.c(r1)
            int r1 = r1.l()
            int r6 = r6 + r1
        L_0x0534:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.y(java.lang.Object):int");
    }

    private int y0(int i10) {
        return this.f27276a[i10 + 1];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int z(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f27275s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.f27276a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.y0(r4)
            int r7 = x0(r6)
            int r8 = r15.Y(r4)
            long r9 = Z(r6)
            com.google.protobuf.w r6 = com.google.protobuf.w.DOUBLE_LIST_PACKED
            int r6 = r6.c()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.w r6 = com.google.protobuf.w.SINT64_LIST_PACKED
            int r6 = r6.c()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f27276a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.z1.G(r1, r9)
            com.google.protobuf.v0 r6 = (com.google.protobuf.v0) r6
            com.google.protobuf.n1 r7 = r15.w(r4)
            int r6 = com.google.protobuf.l.t(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = e0(r1, r9)
            int r6 = com.google.protobuf.l.R(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = d0(r1, r9)
            int r6 = com.google.protobuf.l.P(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.N(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.L(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = d0(r1, r9)
            int r6 = com.google.protobuf.l.l(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = d0(r1, r9)
            int r6 = com.google.protobuf.l.W(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.z1.G(r1, r9)
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            int r6 = com.google.protobuf.l.h(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.z1.G(r1, r9)
            com.google.protobuf.n1 r7 = r15.w(r4)
            int r6 = com.google.protobuf.p1.o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.z1.G(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.i
            if (r7 == 0) goto L_0x00ec
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            int r6 = com.google.protobuf.l.h(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.l.T(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.e(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.n(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.p(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = d0(r1, r9)
            int r6 = com.google.protobuf.l.w(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = e0(r1, r9)
            int r6 = com.google.protobuf.l.Y(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = e0(r1, r9)
            int r6 = com.google.protobuf.l.y(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.r(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.l.j(r8, r6)
            goto L_0x03c4
        L_0x0162:
            com.google.protobuf.q0 r6 = r0.f27292q
            java.lang.Object r7 = com.google.protobuf.z1.G(r1, r9)
            java.lang.Object r9 = r15.v(r4)
            int r6 = r6.f(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = M(r1, r9)
            com.google.protobuf.n1 r7 = r15.w(r4)
            int r6 = com.google.protobuf.p1.j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.p1.i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f27284i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.protobuf.l.V(r8)
            int r8 = com.google.protobuf.l.X(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = M(r1, r9)
            com.google.protobuf.n1 r7 = r15.w(r4)
            int r6 = com.google.protobuf.p1.p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = M(r1, r9)
            int r6 = com.google.protobuf.p1.h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.z1.G(r1, r9)
            com.google.protobuf.v0 r6 = (com.google.protobuf.v0) r6
            com.google.protobuf.n1 r7 = r15.w(r4)
            int r6 = com.google.protobuf.l.t(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.z1.E(r1, r9)
            int r6 = com.google.protobuf.l.R(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.z1.C(r1, r9)
            int r6 = com.google.protobuf.l.P(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.N(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.L(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.z1.C(r1, r9)
            int r6 = com.google.protobuf.l.l(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.z1.C(r1, r9)
            int r6 = com.google.protobuf.l.W(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.z1.G(r1, r9)
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            int r6 = com.google.protobuf.l.h(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.z1.G(r1, r9)
            com.google.protobuf.n1 r7 = r15.w(r4)
            int r6 = com.google.protobuf.p1.o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.z1.G(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.i
            if (r7 == 0) goto L_0x0469
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            int r6 = com.google.protobuf.l.h(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.l.T(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.e(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.n(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.p(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.z1.C(r1, r9)
            int r6 = com.google.protobuf.l.w(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.z1.E(r1, r9)
            int r6 = com.google.protobuf.l.Y(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.z1.E(r1, r9)
            int r6 = com.google.protobuf.l.y(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.l.r(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.D(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.l.j(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            com.google.protobuf.v1<?, ?> r2 = r0.f27290o
            int r1 = r15.A(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.z(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void z0(T r18, com.google.protobuf.c2 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f27281f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.r<?> r3 = r0.f27291p
            com.google.protobuf.v r3 = r3.c(r1)
            boolean r5 = r3.n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.t()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f27276a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f27275s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0030:
            if (r10 >= r6) goto L_0x048f
            int r13 = r0.y0(r10)
            int r14 = r0.Y(r10)
            int r15 = x0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0058
            int[] r4 = r0.f27276a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0052
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0052:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0077
            com.google.protobuf.r<?> r9 = r0.f27291p
            int r9 = r9.a(r5)
            if (r9 > r14) goto L_0x0077
            com.google.protobuf.r<?> r9 = r0.f27291p
            r9.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0075:
            r5 = 0
            goto L_0x0059
        L_0x0077:
            long r8 = Z(r13)
            switch(r15) {
                case 0: goto L_0x047d;
                case 1: goto L_0x0471;
                case 2: goto L_0x0465;
                case 3: goto L_0x0459;
                case 4: goto L_0x044d;
                case 5: goto L_0x0441;
                case 6: goto L_0x0435;
                case 7: goto L_0x0429;
                case 8: goto L_0x041d;
                case 9: goto L_0x040c;
                case 10: goto L_0x03fd;
                case 11: goto L_0x03f0;
                case 12: goto L_0x03e3;
                case 13: goto L_0x03d6;
                case 14: goto L_0x03c9;
                case 15: goto L_0x03bc;
                case 16: goto L_0x03af;
                case 17: goto L_0x039e;
                case 18: goto L_0x038e;
                case 19: goto L_0x037e;
                case 20: goto L_0x036e;
                case 21: goto L_0x035e;
                case 22: goto L_0x034e;
                case 23: goto L_0x033e;
                case 24: goto L_0x032e;
                case 25: goto L_0x031e;
                case 26: goto L_0x030f;
                case 27: goto L_0x02fc;
                case 28: goto L_0x02ed;
                case 29: goto L_0x02dd;
                case 30: goto L_0x02cd;
                case 31: goto L_0x02bd;
                case 32: goto L_0x02ad;
                case 33: goto L_0x029d;
                case 34: goto L_0x028d;
                case 35: goto L_0x027d;
                case 36: goto L_0x026d;
                case 37: goto L_0x025d;
                case 38: goto L_0x024d;
                case 39: goto L_0x023d;
                case 40: goto L_0x022d;
                case 41: goto L_0x021d;
                case 42: goto L_0x020d;
                case 43: goto L_0x01fd;
                case 44: goto L_0x01ed;
                case 45: goto L_0x01dd;
                case 46: goto L_0x01cd;
                case 47: goto L_0x01bd;
                case 48: goto L_0x01ad;
                case 49: goto L_0x019a;
                case 50: goto L_0x0191;
                case 51: goto L_0x0182;
                case 52: goto L_0x0173;
                case 53: goto L_0x0164;
                case 54: goto L_0x0155;
                case 55: goto L_0x0146;
                case 56: goto L_0x0137;
                case 57: goto L_0x0128;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r13 = 0
            goto L_0x0488
        L_0x0081:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.n1 r8 = r0.w(r10)
            r2.s(r14, r4, r8)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = e0(r1, r8)
            r2.F(r14, r8)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = d0(r1, r8)
            r2.N(r14, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = e0(r1, r8)
            r2.z(r14, r8)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = d0(r1, r8)
            r2.t(r14, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = d0(r1, r8)
            r2.J(r14, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = d0(r1, r8)
            r2.d(r14, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.i r4 = (com.google.protobuf.i) r4
            r2.v(r14, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.n1 r8 = r0.w(r10)
            r2.j(r14, r4, r8)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.D0(r14, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            boolean r4 = a0(r1, r8)
            r2.r(r14, r4)
            goto L_0x007e
        L_0x0128:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = d0(r1, r8)
            r2.f(r14, r4)
            goto L_0x007e
        L_0x0137:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = e0(r1, r8)
            r2.k(r14, r8)
            goto L_0x007e
        L_0x0146:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = d0(r1, r8)
            r2.w(r14, r4)
            goto L_0x007e
        L_0x0155:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = e0(r1, r8)
            r2.o(r14, r8)
            goto L_0x007e
        L_0x0164:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = e0(r1, r8)
            r2.q(r14, r8)
            goto L_0x007e
        L_0x0173:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            float r4 = c0(r1, r8)
            r2.G(r14, r4)
            goto L_0x007e
        L_0x0182:
            boolean r4 = r0.K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            double r8 = b0(r1, r8)
            r2.g(r14, r8)
            goto L_0x007e
        L_0x0191:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.C0(r2, r14, r4, r10)
            goto L_0x007e
        L_0x019a:
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1 r9 = r0.w(r10)
            com.google.protobuf.p1.U(r4, r8, r2, r9)
            goto L_0x007e
        L_0x01ad:
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.p1.b0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01bd:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.a0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01cd:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.Z(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01dd:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.Y(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01ed:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.Q(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01fd:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.d0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x020d:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.N(r4, r8, r2, r13)
            goto L_0x007e
        L_0x021d:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.R(r4, r8, r2, r13)
            goto L_0x007e
        L_0x022d:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.S(r4, r8, r2, r13)
            goto L_0x007e
        L_0x023d:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.V(r4, r8, r2, r13)
            goto L_0x007e
        L_0x024d:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.e0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x025d:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.W(r4, r8, r2, r13)
            goto L_0x007e
        L_0x026d:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.T(r4, r8, r2, r13)
            goto L_0x007e
        L_0x027d:
            r13 = 1
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.P(r4, r8, r2, r13)
            goto L_0x007e
        L_0x028d:
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.p1.b0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x029d:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.a0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02ad:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.Z(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02bd:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.Y(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02cd:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.Q(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02dd:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.d0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02ed:
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.O(r4, r8, r2)
            goto L_0x007e
        L_0x02fc:
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1 r9 = r0.w(r10)
            com.google.protobuf.p1.X(r4, r8, r2, r9)
            goto L_0x007e
        L_0x030f:
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.c0(r4, r8, r2)
            goto L_0x007e
        L_0x031e:
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.p1.N(r4, r8, r2, r13)
            goto L_0x0488
        L_0x032e:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.R(r4, r8, r2, r13)
            goto L_0x0488
        L_0x033e:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.S(r4, r8, r2, r13)
            goto L_0x0488
        L_0x034e:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.V(r4, r8, r2, r13)
            goto L_0x0488
        L_0x035e:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.e0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x036e:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.W(r4, r8, r2, r13)
            goto L_0x0488
        L_0x037e:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.T(r4, r8, r2, r13)
            goto L_0x0488
        L_0x038e:
            r13 = 0
            int r4 = r0.Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.p1.P(r4, r8, r2, r13)
            goto L_0x0488
        L_0x039e:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.n1 r8 = r0.w(r10)
            r2.s(r14, r4, r8)
            goto L_0x0488
        L_0x03af:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.F(r14, r8)
            goto L_0x0488
        L_0x03bc:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.N(r14, r4)
            goto L_0x0488
        L_0x03c9:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.z(r14, r8)
            goto L_0x0488
        L_0x03d6:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.t(r14, r4)
            goto L_0x0488
        L_0x03e3:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.J(r14, r4)
            goto L_0x0488
        L_0x03f0:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.d(r14, r4)
            goto L_0x0488
        L_0x03fd:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.i r4 = (com.google.protobuf.i) r4
            r2.v(r14, r4)
            goto L_0x0488
        L_0x040c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.n1 r8 = r0.w(r10)
            r2.j(r14, r4, r8)
            goto L_0x0488
        L_0x041d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.D0(r14, r4, r2)
            goto L_0x0488
        L_0x0429:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            boolean r4 = l(r1, r8)
            r2.r(r14, r4)
            goto L_0x0488
        L_0x0435:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.f(r14, r4)
            goto L_0x0488
        L_0x0441:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.k(r14, r8)
            goto L_0x0488
        L_0x044d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.w(r14, r4)
            goto L_0x0488
        L_0x0459:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.o(r14, r8)
            goto L_0x0488
        L_0x0465:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.q(r14, r8)
            goto L_0x0488
        L_0x0471:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            float r4 = t(r1, r8)
            r2.G(r14, r4)
            goto L_0x0488
        L_0x047d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            double r8 = p(r1, r8)
            r2.g(r14, r8)
        L_0x0488:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0030
        L_0x048f:
            if (r5 == 0) goto L_0x04a6
            com.google.protobuf.r<?> r4 = r0.f27291p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a4
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048f
        L_0x04a4:
            r5 = 0
            goto L_0x048f
        L_0x04a6:
            com.google.protobuf.v1<?, ?> r3 = r0.f27290o
            r0.E0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.z0(java.lang.Object, com.google.protobuf.c2):void");
    }

    public void a(T t10, T t11) {
        m(t10);
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f27276a.length; i10 += 3) {
            S(t10, t11, i10);
        }
        p1.G(this.f27290o, t10, t11);
        if (this.f27281f) {
            p1.E(this.f27291p, t10, t11);
        }
    }

    public void b(T t10, c2 c2Var) throws IOException {
        if (c2Var.l() == c2.a.DESCENDING) {
            B0(t10, c2Var);
        } else if (this.f27283h) {
            A0(t10, c2Var);
        } else {
            z0(t10, c2Var);
        }
    }

    public void c(T t10) {
        if (I(t10)) {
            if (t10 instanceof z) {
                z zVar = (z) t10;
                zVar.v();
                zVar.t();
                zVar.O();
            }
            int length = this.f27276a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int y02 = y0(i10);
                long Z = Z(y02);
                int x02 = x0(y02);
                if (x02 != 9) {
                    switch (x02) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f27289n.c(t10, Z);
                            continue;
                        case 50:
                            Unsafe unsafe = f27275s;
                            Object object = unsafe.getObject(t10, Z);
                            if (object != null) {
                                unsafe.putObject(t10, Z, this.f27292q.b(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (D(t10, i10)) {
                    w(i10).c(f27275s.getObject(t10, Z));
                }
            }
            this.f27290o.j(t10);
            if (this.f27281f) {
                this.f27291p.f(t10);
            }
        }
    }

    public final boolean d(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f27286k) {
            int i15 = this.f27285j[i14];
            int Y = Y(i15);
            int y02 = y0(i15);
            int i16 = this.f27276a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f27275s.getInt(t11, (long) i17);
                }
                i10 = i13;
                i11 = i17;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (L(y02) && !E(t10, i15, i11, i10, i18)) {
                return false;
            }
            int x02 = x0(y02);
            if (x02 != 9 && x02 != 17) {
                if (x02 != 27) {
                    if (x02 == 60 || x02 == 68) {
                        if (K(t11, Y, i15) && !F(t11, y02, w(i15))) {
                            return false;
                        }
                    } else if (x02 != 49) {
                        if (x02 == 50 && !H(t11, y02, i15)) {
                            return false;
                        }
                    }
                }
                if (!G(t11, y02, i15)) {
                    return false;
                }
            } else if (E(t10, i15, i11, i10, i18) && !F(t11, y02, w(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        return !this.f27281f || this.f27291p.c(t11).p();
    }

    public void e(T t10, l1 l1Var, q qVar) throws IOException {
        Objects.requireNonNull(qVar);
        m(t10);
        O(this.f27290o, this.f27291p, t10, l1Var, qVar);
    }

    public void f(T t10, byte[] bArr, int i10, int i11, f.b bVar) throws IOException {
        if (this.f27283h) {
            i0(t10, bArr, i10, i11, bVar);
        } else {
            h0(t10, bArr, i10, i11, 0, bVar);
        }
    }

    public boolean g(T t10, T t11) {
        int length = this.f27276a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!q(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f27290o.g(t10).equals(this.f27290o.g(t11))) {
            return false;
        }
        if (this.f27281f) {
            return this.f27291p.c(t10).equals(this.f27291p.c(t11));
        }
        return true;
    }

    public int h(T t10) {
        return this.f27283h ? z(t10) : y(t10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.protobuf.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0333, code lost:
        if (r0 != r15) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0376, code lost:
        if (r0 != r15) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0397, code lost:
        if (r0 != r15) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x039a, code lost:
        r8 = r31;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025c, code lost:
        r5 = r11 | r17;
        r11 = r31;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0278, code lost:
        r0 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0294, code lost:
        r5 = r11 | r17;
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0298, code lost:
        r2 = r8;
        r3 = r12;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x029c, code lost:
        r12 = r6;
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a1, code lost:
        r17 = r29;
        r2 = r3;
        r20 = r8;
        r25 = r10;
        r19 = r11;
        r9 = r12;
        r8 = r31;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h0(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.f.b r32) throws java.io.IOException {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            m(r27)
            sun.misc.Unsafe r10 = f27275s
            r16 = 0
            r0 = r29
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            if (r0 >= r13) goto L_0x03f5
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.protobuf.f.H(r0, r12, r3, r9)
            int r3 = r9.f27003a
            r4 = r3
            r3 = r0
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x003b
            int r2 = r2 / r8
            int r1 = r15.l0(r0, r2)
            goto L_0x003f
        L_0x003b:
            int r1 = r15.k0(r0)
        L_0x003f:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0054
            r22 = r0
            r2 = r3
            r9 = r4
            r19 = r5
            r17 = r6
            r25 = r10
            r8 = r11
            r18 = -1
            r20 = 0
            goto L_0x039e
        L_0x0054:
            int[] r1 = r15.f27276a
            int r19 = r2 + 1
            r1 = r1[r19]
            int r8 = x0(r1)
            long r11 = Z(r1)
            r19 = r4
            r4 = 17
            r20 = r11
            if (r8 > r4) goto L_0x02af
            int[] r4 = r15.f27276a
            int r12 = r2 + 2
            r4 = r4[r12]
            int r12 = r4 >>> 20
            r11 = 1
            int r12 = r11 << r12
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r11
            r17 = r12
            if (r4 == r6) goto L_0x008b
            if (r6 == r11) goto L_0x0083
            long r11 = (long) r6
            r10.putInt(r14, r11, r5)
        L_0x0083:
            long r5 = (long) r4
            int r5 = r10.getInt(r14, r5)
            r12 = r4
            r11 = r5
            goto L_0x008d
        L_0x008b:
            r11 = r5
            r12 = r6
        L_0x008d:
            r4 = 5
            switch(r8) {
                case 0: goto L_0x027b;
                case 1: goto L_0x0262;
                case 2: goto L_0x023c;
                case 3: goto L_0x023c;
                case 4: goto L_0x0222;
                case 5: goto L_0x01ff;
                case 6: goto L_0x01e7;
                case 7: goto L_0x01c4;
                case 8: goto L_0x019f;
                case 9: goto L_0x0179;
                case 10: goto L_0x015e;
                case 11: goto L_0x0222;
                case 12: goto L_0x0122;
                case 13: goto L_0x01e7;
                case 14: goto L_0x01ff;
                case 15: goto L_0x0104;
                case 16: goto L_0x00e0;
                case 17: goto L_0x009e;
                default: goto L_0x0091;
            }
        L_0x0091:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            goto L_0x02a1
        L_0x009e:
            r5 = 3
            if (r7 != r5) goto L_0x00d3
            java.lang.Object r7 = r15.T(r14, r2)
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.protobuf.n1 r1 = r15.w(r2)
            r22 = r0
            r0 = r7
            r18 = -1
            r8 = r2
            r2 = r28
            r6 = r19
            r4 = r30
            r29 = r12
            r12 = r6
            r6 = r32
            int r0 = com.google.protobuf.f.N(r0, r1, r2, r3, r4, r5, r6)
            r15.v0(r14, r8, r7)
            r5 = r11 | r17
            r6 = r29
            r11 = r31
            r2 = r8
            r3 = r12
            r1 = r22
            r12 = r28
            goto L_0x001c
        L_0x00d3:
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            r6 = r28
            goto L_0x02a1
        L_0x00e0:
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            r6 = r28
            if (r7 != 0) goto L_0x02a1
            r4 = r20
            int r7 = com.google.protobuf.f.L(r6, r3, r9)
            long r0 = r9.f27004b
            long r19 = com.google.protobuf.j.c(r0)
            r0 = r10
            r1 = r27
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x025c
        L_0x0104:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.protobuf.f.I(r6, r3, r9)
            int r1 = r9.f27003a
            int r1 = com.google.protobuf.j.b(r1)
            r10.putInt(r14, r4, r1)
            goto L_0x0294
        L_0x0122:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.protobuf.f.I(r6, r3, r9)
            int r1 = r9.f27003a
            com.google.protobuf.d0$e r2 = r15.u(r8)
            if (r2 == 0) goto L_0x0159
            boolean r2 = r2.a(r1)
            if (r2 == 0) goto L_0x0144
            goto L_0x0159
        L_0x0144:
            com.google.protobuf.w1 r2 = x(r27)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.n(r12, r1)
            r2 = r8
            r5 = r11
            r3 = r12
            r1 = r22
            r11 = r31
            goto L_0x029c
        L_0x0159:
            r10.putInt(r14, r4, r1)
            goto L_0x0294
        L_0x015e:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x02a1
            int r0 = com.google.protobuf.f.b(r6, r3, r9)
            java.lang.Object r1 = r9.f27005c
            r10.putObject(r14, r4, r1)
            goto L_0x0294
        L_0x0179:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x02a1
            java.lang.Object r7 = r15.T(r14, r8)
            com.google.protobuf.n1 r1 = r15.w(r8)
            r0 = r7
            r2 = r28
            r4 = r30
            r5 = r32
            int r0 = com.google.protobuf.f.O(r0, r1, r2, r3, r4, r5)
            r15.v0(r14, r8, r7)
            goto L_0x0294
        L_0x019f:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x02a1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01b9
            int r0 = com.google.protobuf.f.C(r6, r3, r9)
            goto L_0x01bd
        L_0x01b9:
            int r0 = com.google.protobuf.f.F(r6, r3, r9)
        L_0x01bd:
            java.lang.Object r1 = r9.f27005c
            r10.putObject(r14, r4, r1)
            goto L_0x0294
        L_0x01c4:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.protobuf.f.L(r6, r3, r9)
            long r1 = r9.f27004b
            r19 = 0
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x01e1
            r1 = 1
            goto L_0x01e2
        L_0x01e1:
            r1 = 0
        L_0x01e2:
            com.google.protobuf.z1.L(r14, r4, r1)
            goto L_0x0294
        L_0x01e7:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r1 = r20
            r18 = -1
            if (r7 != r4) goto L_0x02a1
            int r0 = com.google.protobuf.f.h(r6, r3)
            r10.putInt(r14, r1, r0)
            goto L_0x0278
        L_0x01ff:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r1 = r20
            r0 = 1
            r18 = -1
            if (r7 != r0) goto L_0x02a1
            long r4 = com.google.protobuf.f.j(r6, r3)
            r0 = r10
            r20 = r1
            r1 = r27
            r7 = r3
            r2 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0294
        L_0x0222:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.protobuf.f.I(r6, r3, r9)
            int r1 = r9.f27003a
            r4 = r20
            r10.putInt(r14, r4, r1)
            goto L_0x0294
        L_0x023c:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r7 = com.google.protobuf.f.L(r6, r3, r9)
            long r2 = r9.f27004b
            r0 = r10
            r1 = r27
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
        L_0x025c:
            r5 = r11 | r17
            r11 = r31
            r0 = r7
            goto L_0x0298
        L_0x0262:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r0 = r20
            r18 = -1
            if (r7 != r4) goto L_0x02a1
            float r2 = com.google.protobuf.f.l(r6, r3)
            com.google.protobuf.z1.S(r14, r0, r2)
        L_0x0278:
            int r0 = r3 + 4
            goto L_0x0294
        L_0x027b:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r0 = r20
            r2 = 1
            r18 = -1
            if (r7 != r2) goto L_0x02a1
            double r4 = com.google.protobuf.f.d(r6, r3)
            com.google.protobuf.z1.R(r14, r0, r4)
            int r0 = r3 + 8
        L_0x0294:
            r5 = r11 | r17
            r11 = r31
        L_0x0298:
            r2 = r8
            r3 = r12
            r1 = r22
        L_0x029c:
            r12 = r6
            r6 = r29
            goto L_0x001c
        L_0x02a1:
            r17 = r29
            r2 = r3
            r20 = r8
            r25 = r10
            r19 = r11
            r9 = r12
            r8 = r31
            goto L_0x039e
        L_0x02af:
            r22 = r0
            r11 = r2
            r17 = r6
            r12 = r19
            r18 = -1
            r19 = r5
            r5 = r20
            r0 = 27
            if (r8 != r0) goto L_0x0308
            r0 = 2
            if (r7 != r0) goto L_0x02ff
            java.lang.Object r0 = r10.getObject(r14, r5)
            com.google.protobuf.d0$j r0 = (com.google.protobuf.d0.j) r0
            boolean r1 = r0.t()
            if (r1 != 0) goto L_0x02e1
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d8
            r1 = 10
            goto L_0x02da
        L_0x02d8:
            int r1 = r1 * 2
        L_0x02da:
            com.google.protobuf.d0$j r0 = r0.d(r1)
            r10.putObject(r14, r5, r0)
        L_0x02e1:
            r5 = r0
            com.google.protobuf.n1 r0 = r15.w(r11)
            r1 = r12
            r2 = r28
            r4 = r30
            r6 = r32
            int r0 = com.google.protobuf.f.q(r0, r1, r2, r3, r4, r5, r6)
            r2 = r11
            r3 = r12
            r6 = r17
            r5 = r19
            r1 = r22
            r12 = r28
            r11 = r31
            goto L_0x001c
        L_0x02ff:
            r15 = r3
            r25 = r10
            r20 = r11
            r21 = r12
            goto L_0x0379
        L_0x0308:
            r0 = 49
            if (r8 > r0) goto L_0x034f
            long r1 = (long) r1
            r0 = r26
            r20 = r1
            r1 = r27
            r2 = r28
            r4 = r3
            r15 = r4
            r4 = r30
            r23 = r5
            r5 = r12
            r6 = r22
            r29 = r8
            r8 = r11
            r25 = r10
            r9 = r20
            r20 = r11
            r11 = r29
            r21 = r12
            r12 = r23
            r14 = r32
            int r0 = r0.j0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x039a
        L_0x0335:
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            r6 = r17
            r5 = r19
            r2 = r20
            r3 = r21
            r1 = r22
            r10 = r25
            goto L_0x001c
        L_0x034f:
            r15 = r3
            r23 = r5
            r29 = r8
            r25 = r10
            r20 = r11
            r21 = r12
            r0 = 50
            r9 = r29
            if (r9 != r0) goto L_0x037f
            r0 = 2
            if (r7 != r0) goto L_0x0379
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r20
            r6 = r23
            r8 = r32
            int r0 = r0.f0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x039a
            goto L_0x0335
        L_0x0379:
            r8 = r31
            r2 = r15
        L_0x037c:
            r9 = r21
            goto L_0x039e
        L_0x037f:
            r0 = r26
            r8 = r1
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r21
            r6 = r22
            r10 = r23
            r12 = r20
            r13 = r32
            int r0 = r0.g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x039a
            goto L_0x0335
        L_0x039a:
            r8 = r31
            r2 = r0
            goto L_0x037c
        L_0x039e:
            if (r9 != r8) goto L_0x03ae
            if (r8 == 0) goto L_0x03ae
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r26
            r6 = r2
            r0 = r17
            r5 = r19
            goto L_0x0404
        L_0x03ae:
            r10 = r26
            boolean r0 = r10.f27281f
            r11 = r32
            if (r0 == 0) goto L_0x03d0
            com.google.protobuf.q r0 = r11.f27006d
            com.google.protobuf.q r1 = com.google.protobuf.q.b()
            if (r0 == r1) goto L_0x03d0
            com.google.protobuf.v0 r5 = r10.f27280e
            com.google.protobuf.v1<?, ?> r6 = r10.f27290o
            r0 = r9
            r1 = r28
            r3 = r30
            r4 = r27
            r7 = r32
            int r0 = com.google.protobuf.f.g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x03df
        L_0x03d0:
            com.google.protobuf.w1 r4 = x(r27)
            r0 = r9
            r1 = r28
            r3 = r30
            r5 = r32
            int r0 = com.google.protobuf.f.G(r0, r1, r2, r3, r4, r5)
        L_0x03df:
            r14 = r27
            r12 = r28
            r13 = r30
            r3 = r9
            r15 = r10
            r9 = r11
            r6 = r17
            r5 = r19
            r2 = r20
            r1 = r22
            r10 = r25
            r11 = r8
            goto L_0x001c
        L_0x03f5:
            r19 = r5
            r17 = r6
            r25 = r10
            r8 = r11
            r10 = r15
            r6 = r0
            r9 = r3
            r0 = r17
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0404:
            if (r0 == r1) goto L_0x040f
            long r0 = (long) r0
            r7 = r27
            r2 = r25
            r2.putInt(r7, r0, r5)
            goto L_0x0411
        L_0x040f:
            r7 = r27
        L_0x0411:
            r0 = 0
            int r1 = r10.f27286k
            r3 = r0
            r11 = r1
        L_0x0416:
            int r0 = r10.f27287l
            if (r11 >= r0) goto L_0x0430
            int[] r0 = r10.f27285j
            r2 = r0[r11]
            com.google.protobuf.v1<?, ?> r4 = r10.f27290o
            r0 = r26
            r1 = r27
            r5 = r27
            java.lang.Object r0 = r0.r(r1, r2, r3, r4, r5)
            r3 = r0
            com.google.protobuf.w1 r3 = (com.google.protobuf.w1) r3
            int r11 = r11 + 1
            goto L_0x0416
        L_0x0430:
            if (r3 == 0) goto L_0x0437
            com.google.protobuf.v1<?, ?> r0 = r10.f27290o
            r0.o(r7, r3)
        L_0x0437:
            if (r8 != 0) goto L_0x0443
            r0 = r30
            if (r6 != r0) goto L_0x043e
            goto L_0x0449
        L_0x043e:
            com.google.protobuf.e0 r0 = com.google.protobuf.e0.h()
            throw r0
        L_0x0443:
            r0 = r30
            if (r6 > r0) goto L_0x044a
            if (r9 != r8) goto L_0x044a
        L_0x0449:
            return r6
        L_0x044a:
            com.google.protobuf.e0 r0 = com.google.protobuf.e0.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.h0(java.lang.Object, byte[], int, int, int, com.google.protobuf.f$b):int");
    }

    public T i() {
        return this.f27288m.a(this.f27280e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int j(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f27276a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.y0(r1)
            int r4 = r8.Y(r1)
            long r5 = Z(r3)
            int r3 = x0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = e0(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = d0(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = e0(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = d0(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = d0(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = d0(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = a0(r9, r5)
            int r3 = com.google.protobuf.d0.c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = d0(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = e0(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = d0(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = e0(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = e0(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = c0(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = b0(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.z1.E(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.z1.C(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.z1.E(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.z1.C(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.z1.C(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.z1.C(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.z1.G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.z1.t(r9, r5)
            int r3 = com.google.protobuf.d0.c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.z1.C(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.z1.E(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.z1.C(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.z1.E(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.z1.E(r9, r5)
            int r3 = com.google.protobuf.d0.f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.z1.B(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.z1.A(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.d0.f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.protobuf.v1<?, ?> r0 = r8.f27290o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f27281f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            com.google.protobuf.r<?> r0 = r8.f27291p
            com.google.protobuf.v r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.j(java.lang.Object):int");
    }
}
