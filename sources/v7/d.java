package v7;

import java.util.HashSet;
import java.util.Set;
import u7.r;

/* compiled from: FieldMask */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static d f30696b = b(new HashSet());

    /* renamed from: a  reason: collision with root package name */
    private final Set<r> f30697a;

    private d(Set<r> set) {
        this.f30697a = set;
    }

    public static d b(Set<r> set) {
        return new d(set);
    }

    public boolean a(r rVar) {
        for (r j10 : this.f30697a) {
            if (j10.j(rVar)) {
                return true;
            }
        }
        return false;
    }

    public Set<r> c() {
        return this.f30697a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f30697a.equals(((d) obj).f30697a);
    }

    public int hashCode() {
        return this.f30697a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f30697a.toString() + "}";
    }
}
