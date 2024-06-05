package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: ContinuationImpl.kt */
public abstract class l extends d implements i<Object> {
    private final int arity;

    public l(int i10, d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String f10 = a0.f(this);
        m.d(f10, "renderLambdaToString(this)");
        return f10;
    }

    public l(int i10) {
        this(i10, (d<Object>) null);
    }
}
