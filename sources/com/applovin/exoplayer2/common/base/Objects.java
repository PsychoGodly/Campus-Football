package com.applovin.exoplayer2.common.base;

import java.util.Arrays;

public final class Objects extends c {
    private Objects() {
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
