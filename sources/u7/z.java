package u7;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import com.google.protobuf.e1;
import com.google.protobuf.i;
import com.google.protobuf.t1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p8.c;
import p8.d0;
import p8.u;
import y7.b;
import y7.g0;

/* compiled from: Values */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f30659a = ((d0) d0.C0().K(Double.NaN).build());

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f30660b;

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f30661c;

    /* renamed from: d  reason: collision with root package name */
    private static final d0 f30662d;

    /* renamed from: e  reason: collision with root package name */
    public static final d0 f30663e;

    /* compiled from: Values */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30664a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p8.d0$c[] r0 = p8.d0.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30664a = r0
                p8.d0$c r1 = p8.d0.c.NULL_VALUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x001d }
                p8.d0$c r1 = p8.d0.c.BOOLEAN_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p8.d0$c r1 = p8.d0.c.INTEGER_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p8.d0$c r1 = p8.d0.c.DOUBLE_VALUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x003e }
                p8.d0$c r1 = p8.d0.c.TIMESTAMP_VALUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x0049 }
                p8.d0$c r1 = p8.d0.c.STRING_VALUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x0054 }
                p8.d0$c r1 = p8.d0.c.BYTES_VALUE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x0060 }
                p8.d0$c r1 = p8.d0.c.REFERENCE_VALUE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x006c }
                p8.d0$c r1 = p8.d0.c.GEO_POINT_VALUE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x0078 }
                p8.d0$c r1 = p8.d0.c.ARRAY_VALUE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f30664a     // Catch:{ NoSuchFieldError -> 0x0084 }
                p8.d0$c r1 = p8.d0.c.MAP_VALUE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u7.z.a.<clinit>():void");
        }
    }

    static {
        d0 d0Var = (d0) d0.C0().P(e1.NULL_VALUE).build();
        f30660b = d0Var;
        f30661c = d0Var;
        d0 d0Var2 = (d0) d0.C0().R("__max__").build();
        f30662d = d0Var2;
        f30663e = (d0) d0.C0().N(u.o0().H("__type__", d0Var2)).build();
    }

    public static boolean A(d0 d0Var) {
        return v(d0Var) || u(d0Var);
    }

    public static boolean B(d0 d0Var) {
        return d0Var != null && d0Var.B0() == d0.c.REFERENCE_VALUE;
    }

    public static int C(d0 d0Var, boolean z10, d0 d0Var2, boolean z11) {
        int i10 = i(d0Var, d0Var2);
        if (i10 != 0) {
            return i10;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? 0 : 1;
        }
        return -1;
    }

    private static boolean D(d0 d0Var, d0 d0Var2) {
        d0.c B0 = d0Var.B0();
        d0.c cVar = d0.c.INTEGER_VALUE;
        if (B0 != cVar || d0Var2.B0() != cVar) {
            d0.c B02 = d0Var.B0();
            d0.c cVar2 = d0.c.DOUBLE_VALUE;
            if (B02 == cVar2 && d0Var2.B0() == cVar2 && Double.doubleToLongBits(d0Var.u0()) == Double.doubleToLongBits(d0Var2.u0())) {
                return true;
            }
            return false;
        } else if (d0Var.w0() == d0Var2.w0()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean E(d0 d0Var, d0 d0Var2) {
        u x02 = d0Var.x0();
        u x03 = d0Var2.x0();
        if (x02.h0() != x03.h0()) {
            return false;
        }
        for (Map.Entry next : x02.i0().entrySet()) {
            if (!q((d0) next.getValue(), x03.i0().get(next.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static d0 F(f fVar, l lVar) {
        return (d0) d0.C0().Q(String.format("projects/%s/databases/%s/documents/%s", new Object[]{fVar.f(), fVar.e(), lVar.toString()})).build();
    }

    public static int G(d0 d0Var) {
        switch (a.f30664a[d0Var.B0().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (v.c(d0Var)) {
                    return 4;
                }
                if (x(d0Var)) {
                    return a.e.API_PRIORITY_OTHER;
                }
                return 10;
            default:
                throw b.a("Invalid value type: " + d0Var.B0(), new Object[0]);
        }
    }

    public static int H(d0 d0Var, boolean z10, d0 d0Var2, boolean z11) {
        int i10 = i(d0Var, d0Var2);
        if (i10 != 0) {
            return i10;
        }
        if (!z10 || z11) {
            return (z10 || !z11) ? 0 : -1;
        }
        return 1;
    }

    private static boolean a(d0 d0Var, d0 d0Var2) {
        p8.b q02 = d0Var.q0();
        p8.b q03 = d0Var2.q0();
        if (q02.n0() != q03.n0()) {
            return false;
        }
        for (int i10 = 0; i10 < q02.n0(); i10++) {
            if (!q(q02.m0(i10), q03.m0(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String b(d0 d0Var) {
        StringBuilder sb2 = new StringBuilder();
        h(sb2, d0Var);
        return sb2.toString();
    }

    private static void c(StringBuilder sb2, p8.b bVar) {
        sb2.append("[");
        for (int i10 = 0; i10 < bVar.n0(); i10++) {
            h(sb2, bVar.m0(i10));
            if (i10 != bVar.n0() - 1) {
                sb2.append(",");
            }
        }
        sb2.append("]");
    }

    private static void d(StringBuilder sb2, u8.a aVar) {
        sb2.append(String.format("geo(%s,%s)", new Object[]{Double.valueOf(aVar.i0()), Double.valueOf(aVar.j0())}));
    }

    private static void e(StringBuilder sb2, u uVar) {
        ArrayList<String> arrayList = new ArrayList<>(uVar.i0().keySet());
        Collections.sort(arrayList);
        sb2.append("{");
        boolean z10 = true;
        for (String str : arrayList) {
            if (!z10) {
                sb2.append(",");
            } else {
                z10 = false;
            }
            sb2.append(str);
            sb2.append(":");
            h(sb2, uVar.k0(str));
        }
        sb2.append("}");
    }

    private static void f(StringBuilder sb2, d0 d0Var) {
        b.d(B(d0Var), "Value should be a ReferenceValue", new Object[0]);
        sb2.append(l.f(d0Var.y0()));
    }

    private static void g(StringBuilder sb2, t1 t1Var) {
        sb2.append(String.format("time(%s,%s)", new Object[]{Long.valueOf(t1Var.j0()), Integer.valueOf(t1Var.i0())}));
    }

    private static void h(StringBuilder sb2, d0 d0Var) {
        switch (a.f30664a[d0Var.B0().ordinal()]) {
            case 1:
                sb2.append("null");
                return;
            case 2:
                sb2.append(d0Var.r0());
                return;
            case 3:
                sb2.append(d0Var.w0());
                return;
            case 4:
                sb2.append(d0Var.u0());
                return;
            case 5:
                g(sb2, d0Var.A0());
                return;
            case 6:
                sb2.append(d0Var.z0());
                return;
            case 7:
                sb2.append(g0.A(d0Var.s0()));
                return;
            case 8:
                f(sb2, d0Var);
                return;
            case 9:
                d(sb2, d0Var.v0());
                return;
            case 10:
                c(sb2, d0Var.q0());
                return;
            case 11:
                e(sb2, d0Var.x0());
                return;
            default:
                throw b.a("Invalid value type: " + d0Var.B0(), new Object[0]);
        }
    }

    public static int i(d0 d0Var, d0 d0Var2) {
        int G = G(d0Var);
        int G2 = G(d0Var2);
        if (G != G2) {
            return g0.l(G, G2);
        }
        if (G != Integer.MAX_VALUE) {
            switch (G) {
                case 0:
                    break;
                case 1:
                    return g0.h(d0Var.r0(), d0Var2.r0());
                case 2:
                    return m(d0Var, d0Var2);
                case 3:
                    return o(d0Var.A0(), d0Var2.A0());
                case 4:
                    return o(v.a(d0Var), v.a(d0Var2));
                case 5:
                    return d0Var.z0().compareTo(d0Var2.z0());
                case 6:
                    return g0.j(d0Var.s0(), d0Var2.s0());
                case 7:
                    return n(d0Var.y0(), d0Var2.y0());
                case 8:
                    return k(d0Var.v0(), d0Var2.v0());
                case 9:
                    return j(d0Var.q0(), d0Var2.q0());
                case 10:
                    return l(d0Var.x0(), d0Var2.x0());
                default:
                    throw b.a("Invalid value type: " + G, new Object[0]);
            }
        }
        return 0;
    }

    private static int j(p8.b bVar, p8.b bVar2) {
        int min = Math.min(bVar.n0(), bVar2.n0());
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = i(bVar.m0(i10), bVar2.m0(i10));
            if (i11 != 0) {
                return i11;
            }
        }
        return g0.l(bVar.n0(), bVar2.n0());
    }

    private static int k(u8.a aVar, u8.a aVar2) {
        int k10 = g0.k(aVar.i0(), aVar2.i0());
        return k10 == 0 ? g0.k(aVar.j0(), aVar2.j0()) : k10;
    }

    private static int l(u uVar, u uVar2) {
        Iterator it = new TreeMap(uVar.i0()).entrySet().iterator();
        Iterator it2 = new TreeMap(uVar2.i0()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
            if (compareTo != 0) {
                return compareTo;
            }
            int i10 = i((d0) entry.getValue(), (d0) entry2.getValue());
            if (i10 != 0) {
                return i10;
            }
        }
        return g0.h(it.hasNext(), it2.hasNext());
    }

    private static int m(d0 d0Var, d0 d0Var2) {
        d0.c B0 = d0Var.B0();
        d0.c cVar = d0.c.DOUBLE_VALUE;
        if (B0 == cVar) {
            double u02 = d0Var.u0();
            if (d0Var2.B0() == cVar) {
                return g0.k(u02, d0Var2.u0());
            }
            if (d0Var2.B0() == d0.c.INTEGER_VALUE) {
                return g0.n(u02, d0Var2.w0());
            }
        } else {
            d0.c B02 = d0Var.B0();
            d0.c cVar2 = d0.c.INTEGER_VALUE;
            if (B02 == cVar2) {
                long w02 = d0Var.w0();
                if (d0Var2.B0() == cVar2) {
                    return g0.m(w02, d0Var2.w0());
                }
                if (d0Var2.B0() == cVar) {
                    return g0.n(d0Var2.u0(), w02) * -1;
                }
            }
        }
        throw b.a("Unexpected values: %s vs %s", d0Var, d0Var2);
    }

    private static int n(String str, String str2) {
        String[] split = str.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, -1);
        String[] split2 = str2.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, -1);
        int min = Math.min(split.length, split2.length);
        for (int i10 = 0; i10 < min; i10++) {
            int compareTo = split[i10].compareTo(split2[i10]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return g0.l(split.length, split2.length);
    }

    private static int o(t1 t1Var, t1 t1Var2) {
        int m10 = g0.m(t1Var.j0(), t1Var2.j0());
        if (m10 != 0) {
            return m10;
        }
        return g0.l(t1Var.i0(), t1Var2.i0());
    }

    public static boolean p(c cVar, d0 d0Var) {
        for (d0 q10 : cVar.g()) {
            if (q(q10, d0Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(d0 d0Var, d0 d0Var2) {
        int G;
        if (d0Var == d0Var2) {
            return true;
        }
        if (d0Var == null || d0Var2 == null || (G = G(d0Var)) != G(d0Var2)) {
            return false;
        }
        if (G == 2) {
            return D(d0Var, d0Var2);
        }
        if (G == 4) {
            return v.a(d0Var).equals(v.a(d0Var2));
        }
        if (G == Integer.MAX_VALUE) {
            return true;
        }
        if (G == 9) {
            return a(d0Var, d0Var2);
        }
        if (G != 10) {
            return d0Var.equals(d0Var2);
        }
        return E(d0Var, d0Var2);
    }

    public static d0 r(d0.c cVar) {
        switch (a.f30664a[cVar.ordinal()]) {
            case 1:
                return f30660b;
            case 2:
                return (d0) d0.C0().I(false).build();
            case 3:
            case 4:
                return (d0) d0.C0().K(Double.NaN).build();
            case 5:
                return (d0) d0.C0().S(t1.k0().G(Long.MIN_VALUE)).build();
            case 6:
                return (d0) d0.C0().R(MaxReward.DEFAULT_LABEL).build();
            case 7:
                return (d0) d0.C0().J(i.f27039b).build();
            case 8:
                return F(f.f30615c, l.d());
            case 9:
                return (d0) d0.C0().L(u8.a.k0().F(-90.0d).G(-180.0d)).build();
            case 10:
                return (d0) d0.C0().H(p8.b.l0()).build();
            case 11:
                return (d0) d0.C0().O(u.g0()).build();
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
    }

    public static d0 s(d0.c cVar) {
        switch (a.f30664a[cVar.ordinal()]) {
            case 1:
                return r(d0.c.BOOLEAN_VALUE);
            case 2:
                return r(d0.c.INTEGER_VALUE);
            case 3:
            case 4:
                return r(d0.c.TIMESTAMP_VALUE);
            case 5:
                return r(d0.c.STRING_VALUE);
            case 6:
                return r(d0.c.BYTES_VALUE);
            case 7:
                return r(d0.c.REFERENCE_VALUE);
            case 8:
                return r(d0.c.GEO_POINT_VALUE);
            case 9:
                return r(d0.c.ARRAY_VALUE);
            case 10:
                return r(d0.c.MAP_VALUE);
            case 11:
                return f30663e;
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
    }

    public static boolean t(d0 d0Var) {
        return d0Var != null && d0Var.B0() == d0.c.ARRAY_VALUE;
    }

    public static boolean u(d0 d0Var) {
        return d0Var != null && d0Var.B0() == d0.c.DOUBLE_VALUE;
    }

    public static boolean v(d0 d0Var) {
        return d0Var != null && d0Var.B0() == d0.c.INTEGER_VALUE;
    }

    public static boolean w(d0 d0Var) {
        return d0Var != null && d0Var.B0() == d0.c.MAP_VALUE;
    }

    public static boolean x(d0 d0Var) {
        return f30662d.equals(d0Var.x0().i0().get("__type__"));
    }

    public static boolean y(d0 d0Var) {
        return d0Var != null && Double.isNaN(d0Var.u0());
    }

    public static boolean z(d0 d0Var) {
        return d0Var != null && d0Var.B0() == d0.c.NULL_VALUE;
    }
}
