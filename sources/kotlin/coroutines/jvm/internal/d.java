package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.m;
import xd.e;
import xd.g;

/* compiled from: ContinuationImpl.kt */
public abstract class d extends a {
    private final g _context;
    private transient xd.d<Object> intercepted;

    public d(xd.d<Object> dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public g getContext() {
        g gVar = this._context;
        m.b(gVar);
        return gVar;
    }

    public final xd.d<Object> intercepted() {
        xd.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().get(e.E1);
            if (eVar == null || (dVar = eVar.J(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        xd.d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b bVar = getContext().get(e.E1);
            m.b(bVar);
            ((e) bVar).G0(dVar);
        }
        this.intercepted = c.f36028a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(xd.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
