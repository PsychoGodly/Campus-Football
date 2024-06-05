package h9;

import j9.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import v8.a;
import v8.e;
import v8.j;
import v8.m;
import v8.n;

/* compiled from: MultiFormatOneDReader */
public final class i extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k[] f28971a;

    public i(Map<e, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(e.POSSIBLE_FORMATS);
        }
        boolean z10 = (map == null || map.get(e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(a.EAN_13) || collection.contains(a.UPC_A) || collection.contains(a.EAN_8) || collection.contains(a.UPC_E)) {
                arrayList.add(new j(map));
            }
            if (collection.contains(a.CODE_39)) {
                arrayList.add(new c(z10));
            }
            if (collection.contains(a.CODE_93)) {
                arrayList.add(new d());
            }
            if (collection.contains(a.CODE_128)) {
                arrayList.add(new b());
            }
            if (collection.contains(a.ITF)) {
                arrayList.add(new h());
            }
            if (collection.contains(a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.RSS_14)) {
                arrayList.add(new i9.e());
            }
            if (collection.contains(a.RSS_EXPANDED)) {
                arrayList.add(new d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new j(map));
            arrayList.add(new c());
            arrayList.add(new a());
            arrayList.add(new d());
            arrayList.add(new b());
            arrayList.add(new h());
            arrayList.add(new i9.e());
            arrayList.add(new d());
        }
        this.f28971a = (k[]) arrayList.toArray(new k[arrayList.size()]);
    }

    public n b(int i10, z8.a aVar, Map<e, ?> map) throws j {
        k[] kVarArr = this.f28971a;
        int i11 = 0;
        while (i11 < kVarArr.length) {
            try {
                return kVarArr[i11].b(i10, aVar, map);
            } catch (m unused) {
                i11++;
            }
        }
        throw j.a();
    }

    public void reset() {
        for (k reset : this.f28971a) {
            reset.reset();
        }
    }
}
