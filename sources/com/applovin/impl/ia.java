package com.applovin.impl;

abstract class ia {
    static int a(int i10, double d10) {
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d10 * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i11 = highestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    static int a(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * -862048943), 15)) * 461845907);
    }

    static int a(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
