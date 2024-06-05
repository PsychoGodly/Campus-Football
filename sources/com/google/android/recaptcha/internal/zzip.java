package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzip implements Iterator {
    zzip() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
