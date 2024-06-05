package com.applovin.impl;

import java.io.EOFException;

public abstract class l8 {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw ah.a(str, (Throwable) null);
        }
    }

    public static boolean b(j8 j8Var, byte[] bArr, int i10, int i11) {
        try {
            j8Var.d(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean a(j8 j8Var, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return j8Var.b(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int a(j8 j8Var, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int b10 = j8Var.b(bArr, i10 + i12, i11 - i12);
            if (b10 == -1) {
                break;
            }
            i12 += b10;
        }
        return i12;
    }

    public static boolean a(j8 j8Var, int i10) {
        try {
            j8Var.a(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
