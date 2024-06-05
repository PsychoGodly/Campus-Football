package com.applovin.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.o1;
import com.applovin.impl.q1;
import com.applovin.impl.t1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public final class q5 implements q1 {

    /* renamed from: a0  reason: collision with root package name */
    public static boolean f10821a0 = false;
    private long A;
    private long B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private float H;
    private o1[] I;
    private ByteBuffer[] J;
    private ByteBuffer K;
    private int L;
    private ByteBuffer M;
    private byte[] N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    /* access modifiers changed from: private */
    public boolean S;
    private boolean T;
    private int U;
    private u1 V;
    private boolean W;
    /* access modifiers changed from: private */
    public long X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final m1 f10822a;

    /* renamed from: b  reason: collision with root package name */
    private final b f10823b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10824c;

    /* renamed from: d  reason: collision with root package name */
    private final b3 f10825d;

    /* renamed from: e  reason: collision with root package name */
    private final ap f10826e;

    /* renamed from: f  reason: collision with root package name */
    private final o1[] f10827f;

    /* renamed from: g  reason: collision with root package name */
    private final o1[] f10828g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final ConditionVariable f10829h;

    /* renamed from: i  reason: collision with root package name */
    private final t1 f10830i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque f10831j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10832k;

    /* renamed from: l  reason: collision with root package name */
    private final int f10833l;

    /* renamed from: m  reason: collision with root package name */
    private i f10834m;

    /* renamed from: n  reason: collision with root package name */
    private final g f10835n;

    /* renamed from: o  reason: collision with root package name */
    private final g f10836o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public q1.c f10837p;

    /* renamed from: q  reason: collision with root package name */
    private c f10838q;

    /* renamed from: r  reason: collision with root package name */
    private c f10839r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public AudioTrack f10840s;

    /* renamed from: t  reason: collision with root package name */
    private k1 f10841t;

    /* renamed from: u  reason: collision with root package name */
    private f f10842u;

    /* renamed from: v  reason: collision with root package name */
    private f f10843v;

    /* renamed from: w  reason: collision with root package name */
    private mh f10844w;

    /* renamed from: x  reason: collision with root package name */
    private ByteBuffer f10845x;

    /* renamed from: y  reason: collision with root package name */
    private int f10846y;

    /* renamed from: z  reason: collision with root package name */
    private long f10847z;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioTrack f10848a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f10848a = audioTrack;
        }

        public void run() {
            try {
                this.f10848a.flush();
                this.f10848a.release();
            } finally {
                q5.this.f10829h.open();
            }
        }
    }

    public interface b {
        long a(long j10);

        mh a(mh mhVar);

        boolean a(boolean z10);

        o1[] a();

        long b();
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d9 f10850a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10851b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10852c;

        /* renamed from: d  reason: collision with root package name */
        public final int f10853d;

        /* renamed from: e  reason: collision with root package name */
        public final int f10854e;

        /* renamed from: f  reason: collision with root package name */
        public final int f10855f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10856g;

        /* renamed from: h  reason: collision with root package name */
        public final int f10857h;

        /* renamed from: i  reason: collision with root package name */
        public final o1[] f10858i;

        public c(d9 d9Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, o1[] o1VarArr) {
            this.f10850a = d9Var;
            this.f10851b = i10;
            this.f10852c = i11;
            this.f10853d = i12;
            this.f10854e = i13;
            this.f10855f = i14;
            this.f10856g = i15;
            this.f10858i = o1VarArr;
            this.f10857h = a(i16, z10);
        }

        private int c(long j10) {
            int b10 = q5.d(this.f10856g);
            if (this.f10856g == 5) {
                b10 *= 2;
            }
            return (int) ((j10 * ((long) b10)) / 1000000);
        }

        private AudioTrack d(boolean z10, k1 k1Var, int i10) {
            AudioFormat a10 = q5.b(this.f10854e, this.f10855f, this.f10856g);
            AudioAttributes a11 = a(k1Var, z10);
            boolean z11 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(a11).setAudioFormat(a10).setTransferMode(1).setBufferSizeInBytes(this.f10857h).setSessionId(i10);
            if (this.f10852c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        }

        public AudioTrack a(boolean z10, k1 k1Var, int i10) {
            try {
                AudioTrack b10 = b(z10, k1Var, i10);
                int state = b10.getState();
                if (state == 1) {
                    return b10;
                }
                try {
                    b10.release();
                } catch (Exception unused) {
                }
                throw new q1.b(state, this.f10854e, this.f10855f, this.f10857h, this.f10850a, b(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new q1.b(0, this.f10854e, this.f10855f, this.f10857h, this.f10850a, b(), e10);
            }
        }

        public long b(long j10) {
            return (j10 * 1000000) / ((long) this.f10854e);
        }

        public boolean b() {
            return this.f10852c == 1;
        }

        private AudioTrack b(boolean z10, k1 k1Var, int i10) {
            int i11 = yp.f13662a;
            if (i11 >= 29) {
                return d(z10, k1Var, i10);
            }
            if (i11 >= 21) {
                return c(z10, k1Var, i10);
            }
            return a(k1Var, i10);
        }

        private AudioTrack c(boolean z10, k1 k1Var, int i10) {
            return new AudioTrack(a(k1Var, z10), q5.b(this.f10854e, this.f10855f, this.f10856g), this.f10857h, 1, i10);
        }

        public boolean a(c cVar) {
            return cVar.f10852c == this.f10852c && cVar.f10856g == this.f10856g && cVar.f10854e == this.f10854e && cVar.f10855f == this.f10855f && cVar.f10853d == this.f10853d;
        }

        private int a(int i10, boolean z10) {
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.f10852c;
            if (i11 == 0) {
                return a(z10 ? 8.0f : 1.0f);
            } else if (i11 == 1) {
                return c(50000000);
            } else {
                if (i11 == 2) {
                    return c(250000);
                }
                throw new IllegalStateException();
            }
        }

        public long d(long j10) {
            return (j10 * 1000000) / ((long) this.f10850a.A);
        }

        private AudioTrack a(k1 k1Var, int i10) {
            int e10 = yp.e(k1Var.f8855c);
            if (i10 == 0) {
                return new AudioTrack(e10, this.f10854e, this.f10855f, this.f10856g, this.f10857h, 1);
            }
            return new AudioTrack(e10, this.f10854e, this.f10855f, this.f10856g, this.f10857h, 1, i10);
        }

        public long a(long j10) {
            return (j10 * ((long) this.f10854e)) / 1000000;
        }

        private static AudioAttributes a(k1 k1Var, boolean z10) {
            if (z10) {
                return a();
            }
            return k1Var.a();
        }

        private int a(float f10) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f10854e, this.f10855f, this.f10856g);
            a1.b(minBufferSize != -2);
            int a10 = yp.a(minBufferSize * 4, ((int) a(250000)) * this.f10853d, Math.max(minBufferSize, ((int) a(750000)) * this.f10853d));
            return f10 != 1.0f ? Math.round(((float) a10) * f10) : a10;
        }

        private static AudioAttributes a() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
    }

    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private final o1[] f10859a;

        /* renamed from: b  reason: collision with root package name */
        private final xj f10860b;

        /* renamed from: c  reason: collision with root package name */
        private final lk f10861c;

        public d(o1... o1VarArr) {
            this(o1VarArr, new xj(), new lk());
        }

        public mh a(mh mhVar) {
            this.f10861c.b(mhVar.f9804a);
            this.f10861c.a(mhVar.f9805b);
            return mhVar;
        }

        public long b() {
            return this.f10860b.j();
        }

        public d(o1[] o1VarArr, xj xjVar, lk lkVar) {
            o1[] o1VarArr2 = new o1[(o1VarArr.length + 2)];
            this.f10859a = o1VarArr2;
            System.arraycopy(o1VarArr, 0, o1VarArr2, 0, o1VarArr.length);
            this.f10860b = xjVar;
            this.f10861c = lkVar;
            o1VarArr2[o1VarArr.length] = xjVar;
            o1VarArr2[o1VarArr.length + 1] = lkVar;
        }

        public boolean a(boolean z10) {
            this.f10860b.a(z10);
            return z10;
        }

        public o1[] a() {
            return this.f10859a;
        }

        public long a(long j10) {
            return this.f10861c.a(j10);
        }
    }

    public static final class e extends RuntimeException {
        private e(String str) {
            super(str);
        }

        /* synthetic */ e(String str, a aVar) {
            this(str);
        }
    }

    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final long f10866a;

        /* renamed from: b  reason: collision with root package name */
        private Exception f10867b;

        /* renamed from: c  reason: collision with root package name */
        private long f10868c;

        public g(long j10) {
            this.f10866a = j10;
        }

        public void a() {
            this.f10867b = null;
        }

        public void a(Exception exc) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f10867b == null) {
                this.f10867b = exc;
                this.f10868c = this.f10866a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f10868c) {
                Exception exc2 = this.f10867b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.f10867b;
                a();
                throw exc3;
            }
        }
    }

    private final class h implements t1.a {
        private h() {
        }

        public void a(long j10) {
            if (q5.this.f10837p != null) {
                q5.this.f10837p.a(j10);
            }
        }

        public void b(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + q5.this.q() + ", " + q5.this.r();
            if (!q5.f10821a0) {
                kc.d("DefaultAudioSink", str);
                return;
            }
            throw new e(str, (a) null);
        }

        /* synthetic */ h(q5 q5Var, a aVar) {
            this();
        }

        public void a(int i10, long j10) {
            if (q5.this.f10837p != null) {
                q5.this.f10837p.a(i10, j10, SystemClock.elapsedRealtime() - q5.this.X);
            }
        }

        public void a(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + q5.this.q() + ", " + q5.this.r();
            if (!q5.f10821a0) {
                kc.d("DefaultAudioSink", str);
                return;
            }
            throw new e(str, (a) null);
        }

        public void b(long j10) {
            kc.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }
    }

    private final class i {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f10870a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f10871b;

        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q5 f10873a;

            a(q5 q5Var) {
                this.f10873a = q5Var;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                a1.b(audioTrack == q5.this.f10840s);
                if (q5.this.f10837p != null && q5.this.S) {
                    q5.this.f10837p.a();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                a1.b(audioTrack == q5.this.f10840s);
                if (q5.this.f10837p != null && q5.this.S) {
                    q5.this.f10837p.a();
                }
            }
        }

        public i() {
            this.f10871b = new a(q5.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f10870a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new u10(handler), this.f10871b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f10871b);
            this.f10870a.removeCallbacksAndMessages((Object) null);
        }
    }

    public q5(m1 m1Var, b bVar, boolean z10, boolean z11, int i10) {
        this.f10822a = m1Var;
        this.f10823b = (b) a1.a((Object) bVar);
        int i11 = yp.f13662a;
        this.f10824c = i11 >= 21 && z10;
        this.f10832k = i11 >= 23 && z11;
        this.f10833l = i11 < 29 ? 0 : i10;
        this.f10829h = new ConditionVariable(true);
        this.f10830i = new t1(new h(this, (a) null));
        b3 b3Var = new b3();
        this.f10825d = b3Var;
        ap apVar = new ap();
        this.f10826e = apVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new y1[]{new ri(), b3Var, apVar});
        Collections.addAll(arrayList, bVar.a());
        this.f10827f = (o1[]) arrayList.toArray(new o1[0]);
        this.f10828g = new o1[]{new a9()};
        this.H = 1.0f;
        this.f10841t = k1.f8851g;
        this.U = 0;
        this.V = new u1(0, 0.0f);
        mh mhVar = mh.f9802d;
        this.f10843v = new f(mhVar, false, 0, 0, (a) null);
        this.f10844w = mhVar;
        this.P = -1;
        this.I = new o1[0];
        this.J = new ByteBuffer[0];
        this.f10831j = new ArrayDeque();
        this.f10835n = new g(100);
        this.f10836o = new g(100);
    }

    private AudioTrack k() {
        try {
            return ((c) a1.a((Object) this.f10839r)).a(this.W, this.f10841t, this.U);
        } catch (q1.b e10) {
            u();
            q1.c cVar = this.f10837p;
            if (cVar != null) {
                cVar.a((Exception) e10);
            }
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l() {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.P = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.P
            com.applovin.impl.o1[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.e()
        L_0x001f:
            r9.d((long) r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.P
            int r0 = r0 + r2
            r9.P = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L_0x003b
            r9.a((java.nio.ByteBuffer) r0, (long) r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q5.l():boolean");
    }

    private void m() {
        int i10 = 0;
        while (true) {
            o1[] o1VarArr = this.I;
            if (i10 < o1VarArr.length) {
                o1 o1Var = o1VarArr[i10];
                o1Var.b();
                this.J[i10] = o1Var.d();
                i10++;
            } else {
                return;
            }
        }
    }

    private mh n() {
        return o().f10862a;
    }

    private f o() {
        f fVar = this.f10842u;
        if (fVar != null) {
            return fVar;
        }
        if (!this.f10831j.isEmpty()) {
            return (f) this.f10831j.getLast();
        }
        return this.f10843v;
    }

    /* access modifiers changed from: private */
    public long q() {
        c cVar = this.f10839r;
        if (cVar.f10852c == 0) {
            return this.f10847z / ((long) cVar.f10851b);
        }
        return this.A;
    }

    /* access modifiers changed from: private */
    public long r() {
        c cVar = this.f10839r;
        if (cVar.f10852c == 0) {
            return this.B / ((long) cVar.f10853d);
        }
        return this.C;
    }

    private void s() {
        this.f10829h.block();
        AudioTrack k10 = k();
        this.f10840s = k10;
        if (a(k10)) {
            b(this.f10840s);
            if (this.f10833l != 3) {
                AudioTrack audioTrack = this.f10840s;
                d9 d9Var = this.f10839r.f10850a;
                audioTrack.setOffloadDelayPadding(d9Var.C, d9Var.D);
            }
        }
        this.U = this.f10840s.getAudioSessionId();
        t1 t1Var = this.f10830i;
        AudioTrack audioTrack2 = this.f10840s;
        c cVar = this.f10839r;
        t1Var.a(audioTrack2, cVar.f10852c == 2, cVar.f10856g, cVar.f10853d, cVar.f10857h);
        x();
        int i10 = this.V.f12479a;
        if (i10 != 0) {
            this.f10840s.attachAuxEffect(i10);
            this.f10840s.setAuxEffectSendLevel(this.V.f12480b);
        }
        this.F = true;
    }

    private boolean t() {
        return this.f10840s != null;
    }

    private void u() {
        if (this.f10839r.b()) {
            this.Y = true;
        }
    }

    private void v() {
        if (!this.R) {
            this.R = true;
            this.f10830i.d(r());
            this.f10840s.stop();
            this.f10846y = 0;
        }
    }

    private void w() {
        this.f10847z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.Z = false;
        this.D = 0;
        this.f10843v = new f(n(), p(), 0, 0, (a) null);
        this.G = 0;
        this.f10842u = null;
        this.f10831j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.f10845x = null;
        this.f10846y = 0;
        this.f10826e.k();
        m();
    }

    private void x() {
        if (t()) {
            if (yp.f13662a >= 21) {
                a(this.f10840s, this.H);
            } else {
                b(this.f10840s, this.H);
            }
        }
    }

    private void y() {
        o1[] o1VarArr = this.f10839r.f10858i;
        ArrayList arrayList = new ArrayList();
        for (o1 o1Var : o1VarArr) {
            if (o1Var.f()) {
                arrayList.add(o1Var);
            } else {
                o1Var.b();
            }
        }
        int size = arrayList.size();
        this.I = (o1[]) arrayList.toArray(new o1[size]);
        this.J = new ByteBuffer[size];
        m();
    }

    private boolean z() {
        return !this.W && "audio/raw".equals(this.f10839r.f10850a.f7153m) && !f(this.f10839r.f10850a.B);
    }

    public void h() {
        if (yp.f13662a < 25) {
            b();
            return;
        }
        this.f10836o.a();
        this.f10835n.a();
        if (t()) {
            w();
            if (this.f10830i.d()) {
                this.f10840s.pause();
            }
            this.f10840s.flush();
            this.f10830i.g();
            t1 t1Var = this.f10830i;
            AudioTrack audioTrack = this.f10840s;
            c cVar = this.f10839r;
            t1Var.a(audioTrack, cVar.f10852c == 2, cVar.f10856g, cVar.f10853d, cVar.f10857h);
            this.F = true;
        }
    }

    public void i() {
        this.E = true;
    }

    public void j() {
        this.S = true;
        if (t()) {
            this.f10830i.i();
            this.f10840s.play();
        }
    }

    public boolean p() {
        return o().f10863b;
    }

    public void pause() {
        this.S = false;
        if (t() && this.f10830i.f()) {
            this.f10840s.pause();
        }
    }

    public void reset() {
        b();
        for (o1 reset : this.f10827f) {
            reset.reset();
        }
        for (o1 reset2 : this.f10828g) {
            reset2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    private long c(long j10) {
        return j10 + this.f10839r.b(this.f10823b.b());
    }

    private static boolean e(int i10) {
        return (yp.f13662a >= 24 && i10 == -6) || i10 == -32;
    }

    public void d() {
        if (this.W) {
            this.W = false;
            b();
        }
    }

    public void f() {
        if (!this.Q && t() && l()) {
            v();
            this.Q = true;
        }
    }

    public boolean g() {
        return t() && this.f10830i.e(r());
    }

    private void a(long j10) {
        mh mhVar;
        if (z()) {
            mhVar = this.f10823b.a(n());
        } else {
            mhVar = mh.f9802d;
        }
        mh mhVar2 = mhVar;
        boolean a10 = z() ? this.f10823b.a(p()) : false;
        this.f10831j.add(new f(mhVar2, a10, Math.max(0, j10), this.f10839r.b(r()), (a) null));
        y();
        q1.c cVar = this.f10837p;
        if (cVar != null) {
            cVar.a(a10);
        }
    }

    private long b(long j10) {
        while (!this.f10831j.isEmpty() && j10 >= ((f) this.f10831j.getFirst()).f10865d) {
            this.f10843v = (f) this.f10831j.remove();
        }
        f fVar = this.f10843v;
        long j11 = j10 - fVar.f10865d;
        if (fVar.f10862a.equals(mh.f9802d)) {
            return this.f10843v.f10864c + j11;
        }
        if (this.f10831j.isEmpty()) {
            return this.f10843v.f10864c + this.f10823b.a(j11);
        }
        f fVar2 = (f) this.f10831j.getFirst();
        return fVar2.f10864c - yp.a(fVar2.f10865d - j10, this.f10843v.f10862a.f9804a);
    }

    public void e() {
        a1.b(yp.f13662a >= 21);
        a1.b(this.T);
        if (!this.W) {
            this.W = true;
            b();
        }
    }

    public boolean c() {
        return !t() || (this.Q && !g());
    }

    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final mh f10862a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10863b;

        /* renamed from: c  reason: collision with root package name */
        public final long f10864c;

        /* renamed from: d  reason: collision with root package name */
        public final long f10865d;

        private f(mh mhVar, boolean z10, long j10, long j11) {
            this.f10862a = mhVar;
            this.f10863b = z10;
            this.f10864c = j10;
            this.f10865d = j11;
        }

        /* synthetic */ f(mh mhVar, boolean z10, long j10, long j11, a aVar) {
            this(mhVar, z10, j10, j11);
        }
    }

    private static int c(int i10) {
        int i11 = yp.f13662a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(yp.f13663b) && i10 == 1) {
            i10 = 2;
        }
        return yp.a(i10);
    }

    /* access modifiers changed from: private */
    public static int d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean f(int i10) {
        return this.f10824c && yp.f(i10);
    }

    private void d(long j10) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.J[i10 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = o1.f10044a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j10);
            } else {
                o1 o1Var = this.I[i10];
                if (i10 > this.P) {
                    o1Var.a(byteBuffer);
                }
                ByteBuffer d10 = o1Var.d();
                this.J[i10] = d10;
                if (d10.hasRemaining()) {
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

    public void a(d9 d9Var, int i10, int[] iArr) {
        o1[] o1VarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        o1[] o1VarArr2;
        int[] iArr2;
        d9 d9Var2 = d9Var;
        if ("audio/raw".equals(d9Var2.f7153m)) {
            a1.a(yp.g(d9Var2.B));
            i16 = yp.b(d9Var2.B, d9Var2.f7166z);
            if (f(d9Var2.B)) {
                o1VarArr2 = this.f10828g;
            } else {
                o1VarArr2 = this.f10827f;
            }
            this.f10826e.a(d9Var2.C, d9Var2.D);
            if (yp.f13662a < 21 && d9Var2.f7166z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f10825d.a(iArr2);
            o1.a aVar = new o1.a(d9Var2.A, d9Var2.f7166z, d9Var2.B);
            int length = o1VarArr2.length;
            int i18 = 0;
            while (i18 < length) {
                o1 o1Var = o1VarArr2[i18];
                try {
                    o1.a a10 = o1Var.a(aVar);
                    if (o1Var.f()) {
                        aVar = a10;
                    }
                    i18++;
                } catch (o1.b e10) {
                    throw new q1.a((Throwable) e10, d9Var);
                }
            }
            int i19 = aVar.f10048c;
            i13 = aVar.f10046a;
            i12 = yp.a(aVar.f10047b);
            o1VarArr = o1VarArr2;
            i11 = i19;
            i14 = yp.b(i19, aVar.f10047b);
            i15 = 0;
        } else {
            o1[] o1VarArr3 = new o1[0];
            int i20 = d9Var2.A;
            if (a(d9Var, this.f10841t)) {
                o1VarArr = o1VarArr3;
                i11 = df.b((String) a1.a((Object) d9Var2.f7153m), d9Var2.f7150j);
                i12 = yp.a(d9Var2.f7166z);
                i16 = -1;
                i14 = -1;
                i13 = i20;
                i15 = 1;
            } else {
                Pair a11 = a(d9Var, this.f10822a);
                if (a11 != null) {
                    o1VarArr = o1VarArr3;
                    i11 = ((Integer) a11.first).intValue();
                    i16 = -1;
                    i14 = -1;
                    i12 = ((Integer) a11.second).intValue();
                    i13 = i20;
                    i15 = 2;
                } else {
                    throw new q1.a("Unable to configure passthrough for: " + d9Var, d9Var);
                }
            }
        }
        if (i11 == 0) {
            throw new q1.a("Invalid output encoding (mode=" + i15 + ") for: " + d9Var, d9Var);
        } else if (i12 != 0) {
            this.Y = false;
            c cVar = new c(d9Var, i16, i15, i14, i13, i12, i11, i10, this.f10832k, o1VarArr);
            if (t()) {
                this.f10838q = cVar;
            } else {
                this.f10839r = cVar;
            }
        } else {
            throw new q1.a("Invalid output channel config (mode=" + i15 + ") for: " + d9Var, d9Var);
        }
    }

    public void b() {
        if (t()) {
            w();
            if (this.f10830i.d()) {
                this.f10840s.pause();
            }
            if (a(this.f10840s)) {
                ((i) a1.a((Object) this.f10834m)).b(this.f10840s);
            }
            AudioTrack audioTrack = this.f10840s;
            this.f10840s = null;
            if (yp.f13662a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f10838q;
            if (cVar != null) {
                this.f10839r = cVar;
                this.f10838q = null;
            }
            this.f10830i.g();
            this.f10829h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f10836o.a();
        this.f10835n.a();
    }

    public int b(d9 d9Var) {
        if (!"audio/raw".equals(d9Var.f7153m)) {
            return ((this.Y || !a(d9Var, this.f10841t)) && !b(d9Var, this.f10822a)) ? 0 : 2;
        }
        if (!yp.g(d9Var.B)) {
            kc.d("DefaultAudioSink", "Invalid PCM encoding: " + d9Var.B);
            return 0;
        }
        int i10 = d9Var.B;
        if (i10 == 2 || (this.f10824c && i10 == 4)) {
            return 2;
        }
        return 1;
    }

    private static boolean b(d9 d9Var, m1 m1Var) {
        return a(d9Var, m1Var) != null;
    }

    private void b(AudioTrack audioTrack) {
        if (this.f10834m == null) {
            this.f10834m = new i();
        }
        this.f10834m.a(audioTrack);
    }

    private void b(mh mhVar) {
        if (t()) {
            try {
                this.f10840s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(mhVar.f9804a).setPitch(mhVar.f9805b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                kc.c("DefaultAudioSink", "Failed to set playback params", e10);
            }
            mhVar = new mh(this.f10840s.getPlaybackParams().getSpeed(), this.f10840s.getPlaybackParams().getPitch());
            this.f10830i.a(mhVar.f9804a);
        }
        this.f10844w = mhVar;
    }

    public long a(boolean z10) {
        if (!t() || this.F) {
            return Long.MIN_VALUE;
        }
        return c(b(Math.min(this.f10830i.a(z10), this.f10839r.b(r()))));
    }

    private static Pair a(d9 d9Var, m1 m1Var) {
        if (m1Var == null) {
            return null;
        }
        int b10 = df.b((String) a1.a((Object) d9Var.f7153m), d9Var.f7150j);
        int i10 = 6;
        if (b10 != 5 && b10 != 6 && b10 != 18 && b10 != 17 && b10 != 7 && b10 != 8 && b10 != 14) {
            return null;
        }
        if (b10 == 18 && !m1Var.a(18)) {
            b10 = 6;
        } else if (b10 == 8 && !m1Var.a(8)) {
            b10 = 7;
        }
        if (!m1Var.a(b10)) {
            return null;
        }
        if (b10 != 18) {
            i10 = d9Var.f7166z;
            if (i10 > m1Var.c()) {
                return null;
            }
        } else if (yp.f13662a >= 29 && (i10 = a(18, d9Var.A)) == 0) {
            kc.d("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int c10 = c(i10);
        if (c10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(b10), Integer.valueOf(c10));
    }

    public void b(boolean z10) {
        a(n(), z10);
    }

    private static void b(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    /* access modifiers changed from: private */
    public static AudioFormat b(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private static int a(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return k.b(byteBuffer);
            case 7:
            case 8:
                return d7.a(byteBuffer);
            case 9:
                int d10 = of.d(yp.a(byteBuffer, byteBuffer.position()));
                if (d10 != -1) {
                    return d10;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 14:
                int a10 = k.a(byteBuffer);
                if (a10 == -1) {
                    return 0;
                }
                return k.a(byteBuffer, a10) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return n.a(byteBuffer);
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
        }
    }

    public mh a() {
        if (this.f10832k) {
            return this.f10844w;
        }
        return n();
    }

    public boolean a(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j11 = j10;
        int i11 = i10;
        ByteBuffer byteBuffer3 = this.K;
        a1.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f10838q != null) {
            if (!l()) {
                return false;
            }
            if (!this.f10838q.a(this.f10839r)) {
                v();
                if (g()) {
                    return false;
                }
                b();
            } else {
                this.f10839r = this.f10838q;
                this.f10838q = null;
                if (a(this.f10840s) && this.f10833l != 3) {
                    this.f10840s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f10840s;
                    d9 d9Var = this.f10839r.f10850a;
                    audioTrack.setOffloadDelayPadding(d9Var.C, d9Var.D);
                    this.Z = true;
                }
            }
            a(j11);
        }
        if (!t()) {
            try {
                s();
            } catch (q1.b e10) {
                q1.b bVar = e10;
                if (!bVar.f10792b) {
                    this.f10835n.a(bVar);
                    return false;
                }
                throw bVar;
            }
        }
        this.f10835n.a();
        if (this.F) {
            this.G = Math.max(0, j11);
            this.E = false;
            this.F = false;
            if (this.f10832k && yp.f13662a >= 23) {
                b(this.f10844w);
            }
            a(j11);
            if (this.S) {
                j();
            }
        }
        if (!this.f10830i.g(r())) {
            return false;
        }
        if (this.K == null) {
            a1.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f10839r;
            if (cVar.f10852c != 0 && this.D == 0) {
                int a10 = a(cVar.f10856g, byteBuffer2);
                this.D = a10;
                if (a10 == 0) {
                    return true;
                }
            }
            if (this.f10842u != null) {
                if (!l()) {
                    return false;
                }
                a(j11);
                this.f10842u = null;
            }
            long d10 = this.G + this.f10839r.d(q() - this.f10826e.j());
            if (!this.E && Math.abs(d10 - j11) > 200000) {
                this.f10837p.a((Exception) new q1.d(j11, d10));
                this.E = true;
            }
            if (this.E) {
                if (!l()) {
                    return false;
                }
                long j12 = j11 - d10;
                this.G += j12;
                this.E = false;
                a(j11);
                q1.c cVar2 = this.f10837p;
                if (!(cVar2 == null || j12 == 0)) {
                    cVar2.b();
                }
            }
            if (this.f10839r.f10852c == 0) {
                this.f10847z += (long) byteBuffer.remaining();
            } else {
                this.A += (long) (this.D * i11);
            }
            this.K = byteBuffer2;
            this.L = i11;
        }
        d(j11);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        } else if (!this.f10830i.f(r())) {
            return false;
        } else {
            kc.d("DefaultAudioSink", "Resetting stalled audio track");
            b();
            return true;
        }
    }

    public void a(k1 k1Var) {
        if (!this.f10841t.equals(k1Var)) {
            this.f10841t = k1Var;
            if (!this.W) {
                b();
            }
        }
    }

    private void a(mh mhVar, boolean z10) {
        f o10 = o();
        if (!mhVar.equals(o10.f10862a) || z10 != o10.f10863b) {
            f fVar = new f(mhVar, z10, -9223372036854775807L, -9223372036854775807L, (a) null);
            if (t()) {
                this.f10842u = fVar;
            } else {
                this.f10843v = fVar;
            }
        }
    }

    public void a(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.T = i10 != 0;
            b();
        }
    }

    public void a(u1 u1Var) {
        if (!this.V.equals(u1Var)) {
            int i10 = u1Var.f12479a;
            float f10 = u1Var.f12480b;
            AudioTrack audioTrack = this.f10840s;
            if (audioTrack != null) {
                if (this.V.f12479a != i10) {
                    audioTrack.attachAuxEffect(i10);
                }
                if (i10 != 0) {
                    this.f10840s.setAuxEffectSendLevel(f10);
                }
            }
            this.V = u1Var;
        }
    }

    public void a(q1.c cVar) {
        this.f10837p = cVar;
    }

    public void a(mh mhVar) {
        mh mhVar2 = new mh(yp.a(mhVar.f9804a, 0.1f, 8.0f), yp.a(mhVar.f9805b, 0.1f, 8.0f));
        if (!this.f10832k || yp.f13662a < 23) {
            a(mhVar2, p());
        } else {
            b(mhVar2);
        }
    }

    public void a(float f10) {
        if (this.H != f10) {
            this.H = f10;
            x();
        }
    }

    private static void a(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    public boolean a(d9 d9Var) {
        return b(d9Var) != 0;
    }

    private void a(ByteBuffer byteBuffer, long j10) {
        int i10;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.M;
            boolean z10 = true;
            if (byteBuffer2 != null) {
                a1.a(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (yp.f13662a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < remaining) {
                        this.N = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.N, 0, remaining);
                    byteBuffer.position(position);
                    this.O = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (yp.f13662a < 21) {
                int b10 = this.f10830i.b(this.B);
                if (b10 > 0) {
                    i10 = this.f10840s.write(this.N, this.O, Math.min(remaining2, b10));
                    if (i10 > 0) {
                        this.O += i10;
                        byteBuffer.position(byteBuffer.position() + i10);
                    }
                } else {
                    i10 = 0;
                }
            } else if (this.W) {
                a1.b(j10 != -9223372036854775807L);
                i10 = a(this.f10840s, byteBuffer, remaining2, j10);
            } else {
                i10 = a(this.f10840s, byteBuffer, remaining2);
            }
            this.X = SystemClock.elapsedRealtime();
            if (i10 < 0) {
                boolean e10 = e(i10);
                if (e10) {
                    u();
                }
                q1.e eVar = new q1.e(i10, this.f10839r.f10850a, e10);
                q1.c cVar = this.f10837p;
                if (cVar != null) {
                    cVar.a((Exception) eVar);
                }
                if (!eVar.f10797b) {
                    this.f10836o.a(eVar);
                    return;
                }
                throw eVar;
            }
            this.f10836o.a();
            if (a(this.f10840s)) {
                long j11 = this.C;
                if (j11 > 0) {
                    this.Z = false;
                }
                if (this.S && this.f10837p != null && i10 < remaining2 && !this.Z) {
                    this.f10837p.b(this.f10830i.c(j11));
                }
            }
            int i11 = this.f10839r.f10852c;
            if (i11 == 0) {
                this.B += (long) i10;
            }
            if (i10 == remaining2) {
                if (i11 != 0) {
                    if (byteBuffer != this.K) {
                        z10 = false;
                    }
                    a1.b(z10);
                    this.C += (long) (this.D * this.L);
                }
                this.M = null;
            }
        }
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private static int a(int i10, int i11) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(yp.a(i12)).build(), build)) {
                return i12;
            }
        }
        return 0;
    }

    private boolean a(d9 d9Var, k1 k1Var) {
        int b10;
        int a10;
        int a11;
        if (yp.f13662a < 29 || this.f10833l == 0 || (b10 = df.b((String) a1.a((Object) d9Var.f7153m), d9Var.f7150j)) == 0 || (a10 = yp.a(d9Var.f7166z)) == 0 || (a11 = a(b(d9Var.A, a10, b10), k1Var.a())) == 0) {
            return false;
        }
        if (a11 == 1) {
            boolean z10 = (d9Var.C == 0 && d9Var.D == 0) ? false : true;
            boolean z11 = this.f10833l == 1;
            if (!z10 || !z11) {
                return true;
            }
            return false;
        } else if (a11 == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = yp.f13662a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        return (i10 != 30 || !yp.f13665d.startsWith("Pixel")) ? 1 : 2;
    }

    private static boolean a(AudioTrack audioTrack) {
        return yp.f13662a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (yp.f13662a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f10845x == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f10845x = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f10845x.putInt(1431633921);
        }
        if (this.f10846y == 0) {
            this.f10845x.putInt(4, i10);
            this.f10845x.putLong(8, j10 * 1000);
            this.f10845x.position(0);
            this.f10846y = i10;
        }
        int remaining = this.f10845x.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f10845x, remaining, 1);
            if (write < 0) {
                this.f10846y = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int a10 = a(audioTrack, byteBuffer, i10);
        if (a10 < 0) {
            this.f10846y = 0;
            return a10;
        }
        this.f10846y -= a10;
        return a10;
    }
}
