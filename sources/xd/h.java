package xd;

import fe.p;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import xd.g;

/* compiled from: CoroutineContextImpl.kt */
public final class h implements g, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final h f39347a = new h();

    private h() {
    }

    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        m.e(pVar, "operation");
        return r10;
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        m.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public g minusKey(g.c<?> cVar) {
        m.e(cVar, "key");
        return this;
    }

    public g plus(g gVar) {
        m.e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
