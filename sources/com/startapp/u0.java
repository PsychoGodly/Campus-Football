package com.startapp;

import java.util.Arrays;

/* compiled from: Sta */
public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f17344a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17345b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17346c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17347d;

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17348a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f17349b;

        /* renamed from: c  reason: collision with root package name */
        public int f17350c;

        /* renamed from: d  reason: collision with root package name */
        public int f17351d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17352e;

        /* renamed from: f  reason: collision with root package name */
        public int f17353f;

        /* renamed from: g  reason: collision with root package name */
        public int f17354g;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{a.class.getSimpleName(), Arrays.toString(this.f17349b), Integer.valueOf(this.f17353f), Boolean.valueOf(this.f17352e), Integer.valueOf(this.f17348a), 0L, Integer.valueOf(this.f17354g), Integer.valueOf(this.f17350c), Integer.valueOf(this.f17351d)});
        }
    }

    public u0(int i10, int i11, int i12, int i13) {
        this.f17344a = i10;
        this.f17345b = i11;
        this.f17346c = i12 > 0 && i13 > 0 ? (i12 / i11) * i11 : 0;
        this.f17347d = i13;
    }

    public byte[] a(int i10, a aVar) {
        byte[] bArr = aVar.f17349b;
        if (bArr != null && bArr.length >= aVar.f17350c + i10) {
            return bArr;
        }
        if (bArr == null) {
            aVar.f17349b = new byte[8192];
            aVar.f17350c = 0;
            aVar.f17351d = 0;
        } else {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f17349b = bArr2;
        }
        return aVar.f17349b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:1:0x0003->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0021 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(byte[] r8) {
        /*
            r7 = this;
            int r0 = r8.length
            r1 = 0
            r2 = 0
        L_0x0003:
            if (r2 >= r0) goto L_0x0022
            byte r3 = r8[r2]
            r4 = 61
            r5 = 1
            if (r4 == r3) goto L_0x0021
            if (r3 < 0) goto L_0x001a
            byte[] r4 = com.startapp.q0.f16280k
            int r6 = r4.length
            if (r3 >= r6) goto L_0x001a
            byte r3 = r4[r3]
            r4 = -1
            if (r3 == r4) goto L_0x001a
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x001e
            goto L_0x0021
        L_0x001e:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0021:
            return r5
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.u0.a(byte[]):boolean");
    }
}
