package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.dl;
import java.util.Arrays;

final class qg extends dl {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f10989o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n  reason: collision with root package name */
    private boolean f10990n;

    qg() {
    }

    private long a(byte[] bArr) {
        byte b10 = bArr[0];
        byte b11 = b10 & 255;
        byte b12 = b10 & 3;
        byte b13 = 2;
        if (b12 == 0) {
            b13 = 1;
        } else if (!(b12 == 1 || b12 == 2)) {
            b13 = bArr[1] & 63;
        }
        int i10 = b11 >> 3;
        int i11 = i10 & 3;
        return ((long) b13) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i10 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    public static boolean b(yg ygVar) {
        int a10 = ygVar.a();
        byte[] bArr = f10989o;
        if (a10 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        ygVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public long a(yg ygVar) {
        return b(a(ygVar.c()));
    }

    /* access modifiers changed from: protected */
    public boolean a(yg ygVar, long j10, dl.b bVar) {
        boolean z10 = true;
        if (!this.f10990n) {
            byte[] copyOf = Arrays.copyOf(ygVar.c(), ygVar.e());
            int b10 = rg.b(copyOf);
            bVar.f7284a = new d9.b().f("audio/opus").c(b10).n(48000).a(rg.a(copyOf)).a();
            this.f10990n = true;
            return true;
        }
        a1.a((Object) bVar.f7284a);
        if (ygVar.j() != 1332770163) {
            z10 = false;
        }
        ygVar.f(0);
        return z10;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f10990n = false;
        }
    }
}
