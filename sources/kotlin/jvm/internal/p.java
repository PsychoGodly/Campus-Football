package kotlin.jvm.internal;

import le.c;
import le.d;

/* compiled from: MutablePropertyReference0Impl */
public class p extends o {
    public p(d dVar, String str, String str2) {
        super(d.NO_RECEIVER, ((e) dVar).b(), str, str2, (dVar instanceof c) ^ true ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().call(obj);
    }

    public p(Class cls, String str, String str2, int i10) {
        super(d.NO_RECEIVER, cls, str, str2, i10);
    }

    public p(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
