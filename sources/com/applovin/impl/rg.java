package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public abstract class rg {
    public static List a(byte[] bArr) {
        long b10 = b((long) c(bArr));
        long b11 = b(3840);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(b10));
        arrayList.add(a(b11));
        return arrayList;
    }

    public static int b(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    private static long b(long j10) {
        return (j10 * 1000000000) / 48000;
    }

    private static byte[] a(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
