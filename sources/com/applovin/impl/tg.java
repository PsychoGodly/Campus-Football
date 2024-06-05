package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import java.util.Comparator;

public abstract class tg implements Comparator {
    protected tg() {
    }

    public static tg a(Comparator comparator) {
        if (comparator instanceof tg) {
            return (tg) comparator;
        }
        return new v3(comparator);
    }

    /* access modifiers changed from: package-private */
    public tg b() {
        return a(qc.a());
    }

    public tg c() {
        return new ti(this);
    }

    public abstract int compare(Object obj, Object obj2);

    public ab a(Iterable iterable) {
        return ab.a((Comparator) this, iterable);
    }

    public static tg a() {
        return vf.f12740a;
    }

    public tg a(Function function) {
        return new p2(function, this);
    }
}
