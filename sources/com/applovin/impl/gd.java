package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.cd;
import com.applovin.impl.f1;
import com.applovin.impl.id;
import com.applovin.impl.n5;
import com.applovin.impl.x6;
import com.applovin.mediation.MaxReward;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class gd extends d2 {
    private static final byte[] I0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private final long[] A;
    private boolean A0;
    private d9 B;
    private boolean B0;
    private d9 C;
    private boolean C0;
    private x6 D;
    private y7 D0;
    private x6 E;
    protected l5 E0;
    private MediaCrypto F;
    private long F0;
    private boolean G;
    private long G0;
    private long H;
    private int H0;
    private float I;
    private float J;
    private cd K;
    private d9 L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private ArrayDeque P;
    private a Q;
    private fd R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f7967a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f7968b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f7969c0;

    /* renamed from: d0  reason: collision with root package name */
    private q2 f7970d0;

    /* renamed from: e0  reason: collision with root package name */
    private long f7971e0;

    /* renamed from: f0  reason: collision with root package name */
    private int f7972f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f7973g0;

    /* renamed from: h0  reason: collision with root package name */
    private ByteBuffer f7974h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f7975i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f7976j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f7977k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f7978l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f7979m0;

    /* renamed from: n  reason: collision with root package name */
    private final cd.b f7980n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f7981n0;

    /* renamed from: o  reason: collision with root package name */
    private final hd f7982o;

    /* renamed from: o0  reason: collision with root package name */
    private int f7983o0;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f7984p;

    /* renamed from: p0  reason: collision with root package name */
    private int f7985p0;

    /* renamed from: q  reason: collision with root package name */
    private final float f7986q;

    /* renamed from: q0  reason: collision with root package name */
    private int f7987q0;

    /* renamed from: r  reason: collision with root package name */
    private final n5 f7988r = n5.i();

    /* renamed from: r0  reason: collision with root package name */
    private boolean f7989r0;

    /* renamed from: s  reason: collision with root package name */
    private final n5 f7990s = new n5(0);

    /* renamed from: s0  reason: collision with root package name */
    private boolean f7991s0;

    /* renamed from: t  reason: collision with root package name */
    private final n5 f7992t = new n5(2);

    /* renamed from: t0  reason: collision with root package name */
    private boolean f7993t0;

    /* renamed from: u  reason: collision with root package name */
    private final f2 f7994u;

    /* renamed from: u0  reason: collision with root package name */
    private long f7995u0;

    /* renamed from: v  reason: collision with root package name */
    private final fo f7996v;

    /* renamed from: v0  reason: collision with root package name */
    private long f7997v0;

    /* renamed from: w  reason: collision with root package name */
    private final ArrayList f7998w;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f7999w0;

    /* renamed from: x  reason: collision with root package name */
    private final MediaCodec.BufferInfo f8000x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f8001x0;

    /* renamed from: y  reason: collision with root package name */
    private final long[] f8002y;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f8003y0;

    /* renamed from: z  reason: collision with root package name */
    private final long[] f8004z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f8005z0;

    public static class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f8006a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8007b;

        /* renamed from: c  reason: collision with root package name */
        public final fd f8008c;

        /* renamed from: d  reason: collision with root package name */
        public final String f8009d;

        /* renamed from: f  reason: collision with root package name */
        public final a f8010f;

        public a(d9 d9Var, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + d9Var, th, d9Var.f7153m, z10, (fd) null, a(i10), (a) null);
        }

        private static String a(int i10) {
            String str = i10 < 0 ? "neg_" : MaxReward.DEFAULT_LABEL;
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i10);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(d9 d9Var, Throwable th, boolean z10, fd fdVar) {
            this("Decoder init failed: " + fdVar.f7722a + ", " + d9Var, th, d9Var.f7153m, z10, fdVar, yp.f13662a >= 21 ? a(th) : null, (a) null);
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f8006a, this.f8007b, this.f8008c, this.f8009d, aVar);
        }

        private a(String str, Throwable th, String str2, boolean z10, fd fdVar, String str3, a aVar) {
            super(str, th);
            this.f8006a = str2;
            this.f8007b = z10;
            this.f8008c = fdVar;
            this.f8009d = str3;
            this.f8010f = aVar;
        }
    }

    public gd(int i10, cd.b bVar, hd hdVar, boolean z10, float f10) {
        super(i10);
        this.f7980n = bVar;
        this.f7982o = (hd) a1.a((Object) hdVar);
        this.f7984p = z10;
        this.f7986q = f10;
        f2 f2Var = new f2();
        this.f7994u = f2Var;
        this.f7996v = new fo();
        this.f7998w = new ArrayList();
        this.f8000x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f8002y = new long[10];
        this.f8004z = new long[10];
        this.A = new long[10];
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        f2Var.g(0);
        f2Var.f9906c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f7983o0 = 0;
        this.f7972f0 = -1;
        this.f7973g0 = -1;
        this.f7971e0 = -9223372036854775807L;
        this.f7995u0 = -9223372036854775807L;
        this.f7997v0 = -9223372036854775807L;
        this.f7985p0 = 0;
        this.f7987q0 = 0;
    }

    private void A() {
        this.f7979m0 = false;
        this.f7994u.b();
        this.f7992t.b();
        this.f7978l0 = false;
        this.f7977k0 = false;
    }

    private boolean B() {
        if (this.f7989r0) {
            this.f7985p0 = 1;
            if (this.U || this.W) {
                this.f7987q0 = 3;
                return false;
            }
            this.f7987q0 = 1;
        }
        return true;
    }

    private void C() {
        if (this.f7989r0) {
            this.f7985p0 = 1;
            this.f7987q0 = 3;
            return;
        }
        T();
    }

    private boolean D() {
        if (this.f7989r0) {
            this.f7985p0 = 1;
            if (this.U || this.W) {
                this.f7987q0 = 3;
                return false;
            }
            this.f7987q0 = 2;
        } else {
            b0();
        }
        return true;
    }

    private boolean E() {
        cd cdVar = this.K;
        if (cdVar == null || this.f7985p0 == 2 || this.f7999w0) {
            return false;
        }
        if (this.f7972f0 < 0) {
            int d10 = cdVar.d();
            this.f7972f0 = d10;
            if (d10 < 0) {
                return false;
            }
            this.f7990s.f9906c = this.K.a(d10);
            this.f7990s.b();
        }
        if (this.f7985p0 == 1) {
            if (!this.f7969c0) {
                this.f7991s0 = true;
                this.K.a(this.f7972f0, 0, 0, 0, 4);
                Y();
            }
            this.f7985p0 = 2;
            return false;
        } else if (this.f7967a0) {
            this.f7967a0 = false;
            ByteBuffer byteBuffer = this.f7990s.f9906c;
            byte[] bArr = I0;
            byteBuffer.put(bArr);
            this.K.a(this.f7972f0, 0, bArr.length, 0, 0);
            Y();
            this.f7989r0 = true;
            return true;
        } else {
            if (this.f7983o0 == 1) {
                for (int i10 = 0; i10 < this.L.f7155o.size(); i10++) {
                    this.f7990s.f9906c.put((byte[]) this.L.f7155o.get(i10));
                }
                this.f7983o0 = 2;
            }
            int position = this.f7990s.f9906c.position();
            e9 r10 = r();
            try {
                int a10 = a(r10, this.f7990s, 0);
                if (j()) {
                    this.f7997v0 = this.f7995u0;
                }
                if (a10 == -3) {
                    return false;
                }
                if (a10 == -5) {
                    if (this.f7983o0 == 2) {
                        this.f7990s.b();
                        this.f7983o0 = 1;
                    }
                    a(r10);
                    return true;
                } else if (this.f7990s.e()) {
                    if (this.f7983o0 == 2) {
                        this.f7990s.b();
                        this.f7983o0 = 1;
                    }
                    this.f7999w0 = true;
                    if (!this.f7989r0) {
                        R();
                        return false;
                    }
                    try {
                        if (!this.f7969c0) {
                            this.f7991s0 = true;
                            this.K.a(this.f7972f0, 0, 0, 0, 4);
                            Y();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw a((Throwable) e10, this.B, r2.a(e10.getErrorCode()));
                    }
                } else if (this.f7989r0 || this.f7990s.f()) {
                    boolean h10 = this.f7990s.h();
                    if (h10) {
                        this.f7990s.f9905b.a(position);
                    }
                    if (this.T && !h10) {
                        uf.a(this.f7990s.f9906c);
                        if (this.f7990s.f9906c.position() == 0) {
                            return true;
                        }
                        this.T = false;
                    }
                    n5 n5Var = this.f7990s;
                    long j10 = n5Var.f9908f;
                    q2 q2Var = this.f7970d0;
                    if (q2Var != null) {
                        j10 = q2Var.a(this.B, n5Var);
                        this.f7995u0 = Math.max(this.f7995u0, this.f7970d0.a(this.B));
                    }
                    long j11 = j10;
                    if (this.f7990s.d()) {
                        this.f7998w.add(Long.valueOf(j11));
                    }
                    if (this.f8003y0) {
                        this.f7996v.a(j11, (Object) this.B);
                        this.f8003y0 = false;
                    }
                    this.f7995u0 = Math.max(this.f7995u0, j11);
                    this.f7990s.g();
                    if (this.f7990s.c()) {
                        a(this.f7990s);
                    }
                    b(this.f7990s);
                    if (h10) {
                        try {
                            this.K.a(this.f7972f0, 0, this.f7990s.f9905b, j11, 0);
                        } catch (MediaCodec.CryptoException e11) {
                            throw a((Throwable) e11, this.B, r2.a(e11.getErrorCode()));
                        }
                    } else {
                        this.K.a(this.f7972f0, 0, this.f7990s.f9906c.limit(), j11, 0);
                    }
                    Y();
                    this.f7989r0 = true;
                    this.f7983o0 = 0;
                    this.E0.f9187c++;
                    return true;
                } else {
                    this.f7990s.b();
                    if (this.f7983o0 == 2) {
                        this.f7983o0 = 1;
                    }
                    return true;
                }
            } catch (n5.a e12) {
                a((Exception) e12);
                e(0);
                F();
                return true;
            }
        }
    }

    private void F() {
        try {
            this.K.b();
        } finally {
            W();
        }
    }

    private boolean O() {
        return this.f7973g0 >= 0;
    }

    private void R() {
        int i10 = this.f7987q0;
        if (i10 == 1) {
            F();
        } else if (i10 == 2) {
            F();
            b0();
        } else if (i10 != 3) {
            this.f8001x0 = true;
            V();
        } else {
            T();
        }
    }

    private void S() {
        this.f7993t0 = true;
        MediaFormat e10 = this.K.e();
        if (this.S != 0 && e10.getInteger("width") == 32 && e10.getInteger("height") == 32) {
            this.f7968b0 = true;
            return;
        }
        if (this.Z) {
            e10.setInteger("channel-count", 1);
        }
        this.M = e10;
        this.N = true;
    }

    private void T() {
        U();
        P();
    }

    private void Y() {
        this.f7972f0 = -1;
        this.f7990s.f9906c = null;
    }

    private void Z() {
        this.f7973g0 = -1;
        this.f7974h0 = null;
    }

    private static boolean a(fd fdVar) {
        String str = fdVar.f7722a;
        int i10 = yp.f13662a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(yp.f13664c) && "AFTS".equals(yp.f13665d) && fdVar.f7728g));
    }

    private boolean b(long j10, long j11) {
        a1.b(!this.f8001x0);
        if (this.f7994u.m()) {
            f2 f2Var = this.f7994u;
            if (!a(j10, j11, (cd) null, f2Var.f9906c, this.f7973g0, 0, f2Var.l(), this.f7994u.j(), this.f7994u.d(), this.f7994u.e(), this.C)) {
                return false;
            }
            d(this.f7994u.k());
            this.f7994u.b();
        }
        if (this.f7999w0) {
            this.f8001x0 = true;
            return false;
        }
        if (this.f7978l0) {
            a1.b(this.f7994u.a(this.f7992t));
            this.f7978l0 = false;
        }
        if (this.f7979m0) {
            if (this.f7994u.m()) {
                return true;
            }
            A();
            this.f7979m0 = false;
            P();
            if (!this.f7977k0) {
                return false;
            }
        }
        z();
        if (this.f7994u.m()) {
            this.f7994u.g();
        }
        return this.f7994u.m() || this.f7999w0 || this.f7979m0;
    }

    private void b0() {
        try {
            this.F.setMediaDrmSession(a(this.E).f8710b);
            b(this.E);
            this.f7985p0 = 0;
            this.f7987q0 = 0;
        } catch (MediaCryptoException e10) {
            throw a((Throwable) e10, this.B, 6006);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c(long r20, long r22) {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.O()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r15.X
            if (r0 == 0) goto L_0x0028
            boolean r0 = r15.f7991s0
            if (r0 == 0) goto L_0x0028
            com.applovin.impl.cd r0 = r15.K     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.f8000x     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.a((android.media.MediaCodec.BufferInfo) r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x0030
        L_0x001c:
            r19.R()
            boolean r0 = r15.f8001x0
            if (r0 == 0) goto L_0x0027
            r19.U()
        L_0x0027:
            return r14
        L_0x0028:
            com.applovin.impl.cd r0 = r15.K
            android.media.MediaCodec$BufferInfo r1 = r15.f8000x
            int r0 = r0.a((android.media.MediaCodec.BufferInfo) r1)
        L_0x0030:
            if (r0 >= 0) goto L_0x004a
            r1 = -2
            if (r0 != r1) goto L_0x0039
            r19.S()
            return r16
        L_0x0039:
            boolean r0 = r15.f7969c0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r15.f7999w0
            if (r0 != 0) goto L_0x0046
            int r0 = r15.f7985p0
            r1 = 2
            if (r0 != r1) goto L_0x0049
        L_0x0046:
            r19.R()
        L_0x0049:
            return r14
        L_0x004a:
            boolean r1 = r15.f7968b0
            if (r1 == 0) goto L_0x0056
            r15.f7968b0 = r14
            com.applovin.impl.cd r1 = r15.K
            r1.a((int) r0, (boolean) r14)
            return r16
        L_0x0056:
            android.media.MediaCodec$BufferInfo r1 = r15.f8000x
            int r2 = r1.size
            if (r2 != 0) goto L_0x0066
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0066
            r19.R()
            return r14
        L_0x0066:
            r15.f7973g0 = r0
            com.applovin.impl.cd r1 = r15.K
            java.nio.ByteBuffer r0 = r1.b(r0)
            r15.f7974h0 = r0
            if (r0 == 0) goto L_0x0085
            android.media.MediaCodec$BufferInfo r1 = r15.f8000x
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f7974h0
            android.media.MediaCodec$BufferInfo r1 = r15.f8000x
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0085:
            boolean r0 = r15.Y
            if (r0 == 0) goto L_0x00a6
            android.media.MediaCodec$BufferInfo r0 = r15.f8000x
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00a6
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00a6
            long r1 = r15.f7995u0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            r0.presentationTimeUs = r1
        L_0x00a6:
            android.media.MediaCodec$BufferInfo r0 = r15.f8000x
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.c((long) r0)
            r15.f7975i0 = r0
            long r0 = r15.f7997v0
            android.media.MediaCodec$BufferInfo r2 = r15.f8000x
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r15.f7976j0 = r0
            r15.f((long) r2)
        L_0x00c2:
            boolean r0 = r15.X
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r15.f7991s0
            if (r0 == 0) goto L_0x00fd
            com.applovin.impl.cd r5 = r15.K     // Catch:{ IllegalStateException -> 0x00f0 }
            java.nio.ByteBuffer r6 = r15.f7974h0     // Catch:{ IllegalStateException -> 0x00f0 }
            int r7 = r15.f7973g0     // Catch:{ IllegalStateException -> 0x00f0 }
            android.media.MediaCodec$BufferInfo r0 = r15.f8000x     // Catch:{ IllegalStateException -> 0x00f0 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00f0 }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r12 = r15.f7975i0     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r13 = r15.f7976j0     // Catch:{ IllegalStateException -> 0x00f0 }
            com.applovin.impl.d9 r3 = r15.C     // Catch:{ IllegalStateException -> 0x00f0 }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = 0
            r14 = r17
            boolean r0 = r0.a(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00ee }
            goto L_0x011c
        L_0x00ee:
            goto L_0x00f2
        L_0x00f0:
            r18 = 0
        L_0x00f2:
            r19.R()
            boolean r0 = r15.f8001x0
            if (r0 == 0) goto L_0x00fc
            r19.U()
        L_0x00fc:
            return r18
        L_0x00fd:
            r18 = 0
            com.applovin.impl.cd r5 = r15.K
            java.nio.ByteBuffer r6 = r15.f7974h0
            int r7 = r15.f7973g0
            android.media.MediaCodec$BufferInfo r0 = r15.f8000x
            int r8 = r0.flags
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f7975i0
            boolean r13 = r15.f7976j0
            com.applovin.impl.d9 r14 = r15.C
            r9 = 1
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.a(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x011c:
            if (r0 == 0) goto L_0x0139
            android.media.MediaCodec$BufferInfo r0 = r15.f8000x
            long r0 = r0.presentationTimeUs
            r15.d((long) r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f8000x
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x012f
            r14 = 1
            goto L_0x0130
        L_0x012f:
            r14 = 0
        L_0x0130:
            r19.Z()
            if (r14 != 0) goto L_0x0136
            return r16
        L_0x0136:
            r19.R()
        L_0x0139:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gd.c(long, long):boolean");
    }

    private List d(boolean z10) {
        List a10 = a(this.f7982o, this.B, z10);
        if (a10.isEmpty() && z10) {
            a10 = a(this.f7982o, this.B, false);
            if (!a10.isEmpty()) {
                kc.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f7153m + ", but no secure decoder available. Trying to proceed with " + a10 + ".");
            }
        }
        return a10;
    }

    private boolean e(int i10) {
        e9 r10 = r();
        this.f7988r.b();
        int a10 = a(r10, this.f7988r, i10 | 4);
        if (a10 == -5) {
            a(r10);
            return true;
        } else if (a10 != -4 || !this.f7988r.e()) {
            return false;
        } else {
            this.f7999w0 = true;
            R();
            return false;
        }
    }

    private void z() {
        a1.b(!this.f7999w0);
        e9 r10 = r();
        this.f7992t.b();
        do {
            this.f7992t.b();
            int a10 = a(r10, this.f7992t, 0);
            if (a10 == -5) {
                a(r10);
                return;
            } else if (a10 != -4) {
                if (a10 != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f7992t.e()) {
                this.f7999w0 = true;
                return;
            } else {
                if (this.f8003y0) {
                    d9 d9Var = (d9) a1.a((Object) this.B);
                    this.C = d9Var;
                    a(d9Var, (MediaFormat) null);
                    this.f8003y0 = false;
                }
                this.f7992t.g();
            }
        } while (this.f7994u.a(this.f7992t));
        this.f7978l0 = true;
    }

    /* access modifiers changed from: protected */
    public final boolean G() {
        boolean H2 = H();
        if (H2) {
            P();
        }
        return H2;
    }

    /* access modifiers changed from: protected */
    public boolean H() {
        if (this.K == null) {
            return false;
        }
        if (this.f7987q0 == 3 || this.U || ((this.V && !this.f7993t0) || (this.W && this.f7991s0))) {
            U();
            return true;
        }
        F();
        return false;
    }

    /* access modifiers changed from: protected */
    public final cd I() {
        return this.K;
    }

    /* access modifiers changed from: protected */
    public final fd J() {
        return this.R;
    }

    /* access modifiers changed from: protected */
    public boolean K() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final MediaFormat L() {
        return this.M;
    }

    /* access modifiers changed from: protected */
    public final long M() {
        return this.G0;
    }

    /* access modifiers changed from: protected */
    public float N() {
        return this.I;
    }

    /* access modifiers changed from: protected */
    public final void P() {
        d9 d9Var;
        if (this.K == null && !this.f7977k0 && (d9Var = this.B) != null) {
            if (this.E != null || !c(d9Var)) {
                b(this.E);
                String str = this.B.f7153m;
                x6 x6Var = this.D;
                if (x6Var != null) {
                    if (this.F == null) {
                        j9 a10 = a(x6Var);
                        if (a10 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(a10.f8709a, a10.f8710b);
                                this.F = mediaCrypto;
                                this.G = !a10.f8711c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e10) {
                                throw a((Throwable) e10, this.B, 6006);
                            }
                        } else if (this.D.getError() == null) {
                            return;
                        }
                    }
                    if (j9.f8708d) {
                        int b10 = this.D.b();
                        if (b10 == 1) {
                            x6.a aVar = (x6.a) a1.a((Object) this.D.getError());
                            throw a((Throwable) aVar, this.B, aVar.f13290a);
                        } else if (b10 != 4) {
                            return;
                        }
                    }
                }
                try {
                    a(this.F, this.G);
                } catch (a e11) {
                    throw a((Throwable) e11, this.B, 4001);
                }
            } else {
                b(this.B);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void Q() {
    }

    /* access modifiers changed from: protected */
    public void U() {
        try {
            cd cdVar = this.K;
            if (cdVar != null) {
                cdVar.a();
                this.E0.f9186b++;
                g(this.R.f7722a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.F = null;
                b((x6) null);
                X();
            }
        } catch (Throwable th) {
            this.K = null;
            MediaCrypto mediaCrypto2 = this.F;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.F = null;
            b((x6) null);
            X();
        }
    }

    /* access modifiers changed from: protected */
    public void V() {
    }

    /* access modifiers changed from: protected */
    public void W() {
        Y();
        Z();
        this.f7971e0 = -9223372036854775807L;
        this.f7991s0 = false;
        this.f7989r0 = false;
        this.f7967a0 = false;
        this.f7968b0 = false;
        this.f7975i0 = false;
        this.f7976j0 = false;
        this.f7998w.clear();
        this.f7995u0 = -9223372036854775807L;
        this.f7997v0 = -9223372036854775807L;
        q2 q2Var = this.f7970d0;
        if (q2Var != null) {
            q2Var.a();
        }
        this.f7985p0 = 0;
        this.f7987q0 = 0;
        this.f7983o0 = this.f7981n0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void X() {
        W();
        this.D0 = null;
        this.f7970d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f7993t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f7969c0 = false;
        this.f7981n0 = false;
        this.f7983o0 = 0;
        this.G = false;
    }

    /* access modifiers changed from: protected */
    public abstract float a(float f10, d9 d9Var, d9[] d9VarArr);

    /* access modifiers changed from: protected */
    public abstract int a(hd hdVar, d9 d9Var);

    /* access modifiers changed from: protected */
    public abstract cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f10);

    /* access modifiers changed from: protected */
    public abstract o5 a(fd fdVar, d9 d9Var, d9 d9Var2);

    /* access modifiers changed from: protected */
    public abstract List a(hd hdVar, d9 d9Var, boolean z10);

    /* access modifiers changed from: protected */
    public abstract void a(d9 d9Var, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public void a(n5 n5Var) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(Exception exc);

    /* access modifiers changed from: protected */
    public abstract void a(String str, long j10, long j11);

    /* access modifiers changed from: protected */
    public abstract boolean a(long j10, long j11, cd cdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, d9 d9Var);

    /* access modifiers changed from: protected */
    public final void a0() {
        this.f8005z0 = true;
    }

    /* access modifiers changed from: protected */
    public abstract void b(n5 n5Var);

    /* access modifiers changed from: protected */
    public boolean b(fd fdVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(d9 d9Var) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void f(long j10) {
        d9 d9Var = (d9) this.f7996v.c(j10);
        if (d9Var == null && this.N) {
            d9Var = (d9) this.f7996v.c();
        }
        if (d9Var != null) {
            this.C = d9Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    /* access modifiers changed from: protected */
    public abstract void g(String str);

    public final int m() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void v() {
        this.B = null;
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.H0 = 0;
        H();
    }

    /* access modifiers changed from: protected */
    public void w() {
        try {
            A();
            U();
        } finally {
            c((x6) null);
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
    }

    /* access modifiers changed from: protected */
    public void y() {
    }

    private boolean a(fd fdVar, d9 d9Var, x6 x6Var, x6 x6Var2) {
        j9 a10;
        boolean z10;
        if (x6Var == x6Var2) {
            return false;
        }
        if (x6Var2 == null || x6Var == null || yp.f13662a < 23) {
            return true;
        }
        UUID uuid = r2.f11117e;
        if (uuid.equals(x6Var.e()) || uuid.equals(x6Var2.e()) || (a10 = a(x6Var2)) == null) {
            return true;
        }
        if (a10.f8711c) {
            z10 = false;
        } else {
            z10 = x6Var2.a(d9Var.f7153m);
        }
        return !fdVar.f7728g && z10;
    }

    private boolean e(long j10) {
        return this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.H;
    }

    private static boolean f(String str) {
        return yp.f13662a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public boolean d() {
        return this.B != null && (u() || O() || (this.f7971e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f7971e0));
    }

    private boolean e(d9 d9Var) {
        if (!(yp.f13662a < 23 || this.K == null || this.f7987q0 == 3 || b() == 0)) {
            float a10 = a(this.J, d9Var, t());
            float f10 = this.O;
            if (f10 == a10) {
                return true;
            }
            if (a10 == -1.0f) {
                C();
                return false;
            } else if (f10 == -1.0f && a10 <= this.f7986q) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", a10);
                this.K.a(bundle);
                this.O = a10;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void d(long j10) {
        while (true) {
            int i10 = this.H0;
            if (i10 != 0 && j10 >= this.A[0]) {
                long[] jArr = this.f8002y;
                this.F0 = jArr[0];
                this.G0 = this.f8004z[0];
                int i11 = i10 - 1;
                this.H0 = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
                long[] jArr2 = this.f8004z;
                System.arraycopy(jArr2, 1, jArr2, 0, this.H0);
                long[] jArr3 = this.A;
                System.arraycopy(jArr3, 1, jArr3, 0, this.H0);
                Q();
            } else {
                return;
            }
        }
    }

    public void a(boolean z10) {
        this.A0 = z10;
    }

    private j9 a(x6 x6Var) {
        x4 f10 = x6Var.f();
        if (f10 == null || (f10 instanceof j9)) {
            return (j9) f10;
        }
        throw a((Throwable) new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + f10), this.B, (int) AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    private void a(fd fdVar, MediaCrypto mediaCrypto) {
        float f10;
        cd cdVar;
        String str = fdVar.f7722a;
        int i10 = yp.f13662a;
        float f11 = -1.0f;
        if (i10 < 23) {
            f10 = -1.0f;
        } else {
            f10 = a(this.J, this.B, t());
        }
        if (f10 > this.f7986q) {
            f11 = f10;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        lo.a("createCodec:" + str);
        cd.a a10 = a(fdVar, this.B, mediaCrypto, f11);
        if (!this.A0 || i10 < 23) {
            cdVar = this.f7980n.a(a10);
        } else {
            cdVar = new f1.b(e(), this.B0, this.C0).a(a10);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.K = cdVar;
        this.R = fdVar;
        this.O = f11;
        this.L = this.B;
        this.S = a(str);
        this.T = a(str, this.L);
        this.U = e(str);
        this.V = f(str);
        this.W = c(str);
        this.X = d(str);
        this.Y = b(str);
        this.Z = b(str, this.L);
        boolean z10 = false;
        this.f7969c0 = a(fdVar) || K();
        if (cdVar.c()) {
            this.f7981n0 = true;
            this.f7983o0 = 1;
            if (this.S != 0) {
                z10 = true;
            }
            this.f7967a0 = z10;
        }
        if ("c2.android.mp3.decoder".equals(fdVar.f7722a)) {
            this.f7970d0 = new q2();
        }
        if (b() == 2) {
            this.f7971e0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.E0.f9185a++;
        a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    protected static boolean d(d9 d9Var) {
        int i10 = d9Var.F;
        return i10 == 0 || i10 == 2;
    }

    private static boolean d(String str) {
        return yp.f13662a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean e(String str) {
        int i10 = yp.f13662a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && yp.f13665d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public void b(boolean z10) {
        this.B0 = z10;
    }

    private void b(d9 d9Var) {
        A();
        String str = d9Var.f7153m;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f7994u.i(32);
        } else {
            this.f7994u.i(1);
        }
        this.f7977k0 = true;
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private void b(x6 x6Var) {
        n70.a(this.D, x6Var);
        this.D = x6Var;
    }

    public void c(boolean z10) {
        this.C0 = z10;
    }

    private static boolean b(String str) {
        if (yp.f13662a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(yp.f13664c)) {
            String str2 = yp.f13663b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private boolean c(long j10) {
        int size = this.f7998w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Long) this.f7998w.get(i10)).longValue() == j10) {
                this.f7998w.remove(i10);
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        return this.f8001x0;
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void c(x6 x6Var) {
        n70.a(this.E, x6Var);
        this.E = x6Var;
    }

    private static boolean c(String str) {
        int i10 = yp.f13662a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = yp.f13663b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private static boolean b(String str, d9 d9Var) {
        if (yp.f13662a > 18 || d9Var.f7166z != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    private void a(MediaCrypto mediaCrypto, boolean z10) {
        if (this.P == null) {
            try {
                List d10 = d(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.P = arrayDeque;
                if (this.f7984p) {
                    arrayDeque.addAll(d10);
                } else if (!d10.isEmpty()) {
                    this.P.add((fd) d10.get(0));
                }
                this.Q = null;
            } catch (id.c e10) {
                throw new a(this.B, (Throwable) e10, z10, -49998);
            }
        }
        if (!this.P.isEmpty()) {
            while (this.K == null) {
                fd fdVar = (fd) this.P.peekFirst();
                if (b(fdVar)) {
                    try {
                        a(fdVar, mediaCrypto);
                    } catch (Exception e11) {
                        kc.c("MediaCodecRenderer", "Failed to initialize decoder: " + fdVar, e11);
                        this.P.removeFirst();
                        a aVar = new a(this.B, (Throwable) e11, z10, fdVar);
                        a((Exception) aVar);
                        if (this.Q == null) {
                            this.Q = aVar;
                        } else {
                            this.Q = this.Q.a(aVar);
                        }
                        if (this.P.isEmpty()) {
                            throw this.Q;
                        }
                    }
                } else {
                    return;
                }
            }
            this.P = null;
            return;
        }
        throw new a(this.B, (Throwable) null, z10, -49999);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10, boolean z11) {
        this.E0 = new l5();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        if (D() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b0, code lost:
        if (D() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cf, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00eb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.o5 a(com.applovin.impl.e9 r12) {
        /*
            r11 = this;
            r0 = 1
            r11.f8003y0 = r0
            com.applovin.impl.d9 r1 = r12.f7378b
            java.lang.Object r1 = com.applovin.impl.a1.a((java.lang.Object) r1)
            r5 = r1
            com.applovin.impl.d9 r5 = (com.applovin.impl.d9) r5
            java.lang.String r1 = r5.f7153m
            if (r1 == 0) goto L_0x00ec
            com.applovin.impl.x6 r12 = r12.f7377a
            r11.c((com.applovin.impl.x6) r12)
            r11.B = r5
            boolean r12 = r11.f7977k0
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.f7979m0 = r0
            return r1
        L_0x001f:
            com.applovin.impl.cd r12 = r11.K
            if (r12 != 0) goto L_0x0029
            r11.P = r1
            r11.P()
            return r1
        L_0x0029:
            com.applovin.impl.fd r1 = r11.R
            com.applovin.impl.d9 r4 = r11.L
            com.applovin.impl.x6 r2 = r11.D
            com.applovin.impl.x6 r3 = r11.E
            boolean r2 = r11.a((com.applovin.impl.fd) r1, (com.applovin.impl.d9) r5, (com.applovin.impl.x6) r2, (com.applovin.impl.x6) r3)
            if (r2 == 0) goto L_0x0046
            r11.C()
            com.applovin.impl.o5 r12 = new com.applovin.impl.o5
            java.lang.String r3 = r1.f7722a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            com.applovin.impl.x6 r2 = r11.E
            com.applovin.impl.x6 r3 = r11.D
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = com.applovin.impl.yp.f13662a
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            goto L_0x005c
        L_0x005b:
            r3 = 1
        L_0x005c:
            com.applovin.impl.a1.b((boolean) r3)
            com.applovin.impl.o5 r3 = r11.a((com.applovin.impl.fd) r1, (com.applovin.impl.d9) r4, (com.applovin.impl.d9) r5)
            int r7 = r3.f10066d
            r8 = 3
            r9 = 2
            if (r7 == 0) goto L_0x00d1
            if (r7 == r0) goto L_0x00b3
            if (r7 == r9) goto L_0x0087
            if (r7 != r8) goto L_0x0081
            boolean r0 = r11.e((com.applovin.impl.d9) r5)
            if (r0 != 0) goto L_0x0076
            goto L_0x00b9
        L_0x0076:
            r11.L = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.D()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x0081:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0087:
            boolean r7 = r11.e((com.applovin.impl.d9) r5)
            if (r7 != 0) goto L_0x008e
            goto L_0x00b9
        L_0x008e:
            r11.f7981n0 = r0
            r11.f7983o0 = r0
            int r7 = r11.S
            if (r7 == r9) goto L_0x00a6
            if (r7 != r0) goto L_0x00a5
            int r7 = r5.f7158r
            int r10 = r4.f7158r
            if (r7 != r10) goto L_0x00a5
            int r7 = r5.f7159s
            int r10 = r4.f7159s
            if (r7 != r10) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            r11.f7967a0 = r0
            r11.L = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.D()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00b3:
            boolean r0 = r11.e((com.applovin.impl.d9) r5)
            if (r0 != 0) goto L_0x00be
        L_0x00b9:
            r0 = 16
            r7 = 16
            goto L_0x00d5
        L_0x00be:
            r11.L = r5
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r11.D()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00c9:
            boolean r0 = r11.B()
            if (r0 != 0) goto L_0x00d4
        L_0x00cf:
            r7 = 2
            goto L_0x00d5
        L_0x00d1:
            r11.C()
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            int r0 = r3.f10066d
            if (r0 == 0) goto L_0x00eb
            com.applovin.impl.cd r0 = r11.K
            if (r0 != r12) goto L_0x00e1
            int r12 = r11.f7987q0
            if (r12 != r8) goto L_0x00eb
        L_0x00e1:
            com.applovin.impl.o5 r12 = new com.applovin.impl.o5
            java.lang.String r3 = r1.f7722a
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
            com.applovin.impl.y7 r12 = r11.a((java.lang.Throwable) r12, (com.applovin.impl.d9) r5, (int) r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gd.a(com.applovin.impl.e9):com.applovin.impl.o5");
    }

    /* access modifiers changed from: protected */
    public void a(long j10, boolean z10) {
        this.f7999w0 = false;
        this.f8001x0 = false;
        this.f8005z0 = false;
        if (this.f7977k0) {
            this.f7994u.b();
            this.f7992t.b();
            this.f7978l0 = false;
        } else {
            G();
        }
        if (this.f7996v.e() > 0) {
            this.f8003y0 = true;
        }
        this.f7996v.a();
        int i10 = this.H0;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.G0 = this.f8004z[i11];
            this.F0 = this.f8002y[i11];
            this.H0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void a(d9[] d9VarArr, long j10, long j11) {
        boolean z10 = true;
        if (this.G0 == -9223372036854775807L) {
            if (this.F0 != -9223372036854775807L) {
                z10 = false;
            }
            a1.b(z10);
            this.F0 = j10;
            this.G0 = j11;
            return;
        }
        int i10 = this.H0;
        if (i10 == this.f8004z.length) {
            kc.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f8004z[this.H0 - 1]);
        } else {
            this.H0 = i10 + 1;
        }
        long[] jArr = this.f8002y;
        int i11 = this.H0 - 1;
        jArr[i11] = j10;
        this.f8004z[i11] = j11;
        this.A[i11] = this.f7995u0;
    }

    public void a(long j10, long j11) {
        boolean z10 = false;
        if (this.f8005z0) {
            this.f8005z0 = false;
            R();
        }
        y7 y7Var = this.D0;
        if (y7Var == null) {
            try {
                if (this.f8001x0) {
                    V();
                } else if (this.B != null || e(2)) {
                    P();
                    if (this.f7977k0) {
                        lo.a("bypassRender");
                        while (b(j10, j11)) {
                        }
                        lo.a();
                    } else if (this.K != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        lo.a("drainAndFeed");
                        while (c(j10, j11) && e(elapsedRealtime)) {
                        }
                        while (E() && e(elapsedRealtime)) {
                        }
                        lo.a();
                    } else {
                        this.E0.f9188d += b(j10);
                        e(1);
                    }
                    this.E0.a();
                }
            } catch (IllegalStateException e10) {
                if (a(e10)) {
                    a((Exception) e10);
                    if (yp.f13662a >= 21 && c(e10)) {
                        z10 = true;
                    }
                    if (z10) {
                        U();
                    }
                    throw a((Throwable) a((Throwable) e10, J()), this.B, z10, 4003);
                }
                throw e10;
            }
        } else {
            this.D0 = null;
            throw y7Var;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(y7 y7Var) {
        this.D0 = y7Var;
    }

    public void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        e(this.L);
    }

    public final int a(d9 d9Var) {
        try {
            return a(this.f7982o, d9Var);
        } catch (id.c e10) {
            throw a((Throwable) e10, d9Var, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public ed a(Throwable th, fd fdVar) {
        return new ed(th, fdVar);
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (yp.f13662a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    private int a(String str) {
        int i10 = yp.f13662a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = yp.f13665d;
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
        String str3 = yp.f13663b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean a(String str, d9 d9Var) {
        return yp.f13662a < 21 && d9Var.f7155o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }
}
