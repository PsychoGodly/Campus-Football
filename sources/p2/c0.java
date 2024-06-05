package p2;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.u10;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import k4.n0;
import k4.r;
import n2.f3;
import n2.r1;
import n2.s;
import o2.u1;
import p2.d0;
import p2.g;
import p2.v;
import p2.x;

/* compiled from: DefaultAudioSink */
public final class c0 implements v {

    /* renamed from: e0  reason: collision with root package name */
    public static boolean f21154e0 = false;

    /* renamed from: f0  reason: collision with root package name */
    private static final Object f21155f0 = new Object();

    /* renamed from: g0  reason: collision with root package name */
    private static ExecutorService f21156g0;

    /* renamed from: h0  reason: collision with root package name */
    private static int f21157h0;
    private ByteBuffer A;
    private int B;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;
    private boolean H;
    private boolean I;
    private long J;
    private float K;
    private g[] L;
    private ByteBuffer[] M;
    private ByteBuffer N;
    private int O;
    private ByteBuffer P;
    private byte[] Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    /* access modifiers changed from: private */
    public boolean V;
    private boolean W;
    private int X;
    private y Y;
    private d Z;

    /* renamed from: a  reason: collision with root package name */
    private final f f21158a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f21159a0;

    /* renamed from: b  reason: collision with root package name */
    private final h f21160b;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public long f21161b0;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21162c;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f21163c0;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f21164d;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f21165d0;

    /* renamed from: e  reason: collision with root package name */
    private final n0 f21166e;

    /* renamed from: f  reason: collision with root package name */
    private final g[] f21167f;

    /* renamed from: g  reason: collision with root package name */
    private final g[] f21168g;

    /* renamed from: h  reason: collision with root package name */
    private final k4.g f21169h;

    /* renamed from: i  reason: collision with root package name */
    private final x f21170i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<j> f21171j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f21172k;

    /* renamed from: l  reason: collision with root package name */
    private final int f21173l;

    /* renamed from: m  reason: collision with root package name */
    private m f21174m;

    /* renamed from: n  reason: collision with root package name */
    private final k<v.b> f21175n;

    /* renamed from: o  reason: collision with root package name */
    private final k<v.e> f21176o;

    /* renamed from: p  reason: collision with root package name */
    private final e f21177p;

    /* renamed from: q  reason: collision with root package name */
    private final s.a f21178q;

    /* renamed from: r  reason: collision with root package name */
    private u1 f21179r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public v.c f21180s;

    /* renamed from: t  reason: collision with root package name */
    private g f21181t;

    /* renamed from: u  reason: collision with root package name */
    private g f21182u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public AudioTrack f21183v;

    /* renamed from: w  reason: collision with root package name */
    private e f21184w;

    /* renamed from: x  reason: collision with root package name */
    private j f21185x;

    /* renamed from: y  reason: collision with root package name */
    private j f21186y;

    /* renamed from: z  reason: collision with root package name */
    private f3 f21187z;

    /* compiled from: DefaultAudioSink */
    private static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f21188a);
        }
    }

    /* compiled from: DefaultAudioSink */
    private static final class c {
        public static void a(AudioTrack audioTrack, u1 u1Var) {
            LogSessionId a10 = u1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(a10);
            }
        }
    }

    /* compiled from: DefaultAudioSink */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioDeviceInfo f21188a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f21188a = audioDeviceInfo;
        }
    }

    /* compiled from: DefaultAudioSink */
    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f21189a = new d0.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* compiled from: DefaultAudioSink */
    public static final class f {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public f f21190a = f.f21256c;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public h f21191b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f21192c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f21193d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f21194e = 0;

        /* renamed from: f  reason: collision with root package name */
        e f21195f = e.f21189a;

        /* renamed from: g  reason: collision with root package name */
        s.a f21196g;

        public c0 f() {
            if (this.f21191b == null) {
                this.f21191b = new h(new g[0]);
            }
            return new c0(this);
        }

        public f g(f fVar) {
            k4.a.e(fVar);
            this.f21190a = fVar;
            return this;
        }

        public f h(boolean z10) {
            this.f21193d = z10;
            return this;
        }

        public f i(boolean z10) {
            this.f21192c = z10;
            return this;
        }

        public f j(int i10) {
            this.f21194e = i10;
            return this;
        }
    }

    /* compiled from: DefaultAudioSink */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final r1 f21197a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21198b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21199c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21200d;

        /* renamed from: e  reason: collision with root package name */
        public final int f21201e;

        /* renamed from: f  reason: collision with root package name */
        public final int f21202f;

        /* renamed from: g  reason: collision with root package name */
        public final int f21203g;

        /* renamed from: h  reason: collision with root package name */
        public final int f21204h;

        /* renamed from: i  reason: collision with root package name */
        public final g[] f21205i;

        public g(r1 r1Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, g[] gVarArr) {
            this.f21197a = r1Var;
            this.f21198b = i10;
            this.f21199c = i11;
            this.f21200d = i12;
            this.f21201e = i13;
            this.f21202f = i14;
            this.f21203g = i15;
            this.f21204h = i16;
            this.f21205i = gVarArr;
        }

        private AudioTrack d(boolean z10, e eVar, int i10) {
            int i11 = n0.f19738a;
            if (i11 >= 29) {
                return f(z10, eVar, i10);
            }
            if (i11 >= 21) {
                return e(z10, eVar, i10);
            }
            return g(eVar, i10);
        }

        private AudioTrack e(boolean z10, e eVar, int i10) {
            return new AudioTrack(i(eVar, z10), c0.M(this.f21201e, this.f21202f, this.f21203g), this.f21204h, 1, i10);
        }

        private AudioTrack f(boolean z10, e eVar, int i10) {
            AudioFormat C = c0.M(this.f21201e, this.f21202f, this.f21203g);
            AudioAttributes i11 = i(eVar, z10);
            boolean z11 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(i11).setAudioFormat(C).setTransferMode(1).setBufferSizeInBytes(this.f21204h).setSessionId(i10);
            if (this.f21199c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        }

        private AudioTrack g(e eVar, int i10) {
            int f02 = n0.f0(eVar.f21243c);
            if (i10 == 0) {
                return new AudioTrack(f02, this.f21201e, this.f21202f, this.f21203g, this.f21204h, 1);
            }
            return new AudioTrack(f02, this.f21201e, this.f21202f, this.f21203g, this.f21204h, 1, i10);
        }

        private static AudioAttributes i(e eVar, boolean z10) {
            if (z10) {
                return j();
            }
            return eVar.b().f21247a;
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, e eVar, int i10) throws v.b {
            try {
                AudioTrack d10 = d(z10, eVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new v.b(state, this.f21201e, this.f21202f, this.f21204h, this.f21197a, l(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new v.b(0, this.f21201e, this.f21202f, this.f21204h, this.f21197a, l(), e10);
            }
        }

        public boolean b(g gVar) {
            return gVar.f21199c == this.f21199c && gVar.f21203g == this.f21203g && gVar.f21201e == this.f21201e && gVar.f21202f == this.f21202f && gVar.f21200d == this.f21200d;
        }

        public g c(int i10) {
            return new g(this.f21197a, this.f21198b, this.f21199c, this.f21200d, this.f21201e, this.f21202f, this.f21203g, i10, this.f21205i);
        }

        public long h(long j10) {
            return (j10 * 1000000) / ((long) this.f21201e);
        }

        public long k(long j10) {
            return (j10 * 1000000) / ((long) this.f21197a.A);
        }

        public boolean l() {
            return this.f21199c == 1;
        }
    }

    /* compiled from: DefaultAudioSink */
    public static class h implements h {

        /* renamed from: a  reason: collision with root package name */
        private final g[] f21206a;

        /* renamed from: b  reason: collision with root package name */
        private final k0 f21207b;

        /* renamed from: c  reason: collision with root package name */
        private final m0 f21208c;

        public h(g... gVarArr) {
            this(gVarArr, new k0(), new m0());
        }

        public long a(long j10) {
            return this.f21208c.f(j10);
        }

        public f3 b(f3 f3Var) {
            this.f21208c.h(f3Var.f20384a);
            this.f21208c.g(f3Var.f20385b);
            return f3Var;
        }

        public long c() {
            return this.f21207b.o();
        }

        public boolean d(boolean z10) {
            this.f21207b.u(z10);
            return z10;
        }

        public g[] e() {
            return this.f21206a;
        }

        public h(g[] gVarArr, k0 k0Var, m0 m0Var) {
            g[] gVarArr2 = new g[(gVarArr.length + 2)];
            this.f21206a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f21207b = k0Var;
            this.f21208c = m0Var;
            gVarArr2[gVarArr.length] = k0Var;
            gVarArr2[gVarArr.length + 1] = m0Var;
        }
    }

    /* compiled from: DefaultAudioSink */
    public static final class i extends RuntimeException {
        private i(String str) {
            super(str);
        }
    }

    /* compiled from: DefaultAudioSink */
    private static final class j {

        /* renamed from: a  reason: collision with root package name */
        public final f3 f21209a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21210b;

        /* renamed from: c  reason: collision with root package name */
        public final long f21211c;

        /* renamed from: d  reason: collision with root package name */
        public final long f21212d;

        private j(f3 f3Var, boolean z10, long j10, long j11) {
            this.f21209a = f3Var;
            this.f21210b = z10;
            this.f21211c = j10;
            this.f21212d = j11;
        }
    }

    /* compiled from: DefaultAudioSink */
    private static final class k<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private final long f21213a;

        /* renamed from: b  reason: collision with root package name */
        private T f21214b;

        /* renamed from: c  reason: collision with root package name */
        private long f21215c;

        public k(long j10) {
            this.f21213a = j10;
        }

        public void a() {
            this.f21214b = null;
        }

        public void b(T t10) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f21214b == null) {
                this.f21214b = t10;
                this.f21215c = this.f21213a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f21215c) {
                T t11 = this.f21214b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f21214b;
                a();
                throw t12;
            }
        }
    }

    /* compiled from: DefaultAudioSink */
    private final class l implements x.a {
        private l() {
        }

        public void a(int i10, long j10) {
            if (c0.this.f21180s != null) {
                c0.this.f21180s.e(i10, j10, SystemClock.elapsedRealtime() - c0.this.f21161b0);
            }
        }

        public void b(long j10) {
            r.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        public void c(long j10) {
            if (c0.this.f21180s != null) {
                c0.this.f21180s.c(j10);
            }
        }

        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c0.this.T() + ", " + c0.this.U();
            if (!c0.f21154e0) {
                r.i("DefaultAudioSink", str);
                return;
            }
            throw new i(str);
        }

        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c0.this.T() + ", " + c0.this.U();
            if (!c0.f21154e0) {
                r.i("DefaultAudioSink", str);
                return;
            }
            throw new i(str);
        }
    }

    /* compiled from: DefaultAudioSink */
    private final class m {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f21217a = new Handler(Looper.myLooper());

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f21218b;

        /* compiled from: DefaultAudioSink */
        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c0 f21220a;

            a(c0 c0Var) {
                this.f21220a = c0Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(c0.this.f21183v) && c0.this.f21180s != null && c0.this.V) {
                    c0.this.f21180s.g();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(c0.this.f21183v) && c0.this.f21180s != null && c0.this.V) {
                    c0.this.f21180s.g();
                }
            }
        }

        public m() {
            this.f21218b = new a(c0.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f21217a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new u10(handler), this.f21218b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f21218b);
            this.f21217a.removeCallbacksAndMessages((Object) null);
        }
    }

    private void F(long j10) {
        f3 f3Var;
        if (m0()) {
            f3Var = this.f21160b.b(N());
        } else {
            f3Var = f3.f20380d;
        }
        f3 f3Var2 = f3Var;
        boolean d10 = m0() ? this.f21160b.d(S()) : false;
        this.f21171j.add(new j(f3Var2, d10, Math.max(0, j10), this.f21182u.h(U())));
        l0();
        v.c cVar = this.f21180s;
        if (cVar != null) {
            cVar.a(d10);
        }
    }

    private long G(long j10) {
        while (!this.f21171j.isEmpty() && j10 >= this.f21171j.getFirst().f21212d) {
            this.f21186y = this.f21171j.remove();
        }
        j jVar = this.f21186y;
        long j11 = j10 - jVar.f21212d;
        if (jVar.f21209a.equals(f3.f20380d)) {
            return this.f21186y.f21211c + j11;
        }
        if (this.f21171j.isEmpty()) {
            return this.f21186y.f21211c + this.f21160b.a(j11);
        }
        j first = this.f21171j.getFirst();
        return first.f21211c - n0.Z(first.f21212d - j10, this.f21186y.f21209a.f20384a);
    }

    private long H(long j10) {
        return j10 + this.f21182u.h(this.f21160b.c());
    }

    private AudioTrack I(g gVar) throws v.b {
        try {
            AudioTrack a10 = gVar.a(this.f21159a0, this.f21184w, this.X);
            s.a aVar = this.f21178q;
            if (aVar != null) {
                aVar.G(Y(a10));
            }
            return a10;
        } catch (v.b e10) {
            v.c cVar = this.f21180s;
            if (cVar != null) {
                cVar.b(e10);
            }
            throw e10;
        }
    }

    private AudioTrack J() throws v.b {
        try {
            return I((g) k4.a.e(this.f21182u));
        } catch (v.b e10) {
            g gVar = this.f21182u;
            if (gVar.f21204h > 1000000) {
                g c10 = gVar.c(1000000);
                try {
                    AudioTrack I2 = I(c10);
                    this.f21182u = c10;
                    return I2;
                } catch (v.b e11) {
                    e10.addSuppressed(e11);
                    a0();
                    throw e10;
                }
            }
            a0();
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean K() throws p2.v.e {
        /*
            r9 = this;
            int r0 = r9.S
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.S = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.S
            p2.g[] r5 = r9.L
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.e()
        L_0x001f:
            r9.c0(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.S
            int r0 = r0 + r2
            r9.S = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L_0x003b
            r9.p0(r0, r7)
            java.nio.ByteBuffer r0 = r9.P
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.S = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c0.K():boolean");
    }

    private void L() {
        int i10 = 0;
        while (true) {
            g[] gVarArr = this.L;
            if (i10 < gVarArr.length) {
                g gVar = gVarArr[i10];
                gVar.flush();
                this.M[i10] = gVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static AudioFormat M(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private f3 N() {
        return Q().f21209a;
    }

    private static int O(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        k4.a.f(minBufferSize != -2);
        return minBufferSize;
    }

    private static int P(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return b.e(byteBuffer);
            case 7:
            case 8:
                return e0.e(byteBuffer);
            case 9:
                int m10 = h0.m(n0.I(byteBuffer, byteBuffer.position()));
                if (m10 != -1) {
                    return m10;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 14:
                int b10 = b.b(byteBuffer);
                if (b10 == -1) {
                    return 0;
                }
                return b.i(byteBuffer, b10) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return c.c(byteBuffer);
            case 20:
                return i0.g(byteBuffer);
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
        }
    }

    private j Q() {
        j jVar = this.f21185x;
        if (jVar != null) {
            return jVar;
        }
        if (!this.f21171j.isEmpty()) {
            return this.f21171j.getLast();
        }
        return this.f21186y;
    }

    private int R(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = n0.f19738a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        return (i10 != 30 || !n0.f19741d.startsWith("Pixel")) ? 1 : 2;
    }

    /* access modifiers changed from: private */
    public long T() {
        g gVar = this.f21182u;
        if (gVar.f21199c == 0) {
            return this.C / ((long) gVar.f21198b);
        }
        return this.D;
    }

    /* access modifiers changed from: private */
    public long U() {
        g gVar = this.f21182u;
        if (gVar.f21199c == 0) {
            return this.E / ((long) gVar.f21200d);
        }
        return this.F;
    }

    private boolean V() throws v.b {
        u1 u1Var;
        if (!this.f21169h.d()) {
            return false;
        }
        AudioTrack J2 = J();
        this.f21183v = J2;
        if (Y(J2)) {
            d0(this.f21183v);
            if (this.f21173l != 3) {
                AudioTrack audioTrack = this.f21183v;
                r1 r1Var = this.f21182u.f21197a;
                audioTrack.setOffloadDelayPadding(r1Var.C, r1Var.D);
            }
        }
        int i10 = n0.f19738a;
        if (i10 >= 31 && (u1Var = this.f21179r) != null) {
            c.a(this.f21183v, u1Var);
        }
        this.X = this.f21183v.getAudioSessionId();
        x xVar = this.f21170i;
        AudioTrack audioTrack2 = this.f21183v;
        g gVar = this.f21182u;
        xVar.s(audioTrack2, gVar.f21199c == 2, gVar.f21203g, gVar.f21200d, gVar.f21204h);
        i0();
        int i11 = this.Y.f21388a;
        if (i11 != 0) {
            this.f21183v.attachAuxEffect(i11);
            this.f21183v.setAuxEffectSendLevel(this.Y.f21389b);
        }
        d dVar = this.Z;
        if (dVar != null && i10 >= 23) {
            b.a(this.f21183v, dVar);
        }
        this.I = true;
        return true;
    }

    private static boolean W(int i10) {
        return (n0.f19738a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean X() {
        return this.f21183v != null;
    }

    private static boolean Y(AudioTrack audioTrack) {
        return n0.f19738a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Z(AudioTrack audioTrack, k4.g gVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            gVar.e();
            synchronized (f21155f0) {
                int i10 = f21157h0 - 1;
                f21157h0 = i10;
                if (i10 == 0) {
                    f21156g0.shutdown();
                    f21156g0 = null;
                }
            }
        } catch (Throwable th) {
            gVar.e();
            synchronized (f21155f0) {
                int i11 = f21157h0 - 1;
                f21157h0 = i11;
                if (i11 == 0) {
                    f21156g0.shutdown();
                    f21156g0 = null;
                }
                throw th;
            }
        }
    }

    private void a0() {
        if (this.f21182u.l()) {
            this.f21163c0 = true;
        }
    }

    private void b0() {
        if (!this.U) {
            this.U = true;
            this.f21170i.g(U());
            this.f21183v.stop();
            this.B = 0;
        }
    }

    private void c0(long j10) throws v.e {
        ByteBuffer byteBuffer;
        int length = this.L.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.M[i10 - 1];
            } else {
                byteBuffer = this.N;
                if (byteBuffer == null) {
                    byteBuffer = g.f21263a;
                }
            }
            if (i10 == length) {
                p0(byteBuffer, j10);
            } else {
                g gVar = this.L[i10];
                if (i10 > this.S) {
                    gVar.c(byteBuffer);
                }
                ByteBuffer a10 = gVar.a();
                this.M[i10] = a10;
                if (a10.hasRemaining()) {
                    i10++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i10--;
            } else {
                return;
            }
        }
    }

    private void d0(AudioTrack audioTrack) {
        if (this.f21174m == null) {
            this.f21174m = new m();
        }
        this.f21174m.a(audioTrack);
    }

    private static void e0(AudioTrack audioTrack, k4.g gVar) {
        gVar.c();
        synchronized (f21155f0) {
            if (f21156g0 == null) {
                f21156g0 = n0.D0("ExoPlayer:AudioTrackReleaseThread");
            }
            f21157h0++;
            f21156g0.execute(new b0(audioTrack, gVar));
        }
    }

    private void f0() {
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.f21165d0 = false;
        this.G = 0;
        this.f21186y = new j(N(), S(), 0, 0);
        this.J = 0;
        this.f21185x = null;
        this.f21171j.clear();
        this.N = null;
        this.O = 0;
        this.P = null;
        this.U = false;
        this.T = false;
        this.S = -1;
        this.A = null;
        this.B = 0;
        this.f21166e.m();
        L();
    }

    private void g0(f3 f3Var, boolean z10) {
        j Q2 = Q();
        if (!f3Var.equals(Q2.f21209a) || z10 != Q2.f21210b) {
            j jVar = new j(f3Var, z10, -9223372036854775807L, -9223372036854775807L);
            if (X()) {
                this.f21185x = jVar;
            } else {
                this.f21186y = jVar;
            }
        }
    }

    private void h0(f3 f3Var) {
        if (X()) {
            try {
                this.f21183v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(f3Var.f20384a).setPitch(f3Var.f20385b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                r.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            f3Var = new f3(this.f21183v.getPlaybackParams().getSpeed(), this.f21183v.getPlaybackParams().getPitch());
            this.f21170i.t(f3Var.f20384a);
        }
        this.f21187z = f3Var;
    }

    private void i0() {
        if (X()) {
            if (n0.f19738a >= 21) {
                j0(this.f21183v, this.K);
            } else {
                k0(this.f21183v, this.K);
            }
        }
    }

    private static void j0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void k0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void l0() {
        g[] gVarArr = this.f21182u.f21205i;
        ArrayList arrayList = new ArrayList();
        for (g gVar : gVarArr) {
            if (gVar.isActive()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.L = (g[]) arrayList.toArray(new g[size]);
        this.M = new ByteBuffer[size];
        L();
    }

    private boolean m0() {
        return !this.f21159a0 && "audio/raw".equals(this.f21182u.f21197a.f20654m) && !n0(this.f21182u.f21197a.B);
    }

    private boolean n0(int i10) {
        return this.f21162c && n0.t0(i10);
    }

    private boolean o0(r1 r1Var, e eVar) {
        int f10;
        int G2;
        int R2;
        if (n0.f19738a < 29 || this.f21173l == 0 || (f10 = k4.v.f((String) k4.a.e(r1Var.f20654m), r1Var.f20651j)) == 0 || (G2 = n0.G(r1Var.f20667z)) == 0 || (R2 = R(M(r1Var.A, G2, f10), eVar.b().f21247a)) == 0) {
            return false;
        }
        if (R2 == 1) {
            boolean z10 = (r1Var.C == 0 && r1Var.D == 0) ? false : true;
            boolean z11 = this.f21173l == 1;
            if (!z10 || !z11) {
                return true;
            }
            return false;
        } else if (R2 == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private void p0(ByteBuffer byteBuffer, long j10) throws v.e {
        int i10;
        v.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.P;
            boolean z10 = true;
            if (byteBuffer2 != null) {
                k4.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.P = byteBuffer;
                if (n0.f19738a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.Q;
                    if (bArr == null || bArr.length < remaining) {
                        this.Q = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.Q, 0, remaining);
                    byteBuffer.position(position);
                    this.R = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (n0.f19738a < 21) {
                int c10 = this.f21170i.c(this.E);
                if (c10 > 0) {
                    i10 = this.f21183v.write(this.Q, this.R, Math.min(remaining2, c10));
                    if (i10 > 0) {
                        this.R += i10;
                        byteBuffer.position(byteBuffer.position() + i10);
                    }
                } else {
                    i10 = 0;
                }
            } else if (this.f21159a0) {
                k4.a.f(j10 != -9223372036854775807L);
                i10 = r0(this.f21183v, byteBuffer, remaining2, j10);
            } else {
                i10 = q0(this.f21183v, byteBuffer, remaining2);
            }
            this.f21161b0 = SystemClock.elapsedRealtime();
            if (i10 < 0) {
                if (!W(i10) || this.F <= 0) {
                    z10 = false;
                }
                v.e eVar = new v.e(i10, this.f21182u.f21197a, z10);
                v.c cVar2 = this.f21180s;
                if (cVar2 != null) {
                    cVar2.b(eVar);
                }
                if (!eVar.f21349b) {
                    this.f21176o.b(eVar);
                    return;
                }
                throw eVar;
            }
            this.f21176o.a();
            if (Y(this.f21183v)) {
                if (this.F > 0) {
                    this.f21165d0 = false;
                }
                if (this.V && (cVar = this.f21180s) != null && i10 < remaining2 && !this.f21165d0) {
                    cVar.d();
                }
            }
            int i11 = this.f21182u.f21199c;
            if (i11 == 0) {
                this.E += (long) i10;
            }
            if (i10 == remaining2) {
                if (i11 != 0) {
                    if (byteBuffer != this.N) {
                        z10 = false;
                    }
                    k4.a.f(z10);
                    this.F += ((long) this.G) * ((long) this.O);
                }
                this.P = null;
            }
        }
    }

    private static int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int r0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (n0.f19738a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.A == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.A = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.A.putInt(1431633921);
        }
        if (this.B == 0) {
            this.A.putInt(4, i10);
            this.A.putLong(8, j10 * 1000);
            this.A.position(0);
            this.B = i10;
        }
        int remaining = this.A.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.A, remaining, 1);
            if (write < 0) {
                this.B = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int q02 = q0(audioTrack, byteBuffer, i10);
        if (q02 < 0) {
            this.B = 0;
            return q02;
        }
        this.B -= q02;
        return q02;
    }

    public boolean S() {
        return Q().f21210b;
    }

    public boolean a(r1 r1Var) {
        return h(r1Var) != 0;
    }

    public boolean b() {
        return !X() || (this.T && !l());
    }

    public void c(f3 f3Var) {
        f3 f3Var2 = new f3(n0.p(f3Var.f20384a, 0.1f, 8.0f), n0.p(f3Var.f20385b, 0.1f, 8.0f));
        if (!this.f21172k || n0.f19738a < 23) {
            g0(f3Var2, S());
        } else {
            h0(f3Var2);
        }
    }

    public void d(y yVar) {
        if (!this.Y.equals(yVar)) {
            int i10 = yVar.f21388a;
            float f10 = yVar.f21389b;
            AudioTrack audioTrack = this.f21183v;
            if (audioTrack != null) {
                if (this.Y.f21388a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f21183v.setAuxEffectSendLevel(f10);
                }
            }
            this.Y = yVar;
        }
    }

    public f3 e() {
        if (this.f21172k) {
            return this.f21187z;
        }
        return N();
    }

    public void f(e eVar) {
        if (!this.f21184w.equals(eVar)) {
            this.f21184w = eVar;
            if (!this.f21159a0) {
                flush();
            }
        }
    }

    public void flush() {
        if (X()) {
            f0();
            if (this.f21170i.i()) {
                this.f21183v.pause();
            }
            if (Y(this.f21183v)) {
                ((m) k4.a.e(this.f21174m)).b(this.f21183v);
            }
            if (n0.f19738a < 21 && !this.W) {
                this.X = 0;
            }
            g gVar = this.f21181t;
            if (gVar != null) {
                this.f21182u = gVar;
                this.f21181t = null;
            }
            this.f21170i.q();
            e0(this.f21183v, this.f21169h);
            this.f21183v = null;
        }
        this.f21176o.a();
        this.f21175n.a();
    }

    public void g(boolean z10) {
        g0(N(), z10);
    }

    public int h(r1 r1Var) {
        if (!"audio/raw".equals(r1Var.f20654m)) {
            return ((this.f21163c0 || !o0(r1Var, this.f21184w)) && !this.f21158a.h(r1Var)) ? 0 : 2;
        }
        if (!n0.u0(r1Var.B)) {
            r.i("DefaultAudioSink", "Invalid PCM encoding: " + r1Var.B);
            return 0;
        }
        int i10 = r1Var.B;
        if (i10 == 2 || (this.f21162c && i10 == 4)) {
            return 2;
        }
        return 1;
    }

    public void i() {
        this.V = true;
        if (X()) {
            this.f21170i.u();
            this.f21183v.play();
        }
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.Z = dVar;
        AudioTrack audioTrack = this.f21183v;
        if (audioTrack != null) {
            b.a(audioTrack, dVar);
        }
    }

    public void k() throws v.e {
        if (!this.T && X() && K()) {
            b0();
            this.T = true;
        }
    }

    public boolean l() {
        return X() && this.f21170i.h(U());
    }

    public void m(int i10) {
        if (this.X != i10) {
            this.X = i10;
            this.W = i10 != 0;
            flush();
        }
    }

    public long n(boolean z10) {
        if (!X() || this.I) {
            return Long.MIN_VALUE;
        }
        return H(G(Math.min(this.f21170i.d(z10), this.f21182u.h(U()))));
    }

    public void o() {
        if (this.f21159a0) {
            this.f21159a0 = false;
            flush();
        }
    }

    public /* synthetic */ void p(long j10) {
        u.a(this, j10);
    }

    public void pause() {
        this.V = false;
        if (X() && this.f21170i.p()) {
            this.f21183v.pause();
        }
    }

    public void q() {
        this.H = true;
    }

    public void r(r1 r1Var, int i10, int[] iArr) throws v.a {
        g[] gVarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        g[] gVarArr2;
        int[] iArr2;
        r1 r1Var2 = r1Var;
        if ("audio/raw".equals(r1Var2.f20654m)) {
            k4.a.a(n0.u0(r1Var2.B));
            i16 = n0.d0(r1Var2.B, r1Var2.f20667z);
            if (n0(r1Var2.B)) {
                gVarArr2 = this.f21168g;
            } else {
                gVarArr2 = this.f21167f;
            }
            this.f21166e.n(r1Var2.C, r1Var2.D);
            if (n0.f19738a < 21 && r1Var2.f20667z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i22 = 0; i22 < 6; i22++) {
                    iArr2[i22] = i22;
                }
            } else {
                iArr2 = iArr;
            }
            this.f21164d.l(iArr2);
            g.a aVar = new g.a(r1Var2.A, r1Var2.f20667z, r1Var2.B);
            int length = gVarArr2.length;
            int i23 = 0;
            while (i23 < length) {
                g gVar = gVarArr2[i23];
                try {
                    g.a d10 = gVar.d(aVar);
                    if (gVar.isActive()) {
                        aVar = d10;
                    }
                    i23++;
                } catch (g.b e10) {
                    throw new v.a((Throwable) e10, r1Var2);
                }
            }
            int i24 = aVar.f21267c;
            int i25 = aVar.f21265a;
            int G2 = n0.G(aVar.f21266b);
            gVarArr = gVarArr2;
            i13 = n0.d0(i24, aVar.f21266b);
            i15 = i24;
            i12 = i25;
            i14 = G2;
            i11 = 0;
        } else {
            g[] gVarArr3 = new g[0];
            int i26 = r1Var2.A;
            if (o0(r1Var2, this.f21184w)) {
                gVarArr = gVarArr3;
                i12 = i26;
                i15 = k4.v.f((String) k4.a.e(r1Var2.f20654m), r1Var2.f20651j);
                i14 = n0.G(r1Var2.f20667z);
                i16 = -1;
                i13 = -1;
                i11 = 1;
            } else {
                Pair<Integer, Integer> f10 = this.f21158a.f(r1Var2);
                if (f10 != null) {
                    int intValue = ((Integer) f10.first).intValue();
                    gVarArr = gVarArr3;
                    i12 = i26;
                    i14 = ((Integer) f10.second).intValue();
                    i15 = intValue;
                    i16 = -1;
                    i13 = -1;
                    i11 = 2;
                } else {
                    throw new v.a("Unable to configure passthrough for: " + r1Var2, r1Var2);
                }
            }
        }
        if (i15 == 0) {
            throw new v.a("Invalid output encoding (mode=" + i11 + ") for: " + r1Var2, r1Var2);
        } else if (i14 != 0) {
            if (i10 != 0) {
                i21 = i10;
                i20 = i15;
                i19 = i14;
                i17 = i13;
                i18 = i12;
            } else {
                i20 = i15;
                i19 = i14;
                i17 = i13;
                i18 = i12;
                i21 = this.f21177p.a(O(i12, i14, i15), i15, i11, i13 != -1 ? i13 : 1, i12, r1Var2.f20650i, this.f21172k ? 8.0d : 1.0d);
            }
            this.f21163c0 = false;
            g gVar2 = new g(r1Var, i16, i11, i17, i18, i19, i20, i21, gVarArr);
            if (X()) {
                this.f21181t = gVar2;
            } else {
                this.f21182u = gVar2;
            }
        } else {
            throw new v.a("Invalid output channel config (mode=" + i11 + ") for: " + r1Var2, r1Var2);
        }
    }

    public void reset() {
        flush();
        for (g reset : this.f21167f) {
            reset.reset();
        }
        for (g reset2 : this.f21168g) {
            reset2.reset();
        }
        this.V = false;
        this.f21163c0 = false;
    }

    public void s() {
        k4.a.f(n0.f19738a >= 21);
        k4.a.f(this.W);
        if (!this.f21159a0) {
            this.f21159a0 = true;
            flush();
        }
    }

    public void setVolume(float f10) {
        if (this.K != f10) {
            this.K = f10;
            i0();
        }
    }

    public boolean t(ByteBuffer byteBuffer, long j10, int i10) throws v.b, v.e {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j11 = j10;
        int i11 = i10;
        ByteBuffer byteBuffer3 = this.N;
        k4.a.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f21181t != null) {
            if (!K()) {
                return false;
            }
            if (!this.f21181t.b(this.f21182u)) {
                b0();
                if (l()) {
                    return false;
                }
                flush();
            } else {
                this.f21182u = this.f21181t;
                this.f21181t = null;
                if (Y(this.f21183v) && this.f21173l != 3) {
                    if (this.f21183v.getPlayState() == 3) {
                        this.f21183v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f21183v;
                    r1 r1Var = this.f21182u.f21197a;
                    audioTrack.setOffloadDelayPadding(r1Var.C, r1Var.D);
                    this.f21165d0 = true;
                }
            }
            F(j11);
        }
        if (!X()) {
            try {
                if (!V()) {
                    return false;
                }
            } catch (v.b e10) {
                v.b bVar = e10;
                if (!bVar.f21344b) {
                    this.f21175n.b(bVar);
                    return false;
                }
                throw bVar;
            }
        }
        this.f21175n.a();
        if (this.I) {
            this.J = Math.max(0, j11);
            this.H = false;
            this.I = false;
            if (this.f21172k && n0.f19738a >= 23) {
                h0(this.f21187z);
            }
            F(j11);
            if (this.V) {
                i();
            }
        }
        if (!this.f21170i.k(U())) {
            return false;
        }
        if (this.N == null) {
            k4.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f21182u;
            if (gVar.f21199c != 0 && this.G == 0) {
                int P2 = P(gVar.f21203g, byteBuffer2);
                this.G = P2;
                if (P2 == 0) {
                    return true;
                }
            }
            if (this.f21185x != null) {
                if (!K()) {
                    return false;
                }
                F(j11);
                this.f21185x = null;
            }
            long k10 = this.J + this.f21182u.k(T() - this.f21166e.l());
            if (!this.H && Math.abs(k10 - j11) > 200000) {
                v.c cVar = this.f21180s;
                if (cVar != null) {
                    cVar.b(new v.d(j11, k10));
                }
                this.H = true;
            }
            if (this.H) {
                if (!K()) {
                    return false;
                }
                long j12 = j11 - k10;
                this.J += j12;
                this.H = false;
                F(j11);
                v.c cVar2 = this.f21180s;
                if (!(cVar2 == null || j12 == 0)) {
                    cVar2.f();
                }
            }
            if (this.f21182u.f21199c == 0) {
                this.C += (long) byteBuffer.remaining();
            } else {
                this.D += ((long) this.G) * ((long) i11);
            }
            this.N = byteBuffer2;
            this.O = i11;
        }
        c0(j11);
        if (!this.N.hasRemaining()) {
            this.N = null;
            this.O = 0;
            return true;
        } else if (!this.f21170i.j(U())) {
            return false;
        } else {
            r.i("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public void u(v.c cVar) {
        this.f21180s = cVar;
    }

    public void v(u1 u1Var) {
        this.f21179r = u1Var;
    }

    public void w() {
        if (n0.f19738a < 25) {
            flush();
            return;
        }
        this.f21176o.a();
        this.f21175n.a();
        if (X()) {
            f0();
            if (this.f21170i.i()) {
                this.f21183v.pause();
            }
            this.f21183v.flush();
            this.f21170i.q();
            x xVar = this.f21170i;
            AudioTrack audioTrack = this.f21183v;
            g gVar = this.f21182u;
            xVar.s(audioTrack, gVar.f21199c == 2, gVar.f21203g, gVar.f21200d, gVar.f21204h);
            this.I = true;
        }
    }

    private c0(f fVar) {
        this.f21158a = fVar.f21190a;
        h b10 = fVar.f21191b;
        this.f21160b = b10;
        int i10 = n0.f19738a;
        this.f21162c = i10 >= 21 && fVar.f21192c;
        this.f21172k = i10 >= 23 && fVar.f21193d;
        this.f21173l = i10 >= 29 ? fVar.f21194e : 0;
        this.f21177p = fVar.f21195f;
        k4.g gVar = new k4.g(k4.d.f19684a);
        this.f21169h = gVar;
        gVar.e();
        this.f21170i = new x(new l());
        a0 a0Var = new a0();
        this.f21164d = a0Var;
        n0 n0Var = new n0();
        this.f21166e = n0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new z[]{new j0(), a0Var, n0Var});
        Collections.addAll(arrayList, b10.e());
        this.f21167f = (g[]) arrayList.toArray(new g[0]);
        this.f21168g = new g[]{new f0()};
        this.K = 1.0f;
        this.f21184w = e.f21234h;
        this.X = 0;
        this.Y = new y(0, 0.0f);
        f3 f3Var = f3.f20380d;
        this.f21186y = new j(f3Var, false, 0, 0);
        this.f21187z = f3Var;
        this.S = -1;
        this.L = new g[0];
        this.M = new ByteBuffer[0];
        this.f21171j = new ArrayDeque<>();
        this.f21175n = new k<>(100);
        this.f21176o = new k<>(100);
        this.f21178q = fVar.f21196g;
    }
}
