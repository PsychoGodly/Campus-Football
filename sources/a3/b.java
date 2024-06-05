package a3;

import a3.a;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import f3.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.a0;
import k4.n0;
import k4.r;
import k4.v;
import n2.r1;
import n2.y2;
import r2.m;
import s2.o;
import s2.x;
import s6.u;

/* compiled from: AtomParsers */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f195a = n0.m0("OpusHead");

    /* compiled from: AtomParsers */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f196a;

        /* renamed from: b  reason: collision with root package name */
        public int f197b;

        /* renamed from: c  reason: collision with root package name */
        public int f198c;

        /* renamed from: d  reason: collision with root package name */
        public long f199d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f200e;

        /* renamed from: f  reason: collision with root package name */
        private final a0 f201f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f202g;

        /* renamed from: h  reason: collision with root package name */
        private int f203h;

        /* renamed from: i  reason: collision with root package name */
        private int f204i;

        public a(a0 a0Var, a0 a0Var2, boolean z10) throws y2 {
            this.f202g = a0Var;
            this.f201f = a0Var2;
            this.f200e = z10;
            a0Var2.T(12);
            this.f196a = a0Var2.K();
            a0Var.T(12);
            this.f204i = a0Var.K();
            o.a(a0Var.p() != 1 ? false : true, "first_chunk must be 1");
            this.f197b = -1;
        }

        public boolean a() {
            long j10;
            int i10 = this.f197b + 1;
            this.f197b = i10;
            if (i10 == this.f196a) {
                return false;
            }
            if (this.f200e) {
                j10 = this.f201f.L();
            } else {
                j10 = this.f201f.I();
            }
            this.f199d = j10;
            if (this.f197b == this.f203h) {
                this.f198c = this.f202g.K();
                this.f202g.U(4);
                int i11 = this.f204i - 1;
                this.f204i = i11;
                this.f203h = i11 > 0 ? this.f202g.K() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: a3.b$b  reason: collision with other inner class name */
    /* compiled from: AtomParsers */
    private static final class C0003b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f205a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f206b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f207c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f208d;

        public C0003b(String str, byte[] bArr, long j10, long j11) {
            this.f205a = str;
            this.f206b = bArr;
            this.f207c = j10;
            this.f208d = j11;
        }
    }

    /* compiled from: AtomParsers */
    private interface c {
        int a();

        int b();

        int c();
    }

    /* compiled from: AtomParsers */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final p[] f209a;

        /* renamed from: b  reason: collision with root package name */
        public r1 f210b;

        /* renamed from: c  reason: collision with root package name */
        public int f211c;

        /* renamed from: d  reason: collision with root package name */
        public int f212d = 0;

        public d(int i10) {
            this.f209a = new p[i10];
        }
    }

    /* compiled from: AtomParsers */
    static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final int f213a;

        /* renamed from: b  reason: collision with root package name */
        private final int f214b;

        /* renamed from: c  reason: collision with root package name */
        private final a0 f215c;

        public e(a.b bVar, r1 r1Var) {
            a0 a0Var = bVar.f194b;
            this.f215c = a0Var;
            a0Var.T(12);
            int K = a0Var.K();
            if ("audio/raw".equals(r1Var.f20654m)) {
                int d02 = n0.d0(r1Var.B, r1Var.f20667z);
                if (K == 0 || K % d02 != 0) {
                    r.i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + d02 + ", stsz sample size: " + K);
                    K = d02;
                }
            }
            this.f213a = K == 0 ? -1 : K;
            this.f214b = a0Var.K();
        }

        public int a() {
            return this.f213a;
        }

        public int b() {
            return this.f214b;
        }

        public int c() {
            int i10 = this.f213a;
            return i10 == -1 ? this.f215c.K() : i10;
        }
    }

    /* compiled from: AtomParsers */
    static final class f implements c {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f216a;

        /* renamed from: b  reason: collision with root package name */
        private final int f217b;

        /* renamed from: c  reason: collision with root package name */
        private final int f218c;

        /* renamed from: d  reason: collision with root package name */
        private int f219d;

        /* renamed from: e  reason: collision with root package name */
        private int f220e;

        public f(a.b bVar) {
            a0 a0Var = bVar.f194b;
            this.f216a = a0Var;
            a0Var.T(12);
            this.f218c = a0Var.K() & 255;
            this.f217b = a0Var.K();
        }

        public int a() {
            return -1;
        }

        public int b() {
            return this.f217b;
        }

        public int c() {
            int i10 = this.f218c;
            if (i10 == 8) {
                return this.f216a.G();
            }
            if (i10 == 16) {
                return this.f216a.M();
            }
            int i11 = this.f219d;
            this.f219d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f220e & 15;
            }
            int G = this.f216a.G();
            this.f220e = G;
            return (G & 240) >> 4;
        }
    }

    /* compiled from: AtomParsers */
    private static final class g {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f221a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f222b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f223c;

        public g(int i10, long j10, int i11) {
            this.f221a = i10;
            this.f222b = j10;
            this.f223c = i11;
        }
    }

    public static List<r> A(a.C0002a aVar, x xVar, long j10, m mVar, boolean z10, boolean z11, r6.g<o, o> gVar) throws y2 {
        a.C0002a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar2.f193d.size(); i10++) {
            a.C0002a aVar3 = aVar2.f193d.get(i10);
            if (aVar3.f190a != 1953653099) {
                x xVar2 = xVar;
                r6.g<o, o> gVar2 = gVar;
            } else {
                o apply = gVar.apply(z(aVar3, (a.b) k4.a.e(aVar.g(1836476516)), j10, mVar, z10, z11));
                if (apply == null) {
                    x xVar3 = xVar;
                } else {
                    x xVar4 = xVar;
                    arrayList.add(v(apply, (a.C0002a) k4.a.e(((a.C0002a) k4.a.e(((a.C0002a) k4.a.e(aVar3.f(1835297121))).f(1835626086))).f(1937007212)), xVar));
                }
            }
        }
        return arrayList;
    }

    public static Pair<f3.a, f3.a> B(a.b bVar) {
        a0 a0Var = bVar.f194b;
        a0Var.T(8);
        f3.a aVar = null;
        f3.a aVar2 = null;
        while (a0Var.a() >= 8) {
            int f10 = a0Var.f();
            int p10 = a0Var.p();
            int p11 = a0Var.p();
            if (p11 == 1835365473) {
                a0Var.T(f10);
                aVar = C(a0Var, f10 + p10);
            } else if (p11 == 1936553057) {
                a0Var.T(f10);
                aVar2 = u(a0Var, f10 + p10);
            }
            a0Var.T(f10 + p10);
        }
        return Pair.create(aVar, aVar2);
    }

    private static f3.a C(a0 a0Var, int i10) {
        a0Var.U(8);
        e(a0Var);
        while (a0Var.f() < i10) {
            int f10 = a0Var.f();
            int p10 = a0Var.p();
            if (a0Var.p() == 1768715124) {
                a0Var.T(f10);
                return l(a0Var, f10 + p10);
            }
            a0Var.T(f10 + p10);
        }
        return null;
    }

    private static void D(a0 a0Var, int i10, int i11, int i12, int i13, int i14, m mVar, d dVar, int i15) throws y2 {
        m mVar2;
        int i16;
        int i17;
        int i18;
        float f10;
        List<byte[]> list;
        int i19;
        int i20;
        String str;
        a0 a0Var2 = a0Var;
        int i21 = i11;
        int i22 = i12;
        m mVar3 = mVar;
        d dVar2 = dVar;
        a0Var2.T(i21 + 8 + 8);
        a0Var2.U(16);
        int M = a0Var.M();
        int M2 = a0Var.M();
        a0Var2.U(50);
        int f11 = a0Var.f();
        int i23 = i10;
        if (i23 == 1701733238) {
            Pair<Integer, p> s10 = s(a0Var2, i21, i22);
            if (s10 != null) {
                i23 = ((Integer) s10.first).intValue();
                if (mVar3 == null) {
                    mVar3 = null;
                } else {
                    mVar3 = mVar3.c(((p) s10.second).f334b);
                }
                dVar2.f209a[i15] = (p) s10.second;
            }
            a0Var2.T(f11);
        }
        String str2 = "video/3gpp";
        String str3 = i23 == 1831958048 ? "video/mpeg" : i23 == 1211250227 ? str2 : null;
        float f12 = 1.0f;
        int i24 = -1;
        String str4 = null;
        List<byte[]> list2 = null;
        byte[] bArr = null;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        ByteBuffer byteBuffer = null;
        C0003b bVar = null;
        boolean z10 = false;
        while (true) {
            if (f11 - i21 >= i22) {
                mVar2 = mVar3;
                break;
            }
            a0Var2.T(f11);
            int f13 = a0Var.f();
            String str5 = str2;
            int p10 = a0Var.p();
            if (p10 == 0) {
                mVar2 = mVar3;
                if (a0Var.f() - i21 == i22) {
                    break;
                }
            } else {
                mVar2 = mVar3;
            }
            o.a(p10 > 0, "childAtomSize must be positive");
            int p11 = a0Var.p();
            if (p11 == 1635148611) {
                o.a(str3 == null, (String) null);
                a0Var2.T(f13 + 8);
                l4.a b10 = l4.a.b(a0Var);
                list2 = b10.f19893a;
                dVar2.f211c = b10.f19894b;
                if (!z10) {
                    f12 = b10.f19897e;
                }
                str4 = b10.f19898f;
                str = MimeTypes.VIDEO_H264;
            } else if (p11 == 1752589123) {
                o.a(str3 == null, (String) null);
                a0Var2.T(f13 + 8);
                l4.f a10 = l4.f.a(a0Var);
                list2 = a10.f19927a;
                dVar2.f211c = a10.f19928b;
                if (!z10) {
                    f12 = a10.f19931e;
                }
                str4 = a10.f19935i;
                i24 = a10.f19932f;
                int i28 = a10.f19933g;
                i27 = a10.f19934h;
                i26 = i28;
                i16 = M;
                i17 = M2;
                str3 = MimeTypes.VIDEO_H265;
                i18 = i23;
                f11 += p10;
                i21 = i11;
                i22 = i12;
                dVar2 = dVar;
                str2 = str5;
                mVar3 = mVar2;
                i23 = i18;
                M2 = i17;
                M = i16;
            } else {
                if (p11 == 1685480259 || p11 == 1685485123) {
                    i16 = M;
                    i17 = M2;
                    i18 = i23;
                    f10 = f12;
                    list = list2;
                    i20 = i26;
                    i19 = i27;
                    l4.d a11 = l4.d.a(a0Var);
                    if (a11 != null) {
                        str4 = a11.f19912c;
                        str3 = "video/dolby-vision";
                    }
                } else if (p11 == 1987076931) {
                    o.a(str3 == null, (String) null);
                    str = i23 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    a0Var2.T(f13 + 12);
                    a0Var2.U(2);
                    boolean z11 = (a0Var.G() & 1) != 0;
                    int G = a0Var.G();
                    int G2 = a0Var.G();
                    i24 = l4.c.b(G);
                    i26 = z11 ? 1 : 2;
                    i27 = l4.c.c(G2);
                } else if (p11 == 1635135811) {
                    o.a(str3 == null, (String) null);
                    str = MimeTypes.VIDEO_AV1;
                } else if (p11 == 1668050025) {
                    ByteBuffer a12 = byteBuffer == null ? a() : byteBuffer;
                    a12.position(21);
                    a12.putShort(a0Var.C());
                    a12.putShort(a0Var.C());
                    byteBuffer = a12;
                    i16 = M;
                    i17 = M2;
                    i18 = i23;
                    f11 += p10;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i23 = i18;
                    M2 = i17;
                    M = i16;
                } else if (p11 == 1835295606) {
                    ByteBuffer a13 = byteBuffer == null ? a() : byteBuffer;
                    short C = a0Var.C();
                    short C2 = a0Var.C();
                    short C3 = a0Var.C();
                    i18 = i23;
                    short C4 = a0Var.C();
                    short C5 = a0Var.C();
                    List<byte[]> list3 = list2;
                    short C6 = a0Var.C();
                    float f14 = f12;
                    short C7 = a0Var.C();
                    i17 = M2;
                    short C8 = a0Var.C();
                    long I = a0Var.I();
                    long I2 = a0Var.I();
                    i16 = M;
                    a13.position(1);
                    a13.putShort(C5);
                    a13.putShort(C6);
                    a13.putShort(C);
                    a13.putShort(C2);
                    a13.putShort(C3);
                    a13.putShort(C4);
                    a13.putShort(C7);
                    a13.putShort(C8);
                    a13.putShort((short) ((int) (I / UnityAdsConstants.Timeout.INIT_TIMEOUT_MS)));
                    a13.putShort((short) ((int) (I2 / UnityAdsConstants.Timeout.INIT_TIMEOUT_MS)));
                    byteBuffer = a13;
                    list2 = list3;
                    f12 = f14;
                    f11 += p10;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i23 = i18;
                    M2 = i17;
                    M = i16;
                } else {
                    i16 = M;
                    i17 = M2;
                    i18 = i23;
                    f10 = f12;
                    list = list2;
                    if (p11 == 1681012275) {
                        o.a(str3 == null, (String) null);
                        str3 = str5;
                    } else if (p11 == 1702061171) {
                        o.a(str3 == null, (String) null);
                        bVar = i(a0Var2, f13);
                        String a14 = bVar.f205a;
                        byte[] b11 = bVar.f206b;
                        list2 = b11 != null ? u.z(b11) : list;
                        str3 = a14;
                        f12 = f10;
                        f11 += p10;
                        i21 = i11;
                        i22 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i23 = i18;
                        M2 = i17;
                        M = i16;
                    } else if (p11 == 1885434736) {
                        f12 = q(a0Var2, f13);
                        list2 = list;
                        z10 = true;
                        f11 += p10;
                        i21 = i11;
                        i22 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i23 = i18;
                        M2 = i17;
                        M = i16;
                    } else if (p11 == 1937126244) {
                        bArr = r(a0Var2, f13, p10);
                    } else if (p11 == 1936995172) {
                        int G3 = a0Var.G();
                        a0Var2.U(3);
                        if (G3 == 0) {
                            int G4 = a0Var.G();
                            if (G4 == 0) {
                                i25 = 0;
                            } else if (G4 == 1) {
                                i25 = 1;
                            } else if (G4 == 2) {
                                i25 = 2;
                            } else if (G4 == 3) {
                                i25 = 3;
                            }
                        }
                    } else if (p11 == 1668246642 && i24 == -1) {
                        i20 = i26;
                        i19 = i27;
                        if (i20 == -1 && i19 == -1) {
                            int p12 = a0Var.p();
                            if (p12 == 1852009592 || p12 == 1852009571) {
                                int M3 = a0Var.M();
                                int M4 = a0Var.M();
                                a0Var2.U(2);
                                boolean z12 = p10 == 19 && (a0Var.G() & 128) != 0;
                                i24 = l4.c.b(M3);
                                i26 = z12 ? 1 : 2;
                                i27 = l4.c.c(M4);
                            } else {
                                r.i("AtomParsers", "Unsupported color type: " + a.a(p12));
                            }
                        }
                    } else {
                        i20 = i26;
                        i19 = i27;
                    }
                    list2 = list;
                    f12 = f10;
                    f11 += p10;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i23 = i18;
                    M2 = i17;
                    M = i16;
                }
                i26 = i20;
                i27 = i19;
                list2 = list;
                f12 = f10;
                f11 += p10;
                i21 = i11;
                i22 = i12;
                dVar2 = dVar;
                str2 = str5;
                mVar3 = mVar2;
                i23 = i18;
                M2 = i17;
                M = i16;
            }
            str3 = str;
            i16 = M;
            i17 = M2;
            i18 = i23;
            f11 += p10;
            i21 = i11;
            i22 = i12;
            dVar2 = dVar;
            str2 = str5;
            mVar3 = mVar2;
            i23 = i18;
            M2 = i17;
            M = i16;
        }
        int i29 = M;
        int i30 = M2;
        float f15 = f12;
        List<byte[]> list4 = list2;
        int i31 = i26;
        int i32 = i27;
        if (str3 != null) {
            r1.b O = new r1.b().T(i13).g0(str3).K(str4).n0(i29).S(i30).c0(f15).f0(i14).d0(bArr).j0(i25).V(list4).O(mVar2);
            if (!(i24 == -1 && i31 == -1 && i32 == -1 && byteBuffer == null)) {
                O.L(new l4.c(i24, i31, i32, byteBuffer != null ? byteBuffer.array() : null));
            }
            if (bVar != null) {
                O.I(v6.e.k(bVar.f207c)).b0(v6.e.k(bVar.f208d));
            }
            dVar.f210b = O.G();
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        int q10 = n0.q(4, 0, length);
        int q11 = n0.q(jArr.length - 4, 0, length);
        if (jArr[0] > j11 || j11 >= jArr[q10] || jArr[q11] >= j12 || j12 > j10) {
            return false;
        }
        return true;
    }

    private static int c(a0 a0Var, int i10, int i11, int i12) throws y2 {
        int f10 = a0Var.f();
        o.a(f10 >= i11, (String) null);
        while (f10 - i11 < i12) {
            a0Var.T(f10);
            int p10 = a0Var.p();
            o.a(p10 > 0, "childAtomSize must be positive");
            if (a0Var.p() == i10) {
                return f10;
            }
            f10 += p10;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(a0 a0Var) {
        int f10 = a0Var.f();
        a0Var.U(4);
        if (a0Var.p() != 1751411826) {
            f10 += 4;
        }
        a0Var.T(f10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x031b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:167:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void f(k4.a0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, r2.m r29, a3.b.d r30, int r31) throws n2.y2 {
        /*
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r29
            r6 = r30
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.T(r7)
            r7 = 6
            if (r28 == 0) goto L_0x0021
            int r8 = r22.M()
            r0.U(r7)
            goto L_0x0025
        L_0x0021:
            r0.U(r8)
            r8 = 0
        L_0x0025:
            r10 = 16
            r11 = 4
            r12 = 2
            r13 = 1
            if (r8 == 0) goto L_0x0049
            if (r8 != r13) goto L_0x002f
            goto L_0x0049
        L_0x002f:
            if (r8 != r12) goto L_0x0048
            r0.U(r10)
            double r7 = r22.o()
            long r7 = java.lang.Math.round(r7)
            int r8 = (int) r7
            int r7 = r22.K()
            r10 = 20
            r0.U(r10)
            r15 = 0
            goto L_0x0067
        L_0x0048:
            return
        L_0x0049:
            int r14 = r22.M()
            r0.U(r7)
            int r7 = r22.H()
            int r15 = r22.f()
            int r15 = r15 - r11
            r0.T(r15)
            int r15 = r22.p()
            if (r8 != r13) goto L_0x0065
            r0.U(r10)
        L_0x0065:
            r8 = r7
            r7 = r14
        L_0x0067:
            int r10 = r22.f()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r12 = r23
            if (r12 != r14) goto L_0x0099
            android.util.Pair r14 = s(r0, r1, r2)
            if (r14 == 0) goto L_0x0096
            java.lang.Object r12 = r14.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r5 != 0) goto L_0x0084
            r5 = 0
            goto L_0x008e
        L_0x0084:
            java.lang.Object r13 = r14.second
            a3.p r13 = (a3.p) r13
            java.lang.String r13 = r13.f334b
            r2.m r5 = r5.c(r13)
        L_0x008e:
            a3.p[] r13 = r6.f209a
            java.lang.Object r14 = r14.second
            a3.p r14 = (a3.p) r14
            r13[r31] = r14
        L_0x0096:
            r0.T(r10)
        L_0x0099:
            r13 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r19 = "audio/raw"
            if (r12 != r13) goto L_0x00a8
            java.lang.String r19 = "audio/ac3"
        L_0x00a5:
            r12 = -1
            goto L_0x015a
        L_0x00a8:
            r13 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r12 != r13) goto L_0x00b0
            java.lang.String r19 = "audio/eac3"
            goto L_0x00a5
        L_0x00b0:
            r13 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r12 != r13) goto L_0x00b8
            java.lang.String r19 = "audio/ac4"
            goto L_0x00a5
        L_0x00b8:
            r13 = 1685353315(0x64747363, float:1.803728E22)
            if (r12 != r13) goto L_0x00c0
            java.lang.String r19 = "audio/vnd.dts"
            goto L_0x00a5
        L_0x00c0:
            r13 = 1685353320(0x64747368, float:1.8037286E22)
            if (r12 == r13) goto L_0x0156
            r13 = 1685353324(0x6474736c, float:1.803729E22)
            if (r12 != r13) goto L_0x00cc
            goto L_0x0156
        L_0x00cc:
            r13 = 1685353317(0x64747365, float:1.8037282E22)
            if (r12 != r13) goto L_0x00d4
            java.lang.String r19 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00a5
        L_0x00d4:
            r13 = 1685353336(0x64747378, float:1.8037304E22)
            if (r12 != r13) goto L_0x00dc
            java.lang.String r19 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00a5
        L_0x00dc:
            r13 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r12 != r13) goto L_0x00e4
            java.lang.String r19 = "audio/3gpp"
            goto L_0x00a5
        L_0x00e4:
            r13 = 1935767394(0x73617762, float:1.7863284E31)
            if (r12 != r13) goto L_0x00ec
            java.lang.String r19 = "audio/amr-wb"
            goto L_0x00a5
        L_0x00ec:
            r13 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r12 == r13) goto L_0x0154
            r13 = 1936684916(0x736f7774, float:1.89725E31)
            if (r12 != r13) goto L_0x00f7
            goto L_0x0154
        L_0x00f7:
            r13 = 1953984371(0x74776f73, float:7.841539E31)
            if (r12 != r13) goto L_0x00ff
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x015a
        L_0x00ff:
            r13 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r12 == r13) goto L_0x0150
            r13 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r12 != r13) goto L_0x010a
            goto L_0x0150
        L_0x010a:
            r13 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r12 != r13) goto L_0x0112
            java.lang.String r19 = "audio/mha1"
            goto L_0x00a5
        L_0x0112:
            r13 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r12 != r13) goto L_0x011a
            java.lang.String r19 = "audio/mhm1"
            goto L_0x00a5
        L_0x011a:
            if (r12 != r14) goto L_0x011f
            java.lang.String r19 = "audio/alac"
            goto L_0x00a5
        L_0x011f:
            r13 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r12 != r13) goto L_0x0128
            java.lang.String r19 = "audio/g711-alaw"
            goto L_0x00a5
        L_0x0128:
            r13 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r12 != r13) goto L_0x0131
            java.lang.String r19 = "audio/g711-mlaw"
            goto L_0x00a5
        L_0x0131:
            r13 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r12 != r13) goto L_0x013a
            java.lang.String r19 = "audio/opus"
            goto L_0x00a5
        L_0x013a:
            r13 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r12 != r13) goto L_0x0143
            java.lang.String r19 = "audio/flac"
            goto L_0x00a5
        L_0x0143:
            r13 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r12 != r13) goto L_0x014c
            java.lang.String r19 = "audio/true-hd"
            goto L_0x00a5
        L_0x014c:
            r12 = -1
            r19 = 0
            goto L_0x015a
        L_0x0150:
            java.lang.String r19 = "audio/mpeg"
            goto L_0x00a5
        L_0x0154:
            r12 = 2
            goto L_0x015a
        L_0x0156:
            java.lang.String r19 = "audio/vnd.dts.hd"
            goto L_0x00a5
        L_0x015a:
            r13 = r19
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0162:
            int r11 = r10 - r1
            if (r11 >= r2) goto L_0x0317
            r0.T(r10)
            int r11 = r22.p()
            if (r11 <= 0) goto L_0x0171
            r14 = 1
            goto L_0x0172
        L_0x0171:
            r14 = 0
        L_0x0172:
            java.lang.String r9 = "childAtomSize must be positive"
            s2.o.a(r14, r9)
            int r9 = r22.p()
            r14 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r9 != r14) goto L_0x019b
            int r9 = r11 + -13
            byte[] r14 = new byte[r9]
            int r1 = r10 + 13
            r0.T(r1)
            r1 = 0
            r0.l(r14, r1, r9)
            s6.u r21 = s6.u.z(r14)
        L_0x0191:
            r9 = -1
            r14 = 1
            r16 = 4
            r17 = 2
        L_0x0197:
            r18 = 0
            goto L_0x030d
        L_0x019b:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r1) goto L_0x02d2
            if (r28 == 0) goto L_0x01a9
            r14 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r14) goto L_0x01a9
            goto L_0x02d2
        L_0x01a9:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r1) goto L_0x01c8
            int r1 = r10 + 8
            r0.T(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            n2.r1 r1 = p2.b.d(r0, r1, r4, r5)
            r6.f210b = r1
        L_0x01bd:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = 0
            r14 = 1
            r16 = 4
            r17 = 2
            goto L_0x02cf
        L_0x01c8:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r1) goto L_0x01dd
            int r1 = r10 + 8
            r0.T(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            n2.r1 r1 = p2.b.h(r0, r1, r4, r5)
            r6.f210b = r1
            goto L_0x01bd
        L_0x01dd:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r1) goto L_0x01f2
            int r1 = r10 + 8
            r0.T(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            n2.r1 r1 = p2.c.b(r0, r1, r4, r5)
            r6.f210b = r1
            goto L_0x01bd
        L_0x01f2:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r9 != r1) goto L_0x0213
            if (r15 <= 0) goto L_0x01fc
            r8 = r15
            r7 = 2
            goto L_0x0191
        L_0x01fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r14 = 0
            n2.y2 r0 = n2.y2.a(r0, r14)
            throw r0
        L_0x0213:
            r14 = 0
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 == r1) goto L_0x02a3
            r1 = 1969517683(0x75647473, float:2.8960097E32)
            if (r9 != r1) goto L_0x0220
            goto L_0x02a3
        L_0x0220:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r1) goto L_0x023e
            int r1 = r11 + -8
            byte[] r9 = f195a
            int r14 = r9.length
            int r14 = r14 + r1
            byte[] r14 = java.util.Arrays.copyOf(r9, r14)
            int r2 = r10 + 8
            r0.T(r2)
            int r2 = r9.length
            r0.l(r14, r2, r1)
            java.util.List r21 = p2.i0.a(r14)
            goto L_0x0191
        L_0x023e:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L_0x0270
            int r1 = r11 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r9 = 102(0x66, float:1.43E-43)
            r14 = 0
            r2[r14] = r9
            r9 = 76
            r14 = 1
            r2[r14] = r9
            r9 = 97
            r17 = 2
            r2[r17] = r9
            r9 = 3
            r18 = 67
            r2[r9] = r18
            int r9 = r10 + 12
            r0.T(r9)
            r9 = 4
            r0.l(r2, r9, r1)
            s6.u r21 = s6.u.z(r2)
            r9 = -1
            r16 = 4
            goto L_0x0197
        L_0x0270:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 1
            r16 = 4
            r17 = 2
            if (r9 != r2) goto L_0x02a1
            int r1 = r11 + -12
            byte[] r7 = new byte[r1]
            int r8 = r10 + 12
            r0.T(r8)
            r9 = 0
            r0.l(r7, r9, r1)
            android.util.Pair r1 = k4.e.g(r7)
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            s6.u r21 = s6.u.z(r7)
            r7 = r1
            goto L_0x02cf
        L_0x02a1:
            r9 = 0
            goto L_0x02cf
        L_0x02a3:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = 0
            r14 = 1
            r16 = 4
            r17 = 2
            n2.r1$b r1 = new n2.r1$b
            r1.<init>()
            n2.r1$b r1 = r1.T(r3)
            n2.r1$b r1 = r1.g0(r13)
            n2.r1$b r1 = r1.J(r7)
            n2.r1$b r1 = r1.h0(r8)
            n2.r1$b r1 = r1.O(r5)
            n2.r1$b r1 = r1.X(r4)
            n2.r1 r1 = r1.G()
            r6.f210b = r1
        L_0x02cf:
            r9 = -1
            goto L_0x0197
        L_0x02d2:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 1
            r16 = 4
            r17 = 2
            r18 = 0
            if (r9 != r1) goto L_0x02e0
            r1 = r10
            goto L_0x02e4
        L_0x02e0:
            int r1 = c(r0, r1, r10, r11)
        L_0x02e4:
            r9 = -1
            if (r1 == r9) goto L_0x030d
            a3.b$b r19 = i(r0, r1)
            java.lang.String r13 = r19.f205a
            byte[] r1 = r19.f206b
            if (r1 == 0) goto L_0x030d
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x0309
            p2.a$b r2 = p2.a.f(r1)
            int r8 = r2.f21130a
            int r7 = r2.f21131b
            java.lang.String r2 = r2.f21132c
            r20 = r2
        L_0x0309:
            s6.u r21 = s6.u.z(r1)
        L_0x030d:
            int r10 = r10 + r11
            r1 = r24
            r2 = r25
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0162
        L_0x0317:
            n2.r1 r0 = r6.f210b
            if (r0 != 0) goto L_0x0369
            if (r13 == 0) goto L_0x0369
            n2.r1$b r0 = new n2.r1$b
            r0.<init>()
            n2.r1$b r0 = r0.T(r3)
            n2.r1$b r0 = r0.g0(r13)
            r1 = r20
            n2.r1$b r0 = r0.K(r1)
            n2.r1$b r0 = r0.J(r7)
            n2.r1$b r0 = r0.h0(r8)
            n2.r1$b r0 = r0.a0(r12)
            r1 = r21
            n2.r1$b r0 = r0.V(r1)
            n2.r1$b r0 = r0.O(r5)
            n2.r1$b r0 = r0.X(r4)
            if (r19 == 0) goto L_0x0363
            long r1 = r19.f207c
            int r1 = v6.e.k(r1)
            n2.r1$b r1 = r0.I(r1)
            long r2 = r19.f208d
            int r2 = v6.e.k(r2)
            r1.b0(r2)
        L_0x0363:
            n2.r1 r0 = r0.G()
            r6.f210b = r0
        L_0x0369:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b.f(k4.a0, int, int, int, int, java.lang.String, boolean, r2.m, a3.b$d, int):void");
    }

    static Pair<Integer, p> g(a0 a0Var, int i10, int i11) throws y2 {
        int i12 = i10 + 8;
        boolean z10 = false;
        String str = null;
        Integer num = null;
        int i13 = -1;
        int i14 = 0;
        while (i12 - i10 < i11) {
            a0Var.T(i12);
            int p10 = a0Var.p();
            int p11 = a0Var.p();
            if (p11 == 1718775137) {
                num = Integer.valueOf(a0Var.p());
            } else if (p11 == 1935894637) {
                a0Var.U(4);
                str = a0Var.D(4);
            } else if (p11 == 1935894633) {
                i13 = i12;
                i14 = p10;
            }
            i12 += p10;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        o.a(num != null, "frma atom is mandatory");
        o.a(i13 != -1, "schi atom is mandatory");
        p t10 = t(a0Var, i13, i14, str);
        if (t10 != null) {
            z10 = true;
        }
        o.a(z10, "tenc atom is mandatory");
        return Pair.create(num, (p) n0.j(t10));
    }

    private static Pair<long[], long[]> h(a.C0002a aVar) {
        a.b g10 = aVar.g(1701606260);
        if (g10 == null) {
            return null;
        }
        a0 a0Var = g10.f194b;
        a0Var.T(8);
        int c10 = a.c(a0Var.p());
        int K = a0Var.K();
        long[] jArr = new long[K];
        long[] jArr2 = new long[K];
        int i10 = 0;
        while (i10 < K) {
            jArr[i10] = c10 == 1 ? a0Var.L() : a0Var.I();
            jArr2[i10] = c10 == 1 ? a0Var.z() : (long) a0Var.p();
            if (a0Var.C() == 1) {
                a0Var.U(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static C0003b i(a0 a0Var, int i10) {
        a0Var.T(i10 + 8 + 4);
        a0Var.U(1);
        j(a0Var);
        a0Var.U(2);
        int G = a0Var.G();
        if ((G & 128) != 0) {
            a0Var.U(2);
        }
        if ((G & 64) != 0) {
            a0Var.U(a0Var.G());
        }
        if ((G & 32) != 0) {
            a0Var.U(2);
        }
        a0Var.U(1);
        j(a0Var);
        String h10 = v.h(a0Var.G());
        if ("audio/mpeg".equals(h10) || "audio/vnd.dts".equals(h10) || "audio/vnd.dts.hd".equals(h10)) {
            return new C0003b(h10, (byte[]) null, -1, -1);
        }
        a0Var.U(4);
        long I = a0Var.I();
        long I2 = a0Var.I();
        a0Var.U(1);
        int j10 = j(a0Var);
        byte[] bArr = new byte[j10];
        a0Var.l(bArr, 0, j10);
        long j11 = -1;
        long j12 = I2 > 0 ? I2 : -1;
        if (I > 0) {
            j11 = I;
        }
        return new C0003b(h10, bArr, j12, j11);
    }

    private static int j(a0 a0Var) {
        int G = a0Var.G();
        int i10 = G & 127;
        while ((G & 128) == 128) {
            G = a0Var.G();
            i10 = (i10 << 7) | (G & 127);
        }
        return i10;
    }

    private static int k(a0 a0Var) {
        a0Var.T(16);
        return a0Var.p();
    }

    private static f3.a l(a0 a0Var, int i10) {
        a0Var.U(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.f() < i10) {
            a.b c10 = h.c(a0Var);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f3.a((List<? extends a.b>) arrayList);
    }

    private static Pair<Long, String> m(a0 a0Var) {
        int i10 = 8;
        a0Var.T(8);
        int c10 = a.c(a0Var.p());
        a0Var.U(c10 == 0 ? 8 : 16);
        long I = a0Var.I();
        if (c10 == 0) {
            i10 = 4;
        }
        a0Var.U(i10);
        int M = a0Var.M();
        return Pair.create(Long.valueOf(I), MaxReward.DEFAULT_LABEL + ((char) (((M >> 10) & 31) + 96)) + ((char) (((M >> 5) & 31) + 96)) + ((char) ((M & 31) + 96)));
    }

    public static f3.a n(a.C0002a aVar) {
        a.b g10 = aVar.g(1751411826);
        a.b g11 = aVar.g(1801812339);
        a.b g12 = aVar.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || k(g10.f194b) != 1835299937) {
            return null;
        }
        a0 a0Var = g11.f194b;
        a0Var.T(12);
        int p10 = a0Var.p();
        String[] strArr = new String[p10];
        for (int i10 = 0; i10 < p10; i10++) {
            int p11 = a0Var.p();
            a0Var.U(4);
            strArr[i10] = a0Var.D(p11 - 8);
        }
        a0 a0Var2 = g12.f194b;
        a0Var2.T(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.a() > 8) {
            int f10 = a0Var2.f();
            int p12 = a0Var2.p();
            int p13 = a0Var2.p() - 1;
            if (p13 < 0 || p13 >= p10) {
                r.i("AtomParsers", "Skipped metadata with unknown key index: " + p13);
            } else {
                l3.a f11 = h.f(a0Var2, f10 + p12, strArr[p13]);
                if (f11 != null) {
                    arrayList.add(f11);
                }
            }
            a0Var2.T(f10 + p12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new f3.a((List<? extends a.b>) arrayList);
    }

    private static void o(a0 a0Var, int i10, int i11, int i12, d dVar) {
        a0Var.T(i11 + 8 + 8);
        if (i10 == 1835365492) {
            a0Var.A();
            String A = a0Var.A();
            if (A != null) {
                dVar.f210b = new r1.b().T(i12).g0(A).G();
            }
        }
    }

    private static long p(a0 a0Var) {
        int i10 = 8;
        a0Var.T(8);
        if (a.c(a0Var.p()) != 0) {
            i10 = 16;
        }
        a0Var.U(i10);
        return a0Var.I();
    }

    private static float q(a0 a0Var, int i10) {
        a0Var.T(i10 + 8);
        return ((float) a0Var.K()) / ((float) a0Var.K());
    }

    private static byte[] r(a0 a0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            a0Var.T(i12);
            int p10 = a0Var.p();
            if (a0Var.p() == 1886547818) {
                return Arrays.copyOfRange(a0Var.e(), i12, p10 + i12);
            }
            i12 += p10;
        }
        return null;
    }

    private static Pair<Integer, p> s(a0 a0Var, int i10, int i11) throws y2 {
        Pair<Integer, p> g10;
        int f10 = a0Var.f();
        while (f10 - i10 < i11) {
            a0Var.T(f10);
            int p10 = a0Var.p();
            o.a(p10 > 0, "childAtomSize must be positive");
            if (a0Var.p() == 1936289382 && (g10 = g(a0Var, f10, p10)) != null) {
                return g10;
            }
            f10 += p10;
        }
        return null;
    }

    private static p t(a0 a0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            a0Var.T(i14);
            int p10 = a0Var.p();
            if (a0Var.p() == 1952804451) {
                int c10 = a.c(a0Var.p());
                a0Var.U(1);
                if (c10 == 0) {
                    a0Var.U(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int G = a0Var.G();
                    i12 = G & 15;
                    i13 = (G & 240) >> 4;
                }
                boolean z10 = a0Var.G() == 1;
                int G2 = a0Var.G();
                byte[] bArr2 = new byte[16];
                a0Var.l(bArr2, 0, 16);
                if (z10 && G2 == 0) {
                    int G3 = a0Var.G();
                    bArr = new byte[G3];
                    a0Var.l(bArr, 0, G3);
                }
                return new p(z10, str, G2, bArr2, i13, i12, bArr);
            }
            i14 += p10;
        }
    }

    private static f3.a u(a0 a0Var, int i10) {
        a0Var.U(12);
        while (a0Var.f() < i10) {
            int f10 = a0Var.f();
            int p10 = a0Var.p();
            if (a0Var.p() != 1935766900) {
                a0Var.T(f10 + p10);
            } else if (p10 < 14) {
                return null;
            } else {
                a0Var.U(5);
                int G = a0Var.G();
                if (G != 12 && G != 13) {
                    return null;
                }
                float f11 = G == 12 ? 240.0f : 120.0f;
                a0Var.U(1);
                return new f3.a(new l3.e(f11, a0Var.G()));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static a3.r v(a3.o r38, a3.a.C0002a r39, s2.x r40) throws n2.y2 {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            a3.a$b r3 = r0.g(r3)
            if (r3 == 0) goto L_0x0017
            a3.b$e r5 = new a3.b$e
            n2.r1 r6 = r1.f327f
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            a3.a$b r3 = r0.g(r3)
            if (r3 == 0) goto L_0x051f
            a3.b$f r5 = new a3.b$f
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.b()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            a3.r r9 = new a3.r
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            r4 = 0
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            a3.a$b r7 = r0.g(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            a3.a$b r7 = r0.g(r7)
            java.lang.Object r7 = k4.a.e(r7)
            a3.a$b r7 = (a3.a.b) r7
            r9 = 1
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            k4.a0 r7 = r7.f194b
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            a3.a$b r10 = r0.g(r10)
            java.lang.Object r10 = k4.a.e(r10)
            a3.a$b r10 = (a3.a.b) r10
            k4.a0 r10 = r10.f194b
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            a3.a$b r11 = r0.g(r11)
            java.lang.Object r11 = k4.a.e(r11)
            a3.a$b r11 = (a3.a.b) r11
            k4.a0 r11 = r11.f194b
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            a3.a$b r12 = r0.g(r12)
            if (r12 == 0) goto L_0x0086
            k4.a0 r12 = r12.f194b
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            a3.a$b r0 = r0.g(r13)
            if (r0 == 0) goto L_0x0093
            k4.a0 r0 = r0.f194b
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            a3.b$a r13 = new a3.b$a
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.T(r7)
            int r9 = r11.K()
            int r9 = r9 - r8
            int r10 = r11.K()
            int r14 = r11.K()
            if (r0 == 0) goto L_0x00b5
            r0.T(r7)
            int r15 = r0.K()
            goto L_0x00b6
        L_0x00b5:
            r15 = 0
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cb
            r12.T(r7)
            int r7 = r12.K()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.K()
            int r16 = r16 + -1
            goto L_0x00ce
        L_0x00c9:
            r12 = 0
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            r16 = -1
        L_0x00ce:
            int r6 = r5.a()
            n2.r1 r8 = r1.f327f
            java.lang.String r8 = r8.f20654m
            if (r6 == r4) goto L_0x00fa
            java.lang.String r4 = "audio/raw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-alaw"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00fa
        L_0x00f0:
            if (r9 != 0) goto L_0x00fa
            if (r15 != 0) goto L_0x00fa
            if (r7 != 0) goto L_0x00fa
            r39 = r7
            r4 = 1
            goto L_0x00fd
        L_0x00fa:
            r39 = r7
            r4 = 0
        L_0x00fd:
            if (r4 == 0) goto L_0x0131
            int r0 = r13.f196a
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0105:
            boolean r5 = r13.a()
            if (r5 == 0) goto L_0x0116
            int r5 = r13.f197b
            long r9 = r13.f199d
            r4[r5] = r9
            int r9 = r13.f198c
            r0[r5] = r9
            goto L_0x0105
        L_0x0116:
            long r9 = (long) r14
            a3.d$b r0 = a3.d.a(r6, r4, r0, r9)
            long[] r4 = r0.f228a
            int[] r5 = r0.f229b
            int r6 = r0.f230c
            long[] r9 = r0.f231d
            int[] r10 = r0.f232e
            long r11 = r0.f233f
            r14 = r1
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r13 = r10
            r15 = r11
            r12 = r9
            goto L_0x02a0
        L_0x0131:
            long[] r4 = new long[r3]
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            int[] r8 = new int[r3]
            r24 = r11
            r2 = r16
            r1 = 0
            r11 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r16 = r15
            r15 = r14
            r14 = r10
            r37 = r9
            r9 = r39
        L_0x0151:
            r39 = r37
            java.lang.String r10 = "AtomParsers"
            if (r1 >= r3) goto L_0x0219
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x015d:
            if (r27 != 0) goto L_0x017a
            boolean r22 = r13.a()
            if (r22 == 0) goto L_0x017a
            r30 = r14
            r31 = r15
            long r14 = r13.f199d
            r32 = r3
            int r3 = r13.f198c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x015d
        L_0x017a:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x019e
            java.lang.String r2 = "Unexpected end of chunk data"
            k4.r.i(r10, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x0221
        L_0x019e:
            if (r0 == 0) goto L_0x01b1
        L_0x01a0:
            if (r23 != 0) goto L_0x01af
            if (r16 <= 0) goto L_0x01af
            int r23 = r0.K()
            int r21 = r0.p()
            int r16 = r16 + -1
            goto L_0x01a0
        L_0x01af:
            int r23 = r23 + -1
        L_0x01b1:
            r3 = r21
            r4[r1] = r28
            int r10 = r5.c()
            r6[r1] = r10
            r10 = r6[r1]
            if (r10 <= r11) goto L_0x01c2
            r10 = r6[r1]
            r11 = r10
        L_0x01c2:
            long r14 = (long) r3
            long r14 = r25 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x01cb
            r10 = 1
            goto L_0x01cc
        L_0x01cb:
            r10 = 0
        L_0x01cc:
            r8[r1] = r10
            if (r1 != r2) goto L_0x01e2
            r10 = 1
            r8[r1] = r10
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x01e2
            java.lang.Object r2 = k4.a.e(r12)
            k4.a0 r2 = (k4.a0) r2
            int r2 = r2.K()
            int r2 = r2 - r10
        L_0x01e2:
            r15 = r2
            r10 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01fa
            if (r39 <= 0) goto L_0x01fa
            int r2 = r24.K()
            int r3 = r24.p()
            int r14 = r39 + -1
            goto L_0x01fd
        L_0x01fa:
            r3 = r14
            r14 = r39
        L_0x01fd:
            r39 = r2
            r2 = r6[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r10
            r37 = r14
            r14 = r39
            goto L_0x0151
        L_0x0219:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x0221:
            long r12 = (long) r2
            long r12 = r25 + r12
            if (r0 == 0) goto L_0x0236
        L_0x0226:
            if (r16 <= 0) goto L_0x0236
            int r2 = r0.K()
            if (r2 == 0) goto L_0x0230
            r0 = 0
            goto L_0x0237
        L_0x0230:
            r0.p()
            int r16 = r16 + -1
            goto L_0x0226
        L_0x0236:
            r0 = 1
        L_0x0237:
            if (r9 != 0) goto L_0x0249
            if (r30 != 0) goto L_0x0249
            if (r1 != 0) goto L_0x0249
            if (r39 != 0) goto L_0x0249
            r2 = r23
            if (r2 != 0) goto L_0x024b
            if (r0 != 0) goto L_0x0246
            goto L_0x024b
        L_0x0246:
            r14 = r38
            goto L_0x0299
        L_0x0249:
            r2 = r23
        L_0x024b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Inconsistent stbl box for track "
            r5.append(r14)
            r14 = r38
            int r15 = r14.f322a
            r5.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r5.append(r15)
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r5.append(r9)
            r9 = r30
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r5.append(r1)
            r9 = r39
            r5.append(r9)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r5.append(r1)
            r5.append(r2)
            if (r0 != 0) goto L_0x028d
            java.lang.String r0 = ", ctts invalid"
            goto L_0x028f
        L_0x028d:
            java.lang.String r0 = ""
        L_0x028f:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            k4.r.i(r10, r0)
        L_0x0299:
            r0 = r3
            r2 = r4
            r3 = r6
            r4 = r11
            r15 = r12
            r12 = r7
            r13 = r8
        L_0x02a0:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r14.f324c
            r5 = r15
            long r7 = k4.n0.O0(r5, r7, r9)
            long[] r1 = r14.f329h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02c1
            long r0 = r14.f324c
            k4.n0.Q0(r12, r10, r0)
            a3.r r9 = new a3.r
            r0 = r9
            r1 = r38
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02c1:
            int r1 = r1.length
            r5 = 1
            if (r1 != r5) goto L_0x035e
            int r1 = r14.f323b
            if (r1 != r5) goto L_0x035e
            int r1 = r12.length
            r5 = 2
            if (r1 < r5) goto L_0x035e
            long[] r1 = r14.f330i
            java.lang.Object r1 = k4.a.e(r1)
            long[] r1 = (long[]) r1
            r5 = 0
            r21 = r1[r5]
            long[] r1 = r14.f329h
            r23 = r1[r5]
            long r5 = r14.f324c
            long r7 = r14.f325d
            r25 = r5
            r27 = r7
            long r5 = k4.n0.O0(r23, r25, r27)
            long r23 = r21 + r5
            r5 = r12
            r6 = r15
            r8 = r21
            r25 = r0
            r0 = r10
            r10 = r23
            boolean r5 = b(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x0360
            long r6 = r15 - r23
            r5 = 0
            r8 = r12[r5]
            long r26 = r21 - r8
            n2.r1 r5 = r14.f327f
            int r5 = r5.A
            long r8 = (long) r5
            long r10 = r14.f324c
            r28 = r8
            r30 = r10
            long r10 = k4.n0.O0(r26, r28, r30)
            n2.r1 r5 = r14.f327f
            int r5 = r5.A
            long r8 = (long) r5
            long r0 = r14.f324c
            r39 = r4
            r4 = r10
            r10 = r0
            long r0 = k4.n0.O0(r6, r8, r10)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0328
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0362
        L_0x0328:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0362
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0362
            int r5 = (int) r4
            r4 = r40
            r4.f22484a = r5
            int r1 = (int) r0
            r4.f22485b = r1
            long r0 = r14.f324c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            k4.n0.Q0(r12, r4, r0)
            long[] r0 = r14.f329h
            r1 = 0
            r4 = r0[r1]
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r14.f325d
            long r7 = k4.n0.O0(r4, r6, r8)
            a3.r r9 = new a3.r
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x035e:
            r25 = r0
        L_0x0360:
            r39 = r4
        L_0x0362:
            long[] r0 = r14.f329h
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L_0x03ad
            r1 = 0
            r4 = r0[r1]
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x03ad
            long[] r0 = r14.f330i
            java.lang.Object r0 = k4.a.e(r0)
            long[] r0 = (long[]) r0
            r4 = r0[r1]
            r6 = 0
        L_0x037c:
            int r0 = r12.length
            if (r6 >= r0) goto L_0x0393
            r0 = r12[r6]
            long r17 = r0 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f324c
            r21 = r0
            long r0 = k4.n0.O0(r17, r19, r21)
            r12[r6] = r0
            int r6 = r6 + 1
            goto L_0x037c
        L_0x0393:
            long r17 = r15 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f324c
            r21 = r0
            long r7 = k4.n0.O0(r17, r19, r21)
            a3.r r9 = new a3.r
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03ad:
            int r1 = r14.f323b
            r4 = 1
            if (r1 != r4) goto L_0x03b4
            r10 = 1
            goto L_0x03b5
        L_0x03b4:
            r10 = 0
        L_0x03b5:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r4 = r14.f330i
            java.lang.Object r4 = k4.a.e(r4)
            long[] r4 = (long[]) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x03c7:
            long[] r9 = r14.f329h
            int r11 = r9.length
            if (r5 >= r11) goto L_0x0431
            r11 = r2
            r15 = r3
            r2 = r4[r5]
            r21 = -1
            int r16 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r16 == 0) goto L_0x0421
            r26 = r9[r5]
            r16 = r8
            long r8 = r14.f324c
            r40 = r6
            r21 = r7
            long r6 = r14.f325d
            r28 = r8
            r30 = r6
            long r6 = k4.n0.O0(r26, r28, r30)
            r8 = 1
            int r9 = k4.n0.i(r12, r2, r8, r8)
            r1[r5] = r9
            long r2 = r2 + r6
            r6 = 0
            int r2 = k4.n0.e(r12, r2, r10, r6)
            r0[r5] = r2
        L_0x03f9:
            r2 = r1[r5]
            r3 = r0[r5]
            if (r2 >= r3) goto L_0x040c
            r2 = r1[r5]
            r2 = r13[r2]
            r2 = r2 & r8
            if (r2 != 0) goto L_0x040c
            r2 = r1[r5]
            int r2 = r2 + r8
            r1[r5] = r2
            goto L_0x03f9
        L_0x040c:
            r2 = r0[r5]
            r3 = r1[r5]
            int r2 = r2 - r3
            int r7 = r21 + r2
            r2 = r1[r5]
            r3 = r16
            if (r3 == r2) goto L_0x041b
            r2 = 1
            goto L_0x041c
        L_0x041b:
            r2 = 0
        L_0x041c:
            r2 = r40 | r2
            r3 = r0[r5]
            goto L_0x042a
        L_0x0421:
            r40 = r6
            r21 = r7
            r3 = r8
            r6 = 0
            r8 = 1
            r2 = r40
        L_0x042a:
            int r5 = r5 + 1
            r6 = r2
            r8 = r3
            r2 = r11
            r3 = r15
            goto L_0x03c7
        L_0x0431:
            r11 = r2
            r15 = r3
            r40 = r6
            r3 = r25
            r6 = 0
            r8 = 1
            if (r7 == r3) goto L_0x043c
            goto L_0x043d
        L_0x043c:
            r8 = 0
        L_0x043d:
            r2 = r40 | r8
            if (r2 == 0) goto L_0x0444
            long[] r3 = new long[r7]
            goto L_0x0445
        L_0x0444:
            r3 = r11
        L_0x0445:
            if (r2 == 0) goto L_0x044a
            int[] r4 = new int[r7]
            goto L_0x044b
        L_0x044a:
            r4 = r15
        L_0x044b:
            if (r2 == 0) goto L_0x044f
            r5 = 0
            goto L_0x0451
        L_0x044f:
            r5 = r39
        L_0x0451:
            if (r2 == 0) goto L_0x0456
            int[] r8 = new int[r7]
            goto L_0x0457
        L_0x0456:
            r8 = r13
        L_0x0457:
            long[] r7 = new long[r7]
            r40 = r5
            r39 = r15
            r9 = 0
            r15 = 0
        L_0x0460:
            long[] r5 = r14.f329h
            int r5 = r5.length
            if (r6 >= r5) goto L_0x04ff
            long[] r5 = r14.f330i
            r16 = r5[r6]
            r5 = r1[r6]
            r18 = r1
            r1 = r0[r6]
            r27 = r0
            if (r2 == 0) goto L_0x0483
            int r0 = r1 - r5
            java.lang.System.arraycopy(r11, r5, r3, r15, r0)
            r28 = r11
            r11 = r39
            java.lang.System.arraycopy(r11, r5, r4, r15, r0)
            java.lang.System.arraycopy(r13, r5, r8, r15, r0)
            goto L_0x0487
        L_0x0483:
            r28 = r11
            r11 = r39
        L_0x0487:
            r0 = r40
        L_0x0489:
            if (r5 >= r1) goto L_0x04d9
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r0
            r39 = r1
            long r0 = r14.f325d
            r21 = r9
            r25 = r0
            long r0 = k4.n0.O0(r21, r23, r25)
            r21 = r12[r5]
            r23 = r12
            r24 = r13
            long r12 = r21 - r16
            r30 = r8
            r21 = r9
            r8 = 0
            long r31 = java.lang.Math.max(r8, r12)
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r14.f324c
            r35 = r12
            long r12 = k4.n0.O0(r31, r33, r35)
            long r0 = r0 + r12
            r7[r15] = r0
            if (r2 == 0) goto L_0x04c7
            r0 = r4[r15]
            r1 = r29
            if (r0 <= r1) goto L_0x04c9
            r0 = r11[r5]
            goto L_0x04ca
        L_0x04c7:
            r1 = r29
        L_0x04c9:
            r0 = r1
        L_0x04ca:
            int r15 = r15 + 1
            int r5 = r5 + 1
            r1 = r39
            r9 = r21
            r12 = r23
            r13 = r24
            r8 = r30
            goto L_0x0489
        L_0x04d9:
            r1 = r0
            r30 = r8
            r21 = r9
            r23 = r12
            r24 = r13
            r8 = 0
            long[] r0 = r14.f329h
            r12 = r0[r6]
            long r12 = r21 + r12
            int r6 = r6 + 1
            r40 = r1
            r39 = r11
            r9 = r12
            r1 = r18
            r12 = r23
            r13 = r24
            r0 = r27
            r11 = r28
            r8 = r30
            goto L_0x0460
        L_0x04ff:
            r30 = r8
            r21 = r9
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f325d
            r25 = r0
            long r8 = k4.n0.O0(r21, r23, r25)
            a3.r r10 = new a3.r
            r0 = r10
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r40
            r5 = r7
            r6 = r30
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x051f:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            n2.y2 r0 = n2.y2.a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b.v(a3.o, a3.a$a, s2.x):a3.r");
    }

    private static d w(a0 a0Var, int i10, int i11, String str, m mVar, boolean z10) throws y2 {
        int i12;
        a0 a0Var2 = a0Var;
        int i13 = i10;
        a0Var2.T(12);
        int p10 = a0Var.p();
        d dVar = new d(p10);
        for (int i14 = 0; i14 < p10; i14++) {
            int f10 = a0Var.f();
            int p11 = a0Var.p();
            o.a(p11 > 0, "childAtomSize must be positive");
            int p12 = a0Var.p();
            if (p12 == 1635148593 || p12 == 1635148595 || p12 == 1701733238 || p12 == 1831958048 || p12 == 1836070006 || p12 == 1752589105 || p12 == 1751479857 || p12 == 1932670515 || p12 == 1211250227 || p12 == 1987063864 || p12 == 1987063865 || p12 == 1635135537 || p12 == 1685479798 || p12 == 1685479729 || p12 == 1685481573 || p12 == 1685481521) {
                i12 = f10;
                D(a0Var, p12, i12, p11, i10, i11, mVar, dVar, i14);
            } else if (p12 == 1836069985 || p12 == 1701733217 || p12 == 1633889587 || p12 == 1700998451 || p12 == 1633889588 || p12 == 1835823201 || p12 == 1685353315 || p12 == 1685353317 || p12 == 1685353320 || p12 == 1685353324 || p12 == 1685353336 || p12 == 1935764850 || p12 == 1935767394 || p12 == 1819304813 || p12 == 1936684916 || p12 == 1953984371 || p12 == 778924082 || p12 == 778924083 || p12 == 1835557169 || p12 == 1835560241 || p12 == 1634492771 || p12 == 1634492791 || p12 == 1970037111 || p12 == 1332770163 || p12 == 1716281667) {
                i12 = f10;
                f(a0Var, p12, f10, p11, i10, str, z10, mVar, dVar, i14);
            } else {
                if (p12 == 1414810956 || p12 == 1954034535 || p12 == 2004251764 || p12 == 1937010800 || p12 == 1664495672) {
                    x(a0Var, p12, f10, p11, i10, str, dVar);
                } else if (p12 == 1835365492) {
                    o(a0Var2, p12, f10, i13, dVar);
                } else if (p12 == 1667329389) {
                    dVar.f210b = new r1.b().T(i13).g0("application/x-camera-motion").G();
                }
                i12 = f10;
            }
            a0Var2.T(i12 + p11);
        }
        return dVar;
    }

    private static void x(a0 a0Var, int i10, int i11, int i12, int i13, String str, d dVar) {
        a0Var.T(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        u uVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                a0Var.l(bArr, 0, i14);
                uVar = u.z(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                dVar.f212d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        dVar.f210b = new r1.b().T(i13).g0(str2).X(str).k0(j10).V(uVar).G();
    }

    private static g y(a0 a0Var) {
        boolean z10;
        int i10 = 8;
        a0Var.T(8);
        int c10 = a.c(a0Var.p());
        a0Var.U(c10 == 0 ? 8 : 16);
        int p10 = a0Var.p();
        a0Var.U(4);
        int f10 = a0Var.f();
        if (c10 == 0) {
            i10 = 4;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            } else if (a0Var.e()[f10 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            a0Var.U(i10);
        } else {
            long I = c10 == 0 ? a0Var.I() : a0Var.L();
            if (I != 0) {
                j10 = I;
            }
        }
        a0Var.U(16);
        int p11 = a0Var.p();
        int p12 = a0Var.p();
        a0Var.U(4);
        int p13 = a0Var.p();
        int p14 = a0Var.p();
        if (p11 == 0 && p12 == 65536 && p13 == -65536 && p14 == 0) {
            i11 = 90;
        } else if (p11 == 0 && p12 == -65536 && p13 == 65536 && p14 == 0) {
            i11 = 270;
        } else if (p11 == -65536 && p12 == 0 && p13 == 0 && p14 == -65536) {
            i11 = 180;
        }
        return new g(p10, j10, i11);
    }

    private static o z(a.C0002a aVar, a.b bVar, long j10, m mVar, boolean z10, boolean z11) throws y2 {
        long j11;
        a.b bVar2;
        long[] jArr;
        long[] jArr2;
        a.C0002a f10;
        Pair<long[], long[]> h10;
        a.C0002a aVar2 = aVar;
        a.C0002a aVar3 = (a.C0002a) k4.a.e(aVar2.f(1835297121));
        int d10 = d(k(((a.b) k4.a.e(aVar3.g(1751411826))).f194b));
        if (d10 == -1) {
            return null;
        }
        g y10 = y(((a.b) k4.a.e(aVar2.g(1953196132))).f194b);
        long j12 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = y10.f222b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long p10 = p(bVar2.f194b);
        if (j11 != -9223372036854775807L) {
            j12 = n0.O0(j11, 1000000, p10);
        }
        long j13 = j12;
        Pair<Long, String> m10 = m(((a.b) k4.a.e(aVar3.g(1835296868))).f194b);
        a.b g10 = ((a.C0002a) k4.a.e(((a.C0002a) k4.a.e(aVar3.f(1835626086))).f(1937007212))).g(1937011556);
        if (g10 != null) {
            d w10 = w(g10.f194b, y10.f221a, y10.f223c, (String) m10.second, mVar, z11);
            if (z10 || (f10 = aVar2.f(1701082227)) == null || (h10 = h(f10)) == null) {
                jArr2 = null;
                jArr = null;
            } else {
                jArr = (long[]) h10.second;
                jArr2 = (long[]) h10.first;
            }
            if (w10.f210b == null) {
                return null;
            }
            return new o(y10.f221a, d10, ((Long) m10.first).longValue(), p10, j13, w10.f210b, w10.f212d, w10.f209a, w10.f211c, jArr2, jArr);
        }
        throw y2.a("Malformed sample table (stbl) missing sample description (stsd)", (Throwable) null);
    }
}
