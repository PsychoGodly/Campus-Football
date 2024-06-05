package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.h0;
import com.google.protobuf.v.b;
import com.google.protobuf.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet */
final class v<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final v f27216d = new v(true);

    /* renamed from: a  reason: collision with root package name */
    private final q1<T, Object> f27217a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27218b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27219c;

    /* compiled from: FieldSet */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27220a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f27221b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.b2.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27221b = r0
                r1 = 1
                com.google.protobuf.b2$b r2 = com.google.protobuf.b2.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f27221b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r3 = com.google.protobuf.b2.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f27221b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r4 = com.google.protobuf.b2.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f27221b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r5 = com.google.protobuf.b2.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f27221b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r6 = com.google.protobuf.b2.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f27221b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r7 = com.google.protobuf.b2.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f27221b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r8 = com.google.protobuf.b2.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f27221b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r9 = com.google.protobuf.b2.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f27221b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.b2$b r10 = com.google.protobuf.b2.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.b2$c[] r9 = com.google.protobuf.b2.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f27220a = r9
                com.google.protobuf.b2$c r10 = com.google.protobuf.b2.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f27220a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.b2$c r9 = com.google.protobuf.b2.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f27220a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.b2$c r1 = com.google.protobuf.b2.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f27220a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.b2$c r1 = com.google.protobuf.b2.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f27220a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.b2$c r1 = com.google.protobuf.b2.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f27220a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.b2$c r1 = com.google.protobuf.b2.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f27220a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.b2$c r1 = com.google.protobuf.b2.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f27220a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.b2$c r1 = com.google.protobuf.b2.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f27220a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.b2$c r1 = com.google.protobuf.b2.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v.a.<clinit>():void");
        }
    }

    /* compiled from: FieldSet */
    public interface b<T extends b<T>> extends Comparable<T> {
        int I();

        boolean J();

        b2.b K();

        v0.a L(v0.a aVar, v0 v0Var);

        b2.c Y();

        boolean Z();
    }

    private v() {
        this.f27217a = q1.r(16);
    }

    static void A(l lVar, b2.b bVar, int i10, Object obj) throws IOException {
        if (bVar == b2.b.GROUP) {
            lVar.A0(i10, (v0) obj);
            return;
        }
        lVar.W0(i10, m(bVar, false));
        B(lVar, bVar, obj);
    }

    static void B(l lVar, b2.b bVar, Object obj) throws IOException {
        switch (a.f27221b[bVar.ordinal()]) {
            case 1:
                lVar.r0(((Double) obj).doubleValue());
                return;
            case 2:
                lVar.z0(((Float) obj).floatValue());
                return;
            case 3:
                lVar.H0(((Long) obj).longValue());
                return;
            case 4:
                lVar.a1(((Long) obj).longValue());
                return;
            case 5:
                lVar.F0(((Integer) obj).intValue());
                return;
            case 6:
                lVar.x0(((Long) obj).longValue());
                return;
            case 7:
                lVar.v0(((Integer) obj).intValue());
                return;
            case 8:
                lVar.l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                lVar.C0((v0) obj);
                return;
            case 10:
                lVar.J0((v0) obj);
                return;
            case 11:
                if (obj instanceof i) {
                    lVar.p0((i) obj);
                    return;
                } else {
                    lVar.V0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof i) {
                    lVar.p0((i) obj);
                    return;
                } else {
                    lVar.m0((byte[]) obj);
                    return;
                }
            case 13:
                lVar.Y0(((Integer) obj).intValue());
                return;
            case 14:
                lVar.N0(((Integer) obj).intValue());
                return;
            case 15:
                lVar.P0(((Long) obj).longValue());
                return;
            case 16:
                lVar.R0(((Integer) obj).intValue());
                return;
            case 17:
                lVar.T0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof d0.c) {
                    lVar.t0(((d0.c) obj).I());
                    return;
                } else {
                    lVar.t0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(b2.b bVar, int i10, Object obj) {
        int V = l.V(i10);
        if (bVar == b2.b.GROUP) {
            V *= 2;
        }
        return V + e(bVar, obj);
    }

    static int e(b2.b bVar, Object obj) {
        switch (a.f27221b[bVar.ordinal()]) {
            case 1:
                return l.k(((Double) obj).doubleValue());
            case 2:
                return l.s(((Float) obj).floatValue());
            case 3:
                return l.z(((Long) obj).longValue());
            case 4:
                return l.Z(((Long) obj).longValue());
            case 5:
                return l.x(((Integer) obj).intValue());
            case 6:
                return l.q(((Long) obj).longValue());
            case 7:
                return l.o(((Integer) obj).intValue());
            case 8:
                return l.f(((Boolean) obj).booleanValue());
            case 9:
                return l.u((v0) obj);
            case 10:
                if (obj instanceof h0) {
                    return l.C((h0) obj);
                }
                return l.H((v0) obj);
            case 11:
                if (obj instanceof i) {
                    return l.i((i) obj);
                }
                return l.U((String) obj);
            case 12:
                if (obj instanceof i) {
                    return l.i((i) obj);
                }
                return l.g((byte[]) obj);
            case 13:
                return l.X(((Integer) obj).intValue());
            case 14:
                return l.M(((Integer) obj).intValue());
            case 15:
                return l.O(((Long) obj).longValue());
            case 16:
                return l.Q(((Integer) obj).intValue());
            case 17:
                return l.S(((Long) obj).longValue());
            case 18:
                if (obj instanceof d0.c) {
                    return l.m(((d0.c) obj).I());
                }
                return l.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        b2.b K = bVar.K();
        int I = bVar.I();
        if (!bVar.J()) {
            return d(K, I, obj);
        }
        int i10 = 0;
        if (bVar.Z()) {
            for (Object e10 : (List) obj) {
                i10 += e(K, e10);
            }
            return l.V(I) + i10 + l.X(i10);
        }
        for (Object d10 : (List) obj) {
            i10 += d(K, I, d10);
        }
        return i10;
    }

    public static <T extends b<T>> v<T> h() {
        return f27216d;
    }

    private int k(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.Y() != b2.c.MESSAGE || bVar.J() || bVar.Z()) {
            return f(bVar, value);
        }
        if (value instanceof h0) {
            return l.A(((b) entry.getKey()).I(), (h0) value);
        }
        return l.E(((b) entry.getKey()).I(), (v0) value);
    }

    static int m(b2.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.d();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.Y() != b2.c.MESSAGE) {
            return true;
        }
        if (!bVar.J()) {
            return r(entry.getValue());
        }
        for (Object r10 : (List) entry.getValue()) {
            if (!r(r10)) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof w0) {
            return ((w0) obj).isInitialized();
        }
        if (obj instanceof h0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(b2.b bVar, Object obj) {
        d0.a(obj);
        switch (a.f27220a[bVar.c().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof i) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof d0.c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof v0) || (obj instanceof h0)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof h0) {
            value = ((h0) value).f();
        }
        if (bVar.J()) {
            Object i10 = i(bVar);
            if (i10 == null) {
                i10 = new ArrayList();
            }
            for (Object c10 : (List) value) {
                ((List) i10).add(c(c10));
            }
            this.f27217a.put(bVar, i10);
        } else if (bVar.Y() == b2.c.MESSAGE) {
            Object i11 = i(bVar);
            if (i11 == null) {
                this.f27217a.put(bVar, c(value));
                return;
            }
            this.f27217a.put(bVar, bVar.L(((v0) i11).b(), (v0) value).build());
        } else {
            this.f27217a.put(bVar, c(value));
        }
    }

    public static <T extends b<T>> v<T> x() {
        return new v<>();
    }

    private void z(T t10, Object obj) {
        if (!s(t10.K(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t10.I()), t10.K().c(), obj.getClass().getName()}));
        }
    }

    public void a(T t10, Object obj) {
        List list;
        if (t10.J()) {
            z(t10, obj);
            Object i10 = i(t10);
            if (i10 == null) {
                list = new ArrayList();
                this.f27217a.put(t10, list);
            } else {
                list = (List) i10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public v<T> clone() {
        v<T> x10 = x();
        for (int i10 = 0; i10 < this.f27217a.l(); i10++) {
            Map.Entry<T, Object> k10 = this.f27217a.k(i10);
            x10.y((b) k10.getKey(), k10.getValue());
        }
        for (Map.Entry next : this.f27217a.n()) {
            x10.y((b) next.getKey(), next.getValue());
        }
        x10.f27219c = this.f27219c;
        return x10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return this.f27217a.equals(((v) obj).f27217a);
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        if (this.f27219c) {
            return new h0.c(this.f27217a.i().iterator());
        }
        return this.f27217a.i().iterator();
    }

    public int hashCode() {
        return this.f27217a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f27217a.get(t10);
        return obj instanceof h0 ? ((h0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27217a.l(); i11++) {
            i10 += k(this.f27217a.k(i11));
        }
        for (Map.Entry<T, Object> k10 : this.f27217a.n()) {
            i10 += k(k10);
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27217a.l(); i11++) {
            Map.Entry<T, Object> k10 = this.f27217a.k(i11);
            i10 += f((b) k10.getKey(), k10.getValue());
        }
        for (Map.Entry next : this.f27217a.n()) {
            i10 += f((b) next.getKey(), next.getValue());
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f27217a.isEmpty();
    }

    public boolean o() {
        return this.f27218b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f27217a.l(); i10++) {
            if (!q(this.f27217a.k(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> q10 : this.f27217a.n()) {
            if (!q(q10)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        if (this.f27219c) {
            return new h0.c(this.f27217a.entrySet().iterator());
        }
        return this.f27217a.entrySet().iterator();
    }

    public void u() {
        if (!this.f27218b) {
            for (int i10 = 0; i10 < this.f27217a.l(); i10++) {
                Map.Entry<T, Object> k10 = this.f27217a.k(i10);
                if (k10.getValue() instanceof z) {
                    ((z) k10.getValue()).N();
                }
            }
            this.f27217a.q();
            this.f27218b = true;
        }
    }

    public void v(v<T> vVar) {
        for (int i10 = 0; i10 < vVar.f27217a.l(); i10++) {
            w(vVar.f27217a.k(i10));
        }
        for (Map.Entry<T, Object> w10 : vVar.f27217a.n()) {
            w(w10);
        }
    }

    public void y(T t10, Object obj) {
        if (!t10.J()) {
            z(t10, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object z10 : arrayList) {
                z(t10, z10);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof h0) {
            this.f27219c = true;
        }
        this.f27217a.put(t10, obj);
    }

    private v(boolean z10) {
        this(q1.r(0));
        u();
    }

    private v(q1<T, Object> q1Var) {
        this.f27217a = q1Var;
        u();
    }
}
