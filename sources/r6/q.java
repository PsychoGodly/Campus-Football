package r6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: Predicates */
public final class q {

    /* compiled from: Predicates */
    private static class b<T> implements p<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends p<? super T>> f29818a;

        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f29818a.size(); i10++) {
                if (!((p) this.f29818a.get(i10)).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f29818a.equals(((b) obj).f29818a);
            }
            return false;
        }

        public int hashCode() {
            return this.f29818a.hashCode() + 306654252;
        }

        public String toString() {
            return q.d("and", this.f29818a);
        }

        private b(List<? extends p<? super T>> list) {
            this.f29818a = list;
        }
    }

    public static <T> p<T> b(p<? super T> pVar, p<? super T> pVar2) {
        return new b(c((p) o.o(pVar), (p) o.o(pVar2)));
    }

    private static <T> List<p<? super T>> c(p<? super T> pVar, p<? super T> pVar2) {
        return Arrays.asList(new p[]{pVar, pVar2});
    }

    /* access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object next : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(next);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
