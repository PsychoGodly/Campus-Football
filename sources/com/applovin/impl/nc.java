package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

public abstract class nc {
    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int a(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    public static long a(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }
}
