package u7;

import g7.e;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import y7.b;

/* compiled from: DocumentKey */
public final class l implements Comparable<l> {

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<l> f30620b;

    /* renamed from: c  reason: collision with root package name */
    private static final e<l> f30621c;

    /* renamed from: a  reason: collision with root package name */
    private final u f30622a;

    static {
        k kVar = k.f38734a;
        f30620b = kVar;
        f30621c = new e<>(Collections.emptyList(), kVar);
    }

    private l(u uVar) {
        b.d(n(uVar), "Not a document key path: %s", uVar);
        this.f30622a = uVar;
    }

    public static Comparator<l> a() {
        return f30620b;
    }

    public static l d() {
        return h(Collections.emptyList());
    }

    public static e<l> e() {
        return f30621c;
    }

    public static l f(String str) {
        u p10 = u.p(str);
        b.d(p10.k() > 4 && p10.h(0).equals("projects") && p10.h(2).equals("databases") && p10.h(4).equals("documents"), "Tried to parse an invalid key: %s", p10);
        return g((u) p10.l(5));
    }

    public static l g(u uVar) {
        return new l(uVar);
    }

    public static l h(List<String> list) {
        return new l(u.o(list));
    }

    public static boolean n(u uVar) {
        return uVar.k() % 2 == 0;
    }

    /* renamed from: c */
    public int compareTo(l lVar) {
        return this.f30622a.compareTo(lVar.f30622a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f30622a.equals(((l) obj).f30622a);
    }

    public int hashCode() {
        return this.f30622a.hashCode();
    }

    public String i() {
        u uVar = this.f30622a;
        return uVar.h(uVar.k() - 2);
    }

    public u j() {
        return (u) this.f30622a.m();
    }

    public String k() {
        return this.f30622a.g();
    }

    public u l() {
        return this.f30622a;
    }

    public boolean m(String str) {
        if (this.f30622a.k() >= 2) {
            u uVar = this.f30622a;
            if (uVar.f30614a.get(uVar.k() - 2).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f30622a.toString();
    }
}
