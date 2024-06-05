package s8;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: UnmodifiableCollections.kt */
public final class g<K, V> extends d<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: b  reason: collision with root package name */
    private final Set<Map.Entry<K, V>> f30310b;

    /* compiled from: UnmodifiableCollections.kt */
    public static final class a implements Iterator<Map.Entry<? extends K, ? extends V>>, ge.a {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ Iterator<Map.Entry<K, V>> f30311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Iterator<Map.Entry<K, V>> f30312b;

        a(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
            this.f30312b = it;
            this.f30311a = it;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            return new h(this.f30312b.next());
        }

        public boolean hasNext() {
            return this.f30311a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Set<? extends Map.Entry<? extends K, ? extends V>> set) {
        super(set);
        m.e(set, "delegate");
        this.f30310b = set;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return e((Map.Entry) obj);
    }

    public /* bridge */ boolean e(Map.Entry<? extends Object, ? extends Object> entry) {
        return super.contains(entry);
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new a(this.f30310b.iterator());
    }
}
