package s6;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r6.o;
import r6.v;

/* compiled from: Multimaps */
public final class k0 {

    /* compiled from: Multimaps */
    private static class a<K, V> extends c<K, V> {

        /* renamed from: g  reason: collision with root package name */
        transient v<? extends List<V>> f30212g;

        a(Map<K, Collection<V>> map, v<? extends List<V>> vVar) {
            super(map);
            this.f30212g = (v) o.o(vVar);
        }

        /* access modifiers changed from: package-private */
        public Map<K, Collection<V>> c() {
            return q();
        }

        /* access modifiers changed from: package-private */
        public Set<K> d() {
            return r();
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public List<V> o() {
            return (List) this.f30212g.get();
        }
    }

    static boolean a(h0<?, ?> h0Var, Object obj) {
        if (obj == h0Var) {
            return true;
        }
        if (obj instanceof h0) {
            return h0Var.a().equals(((h0) obj).a());
        }
        return false;
    }

    public static <K, V> d0<K, V> b(Map<K, Collection<V>> map, v<? extends List<V>> vVar) {
        return new a(map, vVar);
    }
}
