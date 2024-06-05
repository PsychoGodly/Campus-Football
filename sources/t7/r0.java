package t7;

import com.applovin.mediation.MaxReward;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import u7.l;
import u7.u;
import v7.f;
import v7.k;
import y7.x;

/* compiled from: MemoryDocumentOverlayCache */
public class r0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final TreeMap<l, k> f30514a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Set<l>> f30515b = new HashMap();

    private void g(int i10, f fVar) {
        k kVar = this.f30514a.get(fVar.g());
        if (kVar != null) {
            this.f30515b.get(Integer.valueOf(kVar.c())).remove(fVar.g());
        }
        this.f30514a.put(fVar.g(), k.a(i10, fVar));
        if (this.f30515b.get(Integer.valueOf(i10)) == null) {
            this.f30515b.put(Integer.valueOf(i10), new HashSet());
        }
        this.f30515b.get(Integer.valueOf(i10)).add(fVar.g());
    }

    public Map<l, k> a(u uVar, int i10) {
        HashMap hashMap = new HashMap();
        int k10 = uVar.k() + 1;
        for (k next : this.f30514a.tailMap(l.g((u) uVar.a(MaxReward.DEFAULT_LABEL))).values()) {
            l b10 = next.b();
            if (!uVar.j(b10.l())) {
                break;
            } else if (b10.l().k() == k10 && next.c() > i10) {
                hashMap.put(next.b(), next);
            }
        }
        return hashMap;
    }

    public k b(l lVar) {
        return this.f30514a.get(lVar);
    }

    public Map<l, k> c(SortedSet<l> sortedSet) {
        HashMap hashMap = new HashMap();
        for (l lVar : sortedSet) {
            k kVar = this.f30514a.get(lVar);
            if (kVar != null) {
                hashMap.put(lVar, kVar);
            }
        }
        return hashMap;
    }

    public void d(int i10) {
        if (this.f30515b.containsKey(Integer.valueOf(i10))) {
            this.f30515b.remove(Integer.valueOf(i10));
            for (l remove : this.f30515b.get(Integer.valueOf(i10))) {
                this.f30514a.remove(remove);
            }
        }
    }

    public void e(int i10, Map<l, f> map) {
        for (Map.Entry next : map.entrySet()) {
            g(i10, (f) x.d((f) next.getValue(), "null value for key: %s", next.getKey()));
        }
    }

    public Map<l, k> f(String str, int i10, int i11) {
        TreeMap treeMap = new TreeMap();
        for (k next : this.f30514a.values()) {
            if (next.b().i().equals(str) && next.c() > i10) {
                Map map = (Map) treeMap.get(Integer.valueOf(next.c()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(next.c()), map);
                }
                map.put(next.b(), next);
            }
        }
        HashMap hashMap = new HashMap();
        for (Map putAll : treeMap.values()) {
            hashMap.putAll(putAll);
            if (hashMap.size() >= i11) {
                break;
            }
        }
        return hashMap;
    }
}
