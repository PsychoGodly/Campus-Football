package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

final class v3 extends tg implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Comparator f12665a;

    v3(Comparator comparator) {
        this.f12665a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    public int compare(Object obj, Object obj2) {
        return this.f12665a.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v3) {
            return this.f12665a.equals(((v3) obj).f12665a);
        }
        return false;
    }

    public int hashCode() {
        return this.f12665a.hashCode();
    }

    public String toString() {
        return this.f12665a.toString();
    }
}
