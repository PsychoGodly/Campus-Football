package q7;

import u7.w;

/* compiled from: NamedQuery */
public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29705a;

    /* renamed from: b  reason: collision with root package name */
    private final i f29706b;

    /* renamed from: c  reason: collision with root package name */
    private final w f29707c;

    public j(String str, i iVar, w wVar) {
        this.f29705a = str;
        this.f29706b = iVar;
        this.f29707c = wVar;
    }

    public i a() {
        return this.f29706b;
    }

    public String b() {
        return this.f29705a;
    }

    public w c() {
        return this.f29707c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f29705a.equals(jVar.f29705a) && this.f29706b.equals(jVar.f29706b)) {
            return this.f29707c.equals(jVar.f29707c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f29705a.hashCode() * 31) + this.f29706b.hashCode()) * 31) + this.f29707c.hashCode();
    }
}
