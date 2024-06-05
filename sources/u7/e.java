package u7;

import java.util.ArrayList;
import java.util.List;
import u7.e;
import y7.b;
import y7.g0;

/* compiled from: BasePath */
public abstract class e<B extends e<B>> implements Comparable<B> {

    /* renamed from: a  reason: collision with root package name */
    final List<String> f30614a;

    e(List<String> list) {
        this.f30614a = list;
    }

    public B a(String str) {
        ArrayList arrayList = new ArrayList(this.f30614a);
        arrayList.add(str);
        return f(arrayList);
    }

    public B c(B b10) {
        ArrayList arrayList = new ArrayList(this.f30614a);
        arrayList.addAll(b10.f30614a);
        return f(arrayList);
    }

    public abstract String d();

    /* renamed from: e */
    public int compareTo(B b10) {
        int k10 = k();
        int k11 = b10.k();
        int i10 = 0;
        while (i10 < k10 && i10 < k11) {
            int compareTo = h(i10).compareTo(b10.h(i10));
            if (compareTo != 0) {
                return compareTo;
            }
            i10++;
        }
        return g0.l(k10, k11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    /* access modifiers changed from: package-private */
    public abstract B f(List<String> list);

    public String g() {
        return this.f30614a.get(k() - 1);
    }

    public String h(int i10) {
        return this.f30614a.get(i10);
    }

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f30614a.hashCode();
    }

    public boolean i() {
        return k() == 0;
    }

    public boolean j(B b10) {
        if (k() > b10.k()) {
            return false;
        }
        for (int i10 = 0; i10 < k(); i10++) {
            if (!h(i10).equals(b10.h(i10))) {
                return false;
            }
        }
        return true;
    }

    public int k() {
        return this.f30614a.size();
    }

    public B l(int i10) {
        int k10 = k();
        b.d(k10 >= i10, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i10), Integer.valueOf(k10));
        return f(this.f30614a.subList(i10, k10));
    }

    public B m() {
        return f(this.f30614a.subList(0, k() - 1));
    }

    public String toString() {
        return d();
    }
}
