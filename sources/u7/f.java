package u7;

import com.applovin.mediation.MaxReward;
import y7.b;

/* compiled from: DatabaseId */
public final class f implements Comparable<f> {

    /* renamed from: c  reason: collision with root package name */
    public static final f f30615c = c(MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL);

    /* renamed from: a  reason: collision with root package name */
    private final String f30616a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30617b;

    private f(String str, String str2) {
        this.f30616a = str;
        this.f30617b = str2;
    }

    public static f c(String str, String str2) {
        return new f(str, str2);
    }

    public static f d(String str) {
        u p10 = u.p(str);
        b.d(p10.k() > 3 && p10.h(0).equals("projects") && p10.h(2).equals("databases"), "Tried to parse an invalid resource name: %s", p10);
        return new f(p10.h(1), p10.h(3));
    }

    /* renamed from: a */
    public int compareTo(f fVar) {
        int compareTo = this.f30616a.compareTo(fVar.f30616a);
        return compareTo != 0 ? compareTo : this.f30617b.compareTo(fVar.f30617b);
    }

    public String e() {
        return this.f30617b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f30616a.equals(fVar.f30616a) || !this.f30617b.equals(fVar.f30617b)) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.f30616a;
    }

    public int hashCode() {
        return (this.f30616a.hashCode() * 31) + this.f30617b.hashCode();
    }

    public String toString() {
        return "DatabaseId(" + this.f30616a + ", " + this.f30617b + ")";
    }
}
