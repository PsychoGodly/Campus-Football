package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;

public abstract class o3 {
    static StringBuilder a(int i10) {
        n3.a(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824));
    }

    static boolean a(Collection collection, Object obj) {
        Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
