package td;

import ge.a;
import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
public abstract class e0 implements Iterator<Integer>, a {
    public abstract int a();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
