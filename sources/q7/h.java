package q7;

import java.util.List;
import u7.l;
import u7.w;

/* compiled from: BundledDocumentMetadata */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final l f29699a;

    /* renamed from: b  reason: collision with root package name */
    private final w f29700b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29701c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f29702d;

    public h(l lVar, w wVar, boolean z10, List<String> list) {
        this.f29699a = lVar;
        this.f29700b = wVar;
        this.f29701c = z10;
        this.f29702d = list;
    }

    public boolean a() {
        return this.f29701c;
    }

    public l b() {
        return this.f29699a;
    }

    public List<String> c() {
        return this.f29702d;
    }

    public w d() {
        return this.f29700b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f29701c == hVar.f29701c && this.f29699a.equals(hVar.f29699a) && this.f29700b.equals(hVar.f29700b)) {
            return this.f29702d.equals(hVar.f29702d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f29699a.hashCode() * 31) + this.f29700b.hashCode()) * 31) + (this.f29701c ? 1 : 0)) * 31) + this.f29702d.hashCode();
    }
}
