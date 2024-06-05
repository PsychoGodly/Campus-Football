package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;

final class a extends Optional {

    /* renamed from: a  reason: collision with root package name */
    static final a f6098a = new a();

    private a() {
    }

    static Optional a() {
        return f6098a;
    }

    public Set asSet() {
        return Collections.emptySet();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public Object get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    public Object or(Object obj) {
        return Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    public Object orNull() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    public Optional transform(Function function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }

    public Optional or(Optional optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    public Object or(Supplier supplier) {
        return Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
