package w;

import java.util.ArrayList;
import v.d;
import v.e;
import v.g;

/* compiled from: Grouping */
public class i {
    public static o a(e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        int p12;
        if (i10 == 0) {
            i11 = eVar.I0;
        } else {
            i11 = eVar.J0;
        }
        int i12 = 0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f23472b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i13);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof v.i) && (p12 = ((v.i) eVar).p1(i10)) != -1) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i14);
                    if (oVar3.c() == p12) {
                        oVar = oVar3;
                        break;
                    }
                    i14++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                d o12 = gVar.o1();
                if (gVar.p1() == 0) {
                    i12 = 1;
                }
                o12.b(i12, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.I0 = oVar.c();
                eVar.O.b(i10, arrayList, oVar);
                eVar.Q.b(i10, arrayList, oVar);
            } else {
                eVar.J0 = oVar.c();
                eVar.P.b(i10, arrayList, oVar);
                eVar.S.b(i10, arrayList, oVar);
                eVar.R.b(i10, arrayList, oVar);
            }
            eVar.V.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f23472b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0390 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(v.f r16, w.b.C0242b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.o1()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 >= r2) goto L_0x002e
            java.lang.Object r5 = r1.get(r4)
            v.e r5 = (v.e) r5
            v.e$b r6 = r16.y()
            v.e$b r7 = r16.R()
            v.e$b r8 = r5.y()
            v.e$b r5 = r5.R()
            boolean r5 = d(r6, r7, r8, r5)
            if (r5 != 0) goto L_0x002b
            return r3
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x002e:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0035:
            if (r5 >= r2) goto L_0x0111
            java.lang.Object r13 = r1.get(r5)
            v.e r13 = (v.e) r13
            v.e$b r14 = r16.y()
            v.e$b r15 = r16.R()
            v.e$b r4 = r13.y()
            v.e$b r12 = r13.R()
            boolean r4 = d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x005d
            w.b$a r4 = r0.f23143p1
            int r12 = w.b.a.f23408k
            r14 = r17
            v.f.O1(r3, r13, r14, r4, r12)
            goto L_0x005f
        L_0x005d:
            r14 = r17
        L_0x005f:
            boolean r4 = r13 instanceof v.g
            if (r4 == 0) goto L_0x0088
            r12 = r13
            v.g r12 = (v.g) r12
            int r15 = r12.p1()
            if (r15 != 0) goto L_0x0076
            if (r8 != 0) goto L_0x0073
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0073:
            r8.add(r12)
        L_0x0076:
            int r15 = r12.p1()
            r3 = 1
            if (r15 != r3) goto L_0x0088
            if (r6 != 0) goto L_0x0085
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x0085:
            r6.add(r12)
        L_0x0088:
            boolean r3 = r13 instanceof v.i
            if (r3 == 0) goto L_0x00cc
            boolean r3 = r13 instanceof v.a
            if (r3 == 0) goto L_0x00b5
            r3 = r13
            v.a r3 = (v.a) r3
            int r12 = r3.u1()
            if (r12 != 0) goto L_0x00a3
            if (r7 != 0) goto L_0x00a0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a0:
            r7.add(r3)
        L_0x00a3:
            int r12 = r3.u1()
            r15 = 1
            if (r12 != r15) goto L_0x00cc
            if (r9 != 0) goto L_0x00b1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b1:
            r9.add(r3)
            goto L_0x00cc
        L_0x00b5:
            r3 = r13
            v.i r3 = (v.i) r3
            if (r7 != 0) goto L_0x00bf
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00bf:
            r7.add(r3)
            if (r9 != 0) goto L_0x00c9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00c9:
            r9.add(r3)
        L_0x00cc:
            v.d r3 = r13.O
            v.d r3 = r3.f23054f
            if (r3 != 0) goto L_0x00e9
            v.d r3 = r13.Q
            v.d r3 = r3.f23054f
            if (r3 != 0) goto L_0x00e9
            if (r4 != 0) goto L_0x00e9
            boolean r3 = r13 instanceof v.a
            if (r3 != 0) goto L_0x00e9
            if (r10 != 0) goto L_0x00e6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00e6:
            r10.add(r13)
        L_0x00e9:
            v.d r3 = r13.P
            v.d r3 = r3.f23054f
            if (r3 != 0) goto L_0x010c
            v.d r3 = r13.R
            v.d r3 = r3.f23054f
            if (r3 != 0) goto L_0x010c
            v.d r3 = r13.S
            v.d r3 = r3.f23054f
            if (r3 != 0) goto L_0x010c
            if (r4 != 0) goto L_0x010c
            boolean r3 = r13 instanceof v.a
            if (r3 != 0) goto L_0x010c
            if (r11 != 0) goto L_0x0109
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0109:
            r11.add(r13)
        L_0x010c:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0035
        L_0x0111:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x012e
            java.util.Iterator r4 = r6.iterator()
        L_0x011c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012e
            java.lang.Object r5 = r4.next()
            v.g r5 = (v.g) r5
            r6 = 0
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x011c
        L_0x012e:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x014f
            java.util.Iterator r4 = r7.iterator()
        L_0x0136:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x014f
            java.lang.Object r5 = r4.next()
            v.i r5 = (v.i) r5
            w.o r7 = a(r5, r6, r3, r12)
            r5.o1(r3, r6, r7)
            r7.b(r3)
            r6 = 0
            r12 = 0
            goto L_0x0136
        L_0x014f:
            v.d$b r4 = v.d.b.LEFT
            v.d r4 = r0.m(r4)
            java.util.HashSet r5 = r4.c()
            if (r5 == 0) goto L_0x0177
            java.util.HashSet r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0163:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0177
            java.lang.Object r5 = r4.next()
            v.d r5 = (v.d) r5
            v.e r5 = r5.f23052d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0163
        L_0x0177:
            v.d$b r4 = v.d.b.RIGHT
            v.d r4 = r0.m(r4)
            java.util.HashSet r5 = r4.c()
            if (r5 == 0) goto L_0x019f
            java.util.HashSet r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x018b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x019f
            java.lang.Object r5 = r4.next()
            v.d r5 = (v.d) r5
            v.e r5 = r5.f23052d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x018b
        L_0x019f:
            v.d$b r4 = v.d.b.CENTER
            v.d r4 = r0.m(r4)
            java.util.HashSet r5 = r4.c()
            if (r5 == 0) goto L_0x01c7
            java.util.HashSet r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c7
            java.lang.Object r5 = r4.next()
            v.d r5 = (v.d) r5
            v.e r5 = r5.f23052d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x01b3
        L_0x01c7:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01df
            java.util.Iterator r4 = r10.iterator()
        L_0x01cf:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01df
            java.lang.Object r5 = r4.next()
            v.e r5 = (v.e) r5
            a(r5, r6, r3, r7)
            goto L_0x01cf
        L_0x01df:
            if (r8 == 0) goto L_0x01f6
            java.util.Iterator r4 = r8.iterator()
        L_0x01e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f6
            java.lang.Object r5 = r4.next()
            v.g r5 = (v.g) r5
            r6 = 1
            a(r5, r6, r3, r7)
            goto L_0x01e5
        L_0x01f6:
            r6 = 1
            if (r9 == 0) goto L_0x0216
            java.util.Iterator r4 = r9.iterator()
        L_0x01fd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0216
            java.lang.Object r5 = r4.next()
            v.i r5 = (v.i) r5
            w.o r8 = a(r5, r6, r3, r7)
            r5.o1(r3, r6, r8)
            r8.b(r3)
            r6 = 1
            r7 = 0
            goto L_0x01fd
        L_0x0216:
            v.d$b r4 = v.d.b.TOP
            v.d r4 = r0.m(r4)
            java.util.HashSet r5 = r4.c()
            if (r5 == 0) goto L_0x023e
            java.util.HashSet r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x022a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x023e
            java.lang.Object r5 = r4.next()
            v.d r5 = (v.d) r5
            v.e r5 = r5.f23052d
            r6 = 1
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x022a
        L_0x023e:
            v.d$b r4 = v.d.b.BASELINE
            v.d r4 = r0.m(r4)
            java.util.HashSet r5 = r4.c()
            if (r5 == 0) goto L_0x0266
            java.util.HashSet r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0252:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0266
            java.lang.Object r5 = r4.next()
            v.d r5 = (v.d) r5
            v.e r5 = r5.f23052d
            r6 = 1
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0252
        L_0x0266:
            v.d$b r4 = v.d.b.BOTTOM
            v.d r4 = r0.m(r4)
            java.util.HashSet r5 = r4.c()
            if (r5 == 0) goto L_0x028e
            java.util.HashSet r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x027a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x028e
            java.lang.Object r5 = r4.next()
            v.d r5 = (v.d) r5
            v.e r5 = r5.f23052d
            r6 = 1
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x027a
        L_0x028e:
            v.d$b r4 = v.d.b.CENTER
            v.d r4 = r0.m(r4)
            java.util.HashSet r5 = r4.c()
            if (r5 == 0) goto L_0x02b6
            java.util.HashSet r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b6
            java.lang.Object r5 = r4.next()
            v.d r5 = (v.d) r5
            v.e r5 = r5.f23052d
            r6 = 1
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x02a2
        L_0x02b6:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02ce
            java.util.Iterator r4 = r11.iterator()
        L_0x02be:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02ce
            java.lang.Object r5 = r4.next()
            v.e r5 = (v.e) r5
            a(r5, r6, r3, r12)
            goto L_0x02be
        L_0x02ce:
            r4 = 0
        L_0x02cf:
            if (r4 >= r2) goto L_0x02fb
            java.lang.Object r5 = r1.get(r4)
            v.e r5 = (v.e) r5
            boolean r6 = r5.q0()
            if (r6 == 0) goto L_0x02f8
            int r6 = r5.I0
            w.o r6 = b(r3, r6)
            int r5 = r5.J0
            w.o r5 = b(r3, r5)
            if (r6 == 0) goto L_0x02f8
            if (r5 == 0) goto L_0x02f8
            r7 = 0
            r6.g(r7, r5)
            r7 = 2
            r5.i(r7)
            r3.remove(r6)
        L_0x02f8:
            int r4 = r4 + 1
            goto L_0x02cf
        L_0x02fb:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0304
            r1 = 0
            return r1
        L_0x0304:
            v.e$b r1 = r16.y()
            v.e$b r2 = v.e.b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0346
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x0312:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0337
            java.lang.Object r4 = r1.next()
            w.o r4 = (w.o) r4
            int r5 = r4.d()
            r7 = 1
            if (r5 != r7) goto L_0x0326
            goto L_0x0312
        L_0x0326:
            r5 = 0
            r4.h(r5)
            s.d r7 = r16.H1()
            int r7 = r4.f(r7, r5)
            if (r7 <= r6) goto L_0x0312
            r2 = r4
            r6 = r7
            goto L_0x0312
        L_0x0337:
            if (r2 == 0) goto L_0x0346
            v.e$b r1 = v.e.b.FIXED
            r0.M0(r1)
            r0.h1(r6)
            r1 = 1
            r2.h(r1)
            goto L_0x0347
        L_0x0346:
            r2 = r12
        L_0x0347:
            v.e$b r1 = r16.R()
            v.e$b r4 = v.e.b.WRAP_CONTENT
            if (r1 != r4) goto L_0x038b
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0355:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x037a
            java.lang.Object r4 = r1.next()
            w.o r4 = (w.o) r4
            int r5 = r4.d()
            if (r5 != 0) goto L_0x0368
            goto L_0x0355
        L_0x0368:
            r5 = 0
            r4.h(r5)
            s.d r7 = r16.H1()
            r8 = 1
            int r7 = r4.f(r7, r8)
            if (r7 <= r6) goto L_0x0355
            r3 = r4
            r6 = r7
            goto L_0x0355
        L_0x037a:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x038d
            v.e$b r1 = v.e.b.FIXED
            r0.d1(r1)
            r0.I0(r6)
            r3.h(r8)
            r4 = r3
            goto L_0x038e
        L_0x038b:
            r5 = 0
            r8 = 1
        L_0x038d:
            r4 = r12
        L_0x038e:
            if (r2 != 0) goto L_0x0395
            if (r4 == 0) goto L_0x0393
            goto L_0x0395
        L_0x0393:
            r3 = 0
            goto L_0x0396
        L_0x0395:
            r3 = 1
        L_0x0396:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i.c(v.f, w.b$b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = v.e.b.WRAP_CONTENT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(v.e.b r5, v.e.b r6, v.e.b r7, v.e.b r8) {
        /*
            v.e$b r0 = v.e.b.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            v.e$b r3 = v.e.b.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            v.e$b r4 = v.e.b.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            v.e$b r7 = v.e.b.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            v.e$b r0 = v.e.b.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = 0
            goto L_0x0024
        L_0x0023:
            r6 = 1
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i.d(v.e$b, v.e$b, v.e$b, v.e$b):boolean");
    }
}
