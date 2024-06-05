package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.m;
import sd.o;
import sd.p;
import sd.w;
import xd.d;

/* compiled from: ContinuationImpl.kt */
public abstract class a implements d<Object>, e, Serializable {
    private final d<Object> completion;

    public a(d<Object> dVar) {
        this.completion = dVar;
    }

    public d<w> create(d<?> dVar) {
        m.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            d dVar2 = aVar.completion;
            m.b(dVar2);
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != d.c()) {
                    o.a aVar2 = o.f38128b;
                    obj = o.b(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar2 instanceof a) {
                        dVar = dVar2;
                    } else {
                        dVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                o.a aVar3 = o.f38128b;
                obj = o.b(p.a(th));
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public d<w> create(Object obj, d<?> dVar) {
        m.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
