package l9;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Map;
import o9.a;
import v8.c;
import v8.d;
import v8.e;
import v8.f;
import v8.j;
import v8.l;
import v8.n;
import v8.o;
import v8.p;

/* compiled from: PDF417Reader */
public final class b implements l {
    private static n[] b(c cVar, Map<e, ?> map, boolean z10) throws j, f, d {
        ArrayList arrayList = new ArrayList();
        o9.b c10 = a.c(cVar, map, z10);
        for (p[] next : c10.b()) {
            z8.e i10 = m9.j.i(c10.a(), next[4], next[5], next[6], next[7], e(next), c(next));
            n nVar = new n(i10.h(), i10.e(), next, v8.a.PDF_417);
            nVar.h(o.ERROR_CORRECTION_LEVEL, i10.b());
            c cVar2 = (c) i10.d();
            if (cVar2 != null) {
                nVar.h(o.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(nVar);
        }
        return (n[]) arrayList.toArray(new n[arrayList.size()]);
    }

    private static int c(p[] pVarArr) {
        return Math.max(Math.max(d(pVarArr[0], pVarArr[4]), (d(pVarArr[6], pVarArr[2]) * 17) / 18), Math.max(d(pVarArr[1], pVarArr[5]), (d(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    private static int d(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return 0;
        }
        return (int) Math.abs(pVar.c() - pVar2.c());
    }

    private static int e(p[] pVarArr) {
        return Math.min(Math.min(f(pVarArr[0], pVarArr[4]), (f(pVarArr[6], pVarArr[2]) * 17) / 18), Math.min(f(pVarArr[1], pVarArr[5]), (f(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    private static int f(p pVar, p pVar2) {
        return (pVar == null || pVar2 == null) ? a.e.API_PRIORITY_OTHER : (int) Math.abs(pVar.c() - pVar2.c());
    }

    public n a(c cVar, Map<e, ?> map) throws j, f, d {
        n[] b10 = b(cVar, map, false);
        if (b10 != null && b10.length != 0 && b10[0] != null) {
            return b10[0];
        }
        throw j.a();
    }

    public void reset() {
    }
}
