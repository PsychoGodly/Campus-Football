package com.applovin.impl;

import android.util.Pair;
import com.applovin.mediation.MaxReward;
import java.util.Collections;
import java.util.List;

public abstract class m3 {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f9313a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f9314b = {MaxReward.DEFAULT_LABEL, "A", "B", "C"};

    public static String a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public static List a(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String a(zg zgVar) {
        zgVar.d(24);
        int b10 = zgVar.b(2);
        boolean c10 = zgVar.c();
        int b11 = zgVar.b(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (zgVar.c()) {
                i10 |= 1 << i11;
            }
        }
        int i12 = 6;
        int[] iArr = new int[6];
        for (int i13 = 0; i13 < 6; i13++) {
            iArr[i13] = zgVar.b(8);
        }
        int b12 = zgVar.b(8);
        Object[] objArr = new Object[5];
        objArr[0] = f9314b[b10];
        objArr[1] = Integer.valueOf(b11);
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = Character.valueOf(c10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(b12);
        StringBuilder sb2 = new StringBuilder(yp.a("hvc1.%s%d.%X.%c%d", objArr));
        while (i12 > 0 && iArr[i12 - 1] == 0) {
            i12--;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            sb2.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i14])}));
        }
        return sb2.toString();
    }

    public static byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f9313a;
        byte[] bArr3 = new byte[(bArr2.length + i11)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static boolean a(List list) {
        if (list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1) {
            return true;
        }
        return false;
    }

    public static Pair a(byte[] bArr) {
        yg ygVar = new yg(bArr);
        ygVar.f(9);
        int w10 = ygVar.w();
        ygVar.f(20);
        return Pair.create(Integer.valueOf(ygVar.A()), Integer.valueOf(w10));
    }
}
