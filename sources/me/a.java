package me;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.m;

/* compiled from: SequencesJVM.kt */
public final class a<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<d<T>> f36344a;

    public a(d<? extends T> dVar) {
        m.e(dVar, "sequence");
        this.f36344a = new AtomicReference<>(dVar);
    }

    public Iterator<T> iterator() {
        d andSet = this.f36344a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
