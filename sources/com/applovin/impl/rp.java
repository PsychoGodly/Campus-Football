package com.applovin.impl;

import java.util.ListIterator;

public abstract class rp extends qp implements ListIterator {
    protected rp() {
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
