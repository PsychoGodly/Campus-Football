package u7;

import p8.d0;

/* compiled from: MutableDocument */
public final class s implements i {

    /* renamed from: b  reason: collision with root package name */
    private final l f30635b;

    /* renamed from: c  reason: collision with root package name */
    private b f30636c;

    /* renamed from: d  reason: collision with root package name */
    private w f30637d;

    /* renamed from: e  reason: collision with root package name */
    private w f30638e;

    /* renamed from: f  reason: collision with root package name */
    private t f30639f;

    /* renamed from: g  reason: collision with root package name */
    private a f30640g;

    /* compiled from: MutableDocument */
    private enum a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    /* compiled from: MutableDocument */
    private enum b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private s(l lVar) {
        this.f30635b = lVar;
        this.f30638e = w.f30653b;
    }

    public static s n(l lVar, w wVar, t tVar) {
        return new s(lVar).j(wVar, tVar);
    }

    public static s o(l lVar) {
        b bVar = b.INVALID;
        w wVar = w.f30653b;
        return new s(lVar, bVar, wVar, wVar, new t(), a.SYNCED);
    }

    public static s p(l lVar, w wVar) {
        return new s(lVar).k(wVar);
    }

    public static s q(l lVar, w wVar) {
        return new s(lVar).l(wVar);
    }

    public s a() {
        return new s(this.f30635b, this.f30636c, this.f30637d, this.f30638e, this.f30639f.clone(), this.f30640g);
    }

    public boolean b() {
        return this.f30636c.equals(b.FOUND_DOCUMENT);
    }

    public boolean c() {
        return this.f30640g.equals(a.HAS_COMMITTED_MUTATIONS);
    }

    public boolean d() {
        return this.f30640g.equals(a.HAS_LOCAL_MUTATIONS);
    }

    public boolean e() {
        return d() || c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f30635b.equals(sVar.f30635b) && this.f30637d.equals(sVar.f30637d) && this.f30636c.equals(sVar.f30636c) && this.f30640g.equals(sVar.f30640g)) {
            return this.f30639f.equals(sVar.f30639f);
        }
        return false;
    }

    public w f() {
        return this.f30638e;
    }

    public boolean g() {
        return this.f30636c.equals(b.NO_DOCUMENT);
    }

    public t getData() {
        return this.f30639f;
    }

    public l getKey() {
        return this.f30635b;
    }

    public w getVersion() {
        return this.f30637d;
    }

    public d0 h(r rVar) {
        return getData().i(rVar);
    }

    public int hashCode() {
        return this.f30635b.hashCode();
    }

    public boolean i() {
        return this.f30636c.equals(b.UNKNOWN_DOCUMENT);
    }

    public s j(w wVar, t tVar) {
        this.f30637d = wVar;
        this.f30636c = b.FOUND_DOCUMENT;
        this.f30639f = tVar;
        this.f30640g = a.SYNCED;
        return this;
    }

    public s k(w wVar) {
        this.f30637d = wVar;
        this.f30636c = b.NO_DOCUMENT;
        this.f30639f = new t();
        this.f30640g = a.SYNCED;
        return this;
    }

    public s l(w wVar) {
        this.f30637d = wVar;
        this.f30636c = b.UNKNOWN_DOCUMENT;
        this.f30639f = new t();
        this.f30640g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public boolean m() {
        return !this.f30636c.equals(b.INVALID);
    }

    public s r() {
        this.f30640g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public s s() {
        this.f30640g = a.HAS_LOCAL_MUTATIONS;
        this.f30637d = w.f30653b;
        return this;
    }

    public s t(w wVar) {
        this.f30638e = wVar;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.f30635b + ", version=" + this.f30637d + ", readTime=" + this.f30638e + ", type=" + this.f30636c + ", documentState=" + this.f30640g + ", value=" + this.f30639f + '}';
    }

    private s(l lVar, b bVar, w wVar, w wVar2, t tVar, a aVar) {
        this.f30635b = lVar;
        this.f30637d = wVar;
        this.f30638e = wVar2;
        this.f30636c = bVar;
        this.f30640g = aVar;
        this.f30639f = tVar;
    }
}
