package k3;

import com.applovin.mediation.MaxReward;
import f3.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import k4.a0;
import k4.n0;
import k4.r;
import k4.z;
import r6.c;
import r6.e;
import s6.u;

/* compiled from: Id3Decoder */
public final class h extends f3.h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19649b = g.f35778a;

    /* renamed from: a  reason: collision with root package name */
    private final a f19650a;

    /* compiled from: Id3Decoder */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* compiled from: Id3Decoder */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f19651a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19652b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f19653c;

        public b(int i10, boolean z10, int i11) {
            this.f19651a = i10;
            this.f19652b = z10;
            this.f19653c = i11;
        }
    }

    public h() {
        this((a) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean A(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static int B(a0 a0Var, int i10) {
        byte[] e10 = a0Var.e();
        int f10 = a0Var.f();
        int i11 = f10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= f10 + i10) {
                return i10;
            }
            if ((e10[i11] & 255) == 255 && e10[i12] == 0) {
                System.arraycopy(e10, i11 + 2, e10, i12, (i10 - (i11 - f10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r10 & 128) != 0) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean C(k4.a0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.f()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x00af }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.p()     // Catch:{ all -> 0x00af }
            long r8 = r18.I()     // Catch:{ all -> 0x00af }
            int r10 = r18.M()     // Catch:{ all -> 0x00af }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.J()     // Catch:{ all -> 0x00af }
            int r8 = r18.J()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.T(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.T(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007b
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r4 = 0
            goto L_0x008b
        L_0x007b:
            if (r0 != r3) goto L_0x0089
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0083:
            r3 = 0
        L_0x0084:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0089:
            r3 = 0
            goto L_0x0079
        L_0x008b:
            if (r4 == 0) goto L_0x008f
            int r3 = r3 + 4
        L_0x008f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0098
            r1.T(r2)
            return r6
        L_0x0098:
            int r3 = r18.a()     // Catch:{ all -> 0x00af }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
            r1.T(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.U(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0008
        L_0x00ab:
            r1.T(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.T(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.h.C(k4.a0, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return n0.f19743f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    private static a f(a0 a0Var, int i10, int i11) {
        int i12;
        String str;
        int G = a0Var.G();
        Charset w10 = w(G);
        int i13 = i10 - 1;
        byte[] bArr = new byte[i13];
        a0Var.l(bArr, 0, i13);
        if (i11 == 2) {
            str = "image/" + c.e(new String(bArr, 0, 3, e.f29802b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i12 = 2;
        } else {
            i12 = z(bArr, 0);
            String e10 = c.e(new String(bArr, 0, i12, e.f29802b));
            if (e10.indexOf(47) == -1) {
                str = "image/" + e10;
            } else {
                str = e10;
            }
        }
        int i14 = i12 + 2;
        int y10 = y(bArr, i14, G);
        return new a(str, new String(bArr, i14, y10 - i14, w10), bArr[i12 + 1] & 255, d(bArr, y10 + v(G), i13));
    }

    private static b g(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        return new b(str, bArr);
    }

    private static c h(a0 a0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        a0 a0Var2 = a0Var;
        int f10 = a0Var.f();
        int z11 = z(a0Var.e(), f10);
        String str = new String(a0Var.e(), f10, z11 - f10, e.f29802b);
        a0Var.T(z11 + 1);
        int p10 = a0Var.p();
        int p11 = a0Var.p();
        long I = a0Var.I();
        long j10 = I == 4294967295L ? -1 : I;
        long I2 = a0Var.I();
        long j11 = I2 == 4294967295L ? -1 : I2;
        ArrayList arrayList = new ArrayList();
        int i13 = f10 + i10;
        while (a0Var.f() < i13) {
            i k10 = k(i11, a0Var, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, p10, p11, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(a0 a0Var, int i10, int i11, boolean z10, int i12, a aVar) {
        a0 a0Var2 = a0Var;
        int f10 = a0Var.f();
        int z11 = z(a0Var.e(), f10);
        String str = new String(a0Var.e(), f10, z11 - f10, e.f29802b);
        a0Var2.T(z11 + 1);
        int G = a0Var.G();
        boolean z12 = (G & 2) != 0;
        boolean z13 = (G & 1) != 0;
        int G2 = a0Var.G();
        String[] strArr = new String[G2];
        for (int i13 = 0; i13 < G2; i13++) {
            int f11 = a0Var.f();
            int z14 = z(a0Var.e(), f11);
            strArr[i13] = new String(a0Var.e(), f11, z14 - f11, e.f29802b);
            a0Var2.T(z14 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = f10 + i10;
        while (a0Var.f() < i14) {
            i k10 = k(i11, a0Var2, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z12, z13, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(a0 a0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int G = a0Var.G();
        Charset w10 = w(G);
        byte[] bArr = new byte[3];
        a0Var.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        a0Var.l(bArr2, 0, i11);
        int y10 = y(bArr2, 0, G);
        String str2 = new String(bArr2, 0, y10, w10);
        int v10 = y10 + v(G);
        return new e(str, str2, p(bArr2, v10, y(bArr2, v10, G), w10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static k3.i k(int r19, k4.a0 r20, boolean r21, int r22, k3.h.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.G()
            int r9 = r20.G()
            int r10 = r20.G()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.G()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.K()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.K()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.J()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.M()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.g()
            r7.T(r0)
            return r16
        L_0x0067:
            int r1 = r20.f()
            int r5 = r1 + r15
            int r1 = r20.g()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            k4.r.i(r4, r0)
            int r0 = r20.g()
            r7.T(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.T(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x021c
            if (r4 == 0) goto L_0x00f8
            goto L_0x021c
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.U(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.U(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = B(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            k3.m r1 = s(r7, r15)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = x(r0, r8, r9, r10, r13)     // Catch:{ all -> 0x012e }
            k3.m r1 = q(r7, r15, r1)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x0218
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            k3.n r1 = u(r7, r15)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = x(r0, r8, r9, r10, r13)     // Catch:{ all -> 0x012e }
            k3.n r1 = t(r7, r15, r1)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            k3.l r1 = o(r7, r15)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            k3.f r1 = l(r7, r15)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            k3.a r1 = f(r7, r15, r0)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            k3.e r1 = j(r7, r15)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            k3.c r1 = h(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            k3.d r1 = i(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            k3.k r1 = n(r7, r15)     // Catch:{ all -> 0x012e }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = x(r0, r8, r9, r10, r13)     // Catch:{ all -> 0x012e }
            k3.b r1 = g(r7, r15, r1)     // Catch:{ all -> 0x012e }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x012e }
            r2.<init>()     // Catch:{ all -> 0x012e }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ all -> 0x012e }
            java.lang.String r0 = x(r0, r8, r9, r10, r13)     // Catch:{ all -> 0x012e }
            r2.append(r0)     // Catch:{ all -> 0x012e }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ all -> 0x012e }
            r2.append(r15)     // Catch:{ all -> 0x012e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x012e }
            k4.r.i(r12, r0)     // Catch:{ all -> 0x012e }
        L_0x0214:
            r7.T(r14)
            return r1
        L_0x0218:
            r7.T(r14)
            throw r0
        L_0x021c:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            k4.r.i(r12, r0)
            r7.T(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.h.k(int, k4.a0, boolean, int, k3.h$a):k3.i");
    }

    private static f l(a0 a0Var, int i10) {
        int G = a0Var.G();
        Charset w10 = w(G);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int z10 = z(bArr, 0);
        String str = new String(bArr, 0, z10, e.f29802b);
        int i12 = z10 + 1;
        int y10 = y(bArr, i12, G);
        String p10 = p(bArr, i12, y10, w10);
        int v10 = y10 + v(G);
        int y11 = y(bArr, v10, G);
        return new f(str, p10, p(bArr, v10, y11, w10), d(bArr, y11 + v(G), i11));
    }

    private static b m(a0 a0Var) {
        if (a0Var.a() < 10) {
            r.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int J = a0Var.J();
        boolean z10 = false;
        if (J != 4801587) {
            r.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", new Object[]{Integer.valueOf(J)}));
            return null;
        }
        int G = a0Var.G();
        a0Var.U(1);
        int G2 = a0Var.G();
        int F = a0Var.F();
        if (G == 2) {
            if ((G2 & 64) != 0) {
                r.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (G == 3) {
            if ((G2 & 64) != 0) {
                int p10 = a0Var.p();
                a0Var.U(p10);
                F -= p10 + 4;
            }
        } else if (G == 4) {
            if ((G2 & 64) != 0) {
                int F2 = a0Var.F();
                a0Var.U(F2 - 4);
                F -= F2;
            }
            if ((G2 & 16) != 0) {
                F -= 10;
            }
        } else {
            r.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + G);
            return null;
        }
        if (G < 4 && (G2 & 128) != 0) {
            z10 = true;
        }
        return new b(G, z10, F);
    }

    private static k n(a0 a0Var, int i10) {
        int M = a0Var.M();
        int J = a0Var.J();
        int J2 = a0Var.J();
        int G = a0Var.G();
        int G2 = a0Var.G();
        z zVar = new z();
        zVar.m(a0Var);
        int i11 = ((i10 - 10) * 8) / (G + G2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = zVar.h(G);
            int h11 = zVar.h(G2);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new k(M, J, J2, iArr, iArr2);
    }

    private static l o(a0 a0Var, int i10) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        int z10 = z(bArr, 0);
        return new l(new String(bArr, 0, z10, e.f29802b), d(bArr, z10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? MaxReward.DEFAULT_LABEL : new String(bArr, i10, i11 - i10, charset);
    }

    private static m q(a0 a0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int G = a0Var.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        return new m(str, (String) null, r(bArr, G, 0));
    }

    private static u<String> r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return u.z(MaxReward.DEFAULT_LABEL);
        }
        u.a p10 = u.p();
        int y10 = y(bArr, i11, i10);
        while (i11 < y10) {
            p10.a(new String(bArr, i11, y10 - i11, w(i10)));
            i11 = v(i10) + y10;
            y10 = y(bArr, i11, i10);
        }
        u<String> k10 = p10.k();
        return k10.isEmpty() ? u.z(MaxReward.DEFAULT_LABEL) : k10;
    }

    private static m s(a0 a0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int G = a0Var.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int y10 = y(bArr, 0, G);
        return new m("TXXX", new String(bArr, 0, y10, w(G)), r(bArr, G, y10 + v(G)));
    }

    private static n t(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.l(bArr, 0, i10);
        return new n(str, (String) null, new String(bArr, 0, z(bArr, 0), e.f29802b));
    }

    private static n u(a0 a0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int G = a0Var.G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.l(bArr, 0, i11);
        int y10 = y(bArr, 0, G);
        String str = new String(bArr, 0, y10, w(G));
        int v10 = y10 + v(G);
        return new n("WXXX", str, p(bArr, v10, z(bArr, v10), e.f29802b));
    }

    private static int v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static Charset w(int i10) {
        if (i10 == 1) {
            return e.f29806f;
        }
        if (i10 == 2) {
            return e.f29804d;
        }
        if (i10 != 3) {
            return e.f29802b;
        }
        return e.f29803c;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int z10 = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return z10;
        }
        while (z10 < bArr.length - 1) {
            if ((z10 - i10) % 2 == 0 && bArr[z10 + 1] == 0) {
                return z10;
            }
            z10 = z(bArr, z10 + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    public f3.a b(f3.e eVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public f3.a e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        b m10 = m(a0Var);
        if (m10 == null) {
            return null;
        }
        int f10 = a0Var.f();
        int i11 = m10.f19651a == 2 ? 6 : 10;
        int b10 = m10.f19653c;
        if (m10.f19652b) {
            b10 = B(a0Var, m10.f19653c);
        }
        a0Var.S(f10 + b10);
        boolean z10 = false;
        if (!C(a0Var, m10.f19651a, i11, false)) {
            if (m10.f19651a != 4 || !C(a0Var, 4, i11, true)) {
                r.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m10.f19651a);
                return null;
            }
            z10 = true;
        }
        while (a0Var.a() >= i11) {
            i k10 = k(m10.f19651a, a0Var, z10, i11, this.f19650a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new f3.a((List<? extends a.b>) arrayList);
    }

    public h(a aVar) {
        this.f19650a = aVar;
    }
}
