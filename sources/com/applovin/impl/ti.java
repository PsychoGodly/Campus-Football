package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

final class ti extends tg implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final tg f12408a;

    ti(tg tgVar) {
        this.f12408a = (tg) Preconditions.checkNotNull(tgVar);
    }

    public tg c() {
        return this.f12408a;
    }

    public int compare(Object obj, Object obj2) {
        return this.f12408a.compare(obj2, obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ti) {
            return this.f12408a.equals(((ti) obj).f12408a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f12408a.hashCode();
    }

    public String toString() {
        return this.f12408a + ".reverse()";
    }
}
