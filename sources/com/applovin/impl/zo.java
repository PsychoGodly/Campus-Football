package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

abstract class zo implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    final Iterator f13957a;

    zo(Iterator it) {
        this.f13957a = (Iterator) Preconditions.checkNotNull(it);
    }

    /* access modifiers changed from: package-private */
    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.f13957a.hasNext();
    }

    public final Object next() {
        return a(this.f13957a.next());
    }

    public final void remove() {
        this.f13957a.remove();
    }
}
