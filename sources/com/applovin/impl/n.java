package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.d9;
import com.facebook.ads.AdError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ByteBuffer;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f9869a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, 1000, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, 2048};

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f9870a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9871b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9872c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9873d;

        /* renamed from: e  reason: collision with root package name */
        public final int f9874e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f9870a = i10;
            this.f9872c = i11;
            this.f9871b = i12;
            this.f9873d = i13;
            this.f9874e = i14;
        }
    }

    public static void a(int i10, yg ygVar) {
        ygVar.d(7);
        byte[] c10 = ygVar.c();
        c10[0] = -84;
        c10[1] = 64;
        c10[2] = -1;
        c10[3] = -1;
        c10[4] = (byte) ((i10 >> 16) & 255);
        c10[5] = (byte) ((i10 >> 8) & 255);
        c10[6] = (byte) (i10 & 255);
    }

    public static d9 a(yg ygVar, String str, String str2, w6 w6Var) {
        ygVar.g(1);
        return new d9.b().c(str).f("audio/ac4").c(2).n(((ygVar.w() & 32) >> 5) == 1 ? 48000 : 44100).a(w6Var).e(str2).a();
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return a(new xg(bArr)).f9874e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r10 != 8) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.impl.n.b a(com.applovin.impl.xg r10) {
        /*
            r0 = 16
            int r1 = r10.a((int) r0)
            int r0 = r10.a((int) r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.a((int) r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.a((int) r0)
            r3 = 3
            if (r1 != r3) goto L_0x002f
            int r4 = a((com.applovin.impl.xg) r10, (int) r0)
            int r1 = r1 + r4
        L_0x002f:
            r4 = r1
            r1 = 10
            int r1 = r10.a((int) r1)
            boolean r5 = r10.f()
            if (r5 == 0) goto L_0x0045
            int r5 = r10.a((int) r3)
            if (r5 <= 0) goto L_0x0045
            r10.d(r0)
        L_0x0045:
            boolean r5 = r10.f()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x0055
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0058
        L_0x0055:
            r9 = 44100(0xac44, float:6.1797E-41)
        L_0x0058:
            int r10 = r10.a((int) r2)
            r5 = 0
            if (r9 != r8) goto L_0x0069
            r8 = 13
            if (r10 != r8) goto L_0x0069
            int[] r0 = f9869a
            r10 = r0[r10]
            r8 = r10
            goto L_0x0099
        L_0x0069:
            if (r9 != r6) goto L_0x0098
            int[] r6 = f9869a
            int r8 = r6.length
            if (r10 >= r8) goto L_0x0098
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 1
            r8 = 8
            if (r1 == r6) goto L_0x008e
            r6 = 11
            if (r1 == r0) goto L_0x0089
            if (r1 == r3) goto L_0x008e
            if (r1 == r2) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            if (r10 == r3) goto L_0x0095
            if (r10 == r8) goto L_0x0095
            if (r10 != r6) goto L_0x0093
            goto L_0x0095
        L_0x0089:
            if (r10 == r8) goto L_0x0095
            if (r10 != r6) goto L_0x0093
            goto L_0x0095
        L_0x008e:
            if (r10 == r3) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r8 = r5
            goto L_0x0099
        L_0x0095:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x0098:
            r8 = 0
        L_0x0099:
            com.applovin.impl.n$b r10 = new com.applovin.impl.n$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.n.a(com.applovin.impl.xg):com.applovin.impl.n$b");
    }

    public static int a(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b10 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b10 == 65535) {
            b10 = ((bArr[4] & 255) << Ascii.DLE) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return b10 + i11;
    }

    private static int a(xg xgVar, int i10) {
        int i11 = 0;
        while (true) {
            int a10 = i11 + xgVar.a(i10);
            if (!xgVar.f()) {
                return a10;
            }
            i11 = (a10 + 1) << i10;
        }
    }
}
