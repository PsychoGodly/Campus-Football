package v7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t7.d1;
import u7.l;
import u7.s;
import u7.w;
import y6.q;
import y7.b;

/* compiled from: MutationBatch */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final int f30703a;

    /* renamed from: b  reason: collision with root package name */
    private final q f30704b;

    /* renamed from: c  reason: collision with root package name */
    private final List<f> f30705c;

    /* renamed from: d  reason: collision with root package name */
    private final List<f> f30706d;

    public g(int i10, q qVar, List<f> list, List<f> list2) {
        b.d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f30703a = i10;
        this.f30704b = qVar;
        this.f30705c = list;
        this.f30706d = list2;
    }

    public Map<l, f> a(Map<l, d1> map, Set<l> set) {
        HashMap hashMap = new HashMap();
        for (l next : f()) {
            s sVar = (s) map.get(next).a();
            d b10 = b(sVar, map.get(next).b());
            if (set.contains(next)) {
                b10 = null;
            }
            f c10 = f.c(sVar, b10);
            if (c10 != null) {
                hashMap.put(next, c10);
            }
            if (!sVar.m()) {
                sVar.k(w.f30653b);
            }
        }
        return hashMap;
    }

    public d b(s sVar, d dVar) {
        for (int i10 = 0; i10 < this.f30705c.size(); i10++) {
            f fVar = this.f30705c.get(i10);
            if (fVar.g().equals(sVar.getKey())) {
                dVar = fVar.a(sVar, dVar, this.f30704b);
            }
        }
        for (int i11 = 0; i11 < this.f30706d.size(); i11++) {
            f fVar2 = this.f30706d.get(i11);
            if (fVar2.g().equals(sVar.getKey())) {
                dVar = fVar2.a(sVar, dVar, this.f30704b);
            }
        }
        return dVar;
    }

    public void c(s sVar, h hVar) {
        int size = this.f30706d.size();
        List<i> e10 = hVar.e();
        b.d(e10.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(e10.size()));
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f30706d.get(i10);
            if (fVar.g().equals(sVar.getKey())) {
                fVar.b(sVar, e10.get(i10));
            }
        }
    }

    public List<f> d() {
        return this.f30705c;
    }

    public int e() {
        return this.f30703a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f30703a != gVar.f30703a || !this.f30704b.equals(gVar.f30704b) || !this.f30705c.equals(gVar.f30705c) || !this.f30706d.equals(gVar.f30706d)) {
            return false;
        }
        return true;
    }

    public Set<l> f() {
        HashSet hashSet = new HashSet();
        for (f g10 : this.f30706d) {
            hashSet.add(g10.g());
        }
        return hashSet;
    }

    public q g() {
        return this.f30704b;
    }

    public List<f> h() {
        return this.f30706d;
    }

    public int hashCode() {
        return (((((this.f30703a * 31) + this.f30704b.hashCode()) * 31) + this.f30705c.hashCode()) * 31) + this.f30706d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f30703a + ", localWriteTime=" + this.f30704b + ", baseMutations=" + this.f30705c + ", mutations=" + this.f30706d + ')';
    }
}
