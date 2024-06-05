package h9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import v8.a;
import v8.e;
import v8.m;
import v8.n;

/* compiled from: MultiFormatUPCEANReader */
public final class j extends k {

    /* renamed from: a  reason: collision with root package name */
    private final p[] f28972a;

    public j(Map<e, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(e.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13)) {
                arrayList.add(new e());
            } else if (collection.contains(a.UPC_A)) {
                arrayList.add(new l());
            }
            if (collection.contains(a.EAN_8)) {
                arrayList.add(new f());
            }
            if (collection.contains(a.UPC_E)) {
                arrayList.add(new q());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new e());
            arrayList.add(new f());
            arrayList.add(new q());
        }
        this.f28972a = (p[]) arrayList.toArray(new p[arrayList.size()]);
    }

    public n b(int i10, z8.a aVar, Map<e, ?> map) throws v8.j {
        Collection collection;
        int[] o10 = p.o(aVar);
        p[] pVarArr = this.f28972a;
        boolean z10 = false;
        int i11 = 0;
        while (i11 < pVarArr.length) {
            try {
                n l10 = pVarArr[i11].l(i10, aVar, o10, map);
                boolean z11 = l10.b() == a.EAN_13 && l10.f().charAt(0) == '0';
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(e.POSSIBLE_FORMATS);
                }
                if (collection == null || collection.contains(a.UPC_A)) {
                    z10 = true;
                }
                if (!z11 || !z10) {
                    return l10;
                }
                n nVar = new n(l10.f().substring(1), l10.c(), l10.e(), a.UPC_A);
                nVar.g(l10.d());
                return nVar;
            } catch (m unused) {
                i11++;
            }
        }
        throw v8.j.a();
    }

    public void reset() {
        for (p reset : this.f28972a) {
            reset.reset();
        }
    }
}
