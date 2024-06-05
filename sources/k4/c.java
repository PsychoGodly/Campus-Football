package k4;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import n2.h;
import s6.u;

/* compiled from: BundleableUtil */
public final class c {
    private c() {
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) n0.j(c.class.getClassLoader()));
        }
    }

    public static <T extends h> u<T> b(h.a<T> aVar, List<Bundle> list) {
        u.a p10 = u.p();
        for (int i10 = 0; i10 < list.size(); i10++) {
            p10.a(aVar.a((Bundle) a.e(list.get(i10))));
        }
        return p10.k();
    }

    public static <T extends h> SparseArray<T> c(h.a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), aVar.a(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
