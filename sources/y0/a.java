package y0;

import androidx.room.h;
import c1.f;

/* compiled from: EntityInsertionAdapter */
public abstract class a<T> extends d {
    public a(h hVar) {
        super(hVar);
    }

    /* access modifiers changed from: protected */
    public abstract void g(f fVar, T t10);

    public final void h(T t10) {
        f a10 = a();
        try {
            g(a10, t10);
            a10.R0();
        } finally {
            f(a10);
        }
    }
}
