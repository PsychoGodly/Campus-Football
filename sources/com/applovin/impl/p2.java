package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

final class p2 extends tg implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Function f10563a;

    /* renamed from: b  reason: collision with root package name */
    final tg f10564b;

    p2(Function function, tg tgVar) {
        this.f10563a = (Function) Preconditions.checkNotNull(function);
        this.f10564b = (tg) Preconditions.checkNotNull(tgVar);
    }

    public int compare(Object obj, Object obj2) {
        return this.f10564b.compare(this.f10563a.apply(obj), this.f10563a.apply(obj2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        if (!this.f10563a.equals(p2Var.f10563a) || !this.f10564b.equals(p2Var.f10564b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f10563a, this.f10564b);
    }

    public String toString() {
        return this.f10564b + ".onResultOf(" + this.f10563a + ")";
    }
}
