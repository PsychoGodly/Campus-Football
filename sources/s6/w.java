package s6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableMultimap */
public abstract class w<K, V> extends g<K, V> implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    final transient v<K, ? extends s<V>> f30271d;

    /* renamed from: f  reason: collision with root package name */
    final transient int f30272f;

    /* compiled from: ImmutableMultimap */
    class a extends d1<V> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<? extends s<V>> f30273a;

        /* renamed from: b  reason: collision with root package name */
        Iterator<V> f30274b = c0.f();

        a() {
            this.f30273a = w.this.f30271d.values().iterator();
        }

        public boolean hasNext() {
            return this.f30274b.hasNext() || this.f30273a.hasNext();
        }

        public V next() {
            if (!this.f30274b.hasNext()) {
                this.f30274b = ((s) this.f30273a.next()).iterator();
            }
            return this.f30274b.next();
        }
    }

    /* compiled from: ImmutableMultimap */
    public static class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, Collection<V>> f30276a = q0.c();

        /* renamed from: b  reason: collision with root package name */
        Comparator<? super K> f30277b;

        /* renamed from: c  reason: collision with root package name */
        Comparator<? super V> f30278c;
    }

    /* compiled from: ImmutableMultimap */
    private static final class c<K, V> extends s<V> {

        /* renamed from: b  reason: collision with root package name */
        private final transient w<K, V> f30279b;

        c(w<K, V> wVar) {
            this.f30279b = wVar;
        }

        /* access modifiers changed from: package-private */
        public int c(Object[] objArr, int i10) {
            d1<? extends s<V>> m10 = this.f30279b.f30271d.values().iterator();
            while (m10.hasNext()) {
                i10 = ((s) m10.next()).c(objArr, i10);
            }
            return i10;
        }

        public boolean contains(Object obj) {
            return this.f30279b.b(obj);
        }

        /* renamed from: m */
        public d1<V> iterator() {
            return this.f30279b.g();
        }

        public int size() {
            return this.f30279b.size();
        }
    }

    w(v<K, ? extends s<V>> vVar, int i10) {
        this.f30271d = vVar;
        this.f30272f = i10;
    }

    public boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Set<K> d() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: h */
    public v<K, Collection<V>> a() {
        return this.f30271d;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public s<V> e() {
        return new c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public d1<V> g() {
        return new a();
    }

    /* renamed from: k */
    public s<V> values() {
        return (s) super.values();
    }

    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f30272f;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
