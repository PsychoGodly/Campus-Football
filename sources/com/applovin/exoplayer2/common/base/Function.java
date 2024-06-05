package com.applovin.exoplayer2.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public interface Function<F, T> {
    @NullableDecl
    T apply(@NullableDecl F f10);

    boolean equals(@NullableDecl Object obj);
}
