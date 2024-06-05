package e3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import e3.l;
import e3.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k4.i0;
import k4.k0;
import k4.n0;
import k4.r;
import k4.w;
import n2.f;
import n2.i;
import n2.q;
import n2.r1;
import n2.s1;
import o2.u1;
import q2.e;
import q2.g;
import r2.h0;
import r2.n;
import r2.o;

/* compiled from: MediaCodecRenderer */
public abstract class o extends f {
    private static final byte[] D0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private r1 A;
    private c A0;
    private r2.o B;
    private long B0;
    private r2.o C;
    private boolean C0;
    private MediaCrypto D;
    private boolean E;
    private long F;
    private float G;
    private float H;
    private l I;
    private r1 J;
    private MediaFormat K;
    private boolean L;
    private float M;
    private ArrayDeque<n> N;
    private b O;
    private n P;
    private int Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f17864a0;

    /* renamed from: b0  reason: collision with root package name */
    private i f17865b0;

    /* renamed from: c0  reason: collision with root package name */
    private long f17866c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f17867d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f17868e0;

    /* renamed from: f0  reason: collision with root package name */
    private ByteBuffer f17869f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f17870g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f17871h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f17872i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f17873j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f17874k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f17875l0;

    /* renamed from: m0  reason: collision with root package name */
    private int f17876m0;

    /* renamed from: n0  reason: collision with root package name */
    private int f17877n0;

    /* renamed from: o  reason: collision with root package name */
    private final l.b f17878o;

    /* renamed from: o0  reason: collision with root package name */
    private int f17879o0;

    /* renamed from: p  reason: collision with root package name */
    private final q f17880p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f17881p0;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f17882q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f17883q0;

    /* renamed from: r  reason: collision with root package name */
    private final float f17884r;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f17885r0;

    /* renamed from: s  reason: collision with root package name */
    private final g f17886s = g.u();

    /* renamed from: s0  reason: collision with root package name */
    private long f17887s0;

    /* renamed from: t  reason: collision with root package name */
    private final g f17888t = new g(0);

    /* renamed from: t0  reason: collision with root package name */
    private long f17889t0;

    /* renamed from: u  reason: collision with root package name */
    private final g f17890u = new g(2);

    /* renamed from: u0  reason: collision with root package name */
    private boolean f17891u0;

    /* renamed from: v  reason: collision with root package name */
    private final h f17892v;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f17893v0;

    /* renamed from: w  reason: collision with root package name */
    private final ArrayList<Long> f17894w;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f17895w0;

    /* renamed from: x  reason: collision with root package name */
    private final MediaCodec.BufferInfo f17896x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f17897x0;

    /* renamed from: y  reason: collision with root package name */
    private final ArrayDeque<c> f17898y;

    /* renamed from: y0  reason: collision with root package name */
    private q f17899y0;

    /* renamed from: z  reason: collision with root package name */
    private r1 f17900z;

    /* renamed from: z0  reason: collision with root package name */
    protected e f17901z0;

    /* compiled from: MediaCodecRenderer */
    private static final class a {
        public static void a(l.a aVar, u1 u1Var) {
            LogSessionId a10 = u1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVar.f17846b.setString("log-session-id", a10.getStringId());
            }
        }
    }

    /* compiled from: MediaCodecRenderer */
    private static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final c f17907e = new c(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a  reason: collision with root package name */
        public final long f17908a;

        /* renamed from: b  reason: collision with root package name */
        public final long f17909b;

        /* renamed from: c  reason: collision with root package name */
        public final long f17910c;

        /* renamed from: d  reason: collision with root package name */
        public final i0<r1> f17911d = new i0<>();

        public c(long j10, long j11, long j12) {
            this.f17908a = j10;
            this.f17909b = j11;
            this.f17910c = j12;
        }
    }

    public o(int i10, l.b bVar, q qVar, boolean z10, float f10) {
        super(i10);
        this.f17878o = bVar;
        this.f17880p = (q) k4.a.e(qVar);
        this.f17882q = z10;
        this.f17884r = f10;
        h hVar = new h();
        this.f17892v = hVar;
        this.f17894w = new ArrayList<>();
        this.f17896x = new MediaCodec.BufferInfo();
        this.G = 1.0f;
        this.H = 1.0f;
        this.F = -9223372036854775807L;
        this.f17898y = new ArrayDeque<>();
        c1(c.f17907e);
        hVar.r(0);
        hVar.f21755c.order(ByteOrder.nativeOrder());
        this.M = -1.0f;
        this.Q = 0;
        this.f17876m0 = 0;
        this.f17867d0 = -1;
        this.f17868e0 = -1;
        this.f17866c0 = -9223372036854775807L;
        this.f17887s0 = -9223372036854775807L;
        this.f17889t0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.f17877n0 = 0;
        this.f17879o0 = 0;
    }

    /* JADX INFO: finally extract failed */
    private void A0(n nVar, MediaCrypto mediaCrypto) throws Exception {
        float f10;
        String str = nVar.f17853a;
        int i10 = n0.f19738a;
        float f11 = -1.0f;
        if (i10 < 23) {
            f10 = -1.0f;
        } else {
            f10 = q0(this.H, this.f17900z, D());
        }
        if (f10 > this.f17884r) {
            f11 = f10;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a u02 = u0(nVar, this.f17900z, mediaCrypto, f11);
        if (i10 >= 31) {
            a.a(u02, C());
        }
        try {
            k0.a("createCodec:" + str);
            this.I = this.f17878o.a(u02);
            k0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z10 = false;
            if (!nVar.o(this.f17900z)) {
                r.i("MediaCodecRenderer", n0.C("Format exceeds selected codec's capabilities [%s, %s]", r1.i(this.f17900z), str));
            }
            this.P = nVar;
            this.M = f11;
            this.J = this.f17900z;
            this.Q = S(str);
            this.R = T(str, this.J);
            this.S = Y(str);
            this.T = a0(str);
            this.U = V(str);
            this.V = W(str);
            this.W = U(str);
            this.X = Z(str, this.J);
            this.f17864a0 = X(nVar) || p0();
            if (this.I.a()) {
                this.f17875l0 = true;
                this.f17876m0 = 1;
                if (this.Q != 0) {
                    z10 = true;
                }
                this.Y = z10;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f17853a)) {
                this.f17865b0 = new i();
            }
            if (getState() == 2) {
                this.f17866c0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f17901z0.f21742a++;
            I0(str, u02, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            k0.c();
            throw th;
        }
    }

    private boolean B0(long j10) {
        int size = this.f17894w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f17894w.get(i10).longValue() == j10) {
                this.f17894w.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean C0(IllegalStateException illegalStateException) {
        if (n0.f19738a >= 21 && D0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    private static boolean D0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean E0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void G0(MediaCrypto mediaCrypto, boolean z10) throws b {
        if (this.N == null) {
            try {
                List<n> m02 = m0(z10);
                ArrayDeque<n> arrayDeque = new ArrayDeque<>();
                this.N = arrayDeque;
                if (this.f17882q) {
                    arrayDeque.addAll(m02);
                } else if (!m02.isEmpty()) {
                    this.N.add(m02.get(0));
                }
                this.O = null;
            } catch (v.c e10) {
                throw new b(this.f17900z, (Throwable) e10, z10, -49998);
            }
        }
        if (!this.N.isEmpty()) {
            n peekFirst = this.N.peekFirst();
            while (this.I == null) {
                n peekFirst2 = this.N.peekFirst();
                if (h1(peekFirst2)) {
                    try {
                        A0(peekFirst2, mediaCrypto);
                    } catch (Exception e11) {
                        if (peekFirst2 == peekFirst) {
                            r.i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50);
                            A0(peekFirst2, mediaCrypto);
                        } else {
                            throw e11;
                        }
                    } catch (Exception e12) {
                        r.j("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst2, e12);
                        this.N.removeFirst();
                        b bVar = new b(this.f17900z, (Throwable) e12, z10, peekFirst2);
                        H0(bVar);
                        b bVar2 = this.O;
                        if (bVar2 == null) {
                            this.O = bVar;
                        } else {
                            this.O = bVar2.c(bVar);
                        }
                        if (this.N.isEmpty()) {
                            throw this.O;
                        }
                    }
                } else {
                    return;
                }
            }
            this.N = null;
            return;
        }
        throw new b(this.f17900z, (Throwable) null, z10, -49999);
    }

    private void P() throws q {
        k4.a.f(!this.f17891u0);
        s1 A2 = A();
        this.f17890u.g();
        do {
            this.f17890u.g();
            int M2 = M(A2, this.f17890u, 0);
            if (M2 == -5) {
                K0(A2);
                return;
            } else if (M2 != -4) {
                if (M2 != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f17890u.l()) {
                this.f17891u0 = true;
                return;
            } else {
                if (this.f17895w0) {
                    r1 r1Var = (r1) k4.a.e(this.f17900z);
                    this.A = r1Var;
                    L0(r1Var, (MediaFormat) null);
                    this.f17895w0 = false;
                }
                this.f17890u.s();
            }
        } while (this.f17892v.w(this.f17890u));
        this.f17873j0 = true;
    }

    private boolean Q(long j10, long j11) throws q {
        k4.a.f(!this.f17893v0);
        if (this.f17892v.B()) {
            h hVar = this.f17892v;
            if (!R0(j10, j11, (l) null, hVar.f21755c, this.f17868e0, 0, hVar.A(), this.f17892v.y(), this.f17892v.k(), this.f17892v.l(), this.A)) {
                return false;
            }
            N0(this.f17892v.z());
            this.f17892v.g();
        }
        if (this.f17891u0) {
            this.f17893v0 = true;
            return false;
        }
        if (this.f17873j0) {
            k4.a.f(this.f17892v.w(this.f17890u));
            this.f17873j0 = false;
        }
        if (this.f17874k0) {
            if (this.f17892v.B()) {
                return true;
            }
            c0();
            this.f17874k0 = false;
            F0();
            if (!this.f17872i0) {
                return false;
            }
        }
        P();
        if (this.f17892v.B()) {
            this.f17892v.s();
        }
        return this.f17892v.B() || this.f17891u0 || this.f17874k0;
    }

    private void Q0() throws q {
        int i10 = this.f17879o0;
        if (i10 == 1) {
            j0();
        } else if (i10 == 2) {
            j0();
            n1();
        } else if (i10 != 3) {
            this.f17893v0 = true;
            W0();
        } else {
            U0();
        }
    }

    private int S(String str) {
        int i10 = n0.f19738a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = n0.f19741d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = n0.f19739b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private void S0() {
        this.f17885r0 = true;
        MediaFormat b10 = this.I.b();
        if (this.Q != 0 && b10.getInteger("width") == 32 && b10.getInteger("height") == 32) {
            this.Z = true;
            return;
        }
        if (this.X) {
            b10.setInteger("channel-count", 1);
        }
        this.K = b10;
        this.L = true;
    }

    private static boolean T(String str, r1 r1Var) {
        return n0.f19738a < 21 && r1Var.f20656o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private boolean T0(int i10) throws q {
        s1 A2 = A();
        this.f17886s.g();
        int M2 = M(A2, this.f17886s, i10 | 4);
        if (M2 == -5) {
            K0(A2);
            return true;
        } else if (M2 != -4 || !this.f17886s.l()) {
            return false;
        } else {
            this.f17891u0 = true;
            Q0();
            return false;
        }
    }

    private static boolean U(String str) {
        if (n0.f19738a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(n0.f19740c)) {
            String str2 = n0.f19739b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private void U0() throws q {
        V0();
        F0();
    }

    private static boolean V(String str) {
        int i10 = n0.f19738a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = n0.f19739b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean W(String str) {
        return n0.f19738a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean X(n nVar) {
        String str = nVar.f17853a;
        int i10 = n0.f19738a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(n0.f19740c) && "AFTS".equals(n0.f19741d) && nVar.f17859g));
    }

    private static boolean Y(String str) {
        int i10 = n0.f19738a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && n0.f19741d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean Z(String str, r1 r1Var) {
        if (n0.f19738a > 18 || r1Var.f20667z != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    private void Z0() {
        this.f17867d0 = -1;
        this.f17888t.f21755c = null;
    }

    private static boolean a0(String str) {
        return n0.f19738a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void a1() {
        this.f17868e0 = -1;
        this.f17869f0 = null;
    }

    private void b1(r2.o oVar) {
        n.a(this.B, oVar);
        this.B = oVar;
    }

    private void c0() {
        this.f17874k0 = false;
        this.f17892v.g();
        this.f17890u.g();
        this.f17873j0 = false;
        this.f17872i0 = false;
    }

    private void c1(c cVar) {
        this.A0 = cVar;
        long j10 = cVar.f17910c;
        if (j10 != -9223372036854775807L) {
            this.C0 = true;
            M0(j10);
        }
    }

    private boolean d0() {
        if (this.f17881p0) {
            this.f17877n0 = 1;
            if (this.S || this.U) {
                this.f17879o0 = 3;
                return false;
            }
            this.f17879o0 = 1;
        }
        return true;
    }

    private void e0() throws q {
        if (this.f17881p0) {
            this.f17877n0 = 1;
            this.f17879o0 = 3;
            return;
        }
        U0();
    }

    private boolean f0() throws q {
        if (this.f17881p0) {
            this.f17877n0 = 1;
            if (this.S || this.U) {
                this.f17879o0 = 3;
                return false;
            }
            this.f17879o0 = 2;
        } else {
            n1();
        }
        return true;
    }

    private void f1(r2.o oVar) {
        n.a(this.C, oVar);
        this.C = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g0(long r20, long r22) throws n2.q {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.y0()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r15.V
            if (r0 == 0) goto L_0x0028
            boolean r0 = r15.f17883q0
            if (r0 == 0) goto L_0x0028
            e3.l r0 = r15.I     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.f17896x     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.h(r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x0030
        L_0x001c:
            r19.Q0()
            boolean r0 = r15.f17893v0
            if (r0 == 0) goto L_0x0027
            r19.V0()
        L_0x0027:
            return r14
        L_0x0028:
            e3.l r0 = r15.I
            android.media.MediaCodec$BufferInfo r1 = r15.f17896x
            int r0 = r0.h(r1)
        L_0x0030:
            if (r0 >= 0) goto L_0x004a
            r1 = -2
            if (r0 != r1) goto L_0x0039
            r19.S0()
            return r16
        L_0x0039:
            boolean r0 = r15.f17864a0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r15.f17891u0
            if (r0 != 0) goto L_0x0046
            int r0 = r15.f17877n0
            r1 = 2
            if (r0 != r1) goto L_0x0049
        L_0x0046:
            r19.Q0()
        L_0x0049:
            return r14
        L_0x004a:
            boolean r1 = r15.Z
            if (r1 == 0) goto L_0x0056
            r15.Z = r14
            e3.l r1 = r15.I
            r1.i(r0, r14)
            return r16
        L_0x0056:
            android.media.MediaCodec$BufferInfo r1 = r15.f17896x
            int r2 = r1.size
            if (r2 != 0) goto L_0x0066
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0066
            r19.Q0()
            return r14
        L_0x0066:
            r15.f17868e0 = r0
            e3.l r1 = r15.I
            java.nio.ByteBuffer r0 = r1.n(r0)
            r15.f17869f0 = r0
            if (r0 == 0) goto L_0x0085
            android.media.MediaCodec$BufferInfo r1 = r15.f17896x
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f17869f0
            android.media.MediaCodec$BufferInfo r1 = r15.f17896x
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0085:
            boolean r0 = r15.W
            if (r0 == 0) goto L_0x00a6
            android.media.MediaCodec$BufferInfo r0 = r15.f17896x
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00a6
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00a6
            long r1 = r15.f17887s0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            r0.presentationTimeUs = r1
        L_0x00a6:
            android.media.MediaCodec$BufferInfo r0 = r15.f17896x
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.B0(r0)
            r15.f17870g0 = r0
            long r0 = r15.f17889t0
            android.media.MediaCodec$BufferInfo r2 = r15.f17896x
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r15.f17871h0 = r0
            r15.o1(r2)
        L_0x00c2:
            boolean r0 = r15.V
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r15.f17883q0
            if (r0 == 0) goto L_0x00fd
            e3.l r5 = r15.I     // Catch:{ IllegalStateException -> 0x00f0 }
            java.nio.ByteBuffer r6 = r15.f17869f0     // Catch:{ IllegalStateException -> 0x00f0 }
            int r7 = r15.f17868e0     // Catch:{ IllegalStateException -> 0x00f0 }
            android.media.MediaCodec$BufferInfo r0 = r15.f17896x     // Catch:{ IllegalStateException -> 0x00f0 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00f0 }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r12 = r15.f17870g0     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r13 = r15.f17871h0     // Catch:{ IllegalStateException -> 0x00f0 }
            n2.r1 r3 = r15.A     // Catch:{ IllegalStateException -> 0x00f0 }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = 0
            r14 = r17
            boolean r0 = r0.R0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00ee }
            goto L_0x011c
        L_0x00ee:
            goto L_0x00f2
        L_0x00f0:
            r18 = 0
        L_0x00f2:
            r19.Q0()
            boolean r0 = r15.f17893v0
            if (r0 == 0) goto L_0x00fc
            r19.V0()
        L_0x00fc:
            return r18
        L_0x00fd:
            r18 = 0
            e3.l r5 = r15.I
            java.nio.ByteBuffer r6 = r15.f17869f0
            int r7 = r15.f17868e0
            android.media.MediaCodec$BufferInfo r0 = r15.f17896x
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f17870g0
            boolean r13 = r15.f17871h0
            n2.r1 r14 = r15.A
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.R0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x011c:
            if (r0 == 0) goto L_0x0139
            android.media.MediaCodec$BufferInfo r0 = r15.f17896x
            long r0 = r0.presentationTimeUs
            r15.N0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f17896x
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x012f
            r14 = 1
            goto L_0x0130
        L_0x012f:
            r14 = 0
        L_0x0130:
            r19.a1()
            if (r14 != 0) goto L_0x0136
            return r16
        L_0x0136:
            r19.Q0()
        L_0x0139:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.g0(long, long):boolean");
    }

    private boolean g1(long j10) {
        return this.F == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.F;
    }

    private boolean h0(n nVar, r1 r1Var, r2.o oVar, r2.o oVar2) throws q {
        h0 t02;
        boolean z10;
        if (oVar == oVar2) {
            return false;
        }
        if (oVar2 == null || oVar == null || !oVar2.b().equals(oVar.b()) || n0.f19738a < 23) {
            return true;
        }
        UUID uuid = i.f20440e;
        if (uuid.equals(oVar.b()) || uuid.equals(oVar2.b()) || (t02 = t0(oVar2)) == null) {
            return true;
        }
        if (t02.f22063c) {
            z10 = false;
        } else {
            z10 = oVar2.f(r1Var.f20654m);
        }
        return !nVar.f17859g && z10;
    }

    private boolean i0() throws q {
        int i10;
        if (this.I == null || (i10 = this.f17877n0) == 2 || this.f17891u0) {
            return false;
        }
        if (i10 == 0 && i1()) {
            e0();
        }
        if (this.f17867d0 < 0) {
            int g10 = this.I.g();
            this.f17867d0 = g10;
            if (g10 < 0) {
                return false;
            }
            this.f17888t.f21755c = this.I.k(g10);
            this.f17888t.g();
        }
        if (this.f17877n0 == 1) {
            if (!this.f17864a0) {
                this.f17883q0 = true;
                this.I.m(this.f17867d0, 0, 0, 0, 4);
                Z0();
            }
            this.f17877n0 = 2;
            return false;
        } else if (this.Y) {
            this.Y = false;
            ByteBuffer byteBuffer = this.f17888t.f21755c;
            byte[] bArr = D0;
            byteBuffer.put(bArr);
            this.I.m(this.f17867d0, 0, bArr.length, 0, 0);
            Z0();
            this.f17881p0 = true;
            return true;
        } else {
            if (this.f17876m0 == 1) {
                for (int i11 = 0; i11 < this.J.f20656o.size(); i11++) {
                    this.f17888t.f21755c.put(this.J.f20656o.get(i11));
                }
                this.f17876m0 = 2;
            }
            int position = this.f17888t.f21755c.position();
            s1 A2 = A();
            try {
                int M2 = M(A2, this.f17888t, 0);
                if (g() || this.f17888t.o()) {
                    this.f17889t0 = this.f17887s0;
                }
                if (M2 == -3) {
                    return false;
                }
                if (M2 == -5) {
                    if (this.f17876m0 == 2) {
                        this.f17888t.g();
                        this.f17876m0 = 1;
                    }
                    K0(A2);
                    return true;
                } else if (this.f17888t.l()) {
                    if (this.f17876m0 == 2) {
                        this.f17888t.g();
                        this.f17876m0 = 1;
                    }
                    this.f17891u0 = true;
                    if (!this.f17881p0) {
                        Q0();
                        return false;
                    }
                    try {
                        if (!this.f17864a0) {
                            this.f17883q0 = true;
                            this.I.m(this.f17867d0, 0, 0, 0, 4);
                            Z0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw x(e10, this.f17900z, n0.U(e10.getErrorCode()));
                    }
                } else if (this.f17881p0 || this.f17888t.n()) {
                    boolean t10 = this.f17888t.t();
                    if (t10) {
                        this.f17888t.f21754b.b(position);
                    }
                    if (this.R && !t10) {
                        w.b(this.f17888t.f21755c);
                        if (this.f17888t.f21755c.position() == 0) {
                            return true;
                        }
                        this.R = false;
                    }
                    g gVar = this.f17888t;
                    long j10 = gVar.f21757f;
                    i iVar = this.f17865b0;
                    if (iVar != null) {
                        j10 = iVar.d(this.f17900z, gVar);
                        this.f17887s0 = Math.max(this.f17887s0, this.f17865b0.b(this.f17900z));
                    }
                    long j11 = j10;
                    if (this.f17888t.k()) {
                        this.f17894w.add(Long.valueOf(j11));
                    }
                    if (this.f17895w0) {
                        if (!this.f17898y.isEmpty()) {
                            this.f17898y.peekLast().f17911d.a(j11, this.f17900z);
                        } else {
                            this.A0.f17911d.a(j11, this.f17900z);
                        }
                        this.f17895w0 = false;
                    }
                    this.f17887s0 = Math.max(this.f17887s0, j11);
                    this.f17888t.s();
                    if (this.f17888t.j()) {
                        x0(this.f17888t);
                    }
                    P0(this.f17888t);
                    if (t10) {
                        try {
                            this.I.d(this.f17867d0, 0, this.f17888t.f21754b, j11, 0);
                        } catch (MediaCodec.CryptoException e11) {
                            throw x(e11, this.f17900z, n0.U(e11.getErrorCode()));
                        }
                    } else {
                        this.I.m(this.f17867d0, 0, this.f17888t.f21755c.limit(), j11, 0);
                    }
                    Z0();
                    this.f17881p0 = true;
                    this.f17876m0 = 0;
                    this.f17901z0.f21744c++;
                    return true;
                } else {
                    this.f17888t.g();
                    if (this.f17876m0 == 2) {
                        this.f17876m0 = 1;
                    }
                    return true;
                }
            } catch (g.a e12) {
                H0(e12);
                T0(0);
                j0();
                return true;
            }
        }
    }

    private void j0() {
        try {
            this.I.flush();
        } finally {
            X0();
        }
    }

    protected static boolean l1(r1 r1Var) {
        int i10 = r1Var.H;
        return i10 == 0 || i10 == 2;
    }

    private List<n> m0(boolean z10) throws v.c {
        List<n> s02 = s0(this.f17880p, this.f17900z, z10);
        if (s02.isEmpty() && z10) {
            s02 = s0(this.f17880p, this.f17900z, false);
            if (!s02.isEmpty()) {
                r.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f17900z.f20654m + ", but no secure decoder available. Trying to proceed with " + s02 + ".");
            }
        }
        return s02;
    }

    private boolean m1(r1 r1Var) throws q {
        if (!(n0.f19738a < 23 || this.I == null || this.f17879o0 == 3 || getState() == 0)) {
            float q02 = q0(this.H, r1Var, D());
            float f10 = this.M;
            if (f10 == q02) {
                return true;
            }
            if (q02 == -1.0f) {
                e0();
                return false;
            } else if (f10 == -1.0f && q02 <= this.f17884r) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", q02);
                this.I.e(bundle);
                this.M = q02;
            }
        }
        return true;
    }

    private void n1() throws q {
        try {
            this.D.setMediaDrmSession(t0(this.C).f22062b);
            b1(this.C);
            this.f17877n0 = 0;
            this.f17879o0 = 0;
        } catch (MediaCryptoException e10) {
            throw x(e10, this.f17900z, 6006);
        }
    }

    private h0 t0(r2.o oVar) throws q {
        q2.b g10 = oVar.g();
        if (g10 == null || (g10 instanceof h0)) {
            return (h0) g10;
        }
        throw x(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + g10), this.f17900z, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    private boolean y0() {
        return this.f17868e0 >= 0;
    }

    private void z0(r1 r1Var) {
        c0();
        String str = r1Var.f20654m;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f17892v.C(32);
        } else {
            this.f17892v.C(1);
        }
        this.f17872i0 = true;
    }

    /* access modifiers changed from: protected */
    public void F() {
        this.f17900z = null;
        c1(c.f17907e);
        this.f17898y.clear();
        l0();
    }

    /* access modifiers changed from: protected */
    public final void F0() throws q {
        r1 r1Var;
        if (this.I == null && !this.f17872i0 && (r1Var = this.f17900z) != null) {
            if (this.C != null || !j1(r1Var)) {
                b1(this.C);
                String str = this.f17900z.f20654m;
                r2.o oVar = this.B;
                if (oVar != null) {
                    if (this.D == null) {
                        h0 t02 = t0(oVar);
                        if (t02 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(t02.f22061a, t02.f22062b);
                                this.D = mediaCrypto;
                                this.E = !t02.f22063c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e10) {
                                throw x(e10, this.f17900z, 6006);
                            }
                        } else if (this.B.getError() == null) {
                            return;
                        }
                    }
                    if (h0.f22060d) {
                        int state = this.B.getState();
                        if (state == 1) {
                            o.a aVar = (o.a) k4.a.e(this.B.getError());
                            throw x(aVar, this.f17900z, aVar.f22086a);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    G0(this.D, this.E);
                } catch (b e11) {
                    throw x(e11, this.f17900z, 4001);
                }
            } else {
                z0(this.f17900z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void G(boolean z10, boolean z11) throws q {
        this.f17901z0 = new e();
    }

    /* access modifiers changed from: protected */
    public void H(long j10, boolean z10) throws q {
        this.f17891u0 = false;
        this.f17893v0 = false;
        this.f17897x0 = false;
        if (this.f17872i0) {
            this.f17892v.g();
            this.f17890u.g();
            this.f17873j0 = false;
        } else {
            k0();
        }
        if (this.A0.f17911d.k() > 0) {
            this.f17895w0 = true;
        }
        this.A0.f17911d.c();
        this.f17898y.clear();
    }

    /* access modifiers changed from: protected */
    public abstract void H0(Exception exc);

    /* access modifiers changed from: protected */
    public void I() {
        try {
            c0();
            V0();
        } finally {
            f1((r2.o) null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void I0(String str, l.a aVar, long j10, long j11);

    /* access modifiers changed from: protected */
    public void J() {
    }

    /* access modifiers changed from: protected */
    public abstract void J0(String str);

    /* access modifiers changed from: protected */
    public void K() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (f0() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (f0() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cf, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00eb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q2.i K0(n2.s1 r12) throws n2.q {
        /*
            r11 = this;
            r0 = 1
            r11.f17895w0 = r0
            n2.r1 r1 = r12.f20721b
            java.lang.Object r1 = k4.a.e(r1)
            r5 = r1
            n2.r1 r5 = (n2.r1) r5
            java.lang.String r1 = r5.f20654m
            if (r1 == 0) goto L_0x00ec
            r2.o r12 = r12.f20720a
            r11.f1(r12)
            r11.f17900z = r5
            boolean r12 = r11.f17872i0
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.f17874k0 = r0
            return r1
        L_0x001f:
            e3.l r12 = r11.I
            if (r12 != 0) goto L_0x0029
            r11.N = r1
            r11.F0()
            return r1
        L_0x0029:
            e3.n r1 = r11.P
            n2.r1 r4 = r11.J
            r2.o r2 = r11.B
            r2.o r3 = r11.C
            boolean r2 = r11.h0(r1, r5, r2, r3)
            if (r2 == 0) goto L_0x0046
            r11.e0()
            q2.i r12 = new q2.i
            java.lang.String r3 = r1.f17853a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            r2.o r2 = r11.C
            r2.o r3 = r11.B
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = k4.n0.f19738a
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            goto L_0x005c
        L_0x005b:
            r3 = 1
        L_0x005c:
            k4.a.f(r3)
            q2.i r3 = r11.R(r1, r4, r5)
            int r7 = r3.f21768d
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00d1
            if (r7 == r0) goto L_0x00b5
            if (r7 == r10) goto L_0x0089
            if (r7 != r8) goto L_0x0083
            boolean r0 = r11.m1(r5)
            if (r0 != 0) goto L_0x0078
            goto L_0x00bb
        L_0x0078:
            r11.J = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.f0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x0083:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0089:
            boolean r7 = r11.m1(r5)
            if (r7 != 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            r11.f17875l0 = r0
            r11.f17876m0 = r0
            int r7 = r11.Q
            if (r7 == r10) goto L_0x00a8
            if (r7 != r0) goto L_0x00a7
            int r7 = r5.f20659r
            int r9 = r4.f20659r
            if (r7 != r9) goto L_0x00a7
            int r7 = r5.f20660s
            int r9 = r4.f20660s
            if (r7 != r9) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r11.Y = r0
            r11.J = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.f0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00b5:
            boolean r0 = r11.m1(r5)
            if (r0 != 0) goto L_0x00be
        L_0x00bb:
            r7 = 16
            goto L_0x00d5
        L_0x00be:
            r11.J = r5
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r11.f0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00c9:
            boolean r0 = r11.d0()
            if (r0 != 0) goto L_0x00d4
        L_0x00cf:
            r7 = 2
            goto L_0x00d5
        L_0x00d1:
            r11.e0()
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            int r0 = r3.f21768d
            if (r0 == 0) goto L_0x00eb
            e3.l r0 = r11.I
            if (r0 != r12) goto L_0x00e1
            int r12 = r11.f17879o0
            if (r12 != r8) goto L_0x00eb
        L_0x00e1:
            q2.i r12 = new q2.i
            java.lang.String r3 = r1.f17853a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00eb:
            return r3
        L_0x00ec:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            n2.q r12 = r11.x(r12, r5, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.K0(n2.s1):q2.i");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r5 >= r1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void L(n2.r1[] r16, long r17, long r19) throws n2.q {
        /*
            r15 = this;
            r0 = r15
            e3.o$c r1 = r0.A0
            long r1 = r1.f17910c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0021
            e3.o$c r1 = new e3.o$c
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.c1(r1)
            goto L_0x0068
        L_0x0021:
            java.util.ArrayDeque<e3.o$c> r1 = r0.f17898y
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0057
            long r1 = r0.f17887s0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            long r5 = r0.B0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0057
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x0057
        L_0x0039:
            e3.o$c r1 = new e3.o$c
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.c1(r1)
            e3.o$c r1 = r0.A0
            long r1 = r1.f17910c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0068
            r15.O0()
            goto L_0x0068
        L_0x0057:
            java.util.ArrayDeque<e3.o$c> r1 = r0.f17898y
            e3.o$c r9 = new e3.o$c
            long r3 = r0.f17887s0
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.o.L(n2.r1[], long, long):void");
    }

    /* access modifiers changed from: protected */
    public abstract void L0(r1 r1Var, MediaFormat mediaFormat) throws q;

    /* access modifiers changed from: protected */
    public void M0(long j10) {
    }

    /* access modifiers changed from: protected */
    public void N0(long j10) {
        this.B0 = j10;
        while (!this.f17898y.isEmpty() && j10 >= this.f17898y.peek().f17908a) {
            c1(this.f17898y.poll());
            O0();
        }
    }

    /* access modifiers changed from: protected */
    public void O0() {
    }

    /* access modifiers changed from: protected */
    public abstract void P0(g gVar) throws q;

    /* access modifiers changed from: protected */
    public abstract q2.i R(n nVar, r1 r1Var, r1 r1Var2);

    /* access modifiers changed from: protected */
    public abstract boolean R0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, r1 r1Var) throws q;

    /* access modifiers changed from: protected */
    public void V0() {
        try {
            l lVar = this.I;
            if (lVar != null) {
                lVar.release();
                this.f17901z0.f21743b++;
                J0(this.P.f17853a);
            }
            this.I = null;
            try {
                MediaCrypto mediaCrypto = this.D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.D = null;
                b1((r2.o) null);
                Y0();
            }
        } catch (Throwable th) {
            this.I = null;
            MediaCrypto mediaCrypto2 = this.D;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.D = null;
            b1((r2.o) null);
            Y0();
        }
    }

    /* access modifiers changed from: protected */
    public void W0() throws q {
    }

    /* access modifiers changed from: protected */
    public void X0() {
        Z0();
        a1();
        this.f17866c0 = -9223372036854775807L;
        this.f17883q0 = false;
        this.f17881p0 = false;
        this.Y = false;
        this.Z = false;
        this.f17870g0 = false;
        this.f17871h0 = false;
        this.f17894w.clear();
        this.f17887s0 = -9223372036854775807L;
        this.f17889t0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        i iVar = this.f17865b0;
        if (iVar != null) {
            iVar.c();
        }
        this.f17877n0 = 0;
        this.f17879o0 = 0;
        this.f17876m0 = this.f17875l0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void Y0() {
        X0();
        this.f17899y0 = null;
        this.f17865b0 = null;
        this.N = null;
        this.P = null;
        this.J = null;
        this.K = null;
        this.L = false;
        this.f17885r0 = false;
        this.M = -1.0f;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.f17864a0 = false;
        this.f17875l0 = false;
        this.f17876m0 = 0;
        this.E = false;
    }

    public final int a(r1 r1Var) throws q {
        try {
            return k1(this.f17880p, r1Var);
        } catch (v.c e10) {
            throw x(e10, r1Var, 4002);
        }
    }

    public boolean b() {
        return this.f17893v0;
    }

    /* access modifiers changed from: protected */
    public m b0(Throwable th, n nVar) {
        return new m(th, nVar);
    }

    /* access modifiers changed from: protected */
    public final void d1() {
        this.f17897x0 = true;
    }

    /* access modifiers changed from: protected */
    public final void e1(q qVar) {
        this.f17899y0 = qVar;
    }

    /* access modifiers changed from: protected */
    public boolean h1(n nVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean i1() {
        return false;
    }

    public boolean isReady() {
        return this.f17900z != null && (E() || y0() || (this.f17866c0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f17866c0));
    }

    /* access modifiers changed from: protected */
    public boolean j1(r1 r1Var) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean k0() throws q {
        boolean l02 = l0();
        if (l02) {
            F0();
        }
        return l02;
    }

    /* access modifiers changed from: protected */
    public abstract int k1(q qVar, r1 r1Var) throws v.c;

    /* access modifiers changed from: protected */
    public boolean l0() {
        if (this.I == null) {
            return false;
        }
        int i10 = this.f17879o0;
        if (i10 == 3 || this.S || ((this.T && !this.f17885r0) || (this.U && this.f17883q0))) {
            V0();
            return true;
        }
        if (i10 == 2) {
            int i11 = n0.f19738a;
            k4.a.f(i11 >= 23);
            if (i11 >= 23) {
                try {
                    n1();
                } catch (q e10) {
                    r.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    V0();
                    return true;
                }
            }
        }
        j0();
        return false;
    }

    public void m(float f10, float f11) throws q {
        this.G = f10;
        this.H = f11;
        m1(this.J);
    }

    public final int n() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public final l n0() {
        return this.I;
    }

    public void o(long j10, long j11) throws q {
        boolean z10 = false;
        if (this.f17897x0) {
            this.f17897x0 = false;
            Q0();
        }
        q qVar = this.f17899y0;
        if (qVar == null) {
            try {
                if (this.f17893v0) {
                    W0();
                } else if (this.f17900z != null || T0(2)) {
                    F0();
                    if (this.f17872i0) {
                        k0.a("bypassRender");
                        while (Q(j10, j11)) {
                        }
                        k0.c();
                    } else if (this.I != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        k0.a("drainAndFeed");
                        while (g0(j10, j11) && g1(elapsedRealtime)) {
                        }
                        while (i0() && g1(elapsedRealtime)) {
                        }
                        k0.c();
                    } else {
                        this.f17901z0.f21745d += O(j10);
                        T0(1);
                    }
                    this.f17901z0.c();
                }
            } catch (IllegalStateException e10) {
                if (C0(e10)) {
                    H0(e10);
                    if (n0.f19738a >= 21 && E0(e10)) {
                        z10 = true;
                    }
                    if (z10) {
                        V0();
                    }
                    throw y(b0(e10, o0()), this.f17900z, z10, 4003);
                }
                throw e10;
            }
        } else {
            this.f17899y0 = null;
            throw qVar;
        }
    }

    /* access modifiers changed from: protected */
    public final n o0() {
        return this.P;
    }

    /* access modifiers changed from: protected */
    public final void o1(long j10) throws q {
        boolean z10;
        r1 i10 = this.A0.f17911d.i(j10);
        if (i10 == null && this.C0 && this.K != null) {
            i10 = this.A0.f17911d.h();
        }
        if (i10 != null) {
            this.A = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.L && this.A != null)) {
            L0(this.A, this.K);
            this.L = false;
            this.C0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean p0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract float q0(float f10, r1 r1Var, r1[] r1VarArr);

    /* access modifiers changed from: protected */
    public final MediaFormat r0() {
        return this.K;
    }

    /* access modifiers changed from: protected */
    public abstract List<n> s0(q qVar, r1 r1Var, boolean z10) throws v.c;

    /* access modifiers changed from: protected */
    public abstract l.a u0(n nVar, r1 r1Var, MediaCrypto mediaCrypto, float f10);

    /* access modifiers changed from: protected */
    public final long v0() {
        return this.A0.f17910c;
    }

    /* access modifiers changed from: protected */
    public float w0() {
        return this.G;
    }

    /* access modifiers changed from: protected */
    public void x0(g gVar) throws q {
    }

    /* compiled from: MediaCodecRenderer */
    public static class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f17902a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17903b;

        /* renamed from: c  reason: collision with root package name */
        public final n f17904c;

        /* renamed from: d  reason: collision with root package name */
        public final String f17905d;

        /* renamed from: f  reason: collision with root package name */
        public final b f17906f;

        public b(r1 r1Var, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + r1Var, th, r1Var.f20654m, z10, (n) null, b(i10), (b) null);
        }

        private static String b(int i10) {
            String str = i10 < 0 ? "neg_" : MaxReward.DEFAULT_LABEL;
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i10);
        }

        /* access modifiers changed from: private */
        public b c(b bVar) {
            return new b(getMessage(), getCause(), this.f17902a, this.f17903b, this.f17904c, this.f17905d, bVar);
        }

        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(r1 r1Var, Throwable th, boolean z10, n nVar) {
            this("Decoder init failed: " + nVar.f17853a + ", " + r1Var, th, r1Var.f20654m, z10, nVar, n0.f19738a >= 21 ? d(th) : null, (b) null);
        }

        private b(String str, Throwable th, String str2, boolean z10, n nVar, String str3, b bVar) {
            super(str, th);
            this.f17902a = str2;
            this.f17903b = z10;
            this.f17904c = nVar;
            this.f17905d = str3;
            this.f17906f = bVar;
        }
    }
}
