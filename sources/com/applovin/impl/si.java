package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

final class si extends tg implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final si f12115a = new si();

    private si() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public tg c() {
        return tg.a();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
