package e7;

import b8.b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet */
class y<T> implements b<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<b<T>> f28799a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f28800b = null;

    y(Collection<b<T>> collection) {
        this.f28799a.addAll(collection);
    }

    static y<?> b(Collection<b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        for (b<T> bVar : this.f28799a) {
            this.f28800b.add(bVar.get());
        }
        this.f28799a = null;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(b<T> bVar) {
        if (this.f28800b == null) {
            this.f28799a.add(bVar);
        } else {
            this.f28800b.add(bVar.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f28800b == null) {
            synchronized (this) {
                if (this.f28800b == null) {
                    this.f28800b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f28800b);
    }
}
