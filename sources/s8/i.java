package s8;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.m;

/* compiled from: UnmodifiableCollections.kt */
public final class i<E> extends d<E> implements Set<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Collection<? extends E> collection) {
        super(collection);
        m.e(collection, "delegate");
    }
}
