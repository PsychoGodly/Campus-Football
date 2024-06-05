package q7;

import u7.l;
import u7.s;

/* compiled from: BundleDocument */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private s f29677a;

    public b(s sVar) {
        this.f29677a = sVar;
    }

    public s a() {
        return this.f29677a;
    }

    public l b() {
        return this.f29677a.getKey();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f29677a.equals(((b) obj).f29677a);
    }

    public int hashCode() {
        return this.f29677a.hashCode();
    }
}
