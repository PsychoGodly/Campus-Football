package x7;

import java.util.Map;
import java.util.Set;
import t7.h1;
import u7.l;
import u7.s;
import u7.w;

/* compiled from: RemoteEvent */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final w f31079a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, u0> f31080b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, h1> f31081c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<l, s> f31082d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<l> f31083e;

    public m0(w wVar, Map<Integer, u0> map, Map<Integer, h1> map2, Map<l, s> map3, Set<l> set) {
        this.f31079a = wVar;
        this.f31080b = map;
        this.f31081c = map2;
        this.f31082d = map3;
        this.f31083e = set;
    }

    public Map<l, s> a() {
        return this.f31082d;
    }

    public Set<l> b() {
        return this.f31083e;
    }

    public w c() {
        return this.f31079a;
    }

    public Map<Integer, u0> d() {
        return this.f31080b;
    }

    public Map<Integer, h1> e() {
        return this.f31081c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f31079a + ", targetChanges=" + this.f31080b + ", targetMismatches=" + this.f31081c + ", documentUpdates=" + this.f31082d + ", resolvedLimboDocuments=" + this.f31083e + '}';
    }
}
