package com.google.protobuf;

import com.google.protobuf.c2;
import com.google.protobuf.o0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: CodedOutputStreamWriter */
final class m implements c2 {

    /* renamed from: a  reason: collision with root package name */
    private final l f27139a;

    /* compiled from: CodedOutputStreamWriter */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27140a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.b2.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27140a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f27140a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.m.a.<clinit>():void");
        }
    }

    private m(l lVar) {
        l lVar2 = (l) d0.b(lVar, "output");
        this.f27139a = lVar2;
        lVar2.f27125a = this;
    }

    public static m P(l lVar) {
        m mVar = lVar.f27125a;
        if (mVar != null) {
            return mVar;
        }
        return new m(lVar);
    }

    private <V> void Q(int i10, boolean z10, V v10, o0.a<Boolean, V> aVar) throws IOException {
        this.f27139a.W0(i10, 2);
        this.f27139a.Y0(o0.b(aVar, Boolean.valueOf(z10), v10));
        o0.e(this.f27139a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void R(int i10, o0.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i11 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i11] = intValue.intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f27139a.W0(i10, 2);
            this.f27139a.Y0(o0.b(aVar, Integer.valueOf(i13), v10));
            o0.e(this.f27139a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, o0.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i11 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i11] = longValue.longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f27139a.W0(i10, 2);
            this.f27139a.Y0(o0.b(aVar, Long.valueOf(j10), v10));
            o0.e(this.f27139a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, o0.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f27140a[aVar.f27165a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f27165a);
        }
    }

    private <V> void U(int i10, o0.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i11 = 0;
        for (String str : map.keySet()) {
            strArr[i11] = str;
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str2 = strArr[i12];
            V v10 = map.get(str2);
            this.f27139a.W0(i10, 2);
            this.f27139a.Y0(o0.b(aVar, str2, v10));
            o0.e(this.f27139a, aVar, str2, v10);
        }
    }

    private void V(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f27139a.U0(i10, (String) obj);
        } else {
            this.f27139a.o0(i10, (i) obj);
        }
    }

    public void A(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.o(list.get(i13).intValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.v0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.u0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void B(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.f(list.get(i13).booleanValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.l0(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.k0(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public <K, V> void C(int i10, o0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f27139a.e0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f27139a.W0(i10, 2);
            this.f27139a.Y0(o0.b(aVar, next.getKey(), next.getValue()));
            o0.e(this.f27139a, aVar, next.getKey(), next.getValue());
        }
    }

    public void D(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.X(list.get(i13).intValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.Y0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.X0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void E(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.S(list.get(i13).longValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.T0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.S0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void F(int i10, long j10) throws IOException {
        this.f27139a.S0(i10, j10);
    }

    public void G(int i10, float f10) throws IOException {
        this.f27139a.y0(i10, f10);
    }

    @Deprecated
    public void H(int i10) throws IOException {
        this.f27139a.W0(i10, 4);
    }

    public void I(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.Q(list.get(i13).intValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.R0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.Q0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void J(int i10, int i11) throws IOException {
        this.f27139a.s0(i10, i11);
    }

    public void K(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.z(list.get(i13).longValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.H0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.G0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void L(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.m(list.get(i13).intValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.t0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.s0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void M(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.k(list.get(i13).doubleValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.r0(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.q0(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    public void N(int i10, int i11) throws IOException {
        this.f27139a.Q0(i10, i11);
    }

    public void O(int i10, List<i> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f27139a.o0(i10, list.get(i11));
        }
    }

    public void a(int i10, List<?> list, n1 n1Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            j(i10, list.get(i11), n1Var);
        }
    }

    public void b(int i10, List<?> list, n1 n1Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            s(i10, list.get(i11), n1Var);
        }
    }

    public void c(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.s(list.get(i13).floatValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.z0(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.y0(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    public void d(int i10, int i11) throws IOException {
        this.f27139a.X0(i10, i11);
    }

    public final void e(int i10, Object obj) throws IOException {
        if (obj instanceof i) {
            this.f27139a.L0(i10, (i) obj);
        } else {
            this.f27139a.K0(i10, (v0) obj);
        }
    }

    public void f(int i10, int i11) throws IOException {
        this.f27139a.u0(i10, i11);
    }

    public void g(int i10, double d10) throws IOException {
        this.f27139a.q0(i10, d10);
    }

    public void h(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.O(list.get(i13).longValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.P0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.O0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void i(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.Z(list.get(i13).longValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.a1(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.Z0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void j(int i10, Object obj, n1 n1Var) throws IOException {
        this.f27139a.I0(i10, (v0) obj, n1Var);
    }

    public void k(int i10, long j10) throws IOException {
        this.f27139a.w0(i10, j10);
    }

    public c2.a l() {
        return c2.a.ASCENDING;
    }

    public void m(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            while (i11 < list.size()) {
                V(i10, k0Var.s(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.U0(i10, list.get(i11));
            i11++;
        }
    }

    public void n(int i10, String str) throws IOException {
        this.f27139a.U0(i10, str);
    }

    public void o(int i10, long j10) throws IOException {
        this.f27139a.Z0(i10, j10);
    }

    public void p(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.x(list.get(i13).intValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.F0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.E0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void q(int i10, long j10) throws IOException {
        this.f27139a.G0(i10, j10);
    }

    public void r(int i10, boolean z10) throws IOException {
        this.f27139a.k0(i10, z10);
    }

    public void s(int i10, Object obj, n1 n1Var) throws IOException {
        this.f27139a.B0(i10, (v0) obj, n1Var);
    }

    public void t(int i10, int i11) throws IOException {
        this.f27139a.M0(i10, i11);
    }

    @Deprecated
    public void u(int i10) throws IOException {
        this.f27139a.W0(i10, 3);
    }

    public void v(int i10, i iVar) throws IOException {
        this.f27139a.o0(i10, iVar);
    }

    public void w(int i10, int i11) throws IOException {
        this.f27139a.E0(i10, i11);
    }

    public void x(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.q(list.get(i13).longValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.x0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.w0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public void y(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f27139a.W0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += l.M(list.get(i13).intValue());
            }
            this.f27139a.Y0(i12);
            while (i11 < list.size()) {
                this.f27139a.N0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f27139a.M0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public void z(int i10, long j10) throws IOException {
        this.f27139a.O0(i10, j10);
    }
}
