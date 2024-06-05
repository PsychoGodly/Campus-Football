package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.b2;
import java.io.IOException;
import java.util.List;

/* compiled from: CodedInputStreamReader */
final class k implements l1 {

    /* renamed from: a  reason: collision with root package name */
    private final j f27114a;

    /* renamed from: b  reason: collision with root package name */
    private int f27115b;

    /* renamed from: c  reason: collision with root package name */
    private int f27116c;

    /* renamed from: d  reason: collision with root package name */
    private int f27117d = 0;

    /* compiled from: CodedInputStreamReader */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27118a;

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
                f27118a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f27118a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r1 = com.google.protobuf.b2.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.a.<clinit>():void");
        }
    }

    private k(j jVar) {
        j jVar2 = (j) d0.b(jVar, "input");
        this.f27114a = jVar2;
        jVar2.f27063d = this;
    }

    public static k Q(j jVar) {
        k kVar = jVar.f27063d;
        if (kVar != null) {
            return kVar;
        }
        return new k(jVar);
    }

    private <T> void R(T t10, n1<T> n1Var, q qVar) throws IOException {
        int i10 = this.f27116c;
        this.f27116c = b2.c(b2.a(this.f27115b), 4);
        try {
            n1Var.e(t10, this, qVar);
            if (this.f27115b != this.f27116c) {
                throw e0.h();
            }
        } finally {
            this.f27116c = i10;
        }
    }

    private <T> void S(T t10, n1<T> n1Var, q qVar) throws IOException {
        int E = this.f27114a.E();
        j jVar = this.f27114a;
        if (jVar.f27060a < jVar.f27061b) {
            int n10 = jVar.n(E);
            this.f27114a.f27060a++;
            n1Var.e(t10, this, qVar);
            this.f27114a.a(0);
            j jVar2 = this.f27114a;
            jVar2.f27060a--;
            jVar2.m(n10);
            return;
        }
        throw e0.i();
    }

    private Object T(b2.b bVar, Class<?> cls, q qVar) throws IOException {
        switch (a.f27118a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(l());
            case 2:
                return G();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(u());
            case 5:
                return Integer.valueOf(k());
            case 6:
                return Long.valueOf(c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(I());
            case 9:
                return Long.valueOf(N());
            case 10:
                return i(cls, qVar);
            case 11:
                return Integer.valueOf(K());
            case 12:
                return Long.valueOf(n());
            case 13:
                return Integer.valueOf(w());
            case 14:
                return Long.valueOf(x());
            case 15:
                return O();
            case 16:
                return Integer.valueOf(p());
            case 17:
                return Long.valueOf(b());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T U(n1<T> n1Var, q qVar) throws IOException {
        T i10 = n1Var.i();
        R(i10, n1Var, qVar);
        n1Var.c(i10);
        return i10;
    }

    private <T> T V(n1<T> n1Var, q qVar) throws IOException {
        T i10 = n1Var.i();
        S(i10, n1Var, qVar);
        n1Var.c(i10);
        return i10;
    }

    private void X(int i10) throws IOException {
        if (this.f27114a.d() != i10) {
            throw e0.m();
        }
    }

    private void Y(int i10) throws IOException {
        if (b2.b(this.f27115b) != i10) {
            throw e0.e();
        }
    }

    private void Z(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw e0.h();
        }
    }

    private void a0(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw e0.h();
        }
    }

    @Deprecated
    public <T> T A(Class<T> cls, q qVar) throws IOException {
        Y(3);
        return U(i1.a().c(cls), qVar);
    }

    public int B() throws IOException {
        int i10 = this.f27117d;
        if (i10 != 0) {
            this.f27115b = i10;
            this.f27117d = 0;
        } else {
            this.f27115b = this.f27114a.D();
        }
        int i11 = this.f27115b;
        return (i11 == 0 || i11 == this.f27116c) ? a.e.API_PRIORITY_OTHER : b2.a(i11);
    }

    public void C(List<String> list) throws IOException {
        W(list, false);
    }

    public <T> void D(T t10, n1<T> n1Var, q qVar) throws IOException {
        Y(2);
        S(t10, n1Var, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (J() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.e0("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void E(java.util.Map<K, V> r8, com.google.protobuf.o0.a<K, V> r9, com.google.protobuf.q r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.j r1 = r7.f27114a
            int r1 = r1.E()
            com.google.protobuf.j r2 = r7.f27114a
            int r1 = r2.n(r1)
            K r2 = r9.f27166b
            V r3 = r9.f27168d
        L_0x0014:
            int r4 = r7.B()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.j r5 = r7.f27114a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.J()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.e0 r4 = new com.google.protobuf.e0     // Catch:{ a -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            com.google.protobuf.b2$b r4 = r9.f27167c     // Catch:{ a -> 0x004f }
            V r5 = r9.f27168d     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.b2$b r4 = r9.f27165a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.J()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.e0 r8 = new com.google.protobuf.e0     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.j r8 = r7.f27114a
            r8.m(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.j r9 = r7.f27114a
            r9.m(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.E(java.util.Map, com.google.protobuf.o0$a, com.google.protobuf.q):void");
    }

    public void F(List<String> list) throws IOException {
        W(list, true);
    }

    public i G() throws IOException {
        Y(2);
        return this.f27114a.p();
    }

    public void H(List<Float> list) throws IOException {
        int D;
        int D2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 2) {
                int E = this.f27114a.E();
                Z(E);
                int d10 = this.f27114a.d() + E;
                do {
                    xVar.f(this.f27114a.u());
                } while (this.f27114a.d() < d10);
            } else if (b10 == 5) {
                do {
                    xVar.f(this.f27114a.u());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 2) {
                int E2 = this.f27114a.E();
                Z(E2);
                int d11 = this.f27114a.d() + E2;
                do {
                    list.add(Float.valueOf(this.f27114a.u()));
                } while (this.f27114a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f27114a.u()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else {
                throw e0.e();
            }
        }
    }

    public int I() throws IOException {
        Y(0);
        return this.f27114a.v();
    }

    public boolean J() throws IOException {
        int i10;
        if (this.f27114a.e() || (i10 = this.f27115b) == this.f27116c) {
            return false;
        }
        return this.f27114a.H(i10);
    }

    public int K() throws IOException {
        Y(5);
        return this.f27114a.x();
    }

    public void L(List<i> list) throws IOException {
        int D;
        if (b2.b(this.f27115b) == 2) {
            do {
                list.add(G());
                if (!this.f27114a.e()) {
                    D = this.f27114a.D();
                } else {
                    return;
                }
            } while (D == this.f27115b);
            this.f27117d = D;
            return;
        }
        throw e0.e();
    }

    public void M(List<Double> list) throws IOException {
        int D;
        int D2;
        if (list instanceof n) {
            n nVar = (n) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 1) {
                do {
                    nVar.f(this.f27114a.q());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int E = this.f27114a.E();
                a0(E);
                int d10 = this.f27114a.d() + E;
                do {
                    nVar.f(this.f27114a.q());
                } while (this.f27114a.d() < d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f27114a.q()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int E2 = this.f27114a.E();
                a0(E2);
                int d11 = this.f27114a.d() + E2;
                do {
                    list.add(Double.valueOf(this.f27114a.q()));
                } while (this.f27114a.d() < d11);
            } else {
                throw e0.e();
            }
        }
    }

    public long N() throws IOException {
        Y(0);
        return this.f27114a.w();
    }

    public String O() throws IOException {
        Y(2);
        return this.f27114a.C();
    }

    public void P(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 1) {
                do {
                    m0Var.g(this.f27114a.t());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int E = this.f27114a.E();
                a0(E);
                int d10 = this.f27114a.d() + E;
                do {
                    m0Var.g(this.f27114a.t());
                } while (this.f27114a.d() < d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f27114a.t()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int E2 = this.f27114a.E();
                a0(E2);
                int d11 = this.f27114a.d() + E2;
                do {
                    list.add(Long.valueOf(this.f27114a.t()));
                } while (this.f27114a.d() < d11);
            } else {
                throw e0.e();
            }
        }
    }

    public void W(List<String> list, boolean z10) throws IOException {
        int D;
        int D2;
        if (b2.b(this.f27115b) != 2) {
            throw e0.e();
        } else if (!(list instanceof k0) || z10) {
            do {
                list.add(z10 ? O() : z());
                if (!this.f27114a.e()) {
                    D = this.f27114a.D();
                } else {
                    return;
                }
            } while (D == this.f27115b);
            this.f27117d = D;
        } else {
            k0 k0Var = (k0) list;
            do {
                k0Var.a(G());
                if (!this.f27114a.e()) {
                    D2 = this.f27114a.D();
                } else {
                    return;
                }
            } while (D2 == this.f27115b);
            this.f27117d = D2;
        }
    }

    public void a(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 0) {
                do {
                    c0Var.k(this.f27114a.z());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int d10 = this.f27114a.d() + this.f27114a.E();
                do {
                    c0Var.k(this.f27114a.z());
                } while (this.f27114a.d() < d10);
                X(d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f27114a.z()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int d11 = this.f27114a.d() + this.f27114a.E();
                do {
                    list.add(Integer.valueOf(this.f27114a.z()));
                } while (this.f27114a.d() < d11);
                X(d11);
            } else {
                throw e0.e();
            }
        }
    }

    public long b() throws IOException {
        Y(0);
        return this.f27114a.F();
    }

    public long c() throws IOException {
        Y(1);
        return this.f27114a.t();
    }

    public void d(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 2) {
                int E = this.f27114a.E();
                Z(E);
                int d10 = this.f27114a.d() + E;
                do {
                    c0Var.k(this.f27114a.x());
                } while (this.f27114a.d() < d10);
            } else if (b10 == 5) {
                do {
                    c0Var.k(this.f27114a.x());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 2) {
                int E2 = this.f27114a.E();
                Z(E2);
                int d11 = this.f27114a.d() + E2;
                do {
                    list.add(Integer.valueOf(this.f27114a.x()));
                } while (this.f27114a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f27114a.x()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else {
                throw e0.e();
            }
        }
    }

    public void e(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 0) {
                do {
                    m0Var.g(this.f27114a.A());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int d10 = this.f27114a.d() + this.f27114a.E();
                do {
                    m0Var.g(this.f27114a.A());
                } while (this.f27114a.d() < d10);
                X(d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f27114a.A()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int d11 = this.f27114a.d() + this.f27114a.E();
                do {
                    list.add(Long.valueOf(this.f27114a.A()));
                } while (this.f27114a.d() < d11);
                X(d11);
            } else {
                throw e0.e();
            }
        }
    }

    @Deprecated
    public <T> void f(List<T> list, n1<T> n1Var, q qVar) throws IOException {
        int D;
        if (b2.b(this.f27115b) == 3) {
            int i10 = this.f27115b;
            do {
                list.add(U(n1Var, qVar));
                if (!this.f27114a.e() && this.f27117d == 0) {
                    D = this.f27114a.D();
                } else {
                    return;
                }
            } while (D == i10);
            this.f27117d = D;
            return;
        }
        throw e0.e();
    }

    public int g() {
        return this.f27115b;
    }

    public void h(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 0) {
                do {
                    c0Var.k(this.f27114a.E());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int d10 = this.f27114a.d() + this.f27114a.E();
                do {
                    c0Var.k(this.f27114a.E());
                } while (this.f27114a.d() < d10);
                X(d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f27114a.E()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int d11 = this.f27114a.d() + this.f27114a.E();
                do {
                    list.add(Integer.valueOf(this.f27114a.E()));
                } while (this.f27114a.d() < d11);
                X(d11);
            } else {
                throw e0.e();
            }
        }
    }

    public <T> T i(Class<T> cls, q qVar) throws IOException {
        Y(2);
        return V(i1.a().c(cls), qVar);
    }

    public <T> void j(T t10, n1<T> n1Var, q qVar) throws IOException {
        Y(3);
        R(t10, n1Var, qVar);
    }

    public int k() throws IOException {
        Y(5);
        return this.f27114a.s();
    }

    public boolean l() throws IOException {
        Y(0);
        return this.f27114a.o();
    }

    public <T> void m(List<T> list, n1<T> n1Var, q qVar) throws IOException {
        int D;
        if (b2.b(this.f27115b) == 2) {
            int i10 = this.f27115b;
            do {
                list.add(V(n1Var, qVar));
                if (!this.f27114a.e() && this.f27117d == 0) {
                    D = this.f27114a.D();
                } else {
                    return;
                }
            } while (D == i10);
            this.f27117d = D;
            return;
        }
        throw e0.e();
    }

    public long n() throws IOException {
        Y(1);
        return this.f27114a.y();
    }

    public void o(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 0) {
                do {
                    m0Var.g(this.f27114a.F());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int d10 = this.f27114a.d() + this.f27114a.E();
                do {
                    m0Var.g(this.f27114a.F());
                } while (this.f27114a.d() < d10);
                X(d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f27114a.F()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int d11 = this.f27114a.d() + this.f27114a.E();
                do {
                    list.add(Long.valueOf(this.f27114a.F()));
                } while (this.f27114a.d() < d11);
                X(d11);
            } else {
                throw e0.e();
            }
        }
    }

    public int p() throws IOException {
        Y(0);
        return this.f27114a.E();
    }

    public void q(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 0) {
                do {
                    m0Var.g(this.f27114a.w());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int d10 = this.f27114a.d() + this.f27114a.E();
                do {
                    m0Var.g(this.f27114a.w());
                } while (this.f27114a.d() < d10);
                X(d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f27114a.w()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int d11 = this.f27114a.d() + this.f27114a.E();
                do {
                    list.add(Long.valueOf(this.f27114a.w()));
                } while (this.f27114a.d() < d11);
                X(d11);
            } else {
                throw e0.e();
            }
        }
    }

    public void r(List<Long> list) throws IOException {
        int D;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 1) {
                do {
                    m0Var.g(this.f27114a.y());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int E = this.f27114a.E();
                a0(E);
                int d10 = this.f27114a.d() + E;
                do {
                    m0Var.g(this.f27114a.y());
                } while (this.f27114a.d() < d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f27114a.y()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int E2 = this.f27114a.E();
                a0(E2);
                int d11 = this.f27114a.d() + E2;
                do {
                    list.add(Long.valueOf(this.f27114a.y()));
                } while (this.f27114a.d() < d11);
            } else {
                throw e0.e();
            }
        }
    }

    public double readDouble() throws IOException {
        Y(1);
        return this.f27114a.q();
    }

    public float readFloat() throws IOException {
        Y(5);
        return this.f27114a.u();
    }

    public void s(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 0) {
                do {
                    c0Var.k(this.f27114a.v());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int d10 = this.f27114a.d() + this.f27114a.E();
                do {
                    c0Var.k(this.f27114a.v());
                } while (this.f27114a.d() < d10);
                X(d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f27114a.v()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int d11 = this.f27114a.d() + this.f27114a.E();
                do {
                    list.add(Integer.valueOf(this.f27114a.v()));
                } while (this.f27114a.d() < d11);
                X(d11);
            } else {
                throw e0.e();
            }
        }
    }

    public void t(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 0) {
                do {
                    c0Var.k(this.f27114a.r());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int d10 = this.f27114a.d() + this.f27114a.E();
                do {
                    c0Var.k(this.f27114a.r());
                } while (this.f27114a.d() < d10);
                X(d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f27114a.r()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int d11 = this.f27114a.d() + this.f27114a.E();
                do {
                    list.add(Integer.valueOf(this.f27114a.r()));
                } while (this.f27114a.d() < d11);
                X(d11);
            } else {
                throw e0.e();
            }
        }
    }

    public int u() throws IOException {
        Y(0);
        return this.f27114a.r();
    }

    public void v(List<Integer> list) throws IOException {
        int D;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 2) {
                int E = this.f27114a.E();
                Z(E);
                int d10 = this.f27114a.d() + E;
                do {
                    c0Var.k(this.f27114a.s());
                } while (this.f27114a.d() < d10);
            } else if (b10 == 5) {
                do {
                    c0Var.k(this.f27114a.s());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 2) {
                int E2 = this.f27114a.E();
                Z(E2);
                int d11 = this.f27114a.d() + E2;
                do {
                    list.add(Integer.valueOf(this.f27114a.s()));
                } while (this.f27114a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f27114a.s()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else {
                throw e0.e();
            }
        }
    }

    public int w() throws IOException {
        Y(0);
        return this.f27114a.z();
    }

    public long x() throws IOException {
        Y(0);
        return this.f27114a.A();
    }

    public void y(List<Boolean> list) throws IOException {
        int D;
        int D2;
        if (list instanceof g) {
            g gVar = (g) list;
            int b10 = b2.b(this.f27115b);
            if (b10 == 0) {
                do {
                    gVar.g(this.f27114a.o());
                    if (!this.f27114a.e()) {
                        D2 = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f27115b);
                this.f27117d = D2;
            } else if (b10 == 2) {
                int d10 = this.f27114a.d() + this.f27114a.E();
                do {
                    gVar.g(this.f27114a.o());
                } while (this.f27114a.d() < d10);
                X(d10);
            } else {
                throw e0.e();
            }
        } else {
            int b11 = b2.b(this.f27115b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f27114a.o()));
                    if (!this.f27114a.e()) {
                        D = this.f27114a.D();
                    } else {
                        return;
                    }
                } while (D == this.f27115b);
                this.f27117d = D;
            } else if (b11 == 2) {
                int d11 = this.f27114a.d() + this.f27114a.E();
                do {
                    list.add(Boolean.valueOf(this.f27114a.o()));
                } while (this.f27114a.d() < d11);
                X(d11);
            } else {
                throw e0.e();
            }
        }
    }

    public String z() throws IOException {
        Y(2);
        return this.f27114a.B();
    }
}
