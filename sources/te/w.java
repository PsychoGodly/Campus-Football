package te;

import re.u;
import se.f;
import xd.d;

/* compiled from: SendingCollector.kt */
public final class w<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final u<T> f38719a;

    public w(u<? super T> uVar) {
        this.f38719a = uVar;
    }

    public Object emit(T t10, d<? super sd.w> dVar) {
        Object c10 = this.f38719a.c(t10, dVar);
        return c10 == d.c() ? c10 : sd.w.f38141a;
    }
}
