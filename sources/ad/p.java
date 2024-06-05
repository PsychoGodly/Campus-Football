package ad;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import io.flutter.view.f;
import j4.t;
import j4.u;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l4.z;
import lc.d;
import n2.c3;
import n2.c4;
import n2.e2;
import n2.f3;
import n2.g3;
import n2.h4;
import n2.i3;
import n2.o;
import n2.r1;
import n2.s;
import n2.z1;
import p2.e;

/* compiled from: VideoPlayer */
final class p {

    /* renamed from: a  reason: collision with root package name */
    private s f31573a;

    /* renamed from: b  reason: collision with root package name */
    private Surface f31574b;

    /* renamed from: c  reason: collision with root package name */
    private final f.c f31575c;

    /* renamed from: d  reason: collision with root package name */
    private o f31576d;

    /* renamed from: e  reason: collision with root package name */
    private final d f31577e;

    /* renamed from: f  reason: collision with root package name */
    boolean f31578f = false;

    /* renamed from: g  reason: collision with root package name */
    private final q f31579g;

    /* renamed from: h  reason: collision with root package name */
    private u.b f31580h = new u.b();

    /* compiled from: VideoPlayer */
    class a implements d.C0413d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f31581a;

        a(o oVar) {
            this.f31581a = oVar;
        }

        public void g(Object obj) {
            this.f31581a.d((d.b) null);
        }

        public void h(Object obj, d.b bVar) {
            this.f31581a.d(bVar);
        }
    }

    /* compiled from: VideoPlayer */
    class b implements g3.d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f31583a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f31584b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s f31585c;

        b(o oVar, s sVar) {
            this.f31584b = oVar;
            this.f31585c = sVar;
        }

        public /* synthetic */ void A(g3.e eVar, g3.e eVar2, int i10) {
            i3.t(this, eVar, eVar2, i10);
        }

        public /* synthetic */ void B(boolean z10) {
            i3.j(this, z10);
        }

        public /* synthetic */ void C(int i10) {
            i3.s(this, i10);
        }

        public /* synthetic */ void D(e2 e2Var) {
            i3.l(this, e2Var);
        }

        public void E(boolean z10) {
            if (this.f31583a != z10) {
                this.f31583a = z10;
                HashMap hashMap = new HashMap();
                hashMap.put("event", this.f31583a ? "bufferingStart" : "bufferingEnd");
                this.f31584b.success(hashMap);
            }
        }

        public /* synthetic */ void G(o oVar) {
            i3.e(this, oVar);
        }

        public /* synthetic */ void H(boolean z10) {
            i3.h(this, z10);
        }

        public /* synthetic */ void I() {
            i3.w(this);
        }

        public /* synthetic */ void J(h4 h4Var) {
            i3.B(this, h4Var);
        }

        public /* synthetic */ void K(c4 c4Var, int i10) {
            i3.A(this, c4Var, i10);
        }

        public /* synthetic */ void L(float f10) {
            i3.D(this, f10);
        }

        public void M(int i10) {
            if (i10 == 2) {
                E(true);
                p.this.h();
            } else if (i10 == 3) {
                p pVar = p.this;
                if (!pVar.f31578f) {
                    pVar.f31578f = true;
                    pVar.i();
                }
            } else if (i10 == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "completed");
                this.f31584b.success(hashMap);
            }
            if (i10 != 2) {
                E(false);
            }
        }

        public /* synthetic */ void N(g3.b bVar) {
            i3.b(this, bVar);
        }

        public /* synthetic */ void R(boolean z10) {
            i3.x(this, z10);
        }

        public /* synthetic */ void W(int i10, boolean z10) {
            i3.f(this, i10, z10);
        }

        public /* synthetic */ void X(boolean z10, int i10) {
            i3.r(this, z10, i10);
        }

        public /* synthetic */ void Y(z1 z1Var, int i10) {
            i3.k(this, z1Var, i10);
        }

        public /* synthetic */ void a(boolean z10) {
            i3.y(this, z10);
        }

        public /* synthetic */ void b0() {
            i3.u(this);
        }

        public /* synthetic */ void c0(e eVar) {
            i3.a(this, eVar);
        }

        public /* synthetic */ void d(f3 f3Var) {
            i3.o(this, f3Var);
        }

        public /* synthetic */ void d0(boolean z10, int i10) {
            i3.n(this, z10, i10);
        }

        public /* synthetic */ void f0(g3 g3Var, g3.c cVar) {
            i3.g(this, g3Var, cVar);
        }

        public /* synthetic */ void h0(int i10, int i11) {
            i3.z(this, i10, i11);
        }

        public void j0(c3 c3Var) {
            E(false);
            if (c3Var.f20203a == 1002) {
                this.f31585c.q();
                this.f31585c.a();
                return;
            }
            o oVar = this.f31584b;
            if (oVar != null) {
                oVar.error("VideoError", "Video player had error " + c3Var, (Object) null);
            }
        }

        public /* synthetic */ void l0(c3 c3Var) {
            i3.q(this, c3Var);
        }

        public /* synthetic */ void n(f3.a aVar) {
            i3.m(this, aVar);
        }

        public /* synthetic */ void p(int i10) {
            i3.v(this, i10);
        }

        public void p0(boolean z10) {
            if (this.f31584b != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "isPlayingStateUpdate");
                hashMap.put("isPlaying", Boolean.valueOf(z10));
                this.f31584b.success(hashMap);
            }
        }

        public /* synthetic */ void q(List list) {
            i3.c(this, list);
        }

        public /* synthetic */ void s(z zVar) {
            i3.C(this, zVar);
        }

        public /* synthetic */ void u(y3.e eVar) {
            i3.d(this, eVar);
        }

        public /* synthetic */ void z(int i10) {
            i3.p(this, i10);
        }
    }

    p(Context context, d dVar, f.c cVar, String str, String str2, Map<String, String> map, q qVar) {
        this.f31577e = dVar;
        this.f31575c = cVar;
        this.f31579g = qVar;
        s g10 = new s.b(context).g();
        Uri parse = Uri.parse(str);
        a(map);
        g10.o(b(parse, new t.a(context, this.f31580h), str2));
        g10.a();
        m(g10, new o());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p3.x b(android.net.Uri r7, j4.l.a r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 4
            r1 = 0
            r2 = -1
            r3 = 2
            r4 = 1
            if (r9 != 0) goto L_0x000c
            int r1 = k4.n0.n0(r7)
            goto L_0x004a
        L_0x000c:
            int r5 = r9.hashCode()
            switch(r5) {
                case 3680: goto L_0x0036;
                case 103407: goto L_0x002b;
                case 3075986: goto L_0x0020;
                case 106069776: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            r9 = -1
            goto L_0x0040
        L_0x0015:
            java.lang.String r5 = "other"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x001e
            goto L_0x0013
        L_0x001e:
            r9 = 3
            goto L_0x0040
        L_0x0020:
            java.lang.String r5 = "dash"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x0029
            goto L_0x0013
        L_0x0029:
            r9 = 2
            goto L_0x0040
        L_0x002b:
            java.lang.String r5 = "hls"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r9 = 1
            goto L_0x0040
        L_0x0036:
            java.lang.String r5 = "ss"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x003f
            goto L_0x0013
        L_0x003f:
            r9 = 0
        L_0x0040:
            switch(r9) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0047;
                case 2: goto L_0x004a;
                case 3: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            r1 = -1
            goto L_0x004a
        L_0x0045:
            r1 = 4
            goto L_0x004a
        L_0x0047:
            r1 = 2
            goto L_0x004a
        L_0x0049:
            r1 = 1
        L_0x004a:
            if (r1 == 0) goto L_0x0098
            if (r1 == r4) goto L_0x0085
            if (r1 == r3) goto L_0x0077
            if (r1 != r0) goto L_0x0060
            p3.l0$b r9 = new p3.l0$b
            r9.<init>(r8)
            n2.z1 r7 = n2.z1.d(r7)
            p3.l0 r7 = r9.b(r7)
            return r7
        L_0x0060:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unsupported type: "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0077:
            com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r9 = new com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
            r9.<init>((j4.l.a) r8)
            n2.z1 r7 = n2.z1.d(r7)
            com.google.android.exoplayer2.source.hls.HlsMediaSource r7 = r9.a(r7)
            return r7
        L_0x0085:
            com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory r9 = new com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory
            com.google.android.exoplayer2.source.smoothstreaming.a$a r0 = new com.google.android.exoplayer2.source.smoothstreaming.a$a
            r0.<init>(r8)
            r9.<init>(r0, r8)
            n2.z1 r7 = n2.z1.d(r7)
            com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource r7 = r9.a(r7)
            return r7
        L_0x0098:
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r9 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            com.google.android.exoplayer2.source.dash.c$a r0 = new com.google.android.exoplayer2.source.dash.c$a
            r0.<init>(r8)
            r9.<init>(r0, r8)
            n2.z1 r7 = n2.z1.d(r7)
            com.google.android.exoplayer2.source.dash.DashMediaSource r7 = r9.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.p.b(android.net.Uri, j4.l$a, java.lang.String):p3.x");
    }

    private static void j(s sVar, boolean z10) {
        sVar.L(new e.C0223e().c(3).a(), !z10);
    }

    private void m(s sVar, o oVar) {
        this.f31573a = sVar;
        this.f31576d = oVar;
        this.f31577e.d(new a(oVar));
        Surface surface = new Surface(this.f31575c.b());
        this.f31574b = surface;
        sVar.h(surface);
        j(sVar, this.f31579g.f31587a);
        sVar.u(new b(oVar, sVar));
    }

    public void a(Map<String, String> map) {
        boolean z10 = !map.isEmpty();
        this.f31580h.e((!z10 || !map.containsKey("User-Agent")) ? "ExoPlayer" : map.get("User-Agent")).c(true);
        if (z10) {
            this.f31580h.d(map);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f31578f) {
            this.f31573a.stop();
        }
        this.f31575c.release();
        this.f31577e.d((d.C0413d) null);
        Surface surface = this.f31574b;
        if (surface != null) {
            surface.release();
        }
        s sVar = this.f31573a;
        if (sVar != null) {
            sVar.release();
        }
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f31573a.getCurrentPosition();
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f31573a.w(false);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f31573a.w(true);
    }

    /* access modifiers changed from: package-private */
    public void g(int i10) {
        this.f31573a.f((long) i10);
    }

    /* access modifiers changed from: package-private */
    public void h() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(new Number[]{0, Long.valueOf(this.f31573a.y())})));
        this.f31576d.success(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.f31578f) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "initialized");
            hashMap.put("duration", Long.valueOf(this.f31573a.getDuration()));
            if (this.f31573a.B() != null) {
                r1 B = this.f31573a.B();
                int i10 = B.f20659r;
                int i11 = B.f20660s;
                int i12 = B.f20662u;
                if (i12 == 90 || i12 == 270) {
                    i10 = this.f31573a.B().f20660s;
                    i11 = this.f31573a.B().f20659r;
                }
                hashMap.put("width", Integer.valueOf(i10));
                hashMap.put("height", Integer.valueOf(i11));
                if (i12 == 180) {
                    hashMap.put("rotationCorrection", Integer.valueOf(i12));
                }
            }
            this.f31576d.success(hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(boolean z10) {
        this.f31573a.d(z10 ? 2 : 0);
    }

    /* access modifiers changed from: package-private */
    public void l(double d10) {
        this.f31573a.c(new f3((float) d10));
    }

    /* access modifiers changed from: package-private */
    public void n(double d10) {
        this.f31573a.setVolume((float) Math.max(0.0d, Math.min(1.0d, d10)));
    }
}
