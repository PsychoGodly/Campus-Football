package r7;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p8.d0;
import r7.p;
import r7.z0;
import u7.l;
import u7.q;
import u7.r;
import u7.u;

/* compiled from: Target */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private String f29894a;

    /* renamed from: b  reason: collision with root package name */
    private final List<z0> f29895b;

    /* renamed from: c  reason: collision with root package name */
    private final List<q> f29896c;

    /* renamed from: d  reason: collision with root package name */
    private final u f29897d;

    /* renamed from: e  reason: collision with root package name */
    private final String f29898e;

    /* renamed from: f  reason: collision with root package name */
    private final long f29899f;

    /* renamed from: g  reason: collision with root package name */
    private final i f29900g;

    /* renamed from: h  reason: collision with root package name */
    private final i f29901h;

    /* compiled from: Target */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29902a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                r7.p$b[] r0 = r7.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29902a = r0
                r7.p$b r1 = r7.p.b.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x001d }
                r7.p$b r1 = r7.p.b.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r7.p$b r1 = r7.p.b.EQUAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r7.p$b r1 = r7.p.b.IN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x003e }
                r7.p$b r1 = r7.p.b.NOT_IN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7.p$b r1 = r7.p.b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7.p$b r1 = r7.p.b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x0060 }
                r7.p$b r1 = r7.p.b.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x006c }
                r7.p$b r1 = r7.p.b.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f29902a     // Catch:{ NoSuchFieldError -> 0x0078 }
                r7.p$b r1 = r7.p.b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.f1.a.<clinit>():void");
        }
    }

    public f1(u uVar, String str, List<q> list, List<z0> list2, long j10, i iVar, i iVar2) {
        this.f29897d = uVar;
        this.f29898e = str;
        this.f29895b = list2;
        this.f29896c = list;
        this.f29899f = j10;
        this.f29900g = iVar;
        this.f29901h = iVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<p8.d0, java.lang.Boolean> b(u7.q.c r10, r7.i r11) {
        /*
            r9 = this;
            p8.d0 r0 = u7.z.f30661c
            u7.r r1 = r10.d()
            java.util.List r1 = r9.g(r1)
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 1
        L_0x0010:
            boolean r4 = r1.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r1.next()
            r7.p r4 = (r7.p) r4
            p8.d0 r6 = u7.z.f30661c
            int[] r7 = r7.f1.a.f29902a
            r7.p$b r8 = r4.g()
            int r8 = r8.ordinal()
            r7 = r7[r8]
            switch(r7) {
                case 3: goto L_0x0042;
                case 4: goto L_0x0042;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                case 7: goto L_0x0035;
                case 8: goto L_0x0035;
                case 9: goto L_0x0042;
                case 10: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r5 = 1
            goto L_0x0047
        L_0x0030:
            p8.d0 r6 = r4.h()
            goto L_0x0047
        L_0x0035:
            p8.d0 r4 = r4.h()
            p8.d0$c r4 = r4.B0()
            p8.d0 r6 = u7.z.r(r4)
            goto L_0x002e
        L_0x0042:
            p8.d0 r6 = r4.h()
            goto L_0x002e
        L_0x0047:
            int r4 = u7.z.C(r0, r3, r6, r5)
            if (r4 >= 0) goto L_0x0010
            r3 = r5
            r0 = r6
            goto L_0x0010
        L_0x0050:
            if (r11 == 0) goto L_0x008d
        L_0x0052:
            java.util.List<r7.z0> r1 = r9.f29895b
            int r1 = r1.size()
            if (r5 >= r1) goto L_0x008d
            java.util.List<r7.z0> r1 = r9.f29895b
            java.lang.Object r1 = r1.get(r5)
            r7.z0 r1 = (r7.z0) r1
            u7.r r1 = r1.c()
            u7.r r2 = r10.d()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x008a
            java.util.List r10 = r11.b()
            java.lang.Object r10 = r10.get(r5)
            p8.d0 r10 = (p8.d0) r10
            boolean r1 = r11.c()
            int r1 = u7.z.C(r0, r3, r10, r1)
            if (r1 >= 0) goto L_0x008d
            boolean r3 = r11.c()
            r0 = r10
            goto L_0x008d
        L_0x008a:
            int r5 = r5 + 1
            goto L_0x0052
        L_0x008d:
            android.util.Pair r10 = new android.util.Pair
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r10.<init>(r0, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.f1.b(u7.q$c, r7.i):android.util.Pair");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<p8.d0, java.lang.Boolean> e(u7.q.c r10, r7.i r11) {
        /*
            r9 = this;
            p8.d0 r0 = u7.z.f30663e
            u7.r r1 = r10.d()
            java.util.List r1 = r9.g(r1)
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 1
        L_0x0010:
            boolean r4 = r1.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r1.next()
            r7.p r4 = (r7.p) r4
            p8.d0 r6 = u7.z.f30663e
            int[] r7 = r7.f1.a.f29902a
            r7.p$b r8 = r4.g()
            int r8 = r8.ordinal()
            r7 = r7[r8]
            switch(r7) {
                case 3: goto L_0x0042;
                case 4: goto L_0x0042;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                case 7: goto L_0x003d;
                case 8: goto L_0x0042;
                case 9: goto L_0x0030;
                case 10: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r5 = 1
            goto L_0x0047
        L_0x0030:
            p8.d0 r4 = r4.h()
            p8.d0$c r4 = r4.B0()
            p8.d0 r6 = u7.z.s(r4)
            goto L_0x0047
        L_0x003d:
            p8.d0 r6 = r4.h()
            goto L_0x0047
        L_0x0042:
            p8.d0 r6 = r4.h()
            goto L_0x002e
        L_0x0047:
            int r4 = u7.z.H(r0, r3, r6, r5)
            if (r4 <= 0) goto L_0x0010
            r3 = r5
            r0 = r6
            goto L_0x0010
        L_0x0050:
            if (r11 == 0) goto L_0x008d
        L_0x0052:
            java.util.List<r7.z0> r1 = r9.f29895b
            int r1 = r1.size()
            if (r5 >= r1) goto L_0x008d
            java.util.List<r7.z0> r1 = r9.f29895b
            java.lang.Object r1 = r1.get(r5)
            r7.z0 r1 = (r7.z0) r1
            u7.r r1 = r1.c()
            u7.r r2 = r10.d()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x008a
            java.util.List r10 = r11.b()
            java.lang.Object r10 = r10.get(r5)
            p8.d0 r10 = (p8.d0) r10
            boolean r1 = r11.c()
            int r1 = u7.z.H(r0, r3, r10, r1)
            if (r1 <= 0) goto L_0x008d
            boolean r3 = r11.c()
            r0 = r10
            goto L_0x008d
        L_0x008a:
            int r5 = r5 + 1
            goto L_0x0052
        L_0x008d:
            android.util.Pair r10 = new android.util.Pair
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r10.<init>(r0, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.f1.e(u7.q$c, r7.i):android.util.Pair");
    }

    private List<p> g(r rVar) {
        ArrayList arrayList = new ArrayList();
        for (q next : this.f29896c) {
            if (next instanceof p) {
                p pVar = (p) next;
                if (pVar.f().equals(rVar)) {
                    arrayList.add(pVar);
                }
            }
        }
        return arrayList;
    }

    public List<d0> a(q qVar) {
        q.c c10 = qVar.c();
        if (c10 == null) {
            return null;
        }
        for (p next : g(c10.d())) {
            int i10 = a.f29902a[next.g().ordinal()];
            if (i10 == 1) {
                return next.h().q0().g();
            }
            if (i10 == 2) {
                return Collections.singletonList(next.h());
            }
        }
        return null;
    }

    public String c() {
        String str;
        String str2 = this.f29894a;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n().d());
        if (this.f29898e != null) {
            sb2.append("|cg:");
            sb2.append(this.f29898e);
        }
        sb2.append("|f:");
        for (q a10 : h()) {
            sb2.append(a10.a());
        }
        sb2.append("|ob:");
        for (z0 next : m()) {
            sb2.append(next.c().d());
            sb2.append(next.b().equals(z0.a.ASCENDING) ? "asc" : "desc");
        }
        if (r()) {
            sb2.append("|l:");
            sb2.append(j());
        }
        String str3 = "b:";
        if (this.f29900g != null) {
            sb2.append("|lb:");
            if (this.f29900g.c()) {
                str = str3;
            } else {
                str = "a:";
            }
            sb2.append(str);
            sb2.append(this.f29900g.d());
        }
        if (this.f29901h != null) {
            sb2.append("|ub:");
            if (this.f29901h.c()) {
                str3 = "a:";
            }
            sb2.append(str3);
            sb2.append(this.f29901h.d());
        }
        String sb3 = sb2.toString();
        this.f29894a = sb3;
        return sb3;
    }

    public String d() {
        return this.f29898e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f1.class != obj.getClass()) {
            return false;
        }
        f1 f1Var = (f1) obj;
        String str = this.f29898e;
        if (str == null ? f1Var.f29898e != null : !str.equals(f1Var.f29898e)) {
            return false;
        }
        if (this.f29899f != f1Var.f29899f || !this.f29895b.equals(f1Var.f29895b) || !this.f29896c.equals(f1Var.f29896c) || !this.f29897d.equals(f1Var.f29897d)) {
            return false;
        }
        i iVar = this.f29900g;
        if (iVar == null ? f1Var.f29900g != null : !iVar.equals(f1Var.f29900g)) {
            return false;
        }
        i iVar2 = this.f29901h;
        i iVar3 = f1Var.f29901h;
        if (iVar2 != null) {
            return iVar2.equals(iVar3);
        }
        if (iVar3 == null) {
            return true;
        }
        return false;
    }

    public i f() {
        return this.f29901h;
    }

    public List<q> h() {
        return this.f29896c;
    }

    public int hashCode() {
        int hashCode = this.f29895b.hashCode() * 31;
        String str = this.f29898e;
        int i10 = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f29899f;
        int hashCode3 = (((((((hashCode + hashCode2) * 31) + this.f29896c.hashCode()) * 31) + this.f29897d.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        i iVar = this.f29900g;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        i iVar2 = this.f29901h;
        if (iVar2 != null) {
            i10 = iVar2.hashCode();
        }
        return hashCode4 + i10;
    }

    public z0.a i() {
        List<z0> list = this.f29895b;
        return list.get(list.size() - 1).b();
    }

    public long j() {
        return this.f29899f;
    }

    public i k(q qVar) {
        Pair<d0, Boolean> pair;
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (q.c next : qVar.e()) {
            if (next.e().equals(q.c.a.ASCENDING)) {
                pair = b(next, this.f29900g);
            } else {
                pair = e(next, this.f29900g);
            }
            arrayList.add((d0) pair.first);
            z10 &= ((Boolean) pair.second).booleanValue();
        }
        return new i(arrayList, z10);
    }

    public Collection<d0> l(q qVar) {
        p next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        loop0:
        for (q.c next2 : qVar.e()) {
            Iterator<p> it = g(next2.d()).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    int i10 = a.f29902a[next.g().ordinal()];
                    if (i10 == 3 || i10 == 4) {
                        linkedHashMap.put(next2.d(), next.h());
                    } else if (i10 == 5 || i10 == 6) {
                        linkedHashMap.put(next2.d(), next.h());
                    }
                }
            }
            linkedHashMap.put(next2.d(), next.h());
            return linkedHashMap.values();
        }
        return null;
    }

    public List<z0> m() {
        return this.f29895b;
    }

    public u n() {
        return this.f29897d;
    }

    public int o() {
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (q c10 : this.f29896c) {
            for (p next : c10.c()) {
                if (!next.f().r()) {
                    if (next.g().equals(p.b.ARRAY_CONTAINS) || next.g().equals(p.b.ARRAY_CONTAINS_ANY)) {
                        i10 = 1;
                    } else {
                        hashSet.add(next.f());
                    }
                }
            }
        }
        for (z0 next2 : this.f29895b) {
            if (!next2.c().r()) {
                hashSet.add(next2.c());
            }
        }
        return hashSet.size() + i10;
    }

    public i p() {
        return this.f29900g;
    }

    public i q(q qVar) {
        Pair<d0, Boolean> pair;
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (q.c next : qVar.e()) {
            if (next.e().equals(q.c.a.ASCENDING)) {
                pair = e(next, this.f29901h);
            } else {
                pair = b(next, this.f29901h);
            }
            arrayList.add((d0) pair.first);
            z10 &= ((Boolean) pair.second).booleanValue();
        }
        return new i(arrayList, z10);
    }

    public boolean r() {
        return this.f29899f != -1;
    }

    public boolean s() {
        return l.n(this.f29897d) && this.f29898e == null && this.f29896c.isEmpty();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Query(");
        sb2.append(this.f29897d.d());
        if (this.f29898e != null) {
            sb2.append(" collectionGroup=");
            sb2.append(this.f29898e);
        }
        if (!this.f29896c.isEmpty()) {
            sb2.append(" where ");
            for (int i10 = 0; i10 < this.f29896c.size(); i10++) {
                if (i10 > 0) {
                    sb2.append(" and ");
                }
                sb2.append(this.f29896c.get(i10));
            }
        }
        if (!this.f29895b.isEmpty()) {
            sb2.append(" order by ");
            for (int i11 = 0; i11 < this.f29895b.size(); i11++) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.f29895b.get(i11));
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
