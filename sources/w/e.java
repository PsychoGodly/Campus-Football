package w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.e;
import v.f;
import v.g;
import v.i;
import w.b;

/* compiled from: DependencyGraph */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private f f23423a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f23424b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23425c = true;

    /* renamed from: d  reason: collision with root package name */
    private f f23426d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<p> f23427e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<m> f23428f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private b.C0242b f23429g = null;

    /* renamed from: h  reason: collision with root package name */
    private b.a f23430h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList<m> f23431i = new ArrayList<>();

    public e(f fVar) {
        this.f23423a = fVar;
        this.f23426d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f23435d;
        if (pVar.f23487c == null) {
            f fVar3 = this.f23423a;
            if (pVar != fVar3.f23077e && pVar != fVar3.f23079f) {
                if (mVar == null) {
                    mVar = new m(pVar, i11);
                    arrayList.add(mVar);
                }
                pVar.f23487c = mVar;
                mVar.a(pVar);
                for (d next : pVar.f23492h.f23442k) {
                    if (next instanceof f) {
                        a((f) next, i10, 0, fVar2, arrayList, mVar);
                    }
                }
                for (d next2 : pVar.f23493i.f23442k) {
                    if (next2 instanceof f) {
                        a((f) next2, i10, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    for (d next3 : ((n) pVar).f23467k.f23442k) {
                        if (next3 instanceof f) {
                            a((f) next3, i10, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (f next4 : pVar.f23492h.f23443l) {
                    if (next4 == fVar2) {
                        mVar.f23461b = true;
                    }
                    a(next4, i10, 0, fVar2, arrayList, mVar);
                }
                for (f next5 : pVar.f23493i.f23443l) {
                    if (next5 == fVar2) {
                        mVar.f23461b = true;
                    }
                    a(next5, i10, 1, fVar2, arrayList, mVar);
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    for (f a10 : ((n) pVar).f23467k.f23443l) {
                        a(a10, i10, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0288, code lost:
        r4 = r0.Z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(v.f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<v.e> r1 = r0.L0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0342
            java.lang.Object r2 = r1.next()
            v.e r2 = (v.e) r2
            v.e$b[] r4 = r2.Z
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.T()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f23069a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.B
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0036
            v.e$b r6 = v.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f23113w = r7
        L_0x0036:
            float r6 = r2.E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            v.e$b r6 = v.e.b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f23115x = r7
        L_0x0042:
            float r6 = r2.t()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0078
            v.e$b r6 = v.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            v.e$b r8 = v.e.b.WRAP_CONTENT
            if (r4 == r8) goto L_0x0058
            v.e$b r8 = v.e.b.FIXED
            if (r4 != r8) goto L_0x005b
        L_0x0058:
            r2.f23113w = r9
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            v.e$b r8 = v.e.b.WRAP_CONTENT
            if (r5 == r8) goto L_0x0065
            v.e$b r8 = v.e.b.FIXED
            if (r5 != r8) goto L_0x0068
        L_0x0065:
            r2.f23115x = r9
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f23113w
            if (r6 != 0) goto L_0x0072
            r2.f23113w = r9
        L_0x0072:
            int r6 = r2.f23115x
            if (r6 != 0) goto L_0x0078
            r2.f23115x = r9
        L_0x0078:
            v.e$b r6 = v.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r8 = r2.f23113w
            if (r8 != r10) goto L_0x008e
            v.d r8 = r2.O
            v.d r8 = r8.f23054f
            if (r8 == 0) goto L_0x008c
            v.d r8 = r2.Q
            v.d r8 = r8.f23054f
            if (r8 != 0) goto L_0x008e
        L_0x008c:
            v.e$b r5 = v.e.b.WRAP_CONTENT
        L_0x008e:
            r8 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f23115x
            if (r5 != r10) goto L_0x00a3
            v.d r5 = r2.P
            v.d r5 = r5.f23054f
            if (r5 == 0) goto L_0x00a1
            v.d r5 = r2.R
            v.d r5 = r5.f23054f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            v.e$b r4 = v.e.b.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            w.l r4 = r2.f23077e
            r4.f23488d = r8
            int r5 = r2.f23113w
            r4.f23485a = r5
            w.n r4 = r2.f23079f
            r4.f23488d = r12
            int r13 = r2.f23115x
            r4.f23485a = r13
            v.e$b r4 = v.e.b.MATCH_PARENT
            if (r8 == r4) goto L_0x00c0
            v.e$b r14 = v.e.b.FIXED
            if (r8 == r14) goto L_0x00c0
            v.e$b r14 = v.e.b.WRAP_CONTENT
            if (r8 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02ec
            v.e$b r14 = v.e.b.FIXED
            if (r12 == r14) goto L_0x02ec
            v.e$b r14 = v.e.b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02ec
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r6) goto L_0x019e
            v.e$b r15 = v.e.b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            v.e$b r11 = v.e.b.FIXED
            if (r12 != r11) goto L_0x019e
        L_0x00d8:
            if (r5 != r9) goto L_0x0114
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.l(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.v()
            float r3 = (float) r9
            float r4 = r2.f23076d0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            v.e$b r8 = v.e.b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.d(r4)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r4 = r2.v()
            r3.d(r4)
            r2.f23069a = r10
            goto L_0x0008
        L_0x0114:
            if (r5 != r10) goto L_0x012c
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r2 = r2.U()
            r3.f23453m = r2
            goto L_0x0008
        L_0x012c:
            if (r5 != r7) goto L_0x016c
            v.e$b[] r11 = r0.Z
            r15 = r11[r3]
            v.e$b r7 = v.e.b.FIXED
            if (r15 == r7) goto L_0x013a
            r11 = r11[r3]
            if (r11 != r4) goto L_0x019e
        L_0x013a:
            float r3 = r2.B
            int r4 = r17.U()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            int r9 = r2.v()
            r4 = r16
            r5 = r2
            r6 = r7
            r7 = r3
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.d(r4)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r4 = r2.v()
            r3.d(r4)
            r2.f23069a = r10
            goto L_0x0008
        L_0x016c:
            v.d[] r7 = r2.W
            r11 = r7[r3]
            v.d r11 = r11.f23054f
            if (r11 == 0) goto L_0x017a
            r7 = r7[r10]
            v.d r7 = r7.f23054f
            if (r7 != 0) goto L_0x019e
        L_0x017a:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.d(r4)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r4 = r2.v()
            r3.d(r4)
            r2.f23069a = r10
            goto L_0x0008
        L_0x019e:
            if (r12 != r6) goto L_0x027a
            v.e$b r11 = v.e.b.WRAP_CONTENT
            if (r8 == r11) goto L_0x01a8
            v.e$b r7 = v.e.b.FIXED
            if (r8 != r7) goto L_0x027a
        L_0x01a8:
            if (r13 != r9) goto L_0x01ef
            if (r8 != r11) goto L_0x01b6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
        L_0x01b6:
            int r7 = r2.U()
            float r3 = r2.f23076d0
            int r4 = r2.u()
            r5 = -1
            if (r4 != r5) goto L_0x01c7
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c7:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            v.e$b r8 = v.e.b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.d(r4)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r4 = r2.v()
            r3.d(r4)
            r2.f23069a = r10
            goto L_0x0008
        L_0x01ef:
            if (r13 != r10) goto L_0x0207
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r2 = r2.v()
            r3.f23453m = r2
            goto L_0x0008
        L_0x0207:
            r7 = 2
            if (r13 != r7) goto L_0x0247
            v.e$b[] r7 = r0.Z
            r9 = r7[r10]
            v.e$b r11 = v.e.b.FIXED
            if (r9 == r11) goto L_0x0216
            r7 = r7[r10]
            if (r7 != r4) goto L_0x027a
        L_0x0216:
            float r3 = r2.E
            int r7 = r2.U()
            int r4 = r17.v()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r9 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.d(r4)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r4 = r2.v()
            r3.d(r4)
            r2.f23069a = r10
            goto L_0x0008
        L_0x0247:
            v.d[] r4 = r2.W
            r7 = 2
            r15 = r4[r7]
            v.d r7 = r15.f23054f
            if (r7 == 0) goto L_0x0256
            r4 = r4[r9]
            v.d r4 = r4.f23054f
            if (r4 != 0) goto L_0x027a
        L_0x0256:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.d(r4)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r4 = r2.v()
            r3.d(r4)
            r2.f23069a = r10
            goto L_0x0008
        L_0x027a:
            if (r8 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02cb
            if (r13 != r10) goto L_0x0283
            goto L_0x02cb
        L_0x0283:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            v.e$b[] r4 = r0.Z
            r3 = r4[r3]
            v.e$b r8 = v.e.b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.B
            float r4 = r2.E
            int r5 = r17.U()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.v()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.d(r4)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r4 = r2.v()
            r3.d(r4)
            r2.f23069a = r10
            goto L_0x0008
        L_0x02cb:
            v.e$b r8 = v.e.b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.f23453m = r4
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r2 = r2.v()
            r3.f23453m = r2
            goto L_0x0008
        L_0x02ec:
            int r3 = r2.U()
            if (r8 != r4) goto L_0x0305
            int r3 = r17.U()
            v.d r5 = r2.O
            int r5 = r5.f23055g
            int r3 = r3 - r5
            v.d r5 = r2.Q
            int r5 = r5.f23055g
            int r3 = r3 - r5
            v.e$b r5 = v.e.b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x0307
        L_0x0305:
            r7 = r3
            r6 = r8
        L_0x0307:
            int r3 = r2.v()
            if (r12 != r4) goto L_0x0320
            int r3 = r17.v()
            v.d r4 = r2.P
            int r4 = r4.f23055g
            int r3 = r3 - r4
            v.d r4 = r2.R
            int r4 = r4.f23055g
            int r3 = r3 - r4
            v.e$b r4 = v.e.b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0322
        L_0x0320:
            r9 = r3
            r8 = r12
        L_0x0322:
            r4 = r16
            r5 = r2
            r4.l(r5, r6, r7, r8, r9)
            w.l r3 = r2.f23077e
            w.g r3 = r3.f23489e
            int r4 = r2.U()
            r3.d(r4)
            w.n r3 = r2.f23079f
            w.g r3 = r3.f23489e
            int r4 = r2.v()
            r3.d(r4)
            r2.f23069a = r10
            goto L_0x0008
        L_0x0342:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.b(v.f):boolean");
    }

    private int e(f fVar, int i10) {
        int size = this.f23431i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f23431i.get(i11).b(fVar, i10));
        }
        return (int) j10;
    }

    private void i(p pVar, int i10, ArrayList<m> arrayList) {
        for (d next : pVar.f23492h.f23442k) {
            if (next instanceof f) {
                a((f) next, i10, 0, pVar.f23493i, arrayList, (m) null);
            } else if (next instanceof p) {
                a(((p) next).f23492h, i10, 0, pVar.f23493i, arrayList, (m) null);
            }
        }
        for (d next2 : pVar.f23493i.f23442k) {
            if (next2 instanceof f) {
                a((f) next2, i10, 1, pVar.f23492h, arrayList, (m) null);
            } else if (next2 instanceof p) {
                a(((p) next2).f23493i, i10, 1, pVar.f23492h, arrayList, (m) null);
            }
        }
        if (i10 == 1) {
            for (d next3 : ((n) pVar).f23467k.f23442k) {
                if (next3 instanceof f) {
                    a((f) next3, i10, 2, (f) null, arrayList, (m) null);
                }
            }
        }
    }

    private void l(v.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        b.a aVar = this.f23430h;
        aVar.f23411a = bVar;
        aVar.f23412b = bVar2;
        aVar.f23413c = i10;
        aVar.f23414d = i11;
        this.f23429g.b(eVar, aVar);
        eVar.h1(this.f23430h.f23415e);
        eVar.I0(this.f23430h.f23416f);
        eVar.H0(this.f23430h.f23418h);
        eVar.x0(this.f23430h.f23417g);
    }

    public void c() {
        d(this.f23427e);
        this.f23431i.clear();
        m.f23459h = 0;
        i(this.f23423a.f23077e, 0, this.f23431i);
        i(this.f23423a.f23079f, 1, this.f23431i);
        this.f23424b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f23426d.f23077e.f();
        this.f23426d.f23079f.f();
        arrayList.add(this.f23426d.f23077e);
        arrayList.add(this.f23426d.f23079f);
        Iterator<v.e> it = this.f23426d.L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            v.e next = it.next();
            if (next instanceof g) {
                arrayList.add(new j(next));
            } else {
                if (next.g0()) {
                    if (next.f23073c == null) {
                        next.f23073c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f23073c);
                } else {
                    arrayList.add(next.f23077e);
                }
                if (next.i0()) {
                    if (next.f23075d == null) {
                        next.f23075d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f23075d);
                } else {
                    arrayList.add(next.f23079f);
                }
                if (next instanceof i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f23486b != this.f23426d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        if (this.f23424b || this.f23425c) {
            Iterator<v.e> it = this.f23423a.L0.iterator();
            while (it.hasNext()) {
                v.e next = it.next();
                next.l();
                next.f23069a = false;
                next.f23077e.r();
                next.f23079f.q();
            }
            this.f23423a.l();
            f fVar = this.f23423a;
            fVar.f23069a = false;
            fVar.f23077e.r();
            this.f23423a.f23079f.q();
            this.f23425c = false;
        }
        if (b(this.f23426d)) {
            return false;
        }
        this.f23423a.j1(0);
        this.f23423a.k1(0);
        e.b s10 = this.f23423a.s(0);
        e.b s11 = this.f23423a.s(1);
        if (this.f23424b) {
            c();
        }
        int V = this.f23423a.V();
        int W = this.f23423a.W();
        this.f23423a.f23077e.f23492h.d(V);
        this.f23423a.f23079f.f23492h.d(W);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s10 == bVar || s11 == bVar) {
            if (z13) {
                Iterator<p> it2 = this.f23427e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().m()) {
                            z13 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z13 && s10 == e.b.WRAP_CONTENT) {
                this.f23423a.M0(e.b.FIXED);
                f fVar2 = this.f23423a;
                fVar2.h1(e(fVar2, 0));
                f fVar3 = this.f23423a;
                fVar3.f23077e.f23489e.d(fVar3.U());
            }
            if (z13 && s11 == e.b.WRAP_CONTENT) {
                this.f23423a.d1(e.b.FIXED);
                f fVar4 = this.f23423a;
                fVar4.I0(e(fVar4, 1));
                f fVar5 = this.f23423a;
                fVar5.f23079f.f23489e.d(fVar5.v());
            }
        }
        f fVar6 = this.f23423a;
        e.b[] bVarArr = fVar6.Z;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int U = fVar6.U() + V;
            this.f23423a.f23077e.f23493i.d(U);
            this.f23423a.f23077e.f23489e.d(U - V);
            m();
            f fVar7 = this.f23423a;
            e.b[] bVarArr2 = fVar7.Z;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int v10 = fVar7.v() + W;
                this.f23423a.f23079f.f23493i.d(v10);
                this.f23423a.f23079f.f23489e.d(v10 - W);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<p> it3 = this.f23427e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f23486b != this.f23423a || next2.f23491g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f23427e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            p next3 = it4.next();
            if ((z11 || next3.f23486b != this.f23423a) && (!next3.f23492h.f23441j || ((!next3.f23493i.f23441j && !(next3 instanceof j)) || (!next3.f23489e.f23441j && !(next3 instanceof c) && !(next3 instanceof j))))) {
                z12 = false;
            }
        }
        z12 = false;
        this.f23423a.M0(s10);
        this.f23423a.d1(s11);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f23424b) {
            Iterator<v.e> it = this.f23423a.L0.iterator();
            while (it.hasNext()) {
                v.e next = it.next();
                next.l();
                next.f23069a = false;
                l lVar = next.f23077e;
                lVar.f23489e.f23441j = false;
                lVar.f23491g = false;
                lVar.r();
                n nVar = next.f23079f;
                nVar.f23489e.f23441j = false;
                nVar.f23491g = false;
                nVar.q();
            }
            this.f23423a.l();
            f fVar = this.f23423a;
            fVar.f23069a = false;
            l lVar2 = fVar.f23077e;
            lVar2.f23489e.f23441j = false;
            lVar2.f23491g = false;
            lVar2.r();
            n nVar2 = this.f23423a.f23079f;
            nVar2.f23489e.f23441j = false;
            nVar2.f23491g = false;
            nVar2.q();
            c();
        }
        if (b(this.f23426d)) {
            return false;
        }
        this.f23423a.j1(0);
        this.f23423a.k1(0);
        this.f23423a.f23077e.f23492h.d(0);
        this.f23423a.f23079f.f23492h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143 A[EDGE_INSN: B:77:0x0143->B:62:0x0143 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            v.f r1 = r9.f23423a
            r2 = 0
            v.e$b r1 = r1.s(r2)
            v.f r3 = r9.f23423a
            v.e$b r3 = r3.s(r0)
            v.f r4 = r9.f23423a
            int r4 = r4.V()
            v.f r5 = r9.f23423a
            int r5 = r5.W()
            if (r10 == 0) goto L_0x0089
            v.e$b r6 = v.e.b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<w.p> r6 = r9.f23427e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            w.p r7 = (w.p) r7
            int r8 = r7.f23490f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            v.e$b r10 = v.e.b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            v.f r10 = r9.f23423a
            v.e$b r6 = v.e.b.FIXED
            r10.M0(r6)
            v.f r10 = r9.f23423a
            int r6 = r9.e(r10, r2)
            r10.h1(r6)
            v.f r10 = r9.f23423a
            w.l r6 = r10.f23077e
            w.g r6 = r6.f23489e
            int r10 = r10.U()
            r6.d(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            v.e$b r10 = v.e.b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            v.f r10 = r9.f23423a
            v.e$b r6 = v.e.b.FIXED
            r10.d1(r6)
            v.f r10 = r9.f23423a
            int r6 = r9.e(r10, r0)
            r10.I0(r6)
            v.f r10 = r9.f23423a
            w.n r6 = r10.f23079f
            w.g r6 = r6.f23489e
            int r10 = r10.v()
            r6.d(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b4
            v.f r10 = r9.f23423a
            v.e$b[] r5 = r10.Z
            r6 = r5[r2]
            v.e$b r7 = v.e.b.FIXED
            if (r6 == r7) goto L_0x009b
            r5 = r5[r2]
            v.e$b r6 = v.e.b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c5
        L_0x009b:
            int r10 = r10.U()
            int r10 = r10 + r4
            v.f r5 = r9.f23423a
            w.l r5 = r5.f23077e
            w.f r5 = r5.f23493i
            r5.d(r10)
            v.f r5 = r9.f23423a
            w.l r5 = r5.f23077e
            w.g r5 = r5.f23489e
            int r10 = r10 - r4
            r5.d(r10)
            goto L_0x00df
        L_0x00b4:
            v.f r10 = r9.f23423a
            v.e$b[] r4 = r10.Z
            r6 = r4[r0]
            v.e$b r7 = v.e.b.FIXED
            if (r6 == r7) goto L_0x00c7
            r4 = r4[r0]
            v.e$b r6 = v.e.b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r10 = 0
            goto L_0x00e0
        L_0x00c7:
            int r10 = r10.v()
            int r10 = r10 + r5
            v.f r4 = r9.f23423a
            w.n r4 = r4.f23079f
            w.f r4 = r4.f23493i
            r4.d(r10)
            v.f r4 = r9.f23423a
            w.n r4 = r4.f23079f
            w.g r4 = r4.f23489e
            int r10 = r10 - r5
            r4.d(r10)
        L_0x00df:
            r10 = 1
        L_0x00e0:
            r9.m()
            java.util.ArrayList<w.p> r4 = r9.f23427e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r4.next()
            w.p r5 = (w.p) r5
            int r6 = r5.f23490f
            if (r6 == r11) goto L_0x00fa
            goto L_0x00e9
        L_0x00fa:
            v.e r6 = r5.f23486b
            v.f r7 = r9.f23423a
            if (r6 != r7) goto L_0x0105
            boolean r6 = r5.f23491g
            if (r6 != 0) goto L_0x0105
            goto L_0x00e9
        L_0x0105:
            r5.e()
            goto L_0x00e9
        L_0x0109:
            java.util.ArrayList<w.p> r4 = r9.f23427e
            java.util.Iterator r4 = r4.iterator()
        L_0x010f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0143
            java.lang.Object r5 = r4.next()
            w.p r5 = (w.p) r5
            int r6 = r5.f23490f
            if (r6 == r11) goto L_0x0120
            goto L_0x010f
        L_0x0120:
            if (r10 != 0) goto L_0x0129
            v.e r6 = r5.f23486b
            v.f r7 = r9.f23423a
            if (r6 != r7) goto L_0x0129
            goto L_0x010f
        L_0x0129:
            w.f r6 = r5.f23492h
            boolean r6 = r6.f23441j
            if (r6 != 0) goto L_0x0131
        L_0x012f:
            r0 = 0
            goto L_0x0143
        L_0x0131:
            w.f r6 = r5.f23493i
            boolean r6 = r6.f23441j
            if (r6 != 0) goto L_0x0138
            goto L_0x012f
        L_0x0138:
            boolean r6 = r5 instanceof w.c
            if (r6 != 0) goto L_0x010f
            w.g r5 = r5.f23489e
            boolean r5 = r5.f23441j
            if (r5 != 0) goto L_0x010f
            goto L_0x012f
        L_0x0143:
            v.f r10 = r9.f23423a
            r10.M0(r1)
            v.f r10 = r9.f23423a
            r10.d1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.e.h(boolean, int):boolean");
    }

    public void j() {
        this.f23424b = true;
    }

    public void k() {
        this.f23425c = true;
    }

    public void m() {
        g gVar;
        Iterator<v.e> it = this.f23423a.L0.iterator();
        while (it.hasNext()) {
            v.e next = it.next();
            if (!next.f23069a) {
                e.b[] bVarArr = next.Z;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i10 = next.f23113w;
                int i11 = next.f23115x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z11 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i10 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i11 == 1)) {
                    z10 = true;
                }
                g gVar2 = next.f23077e.f23489e;
                boolean z12 = gVar2.f23441j;
                g gVar3 = next.f23079f.f23489e;
                boolean z13 = gVar3.f23441j;
                if (z12 && z13) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f23438g, bVar4, gVar3.f23438g);
                    next.f23069a = true;
                } else if (z12 && z10) {
                    l(next, e.b.FIXED, gVar2.f23438g, bVar3, gVar3.f23438g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f23079f.f23489e.f23453m = next.v();
                    } else {
                        next.f23079f.f23489e.d(next.v());
                        next.f23069a = true;
                    }
                } else if (z13 && z11) {
                    l(next, bVar3, gVar2.f23438g, e.b.FIXED, gVar3.f23438g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f23077e.f23489e.f23453m = next.U();
                    } else {
                        next.f23077e.f23489e.d(next.U());
                        next.f23069a = true;
                    }
                }
                if (next.f23069a && (gVar = next.f23079f.f23468l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.C0242b bVar) {
        this.f23429g = bVar;
    }
}
