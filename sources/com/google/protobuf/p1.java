package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.v;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil */
final class p1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f27172a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final v1<?, ?> f27173b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final v1<?, ?> f27174c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final v1<?, ?> f27175d = new x1();

    static <UT, UB> UB A(Object obj, int i10, List<Integer> list, d0.e eVar, UB ub2, v1<UT, UB> v1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = L(obj, i10, intValue, ub2, v1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub2 = L(obj, i10, intValue2, ub2, v1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static v1<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (v1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends v.b<FT>> void E(r<FT> rVar, T t10, T t11) {
        v<FT> c10 = rVar.c(t11);
        if (!c10.n()) {
            rVar.d(t10).v(c10);
        }
    }

    static <T> void F(q0 q0Var, T t10, T t11, long j10) {
        z1.V(t10, j10, q0Var.a(z1.G(t10, j10), z1.G(t11, j10)));
    }

    static <T, UT, UB> void G(v1<UT, UB> v1Var, T t10, T t11) {
        v1Var.p(t10, v1Var.k(v1Var.g(t10), v1Var.g(t11)));
    }

    public static v1<?, ?> H() {
        return f27173b;
    }

    public static v1<?, ?> I() {
        return f27174c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!z.class.isAssignableFrom(cls) && (cls2 = f27172a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(Object obj, int i10, int i11, UB ub2, v1<UT, UB> v1Var) {
        if (ub2 == null) {
            ub2 = v1Var.f(obj);
        }
        v1Var.e(ub2, i10, (long) i11);
        return ub2;
    }

    public static v1<?, ?> M() {
        return f27175d;
    }

    public static void N(int i10, List<Boolean> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.B(i10, list, z10);
        }
    }

    public static void O(int i10, List<i> list, c2 c2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.O(i10, list);
        }
    }

    public static void P(int i10, List<Double> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.M(i10, list, z10);
        }
    }

    public static void Q(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.L(i10, list, z10);
        }
    }

    public static void R(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.A(i10, list, z10);
        }
    }

    public static void S(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.x(i10, list, z10);
        }
    }

    public static void T(int i10, List<Float> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.c(i10, list, z10);
        }
    }

    public static void U(int i10, List<?> list, c2 c2Var, n1 n1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.b(i10, list, n1Var);
        }
    }

    public static void V(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.p(i10, list, z10);
        }
    }

    public static void W(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.K(i10, list, z10);
        }
    }

    public static void X(int i10, List<?> list, c2 c2Var, n1 n1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.a(i10, list, n1Var);
        }
    }

    public static void Y(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.y(i10, list, z10);
        }
    }

    public static void Z(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.h(i10, list, z10);
        }
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return l.V(i10) + l.D(size);
        }
        return size * l.e(i10, true);
    }

    public static void a0(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.I(i10, list, z10);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.E(i10, list, z10);
        }
    }

    static int c(int i10, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * l.V(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            V += l.i(list.get(i11));
        }
        return V;
    }

    public static void c0(int i10, List<String> list, c2 c2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.m(i10, list);
        }
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        if (z10) {
            return l.V(i10) + l.D(e10);
        }
        return e10 + (size * l.V(i10));
    }

    public static void d0(int i10, List<Integer> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.D(i10, list, z10);
        }
    }

    static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.m(c0Var.n(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l.m(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, c2 c2Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.i(i10, list, z10);
        }
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return l.V(i10) + l.D(size * 4);
        }
        return size * l.n(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return l.V(i10) + l.D(size * 8);
        }
        return size * l.p(i10, 0);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i10, List<v0> list, n1 n1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += l.t(i10, list.get(i12), n1Var);
        }
        return i11;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        if (z10) {
            return l.V(i10) + l.D(l10);
        }
        return l10 + (size * l.V(i10));
    }

    static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.x(c0Var.n(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l.x(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        if (z10) {
            return l.V(i10) + l.D(n10);
        }
        return n10 + (list.size() * l.V(i10));
    }

    static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.z(m0Var.n(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l.z(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int o(int i10, Object obj, n1 n1Var) {
        if (obj instanceof i0) {
            return l.B(i10, (i0) obj);
        }
        return l.G(i10, (v0) obj, n1Var);
    }

    static int p(int i10, List<?> list, n1 n1Var) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = l.V(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof i0) {
                i11 = l.C((i0) obj);
            } else {
                i11 = l.I((v0) obj, n1Var);
            }
            V += i11;
        }
        return V;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        if (z10) {
            return l.V(i10) + l.D(r10);
        }
        return r10 + (size * l.V(i10));
    }

    static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.Q(c0Var.n(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l.Q(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        if (z10) {
            return l.V(i10) + l.D(t10);
        }
        return t10 + (size * l.V(i10));
    }

    static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.S(m0Var.n(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l.S(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int u(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int V = l.V(i10) * size;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            while (i13 < size) {
                Object s10 = k0Var.s(i13);
                if (s10 instanceof i) {
                    i12 = l.i((i) s10);
                } else {
                    i12 = l.U((String) s10);
                }
                V += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof i) {
                    i11 = l.i((i) obj);
                } else {
                    i11 = l.U((String) obj);
                }
                V += i11;
                i13++;
            }
        }
        return V;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        if (z10) {
            return l.V(i10) + l.D(w10);
        }
        return w10 + (size * l.V(i10));
    }

    static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.X(c0Var.n(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l.X(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        if (z10) {
            return l.V(i10) + l.D(y10);
        }
        return y10 + (size * l.V(i10));
    }

    static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += l.Z(m0Var.n(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + l.Z(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static <UT, UB> UB z(Object obj, int i10, List<Integer> list, d0.d<?> dVar, UB ub2, v1<UT, UB> v1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = L(obj, i10, intValue, ub2, v1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub2 = L(obj, i10, intValue2, ub2, v1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
