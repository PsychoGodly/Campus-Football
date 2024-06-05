package v8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p9.a;
import w8.b;

/* compiled from: MultiFormatReader */
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    private Map<e, ?> f30761a;

    /* renamed from: b  reason: collision with root package name */
    private l[] f30762b;

    private n b(c cVar) throws j {
        l[] lVarArr = this.f30762b;
        if (lVarArr != null) {
            int length = lVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                try {
                    return lVarArr[i10].a(cVar, this.f30761a);
                } catch (m unused) {
                    i10++;
                }
            }
        }
        throw j.a();
    }

    public n a(c cVar, Map<e, ?> map) throws j {
        d(map);
        return b(cVar);
    }

    public n c(c cVar) throws j {
        if (this.f30762b == null) {
            d((Map<e, ?>) null);
        }
        return b(cVar);
    }

    public void d(Map<e, ?> map) {
        Collection collection;
        this.f30761a = map;
        boolean z10 = true;
        boolean z11 = map != null && map.containsKey(e.TRY_HARDER);
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(e.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z10 = false;
            }
            if (z10 && !z11) {
                arrayList.add(new h9.i(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new c9.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new l9.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new f9.a());
            }
            if (z10 && z11) {
                arrayList.add(new h9.i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new h9.i(map));
            }
            arrayList.add(new a());
            arrayList.add(new c9.a());
            arrayList.add(new b());
            arrayList.add(new l9.b());
            arrayList.add(new f9.a());
            if (z11) {
                arrayList.add(new h9.i(map));
            }
        }
        this.f30762b = (l[]) arrayList.toArray(new l[arrayList.size()]);
    }

    public void reset() {
        l[] lVarArr = this.f30762b;
        if (lVarArr != null) {
            for (l reset : lVarArr) {
                reset.reset();
            }
        }
    }
}
