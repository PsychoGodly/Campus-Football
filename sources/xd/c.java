package xd;

import com.applovin.mediation.MaxReward;
import fe.p;
import java.io.Serializable;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import xd.g;

/* compiled from: CoroutineContextImpl.kt */
public final class c implements g, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final g f39342a;

    /* renamed from: b  reason: collision with root package name */
    private final g.b f39343b;

    /* compiled from: CoroutineContextImpl.kt */
    static final class a extends n implements p<String, g.b, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39344a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, g.b bVar) {
            m.e(str, "acc");
            m.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        m.e(gVar, "left");
        m.e(bVar, "element");
        this.f39342a = gVar;
        this.f39343b = bVar;
    }

    private final boolean a(g.b bVar) {
        return m.a(get(bVar.getKey()), bVar);
    }

    private final boolean b(c cVar) {
        while (a(cVar.f39343b)) {
            g gVar = cVar.f39342a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                m.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
        }
        return false;
    }

    private final int c() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f39342a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.c() != c() || !cVar.b(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        m.e(pVar, "operation");
        return pVar.invoke(this.f39342a.fold(r10, pVar), this.f39343b);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        m.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = cVar2.f39343b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            g gVar = cVar2.f39342a;
            if (!(gVar instanceof c)) {
                return gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f39342a.hashCode() + this.f39343b.hashCode();
    }

    public g minusKey(g.c<?> cVar) {
        m.e(cVar, "key");
        if (this.f39343b.get(cVar) != null) {
            return this.f39342a;
        }
        g minusKey = this.f39342a.minusKey(cVar);
        if (minusKey == this.f39342a) {
            return this;
        }
        if (minusKey == h.f39347a) {
            return this.f39343b;
        }
        return new c(minusKey, this.f39343b);
    }

    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold(MaxReward.DEFAULT_LABEL, a.f39344a)) + ']';
    }
}
