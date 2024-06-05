package m2;

import android.util.SparseArray;
import java.util.HashMap;
import z1.d;

/* compiled from: PriorityMapping */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f20038a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<d, Integer> f20039b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f20039b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f20039b.put(d.VERY_LOW, 1);
        f20039b.put(d.HIGHEST, 2);
        for (d next : f20039b.keySet()) {
            f20038a.append(f20039b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f20039b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f20038a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
