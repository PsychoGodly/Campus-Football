package p2;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.nio.ByteBuffer;
import k4.a0;
import k4.z;
import n2.r1;
import r2.m;

/* compiled from: Ac4Util */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f21148a = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, AdError.NO_FILL_ERROR_CODE, 1000, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, 2048};

    /* compiled from: Ac4Util */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f21149a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21150b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21151c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21152d;

        /* renamed from: e  reason: collision with root package name */
        public final int f21153e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f21149a = i10;
            this.f21151c = i11;
            this.f21150b = i12;
            this.f21152d = i13;
            this.f21153e = i14;
        }
    }

    public static void a(int i10, a0 a0Var) {
        a0Var.P(7);
        byte[] e10 = a0Var.e();
        e10[0] = -84;
        e10[1] = 64;
        e10[2] = -1;
        e10[3] = -1;
        e10[4] = (byte) ((i10 >> 16) & 255);
        e10[5] = (byte) ((i10 >> 8) & 255);
        e10[6] = (byte) (i10 & 255);
    }

    public static r1 b(a0 a0Var, String str, String str2, m mVar) {
        a0Var.U(1);
        return new r1.b().U(str).g0("audio/ac4").J(2).h0(((a0Var.G() & 32) >> 5) == 1 ? 48000 : 44100).O(mVar).X(str2).G();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new z(bArr)).f21153e;
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
    public static p2.c.b d(k4.z r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.h(r0)
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
            int r1 = r10.h(r0)
            r3 = 3
            if (r1 != r3) goto L_0x002f
            int r4 = f(r10, r0)
            int r1 = r1 + r4
        L_0x002f:
            r4 = r1
            r1 = 10
            int r1 = r10.h(r1)
            boolean r5 = r10.g()
            if (r5 == 0) goto L_0x0045
            int r5 = r10.h(r3)
            if (r5 <= 0) goto L_0x0045
            r10.r(r0)
        L_0x0045:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x0055
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0058
        L_0x0055:
            r9 = 44100(0xac44, float:6.1797E-41)
        L_0x0058:
            int r10 = r10.h(r2)
            r5 = 0
            if (r9 != r8) goto L_0x0069
            r8 = 13
            if (r10 != r8) goto L_0x0069
            int[] r0 = f21148a
            r10 = r0[r10]
            r8 = r10
            goto L_0x0099
        L_0x0069:
            if (r9 != r6) goto L_0x0098
            int[] r6 = f21148a
            int r8 = r6.length
            if (r10 >= r8) goto L_0x0098
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L_0x008e
            r8 = 11
            if (r1 == r0) goto L_0x0089
            if (r1 == r3) goto L_0x008e
            if (r1 == r2) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            if (r10 == r3) goto L_0x0095
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x0089:
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x008e:
            if (r10 == r3) goto L_0x0095
            if (r10 != r6) goto L_0x0093
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
            p2.c$b r10 = new p2.c$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.d(k4.z):p2.c$b");
    }

    public static int e(byte[] bArr, int i10) {
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

    private static int f(z zVar, int i10) {
        int i11 = 0;
        while (true) {
            int h10 = i11 + zVar.h(i10);
            if (!zVar.g()) {
                return h10;
            }
            i11 = (h10 + 1) << i10;
        }
    }
}
