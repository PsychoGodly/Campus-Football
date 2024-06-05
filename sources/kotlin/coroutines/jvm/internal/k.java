package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: ContinuationImpl.kt */
public abstract class k extends j implements i<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final int f36035a;

    public k(int i10, d<Object> dVar) {
        super(dVar);
        this.f36035a = i10;
    }

    public int getArity() {
        return this.f36035a;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String f10 = a0.f(this);
        m.d(f10, "renderLambdaToString(this)");
        return f10;
    }
}
