package ue;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pe.t0;

/* compiled from: Atomic.kt */
public abstract class b<T> extends e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38790a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f38786a;

    private final Object c(Object obj) {
        if (t0.a()) {
            if (!(obj != a.f38786a)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38790a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f38786a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    public final Object a(Object obj) {
        Object obj2 = f38790a.get(this);
        if (obj2 == a.f38786a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object d(T t10);
}
