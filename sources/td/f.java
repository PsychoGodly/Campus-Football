package td;

import ge.a;
import java.util.AbstractSet;

/* compiled from: AbstractMutableSet.kt */
public abstract class f<E> extends AbstractSet<E> implements a {
    protected f() {
    }

    public abstract int b();

    public final /* bridge */ int size() {
        return b();
    }
}
