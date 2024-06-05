package l4;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import e3.l;
import e3.m;
import e3.n;
import e3.o;
import e3.v;
import java.nio.ByteBuffer;
import java.util.List;
import k4.k0;
import k4.n0;
import k4.r;
import l4.x;
import n2.q;
import n2.r1;
import n2.s1;
import q2.e;
import q2.g;
import q2.i;
import s6.u;

/* compiled from: MediaCodecVideoRenderer */
public class h extends o {

    /* renamed from: o1  reason: collision with root package name */
    private static final int[] f19938o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: p1  reason: collision with root package name */
    private static boolean f19939p1;

    /* renamed from: q1  reason: collision with root package name */
    private static boolean f19940q1;
    private final Context E0;
    private final l F0;
    private final x.a G0;
    private final long H0;
    private final int I0;
    private final boolean J0;
    private b K0;
    private boolean L0;
    private boolean M0;
    private Surface N0;
    private i O0;
    private boolean P0;
    private int Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    private long U0;
    private long V0;
    private long W0;
    private int X0;
    private int Y0;
    private int Z0;

    /* renamed from: a1  reason: collision with root package name */
    private long f19941a1;

    /* renamed from: b1  reason: collision with root package name */
    private long f19942b1;

    /* renamed from: c1  reason: collision with root package name */
    private long f19943c1;

    /* renamed from: d1  reason: collision with root package name */
    private int f19944d1;

    /* renamed from: e1  reason: collision with root package name */
    private long f19945e1;

    /* renamed from: f1  reason: collision with root package name */
    private int f19946f1;

    /* renamed from: g1  reason: collision with root package name */
    private int f19947g1;

    /* renamed from: h1  reason: collision with root package name */
    private int f19948h1;

    /* renamed from: i1  reason: collision with root package name */
    private float f19949i1;

    /* renamed from: j1  reason: collision with root package name */
    private z f19950j1;

    /* renamed from: k1  reason: collision with root package name */
    private boolean f19951k1;

    /* renamed from: l1  reason: collision with root package name */
    private int f19952l1;

    /* renamed from: m1  reason: collision with root package name */
    c f19953m1;

    /* renamed from: n1  reason: collision with root package name */
    private j f19954n1;

    /* compiled from: MediaCodecVideoRenderer */
    private static final class a {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: MediaCodecVideoRenderer */
    protected static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19955a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19956b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19957c;

        public b(int i10, int i11, int i12) {
            this.f19955a = i10;
            this.f19956b = i11;
            this.f19957c = i12;
        }
    }

    /* compiled from: MediaCodecVideoRenderer */
    private final class c implements l.c, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f19958a;

        public c(l lVar) {
            Handler x10 = n0.x(this);
            this.f19958a = x10;
            lVar.c(this, x10);
        }

        private void b(long j10) {
            h hVar = h.this;
            if (this == hVar.f19953m1 && hVar.n0() != null) {
                if (j10 == Long.MAX_VALUE) {
                    h.this.R1();
                    return;
                }
                try {
                    h.this.Q1(j10);
                } catch (q e10) {
                    h.this.e1(e10);
                }
            }
        }

        public void a(l lVar, long j10, long j11) {
            if (n0.f19738a < 30) {
                this.f19958a.sendMessageAtFrontOfQueue(Message.obtain(this.f19958a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            b(j10);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(n0.W0(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, l.b bVar, e3.q qVar, long j10, boolean z10, Handler handler, x xVar, int i10) {
        this(context, bVar, qVar, j10, z10, handler, xVar, i10, 30.0f);
    }

    private static Point A1(n nVar, r1 r1Var) {
        int i10 = r1Var.f20660s;
        int i11 = r1Var.f20659r;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = ((float) i10) / ((float) i12);
        for (int i13 : f19938o1) {
            int i14 = (int) (((float) i13) * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (n0.f19738a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point c10 = nVar.c(i15, i13);
                if (nVar.w(c10.x, c10.y, (double) r1Var.f20661t)) {
                    return c10;
                }
            } else {
                try {
                    int l10 = n0.l(i13, 16) * 16;
                    int l11 = n0.l(i14, 16) * 16;
                    if (l10 * l11 <= v.N()) {
                        int i16 = z10 ? l11 : l10;
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i16, l10);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    private static List<n> C1(Context context, e3.q qVar, r1 r1Var, boolean z10, boolean z11) throws v.c {
        String str = r1Var.f20654m;
        if (str == null) {
            return u.y();
        }
        List<n> a10 = qVar.a(str, z10, z11);
        String m10 = v.m(r1Var);
        if (m10 == null) {
            return u.u(a10);
        }
        List<n> a11 = qVar.a(m10, z10, z11);
        if (n0.f19738a < 26 || !"video/dolby-vision".equals(r1Var.f20654m) || a11.isEmpty() || a.a(context)) {
            return u.p().j(a10).j(a11).k();
        }
        return u.u(a11);
    }

    protected static int D1(n nVar, r1 r1Var) {
        if (r1Var.f20655n == -1) {
            return z1(nVar, r1Var);
        }
        int size = r1Var.f20656o.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += r1Var.f20656o.get(i11).length;
        }
        return r1Var.f20655n + i10;
    }

    private static int E1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private static boolean G1(long j10) {
        return j10 < -30000;
    }

    private static boolean H1(long j10) {
        return j10 < -500000;
    }

    private void J1() {
        if (this.X0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.G0.n(this.X0, elapsedRealtime - this.W0);
            this.X0 = 0;
            this.W0 = elapsedRealtime;
        }
    }

    private void L1() {
        int i10 = this.f19944d1;
        if (i10 != 0) {
            this.G0.B(this.f19943c1, i10);
            this.f19943c1 = 0;
            this.f19944d1 = 0;
        }
    }

    private void M1() {
        int i10 = this.f19946f1;
        if (i10 != -1 || this.f19947g1 != -1) {
            z zVar = this.f19950j1;
            if (zVar == null || zVar.f20004a != i10 || zVar.f20005b != this.f19947g1 || zVar.f20006c != this.f19948h1 || zVar.f20007d != this.f19949i1) {
                z zVar2 = new z(this.f19946f1, this.f19947g1, this.f19948h1, this.f19949i1);
                this.f19950j1 = zVar2;
                this.G0.D(zVar2);
            }
        }
    }

    private void N1() {
        if (this.P0) {
            this.G0.A(this.N0);
        }
    }

    private void O1() {
        z zVar = this.f19950j1;
        if (zVar != null) {
            this.G0.D(zVar);
        }
    }

    private void P1(long j10, long j11, r1 r1Var) {
        j jVar = this.f19954n1;
        if (jVar != null) {
            jVar.e(j10, j11, r1Var, r0());
        }
    }

    /* access modifiers changed from: private */
    public void R1() {
        d1();
    }

    private void S1() {
        Surface surface = this.N0;
        i iVar = this.O0;
        if (surface == iVar) {
            this.N0 = null;
        }
        iVar.release();
        this.O0 = null;
    }

    private static void V1(l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.e(bundle);
    }

    private void W1() {
        this.V0 = this.H0 > 0 ? SystemClock.elapsedRealtime() + this.H0 : -9223372036854775807L;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void X1(java.lang.Object r5) throws n2.q {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L_0x0007
            android.view.Surface r5 = (android.view.Surface) r5
            goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r5 != 0) goto L_0x0026
            l4.i r0 = r4.O0
            if (r0 == 0) goto L_0x0010
            r5 = r0
            goto L_0x0026
        L_0x0010:
            e3.n r0 = r4.o0()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r4.c2(r0)
            if (r1 == 0) goto L_0x0026
            android.content.Context r5 = r4.E0
            boolean r0 = r0.f17859g
            l4.i r5 = l4.i.c(r5, r0)
            r4.O0 = r5
        L_0x0026:
            android.view.Surface r0 = r4.N0
            if (r0 == r5) goto L_0x006e
            r4.N0 = r5
            l4.l r0 = r4.F0
            r0.m(r5)
            r0 = 0
            r4.P0 = r0
            int r0 = r4.getState()
            e3.l r1 = r4.n0()
            if (r1 == 0) goto L_0x0054
            int r2 = k4.n0.f19738a
            r3 = 23
            if (r2 < r3) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            boolean r2 = r4.L0
            if (r2 != 0) goto L_0x004e
            r4.Y1(r1, r5)
            goto L_0x0054
        L_0x004e:
            r4.V0()
            r4.F0()
        L_0x0054:
            if (r5 == 0) goto L_0x0067
            l4.i r1 = r4.O0
            if (r5 == r1) goto L_0x0067
            r4.O1()
            r4.s1()
            r5 = 2
            if (r0 != r5) goto L_0x007a
            r4.W1()
            goto L_0x007a
        L_0x0067:
            r4.t1()
            r4.s1()
            goto L_0x007a
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            l4.i r0 = r4.O0
            if (r5 == r0) goto L_0x007a
            r4.O1()
            r4.N1()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.h.X1(java.lang.Object):void");
    }

    private boolean c2(n nVar) {
        return n0.f19738a >= 23 && !this.f19951k1 && !u1(nVar.f17853a) && (!nVar.f17859g || i.b(this.E0));
    }

    private void s1() {
        l n02;
        this.R0 = false;
        if (n0.f19738a >= 23 && this.f19951k1 && (n02 = n0()) != null) {
            this.f19953m1 = new c(n02);
        }
    }

    private void t1() {
        this.f19950j1 = null;
    }

    private static void v1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean w1() {
        return "NVIDIA".equals(n0.f19740c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0723, code lost:
        if (r0.equals("ELUGA_Ray_X") == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x08ad, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean y1() {
        /*
            int r0 = k4.n0.f19738a
            r1 = 28
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = -1
            r9 = 0
            r10 = 1
            if (r0 > r1) goto L_0x007a
            java.lang.String r11 = k4.n0.f19739b
            r11.hashCode()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1339091551: goto L_0x006b;
                case -1220081023: goto L_0x0060;
                case -1220066608: goto L_0x0055;
                case -1012436106: goto L_0x004a;
                case -760312546: goto L_0x003f;
                case -64886864: goto L_0x0034;
                case 3415681: goto L_0x0029;
                case 825323514: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            r11 = -1
            goto L_0x0075
        L_0x001e:
            java.lang.String r12 = "machuca"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0027
            goto L_0x001b
        L_0x0027:
            r11 = 7
            goto L_0x0075
        L_0x0029:
            java.lang.String r12 = "once"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0032
            goto L_0x001b
        L_0x0032:
            r11 = 6
            goto L_0x0075
        L_0x0034:
            java.lang.String r12 = "magnolia"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x003d
            goto L_0x001b
        L_0x003d:
            r11 = 5
            goto L_0x0075
        L_0x003f:
            java.lang.String r12 = "aquaman"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0048
            goto L_0x001b
        L_0x0048:
            r11 = 4
            goto L_0x0075
        L_0x004a:
            java.lang.String r12 = "oneday"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0053
            goto L_0x001b
        L_0x0053:
            r11 = 3
            goto L_0x0075
        L_0x0055:
            java.lang.String r12 = "dangalUHD"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x005e
            goto L_0x001b
        L_0x005e:
            r11 = 2
            goto L_0x0075
        L_0x0060:
            java.lang.String r12 = "dangalFHD"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0069
            goto L_0x001b
        L_0x0069:
            r11 = 1
            goto L_0x0075
        L_0x006b:
            java.lang.String r12 = "dangal"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0074
            goto L_0x001b
        L_0x0074:
            r11 = 0
        L_0x0075:
            switch(r11) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0079;
                case 2: goto L_0x0079;
                case 3: goto L_0x0079;
                case 4: goto L_0x0079;
                case 5: goto L_0x0079;
                case 6: goto L_0x0079;
                case 7: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x007a
        L_0x0079:
            return r10
        L_0x007a:
            r11 = 27
            if (r0 > r11) goto L_0x0089
            java.lang.String r12 = k4.n0.f19739b
            java.lang.String r13 = "HWEML"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x0089
            return r10
        L_0x0089:
            java.lang.String r12 = k4.n0.f19741d
            r12.hashCode()
            int r13 = r12.hashCode()
            r14 = 8
            switch(r13) {
                case -349662828: goto L_0x00f4;
                case -321033677: goto L_0x00e9;
                case 2006354: goto L_0x00de;
                case 2006367: goto L_0x00d3;
                case 2006371: goto L_0x00c8;
                case 1785421873: goto L_0x00bd;
                case 1785421876: goto L_0x00b2;
                case 1798172390: goto L_0x00a7;
                case 2119412532: goto L_0x009a;
                default: goto L_0x0097;
            }
        L_0x0097:
            r13 = -1
            goto L_0x00fe
        L_0x009a:
            java.lang.String r13 = "AFTEUFF014"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00a3
            goto L_0x0097
        L_0x00a3:
            r13 = 8
            goto L_0x00fe
        L_0x00a7:
            java.lang.String r13 = "AFTSO001"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00b0
            goto L_0x0097
        L_0x00b0:
            r13 = 7
            goto L_0x00fe
        L_0x00b2:
            java.lang.String r13 = "AFTEU014"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00bb
            goto L_0x0097
        L_0x00bb:
            r13 = 6
            goto L_0x00fe
        L_0x00bd:
            java.lang.String r13 = "AFTEU011"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00c6
            goto L_0x0097
        L_0x00c6:
            r13 = 5
            goto L_0x00fe
        L_0x00c8:
            java.lang.String r13 = "AFTR"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00d1
            goto L_0x0097
        L_0x00d1:
            r13 = 4
            goto L_0x00fe
        L_0x00d3:
            java.lang.String r13 = "AFTN"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00dc
            goto L_0x0097
        L_0x00dc:
            r13 = 3
            goto L_0x00fe
        L_0x00de:
            java.lang.String r13 = "AFTA"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00e7
            goto L_0x0097
        L_0x00e7:
            r13 = 2
            goto L_0x00fe
        L_0x00e9:
            java.lang.String r13 = "AFTKMST12"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00f2
            goto L_0x0097
        L_0x00f2:
            r13 = 1
            goto L_0x00fe
        L_0x00f4:
            java.lang.String r13 = "AFTJMST12"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00fd
            goto L_0x0097
        L_0x00fd:
            r13 = 0
        L_0x00fe:
            switch(r13) {
                case 0: goto L_0x08af;
                case 1: goto L_0x08af;
                case 2: goto L_0x08af;
                case 3: goto L_0x08af;
                case 4: goto L_0x08af;
                case 5: goto L_0x08af;
                case 6: goto L_0x08af;
                case 7: goto L_0x08af;
                case 8: goto L_0x08af;
                default: goto L_0x0101;
            }
        L_0x0101:
            r13 = 26
            if (r0 > r13) goto L_0x08ae
            java.lang.String r0 = k4.n0.f19739b
            r0.hashCode()
            int r15 = r0.hashCode()
            switch(r15) {
                case -2144781245: goto L_0x0893;
                case -2144781185: goto L_0x0887;
                case -2144781160: goto L_0x087b;
                case -2097309513: goto L_0x086f;
                case -2022874474: goto L_0x0863;
                case -1978993182: goto L_0x0857;
                case -1978990237: goto L_0x084b;
                case -1936688988: goto L_0x083f;
                case -1936688066: goto L_0x0831;
                case -1936688065: goto L_0x0823;
                case -1931988508: goto L_0x0815;
                case -1885099851: goto L_0x0807;
                case -1696512866: goto L_0x07f9;
                case -1680025915: goto L_0x07eb;
                case -1615810839: goto L_0x07dd;
                case -1600724499: goto L_0x07cf;
                case -1554255044: goto L_0x07c1;
                case -1481772737: goto L_0x07b3;
                case -1481772730: goto L_0x07a5;
                case -1481772729: goto L_0x0797;
                case -1320080169: goto L_0x0789;
                case -1217592143: goto L_0x077b;
                case -1180384755: goto L_0x076d;
                case -1139198265: goto L_0x075f;
                case -1052835013: goto L_0x0751;
                case -993250464: goto L_0x0743;
                case -993250458: goto L_0x0735;
                case -965403638: goto L_0x0727;
                case -958336948: goto L_0x071d;
                case -879245230: goto L_0x070f;
                case -842500323: goto L_0x0701;
                case -821392978: goto L_0x06f3;
                case -797483286: goto L_0x06e5;
                case -794946968: goto L_0x06d7;
                case -788334647: goto L_0x06c9;
                case -782144577: goto L_0x06bb;
                case -575125681: goto L_0x06ad;
                case -521118391: goto L_0x069f;
                case -430914369: goto L_0x0691;
                case -290434366: goto L_0x0683;
                case -282781963: goto L_0x0675;
                case -277133239: goto L_0x0667;
                case -173639913: goto L_0x0659;
                case -56598463: goto L_0x064b;
                case 2126: goto L_0x063d;
                case 2564: goto L_0x062f;
                case 2715: goto L_0x0621;
                case 2719: goto L_0x0613;
                case 3091: goto L_0x0605;
                case 3483: goto L_0x05f7;
                case 73405: goto L_0x05e9;
                case 75537: goto L_0x05db;
                case 75739: goto L_0x05cd;
                case 76779: goto L_0x05bf;
                case 78669: goto L_0x05b1;
                case 79305: goto L_0x05a3;
                case 80618: goto L_0x0595;
                case 88274: goto L_0x0587;
                case 98846: goto L_0x0579;
                case 98848: goto L_0x056b;
                case 99329: goto L_0x055d;
                case 101481: goto L_0x054f;
                case 1513190: goto L_0x0541;
                case 1514184: goto L_0x0533;
                case 1514185: goto L_0x0525;
                case 2133089: goto L_0x0517;
                case 2133091: goto L_0x0509;
                case 2133120: goto L_0x04fb;
                case 2133151: goto L_0x04ed;
                case 2133182: goto L_0x04df;
                case 2133184: goto L_0x04d1;
                case 2436959: goto L_0x04c3;
                case 2463773: goto L_0x04b5;
                case 2464648: goto L_0x04a7;
                case 2689555: goto L_0x0499;
                case 3154429: goto L_0x048b;
                case 3284551: goto L_0x047d;
                case 3351335: goto L_0x046f;
                case 3386211: goto L_0x0461;
                case 41325051: goto L_0x0453;
                case 51349633: goto L_0x0445;
                case 51350594: goto L_0x0437;
                case 55178625: goto L_0x0429;
                case 61542055: goto L_0x041b;
                case 65355429: goto L_0x040d;
                case 66214468: goto L_0x03ff;
                case 66214470: goto L_0x03f1;
                case 66214473: goto L_0x03e3;
                case 66215429: goto L_0x03d5;
                case 66215431: goto L_0x03c7;
                case 66215433: goto L_0x03b9;
                case 66216390: goto L_0x03ab;
                case 76402249: goto L_0x039d;
                case 76404105: goto L_0x038f;
                case 76404911: goto L_0x0381;
                case 80963634: goto L_0x0373;
                case 82882791: goto L_0x0365;
                case 98715550: goto L_0x0357;
                case 101370885: goto L_0x0349;
                case 102844228: goto L_0x033b;
                case 165221241: goto L_0x032d;
                case 182191441: goto L_0x031f;
                case 245388979: goto L_0x0311;
                case 287431619: goto L_0x0303;
                case 307593612: goto L_0x02f5;
                case 308517133: goto L_0x02e7;
                case 316215098: goto L_0x02d9;
                case 316215116: goto L_0x02cb;
                case 316246811: goto L_0x02bd;
                case 316246818: goto L_0x02af;
                case 407160593: goto L_0x02a1;
                case 507412548: goto L_0x0293;
                case 793982701: goto L_0x0285;
                case 794038622: goto L_0x0277;
                case 794040393: goto L_0x0269;
                case 835649806: goto L_0x025b;
                case 917340916: goto L_0x024d;
                case 958008161: goto L_0x023f;
                case 1060579533: goto L_0x0231;
                case 1150207623: goto L_0x0223;
                case 1176899427: goto L_0x0215;
                case 1280332038: goto L_0x0207;
                case 1306947716: goto L_0x01f9;
                case 1349174697: goto L_0x01eb;
                case 1522194893: goto L_0x01dd;
                case 1691543273: goto L_0x01cf;
                case 1691544261: goto L_0x01c1;
                case 1709443163: goto L_0x01b3;
                case 1865889110: goto L_0x01a5;
                case 1906253259: goto L_0x0197;
                case 1977196784: goto L_0x0189;
                case 2006372676: goto L_0x017c;
                case 2019281702: goto L_0x016f;
                case 2029784656: goto L_0x0162;
                case 2030379515: goto L_0x0155;
                case 2033393791: goto L_0x0148;
                case 2047190025: goto L_0x013b;
                case 2047252157: goto L_0x012e;
                case 2048319463: goto L_0x0121;
                case 2048855701: goto L_0x0114;
                default: goto L_0x0111;
            }
        L_0x0111:
            r1 = -1
            goto L_0x089e
        L_0x0114:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011d
            goto L_0x0111
        L_0x011d:
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x089e
        L_0x0121:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012a
            goto L_0x0111
        L_0x012a:
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x089e
        L_0x012e:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0137
            goto L_0x0111
        L_0x0137:
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x089e
        L_0x013b:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0144
            goto L_0x0111
        L_0x0144:
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x089e
        L_0x0148:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0151
            goto L_0x0111
        L_0x0151:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x089e
        L_0x0155:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x015e
            goto L_0x0111
        L_0x015e:
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x089e
        L_0x0162:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016b
            goto L_0x0111
        L_0x016b:
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x089e
        L_0x016f:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0178
            goto L_0x0111
        L_0x0178:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x089e
        L_0x017c:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0185
            goto L_0x0111
        L_0x0185:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x089e
        L_0x0189:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0193
            goto L_0x0111
        L_0x0193:
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x089e
        L_0x0197:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a1
            goto L_0x0111
        L_0x01a1:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x089e
        L_0x01a5:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01af
            goto L_0x0111
        L_0x01af:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x089e
        L_0x01b3:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01bd
            goto L_0x0111
        L_0x01bd:
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x089e
        L_0x01c1:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01cb
            goto L_0x0111
        L_0x01cb:
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x089e
        L_0x01cf:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d9
            goto L_0x0111
        L_0x01d9:
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x089e
        L_0x01dd:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01e7
            goto L_0x0111
        L_0x01e7:
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x089e
        L_0x01eb:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01f5
            goto L_0x0111
        L_0x01f5:
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x089e
        L_0x01f9:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0203
            goto L_0x0111
        L_0x0203:
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x089e
        L_0x0207:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0211
            goto L_0x0111
        L_0x0211:
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x089e
        L_0x0215:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x021f
            goto L_0x0111
        L_0x021f:
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x089e
        L_0x0223:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x022d
            goto L_0x0111
        L_0x022d:
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x089e
        L_0x0231:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x023b
            goto L_0x0111
        L_0x023b:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x089e
        L_0x023f:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0249
            goto L_0x0111
        L_0x0249:
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x089e
        L_0x024d:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0257
            goto L_0x0111
        L_0x0257:
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x089e
        L_0x025b:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0265
            goto L_0x0111
        L_0x0265:
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x089e
        L_0x0269:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0273
            goto L_0x0111
        L_0x0273:
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x089e
        L_0x0277:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0281
            goto L_0x0111
        L_0x0281:
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x089e
        L_0x0285:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x028f
            goto L_0x0111
        L_0x028f:
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x089e
        L_0x0293:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x029d
            goto L_0x0111
        L_0x029d:
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x089e
        L_0x02a1:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ab
            goto L_0x0111
        L_0x02ab:
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x089e
        L_0x02af:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b9
            goto L_0x0111
        L_0x02b9:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x089e
        L_0x02bd:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02c7
            goto L_0x0111
        L_0x02c7:
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x089e
        L_0x02cb:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02d5
            goto L_0x0111
        L_0x02d5:
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x089e
        L_0x02d9:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02e3
            goto L_0x0111
        L_0x02e3:
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x089e
        L_0x02e7:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f1
            goto L_0x0111
        L_0x02f1:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x089e
        L_0x02f5:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ff
            goto L_0x0111
        L_0x02ff:
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x089e
        L_0x0303:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x030d
            goto L_0x0111
        L_0x030d:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x089e
        L_0x0311:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x031b
            goto L_0x0111
        L_0x031b:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x089e
        L_0x031f:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0329
            goto L_0x0111
        L_0x0329:
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x089e
        L_0x032d:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0337
            goto L_0x0111
        L_0x0337:
            r1 = 100
            goto L_0x089e
        L_0x033b:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0345
            goto L_0x0111
        L_0x0345:
            r1 = 99
            goto L_0x089e
        L_0x0349:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0353
            goto L_0x0111
        L_0x0353:
            r1 = 98
            goto L_0x089e
        L_0x0357:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0361
            goto L_0x0111
        L_0x0361:
            r1 = 97
            goto L_0x089e
        L_0x0365:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x036f
            goto L_0x0111
        L_0x036f:
            r1 = 96
            goto L_0x089e
        L_0x0373:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x037d
            goto L_0x0111
        L_0x037d:
            r1 = 95
            goto L_0x089e
        L_0x0381:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x038b
            goto L_0x0111
        L_0x038b:
            r1 = 94
            goto L_0x089e
        L_0x038f:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0399
            goto L_0x0111
        L_0x0399:
            r1 = 93
            goto L_0x089e
        L_0x039d:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a7
            goto L_0x0111
        L_0x03a7:
            r1 = 92
            goto L_0x089e
        L_0x03ab:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03b5
            goto L_0x0111
        L_0x03b5:
            r1 = 91
            goto L_0x089e
        L_0x03b9:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03c3
            goto L_0x0111
        L_0x03c3:
            r1 = 90
            goto L_0x089e
        L_0x03c7:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d1
            goto L_0x0111
        L_0x03d1:
            r1 = 89
            goto L_0x089e
        L_0x03d5:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03df
            goto L_0x0111
        L_0x03df:
            r1 = 88
            goto L_0x089e
        L_0x03e3:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ed
            goto L_0x0111
        L_0x03ed:
            r1 = 87
            goto L_0x089e
        L_0x03f1:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03fb
            goto L_0x0111
        L_0x03fb:
            r1 = 86
            goto L_0x089e
        L_0x03ff:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0409
            goto L_0x0111
        L_0x0409:
            r1 = 85
            goto L_0x089e
        L_0x040d:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0417
            goto L_0x0111
        L_0x0417:
            r1 = 84
            goto L_0x089e
        L_0x041b:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0425
            goto L_0x0111
        L_0x0425:
            r1 = 83
            goto L_0x089e
        L_0x0429:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0433
            goto L_0x0111
        L_0x0433:
            r1 = 82
            goto L_0x089e
        L_0x0437:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0441
            goto L_0x0111
        L_0x0441:
            r1 = 81
            goto L_0x089e
        L_0x0445:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x044f
            goto L_0x0111
        L_0x044f:
            r1 = 80
            goto L_0x089e
        L_0x0453:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x045d
            goto L_0x0111
        L_0x045d:
            r1 = 79
            goto L_0x089e
        L_0x0461:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x046b
            goto L_0x0111
        L_0x046b:
            r1 = 78
            goto L_0x089e
        L_0x046f:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0479
            goto L_0x0111
        L_0x0479:
            r1 = 77
            goto L_0x089e
        L_0x047d:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0487
            goto L_0x0111
        L_0x0487:
            r1 = 76
            goto L_0x089e
        L_0x048b:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0495
            goto L_0x0111
        L_0x0495:
            r1 = 75
            goto L_0x089e
        L_0x0499:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04a3
            goto L_0x0111
        L_0x04a3:
            r1 = 74
            goto L_0x089e
        L_0x04a7:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b1
            goto L_0x0111
        L_0x04b1:
            r1 = 73
            goto L_0x089e
        L_0x04b5:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04bf
            goto L_0x0111
        L_0x04bf:
            r1 = 72
            goto L_0x089e
        L_0x04c3:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04cd
            goto L_0x0111
        L_0x04cd:
            r1 = 71
            goto L_0x089e
        L_0x04d1:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04db
            goto L_0x0111
        L_0x04db:
            r1 = 70
            goto L_0x089e
        L_0x04df:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e9
            goto L_0x0111
        L_0x04e9:
            r1 = 69
            goto L_0x089e
        L_0x04ed:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f7
            goto L_0x0111
        L_0x04f7:
            r1 = 68
            goto L_0x089e
        L_0x04fb:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0505
            goto L_0x0111
        L_0x0505:
            r1 = 67
            goto L_0x089e
        L_0x0509:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0513
            goto L_0x0111
        L_0x0513:
            r1 = 66
            goto L_0x089e
        L_0x0517:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0521
            goto L_0x0111
        L_0x0521:
            r1 = 65
            goto L_0x089e
        L_0x0525:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x052f
            goto L_0x0111
        L_0x052f:
            r1 = 64
            goto L_0x089e
        L_0x0533:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x053d
            goto L_0x0111
        L_0x053d:
            r1 = 63
            goto L_0x089e
        L_0x0541:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x054b
            goto L_0x0111
        L_0x054b:
            r1 = 62
            goto L_0x089e
        L_0x054f:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0559
            goto L_0x0111
        L_0x0559:
            r1 = 61
            goto L_0x089e
        L_0x055d:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0567
            goto L_0x0111
        L_0x0567:
            r1 = 60
            goto L_0x089e
        L_0x056b:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0575
            goto L_0x0111
        L_0x0575:
            r1 = 59
            goto L_0x089e
        L_0x0579:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0583
            goto L_0x0111
        L_0x0583:
            r1 = 58
            goto L_0x089e
        L_0x0587:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0591
            goto L_0x0111
        L_0x0591:
            r1 = 57
            goto L_0x089e
        L_0x0595:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x059f
            goto L_0x0111
        L_0x059f:
            r1 = 56
            goto L_0x089e
        L_0x05a3:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05ad
            goto L_0x0111
        L_0x05ad:
            r1 = 55
            goto L_0x089e
        L_0x05b1:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05bb
            goto L_0x0111
        L_0x05bb:
            r1 = 54
            goto L_0x089e
        L_0x05bf:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c9
            goto L_0x0111
        L_0x05c9:
            r1 = 53
            goto L_0x089e
        L_0x05cd:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05d7
            goto L_0x0111
        L_0x05d7:
            r1 = 52
            goto L_0x089e
        L_0x05db:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05e5
            goto L_0x0111
        L_0x05e5:
            r1 = 51
            goto L_0x089e
        L_0x05e9:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05f3
            goto L_0x0111
        L_0x05f3:
            r1 = 50
            goto L_0x089e
        L_0x05f7:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0601
            goto L_0x0111
        L_0x0601:
            r1 = 49
            goto L_0x089e
        L_0x0605:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x060f
            goto L_0x0111
        L_0x060f:
            r1 = 48
            goto L_0x089e
        L_0x0613:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x061d
            goto L_0x0111
        L_0x061d:
            r1 = 47
            goto L_0x089e
        L_0x0621:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x062b
            goto L_0x0111
        L_0x062b:
            r1 = 46
            goto L_0x089e
        L_0x062f:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0639
            goto L_0x0111
        L_0x0639:
            r1 = 45
            goto L_0x089e
        L_0x063d:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0647
            goto L_0x0111
        L_0x0647:
            r1 = 44
            goto L_0x089e
        L_0x064b:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0655
            goto L_0x0111
        L_0x0655:
            r1 = 43
            goto L_0x089e
        L_0x0659:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0663
            goto L_0x0111
        L_0x0663:
            r1 = 42
            goto L_0x089e
        L_0x0667:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0671
            goto L_0x0111
        L_0x0671:
            r1 = 41
            goto L_0x089e
        L_0x0675:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x067f
            goto L_0x0111
        L_0x067f:
            r1 = 40
            goto L_0x089e
        L_0x0683:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x068d
            goto L_0x0111
        L_0x068d:
            r1 = 39
            goto L_0x089e
        L_0x0691:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x069b
            goto L_0x0111
        L_0x069b:
            r1 = 38
            goto L_0x089e
        L_0x069f:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06a9
            goto L_0x0111
        L_0x06a9:
            r1 = 37
            goto L_0x089e
        L_0x06ad:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06b7
            goto L_0x0111
        L_0x06b7:
            r1 = 36
            goto L_0x089e
        L_0x06bb:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06c5
            goto L_0x0111
        L_0x06c5:
            r1 = 35
            goto L_0x089e
        L_0x06c9:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06d3
            goto L_0x0111
        L_0x06d3:
            r1 = 34
            goto L_0x089e
        L_0x06d7:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06e1
            goto L_0x0111
        L_0x06e1:
            r1 = 33
            goto L_0x089e
        L_0x06e5:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06ef
            goto L_0x0111
        L_0x06ef:
            r1 = 32
            goto L_0x089e
        L_0x06f3:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06fd
            goto L_0x0111
        L_0x06fd:
            r1 = 31
            goto L_0x089e
        L_0x0701:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x070b
            goto L_0x0111
        L_0x070b:
            r1 = 30
            goto L_0x089e
        L_0x070f:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0719
            goto L_0x0111
        L_0x0719:
            r1 = 29
            goto L_0x089e
        L_0x071d:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x089e
            goto L_0x0111
        L_0x0727:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0731
            goto L_0x0111
        L_0x0731:
            r1 = 27
            goto L_0x089e
        L_0x0735:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x073f
            goto L_0x0111
        L_0x073f:
            r1 = 26
            goto L_0x089e
        L_0x0743:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x074d
            goto L_0x0111
        L_0x074d:
            r1 = 25
            goto L_0x089e
        L_0x0751:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x075b
            goto L_0x0111
        L_0x075b:
            r1 = 24
            goto L_0x089e
        L_0x075f:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0769
            goto L_0x0111
        L_0x0769:
            r1 = 23
            goto L_0x089e
        L_0x076d:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0777
            goto L_0x0111
        L_0x0777:
            r1 = 22
            goto L_0x089e
        L_0x077b:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0785
            goto L_0x0111
        L_0x0785:
            r1 = 21
            goto L_0x089e
        L_0x0789:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0793
            goto L_0x0111
        L_0x0793:
            r1 = 20
            goto L_0x089e
        L_0x0797:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07a1
            goto L_0x0111
        L_0x07a1:
            r1 = 19
            goto L_0x089e
        L_0x07a5:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07af
            goto L_0x0111
        L_0x07af:
            r1 = 18
            goto L_0x089e
        L_0x07b3:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07bd
            goto L_0x0111
        L_0x07bd:
            r1 = 17
            goto L_0x089e
        L_0x07c1:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07cb
            goto L_0x0111
        L_0x07cb:
            r1 = 16
            goto L_0x089e
        L_0x07cf:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07d9
            goto L_0x0111
        L_0x07d9:
            r1 = 15
            goto L_0x089e
        L_0x07dd:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07e7
            goto L_0x0111
        L_0x07e7:
            r1 = 14
            goto L_0x089e
        L_0x07eb:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07f5
            goto L_0x0111
        L_0x07f5:
            r1 = 13
            goto L_0x089e
        L_0x07f9:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0803
            goto L_0x0111
        L_0x0803:
            r1 = 12
            goto L_0x089e
        L_0x0807:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0811
            goto L_0x0111
        L_0x0811:
            r1 = 11
            goto L_0x089e
        L_0x0815:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x081f
            goto L_0x0111
        L_0x081f:
            r1 = 10
            goto L_0x089e
        L_0x0823:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x082d
            goto L_0x0111
        L_0x082d:
            r1 = 9
            goto L_0x089e
        L_0x0831:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x083b
            goto L_0x0111
        L_0x083b:
            r1 = 8
            goto L_0x089e
        L_0x083f:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0849
            goto L_0x0111
        L_0x0849:
            r1 = 7
            goto L_0x089e
        L_0x084b:
            java.lang.String r1 = "NX573J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0855
            goto L_0x0111
        L_0x0855:
            r1 = 6
            goto L_0x089e
        L_0x0857:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0861
            goto L_0x0111
        L_0x0861:
            r1 = 5
            goto L_0x089e
        L_0x0863:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x086d
            goto L_0x0111
        L_0x086d:
            r1 = 4
            goto L_0x089e
        L_0x086f:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0879
            goto L_0x0111
        L_0x0879:
            r1 = 3
            goto L_0x089e
        L_0x087b:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0885
            goto L_0x0111
        L_0x0885:
            r1 = 2
            goto L_0x089e
        L_0x0887:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0891
            goto L_0x0111
        L_0x0891:
            r1 = 1
            goto L_0x089e
        L_0x0893:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x089d
            goto L_0x0111
        L_0x089d:
            r1 = 0
        L_0x089e:
            switch(r1) {
                case 0: goto L_0x08ad;
                case 1: goto L_0x08ad;
                case 2: goto L_0x08ad;
                case 3: goto L_0x08ad;
                case 4: goto L_0x08ad;
                case 5: goto L_0x08ad;
                case 6: goto L_0x08ad;
                case 7: goto L_0x08ad;
                case 8: goto L_0x08ad;
                case 9: goto L_0x08ad;
                case 10: goto L_0x08ad;
                case 11: goto L_0x08ad;
                case 12: goto L_0x08ad;
                case 13: goto L_0x08ad;
                case 14: goto L_0x08ad;
                case 15: goto L_0x08ad;
                case 16: goto L_0x08ad;
                case 17: goto L_0x08ad;
                case 18: goto L_0x08ad;
                case 19: goto L_0x08ad;
                case 20: goto L_0x08ad;
                case 21: goto L_0x08ad;
                case 22: goto L_0x08ad;
                case 23: goto L_0x08ad;
                case 24: goto L_0x08ad;
                case 25: goto L_0x08ad;
                case 26: goto L_0x08ad;
                case 27: goto L_0x08ad;
                case 28: goto L_0x08ad;
                case 29: goto L_0x08ad;
                case 30: goto L_0x08ad;
                case 31: goto L_0x08ad;
                case 32: goto L_0x08ad;
                case 33: goto L_0x08ad;
                case 34: goto L_0x08ad;
                case 35: goto L_0x08ad;
                case 36: goto L_0x08ad;
                case 37: goto L_0x08ad;
                case 38: goto L_0x08ad;
                case 39: goto L_0x08ad;
                case 40: goto L_0x08ad;
                case 41: goto L_0x08ad;
                case 42: goto L_0x08ad;
                case 43: goto L_0x08ad;
                case 44: goto L_0x08ad;
                case 45: goto L_0x08ad;
                case 46: goto L_0x08ad;
                case 47: goto L_0x08ad;
                case 48: goto L_0x08ad;
                case 49: goto L_0x08ad;
                case 50: goto L_0x08ad;
                case 51: goto L_0x08ad;
                case 52: goto L_0x08ad;
                case 53: goto L_0x08ad;
                case 54: goto L_0x08ad;
                case 55: goto L_0x08ad;
                case 56: goto L_0x08ad;
                case 57: goto L_0x08ad;
                case 58: goto L_0x08ad;
                case 59: goto L_0x08ad;
                case 60: goto L_0x08ad;
                case 61: goto L_0x08ad;
                case 62: goto L_0x08ad;
                case 63: goto L_0x08ad;
                case 64: goto L_0x08ad;
                case 65: goto L_0x08ad;
                case 66: goto L_0x08ad;
                case 67: goto L_0x08ad;
                case 68: goto L_0x08ad;
                case 69: goto L_0x08ad;
                case 70: goto L_0x08ad;
                case 71: goto L_0x08ad;
                case 72: goto L_0x08ad;
                case 73: goto L_0x08ad;
                case 74: goto L_0x08ad;
                case 75: goto L_0x08ad;
                case 76: goto L_0x08ad;
                case 77: goto L_0x08ad;
                case 78: goto L_0x08ad;
                case 79: goto L_0x08ad;
                case 80: goto L_0x08ad;
                case 81: goto L_0x08ad;
                case 82: goto L_0x08ad;
                case 83: goto L_0x08ad;
                case 84: goto L_0x08ad;
                case 85: goto L_0x08ad;
                case 86: goto L_0x08ad;
                case 87: goto L_0x08ad;
                case 88: goto L_0x08ad;
                case 89: goto L_0x08ad;
                case 90: goto L_0x08ad;
                case 91: goto L_0x08ad;
                case 92: goto L_0x08ad;
                case 93: goto L_0x08ad;
                case 94: goto L_0x08ad;
                case 95: goto L_0x08ad;
                case 96: goto L_0x08ad;
                case 97: goto L_0x08ad;
                case 98: goto L_0x08ad;
                case 99: goto L_0x08ad;
                case 100: goto L_0x08ad;
                case 101: goto L_0x08ad;
                case 102: goto L_0x08ad;
                case 103: goto L_0x08ad;
                case 104: goto L_0x08ad;
                case 105: goto L_0x08ad;
                case 106: goto L_0x08ad;
                case 107: goto L_0x08ad;
                case 108: goto L_0x08ad;
                case 109: goto L_0x08ad;
                case 110: goto L_0x08ad;
                case 111: goto L_0x08ad;
                case 112: goto L_0x08ad;
                case 113: goto L_0x08ad;
                case 114: goto L_0x08ad;
                case 115: goto L_0x08ad;
                case 116: goto L_0x08ad;
                case 117: goto L_0x08ad;
                case 118: goto L_0x08ad;
                case 119: goto L_0x08ad;
                case 120: goto L_0x08ad;
                case 121: goto L_0x08ad;
                case 122: goto L_0x08ad;
                case 123: goto L_0x08ad;
                case 124: goto L_0x08ad;
                case 125: goto L_0x08ad;
                case 126: goto L_0x08ad;
                case 127: goto L_0x08ad;
                case 128: goto L_0x08ad;
                case 129: goto L_0x08ad;
                case 130: goto L_0x08ad;
                case 131: goto L_0x08ad;
                case 132: goto L_0x08ad;
                case 133: goto L_0x08ad;
                case 134: goto L_0x08ad;
                case 135: goto L_0x08ad;
                case 136: goto L_0x08ad;
                case 137: goto L_0x08ad;
                case 138: goto L_0x08ad;
                case 139: goto L_0x08ad;
                default: goto L_0x08a1;
            }
        L_0x08a1:
            r12.hashCode()
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x08ad
            goto L_0x08ae
        L_0x08ad:
            return r10
        L_0x08ae:
            return r9
        L_0x08af:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.h.y1():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r3.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r10 = ((java.lang.Integer) r10.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int z1(e3.n r9, n2.r1 r10) {
        /*
            int r0 = r10.f20659r
            int r1 = r10.f20660s
            r2 = -1
            if (r0 == r2) goto L_0x00e5
            if (r1 != r2) goto L_0x000b
            goto L_0x00e5
        L_0x000b:
            java.lang.String r3 = r10.f20654m
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r10 = e3.v.q(r10)
            if (r10 == 0) goto L_0x0033
            java.lang.Object r10 = r10.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r10 == r3) goto L_0x0031
            if (r10 == r7) goto L_0x0031
            if (r10 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            r3.hashCode()
            int r10 = r3.hashCode()
            r4 = 4
            switch(r10) {
                case -1664118616: goto L_0x007d;
                case -1662735862: goto L_0x0074;
                case -1662541442: goto L_0x006b;
                case 1187890754: goto L_0x0060;
                case 1331836730: goto L_0x0057;
                case 1599127256: goto L_0x004c;
                case 1599127257: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            r7 = -1
            goto L_0x0087
        L_0x0041:
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L_0x004a
            goto L_0x003f
        L_0x004a:
            r7 = 6
            goto L_0x0087
        L_0x004c:
            java.lang.String r10 = "video/x-vnd.on2.vp8"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L_0x0055
            goto L_0x003f
        L_0x0055:
            r7 = 5
            goto L_0x0087
        L_0x0057:
            boolean r10 = r3.equals(r5)
            if (r10 != 0) goto L_0x005e
            goto L_0x003f
        L_0x005e:
            r7 = 4
            goto L_0x0087
        L_0x0060:
            java.lang.String r10 = "video/mp4v-es"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L_0x0069
            goto L_0x003f
        L_0x0069:
            r7 = 3
            goto L_0x0087
        L_0x006b:
            boolean r10 = r3.equals(r6)
            if (r10 != 0) goto L_0x0072
            goto L_0x003f
        L_0x0072:
            r7 = 2
            goto L_0x0087
        L_0x0074:
            java.lang.String r10 = "video/av01"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L_0x0087
            goto L_0x003f
        L_0x007d:
            java.lang.String r10 = "video/3gpp"
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L_0x0086
            goto L_0x003f
        L_0x0086:
            r7 = 0
        L_0x0087:
            switch(r7) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00de;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00de;
                case 4: goto L_0x0092;
                case 5: goto L_0x00de;
                case 6: goto L_0x008b;
                default: goto L_0x008a;
            }
        L_0x008a:
            return r2
        L_0x008b:
            int r0 = r0 * r1
            int r9 = E1(r0, r4)
            return r9
        L_0x0092:
            java.lang.String r10 = k4.n0.f19741d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x00d0
            java.lang.String r3 = k4.n0.f19740c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00bb
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x00d0
            java.lang.String r3 = "AFTS"
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x00bb
            boolean r9 = r9.f17859g
            if (r9 == 0) goto L_0x00bb
            goto L_0x00d0
        L_0x00bb:
            r9 = 16
            int r10 = k4.n0.l(r0, r9)
            int r0 = k4.n0.l(r1, r9)
            int r10 = r10 * r0
            int r10 = r10 * 16
            int r10 = r10 * 16
            int r9 = E1(r10, r8)
            return r9
        L_0x00d0:
            return r2
        L_0x00d1:
            r9 = 2097152(0x200000, float:2.938736E-39)
            int r0 = r0 * r1
            int r10 = E1(r0, r8)
            int r9 = java.lang.Math.max(r9, r10)
            return r9
        L_0x00de:
            int r0 = r0 * r1
            int r9 = E1(r0, r8)
            return r9
        L_0x00e5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.h.z1(e3.n, n2.r1):int");
    }

    /* access modifiers changed from: protected */
    public b B1(n nVar, r1 r1Var, r1[] r1VarArr) {
        int z12;
        int i10 = r1Var.f20659r;
        int i11 = r1Var.f20660s;
        int D1 = D1(nVar, r1Var);
        if (r1VarArr.length == 1) {
            if (!(D1 == -1 || (z12 = z1(nVar, r1Var)) == -1)) {
                D1 = Math.min((int) (((float) D1) * 1.5f), z12);
            }
            return new b(i10, i11, D1);
        }
        int length = r1VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            r1 r1Var2 = r1VarArr[i12];
            if (r1Var.f20666y != null && r1Var2.f20666y == null) {
                r1Var2 = r1Var2.b().L(r1Var.f20666y).G();
            }
            if (nVar.f(r1Var, r1Var2).f21768d != 0) {
                int i13 = r1Var2.f20659r;
                z10 |= i13 == -1 || r1Var2.f20660s == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, r1Var2.f20660s);
                D1 = Math.max(D1, D1(nVar, r1Var2));
            }
        }
        if (z10) {
            r.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point A1 = A1(nVar, r1Var);
            if (A1 != null) {
                i10 = Math.max(i10, A1.x);
                i11 = Math.max(i11, A1.y);
                D1 = Math.max(D1, z1(nVar, r1Var.b().n0(i10).S(i11).G()));
                r.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new b(i10, i11, D1);
    }

    /* access modifiers changed from: protected */
    public void F() {
        t1();
        s1();
        this.P0 = false;
        this.f19953m1 = null;
        try {
            super.F();
        } finally {
            this.G0.m(this.f17901z0);
        }
    }

    /* access modifiers changed from: protected */
    public MediaFormat F1(r1 r1Var, String str, b bVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> q10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", r1Var.f20659r);
        mediaFormat.setInteger("height", r1Var.f20660s);
        k4.u.e(mediaFormat, r1Var.f20656o);
        k4.u.c(mediaFormat, "frame-rate", r1Var.f20661t);
        k4.u.d(mediaFormat, "rotation-degrees", r1Var.f20662u);
        k4.u.b(mediaFormat, r1Var.f20666y);
        if ("video/dolby-vision".equals(r1Var.f20654m) && (q10 = v.q(r1Var)) != null) {
            k4.u.d(mediaFormat, "profile", ((Integer) q10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f19955a);
        mediaFormat.setInteger("max-height", bVar.f19956b);
        k4.u.d(mediaFormat, "max-input-size", bVar.f19957c);
        if (n0.f19738a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            v1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public void G(boolean z10, boolean z11) throws q {
        super.G(z10, z11);
        boolean z12 = z().f20723a;
        k4.a.f(!z12 || this.f19952l1 != 0);
        if (this.f19951k1 != z12) {
            this.f19951k1 = z12;
            V0();
        }
        this.G0.o(this.f17901z0);
        this.S0 = z11;
        this.T0 = false;
    }

    /* access modifiers changed from: protected */
    public void H(long j10, boolean z10) throws q {
        super.H(j10, z10);
        s1();
        this.F0.j();
        this.f19941a1 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.Y0 = 0;
        if (z10) {
            W1();
        } else {
            this.V0 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    public void H0(Exception exc) {
        r.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.G0.C(exc);
    }

    /* access modifiers changed from: protected */
    public void I() {
        try {
            super.I();
        } finally {
            if (this.O0 != null) {
                S1();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void I0(String str, l.a aVar, long j10, long j11) {
        this.G0.k(str, j10, j11);
        this.L0 = u1(str);
        this.M0 = ((n) k4.a.e(o0())).p();
        if (n0.f19738a >= 23 && this.f19951k1) {
            this.f19953m1 = new c((l) k4.a.e(n0()));
        }
    }

    /* access modifiers changed from: protected */
    public boolean I1(long j10, boolean z10) throws q {
        int O = O(j10);
        if (O == 0) {
            return false;
        }
        if (z10) {
            e eVar = this.f17901z0;
            eVar.f21745d += O;
            eVar.f21747f += this.Z0;
        } else {
            this.f17901z0.f21751j++;
            e2(O, this.Z0);
        }
        k0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void J() {
        super.J();
        this.X0 = 0;
        this.W0 = SystemClock.elapsedRealtime();
        this.f19942b1 = SystemClock.elapsedRealtime() * 1000;
        this.f19943c1 = 0;
        this.f19944d1 = 0;
        this.F0.k();
    }

    /* access modifiers changed from: protected */
    public void J0(String str) {
        this.G0.l(str);
    }

    /* access modifiers changed from: protected */
    public void K() {
        this.V0 = -9223372036854775807L;
        J1();
        L1();
        this.F0.l();
        super.K();
    }

    /* access modifiers changed from: protected */
    public i K0(s1 s1Var) throws q {
        i K02 = super.K0(s1Var);
        this.G0.p(s1Var.f20721b, K02);
        return K02;
    }

    /* access modifiers changed from: package-private */
    public void K1() {
        this.T0 = true;
        if (!this.R0) {
            this.R0 = true;
            this.G0.A(this.N0);
            this.P0 = true;
        }
    }

    /* access modifiers changed from: protected */
    public void L0(r1 r1Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        l n02 = n0();
        if (n02 != null) {
            n02.j(this.Q0);
        }
        if (this.f19951k1) {
            this.f19946f1 = r1Var.f20659r;
            this.f19947g1 = r1Var.f20660s;
        } else {
            k4.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                i10 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i10 = mediaFormat.getInteger("width");
            }
            this.f19946f1 = i10;
            if (z10) {
                i11 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i11 = mediaFormat.getInteger("height");
            }
            this.f19947g1 = i11;
        }
        float f10 = r1Var.f20663v;
        this.f19949i1 = f10;
        if (n0.f19738a >= 21) {
            int i12 = r1Var.f20662u;
            if (i12 == 90 || i12 == 270) {
                int i13 = this.f19946f1;
                this.f19946f1 = this.f19947g1;
                this.f19947g1 = i13;
                this.f19949i1 = 1.0f / f10;
            }
        } else {
            this.f19948h1 = r1Var.f20662u;
        }
        this.F0.g(r1Var.f20661t);
    }

    /* access modifiers changed from: protected */
    public void N0(long j10) {
        super.N0(j10);
        if (!this.f19951k1) {
            this.Z0--;
        }
    }

    /* access modifiers changed from: protected */
    public void O0() {
        super.O0();
        s1();
    }

    /* access modifiers changed from: protected */
    public void P0(g gVar) throws q {
        boolean z10 = this.f19951k1;
        if (!z10) {
            this.Z0++;
        }
        if (n0.f19738a < 23 && z10) {
            Q1(gVar.f21757f);
        }
    }

    /* access modifiers changed from: protected */
    public void Q1(long j10) throws q {
        o1(j10);
        M1();
        this.f17901z0.f21746e++;
        K1();
        N0(j10);
    }

    /* access modifiers changed from: protected */
    public i R(n nVar, r1 r1Var, r1 r1Var2) {
        int i10;
        i f10 = nVar.f(r1Var, r1Var2);
        int i11 = f10.f21769e;
        int i12 = r1Var2.f20659r;
        b bVar = this.K0;
        if (i12 > bVar.f19955a || r1Var2.f20660s > bVar.f19956b) {
            i11 |= 256;
        }
        if (D1(nVar, r1Var2) > this.K0.f19957c) {
            i11 |= 64;
        }
        int i13 = i11;
        String str = nVar.f17853a;
        if (i13 != 0) {
            i10 = 0;
        } else {
            i10 = f10.f21768d;
        }
        return new i(str, r1Var, r1Var2, i10, i13);
    }

    /* access modifiers changed from: protected */
    public boolean R0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, r1 r1Var) throws q {
        long j13;
        boolean z12;
        long j14 = j10;
        l lVar2 = lVar;
        int i13 = i10;
        long j15 = j12;
        k4.a.e(lVar);
        if (this.U0 == -9223372036854775807L) {
            this.U0 = j14;
        }
        if (j15 != this.f19941a1) {
            this.F0.h(j15);
            this.f19941a1 = j15;
        }
        long v02 = v0();
        long j16 = j15 - v02;
        if (!z10 || z11) {
            double w02 = (double) w0();
            boolean z13 = getState() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j17 = (long) (((double) (j15 - j14)) / w02);
            if (z13) {
                j17 -= elapsedRealtime - j11;
            }
            if (this.N0 != this.O0) {
                long j18 = elapsedRealtime - this.f19942b1;
                if (this.T0 ? this.R0 : !z13 && !this.S0) {
                    j13 = j18;
                    z12 = false;
                } else {
                    j13 = j18;
                    z12 = true;
                }
                if (this.V0 == -9223372036854775807L && j14 >= v02 && (z12 || (z13 && b2(j17, j13)))) {
                    long nanoTime = System.nanoTime();
                    P1(j16, nanoTime, r1Var);
                    if (n0.f19738a >= 21) {
                        U1(lVar, i10, j16, nanoTime);
                    } else {
                        T1(lVar2, i13, j16);
                    }
                    f2(j17);
                    return true;
                }
                if (z13 && j14 != this.U0) {
                    long nanoTime2 = System.nanoTime();
                    long b10 = this.F0.b((j17 * 1000) + nanoTime2);
                    long j19 = (b10 - nanoTime2) / 1000;
                    long j20 = j19;
                    boolean z14 = this.V0 != -9223372036854775807L;
                    if (Z1(j19, j11, z11) && I1(j14, z14)) {
                        return false;
                    }
                    if (a2(j20, j11, z11)) {
                        if (z14) {
                            d2(lVar2, i13, j16);
                        } else {
                            x1(lVar2, i13, j16);
                        }
                        f2(j20);
                        return true;
                    }
                    long j21 = j20;
                    if (n0.f19738a >= 21) {
                        if (j21 < 50000) {
                            if (b10 == this.f19945e1) {
                                d2(lVar2, i13, j16);
                            } else {
                                P1(j16, b10, r1Var);
                                U1(lVar, i10, j16, b10);
                            }
                            f2(j21);
                            this.f19945e1 = b10;
                            return true;
                        }
                    } else if (j21 < 30000) {
                        if (j21 > 11000) {
                            try {
                                Thread.sleep((j21 - UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        P1(j16, b10, r1Var);
                        T1(lVar2, i13, j16);
                        f2(j21);
                        return true;
                    }
                }
                return false;
            } else if (!G1(j17)) {
                return false;
            } else {
                d2(lVar2, i13, j16);
                f2(j17);
                return true;
            }
        } else {
            d2(lVar2, i13, j16);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void T1(l lVar, int i10, long j10) {
        M1();
        k0.a("releaseOutputBuffer");
        lVar.i(i10, true);
        k0.c();
        this.f19942b1 = SystemClock.elapsedRealtime() * 1000;
        this.f17901z0.f21746e++;
        this.Y0 = 0;
        K1();
    }

    /* access modifiers changed from: protected */
    public void U1(l lVar, int i10, long j10, long j11) {
        M1();
        k0.a("releaseOutputBuffer");
        lVar.f(i10, j11);
        k0.c();
        this.f19942b1 = SystemClock.elapsedRealtime() * 1000;
        this.f17901z0.f21746e++;
        this.Y0 = 0;
        K1();
    }

    /* access modifiers changed from: protected */
    public void X0() {
        super.X0();
        this.Z0 = 0;
    }

    /* access modifiers changed from: protected */
    public void Y1(l lVar, Surface surface) {
        lVar.l(surface);
    }

    /* access modifiers changed from: protected */
    public boolean Z1(long j10, long j11, boolean z10) {
        return H1(j10) && !z10;
    }

    /* access modifiers changed from: protected */
    public boolean a2(long j10, long j11, boolean z10) {
        return G1(j10) && !z10;
    }

    /* access modifiers changed from: protected */
    public m b0(Throwable th, n nVar) {
        return new g(th, nVar, this.N0);
    }

    /* access modifiers changed from: protected */
    public boolean b2(long j10, long j11) {
        return G1(j10) && j11 > 100000;
    }

    /* access modifiers changed from: protected */
    public void d2(l lVar, int i10, long j10) {
        k0.a("skipVideoBuffer");
        lVar.i(i10, false);
        k0.c();
        this.f17901z0.f21747f++;
    }

    /* access modifiers changed from: protected */
    public void e2(int i10, int i11) {
        e eVar = this.f17901z0;
        eVar.f21749h += i10;
        int i12 = i10 + i11;
        eVar.f21748g += i12;
        this.X0 += i12;
        int i13 = this.Y0 + i12;
        this.Y0 = i13;
        eVar.f21750i = Math.max(i13, eVar.f21750i);
        int i14 = this.I0;
        if (i14 > 0 && this.X0 >= i14) {
            J1();
        }
    }

    /* access modifiers changed from: protected */
    public void f2(long j10) {
        this.f17901z0.a(j10);
        this.f19943c1 += j10;
        this.f19944d1++;
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    public boolean h1(n nVar) {
        return this.N0 != null || c2(nVar);
    }

    public boolean isReady() {
        i iVar;
        if (super.isReady() && (this.R0 || (((iVar = this.O0) != null && this.N0 == iVar) || n0() == null || this.f19951k1))) {
            this.V0 = -9223372036854775807L;
            return true;
        } else if (this.V0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.V0) {
                return true;
            }
            this.V0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int k1(e3.q r11, n2.r1 r12) throws e3.v.c {
        /*
            r10 = this;
            java.lang.String r0 = r12.f20654m
            boolean r0 = k4.v.s(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r11 = n2.q3.a(r1)
            return r11
        L_0x000e:
            r2.m r0 = r12.f20657p
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            android.content.Context r3 = r10.E0
            java.util.List r3 = C1(r3, r11, r12, r0, r1)
            if (r0 == 0) goto L_0x002a
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x002a
            android.content.Context r3 = r10.E0
            java.util.List r3 = C1(r3, r11, r12, r1, r1)
        L_0x002a:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0035
            int r11 = n2.q3.a(r2)
            return r11
        L_0x0035:
            boolean r4 = e3.o.l1(r12)
            if (r4 != 0) goto L_0x0041
            r11 = 2
            int r11 = n2.q3.a(r11)
            return r11
        L_0x0041:
            java.lang.Object r4 = r3.get(r1)
            e3.n r4 = (e3.n) r4
            boolean r5 = r4.o(r12)
            if (r5 != 0) goto L_0x0067
            r6 = 1
        L_0x004e:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0067
            java.lang.Object r7 = r3.get(r6)
            e3.n r7 = (e3.n) r7
            boolean r8 = r7.o(r12)
            if (r8 == 0) goto L_0x0064
            r4 = r7
            r3 = 0
            r5 = 1
            goto L_0x0068
        L_0x0064:
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0067:
            r3 = 1
        L_0x0068:
            if (r5 == 0) goto L_0x006c
            r6 = 4
            goto L_0x006d
        L_0x006c:
            r6 = 3
        L_0x006d:
            boolean r7 = r4.r(r12)
            if (r7 == 0) goto L_0x0076
            r7 = 16
            goto L_0x0078
        L_0x0076:
            r7 = 8
        L_0x0078:
            boolean r4 = r4.f17860h
            if (r4 == 0) goto L_0x007f
            r4 = 64
            goto L_0x0080
        L_0x007f:
            r4 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x0085
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0086
        L_0x0085:
            r3 = 0
        L_0x0086:
            int r8 = k4.n0.f19738a
            r9 = 26
            if (r8 < r9) goto L_0x00a0
            java.lang.String r8 = r12.f20654m
            java.lang.String r9 = "video/dolby-vision"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00a0
            android.content.Context r8 = r10.E0
            boolean r8 = l4.h.a.a(r8)
            if (r8 != 0) goto L_0x00a0
            r3 = 256(0x100, float:3.59E-43)
        L_0x00a0:
            if (r5 == 0) goto L_0x00c6
            android.content.Context r5 = r10.E0
            java.util.List r11 = C1(r5, r11, r12, r0, r2)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00c6
            java.util.List r11 = e3.v.u(r11, r12)
            java.lang.Object r11 = r11.get(r1)
            e3.n r11 = (e3.n) r11
            boolean r0 = r11.o(r12)
            if (r0 == 0) goto L_0x00c6
            boolean r11 = r11.r(r12)
            if (r11 == 0) goto L_0x00c6
            r1 = 32
        L_0x00c6:
            int r11 = n2.q3.c(r6, r7, r1, r4, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.h.k1(e3.q, n2.r1):int");
    }

    public void m(float f10, float f11) throws q {
        super.m(f10, f11);
        this.F0.i(f10);
    }

    public void p(int i10, Object obj) throws q {
        if (i10 == 1) {
            X1(obj);
        } else if (i10 == 7) {
            this.f19954n1 = (j) obj;
        } else if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f19952l1 != intValue) {
                this.f19952l1 = intValue;
                if (this.f19951k1) {
                    V0();
                }
            }
        } else if (i10 == 4) {
            this.Q0 = ((Integer) obj).intValue();
            l n02 = n0();
            if (n02 != null) {
                n02.j(this.Q0);
            }
        } else if (i10 != 5) {
            super.p(i10, obj);
        } else {
            this.F0.o(((Integer) obj).intValue());
        }
    }

    /* access modifiers changed from: protected */
    public boolean p0() {
        return this.f19951k1 && n0.f19738a < 23;
    }

    /* access modifiers changed from: protected */
    public float q0(float f10, r1 r1Var, r1[] r1VarArr) {
        float f11 = -1.0f;
        for (r1 r1Var2 : r1VarArr) {
            float f12 = r1Var2.f20661t;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    /* access modifiers changed from: protected */
    public List<n> s0(e3.q qVar, r1 r1Var, boolean z10) throws v.c {
        return v.u(C1(this.E0, qVar, r1Var, z10, this.f19951k1), r1Var);
    }

    /* access modifiers changed from: protected */
    public l.a u0(n nVar, r1 r1Var, MediaCrypto mediaCrypto, float f10) {
        i iVar = this.O0;
        if (!(iVar == null || iVar.f19962a == nVar.f17859g)) {
            S1();
        }
        String str = nVar.f17855c;
        b B1 = B1(nVar, r1Var, D());
        this.K0 = B1;
        MediaFormat F1 = F1(r1Var, str, B1, f10, this.J0, this.f19951k1 ? this.f19952l1 : 0);
        if (this.N0 == null) {
            if (c2(nVar)) {
                if (this.O0 == null) {
                    this.O0 = i.c(this.E0, nVar.f17859g);
                }
                this.N0 = this.O0;
            } else {
                throw new IllegalStateException();
            }
        }
        return l.a.b(nVar, F1, r1Var, this.N0, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public boolean u1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f19939p1) {
                f19940q1 = y1();
                f19939p1 = true;
            }
        }
        return f19940q1;
    }

    /* access modifiers changed from: protected */
    public void x0(g gVar) throws q {
        if (this.M0) {
            ByteBuffer byteBuffer = (ByteBuffer) k4.a.e(gVar.f21758g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 != -75 || s10 != 60 || s11 != 1 || b11 != 4) {
                    return;
                }
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    V1(n0(), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x1(l lVar, int i10, long j10) {
        k0.a("dropVideoBuffer");
        lVar.i(i10, false);
        k0.c();
        e2(0, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, l.b bVar, e3.q qVar, long j10, boolean z10, Handler handler, x xVar, int i10, float f10) {
        super(2, bVar, qVar, z10, f10);
        this.H0 = j10;
        this.I0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.E0 = applicationContext;
        this.F0 = new l(applicationContext);
        Handler handler2 = handler;
        x xVar2 = xVar;
        this.G0 = new x.a(handler, xVar);
        this.J0 = w1();
        this.V0 = -9223372036854775807L;
        this.f19946f1 = -1;
        this.f19947g1 = -1;
        this.f19949i1 = -1.0f;
        this.Q0 = 1;
        this.f19952l1 = 0;
        t1();
    }
}
