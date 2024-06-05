package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

final class vf extends tg implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final vf f12740a = new vf();

    private vf() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public tg c() {
        return si.f12115a;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
