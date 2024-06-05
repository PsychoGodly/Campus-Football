package qf;

import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.k;
import pf.m;
import pf.p;
import pf.r;
import pf.s;
import sd.l;
import sd.w;

/* compiled from: WrappedPlayer.kt */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final m f37761a;

    /* renamed from: b  reason: collision with root package name */
    private final p f37762b;

    /* renamed from: c  reason: collision with root package name */
    private pf.a f37763c;

    /* renamed from: d  reason: collision with root package name */
    private final l f37764d;

    /* renamed from: e  reason: collision with root package name */
    private j f37765e;

    /* renamed from: f  reason: collision with root package name */
    private rf.b f37766f;

    /* renamed from: g  reason: collision with root package name */
    private float f37767g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f37768h;

    /* renamed from: i  reason: collision with root package name */
    private float f37769i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private s f37770j = s.RELEASE;

    /* renamed from: k  reason: collision with root package name */
    private r f37771k = r.MEDIA_PLAYER;

    /* renamed from: l  reason: collision with root package name */
    private boolean f37772l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f37773m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f37774n;

    /* renamed from: o  reason: collision with root package name */
    private int f37775o = -1;

    /* renamed from: p  reason: collision with root package name */
    private final c f37776p = new c(this);

    /* compiled from: WrappedPlayer.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37777a;

        static {
            int[] iArr = new int[r.values().length];
            iArr[r.MEDIA_PLAYER.ordinal()] = 1;
            iArr[r.LOW_LATENCY.ordinal()] = 2;
            f37777a = iArr;
        }
    }

    /* compiled from: WrappedPlayer.kt */
    /* synthetic */ class b extends k implements fe.a<w> {
        b(Object obj) {
            super(0, obj, o.class, "actuallyPlay", "actuallyPlay()V", 0);
        }

        public final void b() {
            ((o) this.receiver).b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return w.f38141a;
        }
    }

    public o(m mVar, p pVar, pf.a aVar, l lVar) {
        kotlin.jvm.internal.m.e(mVar, "ref");
        kotlin.jvm.internal.m.e(pVar, "eventHandler");
        kotlin.jvm.internal.m.e(aVar, "context");
        kotlin.jvm.internal.m.e(lVar, "soundPoolManager");
        this.f37761a = mVar;
        this.f37762b = pVar;
        this.f37763c = aVar;
        this.f37764d = lVar;
    }

    private final void P(j jVar, float f10, float f11) {
        jVar.d(Math.min(1.0f, 1.0f - f11) * f10, Math.min(1.0f, f11 + 1.0f) * f10);
    }

    /* access modifiers changed from: private */
    public final void b() {
        if (!this.f37774n && !this.f37772l) {
            j jVar = this.f37765e;
            this.f37774n = true;
            if (jVar == null) {
                t();
            } else if (this.f37773m) {
                jVar.start();
                this.f37761a.C();
            }
        }
    }

    private final void c(j jVar) {
        P(jVar, this.f37767g, this.f37768h);
        jVar.b(v());
        jVar.a();
    }

    private final j d() {
        int i10 = a.f37777a[this.f37771k.ordinal()];
        if (i10 == 1) {
            return new i(this);
        }
        if (i10 == 2) {
            return new m(this, this.f37764d);
        }
        throw new l();
    }

    private final j l() {
        j jVar = this.f37765e;
        if (this.f37772l || jVar == null) {
            j d10 = d();
            this.f37765e = d10;
            L(false);
            return d10;
        } else if (!this.f37773m) {
            return jVar;
        } else {
            jVar.reset();
            I(false);
            return jVar;
        }
    }

    private final void t() {
        j d10 = d();
        this.f37765e = d10;
        rf.b bVar = this.f37766f;
        if (bVar != null) {
            d10.f(bVar);
            c(d10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c A[Catch:{ all -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int w() {
        /*
            r3 = this;
            r0 = 0
            sd.o$a r1 = sd.o.f38128b     // Catch:{ all -> 0x0022 }
            qf.j r1 = r3.f37765e     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x0009
            r1 = r0
            goto L_0x000d
        L_0x0009:
            java.lang.Integer r1 = r1.getCurrentPosition()     // Catch:{ all -> 0x0022 }
        L_0x000d:
            if (r1 != 0) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            int r2 = r1.intValue()     // Catch:{ all -> 0x0022 }
            if (r2 != 0) goto L_0x0018
            r2 = 1
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            java.lang.Object r1 = sd.o.b(r1)     // Catch:{ all -> 0x0022 }
            goto L_0x002d
        L_0x0022:
            r1 = move-exception
            sd.o$a r2 = sd.o.f38128b
            java.lang.Object r1 = sd.p.a(r1)
            java.lang.Object r1 = sd.o.b(r1)
        L_0x002d:
            boolean r2 = sd.o.f(r1)
            if (r2 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = r1
        L_0x0035:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x003b
            r0 = -1
            goto L_0x003f
        L_0x003b:
            int r0 = r0.intValue()
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.o.w():int");
    }

    public final void A() {
        j jVar;
        boolean z10 = true;
        I(true);
        this.f37761a.u(this);
        if (this.f37774n) {
            j jVar2 = this.f37765e;
            if (jVar2 != null) {
                jVar2.start();
            }
            this.f37761a.C();
        }
        if (this.f37775o >= 0) {
            j jVar3 = this.f37765e;
            if (jVar3 == null || !jVar3.g()) {
                z10 = false;
            }
            if (!z10 && (jVar = this.f37765e) != null) {
                jVar.seekTo(this.f37775o);
            }
        }
    }

    public final void B() {
        this.f37761a.H(this);
    }

    public final void C() {
        j jVar;
        if (this.f37774n) {
            this.f37774n = false;
            if (this.f37773m && (jVar = this.f37765e) != null) {
                jVar.pause();
            }
        }
    }

    public final void D() {
        this.f37776p.g(new b(this));
    }

    public final void E() {
        j jVar;
        this.f37776p.f();
        if (!this.f37772l) {
            if (this.f37774n && (jVar = this.f37765e) != null) {
                jVar.stop();
            }
            N((rf.b) null);
            this.f37765e = null;
        }
    }

    public final void F(int i10) {
        if (this.f37773m) {
            j jVar = this.f37765e;
            boolean z10 = false;
            if (jVar != null && jVar.g()) {
                z10 = true;
            }
            if (!z10) {
                j jVar2 = this.f37765e;
                if (jVar2 != null) {
                    jVar2.seekTo(i10);
                }
                i10 = -1;
            }
        }
        this.f37775o = i10;
    }

    public final void G(float f10) {
        j jVar;
        if (!(this.f37768h == f10)) {
            this.f37768h = f10;
            if (!this.f37772l && (jVar = this.f37765e) != null) {
                P(jVar, this.f37767g, f10);
            }
        }
    }

    public final void H(r rVar) {
        kotlin.jvm.internal.m.e(rVar, "value");
        if (this.f37771k != rVar) {
            this.f37771k = rVar;
            j jVar = this.f37765e;
            if (jVar != null) {
                M(w());
                I(false);
                jVar.release();
            }
            t();
        }
    }

    public final void I(boolean z10) {
        if (this.f37773m != z10) {
            this.f37773m = z10;
            this.f37761a.F(this, z10);
        }
    }

    public final void J(float f10) {
        j jVar;
        if (!(this.f37769i == f10)) {
            this.f37769i = f10;
            if (this.f37774n && (jVar = this.f37765e) != null) {
                jVar.h(f10);
            }
        }
    }

    public final void K(s sVar) {
        j jVar;
        kotlin.jvm.internal.m.e(sVar, "value");
        if (this.f37770j != sVar) {
            this.f37770j = sVar;
            if (!this.f37772l && (jVar = this.f37765e) != null) {
                jVar.b(v());
            }
        }
    }

    public final void L(boolean z10) {
        this.f37772l = z10;
    }

    public final void M(int i10) {
        this.f37775o = i10;
    }

    public final void N(rf.b bVar) {
        if (!kotlin.jvm.internal.m.a(this.f37766f, bVar)) {
            if (bVar != null) {
                j l10 = l();
                l10.f(bVar);
                c(l10);
            } else {
                this.f37772l = true;
                I(false);
                this.f37774n = false;
                j jVar = this.f37765e;
                if (jVar != null) {
                    jVar.release();
                }
            }
            this.f37766f = bVar;
            return;
        }
        this.f37761a.F(this, true);
    }

    public final void O(float f10) {
        j jVar;
        if (!(this.f37767g == f10)) {
            this.f37767g = f10;
            if (!this.f37772l && (jVar = this.f37765e) != null) {
                P(jVar, f10, this.f37768h);
            }
        }
    }

    public final void Q() {
        this.f37776p.f();
        if (!this.f37772l) {
            if (this.f37770j != s.RELEASE) {
                C();
                if (this.f37773m) {
                    j jVar = this.f37765e;
                    boolean z10 = true;
                    if (jVar == null || !jVar.g()) {
                        z10 = false;
                    }
                    if (z10) {
                        j jVar2 = this.f37765e;
                        if (jVar2 != null) {
                            jVar2.stop();
                        }
                        I(false);
                        j jVar3 = this.f37765e;
                        if (jVar3 != null) {
                            jVar3.a();
                            return;
                        }
                        return;
                    }
                    F(0);
                    return;
                }
                return;
            }
            E();
        }
    }

    public final void R(pf.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "audioContext");
        if (!kotlin.jvm.internal.m.a(this.f37763c, aVar)) {
            if (this.f37763c.d() != 0 && aVar.d() == 0) {
                this.f37776p.f();
            }
            this.f37763c = pf.a.c(aVar, false, false, 0, 0, 0, 0, 63, (Object) null);
            g().setMode(this.f37763c.e());
            g().setSpeakerphoneOn(this.f37763c.h());
            j jVar = this.f37765e;
            if (jVar != null) {
                jVar.stop();
                I(false);
                jVar.e(h());
                rf.b p10 = p();
                if (p10 != null) {
                    jVar.f(p10);
                    c(jVar);
                }
            }
        }
    }

    public final void e() {
        E();
        this.f37762b.a();
    }

    public final Context f() {
        return this.f37761a.o();
    }

    public final AudioManager g() {
        return this.f37761a.p();
    }

    public final pf.a h() {
        return this.f37763c;
    }

    public final Integer i() {
        j jVar;
        if (!this.f37773m || (jVar = this.f37765e) == null) {
            return null;
        }
        return jVar.getCurrentPosition();
    }

    public final Integer j() {
        j jVar;
        if (!this.f37773m || (jVar = this.f37765e) == null) {
            return null;
        }
        return jVar.getDuration();
    }

    public final p k() {
        return this.f37762b;
    }

    public final boolean m() {
        return this.f37774n;
    }

    public final boolean n() {
        return this.f37773m;
    }

    public final float o() {
        return this.f37769i;
    }

    public final rf.b p() {
        return this.f37766f;
    }

    public final float q() {
        return this.f37767g;
    }

    public final void r(String str, String str2, Object obj) {
        this.f37761a.w(this, str, str2, obj);
    }

    public final void s(String str) {
        kotlin.jvm.internal.m.e(str, "message");
        this.f37761a.D(this, str);
    }

    public final boolean u() {
        if (this.f37774n && this.f37773m) {
            j jVar = this.f37765e;
            if (jVar != null && jVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return this.f37770j == s.LOOP;
    }

    public final void x(int i10) {
    }

    public final void y() {
        if (this.f37770j != s.LOOP) {
            Q();
        }
        this.f37761a.s(this);
    }

    public final boolean z(int i10, int i11) {
        String str;
        String str2;
        if (i10 == 100) {
            str = "MEDIA_ERROR_SERVER_DIED";
        } else {
            str = "MEDIA_ERROR_UNKNOWN {what:" + i10 + '}';
        }
        if (i11 == Integer.MIN_VALUE) {
            str2 = "MEDIA_ERROR_SYSTEM";
        } else if (i11 == -1010) {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        } else if (i11 == -1007) {
            str2 = "MEDIA_ERROR_MALFORMED";
        } else if (i11 == -1004) {
            str2 = "MEDIA_ERROR_IO";
        } else if (i11 != -110) {
            str2 = "MEDIA_ERROR_UNKNOWN {extra:" + i11 + '}';
        } else {
            str2 = "MEDIA_ERROR_TIMED_OUT";
        }
        if (this.f37773m || !kotlin.jvm.internal.m.a(str2, "MEDIA_ERROR_SYSTEM")) {
            I(false);
            r("AndroidAudioError", str, str2);
        } else {
            r("AndroidAudioError", "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md", str + ", " + str2);
        }
        return false;
    }
}
