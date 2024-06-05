package com.applovin.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.ej;
import com.applovin.impl.ro;
import com.applovin.impl.w6;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
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

public class tc implements i8 {

    /* renamed from: b0  reason: collision with root package name */
    public static final m8 f12327b0 = q50.f10875b;

    /* renamed from: c0  reason: collision with root package name */
    private static final byte[] f12328c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f12329d0 = yp.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: e0  reason: collision with root package name */
    private static final byte[] f12330e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public static final UUID f12331f0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public static final Map f12332g0;
    private long A;
    private long B;
    private mc C;
    private mc D;
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
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final n7 f12333a;

    /* renamed from: a0  reason: collision with root package name */
    private k8 f12334a0;

    /* renamed from: b  reason: collision with root package name */
    private final aq f12335b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f12336c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12337d;

    /* renamed from: e  reason: collision with root package name */
    private final yg f12338e;

    /* renamed from: f  reason: collision with root package name */
    private final yg f12339f;

    /* renamed from: g  reason: collision with root package name */
    private final yg f12340g;

    /* renamed from: h  reason: collision with root package name */
    private final yg f12341h;

    /* renamed from: i  reason: collision with root package name */
    private final yg f12342i;

    /* renamed from: j  reason: collision with root package name */
    private final yg f12343j;

    /* renamed from: k  reason: collision with root package name */
    private final yg f12344k;

    /* renamed from: l  reason: collision with root package name */
    private final yg f12345l;

    /* renamed from: m  reason: collision with root package name */
    private final yg f12346m;

    /* renamed from: n  reason: collision with root package name */
    private final yg f12347n;

    /* renamed from: o  reason: collision with root package name */
    private ByteBuffer f12348o;

    /* renamed from: p  reason: collision with root package name */
    private long f12349p;

    /* renamed from: q  reason: collision with root package name */
    private long f12350q;

    /* renamed from: r  reason: collision with root package name */
    private long f12351r;

    /* renamed from: s  reason: collision with root package name */
    private long f12352s;

    /* renamed from: t  reason: collision with root package name */
    private long f12353t;

    /* renamed from: u  reason: collision with root package name */
    private c f12354u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f12355v;

    /* renamed from: w  reason: collision with root package name */
    private int f12356w;

    /* renamed from: x  reason: collision with root package name */
    private long f12357x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f12358y;

    /* renamed from: z  reason: collision with root package name */
    private long f12359z;

    private final class b implements m7 {
        private b() {
        }

        public void a(int i10, int i11, j8 j8Var) {
            tc.this.a(i10, i11, j8Var);
        }

        public int b(int i10) {
            return tc.this.e(i10);
        }

        public boolean c(int i10) {
            return tc.this.f(i10);
        }

        public void a(int i10) {
            tc.this.c(i10);
        }

        public void a(int i10, double d10) {
            tc.this.a(i10, d10);
        }

        public void a(int i10, long j10) {
            tc.this.a(i10, j10);
        }

        public void a(int i10, long j10, long j11) {
            tc.this.a(i10, j10, j11);
        }

        public void a(int i10, String str) {
            tc.this.a(i10, str);
        }
    }

    private static final class c {
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public d T;
        public boolean U;
        public boolean V;
        /* access modifiers changed from: private */
        public String W;
        public ro X;
        public int Y;

        /* renamed from: a  reason: collision with root package name */
        public String f12361a;

        /* renamed from: b  reason: collision with root package name */
        public String f12362b;

        /* renamed from: c  reason: collision with root package name */
        public int f12363c;

        /* renamed from: d  reason: collision with root package name */
        public int f12364d;

        /* renamed from: e  reason: collision with root package name */
        public int f12365e;

        /* renamed from: f  reason: collision with root package name */
        public int f12366f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f12367g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12368h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f12369i;

        /* renamed from: j  reason: collision with root package name */
        public ro.a f12370j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f12371k;

        /* renamed from: l  reason: collision with root package name */
        public w6 f12372l;

        /* renamed from: m  reason: collision with root package name */
        public int f12373m;

        /* renamed from: n  reason: collision with root package name */
        public int f12374n;

        /* renamed from: o  reason: collision with root package name */
        public int f12375o;

        /* renamed from: p  reason: collision with root package name */
        public int f12376p;

        /* renamed from: q  reason: collision with root package name */
        public int f12377q;

        /* renamed from: r  reason: collision with root package name */
        public int f12378r;

        /* renamed from: s  reason: collision with root package name */
        public float f12379s;

        /* renamed from: t  reason: collision with root package name */
        public float f12380t;

        /* renamed from: u  reason: collision with root package name */
        public float f12381u;

        /* renamed from: v  reason: collision with root package name */
        public byte[] f12382v;

        /* renamed from: w  reason: collision with root package name */
        public int f12383w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f12384x;

        /* renamed from: y  reason: collision with root package name */
        public int f12385y;

        /* renamed from: z  reason: collision with root package name */
        public int f12386z;

        private c() {
            this.f12373m = -1;
            this.f12374n = -1;
            this.f12375o = -1;
            this.f12376p = -1;
            this.f12377q = 0;
            this.f12378r = -1;
            this.f12379s = 0.0f;
            this.f12380t = 0.0f;
            this.f12381u = 0.0f;
            this.f12382v = null;
            this.f12383w = -1;
            this.f12384x = false;
            this.f12385y = -1;
            this.f12386z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0;
            this.S = 0;
            this.V = true;
            this.W = "eng";
        }

        public void c() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void d() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a();
            }
        }

        private byte[] b() {
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

        /* access modifiers changed from: private */
        public void a() {
            a1.a((Object) this.X);
        }

        private byte[] a(String str) {
            byte[] bArr = this.f12371k;
            if (bArr != null) {
                return bArr;
            }
            throw ah.a("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x0367, code lost:
            r7 = -1;
            r18 = r3;
            r3 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x039b, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a7, code lost:
            r1 = null;
            r4 = null;
            r7 = -1;
            r15 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x03be, code lost:
            r4 = null;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x03cd, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x041d, code lost:
            r16 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0420, code lost:
            r3 = r16;
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0434, code lost:
            r4 = r3;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0436, code lost:
            r15 = -1;
            r18 = r4;
            r4 = r3;
            r3 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x043c, code lost:
            r5 = r0.N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x043e, code lost:
            if (r5 == null) goto L_0x044f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0440, code lost:
            r5 = com.applovin.impl.v6.a(new com.applovin.impl.yg(r5));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0449, code lost:
            if (r5 == null) goto L_0x044f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x044b, code lost:
            r4 = r5.f12711c;
            r3 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x044f, code lost:
            r5 = r0.V;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0453, code lost:
            if (r0.U == false) goto L_0x0457;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0455, code lost:
            r6 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0457, code lost:
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0458, code lost:
            r5 = r5 | r6;
            r6 = new com.applovin.impl.d9.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0462, code lost:
            if (com.applovin.impl.df.g(r3) == false) goto L_0x0476;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0464, code lost:
            r6.c(r0.O).n(r0.Q).j(r7);
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x047a, code lost:
            if (com.applovin.impl.df.i(r3) == false) goto L_0x0553;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x047e, code lost:
            if (r0.f12377q != 0) goto L_0x0492;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0480, code lost:
            r2 = r0.f12375o;
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x0483, code lost:
            if (r2 != -1) goto L_0x0487;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x0485, code lost:
            r2 = r0.f12373m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x0487, code lost:
            r0.f12375o = r2;
            r2 = r0.f12376p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x048b, code lost:
            if (r2 != -1) goto L_0x048f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x048d, code lost:
            r2 = r0.f12374n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x048f, code lost:
            r0.f12376p = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0492, code lost:
            r7 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0493, code lost:
            r2 = -1.0f;
            r8 = r0.f12375o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x0497, code lost:
            if (r8 == r7) goto L_0x04a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x0499, code lost:
            r10 = r0.f12376p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x049b, code lost:
            if (r10 == r7) goto L_0x04a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x049d, code lost:
            r2 = ((float) (r0.f12374n * r8)) / ((float) (r0.f12373m * r10));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x04aa, code lost:
            if (r0.f12384x == false) goto L_0x04bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x04ac, code lost:
            r10 = new com.applovin.impl.p3(r0.f12385y, r0.A, r0.f12386z, b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x04bc, code lost:
            r10 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x04bf, code lost:
            if (r0.f12361a == null) goto L_0x04dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x04cb, code lost:
            if (com.applovin.impl.tc.c().containsKey(r0.f12361a) == false) goto L_0x04dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x04cd, code lost:
            r7 = ((java.lang.Integer) com.applovin.impl.tc.c().get(r0.f12361a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x04df, code lost:
            if (r0.f12378r != 0) goto L_0x052d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x04e8, code lost:
            if (java.lang.Float.compare(r0.f12379s, 0.0f) != 0) goto L_0x052d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x04f0, code lost:
            if (java.lang.Float.compare(r0.f12380t, 0.0f) != 0) goto L_0x052d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x04f8, code lost:
            if (java.lang.Float.compare(r0.f12381u, 0.0f) != 0) goto L_0x04fb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0503, code lost:
            if (java.lang.Float.compare(r0.f12380t, 90.0f) != 0) goto L_0x0508;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0505, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0510, code lost:
            if (java.lang.Float.compare(r0.f12380t, -180.0f) == 0) goto L_0x052a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x051a, code lost:
            if (java.lang.Float.compare(r0.f12380t, 180.0f) != 0) goto L_0x051d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0525, code lost:
            if (java.lang.Float.compare(r0.f12380t, -90.0f) != 0) goto L_0x052d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0527, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x052a, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x052d, code lost:
            r9 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x052e, code lost:
            r6.q(r0.f12373m).g(r0.f12374n).b(r2).m(r9).a(r0.f12382v).p(r0.f12383w).a(r10);
            r8 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0557, code lost:
            if ("application/x-subrip".equals(r3) != false) goto L_0x057c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x055f, code lost:
            if (r17.equals(r3) != false) goto L_0x057c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0565, code lost:
            if ("application/vobsub".equals(r3) != false) goto L_0x057c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x056b, code lost:
            if ("application/pgs".equals(r3) != false) goto L_0x057c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x0571, code lost:
            if ("application/dvbsubs".equals(r3) == false) goto L_0x0574;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x057b, code lost:
            throw com.applovin.impl.ah.a("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x057e, code lost:
            if (r0.f12361a == null) goto L_0x0591;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x058a, code lost:
            if (com.applovin.impl.tc.c().containsKey(r0.f12361a) != false) goto L_0x0591;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x058c, code lost:
            r6.d(r0.f12361a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x0591, code lost:
            r1 = r6.h(r21).f(r3).i(r15).e(r0.W).o(r5 ? 1 : 0).a(r1).a(r4).a(r0.f12372l).a();
            r2 = r20.a(r0.f12363c, r8);
            r0.X = r2;
            r2.a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x05c8, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.applovin.impl.k8 r20, int r21) {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = r0.f12362b
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 16
                r6 = 8
                r7 = 4
                r8 = 3
                r9 = 0
                switch(r2) {
                    case -2095576542: goto L_0x01b3;
                    case -2095575984: goto L_0x01a7;
                    case -1985379776: goto L_0x019b;
                    case -1784763192: goto L_0x018f;
                    case -1730367663: goto L_0x0183;
                    case -1482641358: goto L_0x0177;
                    case -1482641357: goto L_0x016b;
                    case -1373388978: goto L_0x015f;
                    case -933872740: goto L_0x0151;
                    case -538363189: goto L_0x0143;
                    case -538363109: goto L_0x0135;
                    case -425012669: goto L_0x0127;
                    case -356037306: goto L_0x0119;
                    case 62923557: goto L_0x010b;
                    case 62923603: goto L_0x00fd;
                    case 62927045: goto L_0x00ef;
                    case 82318131: goto L_0x00e1;
                    case 82338133: goto L_0x00d3;
                    case 82338134: goto L_0x00c5;
                    case 99146302: goto L_0x00b7;
                    case 444813526: goto L_0x00a9;
                    case 542569478: goto L_0x009b;
                    case 635596514: goto L_0x008d;
                    case 725948237: goto L_0x0080;
                    case 725957860: goto L_0x0073;
                    case 738597099: goto L_0x0066;
                    case 855502857: goto L_0x0059;
                    case 1422270023: goto L_0x004c;
                    case 1809237540: goto L_0x003f;
                    case 1950749482: goto L_0x0032;
                    case 1950789798: goto L_0x0025;
                    case 1951062397: goto L_0x0018;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r1 = -1
                goto L_0x01be
            L_0x0018:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0021
                goto L_0x0015
            L_0x0021:
                r1 = 31
                goto L_0x01be
            L_0x0025:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002e
                goto L_0x0015
            L_0x002e:
                r1 = 30
                goto L_0x01be
            L_0x0032:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003b
                goto L_0x0015
            L_0x003b:
                r1 = 29
                goto L_0x01be
            L_0x003f:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0048
                goto L_0x0015
            L_0x0048:
                r1 = 28
                goto L_0x01be
            L_0x004c:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0055
                goto L_0x0015
            L_0x0055:
                r1 = 27
                goto L_0x01be
            L_0x0059:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0062
                goto L_0x0015
            L_0x0062:
                r1 = 26
                goto L_0x01be
            L_0x0066:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006f
                goto L_0x0015
            L_0x006f:
                r1 = 25
                goto L_0x01be
            L_0x0073:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007c
                goto L_0x0015
            L_0x007c:
                r1 = 24
                goto L_0x01be
            L_0x0080:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0089
                goto L_0x0015
            L_0x0089:
                r1 = 23
                goto L_0x01be
            L_0x008d:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0097
                goto L_0x0015
            L_0x0097:
                r1 = 22
                goto L_0x01be
            L_0x009b:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a5
                goto L_0x0015
            L_0x00a5:
                r1 = 21
                goto L_0x01be
            L_0x00a9:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b3
                goto L_0x0015
            L_0x00b3:
                r1 = 20
                goto L_0x01be
            L_0x00b7:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c1
                goto L_0x0015
            L_0x00c1:
                r1 = 19
                goto L_0x01be
            L_0x00c5:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00cf
                goto L_0x0015
            L_0x00cf:
                r1 = 18
                goto L_0x01be
            L_0x00d3:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00dd
                goto L_0x0015
            L_0x00dd:
                r1 = 17
                goto L_0x01be
            L_0x00e1:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00eb
                goto L_0x0015
            L_0x00eb:
                r1 = 16
                goto L_0x01be
            L_0x00ef:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f9
                goto L_0x0015
            L_0x00f9:
                r1 = 15
                goto L_0x01be
            L_0x00fd:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0107
                goto L_0x0015
            L_0x0107:
                r1 = 14
                goto L_0x01be
            L_0x010b:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0115
                goto L_0x0015
            L_0x0115:
                r1 = 13
                goto L_0x01be
            L_0x0119:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0123
                goto L_0x0015
            L_0x0123:
                r1 = 12
                goto L_0x01be
            L_0x0127:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0131
                goto L_0x0015
            L_0x0131:
                r1 = 11
                goto L_0x01be
            L_0x0135:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013f
                goto L_0x0015
            L_0x013f:
                r1 = 10
                goto L_0x01be
            L_0x0143:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014d
                goto L_0x0015
            L_0x014d:
                r1 = 9
                goto L_0x01be
            L_0x0151:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x015b
                goto L_0x0015
            L_0x015b:
                r1 = 8
                goto L_0x01be
            L_0x015f:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0169
                goto L_0x0015
            L_0x0169:
                r1 = 7
                goto L_0x01be
            L_0x016b:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0175
                goto L_0x0015
            L_0x0175:
                r1 = 6
                goto L_0x01be
            L_0x0177:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0181
                goto L_0x0015
            L_0x0181:
                r1 = 5
                goto L_0x01be
            L_0x0183:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x018d
                goto L_0x0015
            L_0x018d:
                r1 = 4
                goto L_0x01be
            L_0x018f:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0199
                goto L_0x0015
            L_0x0199:
                r1 = 3
                goto L_0x01be
            L_0x019b:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01a5
                goto L_0x0015
            L_0x01a5:
                r1 = 2
                goto L_0x01be
            L_0x01a7:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01b1
                goto L_0x0015
            L_0x01b1:
                r1 = 1
                goto L_0x01be
            L_0x01b3:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01bd
                goto L_0x0015
            L_0x01bd:
                r1 = 0
            L_0x01be:
                java.lang.String r2 = "application/x-subrip"
                java.lang.String r11 = "text/x-ssa"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "application/dvbsubs"
                java.lang.String r4 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                java.lang.String r5 = "MatroskaExtractor"
                java.lang.String r15 = "audio/x-unknown"
                r10 = 0
                switch(r1) {
                    case 0: goto L_0x0424;
                    case 1: goto L_0x0424;
                    case 2: goto L_0x03cf;
                    case 3: goto L_0x03c2;
                    case 4: goto L_0x03ae;
                    case 5: goto L_0x03a3;
                    case 6: goto L_0x039e;
                    case 7: goto L_0x0382;
                    case 8: goto L_0x036f;
                    case 9: goto L_0x0424;
                    case 10: goto L_0x034c;
                    case 11: goto L_0x033e;
                    case 12: goto L_0x0338;
                    case 13: goto L_0x0317;
                    case 14: goto L_0x0311;
                    case 15: goto L_0x030b;
                    case 16: goto L_0x0305;
                    case 17: goto L_0x02ff;
                    case 18: goto L_0x02f9;
                    case 19: goto L_0x02f3;
                    case 20: goto L_0x02ed;
                    case 21: goto L_0x030b;
                    case 22: goto L_0x02c5;
                    case 23: goto L_0x0298;
                    case 24: goto L_0x0270;
                    case 25: goto L_0x025c;
                    case 26: goto L_0x023f;
                    case 27: goto L_0x0239;
                    case 28: goto L_0x0233;
                    case 29: goto L_0x022d;
                    case 30: goto L_0x021d;
                    case 31: goto L_0x01db;
                    default: goto L_0x01d4;
                }
            L_0x01d4:
                java.lang.String r1 = "Unrecognized codec identifier."
                com.applovin.impl.ah r1 = com.applovin.impl.ah.a(r1, r10)
                throw r1
            L_0x01db:
                r15 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                java.lang.String r3 = r0.f12362b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                r17 = r11
                long r10 = r0.R
                java.nio.ByteBuffer r3 = r3.putLong(r10)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r6)
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.S
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r3 = "audio/opus"
                goto L_0x03be
            L_0x021d:
                r17 = r11
                java.lang.String r1 = r0.f12362b
                byte[] r1 = r0.a((java.lang.String) r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r3 = "audio/flac"
                goto L_0x039b
            L_0x022d:
                r17 = r11
                java.lang.String r16 = "audio/eac3"
                goto L_0x03cd
            L_0x0233:
                r17 = r11
                java.lang.String r16 = "video/mpeg2"
                goto L_0x03cd
            L_0x0239:
                r17 = r11
                r16 = r2
                goto L_0x03cd
            L_0x023f:
                r17 = r11
                com.applovin.impl.yg r1 = new com.applovin.impl.yg
                java.lang.String r3 = r0.f12362b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                com.applovin.impl.ka r1 = com.applovin.impl.ka.a(r1)
                java.util.List r3 = r1.f8935a
                int r4 = r1.f8936b
                r0.Y = r4
                java.lang.String r1 = r1.f8937c
                java.lang.String r4 = "video/hevc"
                goto L_0x0367
            L_0x025c:
                r17 = r11
                byte[] r1 = com.applovin.impl.tc.f12329d0
                java.lang.String r3 = r0.f12362b
                byte[] r3 = r0.a((java.lang.String) r3)
                com.applovin.impl.ab r1 = com.applovin.impl.ab.a((java.lang.Object) r1, (java.lang.Object) r3)
                r3 = r17
                goto L_0x039b
            L_0x0270:
                r17 = r11
                int r1 = r0.P
                int r7 = com.applovin.impl.yp.d((int) r1)
                if (r7 != 0) goto L_0x0420
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported little endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.P
                r1.append(r3)
                r1.append(r4)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.applovin.impl.kc.d(r5, r1)
                goto L_0x041d
            L_0x0298:
                r17 = r11
                int r1 = r0.P
                if (r1 != r6) goto L_0x02a1
                r7 = 3
                goto L_0x0420
            L_0x02a1:
                if (r1 != r3) goto L_0x02a7
                r7 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x0420
            L_0x02a7:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported big endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.P
                r1.append(r3)
                r1.append(r4)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.applovin.impl.kc.d(r5, r1)
                goto L_0x041d
            L_0x02c5:
                r17 = r11
                int r1 = r0.P
                r3 = 32
                if (r1 != r3) goto L_0x02cf
                goto L_0x0420
            L_0x02cf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported floating point PCM bit depth: "
                r1.append(r3)
                int r3 = r0.P
                r1.append(r3)
                r1.append(r4)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.applovin.impl.kc.d(r5, r1)
                goto L_0x041d
            L_0x02ed:
                r17 = r11
                java.lang.String r16 = "video/x-unknown"
                goto L_0x03cd
            L_0x02f3:
                r17 = r11
                r16 = r12
                goto L_0x03cd
            L_0x02f9:
                r17 = r11
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x03cd
            L_0x02ff:
                r17 = r11
                java.lang.String r16 = "video/x-vnd.on2.vp8"
                goto L_0x03cd
            L_0x0305:
                r17 = r11
                java.lang.String r16 = "video/av01"
                goto L_0x03cd
            L_0x030b:
                r17 = r11
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x03cd
            L_0x0311:
                r17 = r11
                java.lang.String r16 = "audio/ac3"
                goto L_0x03cd
            L_0x0317:
                r17 = r11
                java.lang.String r1 = r0.f12362b
                byte[] r1 = r0.a((java.lang.String) r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.f12371k
                com.applovin.impl.a$b r3 = com.applovin.impl.a.a((byte[]) r3)
                int r4 = r3.f6273a
                r0.Q = r4
                int r4 = r3.f6274b
                r0.O = r4
                java.lang.String r3 = r3.f6275c
                java.lang.String r4 = "audio/mp4a-latm"
                r7 = -1
                goto L_0x0436
            L_0x0338:
                r17 = r11
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x03cd
            L_0x033e:
                r17 = r11
                java.lang.String r1 = r0.f12362b
                byte[] r1 = r0.a((java.lang.String) r1)
                com.applovin.impl.ab r1 = com.applovin.impl.ab.a((java.lang.Object) r1)
                r3 = r13
                goto L_0x039b
            L_0x034c:
                r17 = r11
                com.applovin.impl.yg r1 = new com.applovin.impl.yg
                java.lang.String r3 = r0.f12362b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                com.applovin.impl.v1 r1 = com.applovin.impl.v1.b(r1)
                java.util.List r3 = r1.f12650a
                int r4 = r1.f12651b
                r0.Y = r4
                java.lang.String r1 = r1.f12655f
                java.lang.String r4 = "video/avc"
            L_0x0367:
                r7 = -1
                r18 = r3
                r3 = r1
                r1 = r18
                goto L_0x0436
            L_0x036f:
                r17 = r11
                byte[] r1 = new byte[r7]
                java.lang.String r3 = r0.f12362b
                byte[] r3 = r0.a((java.lang.String) r3)
                java.lang.System.arraycopy(r3, r9, r1, r9, r7)
                com.applovin.impl.ab r1 = com.applovin.impl.ab.a((java.lang.Object) r1)
                r3 = r14
                goto L_0x039b
            L_0x0382:
                r17 = r11
                com.applovin.impl.yg r1 = new com.applovin.impl.yg
                java.lang.String r3 = r0.f12362b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = a((com.applovin.impl.yg) r1)
                java.lang.Object r3 = r1.first
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x039b:
                r7 = -1
                goto L_0x0434
            L_0x039e:
                r17 = r11
                java.lang.String r3 = "audio/mpeg"
                goto L_0x03a7
            L_0x03a3:
                r17 = r11
                java.lang.String r3 = "audio/mpeg-L2"
            L_0x03a7:
                r1 = 0
                r4 = 0
                r7 = -1
                r15 = 4096(0x1000, float:5.74E-42)
                goto L_0x043c
            L_0x03ae:
                r17 = r11
                r15 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.f12362b
                byte[] r1 = r0.a((java.lang.String) r1)
                java.util.List r1 = a((byte[]) r1)
                java.lang.String r3 = "audio/vorbis"
            L_0x03be:
                r4 = 0
                r7 = -1
                goto L_0x043c
            L_0x03c2:
                r17 = r11
                com.applovin.impl.tc$d r1 = new com.applovin.impl.tc$d
                r1.<init>()
                r0.T = r1
                java.lang.String r16 = "audio/true-hd"
            L_0x03cd:
                r7 = -1
                goto L_0x0420
            L_0x03cf:
                r17 = r11
                com.applovin.impl.yg r1 = new com.applovin.impl.yg
                java.lang.String r3 = r0.f12362b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                boolean r1 = b((com.applovin.impl.yg) r1)
                if (r1 == 0) goto L_0x0409
                int r1 = r0.P
                int r1 = com.applovin.impl.yp.d((int) r1)
                if (r1 != 0) goto L_0x0407
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r1.append(r3)
                int r3 = r0.P
                r1.append(r3)
                r1.append(r4)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.applovin.impl.kc.d(r5, r1)
                goto L_0x041d
            L_0x0407:
                r7 = r1
                goto L_0x0420
            L_0x0409:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.applovin.impl.kc.d(r5, r1)
            L_0x041d:
                r16 = r15
                goto L_0x03cd
            L_0x0420:
                r3 = r16
                r1 = 0
                goto L_0x0434
            L_0x0424:
                r17 = r11
                byte[] r1 = r0.f12371k
                if (r1 != 0) goto L_0x042c
                r1 = 0
                goto L_0x0430
            L_0x042c:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0430:
                java.lang.String r3 = "video/mp4v-es"
                goto L_0x039b
            L_0x0434:
                r4 = r3
                r3 = 0
            L_0x0436:
                r15 = -1
                r18 = r4
                r4 = r3
                r3 = r18
            L_0x043c:
                byte[] r5 = r0.N
                if (r5 == 0) goto L_0x044f
                com.applovin.impl.yg r6 = new com.applovin.impl.yg
                r6.<init>((byte[]) r5)
                com.applovin.impl.v6 r5 = com.applovin.impl.v6.a(r6)
                if (r5 == 0) goto L_0x044f
                java.lang.String r4 = r5.f12711c
                java.lang.String r3 = "video/dolby-vision"
            L_0x044f:
                boolean r5 = r0.V
                boolean r6 = r0.U
                if (r6 == 0) goto L_0x0457
                r6 = 2
                goto L_0x0458
            L_0x0457:
                r6 = 0
            L_0x0458:
                r5 = r5 | r6
                com.applovin.impl.d9$b r6 = new com.applovin.impl.d9$b
                r6.<init>()
                boolean r10 = com.applovin.impl.df.g(r3)
                if (r10 == 0) goto L_0x0476
                int r2 = r0.O
                com.applovin.impl.d9$b r2 = r6.c((int) r2)
                int r8 = r0.Q
                com.applovin.impl.d9$b r2 = r2.n((int) r8)
                r2.j((int) r7)
                r8 = 1
                goto L_0x057c
            L_0x0476:
                boolean r7 = com.applovin.impl.df.i(r3)
                if (r7 == 0) goto L_0x0553
                int r2 = r0.f12377q
                if (r2 != 0) goto L_0x0492
                int r2 = r0.f12375o
                r7 = -1
                if (r2 != r7) goto L_0x0487
                int r2 = r0.f12373m
            L_0x0487:
                r0.f12375o = r2
                int r2 = r0.f12376p
                if (r2 != r7) goto L_0x048f
                int r2 = r0.f12374n
            L_0x048f:
                r0.f12376p = r2
                goto L_0x0493
            L_0x0492:
                r7 = -1
            L_0x0493:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r8 = r0.f12375o
                if (r8 == r7) goto L_0x04a8
                int r10 = r0.f12376p
                if (r10 == r7) goto L_0x04a8
                int r2 = r0.f12374n
                int r2 = r2 * r8
                float r2 = (float) r2
                int r8 = r0.f12373m
                int r8 = r8 * r10
                float r8 = (float) r8
                float r2 = r2 / r8
            L_0x04a8:
                boolean r8 = r0.f12384x
                if (r8 == 0) goto L_0x04bc
                byte[] r8 = r19.b()
                com.applovin.impl.p3 r10 = new com.applovin.impl.p3
                int r11 = r0.f12385y
                int r12 = r0.A
                int r13 = r0.f12386z
                r10.<init>(r11, r12, r13, r8)
                goto L_0x04bd
            L_0x04bc:
                r10 = 0
            L_0x04bd:
                java.lang.String r8 = r0.f12361a
                if (r8 == 0) goto L_0x04dd
                java.util.Map r8 = com.applovin.impl.tc.f12332g0
                java.lang.String r11 = r0.f12361a
                boolean r8 = r8.containsKey(r11)
                if (r8 == 0) goto L_0x04dd
                java.util.Map r7 = com.applovin.impl.tc.f12332g0
                java.lang.String r8 = r0.f12361a
                java.lang.Object r7 = r7.get(r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
            L_0x04dd:
                int r8 = r0.f12378r
                if (r8 != 0) goto L_0x052d
                float r8 = r0.f12379s
                r11 = 0
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x052d
                float r8 = r0.f12380t
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x052d
                float r8 = r0.f12381u
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x04fb
                goto L_0x052e
            L_0x04fb:
                float r8 = r0.f12380t
                r9 = 1119092736(0x42b40000, float:90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0508
                r9 = 90
                goto L_0x052e
            L_0x0508:
                float r8 = r0.f12380t
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 == 0) goto L_0x052a
                float r8 = r0.f12380t
                r9 = 1127481344(0x43340000, float:180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x051d
                goto L_0x052a
            L_0x051d:
                float r8 = r0.f12380t
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x052d
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x052e
            L_0x052a:
                r9 = 180(0xb4, float:2.52E-43)
                goto L_0x052e
            L_0x052d:
                r9 = r7
            L_0x052e:
                int r7 = r0.f12373m
                com.applovin.impl.d9$b r7 = r6.q((int) r7)
                int r8 = r0.f12374n
                com.applovin.impl.d9$b r7 = r7.g((int) r8)
                com.applovin.impl.d9$b r2 = r7.b((float) r2)
                com.applovin.impl.d9$b r2 = r2.m((int) r9)
                byte[] r7 = r0.f12382v
                com.applovin.impl.d9$b r2 = r2.a((byte[]) r7)
                int r7 = r0.f12383w
                com.applovin.impl.d9$b r2 = r2.p((int) r7)
                r2.a((com.applovin.impl.p3) r10)
                r8 = 2
                goto L_0x057c
            L_0x0553:
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x057c
                r2 = r17
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x057c
                boolean r2 = r13.equals(r3)
                if (r2 != 0) goto L_0x057c
                boolean r2 = r12.equals(r3)
                if (r2 != 0) goto L_0x057c
                boolean r2 = r14.equals(r3)
                if (r2 == 0) goto L_0x0574
                goto L_0x057c
            L_0x0574:
                java.lang.String r1 = "Unexpected MIME type."
                r2 = 0
                com.applovin.impl.ah r1 = com.applovin.impl.ah.a(r1, r2)
                throw r1
            L_0x057c:
                java.lang.String r2 = r0.f12361a
                if (r2 == 0) goto L_0x0591
                java.util.Map r2 = com.applovin.impl.tc.f12332g0
                java.lang.String r7 = r0.f12361a
                boolean r2 = r2.containsKey(r7)
                if (r2 != 0) goto L_0x0591
                java.lang.String r2 = r0.f12361a
                r6.d((java.lang.String) r2)
            L_0x0591:
                r2 = r21
                com.applovin.impl.d9$b r2 = r6.h((int) r2)
                com.applovin.impl.d9$b r2 = r2.f((java.lang.String) r3)
                com.applovin.impl.d9$b r2 = r2.i((int) r15)
                java.lang.String r3 = r0.W
                com.applovin.impl.d9$b r2 = r2.e((java.lang.String) r3)
                com.applovin.impl.d9$b r2 = r2.o((int) r5)
                com.applovin.impl.d9$b r1 = r2.a((java.util.List) r1)
                com.applovin.impl.d9$b r1 = r1.a((java.lang.String) r4)
                com.applovin.impl.w6 r2 = r0.f12372l
                com.applovin.impl.d9$b r1 = r1.a((com.applovin.impl.w6) r2)
                com.applovin.impl.d9 r1 = r1.a()
                int r2 = r0.f12363c
                r3 = r20
                com.applovin.impl.ro r2 = r3.a(r2, r8)
                r0.X = r2
                r2.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.tc.c.a(com.applovin.impl.k8, int):void");
        }

        private static boolean b(yg ygVar) {
            try {
                int r10 = ygVar.r();
                if (r10 == 1) {
                    return true;
                }
                if (r10 != 65534) {
                    return false;
                }
                ygVar.f(24);
                if (ygVar.s() == tc.f12331f0.getMostSignificantBits() && ygVar.s() == tc.f12331f0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        private static Pair a(yg ygVar) {
            try {
                ygVar.g(16);
                long p10 = ygVar.p();
                if (p10 == 1482049860) {
                    return new Pair("video/divx", (Object) null);
                }
                if (p10 == 859189832) {
                    return new Pair("video/3gpp", (Object) null);
                }
                if (p10 == 826496599) {
                    byte[] c10 = ygVar.c();
                    for (int d10 = ygVar.d() + 20; d10 < c10.length - 4; d10++) {
                        if (c10[d10] == 0 && c10[d10 + 1] == 0 && c10[d10 + 2] == 1 && c10[d10 + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(c10, d10, c10.length)));
                        }
                    }
                    throw ah.a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                kc.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing FourCC private data", (Throwable) null);
            }
        }

        private static List a(byte[] bArr) {
            byte b10;
            byte b11;
            try {
                if (bArr[0] == 2) {
                    int i10 = 1;
                    int i11 = 0;
                    while (true) {
                        b10 = bArr[i10] & 255;
                        if (b10 != 255) {
                            break;
                        }
                        i11 += 255;
                        i10++;
                    }
                    int i12 = i10 + 1;
                    int i13 = i11 + b10;
                    int i14 = 0;
                    while (true) {
                        b11 = bArr[i12] & 255;
                        if (b11 != 255) {
                            break;
                        }
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + b11;
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
                            throw ah.a("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw ah.a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw ah.a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw ah.a("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing vorbis codec private", (Throwable) null);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f12332g0 = Collections.unmodifiableMap(hashMap);
    }

    public tc() {
        this(0);
    }

    private void a(int i10) {
        if (this.C == null || this.D == null) {
            throw ah.a("Element " + i10 + " must be in a Cues", (Throwable) null);
        }
    }

    private void b(int i10) {
        if (this.f12354u == null) {
            throw ah.a("Element " + i10 + " must be in a TrackEntry", (Throwable) null);
        }
    }

    private c d(int i10) {
        b(i10);
        return this.f12354u;
    }

    private void e() {
        a1.b((Object) this.f12334a0);
    }

    private int f() {
        int i10 = this.S;
        h();
        return i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i8[] g() {
        return new i8[]{new tc()};
    }

    private void h() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.f12343j.d(0);
    }

    public final void a() {
    }

    /* access modifiers changed from: protected */
    public void c(int i10) {
        e();
        if (i10 != 160) {
            if (i10 == 174) {
                c cVar = (c) a1.b((Object) this.f12354u);
                String str = cVar.f12362b;
                if (str != null) {
                    if (a(str)) {
                        cVar.a(this.f12334a0, cVar.f12363c);
                        this.f12336c.put(cVar.f12363c, cVar);
                    }
                    this.f12354u = null;
                    return;
                }
                throw ah.a("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i10 == 19899) {
                int i11 = this.f12356w;
                if (i11 != -1) {
                    long j10 = this.f12357x;
                    if (j10 != -1) {
                        if (i11 == 475249515) {
                            this.f12359z = j10;
                            return;
                        }
                        return;
                    }
                }
                throw ah.a("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i10 == 25152) {
                b(i10);
                c cVar2 = this.f12354u;
                if (!cVar2.f12368h) {
                    return;
                }
                if (cVar2.f12370j != null) {
                    cVar2.f12372l = new w6(new w6.b(r2.f11113a, MimeTypes.VIDEO_WEBM, this.f12354u.f12370j.f11218b));
                    return;
                }
                throw ah.a("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i10 == 28032) {
                b(i10);
                c cVar3 = this.f12354u;
                if (cVar3.f12368h && cVar3.f12369i != null) {
                    throw ah.a("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i10 == 357149030) {
                if (this.f12351r == -9223372036854775807L) {
                    this.f12351r = 1000000;
                }
                long j11 = this.f12352s;
                if (j11 != -9223372036854775807L) {
                    this.f12353t = a(j11);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515) {
                    if (!this.f12355v) {
                        this.f12334a0.a(a(this.C, this.D));
                        this.f12355v = true;
                    }
                    this.C = null;
                    this.D = null;
                }
            } else if (this.f12336c.size() != 0) {
                this.f12334a0.c();
            } else {
                throw ah.a("No valid tracks were found", (Throwable) null);
            }
        } else if (this.G == 2) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.K; i13++) {
                i12 += this.L[i13];
            }
            c cVar4 = (c) this.f12336c.get(this.M);
            cVar4.a();
            for (int i14 = 0; i14 < this.K; i14++) {
                long j12 = ((long) ((cVar4.f12365e * i14) / 1000)) + this.H;
                int i15 = this.O;
                if (i14 == 0 && !this.Q) {
                    i15 |= 1;
                }
                int i16 = this.L[i14];
                i12 -= i16;
                a(cVar4, j12, i15, i16, i12);
            }
            this.G = 0;
        }
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
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
    public boolean f(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public tc(int i10) {
        this(new y5(), i10);
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f12387a = new byte[10];

        /* renamed from: b  reason: collision with root package name */
        private boolean f12388b;

        /* renamed from: c  reason: collision with root package name */
        private int f12389c;

        /* renamed from: d  reason: collision with root package name */
        private long f12390d;

        /* renamed from: e  reason: collision with root package name */
        private int f12391e;

        /* renamed from: f  reason: collision with root package name */
        private int f12392f;

        /* renamed from: g  reason: collision with root package name */
        private int f12393g;

        public void a(c cVar) {
            if (this.f12389c > 0) {
                cVar.X.a(this.f12390d, this.f12391e, this.f12392f, this.f12393g, cVar.f12370j);
                this.f12389c = 0;
            }
        }

        public void a() {
            this.f12388b = false;
            this.f12389c = 0;
        }

        public void a(c cVar, long j10, int i10, int i11, int i12) {
            if (this.f12388b) {
                int i13 = this.f12389c;
                int i14 = i13 + 1;
                this.f12389c = i14;
                if (i13 == 0) {
                    this.f12390d = j10;
                    this.f12391e = i10;
                    this.f12392f = 0;
                }
                this.f12392f += i11;
                this.f12393g = i12;
                if (i14 >= 16) {
                    a(cVar);
                }
            }
        }

        public void a(j8 j8Var) {
            if (!this.f12388b) {
                j8Var.c(this.f12387a, 0, 10);
                j8Var.b();
                if (k.b(this.f12387a) != 0) {
                    this.f12388b = true;
                }
            }
        }
    }

    tc(n7 n7Var, int i10) {
        this.f12350q = -1;
        this.f12351r = -9223372036854775807L;
        this.f12352s = -9223372036854775807L;
        this.f12353t = -9223372036854775807L;
        this.f12359z = -1;
        this.A = -1;
        this.B = -9223372036854775807L;
        this.f12333a = n7Var;
        n7Var.a((m7) new b());
        this.f12337d = (i10 & 1) == 0;
        this.f12335b = new aq();
        this.f12336c = new SparseArray();
        this.f12340g = new yg(4);
        this.f12341h = new yg(ByteBuffer.allocate(4).putInt(-1).array());
        this.f12342i = new yg(4);
        this.f12338e = new yg(uf.f12561a);
        this.f12339f = new yg(4);
        this.f12343j = new yg();
        this.f12344k = new yg();
        this.f12345l = new yg(8);
        this.f12346m = new yg();
        this.f12347n = new yg();
        this.L = new int[1];
    }

    /* access modifiers changed from: protected */
    public void a(int i10, int i11, j8 j8Var) {
        c cVar;
        c cVar2;
        c cVar3;
        int i12;
        int i13;
        int i14;
        int i15 = i10;
        int i16 = i11;
        j8 j8Var2 = j8Var;
        Throwable th = null;
        int i17 = 1;
        int i18 = 0;
        if (i15 == 161 || i15 == 163) {
            if (this.G == 0) {
                this.M = (int) this.f12335b.a(j8Var2, false, true, 8);
                this.N = this.f12335b.a();
                this.I = -9223372036854775807L;
                this.G = 1;
                this.f12340g.d(0);
            }
            c cVar4 = (c) this.f12336c.get(this.M);
            if (cVar4 == null) {
                j8Var2.a(i16 - this.N);
                this.G = 0;
                return;
            }
            cVar4.a();
            if (this.G == 1) {
                a(j8Var2, 3);
                int i19 = (this.f12340g.c()[2] & 6) >> 1;
                if (i19 == 0) {
                    this.K = 1;
                    int[] a10 = a(this.L, 1);
                    this.L = a10;
                    a10[0] = (i16 - this.N) - 3;
                } else {
                    int i20 = 4;
                    a(j8Var2, 4);
                    int i21 = (this.f12340g.c()[3] & 255) + 1;
                    this.K = i21;
                    int[] a11 = a(this.L, i21);
                    this.L = a11;
                    if (i19 == 2) {
                        int i22 = this.K;
                        Arrays.fill(a11, 0, i22, ((i16 - this.N) - 4) / i22);
                    } else if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        while (true) {
                            i12 = this.K - 1;
                            if (i23 >= i12) {
                                break;
                            }
                            this.L[i23] = 0;
                            while (true) {
                                i13 = i20 + 1;
                                a(j8Var2, i13);
                                byte b10 = this.f12340g.c()[i20] & 255;
                                int[] iArr = this.L;
                                i14 = iArr[i23] + b10;
                                iArr[i23] = i14;
                                if (b10 != 255) {
                                    break;
                                }
                                i20 = i13;
                            }
                            i24 += i14;
                            i23++;
                            i20 = i13;
                        }
                        this.L[i12] = ((i16 - this.N) - i20) - i24;
                    } else if (i19 == 3) {
                        int i25 = 0;
                        int i26 = 0;
                        while (true) {
                            int i27 = this.K - i17;
                            if (i25 >= i27) {
                                cVar2 = cVar4;
                                this.L[i27] = ((i16 - this.N) - i20) - i26;
                                break;
                            }
                            this.L[i25] = i18;
                            int i28 = i20 + 1;
                            a(j8Var2, i28);
                            if (this.f12340g.c()[i20] != 0) {
                                long j10 = 0;
                                int i29 = 0;
                                while (true) {
                                    if (i29 >= 8) {
                                        cVar3 = cVar4;
                                        break;
                                    }
                                    int i30 = i17 << (7 - i29);
                                    if ((this.f12340g.c()[i20] & i30) != 0) {
                                        int i31 = i28 + i29;
                                        a(j8Var2, i31);
                                        long j11 = (long) ((~i30) & this.f12340g.c()[i20] & 255);
                                        while (true) {
                                            j10 = j11;
                                            if (i28 >= i31) {
                                                break;
                                            }
                                            j11 = (j10 << 8) | ((long) (this.f12340g.c()[i28] & 255));
                                            i28++;
                                            cVar4 = cVar4;
                                        }
                                        cVar3 = cVar4;
                                        if (i25 > 0) {
                                            j10 -= (1 << ((i29 * 7) + 6)) - 1;
                                            i20 = i31;
                                        } else {
                                            i28 = i31;
                                        }
                                    } else {
                                        c cVar5 = cVar4;
                                        i29++;
                                        i17 = 1;
                                    }
                                }
                                i20 = i28;
                                long j12 = j10;
                                if (j12 >= -2147483648L && j12 <= 2147483647L) {
                                    int i32 = (int) j12;
                                    int[] iArr2 = this.L;
                                    if (i25 != 0) {
                                        i32 += iArr2[i25 - 1];
                                    }
                                    iArr2[i25] = i32;
                                    i26 += i32;
                                    i25++;
                                    cVar4 = cVar3;
                                    th = null;
                                    i17 = 1;
                                    i18 = 0;
                                }
                            } else {
                                throw ah.a("No valid varint length mask found", th);
                            }
                        }
                        throw ah.a("EBML lacing sample size out of range.", (Throwable) null);
                    } else {
                        throw ah.a("Unexpected lacing value: " + i19, (Throwable) null);
                    }
                }
                cVar2 = cVar4;
                this.H = this.B + a((long) ((this.f12340g.c()[0] << 8) | (this.f12340g.c()[1] & 255)));
                cVar = cVar2;
                this.O = (cVar.f12364d == 2 || (i15 == 163 && (this.f12340g.c()[2] & 128) == 128)) ? 1 : 0;
                this.G = 2;
                this.J = 0;
            } else {
                cVar = cVar4;
            }
            if (i15 == 163) {
                while (true) {
                    int i33 = this.J;
                    if (i33 < this.K) {
                        a(cVar, ((long) ((this.J * cVar.f12365e) / 1000)) + this.H, this.O, a(j8Var2, cVar, this.L[i33]), 0);
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
                        iArr3[i34] = a(j8Var2, cVar, iArr3[i34]);
                        this.J++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i15 != 165) {
            if (i15 == 16877) {
                a(d(i10), j8Var2, i16);
            } else if (i15 == 16981) {
                b(i10);
                byte[] bArr = new byte[i16];
                this.f12354u.f12369i = bArr;
                j8Var2.d(bArr, 0, i16);
            } else if (i15 == 18402) {
                byte[] bArr2 = new byte[i16];
                j8Var2.d(bArr2, 0, i16);
                d(i10).f12370j = new ro.a(1, bArr2, 0, 0);
            } else if (i15 == 21419) {
                Arrays.fill(this.f12342i.c(), (byte) 0);
                j8Var2.d(this.f12342i.c(), 4 - i16, i16);
                this.f12342i.f(0);
                this.f12356w = (int) this.f12342i.y();
            } else if (i15 == 25506) {
                b(i10);
                byte[] bArr3 = new byte[i16];
                this.f12354u.f12371k = bArr3;
                j8Var2.d(bArr3, 0, i16);
            } else if (i15 == 30322) {
                b(i10);
                byte[] bArr4 = new byte[i16];
                this.f12354u.f12382v = bArr4;
                j8Var2.d(bArr4, 0, i16);
            } else {
                throw ah.a("Unexpected id: " + i15, (Throwable) null);
            }
        } else if (this.G == 2) {
            a((c) this.f12336c.get(this.M), this.P, j8Var2, i16);
        }
    }

    private ej a(mc mcVar, mc mcVar2) {
        int i10;
        if (this.f12350q == -1 || this.f12353t == -9223372036854775807L || mcVar == null || mcVar.a() == 0 || mcVar2 == null || mcVar2.a() != mcVar.a()) {
            return new ej.b(this.f12353t);
        }
        int a10 = mcVar.a();
        int[] iArr = new int[a10];
        long[] jArr = new long[a10];
        long[] jArr2 = new long[a10];
        long[] jArr3 = new long[a10];
        int i11 = 0;
        for (int i12 = 0; i12 < a10; i12++) {
            jArr3[i12] = mcVar.a(i12);
            jArr[i12] = this.f12350q + mcVar2.a(i12);
        }
        while (true) {
            i10 = a10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f12350q + this.f12349p) - jArr[i10]);
        long j10 = this.f12353t - jArr3[i10];
        jArr2[i10] = j10;
        if (j10 <= 0) {
            kc.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new e3(iArr, jArr, jArr2, jArr3);
    }

    private void a(c cVar, long j10, int i10, int i11, int i12) {
        d dVar = cVar.T;
        if (dVar != null) {
            dVar.a(cVar, j10, i10, i11, i12);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f12362b) || "S_TEXT/ASS".equals(cVar.f12362b)) {
                if (this.K > 1) {
                    kc.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        kc.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        a(cVar.f12362b, j11, this.f12344k.c());
                        int d10 = this.f12344k.d();
                        while (true) {
                            if (d10 >= this.f12344k.e()) {
                                break;
                            } else if (this.f12344k.c()[d10] == 0) {
                                this.f12344k.e(d10);
                                break;
                            } else {
                                d10++;
                            }
                        }
                        ro roVar = cVar.X;
                        yg ygVar = this.f12344k;
                        roVar.a(ygVar, ygVar.e());
                        i11 += this.f12344k.e();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    i10 &= -268435457;
                } else {
                    int e10 = this.f12347n.e();
                    cVar.X.a(this.f12347n, e10, 2);
                    i11 += e10;
                }
            }
            cVar.X.a(j10, i10, i11, i12, cVar.f12370j);
        }
        this.F = true;
    }

    private static int[] a(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        if (iArr.length >= i10) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i10)];
    }

    /* access modifiers changed from: protected */
    public void a(int i10, double d10) {
        if (i10 == 181) {
            d(i10).Q = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    d(i10).D = (float) d10;
                    return;
                case 21970:
                    d(i10).E = (float) d10;
                    return;
                case 21971:
                    d(i10).F = (float) d10;
                    return;
                case 21972:
                    d(i10).G = (float) d10;
                    return;
                case 21973:
                    d(i10).H = (float) d10;
                    return;
                case 21974:
                    d(i10).I = (float) d10;
                    return;
                case 21975:
                    d(i10).J = (float) d10;
                    return;
                case 21976:
                    d(i10).K = (float) d10;
                    return;
                case 21977:
                    d(i10).L = (float) d10;
                    return;
                case 21978:
                    d(i10).M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            d(i10).f12379s = (float) d10;
                            return;
                        case 30324:
                            d(i10).f12380t = (float) d10;
                            return;
                        case 30325:
                            d(i10).f12381u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f12352s = (long) d10;
        }
    }

    private static byte[] a(long j10, String str, long j11) {
        a1.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) (i10 * 3600)) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) (i11 * 60)) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return yp.c(String.format(Locale.US, str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))}));
    }

    /* access modifiers changed from: protected */
    public void a(c cVar, j8 j8Var, int i10) {
        if (cVar.f12367g == 1685485123 || cVar.f12367g == 1685480259) {
            byte[] bArr = new byte[i10];
            cVar.N = bArr;
            j8Var.d(bArr, 0, i10);
            return;
        }
        j8Var.a(i10);
    }

    /* access modifiers changed from: protected */
    public void a(c cVar, int i10, j8 j8Var, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f12362b)) {
            j8Var.a(i11);
            return;
        }
        this.f12347n.d(i11);
        j8Var.d(this.f12347n.c(), 0, i11);
    }

    public final void a(k8 k8Var) {
        this.f12334a0 = k8Var;
    }

    /* access modifiers changed from: protected */
    public void a(int i10, long j10) {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        d(i10).f12364d = (int) j10;
                        return;
                    case 136:
                        c d10 = d(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        d10.V = z10;
                        return;
                    case 155:
                        this.I = a(j10);
                        return;
                    case 159:
                        d(i10).O = (int) j10;
                        return;
                    case 176:
                        d(i10).f12373m = (int) j10;
                        return;
                    case 179:
                        a(i10);
                        this.C.a(a(j10));
                        return;
                    case 186:
                        d(i10).f12374n = (int) j10;
                        return;
                    case 215:
                        d(i10).f12363c = (int) j10;
                        return;
                    case 231:
                        this.B = a(j10);
                        return;
                    case 238:
                        this.P = (int) j10;
                        return;
                    case 241:
                        if (!this.E) {
                            a(i10);
                            this.D.a(j10);
                            this.E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.Q = true;
                        return;
                    case 16871:
                        int unused = d(i10).f12367g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw ah.a("ContentCompAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw ah.a("DocTypeReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw ah.a("EBMLReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw ah.a("ContentEncAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw ah.a("AESSettingsCipherMode " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f12357x = j10 + this.f12350q;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        b(i10);
                        if (i11 == 0) {
                            this.f12354u.f12383w = 0;
                            return;
                        } else if (i11 == 1) {
                            this.f12354u.f12383w = 2;
                            return;
                        } else if (i11 == 3) {
                            this.f12354u.f12383w = 1;
                            return;
                        } else if (i11 == 15) {
                            this.f12354u.f12383w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        d(i10).f12375o = (int) j10;
                        return;
                    case 21682:
                        d(i10).f12377q = (int) j10;
                        return;
                    case 21690:
                        d(i10).f12376p = (int) j10;
                        return;
                    case 21930:
                        c d11 = d(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        d11.U = z10;
                        return;
                    case 21998:
                        d(i10).f12366f = (int) j10;
                        return;
                    case 22186:
                        d(i10).R = j10;
                        return;
                    case 22203:
                        d(i10).S = j10;
                        return;
                    case 25188:
                        d(i10).P = (int) j10;
                        return;
                    case 30321:
                        b(i10);
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.f12354u.f12378r = 0;
                            return;
                        } else if (i12 == 1) {
                            this.f12354u.f12378r = 1;
                            return;
                        } else if (i12 == 2) {
                            this.f12354u.f12378r = 2;
                            return;
                        } else if (i12 == 3) {
                            this.f12354u.f12378r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        d(i10).f12365e = (int) j10;
                        return;
                    case 2807729:
                        this.f12351r = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                b(i10);
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.f12354u.A = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.f12354u.A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                b(i10);
                                int b10 = p3.b((int) j10);
                                if (b10 != -1) {
                                    this.f12354u.f12386z = b10;
                                    return;
                                }
                                return;
                            case 21947:
                                b(i10);
                                this.f12354u.f12384x = true;
                                int a10 = p3.a((int) j10);
                                if (a10 != -1) {
                                    this.f12354u.f12385y = a10;
                                    return;
                                }
                                return;
                            case 21948:
                                d(i10).B = (int) j10;
                                return;
                            case 21949:
                                d(i10).C = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw ah.a("ContentEncodingScope " + j10 + " not supported", (Throwable) null);
            }
        } else if (j10 != 0) {
            throw ah.a("ContentEncodingOrder " + j10 + " not supported", (Throwable) null);
        }
    }

    private static boolean a(String str) {
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
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = 31;
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
                return true;
            default:
                return false;
        }
    }

    private boolean a(qh qhVar, long j10) {
        if (this.f12358y) {
            this.A = j10;
            qhVar.f10991a = this.f12359z;
            this.f12358y = false;
            return true;
        }
        if (this.f12355v) {
            long j11 = this.A;
            if (j11 != -1) {
                qhVar.f10991a = j11;
                this.A = -1;
                return true;
            }
        }
        return false;
    }

    public final int a(j8 j8Var, qh qhVar) {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f12333a.a(j8Var);
            if (z10 && a(qhVar, j8Var.f())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f12336c.size(); i10++) {
            c cVar = (c) this.f12336c.valueAt(i10);
            cVar.a();
            cVar.c();
        }
        return -1;
    }

    private void a(j8 j8Var, int i10) {
        if (this.f12340g.e() < i10) {
            if (this.f12340g.b() < i10) {
                yg ygVar = this.f12340g;
                ygVar.a(Math.max(ygVar.b() * 2, i10));
            }
            j8Var.d(this.f12340g.c(), this.f12340g.e(), i10 - this.f12340g.e());
            this.f12340g.e(i10);
        }
    }

    private long a(long j10) {
        long j11 = this.f12351r;
        if (j11 != -9223372036854775807L) {
            return yp.c(j10, j11, 1000);
        }
        throw ah.a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    public void a(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f12333a.reset();
        this.f12335b.b();
        h();
        for (int i10 = 0; i10 < this.f12336c.size(); i10++) {
            ((c) this.f12336c.valueAt(i10)).d();
        }
    }

    private static void a(String str, long j10, byte[] bArr) {
        int i10;
        byte[] bArr2;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArr2 = a(j10, "%01d:%02d:%02d:%02d", (long) UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            i10 = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            bArr2 = a(j10, "%02d:%02d:%02d,%03d", 1000);
            i10 = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
    }

    /* access modifiers changed from: protected */
    public void a(int i10, long j10, long j11) {
        e();
        if (i10 == 160) {
            this.Q = false;
        } else if (i10 == 174) {
            this.f12354u = new c();
        } else if (i10 == 187) {
            this.E = false;
        } else if (i10 == 19899) {
            this.f12356w = -1;
            this.f12357x = -1;
        } else if (i10 == 20533) {
            d(i10).f12368h = true;
        } else if (i10 == 21968) {
            d(i10).f12384x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f12350q;
            if (j12 == -1 || j12 == j10) {
                this.f12350q = j10;
                this.f12349p = j11;
                return;
            }
            throw ah.a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i10 == 475249515) {
            this.C = new mc();
            this.D = new mc();
        } else if (i10 != 524531317 || this.f12355v) {
        } else {
            if (!this.f12337d || this.f12359z == -1) {
                this.f12334a0.a(new ej.b(this.f12353t));
                this.f12355v = true;
                return;
            }
            this.f12358y = true;
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i10, String str) {
        if (i10 == 134) {
            d(i10).f12362b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                d(i10).f12361a = str;
            } else if (i10 == 2274716) {
                String unused = d(i10).W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw ah.a("DocType " + str + " not supported", (Throwable) null);
        }
    }

    private int a(j8 j8Var, c cVar, int i10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f12362b)) {
            a(j8Var, f12328c0, i10);
            return f();
        } else if ("S_TEXT/ASS".equals(cVar.f12362b)) {
            a(j8Var, f12330e0, i10);
            return f();
        } else {
            ro roVar = cVar.X;
            boolean z10 = true;
            if (!this.U) {
                if (cVar.f12368h) {
                    this.O &= -1073741825;
                    int i12 = 128;
                    if (!this.V) {
                        j8Var.d(this.f12340g.c(), 0, 1);
                        this.R++;
                        if ((this.f12340g.c()[0] & 128) != 128) {
                            this.Y = this.f12340g.c()[0];
                            this.V = true;
                        } else {
                            throw ah.a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b10 = this.Y;
                    if ((b10 & 1) == 1) {
                        boolean z11 = (b10 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.Z) {
                            j8Var.d(this.f12345l.c(), 0, 8);
                            this.R += 8;
                            this.Z = true;
                            byte[] c10 = this.f12340g.c();
                            if (!z11) {
                                i12 = 0;
                            }
                            c10[0] = (byte) (i12 | 8);
                            this.f12340g.f(0);
                            roVar.a(this.f12340g, 1, 1);
                            this.S++;
                            this.f12345l.f(0);
                            roVar.a(this.f12345l, 8, 1);
                            this.S += 8;
                        }
                        if (z11) {
                            if (!this.W) {
                                j8Var.d(this.f12340g.c(), 0, 1);
                                this.R++;
                                this.f12340g.f(0);
                                this.X = this.f12340g.w();
                                this.W = true;
                            }
                            int i13 = this.X * 4;
                            this.f12340g.d(i13);
                            j8Var.d(this.f12340g.c(), 0, i13);
                            this.R += i13;
                            short s10 = (short) ((this.X / 2) + 1);
                            int i14 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f12348o;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f12348o = ByteBuffer.allocate(i14);
                            }
                            this.f12348o.position(0);
                            this.f12348o.putShort(s10);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i11 = this.X;
                                if (i15 >= i11) {
                                    break;
                                }
                                int A2 = this.f12340g.A();
                                if (i15 % 2 == 0) {
                                    this.f12348o.putShort((short) (A2 - i16));
                                } else {
                                    this.f12348o.putInt(A2 - i16);
                                }
                                i15++;
                                i16 = A2;
                            }
                            int i17 = (i10 - this.R) - i16;
                            if (i11 % 2 == 1) {
                                this.f12348o.putInt(i17);
                            } else {
                                this.f12348o.putShort((short) i17);
                                this.f12348o.putInt(0);
                            }
                            this.f12346m.a(this.f12348o.array(), i14);
                            roVar.a(this.f12346m, i14, 1);
                            this.S += i14;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f12369i;
                    if (bArr != null) {
                        this.f12343j.a(bArr, bArr.length);
                    }
                }
                if (cVar.f12366f > 0) {
                    this.O |= 268435456;
                    this.f12347n.d(0);
                    this.f12340g.d(4);
                    this.f12340g.c()[0] = (byte) ((i10 >> 24) & 255);
                    this.f12340g.c()[1] = (byte) ((i10 >> 16) & 255);
                    this.f12340g.c()[2] = (byte) ((i10 >> 8) & 255);
                    this.f12340g.c()[3] = (byte) (i10 & 255);
                    roVar.a(this.f12340g, 4, 2);
                    this.S += 4;
                }
                this.U = true;
            }
            int e10 = i10 + this.f12343j.e();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f12362b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f12362b)) {
                if (cVar.T != null) {
                    if (this.f12343j.e() != 0) {
                        z10 = false;
                    }
                    a1.b(z10);
                    cVar.T.a(j8Var);
                }
                while (true) {
                    int i18 = this.R;
                    if (i18 >= e10) {
                        break;
                    }
                    int a10 = a(j8Var, roVar, e10 - i18);
                    this.R += a10;
                    this.S += a10;
                }
            } else {
                byte[] c11 = this.f12339f.c();
                c11[0] = 0;
                c11[1] = 0;
                c11[2] = 0;
                int i19 = cVar.Y;
                int i20 = 4 - i19;
                while (this.R < e10) {
                    int i21 = this.T;
                    if (i21 == 0) {
                        a(j8Var, c11, i20, i19);
                        this.R += i19;
                        this.f12339f.f(0);
                        this.T = this.f12339f.A();
                        this.f12338e.f(0);
                        roVar.a(this.f12338e, 4);
                        this.S += 4;
                    } else {
                        int a11 = a(j8Var, roVar, i21);
                        this.R += a11;
                        this.S += a11;
                        this.T -= a11;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f12362b)) {
                this.f12341h.f(0);
                roVar.a(this.f12341h, 4);
                this.S += 4;
            }
            return f();
        }
    }

    private void a(j8 j8Var, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f12344k.b() < length) {
            this.f12344k.a(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f12344k.c(), 0, bArr.length);
        }
        j8Var.d(this.f12344k.c(), bArr.length, i10);
        this.f12344k.f(0);
        this.f12344k.e(length);
    }

    private int a(j8 j8Var, ro roVar, int i10) {
        int a10 = this.f12343j.a();
        if (a10 <= 0) {
            return roVar.a((e5) j8Var, i10, false);
        }
        int min = Math.min(i10, a10);
        roVar.a(this.f12343j, min);
        return min;
    }

    private void a(j8 j8Var, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f12343j.a());
        j8Var.d(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f12343j.a(bArr, i10, min);
        }
    }

    public final boolean a(j8 j8Var) {
        return new jk().b(j8Var);
    }
}
