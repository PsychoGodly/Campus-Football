package s3;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import k4.n0;
import s6.b0;

/* compiled from: BaseUrlExclusionList */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Long> f22491a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Long> f22492b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, t3.b> f22493c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f22494d;

    public b() {
        this(new Random());
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) n0.j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<t3.b> c(List<t3.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f22491a);
        h(elapsedRealtime, this.f22492b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            t3.b bVar = list.get(i10);
            if (!this.f22491a.containsKey(bVar.f22583b) && !this.f22492b.containsKey(Integer.valueOf(bVar.f22584c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static int d(t3.b bVar, t3.b bVar2) {
        int compare = Integer.compare(bVar.f22584c, bVar2.f22584c);
        return compare != 0 ? compare : bVar.f22583b.compareTo(bVar2.f22583b);
    }

    public static int f(List<t3.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f22584c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            if (((Long) next.getValue()).longValue() <= j10) {
                arrayList.add(next.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private t3.b k(List<t3.b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f22585d;
        }
        int nextInt = this.f22494d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            t3.b bVar = list.get(i13);
            i12 += bVar.f22585d;
            if (nextInt < i12) {
                return bVar;
            }
        }
        return (t3.b) b0.d(list);
    }

    public void e(t3.b bVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f22583b, elapsedRealtime, this.f22491a);
        int i10 = bVar.f22584c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), elapsedRealtime, this.f22492b);
        }
    }

    public int g(List<t3.b> list) {
        HashSet hashSet = new HashSet();
        List<t3.b> c10 = c(list);
        for (int i10 = 0; i10 < c10.size(); i10++) {
            hashSet.add(Integer.valueOf(c10.get(i10).f22584c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f22491a.clear();
        this.f22492b.clear();
        this.f22493c.clear();
    }

    public t3.b j(List<t3.b> list) {
        List<t3.b> c10 = c(list);
        if (c10.size() < 2) {
            return (t3.b) b0.c(c10, null);
        }
        Collections.sort(c10, a.f38030a);
        ArrayList arrayList = new ArrayList();
        int i10 = c10.get(0).f22584c;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            t3.b bVar = c10.get(i11);
            if (i10 == bVar.f22584c) {
                arrayList.add(new Pair(bVar.f22583b, Integer.valueOf(bVar.f22585d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return c10.get(0);
            }
        }
        t3.b bVar2 = this.f22493c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        t3.b k10 = k(c10.subList(0, arrayList.size()));
        this.f22493c.put(arrayList, k10);
        return k10;
    }

    b(Random random) {
        this.f22493c = new HashMap();
        this.f22494d = random;
        this.f22491a = new HashMap();
        this.f22492b = new HashMap();
    }
}
