package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.v0;
import com.google.protobuf.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite */
final class s extends r<z.d> {

    /* compiled from: ExtensionSchemaLite */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27208a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.b2.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27208a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f27208a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s.a.<clinit>():void");
        }
    }

    s() {
    }

    /* access modifiers changed from: package-private */
    public int a(Map.Entry<?, ?> entry) {
        return ((z.d) entry.getKey()).I();
    }

    /* access modifiers changed from: package-private */
    public Object b(q qVar, v0 v0Var, int i10) {
        return qVar.a(v0Var, i10);
    }

    /* access modifiers changed from: package-private */
    public v<z.d> c(Object obj) {
        return ((z.c) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    public v<z.d> d(Object obj) {
        return ((z.c) obj).e0();
    }

    /* access modifiers changed from: package-private */
    public boolean e(v0 v0Var) {
        return v0Var instanceof z.c;
    }

    /* access modifiers changed from: package-private */
    public void f(Object obj) {
        c(obj).u();
    }

    /* access modifiers changed from: package-private */
    public <UT, UB> UB g(Object obj, l1 l1Var, Object obj2, q qVar, v<z.d> vVar, UB ub2, v1<UT, UB> v1Var) throws IOException {
        Object i10;
        ArrayList arrayList;
        z.e eVar = (z.e) obj2;
        int c10 = eVar.c();
        if (!eVar.f27309b.J() || !eVar.f27309b.Z()) {
            Object obj3 = null;
            if (eVar.a() != b2.b.ENUM) {
                switch (a.f27208a[eVar.a().ordinal()]) {
                    case 1:
                        obj3 = Double.valueOf(l1Var.readDouble());
                        break;
                    case 2:
                        obj3 = Float.valueOf(l1Var.readFloat());
                        break;
                    case 3:
                        obj3 = Long.valueOf(l1Var.N());
                        break;
                    case 4:
                        obj3 = Long.valueOf(l1Var.b());
                        break;
                    case 5:
                        obj3 = Integer.valueOf(l1Var.I());
                        break;
                    case 6:
                        obj3 = Long.valueOf(l1Var.c());
                        break;
                    case 7:
                        obj3 = Integer.valueOf(l1Var.k());
                        break;
                    case 8:
                        obj3 = Boolean.valueOf(l1Var.l());
                        break;
                    case 9:
                        obj3 = Integer.valueOf(l1Var.p());
                        break;
                    case 10:
                        obj3 = Integer.valueOf(l1Var.K());
                        break;
                    case 11:
                        obj3 = Long.valueOf(l1Var.n());
                        break;
                    case 12:
                        obj3 = Integer.valueOf(l1Var.w());
                        break;
                    case 13:
                        obj3 = Long.valueOf(l1Var.x());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj3 = l1Var.G();
                        break;
                    case 16:
                        obj3 = l1Var.z();
                        break;
                    case 17:
                        if (!eVar.d()) {
                            Object i11 = vVar.i(eVar.f27309b);
                            if (i11 instanceof z) {
                                n1 d10 = i1.a().d(i11);
                                if (!((z) i11).M()) {
                                    Object i12 = d10.i();
                                    d10.a(i12, i11);
                                    vVar.y(eVar.f27309b, i12);
                                    i11 = i12;
                                }
                                l1Var.j(i11, d10, qVar);
                                return ub2;
                            }
                        }
                        obj3 = l1Var.A(eVar.b().getClass(), qVar);
                        break;
                    case 18:
                        if (!eVar.d()) {
                            Object i13 = vVar.i(eVar.f27309b);
                            if (i13 instanceof z) {
                                n1 d11 = i1.a().d(i13);
                                if (!((z) i13).M()) {
                                    Object i14 = d11.i();
                                    d11.a(i14, i13);
                                    vVar.y(eVar.f27309b, i14);
                                    i13 = i14;
                                }
                                l1Var.D(i13, d11, qVar);
                                return ub2;
                            }
                        }
                        obj3 = l1Var.i(eVar.b().getClass(), qVar);
                        break;
                }
            } else {
                int I = l1Var.I();
                if (eVar.f27309b.c().a(I) == null) {
                    return p1.L(obj, c10, I, ub2, v1Var);
                }
                obj3 = Integer.valueOf(I);
            }
            if (eVar.d()) {
                vVar.a(eVar.f27309b, obj3);
            } else {
                int i15 = a.f27208a[eVar.a().ordinal()];
                if ((i15 == 17 || i15 == 18) && (i10 = vVar.i(eVar.f27309b)) != null) {
                    obj3 = d0.h(i10, obj3);
                }
                vVar.y(eVar.f27309b, obj3);
            }
        } else {
            switch (a.f27208a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    l1Var.M(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    l1Var.H(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    l1Var.q(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    l1Var.o(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    l1Var.s(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    l1Var.P(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    l1Var.v(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    l1Var.y(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    l1Var.h(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    l1Var.d(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    l1Var.r(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    l1Var.a(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    l1Var.e(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    l1Var.t(arrayList);
                    ub2 = p1.z(obj, c10, arrayList, eVar.f27309b.c(), ub2, v1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f27309b.K());
            }
            vVar.y(eVar.f27309b, arrayList);
        }
        return ub2;
    }

    /* access modifiers changed from: package-private */
    public void h(l1 l1Var, Object obj, q qVar, v<z.d> vVar) throws IOException {
        z.e eVar = (z.e) obj;
        vVar.y(eVar.f27309b, l1Var.i(eVar.b().getClass(), qVar));
    }

    /* access modifiers changed from: package-private */
    public void i(i iVar, Object obj, q qVar, v<z.d> vVar) throws IOException {
        z.e eVar = (z.e) obj;
        v0.a j10 = eVar.b().j();
        j D = iVar.D();
        j10.u(D, qVar);
        vVar.y(eVar.f27309b, j10.A());
        D.a(0);
    }

    /* access modifiers changed from: package-private */
    public void j(c2 c2Var, Map.Entry<?, ?> entry) throws IOException {
        z.d dVar = (z.d) entry.getKey();
        if (dVar.J()) {
            switch (a.f27208a[dVar.K().ordinal()]) {
                case 1:
                    p1.P(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 2:
                    p1.T(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 3:
                    p1.W(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 4:
                    p1.e0(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 5:
                    p1.V(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 6:
                    p1.S(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 7:
                    p1.R(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 8:
                    p1.N(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 9:
                    p1.d0(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 10:
                    p1.Y(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 11:
                    p1.Z(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 12:
                    p1.a0(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 13:
                    p1.b0(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 14:
                    p1.V(dVar.I(), (List) entry.getValue(), c2Var, dVar.Z());
                    return;
                case 15:
                    p1.O(dVar.I(), (List) entry.getValue(), c2Var);
                    return;
                case 16:
                    p1.c0(dVar.I(), (List) entry.getValue(), c2Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        p1.U(dVar.I(), (List) entry.getValue(), c2Var, i1.a().c(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        p1.X(dVar.I(), (List) entry.getValue(), c2Var, i1.a().c(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (a.f27208a[dVar.K().ordinal()]) {
                case 1:
                    c2Var.g(dVar.I(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    c2Var.G(dVar.I(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    c2Var.q(dVar.I(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    c2Var.o(dVar.I(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    c2Var.w(dVar.I(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    c2Var.k(dVar.I(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    c2Var.f(dVar.I(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    c2Var.r(dVar.I(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    c2Var.d(dVar.I(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    c2Var.t(dVar.I(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    c2Var.z(dVar.I(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    c2Var.N(dVar.I(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    c2Var.F(dVar.I(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    c2Var.w(dVar.I(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    c2Var.v(dVar.I(), (i) entry.getValue());
                    return;
                case 16:
                    c2Var.n(dVar.I(), (String) entry.getValue());
                    return;
                case 17:
                    c2Var.s(dVar.I(), entry.getValue(), i1.a().c(entry.getValue().getClass()));
                    return;
                case 18:
                    c2Var.j(dVar.I(), entry.getValue(), i1.a().c(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
