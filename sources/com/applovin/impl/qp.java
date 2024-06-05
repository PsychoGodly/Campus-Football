package com.applovin.impl;

import java.util.Iterator;

public abstract class qp implements Iterator {
    protected qp() {
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
