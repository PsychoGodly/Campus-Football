package re;

import fe.l;
import sd.w;
import xd.d;

/* compiled from: Channel.kt */
public interface u<E> {

    /* compiled from: Channel.kt */
    public static final class a {
        public static /* synthetic */ boolean a(u uVar, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th = null;
                }
                return uVar.e(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    Object c(E e10, d<? super w> dVar);

    boolean e(Throwable th);

    void f(l<? super Throwable, w> lVar);

    Object g(E e10);

    boolean q();
}
