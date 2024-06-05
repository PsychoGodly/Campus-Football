package v;

import s.d;
import v.e;

/* compiled from: Optimizer */
public class j {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f23145a = new boolean[3];

    static void a(f fVar, d dVar, e eVar) {
        eVar.f23107t = -1;
        eVar.f23109u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f23055g;
            int U = fVar.U() - eVar.Q.f23055g;
            d dVar2 = eVar.O;
            dVar2.f23057i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f23057i = dVar.q(dVar3);
            dVar.f(eVar.O.f23057i, i10);
            dVar.f(eVar.Q.f23057i, U);
            eVar.f23107t = 2;
            eVar.L0(i10, U);
        }
        if (fVar.Z[1] != bVar2 && eVar.Z[1] == e.b.MATCH_PARENT) {
            int i11 = eVar.P.f23055g;
            int v10 = fVar.v() - eVar.R.f23055g;
            d dVar4 = eVar.P;
            dVar4.f23057i = dVar.q(dVar4);
            d dVar5 = eVar.R;
            dVar5.f23057i = dVar.q(dVar5);
            dVar.f(eVar.P.f23057i, i11);
            dVar.f(eVar.R.f23057i, v10);
            if (eVar.f23092l0 > 0 || eVar.T() == 8) {
                d dVar6 = eVar.S;
                dVar6.f23057i = dVar.q(dVar6);
                dVar.f(eVar.S.f23057i, eVar.f23092l0 + i11);
            }
            eVar.f23109u = 2;
            eVar.c1(i11, v10);
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
