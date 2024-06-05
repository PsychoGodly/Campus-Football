package com.applovin.impl;

public abstract class cg {
    static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    public static Object[] b(Object[] objArr, int i10) {
        return jh.a(objArr, i10);
    }

    static Object[] a(Object... objArr) {
        return a(objArr, objArr.length);
    }

    static Object[] a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }
}
