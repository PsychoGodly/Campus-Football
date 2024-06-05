package td;

import ge.a;
import java.util.AbstractList;

/* compiled from: AbstractMutableList.kt */
public abstract class e<E> extends AbstractList<E> implements a {
    protected e() {
    }

    public abstract int b();

    public abstract E e(int i10);

    public final /* bridge */ E remove(int i10) {
        return e(i10);
    }

    public final /* bridge */ int size() {
        return b();
    }
}
