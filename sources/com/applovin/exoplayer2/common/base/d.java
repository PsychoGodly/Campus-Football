package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;

final class d extends Optional {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6107a;

    d(Object obj) {
        this.f6107a = obj;
    }

    public Set asSet() {
        return Collections.singleton(this.f6107a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f6107a.equals(((d) obj).f6107a);
        }
        return false;
    }

    public Object get() {
        return this.f6107a;
    }

    public int hashCode() {
        return this.f6107a.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    public Object or(Object obj) {
        Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f6107a;
    }

    public Object orNull() {
        return this.f6107a;
    }

    public String toString() {
        return "Optional.of(" + this.f6107a + ")";
    }

    public Optional transform(Function function) {
        return new d(Preconditions.checkNotNull(function.apply(this.f6107a), "the Function passed to Optional.transform() must not return null."));
    }

    public Optional or(Optional optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    public Object or(Supplier supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f6107a;
    }
}
