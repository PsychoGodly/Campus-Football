package com.applovin.exoplayer2.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public interface Predicate<T> {
    boolean apply(@NullableDecl T t10);

    boolean equals(@NullableDecl Object obj);
}
