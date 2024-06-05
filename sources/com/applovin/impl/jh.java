package com.applovin.impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

abstract class jh {
    static Object[] a(Object[] objArr, int i10, int i11, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i10, i11, objArr2.getClass());
    }

    static Object[] a(Object[] objArr, int i10) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
    }

    static Map a() {
        return u3.a();
    }
}
