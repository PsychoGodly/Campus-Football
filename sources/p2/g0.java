package p2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import e3.l;
import e3.n;
import e3.o;
import e3.q;
import e3.v;
import java.nio.ByteBuffer;
import java.util.List;
import k4.n0;
import k4.r;
import k4.t;
import n2.f3;
import n2.p3;
import n2.q3;
import n2.r1;
import n2.s1;
import p2.t;
import p2.v;
import q2.g;
import q2.i;
import s6.u;

/* compiled from: MediaCodecAudioRenderer */
public class g0 extends o implements t {
    private final Context E0;
    /* access modifiers changed from: private */
    public final t.a F0;
    private final v G0;
    private int H0;
    private boolean I0;
    private r1 J0;
    private r1 K0;
    private long L0;
    private boolean M0;
    private boolean N0;
    private boolean O0;
    private boolean P0;
    /* access modifiers changed from: private */
    public p3.a Q0;

    /* compiled from: MediaCodecAudioRenderer */
    private static final class b {
        public static void a(v vVar, Object obj) {
            vVar.j((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: MediaCodecAudioRenderer */
    private final class c implements v.c {
        private c() {
        }

        public void a(boolean z10) {
            g0.this.F0.C(z10);
        }

        public void b(Exception exc) {
            r.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            g0.this.F0.l(exc);
        }

        public void c(long j10) {
            g0.this.F0.B(j10);
        }

        public void d() {
            if (g0.this.Q0 != null) {
                g0.this.Q0.a();
            }
        }

        public void e(int i10, long j10, long j11) {
            g0.this.F0.D(i10, j10, j11);
        }

        public void f() {
            g0.this.x1();
        }

        public void g() {
            if (g0.this.Q0 != null) {
                g0.this.Q0.b();
            }
        }
    }

    public g0(Context context, l.b bVar, q qVar, boolean z10, Handler handler, t tVar, v vVar) {
        super(1, bVar, qVar, z10, 44100.0f);
        this.E0 = context.getApplicationContext();
        this.G0 = vVar;
        this.F0 = new t.a(handler, tVar);
        vVar.u(new c());
    }

    private static boolean r1(String str) {
        if (n0.f19738a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(n0.f19740c)) {
            String str2 = n0.f19739b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean s1() {
        if (n0.f19738a == 23) {
            String str = n0.f19741d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int t1(n nVar, r1 r1Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f17853a) || (i10 = n0.f19738a) >= 24 || (i10 == 23 && n0.x0(this.E0))) {
            return r1Var.f20655n;
        }
        return -1;
    }

    private static List<n> v1(q qVar, r1 r1Var, boolean z10, v vVar) throws v.c {
        n v10;
        String str = r1Var.f20654m;
        if (str == null) {
            return u.y();
        }
        if (vVar.a(r1Var) && (v10 = e3.v.v()) != null) {
            return u.z(v10);
        }
        List<n> a10 = qVar.a(str, z10, false);
        String m10 = e3.v.m(r1Var);
        if (m10 == null) {
            return u.u(a10);
        }
        return u.p().j(a10).j(qVar.a(m10, z10, false)).k();
    }

    private void y1() {
        long n10 = this.G0.n(b());
        if (n10 != Long.MIN_VALUE) {
            if (!this.N0) {
                n10 = Math.max(this.L0, n10);
            }
            this.L0 = n10;
            this.N0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void F() {
        this.O0 = true;
        this.J0 = null;
        try {
            this.G0.flush();
            try {
                super.F();
            } finally {
                this.F0.o(this.f17901z0);
            }
        } catch (Throwable th) {
            super.F();
            throw th;
        } finally {
            this.F0.o(this.f17901z0);
        }
    }

    /* access modifiers changed from: protected */
    public void G(boolean z10, boolean z11) throws n2.q {
        super.G(z10, z11);
        this.F0.p(this.f17901z0);
        if (z().f20723a) {
            this.G0.s();
        } else {
            this.G0.o();
        }
        this.G0.v(C());
    }

    /* access modifiers changed from: protected */
    public void H(long j10, boolean z10) throws n2.q {
        super.H(j10, z10);
        if (this.P0) {
            this.G0.w();
        } else {
            this.G0.flush();
        }
        this.L0 = j10;
        this.M0 = true;
        this.N0 = true;
    }

    /* access modifiers changed from: protected */
    public void H0(Exception exc) {
        r.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.F0.k(exc);
    }

    /* access modifiers changed from: protected */
    public void I() {
        try {
            super.I();
        } finally {
            if (this.O0) {
                this.O0 = false;
                this.G0.reset();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void I0(String str, l.a aVar, long j10, long j11) {
        this.F0.m(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public void J() {
        super.J();
        this.G0.i();
    }

    /* access modifiers changed from: protected */
    public void J0(String str) {
        this.F0.n(str);
    }

    /* access modifiers changed from: protected */
    public void K() {
        y1();
        this.G0.pause();
        super.K();
    }

    /* access modifiers changed from: protected */
    public i K0(s1 s1Var) throws n2.q {
        this.J0 = (r1) k4.a.e(s1Var.f20721b);
        i K02 = super.K0(s1Var);
        this.F0.q(this.J0, K02);
        return K02;
    }

    /* access modifiers changed from: protected */
    public void L0(r1 r1Var, MediaFormat mediaFormat) throws n2.q {
        int i10;
        int i11;
        r1 r1Var2 = this.K0;
        int[] iArr = null;
        if (r1Var2 != null) {
            r1Var = r1Var2;
        } else if (n0() != null) {
            if ("audio/raw".equals(r1Var.f20654m)) {
                i10 = r1Var.B;
            } else if (n0.f19738a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i10 = mediaFormat.containsKey("v-bits-per-sample") ? n0.b0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i10 = mediaFormat.getInteger("pcm-encoding");
            }
            r1 G = new r1.b().g0("audio/raw").a0(i10).P(r1Var.C).Q(r1Var.D).J(mediaFormat.getInteger("channel-count")).h0(mediaFormat.getInteger("sample-rate")).G();
            if (this.I0 && G.f20667z == 6 && (i11 = r1Var.f20667z) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < r1Var.f20667z; i12++) {
                    iArr[i12] = i12;
                }
            }
            r1Var = G;
        }
        try {
            this.G0.r(r1Var, 0, iArr);
        } catch (v.a e10) {
            throw x(e10, e10.f21342a, 5001);
        }
    }

    /* access modifiers changed from: protected */
    public void M0(long j10) {
        this.G0.p(j10);
    }

    /* access modifiers changed from: protected */
    public void O0() {
        super.O0();
        this.G0.q();
    }

    /* access modifiers changed from: protected */
    public void P0(g gVar) {
        if (this.M0 && !gVar.k()) {
            if (Math.abs(gVar.f21757f - this.L0) > 500000) {
                this.L0 = gVar.f21757f;
            }
            this.M0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public i R(n nVar, r1 r1Var, r1 r1Var2) {
        int i10;
        i f10 = nVar.f(r1Var, r1Var2);
        int i11 = f10.f21769e;
        if (t1(nVar, r1Var2) > this.H0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = nVar.f17853a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = f10.f21768d;
        }
        return new i(str, r1Var, r1Var2, i10, i12);
    }

    /* access modifiers changed from: protected */
    public boolean R0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, r1 r1Var) throws n2.q {
        k4.a.e(byteBuffer);
        if (this.K0 != null && (i11 & 2) != 0) {
            ((l) k4.a.e(lVar)).i(i10, false);
            return true;
        } else if (z10) {
            if (lVar != null) {
                lVar.i(i10, false);
            }
            this.f17901z0.f21747f += i12;
            this.G0.q();
            return true;
        } else {
            try {
                if (!this.G0.t(byteBuffer, j12, i12)) {
                    return false;
                }
                if (lVar != null) {
                    lVar.i(i10, false);
                }
                this.f17901z0.f21746e += i12;
                return true;
            } catch (v.b e10) {
                throw y(e10, this.J0, e10.f21344b, 5001);
            } catch (v.e e11) {
                throw y(e11, r1Var, e11.f21349b, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void W0() throws n2.q {
        try {
            this.G0.k();
        } catch (v.e e10) {
            throw y(e10, e10.f21350c, e10.f21349b, 5002);
        }
    }

    public boolean b() {
        return super.b() && this.G0.b();
    }

    public void c(f3 f3Var) {
        this.G0.c(f3Var);
    }

    public f3 e() {
        return this.G0.e();
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    public boolean isReady() {
        return this.G0.l() || super.isReady();
    }

    /* access modifiers changed from: protected */
    public boolean j1(r1 r1Var) {
        return this.G0.a(r1Var);
    }

    /* access modifiers changed from: protected */
    public int k1(q qVar, r1 r1Var) throws v.c {
        boolean z10;
        int i10 = 0;
        if (!k4.v.o(r1Var.f20654m)) {
            return q3.a(0);
        }
        int i11 = n0.f19738a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = r1Var.H != 0;
        boolean l12 = o.l1(r1Var);
        int i12 = 8;
        int i13 = 4;
        if (l12 && this.G0.a(r1Var) && (!z12 || e3.v.v() != null)) {
            return q3.b(4, 8, i11);
        }
        if ("audio/raw".equals(r1Var.f20654m) && !this.G0.a(r1Var)) {
            return q3.a(1);
        }
        if (!this.G0.a(n0.c0(2, r1Var.f20667z, r1Var.A))) {
            return q3.a(1);
        }
        List<n> v12 = v1(qVar, r1Var, false, this.G0);
        if (v12.isEmpty()) {
            return q3.a(1);
        }
        if (!l12) {
            return q3.a(2);
        }
        n nVar = v12.get(0);
        boolean o10 = nVar.o(r1Var);
        if (!o10) {
            int i14 = 1;
            while (true) {
                if (i14 >= v12.size()) {
                    break;
                }
                n nVar2 = v12.get(i14);
                if (nVar2.o(r1Var)) {
                    nVar = nVar2;
                    z10 = false;
                    break;
                }
                i14++;
            }
        }
        z11 = o10;
        z10 = true;
        if (!z11) {
            i13 = 3;
        }
        if (z11 && nVar.r(r1Var)) {
            i12 = 16;
        }
        int i15 = nVar.f17860h ? 64 : 0;
        if (z10) {
            i10 = 128;
        }
        return q3.c(i13, i12, i11, i15, i10);
    }

    public long l() {
        if (getState() == 2) {
            y1();
        }
        return this.L0;
    }

    public void p(int i10, Object obj) throws n2.q {
        if (i10 == 2) {
            this.G0.setVolume(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.G0.f((e) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.G0.g(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.G0.m(((Integer) obj).intValue());
                    return;
                case 11:
                    this.Q0 = (p3.a) obj;
                    return;
                case 12:
                    if (n0.f19738a >= 23) {
                        b.a(this.G0, obj);
                        return;
                    }
                    return;
                default:
                    super.p(i10, obj);
                    return;
            }
        } else {
            this.G0.d((y) obj);
        }
    }

    /* access modifiers changed from: protected */
    public float q0(float f10, r1 r1Var, r1[] r1VarArr) {
        int i10 = -1;
        for (r1 r1Var2 : r1VarArr) {
            int i11 = r1Var2.A;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * ((float) i10);
    }

    /* access modifiers changed from: protected */
    public List<n> s0(q qVar, r1 r1Var, boolean z10) throws v.c {
        return e3.v.u(v1(qVar, r1Var, z10, this.G0), r1Var);
    }

    /* access modifiers changed from: protected */
    public l.a u0(n nVar, r1 r1Var, MediaCrypto mediaCrypto, float f10) {
        this.H0 = u1(nVar, r1Var, D());
        this.I0 = r1(nVar.f17853a);
        MediaFormat w12 = w1(r1Var, nVar.f17855c, this.H0, f10);
        this.K0 = "audio/raw".equals(nVar.f17854b) && !"audio/raw".equals(r1Var.f20654m) ? r1Var : null;
        return l.a.a(nVar, w12, r1Var, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public int u1(n nVar, r1 r1Var, r1[] r1VarArr) {
        int t12 = t1(nVar, r1Var);
        if (r1VarArr.length == 1) {
            return t12;
        }
        for (r1 r1Var2 : r1VarArr) {
            if (nVar.f(r1Var, r1Var2).f21768d != 0) {
                t12 = Math.max(t12, t1(nVar, r1Var2));
            }
        }
        return t12;
    }

    public k4.t w() {
        return this;
    }

    /* access modifiers changed from: protected */
    public MediaFormat w1(r1 r1Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", r1Var.f20667z);
        mediaFormat.setInteger("sample-rate", r1Var.A);
        k4.u.e(mediaFormat, r1Var.f20656o);
        k4.u.d(mediaFormat, "max-input-size", i10);
        int i11 = n0.f19738a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f && !s1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(r1Var.f20654m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.G0.h(n0.c0(4, r1Var.f20667z, r1Var.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public void x1() {
        this.N0 = true;
    }
}
