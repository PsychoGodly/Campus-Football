package pe;

import fe.p;
import xd.d;
import xd.e;
import xd.g;
import xd.h;

/* compiled from: Builders.kt */
final /* synthetic */ class j {
    public static final <T> T a(g gVar, p<? super p0, ? super d<? super T>, ? extends Object> pVar) throws InterruptedException {
        g gVar2;
        m1 m1Var;
        Thread currentThread = Thread.currentThread();
        e eVar = (e) gVar.get(e.E1);
        if (eVar == null) {
            m1Var = b3.f37276a.b();
            gVar2 = j0.d(v1.f37408a, gVar.plus(m1Var));
        } else {
            m1 m1Var2 = null;
            m1 m1Var3 = eVar instanceof m1 ? (m1) eVar : null;
            if (m1Var3 != null) {
                if (m1Var3.m1()) {
                    m1Var2 = m1Var3;
                }
                if (m1Var2 != null) {
                    m1Var = m1Var2;
                    gVar2 = j0.d(v1.f37408a, gVar);
                }
            }
            m1Var = b3.f37276a.a();
            gVar2 = j0.d(v1.f37408a, gVar);
        }
        g gVar3 = new g(gVar2, currentThread, m1Var);
        gVar3.T0(r0.DEFAULT, gVar3, pVar);
        return gVar3.U0();
    }

    public static /* synthetic */ Object b(g gVar, p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            gVar = h.f39347a;
        }
        return i.e(gVar, pVar);
    }
}
