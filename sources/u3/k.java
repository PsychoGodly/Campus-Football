package u3;

import android.net.Uri;
import android.text.TextUtils;
import i4.s;
import j4.g0;
import j4.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k4.n0;
import k4.v;
import n2.r1;
import n2.u3;
import o2.u1;
import p3.e0;
import p3.i;
import p3.q0;
import p3.r0;
import p3.u;
import p3.x0;
import p3.z0;
import r2.m;
import r2.w;
import r2.y;
import u3.p;
import v3.h;
import v3.l;
import v6.e;

/* compiled from: HlsMediaPeriod */
public final class k implements u, l.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f22902a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l f22903b;

    /* renamed from: c  reason: collision with root package name */
    private final g f22904c;

    /* renamed from: d  reason: collision with root package name */
    private final p0 f22905d;

    /* renamed from: f  reason: collision with root package name */
    private final y f22906f;

    /* renamed from: g  reason: collision with root package name */
    private final w.a f22907g;

    /* renamed from: h  reason: collision with root package name */
    private final g0 f22908h;

    /* renamed from: i  reason: collision with root package name */
    private final e0.a f22909i;

    /* renamed from: j  reason: collision with root package name */
    private final j4.b f22910j;

    /* renamed from: k  reason: collision with root package name */
    private final IdentityHashMap<q0, Integer> f22911k;

    /* renamed from: l  reason: collision with root package name */
    private final s f22912l;

    /* renamed from: m  reason: collision with root package name */
    private final i f22913m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f22914n;

    /* renamed from: o  reason: collision with root package name */
    private final int f22915o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f22916p;

    /* renamed from: q  reason: collision with root package name */
    private final u1 f22917q;

    /* renamed from: r  reason: collision with root package name */
    private final p.b f22918r = new b();
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public u.a f22919s;

    /* renamed from: t  reason: collision with root package name */
    private int f22920t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public z0 f22921u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public p[] f22922v;

    /* renamed from: w  reason: collision with root package name */
    private p[] f22923w;

    /* renamed from: x  reason: collision with root package name */
    private int[][] f22924x;

    /* renamed from: y  reason: collision with root package name */
    private int f22925y;

    /* renamed from: z  reason: collision with root package name */
    private r0 f22926z;

    /* compiled from: HlsMediaPeriod */
    private class b implements p.b {
        private b() {
        }

        /* renamed from: a */
        public void j(p pVar) {
            k.this.f22919s.j(k.this);
        }

        public void i(Uri uri) {
            k.this.f22903b.m(uri);
        }

        public void onPrepared() {
            if (k.i(k.this) <= 0) {
                int i10 = 0;
                for (p s10 : k.this.f22922v) {
                    i10 += s10.s().f21696a;
                }
                x0[] x0VarArr = new x0[i10];
                int i11 = 0;
                for (p pVar : k.this.f22922v) {
                    int i12 = pVar.s().f21696a;
                    int i13 = 0;
                    while (i13 < i12) {
                        x0VarArr[i11] = pVar.s().b(i13);
                        i13++;
                        i11++;
                    }
                }
                z0 unused = k.this.f22921u = new z0(x0VarArr);
                k.this.f22919s.e(k.this);
            }
        }
    }

    public k(h hVar, l lVar, g gVar, p0 p0Var, y yVar, w.a aVar, g0 g0Var, e0.a aVar2, j4.b bVar, i iVar, boolean z10, int i10, boolean z11, u1 u1Var) {
        this.f22902a = hVar;
        this.f22903b = lVar;
        this.f22904c = gVar;
        this.f22905d = p0Var;
        this.f22906f = yVar;
        this.f22907g = aVar;
        this.f22908h = g0Var;
        this.f22909i = aVar2;
        this.f22910j = bVar;
        this.f22913m = iVar;
        this.f22914n = z10;
        this.f22915o = i10;
        this.f22916p = z11;
        this.f22917q = u1Var;
        this.f22926z = iVar.a(new r0[0]);
        this.f22911k = new IdentityHashMap<>();
        this.f22912l = new s();
        this.f22922v = new p[0];
        this.f22923w = new p[0];
        this.f22924x = new int[0][];
    }

    static /* synthetic */ int i(k kVar) {
        int i10 = kVar.f22920t - 1;
        kVar.f22920t = i10;
        return i10;
    }

    private void q(long j10, List<h.a> list, List<p> list2, List<int[]> list3, Map<String, m> map) {
        List<h.a> list4 = list;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list4.get(i10).f23270d;
            if (!hashSet.add(str)) {
                List<p> list5 = list2;
                List<int[]> list6 = list3;
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (n0.c(str, list4.get(i11).f23270d)) {
                        h.a aVar = list4.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f23267a);
                        arrayList2.add(aVar.f23268b);
                        z10 &= n0.K(aVar.f23268b.f20651j, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                p w10 = w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) n0.k(new Uri[0])), (r1[]) arrayList2.toArray(new r1[0]), (r1) null, Collections.emptyList(), map, j10);
                list3.add(e.l(arrayList3));
                list2.add(w10);
                if (this.f22914n && z10) {
                    w10.c0(new x0[]{new x0(str2, (r1[]) arrayList2.toArray(new r1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u(v3.h r21, long r22, java.util.List<u3.p> r24, java.util.List<int[]> r25, java.util.Map<java.lang.String, r2.m> r26) {
        /*
            r20 = this;
            r0 = r21
            java.util.List<v3.h$b> r1 = r0.f23258e
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000e:
            java.util.List<v3.h$b> r7 = r0.f23258e
            int r7 = r7.size()
            r8 = 2
            r9 = 1
            if (r4 >= r7) goto L_0x0047
            java.util.List<v3.h$b> r7 = r0.f23258e
            java.lang.Object r7 = r7.get(r4)
            v3.h$b r7 = (v3.h.b) r7
            n2.r1 r7 = r7.f23272b
            int r10 = r7.f20660s
            if (r10 > 0) goto L_0x0040
            java.lang.String r10 = r7.f20651j
            java.lang.String r10 = k4.n0.L(r10, r8)
            if (r10 == 0) goto L_0x002f
            goto L_0x0040
        L_0x002f:
            java.lang.String r7 = r7.f20651j
            java.lang.String r7 = k4.n0.L(r7, r9)
            if (r7 == 0) goto L_0x003c
            r2[r4] = r9
            int r6 = r6 + 1
            goto L_0x0044
        L_0x003c:
            r7 = -1
            r2[r4] = r7
            goto L_0x0044
        L_0x0040:
            r2[r4] = r8
            int r5 = r5 + 1
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0047:
            if (r5 <= 0) goto L_0x004c
            r1 = r5
            r4 = 1
            goto L_0x0053
        L_0x004c:
            if (r6 >= r1) goto L_0x0052
            int r1 = r1 - r6
            r4 = 0
            r5 = 1
            goto L_0x0054
        L_0x0052:
            r4 = 0
        L_0x0053:
            r5 = 0
        L_0x0054:
            android.net.Uri[] r13 = new android.net.Uri[r1]
            n2.r1[] r6 = new n2.r1[r1]
            int[] r7 = new int[r1]
            r10 = 0
            r11 = 0
        L_0x005c:
            java.util.List<v3.h$b> r12 = r0.f23258e
            int r12 = r12.size()
            if (r10 >= r12) goto L_0x0088
            if (r4 == 0) goto L_0x006a
            r12 = r2[r10]
            if (r12 != r8) goto L_0x0085
        L_0x006a:
            if (r5 == 0) goto L_0x0070
            r12 = r2[r10]
            if (r12 == r9) goto L_0x0085
        L_0x0070:
            java.util.List<v3.h$b> r12 = r0.f23258e
            java.lang.Object r12 = r12.get(r10)
            v3.h$b r12 = (v3.h.b) r12
            android.net.Uri r14 = r12.f23271a
            r13[r11] = r14
            n2.r1 r12 = r12.f23272b
            r6[r11] = r12
            int r12 = r11 + 1
            r7[r11] = r10
            r11 = r12
        L_0x0085:
            int r10 = r10 + 1
            goto L_0x005c
        L_0x0088:
            r2 = r6[r3]
            java.lang.String r2 = r2.f20651j
            int r5 = k4.n0.K(r2, r8)
            int r2 = k4.n0.K(r2, r9)
            if (r2 == r9) goto L_0x00a0
            if (r2 != 0) goto L_0x00a8
            java.util.List<v3.h$a> r8 = r0.f23260g
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00a8
        L_0x00a0:
            if (r5 > r9) goto L_0x00a8
            int r8 = r2 + r5
            if (r8 <= 0) goto L_0x00a8
            r8 = 1
            goto L_0x00a9
        L_0x00a8:
            r8 = 0
        L_0x00a9:
            if (r4 != 0) goto L_0x00af
            if (r2 <= 0) goto L_0x00af
            r12 = 1
            goto L_0x00b0
        L_0x00af:
            r12 = 0
        L_0x00b0:
            java.lang.String r4 = "main"
            n2.r1 r15 = r0.f23263j
            java.util.List<n2.r1> r14 = r0.f23264k
            r10 = r20
            r11 = r4
            r16 = r14
            r14 = r6
            r17 = r26
            r18 = r22
            u3.p r10 = r10.w(r11, r12, r13, r14, r15, r16, r17, r18)
            r11 = r24
            r11.add(r10)
            r11 = r25
            r11.add(r7)
            r7 = r20
            boolean r11 = r7.f22914n
            if (r11 == 0) goto L_0x01bb
            if (r8 == 0) goto L_0x01bb
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r5 <= 0) goto L_0x015c
            n2.r1[] r5 = new n2.r1[r1]
            r11 = 0
        L_0x00e0:
            if (r11 >= r1) goto L_0x00ed
            r12 = r6[r11]
            n2.r1 r12 = z(r12)
            r5[r11] = r12
            int r11 = r11 + 1
            goto L_0x00e0
        L_0x00ed:
            p3.x0 r1 = new p3.x0
            r1.<init>(r4, r5)
            r8.add(r1)
            if (r2 <= 0) goto L_0x0128
            n2.r1 r1 = r0.f23263j
            if (r1 != 0) goto L_0x0103
            java.util.List<v3.h$a> r1 = r0.f23260g
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0128
        L_0x0103:
            p3.x0 r1 = new p3.x0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r5 = ":audio"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            n2.r1[] r5 = new n2.r1[r9]
            r6 = r6[r3]
            n2.r1 r11 = r0.f23263j
            n2.r1 r6 = x(r6, r11, r3)
            r5[r3] = r6
            r1.<init>(r2, r5)
            r8.add(r1)
        L_0x0128:
            java.util.List<n2.r1> r0 = r0.f23264k
            if (r0 == 0) goto L_0x0176
            r1 = 0
        L_0x012d:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0176
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r5 = ":cc:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            p3.x0 r5 = new p3.x0
            n2.r1[] r6 = new n2.r1[r9]
            java.lang.Object r11 = r0.get(r1)
            n2.r1 r11 = (n2.r1) r11
            r6[r3] = r11
            r5.<init>(r2, r6)
            r8.add(r5)
            int r1 = r1 + 1
            goto L_0x012d
        L_0x015c:
            n2.r1[] r2 = new n2.r1[r1]
            r5 = 0
        L_0x015f:
            if (r5 >= r1) goto L_0x016e
            r11 = r6[r5]
            n2.r1 r12 = r0.f23263j
            n2.r1 r11 = x(r11, r12, r9)
            r2[r5] = r11
            int r5 = r5 + 1
            goto L_0x015f
        L_0x016e:
            p3.x0 r0 = new p3.x0
            r0.<init>(r4, r2)
            r8.add(r0)
        L_0x0176:
            p3.x0 r0 = new p3.x0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = ":id3"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            n2.r1[] r2 = new n2.r1[r9]
            n2.r1$b r4 = new n2.r1$b
            r4.<init>()
            java.lang.String r5 = "ID3"
            n2.r1$b r4 = r4.U(r5)
            java.lang.String r5 = "application/id3"
            n2.r1$b r4 = r4.g0(r5)
            n2.r1 r4 = r4.G()
            r2[r3] = r4
            r0.<init>(r1, r2)
            r8.add(r0)
            p3.x0[] r1 = new p3.x0[r3]
            java.lang.Object[] r1 = r8.toArray(r1)
            p3.x0[] r1 = (p3.x0[]) r1
            int[] r2 = new int[r9]
            int r0 = r8.indexOf(r0)
            r2[r3] = r0
            r10.c0(r1, r3, r2)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.k.u(v3.h, long, java.util.List, java.util.List, java.util.Map):void");
    }

    private void v(long j10) {
        Map<String, m> map;
        h hVar = (h) k4.a.e(this.f22903b.h());
        if (this.f22916p) {
            map = y(hVar.f23266m);
        } else {
            map = Collections.emptyMap();
        }
        Map<String, m> map2 = map;
        boolean z10 = !hVar.f23258e.isEmpty();
        List<h.a> list = hVar.f23260g;
        List<h.a> list2 = hVar.f23261h;
        this.f22920t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            u(hVar, j10, arrayList, arrayList2, map2);
        }
        q(j10, list, arrayList, arrayList2, map2);
        this.f22925y = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            h.a aVar = list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f23270d;
            int i11 = i10;
            p w10 = w(str, 3, new Uri[]{aVar.f23267a}, new r1[]{aVar.f23268b}, (r1) null, Collections.emptyList(), map2, j10);
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new int[]{i11});
            arrayList.add(w10);
            w10.c0(new x0[]{new x0(str, aVar.f23268b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.f22922v = (p[]) arrayList.toArray(new p[0]);
        this.f22924x = (int[][]) arrayList2.toArray(new int[0][]);
        this.f22920t = this.f22922v.length;
        for (int i12 = 0; i12 < this.f22925y; i12++) {
            this.f22922v[i12].l0(true);
        }
        for (p A : this.f22922v) {
            A.A();
        }
        this.f22923w = this.f22922v;
    }

    private p w(String str, int i10, Uri[] uriArr, r1[] r1VarArr, r1 r1Var, List<r1> list, Map<String, m> map, long j10) {
        f fVar = new f(this.f22902a, this.f22903b, uriArr, r1VarArr, this.f22904c, this.f22905d, this.f22912l, list, this.f22917q);
        return new p(str, i10, this.f22918r, fVar, map, this.f22910j, j10, r1Var, this.f22906f, this.f22907g, this.f22908h, this.f22909i, this.f22915o);
    }

    private static r1 x(r1 r1Var, r1 r1Var2, boolean z10) {
        String str;
        int i10;
        String str2;
        int i11;
        int i12;
        f3.a aVar;
        String str3;
        int i13 = -1;
        if (r1Var2 != null) {
            str3 = r1Var2.f20651j;
            aVar = r1Var2.f20652k;
            int i14 = r1Var2.f20667z;
            i11 = r1Var2.f20646d;
            int i15 = r1Var2.f20647f;
            String str4 = r1Var2.f20645c;
            str = r1Var2.f20644b;
            String str5 = str4;
            i10 = i14;
            i12 = i15;
            str2 = str5;
        } else {
            String L = n0.L(r1Var.f20651j, 1);
            f3.a aVar2 = r1Var.f20652k;
            if (z10) {
                int i16 = r1Var.f20667z;
                int i17 = r1Var.f20646d;
                int i18 = r1Var.f20647f;
                str2 = r1Var.f20645c;
                int i19 = i16;
                str3 = L;
                str = r1Var.f20644b;
                i10 = i19;
                int i20 = i18;
                i11 = i17;
                aVar = aVar2;
                i12 = i20;
            } else {
                str2 = null;
                aVar = aVar2;
                i12 = 0;
                i11 = 0;
                i10 = -1;
                str3 = L;
                str = null;
            }
        }
        String g10 = v.g(str3);
        int i21 = z10 ? r1Var.f20648g : -1;
        if (z10) {
            i13 = r1Var.f20649h;
        }
        return new r1.b().U(r1Var.f20643a).W(str).M(r1Var.f20653l).g0(g10).K(str3).Z(aVar).I(i21).b0(i13).J(i10).i0(i11).e0(i12).X(str2).G();
    }

    private static Map<String, m> y(List<m> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            m mVar = list.get(i10);
            String str = mVar.f22079c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                m mVar2 = (m) arrayList.get(i11);
                if (TextUtils.equals(mVar2.f22079c, str)) {
                    mVar = mVar.g(mVar2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, mVar);
        }
        return hashMap;
    }

    private static r1 z(r1 r1Var) {
        String L = n0.L(r1Var.f20651j, 2);
        return new r1.b().U(r1Var.f20643a).W(r1Var.f20644b).M(r1Var.f20653l).g0(v.g(L)).K(L).Z(r1Var.f20652k).I(r1Var.f20648g).b0(r1Var.f20649h).n0(r1Var.f20659r).S(r1Var.f20660s).R(r1Var.f20661t).i0(r1Var.f20646d).e0(r1Var.f20647f).G();
    }

    public void A() {
        this.f22903b.e(this);
        for (p e02 : this.f22922v) {
            e02.e0();
        }
        this.f22919s = null;
    }

    public void a() {
        for (p a02 : this.f22922v) {
            a02.a0();
        }
        this.f22919s.j(this);
    }

    public long b() {
        return this.f22926z.b();
    }

    public boolean c(long j10) {
        if (this.f22921u != null) {
            return this.f22926z.c(j10);
        }
        for (p A : this.f22922v) {
            A.A();
        }
        return false;
    }

    public long d(long j10, u3 u3Var) {
        for (p pVar : this.f22923w) {
            if (pVar.Q()) {
                return pVar.d(j10, u3Var);
            }
        }
        return j10;
    }

    public boolean e(Uri uri, g0.c cVar, boolean z10) {
        boolean z11 = true;
        for (p Z : this.f22922v) {
            z11 &= Z.Z(uri, cVar, z10);
        }
        this.f22919s.j(this);
        return z11;
    }

    public long f() {
        return this.f22926z.f();
    }

    public void g(long j10) {
        this.f22926z.g(j10);
    }

    public void h(u.a aVar, long j10) {
        this.f22919s = aVar;
        this.f22903b.c(this);
        v(j10);
    }

    public boolean isLoading() {
        return this.f22926z.isLoading();
    }

    public void m() throws IOException {
        for (p m10 : this.f22922v) {
            m10.m();
        }
    }

    public long n(long j10) {
        p[] pVarArr = this.f22923w;
        if (pVarArr.length > 0) {
            boolean h02 = pVarArr[0].h0(j10, false);
            int i10 = 1;
            while (true) {
                p[] pVarArr2 = this.f22923w;
                if (i10 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i10].h0(j10, h02);
                i10++;
            }
            if (h02) {
                this.f22912l.b();
            }
        }
        return j10;
    }

    public long p(s[] sVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j10) {
        boolean z10;
        s[] sVarArr2 = sVarArr;
        q0[] q0VarArr2 = q0VarArr;
        int[] iArr = new int[sVarArr2.length];
        int[] iArr2 = new int[sVarArr2.length];
        for (int i10 = 0; i10 < sVarArr2.length; i10++) {
            iArr[i10] = q0VarArr2[i10] == null ? -1 : this.f22911k.get(q0VarArr2[i10]).intValue();
            iArr2[i10] = -1;
            if (sVarArr2[i10] != null) {
                x0 a10 = sVarArr2[i10].a();
                int i11 = 0;
                while (true) {
                    p[] pVarArr = this.f22922v;
                    if (i11 >= pVarArr.length) {
                        break;
                    } else if (pVarArr[i11].s().c(a10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.f22911k.clear();
        int length = sVarArr2.length;
        q0[] q0VarArr3 = new q0[length];
        q0[] q0VarArr4 = new q0[sVarArr2.length];
        s[] sVarArr3 = new s[sVarArr2.length];
        p[] pVarArr2 = new p[this.f22922v.length];
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        while (i13 < this.f22922v.length) {
            for (int i14 = 0; i14 < sVarArr2.length; i14++) {
                s sVar = null;
                q0VarArr4[i14] = iArr[i14] == i13 ? q0VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    sVar = sVarArr2[i14];
                }
                sVarArr3[i14] = sVar;
            }
            p pVar = this.f22922v[i13];
            p pVar2 = pVar;
            int i15 = length;
            int i16 = i13;
            int i17 = i12;
            s[] sVarArr4 = sVarArr3;
            p[] pVarArr3 = pVarArr2;
            boolean i02 = pVar.i0(sVarArr3, zArr, q0VarArr4, zArr2, j10, z11);
            int i18 = 0;
            boolean z12 = false;
            while (true) {
                z10 = true;
                if (i18 >= sVarArr2.length) {
                    break;
                }
                q0 q0Var = q0VarArr4[i18];
                if (iArr2[i18] == i16) {
                    k4.a.e(q0Var);
                    q0VarArr3[i18] = q0Var;
                    this.f22911k.put(q0Var, Integer.valueOf(i16));
                    z12 = true;
                } else if (iArr[i18] == i16) {
                    if (q0Var != null) {
                        z10 = false;
                    }
                    k4.a.f(z10);
                }
                i18++;
            }
            if (z12) {
                pVarArr3[i17] = pVar2;
                i12 = i17 + 1;
                if (i17 == 0) {
                    pVar2.l0(true);
                    if (!i02) {
                        p[] pVarArr4 = this.f22923w;
                        if (pVarArr4.length != 0 && pVar2 == pVarArr4[0]) {
                        }
                    }
                    this.f22912l.b();
                    z11 = true;
                } else {
                    if (i16 >= this.f22925y) {
                        z10 = false;
                    }
                    pVar2.l0(z10);
                }
            } else {
                i12 = i17;
            }
            i13 = i16 + 1;
            pVarArr2 = pVarArr3;
            length = i15;
            sVarArr3 = sVarArr4;
            q0VarArr2 = q0VarArr;
        }
        System.arraycopy(q0VarArr3, 0, q0VarArr2, 0, length);
        p[] pVarArr5 = (p[]) n0.H0(pVarArr2, i12);
        this.f22923w = pVarArr5;
        this.f22926z = this.f22913m.a(pVarArr5);
        return j10;
    }

    public long r() {
        return -9223372036854775807L;
    }

    public z0 s() {
        return (z0) k4.a.e(this.f22921u);
    }

    public void t(long j10, boolean z10) {
        for (p t10 : this.f22923w) {
            t10.t(j10, z10);
        }
    }
}
