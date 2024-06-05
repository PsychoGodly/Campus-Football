package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

abstract class c extends rp {

    /* renamed from: a  reason: collision with root package name */
    private final int f6804a;

    /* renamed from: b  reason: collision with root package name */
    private int f6805b;

    protected c(int i10, int i11) {
        Preconditions.checkPositionIndex(i11, i10);
        this.f6804a = i10;
        this.f6805b = i11;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i10);

    public final boolean hasNext() {
        return this.f6805b < this.f6804a;
    }

    public final boolean hasPrevious() {
        return this.f6805b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.f6805b;
            this.f6805b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f6805b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f6805b - 1;
            this.f6805b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f6805b - 1;
    }
}
