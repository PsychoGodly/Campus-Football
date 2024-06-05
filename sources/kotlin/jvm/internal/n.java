package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: Lambda.kt */
public abstract class n<R> implements i<R>, Serializable {
    private final int arity;

    public n(int i10) {
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String g10 = a0.g(this);
        m.d(g10, "renderLambdaToString(this)");
        return g10;
    }
}
