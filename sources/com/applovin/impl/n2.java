package com.applovin.impl;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.impl.ab;
import com.applovin.impl.m2;
import java.util.List;

public abstract class n2 {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) yp.a((Object) n2.class.getClassLoader()));
        }
    }

    public static List a(m2.a aVar, List list, List list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static SparseArray a(m2.a aVar, SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray sparseArray3 = new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray3.put(sparseArray.keyAt(i10), aVar.a((Bundle) sparseArray.valueAt(i10)));
        }
        return sparseArray3;
    }

    public static m2 a(m2.a aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.a(bundle);
    }

    public static ab a(m2.a aVar, List list) {
        ab.a f10 = ab.f();
        for (int i10 = 0; i10 < list.size(); i10++) {
            f10.b(aVar.a((Bundle) a1.a((Object) (Bundle) list.get(i10))));
        }
        return f10.a();
    }
}
