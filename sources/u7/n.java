package u7;

import g7.c;
import g7.e;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: DocumentSet */
public final class n implements Iterable<i> {

    /* renamed from: a  reason: collision with root package name */
    private final c<l, i> f30623a;

    /* renamed from: b  reason: collision with root package name */
    private final e<i> f30624b;

    private n(c<l, i> cVar, e<i> eVar) {
        this.f30623a = cVar;
        this.f30624b = eVar;
    }

    public static n e(Comparator<i> comparator) {
        return new n(j.a(), new e(Collections.emptyList(), new m(comparator)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int n(Comparator comparator, i iVar, i iVar2) {
        int compare = comparator.compare(iVar, iVar2);
        return compare == 0 ? i.f30618a.compare(iVar, iVar2) : compare;
    }

    public n c(i iVar) {
        n o10 = o(iVar.getKey());
        return new n(o10.f30623a.h(iVar.getKey(), iVar), o10.f30624b.e(iVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (size() != nVar.size()) {
            return false;
        }
        Iterator<i> it = iterator();
        Iterator<i> it2 = nVar.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public i f(l lVar) {
        return this.f30623a.c(lVar);
    }

    public i g() {
        return this.f30624b.c();
    }

    public i h() {
        return this.f30624b.b();
    }

    public int hashCode() {
        Iterator<i> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i next = it.next();
            i10 = (((i10 * 31) + next.getKey().hashCode()) * 31) + next.getData().hashCode();
        }
        return i10;
    }

    public boolean isEmpty() {
        return this.f30623a.isEmpty();
    }

    public Iterator<i> iterator() {
        return this.f30624b.iterator();
    }

    public int m(l lVar) {
        i c10 = this.f30623a.c(lVar);
        if (c10 == null) {
            return -1;
        }
        return this.f30624b.indexOf(c10);
    }

    public n o(l lVar) {
        i c10 = this.f30623a.c(lVar);
        if (c10 == null) {
            return this;
        }
        return new n(this.f30623a.n(lVar), this.f30624b.g(c10));
    }

    public int size() {
        return this.f30623a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<i> it = iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            i next = it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(next);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
