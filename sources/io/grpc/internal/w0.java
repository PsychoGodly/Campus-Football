package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: InUseStateAggregator */
public abstract class w0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f35428a = Collections.newSetFromMap(new IdentityHashMap());

    public final boolean a(Object... objArr) {
        for (Object contains : objArr) {
            if (this.f35428a.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public final boolean d() {
        return !this.f35428a.isEmpty();
    }

    public final void e(T t10, boolean z10) {
        int size = this.f35428a.size();
        if (z10) {
            this.f35428a.add(t10);
            if (size == 0) {
                b();
            }
        } else if (this.f35428a.remove(t10) && size == 1) {
            c();
        }
    }
}
