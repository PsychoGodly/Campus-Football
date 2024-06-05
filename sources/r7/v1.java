package r7;

import g7.c;
import g7.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r7.t0;
import r7.x1;
import u7.i;
import u7.l;
import u7.n;
import x7.u0;
import y7.g0;

/* compiled from: View */
public class v1 {

    /* renamed from: a  reason: collision with root package name */
    private final a1 f30027a;

    /* renamed from: b  reason: collision with root package name */
    private x1.a f30028b = x1.a.NONE;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30029c;

    /* renamed from: d  reason: collision with root package name */
    private n f30030d;

    /* renamed from: e  reason: collision with root package name */
    private e<l> f30031e;

    /* renamed from: f  reason: collision with root package name */
    private e<l> f30032f;

    /* renamed from: g  reason: collision with root package name */
    private e<l> f30033g;

    /* compiled from: View */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30034a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                r7.m$a[] r0 = r7.m.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30034a = r0
                r7.m$a r1 = r7.m.a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30034a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.m$a r1 = r7.m.a.MODIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30034a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r7.m$a r1 = r7.m.a.METADATA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30034a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r7.m$a r1 = r7.m.a.REMOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.v1.a.<clinit>():void");
        }
    }

    /* compiled from: View */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final n f30035a;

        /* renamed from: b  reason: collision with root package name */
        final n f30036b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final boolean f30037c;

        /* renamed from: d  reason: collision with root package name */
        final e<l> f30038d;

        /* synthetic */ b(n nVar, n nVar2, e eVar, boolean z10, a aVar) {
            this(nVar, nVar2, eVar, z10);
        }

        public boolean b() {
            return this.f30037c;
        }

        private b(n nVar, n nVar2, e<l> eVar, boolean z10) {
            this.f30035a = nVar;
            this.f30036b = nVar2;
            this.f30038d = eVar;
            this.f30037c = z10;
        }
    }

    public v1(a1 a1Var, e<l> eVar) {
        this.f30027a = a1Var;
        this.f30030d = n.e(a1Var.c());
        this.f30031e = eVar;
        this.f30032f = l.e();
        this.f30033g = l.e();
    }

    private void e(u0 u0Var) {
        if (u0Var != null) {
            Iterator<l> it = u0Var.b().iterator();
            while (it.hasNext()) {
                this.f30031e = this.f30031e.e(it.next());
            }
            Iterator<l> it2 = u0Var.c().iterator();
            while (it2.hasNext()) {
                l next = it2.next();
                y7.b.d(this.f30031e.contains(next), "Modified document %s not found in view.", next);
            }
            Iterator<l> it3 = u0Var.d().iterator();
            while (it3.hasNext()) {
                this.f30031e = this.f30031e.g(it3.next());
            }
            this.f30029c = u0Var.f();
        }
    }

    private static int f(m mVar) {
        int i10 = a.f30034a[mVar.c().ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (!(i10 == 2 || i10 == 3)) {
                if (i10 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + mVar.c());
            }
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int k(m mVar, m mVar2) {
        int l10 = g0.l(f(mVar), f(mVar2));
        if (l10 != 0) {
            return l10;
        }
        return this.f30027a.c().compare(mVar.b(), mVar2.b());
    }

    private boolean l(l lVar) {
        i f10;
        if (!this.f30031e.contains(lVar) && (f10 = this.f30030d.f(lVar)) != null && !f10.d()) {
            return true;
        }
        return false;
    }

    private boolean m(i iVar, i iVar2) {
        return iVar.d() && iVar2.c() && !iVar2.d();
    }

    private List<t0> n() {
        if (!this.f30029c) {
            return Collections.emptyList();
        }
        e<l> eVar = this.f30032f;
        this.f30032f = l.e();
        Iterator<i> it = this.f30030d.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (l(next.getKey())) {
                this.f30032f = this.f30032f.e(next.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(eVar.size() + this.f30032f.size());
        Iterator<l> it2 = eVar.iterator();
        while (it2.hasNext()) {
            l next2 = it2.next();
            if (!this.f30032f.contains(next2)) {
                arrayList.add(new t0(t0.a.REMOVED, next2));
            }
        }
        Iterator<l> it3 = this.f30032f.iterator();
        while (it3.hasNext()) {
            l next3 = it3.next();
            if (!eVar.contains(next3)) {
                arrayList.add(new t0(t0.a.ADDED, next3));
            }
        }
        return arrayList;
    }

    public w1 b(b bVar) {
        return c(bVar, (u0) null);
    }

    public w1 c(b bVar, u0 u0Var) {
        boolean z10;
        b bVar2 = bVar;
        u0 u0Var2 = u0Var;
        y7.b.d(!bVar.f30037c, "Cannot apply changes that need a refill", new Object[0]);
        n nVar = this.f30030d;
        this.f30030d = bVar2.f30035a;
        this.f30033g = bVar2.f30038d;
        List<m> b10 = bVar2.f30036b.b();
        Collections.sort(b10, new u1(this));
        e(u0Var2);
        List<t0> n10 = n();
        x1.a aVar = this.f30032f.size() == 0 && this.f30029c ? x1.a.SYNCED : x1.a.LOCAL;
        boolean z11 = aVar != this.f30028b;
        this.f30028b = aVar;
        x1 x1Var = null;
        if (b10.size() != 0 || z11) {
            boolean z12 = aVar == x1.a.LOCAL;
            if (u0Var2 != null && !u0Var.e().isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            x1Var = new x1(this.f30027a, bVar2.f30035a, nVar, b10, z12, bVar2.f30038d, z11, false, z10);
        }
        return new w1(x1Var, n10);
    }

    public w1 d(y0 y0Var) {
        if (!this.f30029c || y0Var != y0.OFFLINE) {
            return new w1((x1) null, Collections.emptyList());
        }
        this.f30029c = false;
        return b(new b(this.f30030d, new n(), this.f30033g, false, (a) null));
    }

    public b g(c<l, i> cVar) {
        return h(cVar, (b) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        if (r0.f30027a.c().compare(r6, r4) > 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        if (r0.f30027a.c().compare(r6, r7) < 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0131, code lost:
        if (r7 == null) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x015f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r7.v1.b h(g7.c<u7.l, u7.i> r19, r7.v1.b r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            if (r1 == 0) goto L_0x0009
            r7.n r2 = r1.f30036b
            goto L_0x000e
        L_0x0009:
            r7.n r2 = new r7.n
            r2.<init>()
        L_0x000e:
            r5 = r2
            if (r1 == 0) goto L_0x0014
            u7.n r2 = r1.f30035a
            goto L_0x0016
        L_0x0014:
            u7.n r2 = r0.f30030d
        L_0x0016:
            if (r1 == 0) goto L_0x001b
            g7.e<u7.l> r3 = r1.f30038d
            goto L_0x001d
        L_0x001b:
            g7.e<u7.l> r3 = r0.f30033g
        L_0x001d:
            r7.a1 r4 = r0.f30027a
            r7.a1$a r4 = r4.l()
            r7.a1$a r6 = r7.a1.a.LIMIT_TO_FIRST
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x003f
            int r4 = r2.size()
            long r7 = (long) r4
            r7.a1 r4 = r0.f30027a
            long r9 = r4.k()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x003f
            u7.i r4 = r2.h()
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            r7.a1 r7 = r0.f30027a
            r7.a1$a r7 = r7.l()
            r7.a1$a r8 = r7.a1.a.LIMIT_TO_LAST
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0062
            int r7 = r2.size()
            long r7 = (long) r7
            r7.a1 r9 = r0.f30027a
            long r9 = r9.k()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0062
            u7.i r7 = r2.g()
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            java.util.Iterator r8 = r19.iterator()
            r11 = r2
            r10 = 0
        L_0x0069:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0163
            java.lang.Object r12 = r8.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r14 = r12.getKey()
            u7.l r14 = (u7.l) r14
            u7.i r15 = r2.f(r14)
            r7.a1 r6 = r0.f30027a
            java.lang.Object r16 = r12.getValue()
            r13 = r16
            u7.i r13 = (u7.i) r13
            boolean r6 = r6.u(r13)
            if (r6 == 0) goto L_0x0096
            java.lang.Object r6 = r12.getValue()
            u7.i r6 = (u7.i) r6
            goto L_0x0097
        L_0x0096:
            r6 = 0
        L_0x0097:
            if (r15 == 0) goto L_0x00a7
            g7.e<u7.l> r12 = r0.f30033g
            u7.l r13 = r15.getKey()
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x00a7
            r12 = 1
            goto L_0x00a8
        L_0x00a7:
            r12 = 0
        L_0x00a8:
            if (r6 == 0) goto L_0x00c4
            boolean r13 = r6.d()
            if (r13 != 0) goto L_0x00c2
            g7.e<u7.l> r13 = r0.f30033g
            u7.l r9 = r6.getKey()
            boolean r9 = r13.contains(r9)
            if (r9 == 0) goto L_0x00c4
            boolean r9 = r6.c()
            if (r9 == 0) goto L_0x00c4
        L_0x00c2:
            r9 = 1
            goto L_0x00c5
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            if (r15 == 0) goto L_0x0111
            if (r6 == 0) goto L_0x0111
            u7.t r13 = r15.getData()
            r17 = r2
            u7.t r2 = r6.getData()
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0105
            boolean r2 = r0.m(r15, r6)
            if (r2 != 0) goto L_0x0135
            r7.m$a r2 = r7.m.a.MODIFIED
            r7.m r2 = r7.m.a(r2, r6)
            r5.a(r2)
            if (r4 == 0) goto L_0x00f6
            r7.a1 r2 = r0.f30027a
            java.util.Comparator r2 = r2.c()
            int r2 = r2.compare(r6, r4)
            if (r2 > 0) goto L_0x0133
        L_0x00f6:
            if (r7 == 0) goto L_0x0120
            r7.a1 r2 = r0.f30027a
            java.util.Comparator r2 = r2.c()
            int r2 = r2.compare(r6, r7)
            if (r2 >= 0) goto L_0x0120
            goto L_0x0133
        L_0x0105:
            if (r12 == r9) goto L_0x0135
            r7.m$a r2 = r7.m.a.METADATA
            r7.m r2 = r7.m.a(r2, r6)
            r5.a(r2)
            goto L_0x0120
        L_0x0111:
            r17 = r2
            if (r15 != 0) goto L_0x0122
            if (r6 == 0) goto L_0x0122
            r7.m$a r2 = r7.m.a.ADDED
            r7.m r2 = r7.m.a(r2, r6)
            r5.a(r2)
        L_0x0120:
            r13 = 1
            goto L_0x0136
        L_0x0122:
            if (r15 == 0) goto L_0x0135
            if (r6 != 0) goto L_0x0135
            r7.m$a r2 = r7.m.a.REMOVED
            r7.m r2 = r7.m.a(r2, r15)
            r5.a(r2)
            if (r4 != 0) goto L_0x0133
            if (r7 == 0) goto L_0x0120
        L_0x0133:
            r10 = 1
            goto L_0x0120
        L_0x0135:
            r13 = 0
        L_0x0136:
            if (r13 == 0) goto L_0x015f
            if (r6 == 0) goto L_0x0156
            u7.n r11 = r11.c(r6)
            boolean r2 = r6.d()
            if (r2 == 0) goto L_0x014d
            u7.l r2 = r6.getKey()
            g7.e r2 = r3.e(r2)
            goto L_0x015e
        L_0x014d:
            u7.l r2 = r6.getKey()
            g7.e r2 = r3.g(r2)
            goto L_0x015e
        L_0x0156:
            u7.n r11 = r11.o(r14)
            g7.e r2 = r3.g(r14)
        L_0x015e:
            r3 = r2
        L_0x015f:
            r2 = r17
            goto L_0x0069
        L_0x0163:
            r7.a1 r2 = r0.f30027a
            boolean r2 = r2.p()
            if (r2 == 0) goto L_0x01b0
            int r2 = r11.size()
            long r6 = (long) r2
            r7.a1 r2 = r0.f30027a
            long r8 = r2.k()
        L_0x0176:
            long r6 = r6 - r8
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b0
            r7.a1 r2 = r0.f30027a
            r7.a1$a r2 = r2.l()
            r7.a1$a r4 = r7.a1.a.LIMIT_TO_FIRST
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0190
            u7.i r2 = r11.h()
            goto L_0x0194
        L_0x0190:
            u7.i r2 = r11.g()
        L_0x0194:
            u7.l r4 = r2.getKey()
            u7.n r11 = r11.o(r4)
            u7.l r4 = r2.getKey()
            g7.e r3 = r3.g(r4)
            r7.m$a r4 = r7.m.a.REMOVED
            r7.m r2 = r7.m.a(r4, r2)
            r5.a(r2)
            r8 = 1
            goto L_0x0176
        L_0x01b0:
            r6 = r3
            r4 = r11
            if (r10 == 0) goto L_0x01ba
            if (r1 != 0) goto L_0x01b7
            goto L_0x01ba
        L_0x01b7:
            r1 = 0
            r13 = 0
            goto L_0x01bc
        L_0x01ba:
            r1 = 0
            r13 = 1
        L_0x01bc:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "View was refilled using docs that themselves needed refilling."
            y7.b.d(r13, r2, r1)
            r7.v1$b r1 = new r7.v1$b
            r8 = 0
            r3 = r1
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.v1.h(g7.c, r7.v1$b):r7.v1$b");
    }

    public x1.a i() {
        return this.f30028b;
    }

    /* access modifiers changed from: package-private */
    public e<l> j() {
        return this.f30031e;
    }
}
