package td;

import ge.a;
import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
public abstract class f0 implements Iterator<Long>, a {
    public abstract long a();

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
