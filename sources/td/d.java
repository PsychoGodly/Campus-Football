package td;

import ge.a;
import java.util.AbstractCollection;

/* compiled from: AbstractMutableCollection.kt */
public abstract class d<E> extends AbstractCollection<E> implements a {
    protected d() {
    }

    public abstract int b();

    public final /* bridge */ int size() {
        return b();
    }
}
