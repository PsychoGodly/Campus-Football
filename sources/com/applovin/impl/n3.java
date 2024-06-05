package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

abstract class n3 {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    static void a(boolean z10) {
        Preconditions.checkState(z10, "no calls to next() since the last call to remove()");
    }
}
