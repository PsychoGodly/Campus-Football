package re;

import java.util.concurrent.CancellationException;
import xd.d;

/* compiled from: Channel.kt */
public interface t<E> {
    Object a();

    Object b(d<? super E> dVar);

    Object d(d<? super h<? extends E>> dVar);

    void i(CancellationException cancellationException);

    f<E> iterator();
}
