package kotlin.jvm.internal;

import le.b;
import le.i;

/* compiled from: PropertyReference0 */
public abstract class s extends u implements i {
    public s(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return a0.e(this);
    }

    public Object invoke() {
        return get();
    }
}
