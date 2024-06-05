package y2;

import android.util.Pair;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k4.a0;
import k4.n0;
import k4.s;
import k4.w;
import n2.i;
import n2.y2;
import r2.m;
import s2.b0;
import s2.d;
import s2.e0;
import s2.f0;
import s2.l;
import s2.m;
import s2.n;
import s2.r;

/* compiled from: MatroskaExtractor */
public class e implements l {

    /* renamed from: c0  reason: collision with root package name */
    public static final r f23752c0 = d.f39375b;

    /* renamed from: d0  reason: collision with root package name */
    private static final byte[] f23753d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f23754e0 = n0.m0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0  reason: collision with root package name */
    private static final byte[] f23755f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0  reason: collision with root package name */
    private static final byte[] f23756g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public static final UUID f23757h0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public static final Map<String, Integer> f23758i0;
    private long A;
    private long B;
    private s C;
    private s D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* renamed from: a  reason: collision with root package name */
    private final c f23759a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f23760a0;

    /* renamed from: b  reason: collision with root package name */
    private final g f23761b;

    /* renamed from: b0  reason: collision with root package name */
    private n f23762b0;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<c> f23763c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f23764d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f23765e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f23766f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f23767g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f23768h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f23769i;

    /* renamed from: j  reason: collision with root package name */
    private final a0 f23770j;

    /* renamed from: k  reason: collision with root package name */
    private final a0 f23771k;

    /* renamed from: l  reason: collision with root package name */
    private final a0 f23772l;

    /* renamed from: m  reason: collision with root package name */
    private final a0 f23773m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f23774n;

    /* renamed from: o  reason: collision with root package name */
    private ByteBuffer f23775o;

    /* renamed from: p  reason: collision with root package name */
    private long f23776p;

    /* renamed from: q  reason: collision with root package name */
    private long f23777q;

    /* renamed from: r  reason: collision with root package name */
    private long f23778r;

    /* renamed from: s  reason: collision with root package name */
    private long f23779s;

    /* renamed from: t  reason: collision with root package name */
    private long f23780t;

    /* renamed from: u  reason: collision with root package name */
    private c f23781u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f23782v;

    /* renamed from: w  reason: collision with root package name */
    private int f23783w;

    /* renamed from: x  reason: collision with root package name */
    private long f23784x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f23785y;

    /* renamed from: z  reason: collision with root package name */
    private long f23786z;

    /* compiled from: MatroskaExtractor */
    private final class b implements b {
        private b() {
        }

        public void a(int i10) throws y2 {
            e.this.o(i10);
        }

        public int b(int i10) {
            return e.this.u(i10);
        }

        public boolean c(int i10) {
            return e.this.z(i10);
        }

        public void d(int i10, int i11, m mVar) throws IOException {
            e.this.l(i10, i11, mVar);
        }

        public void e(int i10, String str) throws y2 {
            e.this.H(i10, str);
        }

        public void f(int i10, double d10) throws y2 {
            e.this.r(i10, d10);
        }

        public void g(int i10, long j10, long j11) throws y2 {
            e.this.G(i10, j10, j11);
        }

        public void h(int i10, long j10) throws y2 {
            e.this.x(i10, j10);
        }
    }

    /* compiled from: MatroskaExtractor */
    protected static final class c {
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public byte[] N;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public f0 T;
        public boolean U;
        public boolean V = true;
        /* access modifiers changed from: private */
        public String W = "eng";
        public e0 X;
        public int Y;

        /* renamed from: a  reason: collision with root package name */
        public String f23788a;

        /* renamed from: b  reason: collision with root package name */
        public String f23789b;

        /* renamed from: c  reason: collision with root package name */
        public int f23790c;

        /* renamed from: d  reason: collision with root package name */
        public int f23791d;

        /* renamed from: e  reason: collision with root package name */
        public int f23792e;

        /* renamed from: f  reason: collision with root package name */
        public int f23793f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f23794g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f23795h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f23796i;

        /* renamed from: j  reason: collision with root package name */
        public e0.a f23797j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f23798k;

        /* renamed from: l  reason: collision with root package name */
        public r2.m f23799l;

        /* renamed from: m  reason: collision with root package name */
        public int f23800m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f23801n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f23802o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f23803p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f23804q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f23805r = -1;

        /* renamed from: s  reason: collision with root package name */
        public float f23806s = 0.0f;

        /* renamed from: t  reason: collision with root package name */
        public float f23807t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f23808u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f23809v = null;

        /* renamed from: w  reason: collision with root package name */
        public int f23810w = -1;

        /* renamed from: x  reason: collision with root package name */
        public boolean f23811x = false;

        /* renamed from: y  reason: collision with root package name */
        public int f23812y = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f23813z = -1;

        protected c() {
        }

        /* access modifiers changed from: private */
        public void f() {
            k4.a.e(this.X);
        }

        private byte[] g(String str) throws y2 {
            byte[] bArr = this.f23798k;
            if (bArr != null) {
                return bArr;
            }
            throw y2.a("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        private byte[] h() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.K * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.L + 0.5f)));
            order.putShort((short) ((int) (this.M + 0.5f)));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(a0 a0Var) throws y2 {
            try {
                a0Var.U(16);
                long w10 = a0Var.w();
                if (w10 == 1482049860) {
                    return new Pair<>("video/divx", (Object) null);
                }
                if (w10 == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (w10 == 826496599) {
                    byte[] e10 = a0Var.e();
                    for (int f10 = a0Var.f() + 20; f10 < e10.length - 4; f10++) {
                        if (e10[f10] == 0 && e10[f10 + 1] == 0 && e10[f10 + 2] == 1 && e10[f10 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(e10, f10, e10.length)));
                        }
                    }
                    throw y2.a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                k4.r.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw y2.a("Error parsing FourCC private data", (Throwable) null);
            }
        }

        private static boolean l(a0 a0Var) throws y2 {
            try {
                int y10 = a0Var.y();
                if (y10 == 1) {
                    return true;
                }
                if (y10 != 65534) {
                    return false;
                }
                a0Var.T(24);
                if (a0Var.z() == e.f23757h0.getMostSignificantBits() && a0Var.z() == e.f23757h0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw y2.a("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        private static List<byte[]> m(byte[] bArr) throws y2 {
            try {
                if (bArr[0] == 2) {
                    int i10 = 1;
                    int i11 = 0;
                    while ((bArr[i10] & 255) == 255) {
                        i11 += 255;
                        i10++;
                    }
                    int i12 = i10 + 1;
                    int i13 = i11 + (bArr[i10] & 255);
                    int i14 = 0;
                    while ((bArr[i12] & 255) == 255) {
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + (bArr[i12] & 255);
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i18)];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw y2.a("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw y2.a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw y2.a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw y2.a("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw y2.a("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        /* access modifiers changed from: private */
        public boolean o(boolean z10) {
            if ("A_OPUS".equals(this.f23789b)) {
                return z10;
            }
            return this.f23793f > 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a5, code lost:
            r4 = r1;
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x030c, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x030e, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x030f, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0362, code lost:
            r4 = -1;
            r6 = -1;
            r18 = r3;
            r3 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x0398, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x03a0, code lost:
            r1 = null;
            r3 = null;
            r4 = -1;
            r6 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x040f, code lost:
            r1 = null;
            r3 = null;
            r17 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0425, code lost:
            if (r0.N == null) goto L_0x0438;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0427, code lost:
            r7 = l4.d.a(new k4.a0(r0.N));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0432, code lost:
            if (r7 == null) goto L_0x0438;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0434, code lost:
            r3 = r7.f19912c;
            r17 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0438, code lost:
            r7 = r17;
            r10 = r0.V | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0440, code lost:
            if (r0.U == false) goto L_0x0444;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0442, code lost:
            r9 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0444, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0445, code lost:
            r9 = r9 | r10;
            r10 = new n2.r1.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x044f, code lost:
            if (k4.v.o(r7) == false) goto L_0x0463;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x0451, code lost:
            r10.J(r0.O).h0(r0.Q).a0(r4);
            r5 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0467, code lost:
            if (k4.v.s(r7) == false) goto L_0x053d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x046b, code lost:
            if (r0.f23804q != 0) goto L_0x047f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x046d, code lost:
            r2 = r0.f23802o;
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0470, code lost:
            if (r2 != -1) goto L_0x0474;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0472, code lost:
            r2 = r0.f23800m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x0474, code lost:
            r0.f23802o = r2;
            r2 = r0.f23803p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0478, code lost:
            if (r2 != -1) goto L_0x047c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x047a, code lost:
            r2 = r0.f23801n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x047c, code lost:
            r0.f23803p = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x047f, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x0480, code lost:
            r2 = -1.0f;
            r5 = r0.f23802o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x0484, code lost:
            if (r5 == r4) goto L_0x0495;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0486, code lost:
            r12 = r0.f23803p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0488, code lost:
            if (r12 == r4) goto L_0x0495;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x048a, code lost:
            r2 = ((float) (r0.f23801n * r5)) / ((float) (r0.f23800m * r12));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0497, code lost:
            if (r0.f23811x == false) goto L_0x04a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x0499, code lost:
            r8 = new l4.c(r0.f23812y, r0.A, r0.f23813z, h());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x04aa, code lost:
            if (r0.f23788a == null) goto L_0x04c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x04b6, code lost:
            if (y2.e.f().containsKey(r0.f23788a) == false) goto L_0x04c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x04b8, code lost:
            r4 = ((java.lang.Integer) y2.e.f().get(r0.f23788a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x04ca, code lost:
            if (r0.f23805r != 0) goto L_0x0518;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x04d3, code lost:
            if (java.lang.Float.compare(r0.f23806s, 0.0f) != 0) goto L_0x0518;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x04db, code lost:
            if (java.lang.Float.compare(r0.f23807t, 0.0f) != 0) goto L_0x0518;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x04e3, code lost:
            if (java.lang.Float.compare(r0.f23808u, 0.0f) != 0) goto L_0x04e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x04e5, code lost:
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x04ef, code lost:
            if (java.lang.Float.compare(r0.f23807t, 90.0f) != 0) goto L_0x04f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x04f1, code lost:
            r4 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04fc, code lost:
            if (java.lang.Float.compare(r0.f23807t, -180.0f) == 0) goto L_0x0516;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0506, code lost:
            if (java.lang.Float.compare(r0.f23807t, 180.0f) != 0) goto L_0x0509;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0511, code lost:
            if (java.lang.Float.compare(r0.f23807t, -90.0f) != 0) goto L_0x0518;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0513, code lost:
            r4 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0516, code lost:
            r4 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0518, code lost:
            r10.n0(r0.f23800m).S(r0.f23801n).c0(r2).f0(r4).d0(r0.f23809v).j0(r0.f23810w).L(r8);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x0541, code lost:
            if ("application/x-subrip".equals(r7) != false) goto L_0x0569;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0547, code lost:
            if ("text/x-ssa".equals(r7) != false) goto L_0x0569;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x054d, code lost:
            if ("text/vtt".equals(r7) != false) goto L_0x0569;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x0553, code lost:
            if ("application/vobsub".equals(r7) != false) goto L_0x0569;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x0559, code lost:
            if ("application/pgs".equals(r7) != false) goto L_0x0569;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x055f, code lost:
            if ("application/dvbsubs".equals(r7) == false) goto L_0x0562;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x0568, code lost:
            throw n2.y2.a("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x0569, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x056c, code lost:
            if (r0.f23788a == null) goto L_0x057f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x0578, code lost:
            if (y2.e.f().containsKey(r0.f23788a) != false) goto L_0x057f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x057a, code lost:
            r10.W(r0.f23788a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x057f, code lost:
            r1 = r10.T(r21).g0(r7).Y(r6).X(r0.W).i0(r9).V(r1).K(r3).O(r0.f23799l).G();
            r2 = r20.e(r0.f23790c, r5);
            r0.X = r2;
            r2.a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x05b6, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i(s2.n r20, int r21) throws n2.y2 {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = r0.f23789b
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 32
                r4 = 16
                r7 = 8
                r9 = 3
                switch(r2) {
                    case -2095576542: goto L_0x01c1;
                    case -2095575984: goto L_0x01b5;
                    case -1985379776: goto L_0x01a9;
                    case -1784763192: goto L_0x019d;
                    case -1730367663: goto L_0x0191;
                    case -1482641358: goto L_0x0185;
                    case -1482641357: goto L_0x0179;
                    case -1373388978: goto L_0x016d;
                    case -933872740: goto L_0x015f;
                    case -538363189: goto L_0x0151;
                    case -538363109: goto L_0x0143;
                    case -425012669: goto L_0x0135;
                    case -356037306: goto L_0x0127;
                    case 62923557: goto L_0x0119;
                    case 62923603: goto L_0x010b;
                    case 62927045: goto L_0x00fd;
                    case 82318131: goto L_0x00ef;
                    case 82338133: goto L_0x00e1;
                    case 82338134: goto L_0x00d3;
                    case 99146302: goto L_0x00c5;
                    case 444813526: goto L_0x00b7;
                    case 542569478: goto L_0x00a9;
                    case 635596514: goto L_0x009b;
                    case 725948237: goto L_0x008d;
                    case 725957860: goto L_0x0080;
                    case 738597099: goto L_0x0073;
                    case 855502857: goto L_0x0066;
                    case 1045209816: goto L_0x0059;
                    case 1422270023: goto L_0x004c;
                    case 1809237540: goto L_0x003f;
                    case 1950749482: goto L_0x0032;
                    case 1950789798: goto L_0x0025;
                    case 1951062397: goto L_0x0018;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r1 = -1
                goto L_0x01cc
            L_0x0018:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0021
                goto L_0x0015
            L_0x0021:
                r1 = 32
                goto L_0x01cc
            L_0x0025:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002e
                goto L_0x0015
            L_0x002e:
                r1 = 31
                goto L_0x01cc
            L_0x0032:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003b
                goto L_0x0015
            L_0x003b:
                r1 = 30
                goto L_0x01cc
            L_0x003f:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0048
                goto L_0x0015
            L_0x0048:
                r1 = 29
                goto L_0x01cc
            L_0x004c:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0055
                goto L_0x0015
            L_0x0055:
                r1 = 28
                goto L_0x01cc
            L_0x0059:
                java.lang.String r2 = "S_TEXT/WEBVTT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0062
                goto L_0x0015
            L_0x0062:
                r1 = 27
                goto L_0x01cc
            L_0x0066:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006f
                goto L_0x0015
            L_0x006f:
                r1 = 26
                goto L_0x01cc
            L_0x0073:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007c
                goto L_0x0015
            L_0x007c:
                r1 = 25
                goto L_0x01cc
            L_0x0080:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0089
                goto L_0x0015
            L_0x0089:
                r1 = 24
                goto L_0x01cc
            L_0x008d:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0097
                goto L_0x0015
            L_0x0097:
                r1 = 23
                goto L_0x01cc
            L_0x009b:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a5
                goto L_0x0015
            L_0x00a5:
                r1 = 22
                goto L_0x01cc
            L_0x00a9:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b3
                goto L_0x0015
            L_0x00b3:
                r1 = 21
                goto L_0x01cc
            L_0x00b7:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c1
                goto L_0x0015
            L_0x00c1:
                r1 = 20
                goto L_0x01cc
            L_0x00c5:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00cf
                goto L_0x0015
            L_0x00cf:
                r1 = 19
                goto L_0x01cc
            L_0x00d3:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00dd
                goto L_0x0015
            L_0x00dd:
                r1 = 18
                goto L_0x01cc
            L_0x00e1:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00eb
                goto L_0x0015
            L_0x00eb:
                r1 = 17
                goto L_0x01cc
            L_0x00ef:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f9
                goto L_0x0015
            L_0x00f9:
                r1 = 16
                goto L_0x01cc
            L_0x00fd:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0107
                goto L_0x0015
            L_0x0107:
                r1 = 15
                goto L_0x01cc
            L_0x010b:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0115
                goto L_0x0015
            L_0x0115:
                r1 = 14
                goto L_0x01cc
            L_0x0119:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0123
                goto L_0x0015
            L_0x0123:
                r1 = 13
                goto L_0x01cc
            L_0x0127:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0131
                goto L_0x0015
            L_0x0131:
                r1 = 12
                goto L_0x01cc
            L_0x0135:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013f
                goto L_0x0015
            L_0x013f:
                r1 = 11
                goto L_0x01cc
            L_0x0143:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014d
                goto L_0x0015
            L_0x014d:
                r1 = 10
                goto L_0x01cc
            L_0x0151:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x015b
                goto L_0x0015
            L_0x015b:
                r1 = 9
                goto L_0x01cc
            L_0x015f:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0169
                goto L_0x0015
            L_0x0169:
                r1 = 8
                goto L_0x01cc
            L_0x016d:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0177
                goto L_0x0015
            L_0x0177:
                r1 = 7
                goto L_0x01cc
            L_0x0179:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0183
                goto L_0x0015
            L_0x0183:
                r1 = 6
                goto L_0x01cc
            L_0x0185:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x018f
                goto L_0x0015
            L_0x018f:
                r1 = 5
                goto L_0x01cc
            L_0x0191:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x019b
                goto L_0x0015
            L_0x019b:
                r1 = 4
                goto L_0x01cc
            L_0x019d:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01a7
                goto L_0x0015
            L_0x01a7:
                r1 = 3
                goto L_0x01cc
            L_0x01a9:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01b3
                goto L_0x0015
            L_0x01b3:
                r1 = 2
                goto L_0x01cc
            L_0x01b5:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01bf
                goto L_0x0015
            L_0x01bf:
                r1 = 1
                goto L_0x01cc
            L_0x01c1:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01cb
                goto L_0x0015
            L_0x01cb:
                r1 = 0
            L_0x01cc:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "text/vtt"
                java.lang.String r15 = "text/x-ssa"
                java.lang.String r5 = "application/x-subrip"
                r16 = 4096(0x1000, float:5.74E-42)
                java.lang.String r6 = ". Setting mimeType to "
                java.lang.String r17 = "audio/raw"
                java.lang.String r11 = "MatroskaExtractor"
                java.lang.String r10 = "audio/x-unknown"
                r8 = 0
                switch(r1) {
                    case 0: goto L_0x0415;
                    case 1: goto L_0x0415;
                    case 2: goto L_0x03c5;
                    case 3: goto L_0x03ba;
                    case 4: goto L_0x03a7;
                    case 5: goto L_0x039e;
                    case 6: goto L_0x039b;
                    case 7: goto L_0x037f;
                    case 8: goto L_0x036b;
                    case 9: goto L_0x0415;
                    case 10: goto L_0x0349;
                    case 11: goto L_0x033b;
                    case 12: goto L_0x0338;
                    case 13: goto L_0x031b;
                    case 14: goto L_0x0318;
                    case 15: goto L_0x0315;
                    case 16: goto L_0x0312;
                    case 17: goto L_0x030a;
                    case 18: goto L_0x0307;
                    case 19: goto L_0x0302;
                    case 20: goto L_0x02ff;
                    case 21: goto L_0x0315;
                    case 22: goto L_0x02d9;
                    case 23: goto L_0x02aa;
                    case 24: goto L_0x027f;
                    case 25: goto L_0x026c;
                    case 26: goto L_0x0251;
                    case 27: goto L_0x024b;
                    case 28: goto L_0x0247;
                    case 29: goto L_0x0243;
                    case 30: goto L_0x023f;
                    case 31: goto L_0x0231;
                    case 32: goto L_0x01ed;
                    default: goto L_0x01e6;
                }
            L_0x01e6:
                java.lang.String r1 = "Unrecognized codec identifier."
                n2.y2 r1 = n2.y2.a(r1, r8)
                throw r1
            L_0x01ed:
                r16 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r9)
                java.lang.String r3 = r0.f23789b
                byte[] r3 = r0.g(r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r10 = r0.R
                java.nio.ByteBuffer r3 = r3.putLong(r10)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r6 = r0.S
                java.nio.ByteBuffer r3 = r3.putLong(r6)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r17 = "audio/opus"
                r3 = r8
                r4 = -1
                r6 = 5760(0x1680, float:8.071E-42)
                goto L_0x0423
            L_0x0231:
                java.lang.String r1 = r0.f23789b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r17 = "audio/flac"
                goto L_0x0398
            L_0x023f:
                java.lang.String r17 = "audio/eac3"
                goto L_0x030c
            L_0x0243:
                java.lang.String r17 = "video/mpeg2"
                goto L_0x030c
            L_0x0247:
                r17 = r5
                goto L_0x030c
            L_0x024b:
                r1 = r8
                r3 = r1
                r17 = r14
                goto L_0x030e
            L_0x0251:
                k4.a0 r1 = new k4.a0
                java.lang.String r3 = r0.f23789b
                byte[] r3 = r0.g(r3)
                r1.<init>((byte[]) r3)
                l4.f r1 = l4.f.a(r1)
                java.util.List<byte[]> r3 = r1.f19927a
                int r4 = r1.f19928b
                r0.Y = r4
                java.lang.String r1 = r1.f19935i
                java.lang.String r17 = "video/hevc"
                goto L_0x0362
            L_0x026c:
                byte[] r1 = y2.e.f23754e0
                java.lang.String r3 = r0.f23789b
                byte[] r3 = r0.g(r3)
                s6.u r1 = s6.u.A(r1, r3)
                r3 = r8
                r17 = r15
                goto L_0x030e
            L_0x027f:
                int r1 = r0.P
                int r1 = k4.n0.b0(r1)
                if (r1 != 0) goto L_0x02a5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported little endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                k4.r.i(r11, r1)
                goto L_0x040f
            L_0x02a5:
                r4 = r1
                r1 = r8
                r3 = r1
                goto L_0x030f
            L_0x02aa:
                int r1 = r0.P
                if (r1 != r7) goto L_0x02b2
                r1 = r8
                r3 = r1
                r4 = 3
                goto L_0x030f
            L_0x02b2:
                if (r1 != r4) goto L_0x02bb
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                r1 = r8
                r3 = r1
                r4 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x030f
            L_0x02bb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported big endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                k4.r.i(r11, r1)
                goto L_0x040f
            L_0x02d9:
                int r1 = r0.P
                if (r1 != r3) goto L_0x02e1
                r1 = r8
                r3 = r1
                r4 = 4
                goto L_0x030f
            L_0x02e1:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported floating point PCM bit depth: "
                r1.append(r3)
                int r3 = r0.P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                k4.r.i(r11, r1)
                goto L_0x040f
            L_0x02ff:
                java.lang.String r17 = "video/x-unknown"
                goto L_0x030c
            L_0x0302:
                r1 = r8
                r3 = r1
                r17 = r12
                goto L_0x030e
            L_0x0307:
                java.lang.String r17 = "video/x-vnd.on2.vp9"
                goto L_0x030c
            L_0x030a:
                java.lang.String r17 = "video/x-vnd.on2.vp8"
            L_0x030c:
                r1 = r8
                r3 = r1
            L_0x030e:
                r4 = -1
            L_0x030f:
                r6 = -1
                goto L_0x0423
            L_0x0312:
                java.lang.String r17 = "video/av01"
                goto L_0x030c
            L_0x0315:
                java.lang.String r17 = "audio/vnd.dts"
                goto L_0x030c
            L_0x0318:
                java.lang.String r17 = "audio/ac3"
                goto L_0x030c
            L_0x031b:
                java.lang.String r1 = r0.f23789b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.f23798k
                p2.a$b r3 = p2.a.f(r3)
                int r4 = r3.f21130a
                r0.Q = r4
                int r4 = r3.f21131b
                r0.O = r4
                java.lang.String r3 = r3.f21132c
                java.lang.String r17 = "audio/mp4a-latm"
                goto L_0x030e
            L_0x0338:
                java.lang.String r17 = "audio/vnd.dts.hd"
                goto L_0x030c
            L_0x033b:
                java.lang.String r1 = r0.f23789b
                byte[] r1 = r0.g(r1)
                s6.u r1 = s6.u.z(r1)
                r3 = r8
                r17 = r13
                goto L_0x030e
            L_0x0349:
                k4.a0 r1 = new k4.a0
                java.lang.String r3 = r0.f23789b
                byte[] r3 = r0.g(r3)
                r1.<init>((byte[]) r3)
                l4.a r1 = l4.a.b(r1)
                java.util.List<byte[]> r3 = r1.f19893a
                int r4 = r1.f19894b
                r0.Y = r4
                java.lang.String r1 = r1.f19898f
                java.lang.String r17 = "video/avc"
            L_0x0362:
                r4 = -1
                r6 = -1
                r18 = r3
                r3 = r1
                r1 = r18
                goto L_0x0423
            L_0x036b:
                r1 = 4
                byte[] r3 = new byte[r1]
                java.lang.String r4 = r0.f23789b
                byte[] r4 = r0.g(r4)
                r6 = 0
                java.lang.System.arraycopy(r4, r6, r3, r6, r1)
                s6.u r1 = s6.u.z(r3)
                r17 = r2
                goto L_0x0398
            L_0x037f:
                k4.a0 r1 = new k4.a0
                java.lang.String r3 = r0.f23789b
                byte[] r3 = r0.g(r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = k(r1)
                java.lang.Object r3 = r1.first
                r17 = r3
                java.lang.String r17 = (java.lang.String) r17
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x0398:
                r3 = r8
                goto L_0x030e
            L_0x039b:
                java.lang.String r17 = "audio/mpeg"
                goto L_0x03a0
            L_0x039e:
                java.lang.String r17 = "audio/mpeg-L2"
            L_0x03a0:
                r1 = r8
                r3 = r1
                r4 = -1
                r6 = 4096(0x1000, float:5.74E-42)
                goto L_0x0423
            L_0x03a7:
                r16 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.f23789b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = m(r1)
                java.lang.String r17 = "audio/vorbis"
                r3 = r8
                r4 = -1
                r6 = 8192(0x2000, float:1.14794E-41)
                goto L_0x0423
            L_0x03ba:
                s2.f0 r1 = new s2.f0
                r1.<init>()
                r0.T = r1
                java.lang.String r17 = "audio/true-hd"
                goto L_0x030c
            L_0x03c5:
                k4.a0 r1 = new k4.a0
                java.lang.String r3 = r0.f23789b
                byte[] r3 = r0.g(r3)
                r1.<init>((byte[]) r3)
                boolean r1 = l(r1)
                if (r1 == 0) goto L_0x03fb
                int r1 = r0.P
                int r1 = k4.n0.b0(r1)
                if (r1 != 0) goto L_0x02a5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r1.append(r3)
                int r3 = r0.P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                k4.r.i(r11, r1)
                goto L_0x040f
            L_0x03fb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r3)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                k4.r.i(r11, r1)
            L_0x040f:
                r1 = r8
                r3 = r1
                r17 = r10
                goto L_0x030e
            L_0x0415:
                byte[] r1 = r0.f23798k
                if (r1 != 0) goto L_0x041b
                r1 = r8
                goto L_0x041f
            L_0x041b:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x041f:
                java.lang.String r17 = "video/mp4v-es"
                goto L_0x0398
            L_0x0423:
                byte[] r7 = r0.N
                if (r7 == 0) goto L_0x0438
                k4.a0 r7 = new k4.a0
                byte[] r10 = r0.N
                r7.<init>((byte[]) r10)
                l4.d r7 = l4.d.a(r7)
                if (r7 == 0) goto L_0x0438
                java.lang.String r3 = r7.f19912c
                java.lang.String r17 = "video/dolby-vision"
            L_0x0438:
                r7 = r17
                boolean r10 = r0.V
                r11 = 0
                r10 = r10 | r11
                boolean r9 = r0.U
                if (r9 == 0) goto L_0x0444
                r9 = 2
                goto L_0x0445
            L_0x0444:
                r9 = 0
            L_0x0445:
                r9 = r9 | r10
                n2.r1$b r10 = new n2.r1$b
                r10.<init>()
                boolean r17 = k4.v.o(r7)
                if (r17 == 0) goto L_0x0463
                int r2 = r0.O
                n2.r1$b r2 = r10.J(r2)
                int r5 = r0.Q
                n2.r1$b r2 = r2.h0(r5)
                r2.a0(r4)
                r5 = 1
                goto L_0x056a
            L_0x0463:
                boolean r4 = k4.v.s(r7)
                if (r4 == 0) goto L_0x053d
                int r2 = r0.f23804q
                if (r2 != 0) goto L_0x047f
                int r2 = r0.f23802o
                r4 = -1
                if (r2 != r4) goto L_0x0474
                int r2 = r0.f23800m
            L_0x0474:
                r0.f23802o = r2
                int r2 = r0.f23803p
                if (r2 != r4) goto L_0x047c
                int r2 = r0.f23801n
            L_0x047c:
                r0.f23803p = r2
                goto L_0x0480
            L_0x047f:
                r4 = -1
            L_0x0480:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = r0.f23802o
                if (r5 == r4) goto L_0x0495
                int r12 = r0.f23803p
                if (r12 == r4) goto L_0x0495
                int r2 = r0.f23801n
                int r2 = r2 * r5
                float r2 = (float) r2
                int r5 = r0.f23800m
                int r5 = r5 * r12
                float r5 = (float) r5
                float r2 = r2 / r5
            L_0x0495:
                boolean r5 = r0.f23811x
                if (r5 == 0) goto L_0x04a8
                byte[] r5 = r19.h()
                l4.c r8 = new l4.c
                int r12 = r0.f23812y
                int r13 = r0.A
                int r14 = r0.f23813z
                r8.<init>(r12, r13, r14, r5)
            L_0x04a8:
                java.lang.String r5 = r0.f23788a
                if (r5 == 0) goto L_0x04c8
                java.util.Map r5 = y2.e.f23758i0
                java.lang.String r12 = r0.f23788a
                boolean r5 = r5.containsKey(r12)
                if (r5 == 0) goto L_0x04c8
                java.util.Map r4 = y2.e.f23758i0
                java.lang.String r5 = r0.f23788a
                java.lang.Object r4 = r4.get(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
            L_0x04c8:
                int r5 = r0.f23805r
                if (r5 != 0) goto L_0x0518
                float r5 = r0.f23806s
                r12 = 0
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x0518
                float r5 = r0.f23807t
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x0518
                float r5 = r0.f23808u
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x04e7
                r4 = 0
                goto L_0x0518
            L_0x04e7:
                float r5 = r0.f23807t
                r11 = 1119092736(0x42b40000, float:90.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x04f4
                r4 = 90
                goto L_0x0518
            L_0x04f4:
                float r5 = r0.f23807t
                r11 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 == 0) goto L_0x0516
                float r5 = r0.f23807t
                r11 = 1127481344(0x43340000, float:180.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x0509
                goto L_0x0516
            L_0x0509:
                float r5 = r0.f23807t
                r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x0518
                r4 = 270(0x10e, float:3.78E-43)
                goto L_0x0518
            L_0x0516:
                r4 = 180(0xb4, float:2.52E-43)
            L_0x0518:
                int r5 = r0.f23800m
                n2.r1$b r5 = r10.n0(r5)
                int r11 = r0.f23801n
                n2.r1$b r5 = r5.S(r11)
                n2.r1$b r2 = r5.c0(r2)
                n2.r1$b r2 = r2.f0(r4)
                byte[] r4 = r0.f23809v
                n2.r1$b r2 = r2.d0(r4)
                int r4 = r0.f23810w
                n2.r1$b r2 = r2.j0(r4)
                r2.L(r8)
                r5 = 2
                goto L_0x056a
            L_0x053d:
                boolean r4 = r5.equals(r7)
                if (r4 != 0) goto L_0x0569
                boolean r4 = r15.equals(r7)
                if (r4 != 0) goto L_0x0569
                boolean r4 = r14.equals(r7)
                if (r4 != 0) goto L_0x0569
                boolean r4 = r13.equals(r7)
                if (r4 != 0) goto L_0x0569
                boolean r4 = r12.equals(r7)
                if (r4 != 0) goto L_0x0569
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0562
                goto L_0x0569
            L_0x0562:
                java.lang.String r1 = "Unexpected MIME type."
                n2.y2 r1 = n2.y2.a(r1, r8)
                throw r1
            L_0x0569:
                r5 = 3
            L_0x056a:
                java.lang.String r2 = r0.f23788a
                if (r2 == 0) goto L_0x057f
                java.util.Map r2 = y2.e.f23758i0
                java.lang.String r4 = r0.f23788a
                boolean r2 = r2.containsKey(r4)
                if (r2 != 0) goto L_0x057f
                java.lang.String r2 = r0.f23788a
                r10.W(r2)
            L_0x057f:
                r2 = r21
                n2.r1$b r2 = r10.T(r2)
                n2.r1$b r2 = r2.g0(r7)
                n2.r1$b r2 = r2.Y(r6)
                java.lang.String r4 = r0.W
                n2.r1$b r2 = r2.X(r4)
                n2.r1$b r2 = r2.i0(r9)
                n2.r1$b r1 = r2.V(r1)
                n2.r1$b r1 = r1.K(r3)
                r2.m r2 = r0.f23799l
                n2.r1$b r1 = r1.O(r2)
                n2.r1 r1 = r1.G()
                int r2 = r0.f23790c
                r3 = r20
                s2.e0 r2 = r3.e(r2, r5)
                r0.X = r2
                r2.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y2.e.c.i(s2.n, int):void");
        }

        public void j() {
            f0 f0Var = this.T;
            if (f0Var != null) {
                f0Var.a(this.X, this.f23797j);
            }
        }

        public void n() {
            f0 f0Var = this.T;
            if (f0Var != null) {
                f0Var.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f23758i0 = Collections.unmodifiableMap(hashMap);
    }

    public e() {
        this(0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ l[] A() {
        return new l[]{new e()};
    }

    private boolean B(s2.a0 a0Var, long j10) {
        if (this.f23785y) {
            this.A = j10;
            a0Var.f22378a = this.f23786z;
            this.f23785y = false;
            return true;
        }
        if (this.f23782v) {
            long j11 = this.A;
            if (j11 != -1) {
                a0Var.f22378a = j11;
                this.A = -1;
                return true;
            }
        }
        return false;
    }

    private void C(m mVar, int i10) throws IOException {
        if (this.f23767g.g() < i10) {
            if (this.f23767g.b() < i10) {
                a0 a0Var = this.f23767g;
                a0Var.c(Math.max(a0Var.b() * 2, i10));
            }
            mVar.readFully(this.f23767g.e(), this.f23767g.g(), i10 - this.f23767g.g());
            this.f23767g.S(i10);
        }
    }

    private void D() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = 0;
        this.f23760a0 = false;
        this.f23770j.P(0);
    }

    private long E(long j10) throws y2 {
        long j11 = this.f23778r;
        if (j11 != -9223372036854775807L) {
            return n0.O0(j10, j11, 1000);
        }
        throw y2.a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    private static void F(String str, long j10, byte[] bArr) {
        int i10;
        byte[] bArr2;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bArr2 = s(j10, "%01d:%02d:%02d:%02d", UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                i10 = 21;
                break;
            case 1:
                bArr2 = s(j10, "%02d:%02d:%02d.%03d", 1000);
                i10 = 25;
                break;
            case 2:
                bArr2 = s(j10, "%02d:%02d:%02d,%03d", 1000);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
    }

    private int I(m mVar, c cVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f23789b)) {
            J(mVar, f23753d0, i10);
            return q();
        } else if ("S_TEXT/ASS".equals(cVar.f23789b)) {
            J(mVar, f23755f0, i10);
            return q();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f23789b)) {
            J(mVar, f23756g0, i10);
            return q();
        } else {
            e0 e0Var = cVar.X;
            boolean z11 = true;
            if (!this.V) {
                if (cVar.f23795h) {
                    this.O &= -1073741825;
                    int i12 = 128;
                    if (!this.W) {
                        mVar.readFully(this.f23767g.e(), 0, 1);
                        this.S++;
                        if ((this.f23767g.e()[0] & 128) != 128) {
                            this.Z = this.f23767g.e()[0];
                            this.W = true;
                        } else {
                            throw y2.a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b10 = this.Z;
                    if ((b10 & 1) == 1) {
                        boolean z12 = (b10 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.f23760a0) {
                            mVar.readFully(this.f23772l.e(), 0, 8);
                            this.S += 8;
                            this.f23760a0 = true;
                            byte[] e10 = this.f23767g.e();
                            if (!z12) {
                                i12 = 0;
                            }
                            e10[0] = (byte) (i12 | 8);
                            this.f23767g.T(0);
                            e0Var.f(this.f23767g, 1, 1);
                            this.T++;
                            this.f23772l.T(0);
                            e0Var.f(this.f23772l, 8, 1);
                            this.T += 8;
                        }
                        if (z12) {
                            if (!this.X) {
                                mVar.readFully(this.f23767g.e(), 0, 1);
                                this.S++;
                                this.f23767g.T(0);
                                this.Y = this.f23767g.G();
                                this.X = true;
                            }
                            int i13 = this.Y * 4;
                            this.f23767g.P(i13);
                            mVar.readFully(this.f23767g.e(), 0, i13);
                            this.S += i13;
                            short s10 = (short) ((this.Y / 2) + 1);
                            int i14 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f23775o;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f23775o = ByteBuffer.allocate(i14);
                            }
                            this.f23775o.position(0);
                            this.f23775o.putShort(s10);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i11 = this.Y;
                                if (i15 >= i11) {
                                    break;
                                }
                                int K2 = this.f23767g.K();
                                if (i15 % 2 == 0) {
                                    this.f23775o.putShort((short) (K2 - i16));
                                } else {
                                    this.f23775o.putInt(K2 - i16);
                                }
                                i15++;
                                i16 = K2;
                            }
                            int i17 = (i10 - this.S) - i16;
                            if (i11 % 2 == 1) {
                                this.f23775o.putInt(i17);
                            } else {
                                this.f23775o.putShort((short) i17);
                                this.f23775o.putInt(0);
                            }
                            this.f23773m.R(this.f23775o.array(), i14);
                            e0Var.f(this.f23773m, i14, 1);
                            this.T += i14;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f23796i;
                    if (bArr != null) {
                        this.f23770j.R(bArr, bArr.length);
                    }
                }
                if (cVar.o(z10)) {
                    this.O |= 268435456;
                    this.f23774n.P(0);
                    int g10 = (this.f23770j.g() + i10) - this.S;
                    this.f23767g.P(4);
                    this.f23767g.e()[0] = (byte) ((g10 >> 24) & 255);
                    this.f23767g.e()[1] = (byte) ((g10 >> 16) & 255);
                    this.f23767g.e()[2] = (byte) ((g10 >> 8) & 255);
                    this.f23767g.e()[3] = (byte) (g10 & 255);
                    e0Var.f(this.f23767g, 4, 2);
                    this.T += 4;
                }
                this.V = true;
            }
            int g11 = i10 + this.f23770j.g();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f23789b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f23789b)) {
                if (cVar.T != null) {
                    if (this.f23770j.g() != 0) {
                        z11 = false;
                    }
                    k4.a.f(z11);
                    cVar.T.d(mVar);
                }
                while (true) {
                    int i18 = this.S;
                    if (i18 >= g11) {
                        break;
                    }
                    int K3 = K(mVar, e0Var, g11 - i18);
                    this.S += K3;
                    this.T += K3;
                }
            } else {
                byte[] e11 = this.f23766f.e();
                e11[0] = 0;
                e11[1] = 0;
                e11[2] = 0;
                int i19 = cVar.Y;
                int i20 = 4 - i19;
                while (this.S < g11) {
                    int i21 = this.U;
                    if (i21 == 0) {
                        L(mVar, e11, i20, i19);
                        this.S += i19;
                        this.f23766f.T(0);
                        this.U = this.f23766f.K();
                        this.f23765e.T(0);
                        e0Var.d(this.f23765e, 4);
                        this.T += 4;
                    } else {
                        int K4 = K(mVar, e0Var, i21);
                        this.S += K4;
                        this.T += K4;
                        this.U -= K4;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f23789b)) {
                this.f23768h.T(0);
                e0Var.d(this.f23768h, 4);
                this.T += 4;
            }
            return q();
        }
    }

    private void J(m mVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f23771k.b() < length) {
            this.f23771k.Q(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f23771k.e(), 0, bArr.length);
        }
        mVar.readFully(this.f23771k.e(), bArr.length, i10);
        this.f23771k.T(0);
        this.f23771k.S(length);
    }

    private int K(m mVar, e0 e0Var, int i10) throws IOException {
        int a10 = this.f23770j.a();
        if (a10 <= 0) {
            return e0Var.e(mVar, i10, false);
        }
        int min = Math.min(i10, a10);
        e0Var.d(this.f23770j, min);
        return min;
    }

    private void L(m mVar, byte[] bArr, int i10, int i11) throws IOException {
        int min = Math.min(i11, this.f23770j.a());
        mVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f23770j.l(bArr, i10, min);
        }
    }

    private void i(int i10) throws y2 {
        if (this.C == null || this.D == null) {
            throw y2.a("Element " + i10 + " must be in a Cues", (Throwable) null);
        }
    }

    private void j(int i10) throws y2 {
        if (this.f23781u == null) {
            throw y2.a("Element " + i10 + " must be in a TrackEntry", (Throwable) null);
        }
    }

    private void k() {
        k4.a.h(this.f23762b0);
    }

    private b0 m(s sVar, s sVar2) {
        int i10;
        if (this.f23777q == -1 || this.f23780t == -9223372036854775807L || sVar == null || sVar.c() == 0 || sVar2 == null || sVar2.c() != sVar.c()) {
            return new b0.b(this.f23780t);
        }
        int c10 = sVar.c();
        int[] iArr = new int[c10];
        long[] jArr = new long[c10];
        long[] jArr2 = new long[c10];
        long[] jArr3 = new long[c10];
        int i11 = 0;
        for (int i12 = 0; i12 < c10; i12++) {
            jArr3[i12] = sVar.b(i12);
            jArr[i12] = this.f23777q + sVar2.b(i12);
        }
        while (true) {
            i10 = c10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f23777q + this.f23776p) - jArr[i10]);
        jArr2[i10] = this.f23780t - jArr3[i10];
        long j10 = jArr2[i10];
        if (j10 <= 0) {
            k4.r.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new d(iArr, jArr, jArr2, jArr3);
    }

    private void n(c cVar, long j10, int i10, int i11, int i12) {
        f0 f0Var = cVar.T;
        if (f0Var != null) {
            f0Var.c(cVar.X, j10, i10, i11, i12, cVar.f23797j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f23789b) || "S_TEXT/ASS".equals(cVar.f23789b) || "S_TEXT/WEBVTT".equals(cVar.f23789b)) {
                if (this.K > 1) {
                    k4.r.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        k4.r.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        F(cVar.f23789b, j11, this.f23771k.e());
                        int f10 = this.f23771k.f();
                        while (true) {
                            if (f10 >= this.f23771k.g()) {
                                break;
                            } else if (this.f23771k.e()[f10] == 0) {
                                this.f23771k.S(f10);
                                break;
                            } else {
                                f10++;
                            }
                        }
                        e0 e0Var = cVar.X;
                        a0 a0Var = this.f23771k;
                        e0Var.d(a0Var, a0Var.g());
                        i11 += this.f23771k.g();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    this.f23774n.P(0);
                } else {
                    int g10 = this.f23774n.g();
                    cVar.X.f(this.f23774n, g10, 2);
                    i11 += g10;
                }
            }
            cVar.X.b(j10, i10, i11, i12, cVar.f23797j);
        }
        this.F = true;
    }

    private static int[] p(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    private int q() {
        int i10 = this.T;
        D();
        return i10;
    }

    private static byte[] s(long j10, String str, long j11) {
        k4.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((((long) i10) * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((((long) i11) * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return n0.m0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))}));
    }

    private static boolean y(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = 8;
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = 9;
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = 10;
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = 12;
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = 13;
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    public void G(int i10, long j10, long j11) throws y2 {
        k();
        if (i10 == 160) {
            this.Q = false;
            this.R = 0;
        } else if (i10 == 174) {
            this.f23781u = new c();
        } else if (i10 == 187) {
            this.E = false;
        } else if (i10 == 19899) {
            this.f23783w = -1;
            this.f23784x = -1;
        } else if (i10 == 20533) {
            t(i10).f23795h = true;
        } else if (i10 == 21968) {
            t(i10).f23811x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f23777q;
            if (j12 == -1 || j12 == j10) {
                this.f23777q = j10;
                this.f23776p = j11;
                return;
            }
            throw y2.a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i10 == 475249515) {
            this.C = new s();
            this.D = new s();
        } else if (i10 != 524531317 || this.f23782v) {
        } else {
            if (!this.f23764d || this.f23786z == -1) {
                this.f23762b0.j(new b0.b(this.f23780t));
                this.f23782v = true;
                return;
            }
            this.f23785y = true;
        }
    }

    /* access modifiers changed from: protected */
    public void H(int i10, String str) throws y2 {
        if (i10 == 134) {
            t(i10).f23789b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                t(i10).f23788a = str;
            } else if (i10 == 2274716) {
                String unused = t(i10).W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw y2.a("DocType " + str + " not supported", (Throwable) null);
        }
    }

    public final void b(n nVar) {
        this.f23762b0 = nVar;
    }

    public void c(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f23759a.reset();
        this.f23761b.e();
        D();
        for (int i10 = 0; i10 < this.f23763c.size(); i10++) {
            this.f23763c.valueAt(i10).n();
        }
    }

    public final boolean e(m mVar) throws IOException {
        return new f().b(mVar);
    }

    public final int g(m mVar, s2.a0 a0Var) throws IOException {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f23759a.a(mVar);
            if (z10 && B(a0Var, mVar.c())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f23763c.size(); i10++) {
            c valueAt = this.f23763c.valueAt(i10);
            valueAt.f();
            valueAt.j();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void l(int i10, int i11, m mVar) throws IOException {
        c cVar;
        c cVar2;
        c cVar3;
        long j10;
        long j11;
        int i12;
        byte b10;
        int[] iArr;
        int i13 = i10;
        int i14 = i11;
        m mVar2 = mVar;
        int i15 = 0;
        int i16 = 1;
        if (i13 == 161 || i13 == 163) {
            if (this.G == 0) {
                this.M = (int) this.f23761b.d(mVar2, false, true, 8);
                this.N = this.f23761b.b();
                this.I = -9223372036854775807L;
                this.G = 1;
                this.f23767g.P(0);
            }
            c cVar4 = this.f23763c.get(this.M);
            if (cVar4 == null) {
                mVar2.m(i14 - this.N);
                this.G = 0;
                return;
            }
            cVar4.f();
            if (this.G == 1) {
                C(mVar2, 3);
                int i17 = (this.f23767g.e()[2] & 6) >> 1;
                byte b11 = 255;
                if (i17 == 0) {
                    this.K = 1;
                    int[] p10 = p(this.L, 1);
                    this.L = p10;
                    p10[0] = (i14 - this.N) - 3;
                } else {
                    int i18 = 4;
                    C(mVar2, 4);
                    int i19 = (this.f23767g.e()[3] & 255) + 1;
                    this.K = i19;
                    int[] p11 = p(this.L, i19);
                    this.L = p11;
                    if (i17 == 2) {
                        int i20 = this.K;
                        Arrays.fill(p11, 0, i20, ((i14 - this.N) - 4) / i20);
                    } else if (i17 == 1) {
                        int i21 = 0;
                        int i22 = 0;
                        while (true) {
                            i12 = this.K;
                            if (i21 >= i12 - 1) {
                                break;
                            }
                            this.L[i21] = 0;
                            do {
                                i18++;
                                C(mVar2, i18);
                                b10 = this.f23767g.e()[i18 - 1] & 255;
                                iArr = this.L;
                                iArr[i21] = iArr[i21] + b10;
                            } while (b10 == 255);
                            i22 += iArr[i21];
                            i21++;
                        }
                        this.L[i12 - 1] = ((i14 - this.N) - i18) - i22;
                    } else if (i17 == 3) {
                        int i23 = 0;
                        int i24 = 0;
                        while (true) {
                            int i25 = this.K;
                            if (i23 >= i25 - 1) {
                                cVar2 = cVar4;
                                this.L[i25 - 1] = ((i14 - this.N) - i18) - i24;
                                break;
                            }
                            this.L[i23] = i15;
                            i18++;
                            C(mVar2, i18);
                            int i26 = i18 - 1;
                            if (this.f23767g.e()[i26] != 0) {
                                int i27 = 0;
                                while (true) {
                                    if (i27 >= 8) {
                                        cVar3 = cVar4;
                                        j10 = 0;
                                        break;
                                    }
                                    int i28 = i16 << (7 - i27);
                                    if ((this.f23767g.e()[i26] & i28) != 0) {
                                        int i29 = i18 + i27;
                                        C(mVar2, i29);
                                        cVar3 = cVar4;
                                        long j12 = (long) ((~i28) & this.f23767g.e()[i26] & b11);
                                        int i30 = i26 + 1;
                                        while (true) {
                                            j11 = j12;
                                            if (i30 >= i29) {
                                                break;
                                            }
                                            j12 = (j11 << 8) | ((long) (this.f23767g.e()[i30] & b11));
                                            i30++;
                                            i29 = i29;
                                            b11 = 255;
                                        }
                                        int i31 = i29;
                                        if (i23 > 0) {
                                            j11 -= (1 << ((i27 * 7) + 6)) - 1;
                                        }
                                        j10 = j11;
                                        i18 = i31;
                                    } else {
                                        c cVar5 = cVar4;
                                        i27++;
                                        i16 = 1;
                                        b11 = 255;
                                    }
                                }
                                if (j10 >= -2147483648L && j10 <= 2147483647L) {
                                    int i32 = (int) j10;
                                    int[] iArr2 = this.L;
                                    if (i23 != 0) {
                                        i32 += iArr2[i23 - 1];
                                    }
                                    iArr2[i23] = i32;
                                    i24 += iArr2[i23];
                                    i23++;
                                    cVar4 = cVar3;
                                    i15 = 0;
                                    i16 = 1;
                                    b11 = 255;
                                }
                            } else {
                                throw y2.a("No valid varint length mask found", (Throwable) null);
                            }
                        }
                        throw y2.a("EBML lacing sample size out of range.", (Throwable) null);
                    } else {
                        throw y2.a("Unexpected lacing value: " + i17, (Throwable) null);
                    }
                }
                cVar2 = cVar4;
                this.H = this.B + E((long) ((this.f23767g.e()[0] << 8) | (this.f23767g.e()[1] & 255)));
                cVar = cVar2;
                this.O = (cVar.f23791d == 2 || (i13 == 163 && (this.f23767g.e()[2] & 128) == 128)) ? 1 : 0;
                this.G = 2;
                this.J = 0;
            } else {
                cVar = cVar4;
            }
            if (i13 == 163) {
                while (true) {
                    int i33 = this.J;
                    if (i33 < this.K) {
                        n(cVar, ((long) ((this.J * cVar.f23792e) / 1000)) + this.H, this.O, I(mVar2, cVar, this.L[i33], false), 0);
                        this.J++;
                    } else {
                        this.G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i34 = this.J;
                    if (i34 < this.K) {
                        int[] iArr3 = this.L;
                        iArr3[i34] = I(mVar2, cVar, iArr3[i34], true);
                        this.J++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i13 != 165) {
            if (i13 == 16877) {
                v(t(i10), mVar2, i14);
            } else if (i13 == 16981) {
                j(i10);
                byte[] bArr = new byte[i14];
                this.f23781u.f23796i = bArr;
                mVar2.readFully(bArr, 0, i14);
            } else if (i13 == 18402) {
                byte[] bArr2 = new byte[i14];
                mVar2.readFully(bArr2, 0, i14);
                t(i10).f23797j = new e0.a(1, bArr2, 0, 0);
            } else if (i13 == 21419) {
                Arrays.fill(this.f23769i.e(), (byte) 0);
                mVar2.readFully(this.f23769i.e(), 4 - i14, i14);
                this.f23769i.T(0);
                this.f23783w = (int) this.f23769i.I();
            } else if (i13 == 25506) {
                j(i10);
                byte[] bArr3 = new byte[i14];
                this.f23781u.f23798k = bArr3;
                mVar2.readFully(bArr3, 0, i14);
            } else if (i13 == 30322) {
                j(i10);
                byte[] bArr4 = new byte[i14];
                this.f23781u.f23809v = bArr4;
                mVar2.readFully(bArr4, 0, i14);
            } else {
                throw y2.a("Unexpected id: " + i13, (Throwable) null);
            }
        } else if (this.G == 2) {
            w(this.f23763c.get(this.M), this.P, mVar2, i14);
        }
    }

    /* access modifiers changed from: protected */
    public void o(int i10) throws y2 {
        k();
        if (i10 != 160) {
            if (i10 == 174) {
                c cVar = (c) k4.a.h(this.f23781u);
                String str = cVar.f23789b;
                if (str != null) {
                    if (y(str)) {
                        cVar.i(this.f23762b0, cVar.f23790c);
                        this.f23763c.put(cVar.f23790c, cVar);
                    }
                    this.f23781u = null;
                    return;
                }
                throw y2.a("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i10 == 19899) {
                int i11 = this.f23783w;
                if (i11 != -1) {
                    long j10 = this.f23784x;
                    if (j10 != -1) {
                        if (i11 == 475249515) {
                            this.f23786z = j10;
                            return;
                        }
                        return;
                    }
                }
                throw y2.a("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i10 == 25152) {
                j(i10);
                c cVar2 = this.f23781u;
                if (!cVar2.f23795h) {
                    return;
                }
                if (cVar2.f23797j != null) {
                    cVar2.f23799l = new r2.m(new m.b(i.f20436a, MimeTypes.VIDEO_WEBM, this.f23781u.f23797j.f22400b));
                    return;
                }
                throw y2.a("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i10 == 28032) {
                j(i10);
                c cVar3 = this.f23781u;
                if (cVar3.f23795h && cVar3.f23796i != null) {
                    throw y2.a("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i10 == 357149030) {
                if (this.f23778r == -9223372036854775807L) {
                    this.f23778r = 1000000;
                }
                long j11 = this.f23779s;
                if (j11 != -9223372036854775807L) {
                    this.f23780t = E(j11);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515) {
                    if (!this.f23782v) {
                        this.f23762b0.j(m(this.C, this.D));
                        this.f23782v = true;
                    }
                    this.C = null;
                    this.D = null;
                }
            } else if (this.f23763c.size() != 0) {
                this.f23762b0.q();
            } else {
                throw y2.a("No valid tracks were found", (Throwable) null);
            }
        } else if (this.G == 2) {
            c cVar4 = this.f23763c.get(this.M);
            cVar4.f();
            if (this.R > 0 && "A_OPUS".equals(cVar4.f23789b)) {
                this.f23774n.Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.K; i13++) {
                i12 += this.L[i13];
            }
            int i14 = 0;
            while (i14 < this.K) {
                long j12 = this.H + ((long) ((cVar4.f23792e * i14) / 1000));
                int i15 = this.O;
                if (i14 == 0 && !this.Q) {
                    i15 |= 1;
                }
                int i16 = this.L[i14];
                int i17 = i12 - i16;
                n(cVar4, j12, i15, i16, i17);
                i14++;
                i12 = i17;
            }
            this.G = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void r(int i10, double d10) throws y2 {
        if (i10 == 181) {
            t(i10).Q = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    t(i10).D = (float) d10;
                    return;
                case 21970:
                    t(i10).E = (float) d10;
                    return;
                case 21971:
                    t(i10).F = (float) d10;
                    return;
                case 21972:
                    t(i10).G = (float) d10;
                    return;
                case 21973:
                    t(i10).H = (float) d10;
                    return;
                case 21974:
                    t(i10).I = (float) d10;
                    return;
                case 21975:
                    t(i10).J = (float) d10;
                    return;
                case 21976:
                    t(i10).K = (float) d10;
                    return;
                case 21977:
                    t(i10).L = (float) d10;
                    return;
                case 21978:
                    t(i10).M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            t(i10).f23806s = (float) d10;
                            return;
                        case 30324:
                            t(i10).f23807t = (float) d10;
                            return;
                        case 30325:
                            t(i10).f23808u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f23779s = (long) d10;
        }
    }

    public final void release() {
    }

    /* access modifiers changed from: protected */
    public c t(int i10) throws y2 {
        j(i10);
        return this.f23781u;
    }

    /* access modifiers changed from: protected */
    public int u(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void v(c cVar, s2.m mVar, int i10) throws IOException {
        if (cVar.f23794g == 1685485123 || cVar.f23794g == 1685480259) {
            byte[] bArr = new byte[i10];
            cVar.N = bArr;
            mVar.readFully(bArr, 0, i10);
            return;
        }
        mVar.m(i10);
    }

    /* access modifiers changed from: protected */
    public void w(c cVar, int i10, s2.m mVar, int i11) throws IOException {
        if (i10 != 4 || !"V_VP9".equals(cVar.f23789b)) {
            mVar.m(i11);
            return;
        }
        this.f23774n.P(i11);
        mVar.readFully(this.f23774n.e(), 0, i11);
    }

    /* access modifiers changed from: protected */
    public void x(int i10, long j10) throws y2 {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        t(i10).f23791d = (int) j10;
                        return;
                    case 136:
                        c t10 = t(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        t10.V = z10;
                        return;
                    case 155:
                        this.I = E(j10);
                        return;
                    case 159:
                        t(i10).O = (int) j10;
                        return;
                    case 176:
                        t(i10).f23800m = (int) j10;
                        return;
                    case 179:
                        i(i10);
                        this.C.a(E(j10));
                        return;
                    case 186:
                        t(i10).f23801n = (int) j10;
                        return;
                    case 215:
                        t(i10).f23790c = (int) j10;
                        return;
                    case 231:
                        this.B = E(j10);
                        return;
                    case 238:
                        this.P = (int) j10;
                        return;
                    case 241:
                        if (!this.E) {
                            i(i10);
                            this.D.a(j10);
                            this.E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.Q = true;
                        return;
                    case 16871:
                        int unused = t(i10).f23794g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw y2.a("ContentCompAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw y2.a("DocTypeReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw y2.a("EBMLReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw y2.a("ContentEncAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw y2.a("AESSettingsCipherMode " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f23784x = j10 + this.f23777q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        j(i10);
                        if (i11 == 0) {
                            this.f23781u.f23810w = 0;
                            return;
                        } else if (i11 == 1) {
                            this.f23781u.f23810w = 2;
                            return;
                        } else if (i11 == 3) {
                            this.f23781u.f23810w = 1;
                            return;
                        } else if (i11 == 15) {
                            this.f23781u.f23810w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        t(i10).f23802o = (int) j10;
                        return;
                    case 21682:
                        t(i10).f23804q = (int) j10;
                        return;
                    case 21690:
                        t(i10).f23803p = (int) j10;
                        return;
                    case 21930:
                        c t11 = t(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        t11.U = z10;
                        return;
                    case 21998:
                        t(i10).f23793f = (int) j10;
                        return;
                    case 22186:
                        t(i10).R = j10;
                        return;
                    case 22203:
                        t(i10).S = j10;
                        return;
                    case 25188:
                        t(i10).P = (int) j10;
                        return;
                    case 30114:
                        this.R = j10;
                        return;
                    case 30321:
                        j(i10);
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.f23781u.f23805r = 0;
                            return;
                        } else if (i12 == 1) {
                            this.f23781u.f23805r = 1;
                            return;
                        } else if (i12 == 2) {
                            this.f23781u.f23805r = 2;
                            return;
                        } else if (i12 == 3) {
                            this.f23781u.f23805r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        t(i10).f23792e = (int) j10;
                        return;
                    case 2807729:
                        this.f23778r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                j(i10);
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.f23781u.A = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.f23781u.A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                j(i10);
                                int c10 = l4.c.c((int) j10);
                                if (c10 != -1) {
                                    this.f23781u.f23813z = c10;
                                    return;
                                }
                                return;
                            case 21947:
                                j(i10);
                                this.f23781u.f23811x = true;
                                int b10 = l4.c.b((int) j10);
                                if (b10 != -1) {
                                    this.f23781u.f23812y = b10;
                                    return;
                                }
                                return;
                            case 21948:
                                t(i10).B = (int) j10;
                                return;
                            case 21949:
                                t(i10).C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw y2.a("ContentEncodingScope " + j10 + " not supported", (Throwable) null);
            }
        } else if (j10 != 0) {
            throw y2.a("ContentEncodingOrder " + j10 + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean z(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public e(int i10) {
        this(new a(), i10);
    }

    e(c cVar, int i10) {
        this.f23777q = -1;
        this.f23778r = -9223372036854775807L;
        this.f23779s = -9223372036854775807L;
        this.f23780t = -9223372036854775807L;
        this.f23786z = -1;
        this.A = -1;
        this.B = -9223372036854775807L;
        this.f23759a = cVar;
        cVar.b(new b());
        this.f23764d = (i10 & 1) == 0;
        this.f23761b = new g();
        this.f23763c = new SparseArray<>();
        this.f23767g = new a0(4);
        this.f23768h = new a0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f23769i = new a0(4);
        this.f23765e = new a0(w.f19780a);
        this.f23766f = new a0(4);
        this.f23770j = new a0();
        this.f23771k = new a0();
        this.f23772l = new a0(8);
        this.f23773m = new a0();
        this.f23774n = new a0();
        this.L = new int[1];
    }
}
