package kotlin.jvm.internal;

import le.b;
import le.g;
import le.i;

/* compiled from: MutablePropertyReference0 */
public abstract class o extends q implements g {
    public o() {
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return a0.d(this);
    }

    public Object getDelegate() {
        return ((g) getReflected()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public o(Object obj) {
        super(obj);
    }

    public i.a getGetter() {
        return ((g) getReflected()).getGetter();
    }

    public g.a getSetter() {
        return ((g) getReflected()).getSetter();
    }

    public o(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
