package com.applovin.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.impl.c6;
import com.applovin.impl.fl;
import com.applovin.impl.l1;
import com.applovin.impl.n1;
import com.applovin.impl.nh;
import com.applovin.impl.oh;
import com.applovin.impl.ok;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

public class zj extends c2 {
    private int A;
    private int B;
    /* access modifiers changed from: private */
    public l5 C;
    /* access modifiers changed from: private */
    public l5 D;
    private int E;
    private k1 F;
    private float G;
    /* access modifiers changed from: private */
    public boolean H;
    /* access modifiers changed from: private */
    public List I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    /* access modifiers changed from: private */
    public p6 N;
    /* access modifiers changed from: private */
    public yq O;

    /* renamed from: b  reason: collision with root package name */
    protected final li[] f13883b;

    /* renamed from: c  reason: collision with root package name */
    private final a4 f13884c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f13885d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final a8 f13886e;

    /* renamed from: f  reason: collision with root package name */
    private final c f13887f;

    /* renamed from: g  reason: collision with root package name */
    private final d f13888g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArraySet f13889h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final r0 f13890i;

    /* renamed from: j  reason: collision with root package name */
    private final l1 f13891j;

    /* renamed from: k  reason: collision with root package name */
    private final n1 f13892k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final fl f13893l;

    /* renamed from: m  reason: collision with root package name */
    private final hr f13894m;

    /* renamed from: n  reason: collision with root package name */
    private final ds f13895n;

    /* renamed from: o  reason: collision with root package name */
    private final long f13896o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public d9 f13897p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public d9 f13898q;

    /* renamed from: r  reason: collision with root package name */
    private AudioTrack f13899r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public Object f13900s;

    /* renamed from: t  reason: collision with root package name */
    private Surface f13901t;

    /* renamed from: u  reason: collision with root package name */
    private SurfaceHolder f13902u;

    /* renamed from: v  reason: collision with root package name */
    private ok f13903v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f13904w;

    /* renamed from: x  reason: collision with root package name */
    private TextureView f13905x;

    /* renamed from: y  reason: collision with root package name */
    private int f13906y;

    /* renamed from: z  reason: collision with root package name */
    private int f13907z;

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Context f13908a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final oi f13909b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public j3 f13910c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f13911d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public wo f13912e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public yd f13913f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public gc f13914g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public x1 f13915h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public r0 f13916i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public Looper f13917j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public k1 f13918k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f13919l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public int f13920m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public boolean f13921n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public boolean f13922o;
        /* access modifiers changed from: private */

        /* renamed from: p  reason: collision with root package name */
        public int f13923p;
        /* access modifiers changed from: private */

        /* renamed from: q  reason: collision with root package name */
        public int f13924q;
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public boolean f13925r;
        /* access modifiers changed from: private */

        /* renamed from: s  reason: collision with root package name */
        public fj f13926s;
        /* access modifiers changed from: private */

        /* renamed from: t  reason: collision with root package name */
        public long f13927t;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public long f13928u;
        /* access modifiers changed from: private */

        /* renamed from: v  reason: collision with root package name */
        public fc f13929v;
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public long f13930w;
        /* access modifiers changed from: private */

        /* renamed from: x  reason: collision with root package name */
        public long f13931x;
        /* access modifiers changed from: private */

        /* renamed from: y  reason: collision with root package name */
        public boolean f13932y;

        /* renamed from: z  reason: collision with root package name */
        private boolean f13933z;

        public b(Context context) {
            this(context, new i6(context), new a6());
        }

        public b(Context context, oi oiVar, m8 m8Var) {
            this(context, oiVar, new k6(context), new g6(context, m8Var), new d6(), r5.a(context), new r0(j3.f8666a));
        }

        public zj a() {
            a1.b(!this.f13933z);
            this.f13933z = true;
            return new zj(this);
        }

        public b(Context context, oi oiVar, wo woVar, yd ydVar, gc gcVar, x1 x1Var, r0 r0Var) {
            this.f13908a = context;
            this.f13909b = oiVar;
            this.f13912e = woVar;
            this.f13913f = ydVar;
            this.f13914g = gcVar;
            this.f13915h = x1Var;
            this.f13916i = r0Var;
            this.f13917j = yp.d();
            this.f13918k = k1.f8851g;
            this.f13920m = 0;
            this.f13923p = 1;
            this.f13924q = 0;
            this.f13925r = true;
            this.f13926s = fj.f7806g;
            this.f13927t = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
            this.f13928u = 15000;
            this.f13929v = new c6.b().a();
            this.f13910c = j3.f8666a;
            this.f13930w = 500;
            this.f13931x = 2000;
        }
    }

    private final class c implements xq, p1, bo, af, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, ok.b, n1.b, l1.b, fl.b, nh.c, z7 {
        private c() {
        }

        public /* synthetic */ void a(int i10) {
            uz.a(this, i10);
        }

        public /* synthetic */ void a(d9 d9Var) {
            y70.a(this, d9Var);
        }

        public /* synthetic */ void a(go goVar, int i10) {
            uz.b(this, goVar, i10);
        }

        public /* synthetic */ void a(kh khVar) {
            uz.c(this, khVar);
        }

        public /* synthetic */ void a(mh mhVar) {
            uz.d(this, mhVar);
        }

        public /* synthetic */ void a(nh.b bVar) {
            uz.e(this, bVar);
        }

        public /* synthetic */ void a(nh.f fVar, nh.f fVar2, int i10) {
            uz.f(this, fVar, fVar2, i10);
        }

        public /* synthetic */ void a(nh nhVar, nh.d dVar) {
            uz.g(this, nhVar, dVar);
        }

        public /* synthetic */ void a(od odVar, int i10) {
            uz.h(this, odVar, i10);
        }

        public /* synthetic */ void a(qd qdVar) {
            uz.i(this, qdVar);
        }

        public /* synthetic */ void a(qo qoVar, uo uoVar) {
            uz.j(this, qoVar, uoVar);
        }

        public void a(String str, long j10, long j11) {
            zj.this.f13890i.a(str, j10, j11);
        }

        public /* synthetic */ void b() {
            uz.l(this);
        }

        public /* synthetic */ void b(d9 d9Var) {
            c10.a(this, d9Var);
        }

        public /* synthetic */ void b(kh khVar) {
            uz.m(this, khVar);
        }

        public void b(String str) {
            zj.this.f13890i.b(str);
        }

        public /* synthetic */ void b(boolean z10) {
            uz.n(this, z10);
        }

        public /* synthetic */ void b(boolean z10, int i10) {
            uz.o(this, z10, i10);
        }

        public void c() {
            zj.this.a(false, -1, 3);
        }

        public /* synthetic */ void c(int i10) {
            uz.p(this, i10);
        }

        public void d(int i10) {
            p6 a10 = zj.b(zj.this.f13893l);
            if (!a10.equals(zj.this.N)) {
                p6 unused = zj.this.N = a10;
                Iterator it = zj.this.f13889h.iterator();
                while (it.hasNext()) {
                    ((nh.e) it.next()).a(a10);
                }
            }
        }

        public /* synthetic */ void d(boolean z10) {
            uz.r(this, z10);
        }

        public /* synthetic */ void e(int i10) {
            uz.s(this, i10);
        }

        public /* synthetic */ void e(boolean z10) {
            uz.t(this, z10);
        }

        public void f(int i10) {
            boolean l10 = zj.this.l();
            zj.this.a(l10, i10, zj.b(l10, i10));
        }

        public /* synthetic */ void f(boolean z10) {
            b90.a(this, z10);
        }

        public void g(boolean z10) {
            zj.this.Y();
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            zj.this.a(surfaceTexture);
            zj.this.a(i10, i11);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            zj.this.a((Object) null);
            zj.this.a(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            zj.this.a(i10, i11);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            zj.this.a(i11, i12);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (zj.this.f13904w) {
                zj.this.a((Object) surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (zj.this.f13904w) {
                zj.this.a((Object) null);
            }
            zj.this.a(0, 0);
        }

        public void a(l5 l5Var) {
            l5 unused = zj.this.D = l5Var;
            zj.this.f13890i.a(l5Var);
        }

        public void b(d9 d9Var, o5 o5Var) {
            d9 unused = zj.this.f13898q = d9Var;
            zj.this.f13890i.b(d9Var, o5Var);
        }

        public void c(Exception exc) {
            zj.this.f13890i.c(exc);
        }

        public void c(l5 l5Var) {
            zj.this.f13890i.c(l5Var);
            d9 unused = zj.this.f13898q = null;
            l5 unused2 = zj.this.D = null;
        }

        public void a(long j10) {
            zj.this.f13890i.a(j10);
        }

        public void b(int i10, long j10, long j11) {
            zj.this.f13890i.b(i10, j10, j11);
        }

        public void a(Exception exc) {
            zj.this.f13890i.a(exc);
        }

        public void b(int i10) {
            zj.this.Y();
        }

        public void a(List list) {
            List unused = zj.this.I = list;
            Iterator it = zj.this.f13889h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(list);
            }
        }

        public void b(Exception exc) {
            zj.this.f13890i.b(exc);
        }

        public void c(boolean z10) {
            rh unused = zj.this.getClass();
        }

        public void d(l5 l5Var) {
            l5 unused = zj.this.C = l5Var;
            zj.this.f13890i.d(l5Var);
        }

        public void b(String str, long j10, long j11) {
            zj.this.f13890i.b(str, j10, j11);
        }

        public void b(l5 l5Var) {
            zj.this.f13890i.b(l5Var);
            d9 unused = zj.this.f13897p = null;
            l5 unused2 = zj.this.C = null;
        }

        public void a(int i10, long j10) {
            zj.this.f13890i.a(i10, j10);
        }

        public void a(we weVar) {
            zj.this.f13890i.a(weVar);
            zj.this.f13886e.a(weVar);
            Iterator it = zj.this.f13889h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(weVar);
            }
        }

        public void b(Surface surface) {
            zj.this.a((Object) surface);
        }

        public void b(float f10) {
            zj.this.X();
        }

        public void a(boolean z10, int i10) {
            zj.this.Y();
        }

        public void a(Object obj, long j10) {
            zj.this.f13890i.a(obj, j10);
            if (zj.this.f13900s == obj) {
                Iterator it = zj.this.f13889h.iterator();
                while (it.hasNext()) {
                    ((nh.e) it.next()).a();
                }
            }
        }

        public void a(boolean z10) {
            if (zj.this.H != z10) {
                boolean unused = zj.this.H = z10;
                zj.this.U();
            }
        }

        public void a(int i10, boolean z10) {
            Iterator it = zj.this.f13889h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).b(i10, z10);
            }
        }

        public void a(String str) {
            zj.this.f13890i.a(str);
        }

        public void a(long j10, int i10) {
            zj.this.f13890i.a(j10, i10);
        }

        public void a(d9 d9Var, o5 o5Var) {
            d9 unused = zj.this.f13897p = d9Var;
            zj.this.f13890i.a(d9Var, o5Var);
        }

        public void a(yq yqVar) {
            yq unused = zj.this.O = yqVar;
            zj.this.f13890i.a(yqVar);
            Iterator it = zj.this.f13889h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(yqVar);
            }
        }

        public void a(Surface surface) {
            zj.this.a((Object) null);
        }
    }

    protected zj(b bVar) {
        zj zjVar;
        a4 a4Var = new a4();
        this.f13884c = a4Var;
        try {
            Context applicationContext = bVar.f13908a.getApplicationContext();
            this.f13885d = applicationContext;
            r0 b10 = bVar.f13916i;
            this.f13890i = b10;
            rh unused = bVar.getClass();
            this.F = bVar.f13918k;
            this.f13906y = bVar.f13923p;
            this.f13907z = bVar.f13924q;
            this.H = bVar.f13922o;
            this.f13896o = bVar.f13931x;
            c cVar = new c();
            this.f13887f = cVar;
            d dVar = new d();
            this.f13888g = dVar;
            this.f13889h = new CopyOnWriteArraySet();
            Handler handler = new Handler(bVar.f13917j);
            li[] a10 = bVar.f13909b.a(handler, cVar, cVar, cVar, cVar);
            this.f13883b = a10;
            this.G = 1.0f;
            if (yp.f13662a < 21) {
                this.E = d(0);
            } else {
                this.E = r2.a(applicationContext);
            }
            this.I = Collections.emptyList();
            this.J = true;
            a4 a4Var2 = a4Var;
            d dVar2 = dVar;
            Handler handler2 = handler;
            a8 a8Var = r1;
            c cVar2 = cVar;
            try {
                a8 a8Var2 = new a8(a10, bVar.f13912e, bVar.f13913f, bVar.f13914g, bVar.f13915h, b10, bVar.f13925r, bVar.f13926s, bVar.f13927t, bVar.f13928u, bVar.f13929v, bVar.f13930w, bVar.f13932y, bVar.f13910c, bVar.f13917j, this, new nh.b.a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                zjVar = this;
                try {
                    zjVar.f13886e = a8Var;
                    c cVar3 = cVar2;
                    a8Var.a((nh.c) cVar3);
                    a8Var.a((z7) cVar3);
                    if (bVar.f13911d > 0) {
                        a8Var.c(bVar.f13911d);
                    }
                    Handler handler3 = handler2;
                    l1 l1Var = new l1(bVar.f13908a, handler3, cVar3);
                    zjVar.f13891j = l1Var;
                    l1Var.a(bVar.f13921n);
                    n1 n1Var = new n1(bVar.f13908a, handler3, cVar3);
                    zjVar.f13892k = n1Var;
                    n1Var.b(bVar.f13919l ? zjVar.F : null);
                    fl flVar = new fl(bVar.f13908a, handler3, cVar3);
                    zjVar.f13893l = flVar;
                    flVar.a(yp.e(zjVar.F.f8855c));
                    hr hrVar = new hr(bVar.f13908a);
                    zjVar.f13894m = hrVar;
                    hrVar.a(bVar.f13920m != 0);
                    ds dsVar = new ds(bVar.f13908a);
                    zjVar.f13895n = dsVar;
                    dsVar.a(bVar.f13920m == 2);
                    zjVar.N = b(flVar);
                    zjVar.O = yq.f13677f;
                    zjVar.a(1, 10, (Object) Integer.valueOf(zjVar.E));
                    zjVar.a(2, 10, (Object) Integer.valueOf(zjVar.E));
                    zjVar.a(1, 3, (Object) zjVar.F);
                    zjVar.a(2, 4, (Object) Integer.valueOf(zjVar.f13906y));
                    zjVar.a(2, 5, (Object) Integer.valueOf(zjVar.f13907z));
                    zjVar.a(1, 9, (Object) Boolean.valueOf(zjVar.H));
                    d dVar3 = dVar2;
                    zjVar.a(2, 7, (Object) dVar3);
                    zjVar.a(6, 8, (Object) dVar3);
                    a4Var2.e();
                } catch (Throwable th) {
                    th = th;
                    zjVar.f13884c.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zjVar = this;
                zjVar.f13884c.e();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            zjVar = this;
            zjVar.f13884c.e();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void U() {
        this.f13890i.a(this.H);
        Iterator it = this.f13889h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(this.H);
        }
    }

    private void W() {
        if (this.f13903v != null) {
            this.f13886e.a((oh.b) this.f13888g).a(10000).a((Object) null).j();
            this.f13903v.b((ok.b) this.f13887f);
            this.f13903v = null;
        }
        TextureView textureView = this.f13905x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f13887f) {
                kc.d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f13905x.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f13905x = null;
        }
        SurfaceHolder surfaceHolder = this.f13902u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f13887f);
            this.f13902u = null;
        }
    }

    /* access modifiers changed from: private */
    public void X() {
        a(1, 2, (Object) Float.valueOf(this.G * this.f13892k.d()));
    }

    /* access modifiers changed from: private */
    public void Y() {
        int o10 = o();
        boolean z10 = true;
        if (o10 != 1) {
            if (o10 == 2 || o10 == 3) {
                boolean S = S();
                hr hrVar = this.f13894m;
                if (!l() || S) {
                    z10 = false;
                }
                hrVar.b(z10);
                this.f13895n.b(l());
                return;
            } else if (o10 != 4) {
                throw new IllegalStateException();
            }
        }
        this.f13894m.b(false);
        this.f13895n.b(false);
    }

    private void Z() {
        this.f13884c.b();
        if (Thread.currentThread() != p().getThread()) {
            String a10 = yp.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), p().getThread().getName());
            if (!this.J) {
                kc.c("SimpleExoPlayer", a10, this.K ? null : new IllegalStateException());
                this.K = true;
                return;
            }
            throw new IllegalStateException(a10);
        }
    }

    /* access modifiers changed from: private */
    public static int b(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    public uo A() {
        Z();
        return this.f13886e.A();
    }

    public qd C() {
        return this.f13886e.C();
    }

    public int E() {
        Z();
        return this.f13886e.E();
    }

    public long F() {
        Z();
        return this.f13886e.F();
    }

    public void R() {
        Z();
        W();
        a((Object) null);
        a(0, 0);
    }

    public boolean S() {
        Z();
        return this.f13886e.S();
    }

    /* renamed from: T */
    public y7 c() {
        Z();
        return this.f13886e.c();
    }

    public void V() {
        AudioTrack audioTrack;
        Z();
        if (yp.f13662a < 21 && (audioTrack = this.f13899r) != null) {
            audioTrack.release();
            this.f13899r = null;
        }
        this.f13891j.a(false);
        this.f13893l.c();
        this.f13894m.b(false);
        this.f13895n.b(false);
        this.f13892k.e();
        this.f13886e.W();
        this.f13890i.i();
        W();
        Surface surface = this.f13901t;
        if (surface != null) {
            surface.release();
            this.f13901t = null;
        }
        if (!this.L) {
            this.I = Collections.emptyList();
            this.M = true;
            return;
        }
        b8.a(a1.a((Object) null));
        throw null;
    }

    public long getCurrentPosition() {
        Z();
        return this.f13886e.getCurrentPosition();
    }

    public long getDuration() {
        Z();
        return this.f13886e.getDuration();
    }

    public int m() {
        Z();
        return this.f13886e.m();
    }

    public go n() {
        Z();
        return this.f13886e.n();
    }

    public int o() {
        Z();
        return this.f13886e.o();
    }

    public Looper p() {
        return this.f13886e.p();
    }

    public long q() {
        Z();
        return this.f13886e.q();
    }

    public boolean r() {
        Z();
        return this.f13886e.r();
    }

    public long s() {
        Z();
        return this.f13886e.s();
    }

    public int t() {
        Z();
        return this.f13886e.t();
    }

    public int v() {
        Z();
        return this.f13886e.v();
    }

    public List x() {
        Z();
        return this.I;
    }

    public yq z() {
        return this.O;
    }

    private int d(int i10) {
        AudioTrack audioTrack = this.f13899r;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i10)) {
            this.f13899r.release();
            this.f13899r = null;
        }
        if (this.f13899r == null) {
            this.f13899r = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f13899r.getAudioSessionId();
    }

    public long e() {
        Z();
        return this.f13886e.e();
    }

    public int f() {
        Z();
        return this.f13886e.f();
    }

    public long g() {
        Z();
        return this.f13886e.g();
    }

    public long h() {
        Z();
        return this.f13886e.h();
    }

    public nh.b i() {
        Z();
        return this.f13886e.i();
    }

    public int j() {
        Z();
        return this.f13886e.j();
    }

    public qo k() {
        Z();
        return this.f13886e.k();
    }

    public boolean l() {
        Z();
        return this.f13886e.l();
    }

    public void c(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            R();
            return;
        }
        W();
        this.f13904w = true;
        this.f13902u = surfaceHolder;
        surfaceHolder.addCallback(this.f13887f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            a((Object) null);
            a(0, 0);
            return;
        }
        a((Object) surface);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        a(surfaceFrame.width(), surfaceFrame.height());
    }

    public void b(nh.e eVar) {
        a1.a((Object) eVar);
        this.f13889h.add(eVar);
        a((nh.c) eVar);
    }

    private static final class d implements vq, t2, oh.b {

        /* renamed from: a  reason: collision with root package name */
        private vq f13935a;

        /* renamed from: b  reason: collision with root package name */
        private t2 f13936b;

        /* renamed from: c  reason: collision with root package name */
        private vq f13937c;

        /* renamed from: d  reason: collision with root package name */
        private t2 f13938d;

        private d() {
        }

        public void a(int i10, Object obj) {
            if (i10 == 7) {
                this.f13935a = (vq) obj;
            } else if (i10 == 8) {
                this.f13936b = (t2) obj;
            } else if (i10 == 10000) {
                ok okVar = (ok) obj;
                if (okVar == null) {
                    this.f13937c = null;
                    this.f13938d = null;
                    return;
                }
                this.f13937c = okVar.getVideoFrameMetadataListener();
                this.f13938d = okVar.getCameraMotionListener();
            }
        }

        public void a(long j10, float[] fArr) {
            t2 t2Var = this.f13938d;
            if (t2Var != null) {
                t2Var.a(j10, fArr);
            }
            t2 t2Var2 = this.f13936b;
            if (t2Var2 != null) {
                t2Var2.a(j10, fArr);
            }
        }

        public void a() {
            t2 t2Var = this.f13938d;
            if (t2Var != null) {
                t2Var.a();
            }
            t2 t2Var2 = this.f13936b;
            if (t2Var2 != null) {
                t2Var2.a();
            }
        }

        public void a(long j10, long j11, d9 d9Var, MediaFormat mediaFormat) {
            vq vqVar = this.f13937c;
            if (vqVar != null) {
                vqVar.a(j10, j11, d9Var, mediaFormat);
            }
            vq vqVar2 = this.f13935a;
            if (vqVar2 != null) {
                vqVar2.a(j10, j11, d9Var, mediaFormat);
            }
        }
    }

    public void b(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        Z();
        if (surfaceView == null) {
            surfaceHolder = null;
        } else {
            surfaceHolder = surfaceView.getHolder();
        }
        a(surfaceHolder);
    }

    public void b(TextureView textureView) {
        Z();
        if (textureView != null && textureView == this.f13905x) {
            R();
        }
    }

    public boolean d() {
        Z();
        return this.f13886e.d();
    }

    public void b() {
        Z();
        boolean l10 = l();
        int a10 = this.f13892k.a(l10, 2);
        a(l10, a10, b(l10, a10));
        this.f13886e.b();
    }

    public void a(nh.c cVar) {
        a1.a((Object) cVar);
        this.f13886e.a(cVar);
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder != null && surfaceHolder == this.f13902u) {
            R();
        }
    }

    public void b(nh.c cVar) {
        this.f13886e.e(cVar);
    }

    private void b(SurfaceHolder surfaceHolder) {
        this.f13904w = false;
        this.f13902u = surfaceHolder;
        surfaceHolder.addCallback(this.f13887f);
        Surface surface = this.f13902u.getSurface();
        if (surface == null || !surface.isValid()) {
            a(0, 0);
            return;
        }
        Rect surfaceFrame = this.f13902u.getSurfaceFrame();
        a(surfaceFrame.width(), surfaceFrame.height());
    }

    public mh a() {
        Z();
        return this.f13886e.a();
    }

    /* access modifiers changed from: private */
    public void a(int i10, int i11) {
        if (i10 != this.A || i11 != this.B) {
            this.A = i10;
            this.B = i11;
            this.f13890i.a(i10, i11);
            Iterator it = this.f13889h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(i10, i11);
            }
        }
    }

    public void a(nh.e eVar) {
        a1.a((Object) eVar);
        this.f13889h.remove(eVar);
        b((nh.c) eVar);
    }

    public void b(boolean z10) {
        Z();
        this.f13886e.b(z10);
    }

    /* access modifiers changed from: private */
    public static p6 b(fl flVar) {
        return new p6(0, flVar.b(), flVar.a());
    }

    public void a(int i10, long j10) {
        Z();
        this.f13890i.h();
        this.f13886e.a(i10, j10);
    }

    private void a(int i10, int i11, Object obj) {
        for (li liVar : this.f13883b) {
            if (liVar.e() == i10) {
                this.f13886e.a((oh.b) liVar).a(i11).a(obj).j();
            }
        }
    }

    public void a(wd wdVar) {
        Z();
        this.f13886e.a(wdVar);
    }

    public void a(boolean z10) {
        Z();
        int a10 = this.f13892k.a(z10, o());
        a(z10, a10, b(z10, a10));
    }

    public void a(int i10) {
        Z();
        this.f13886e.a(i10);
    }

    /* access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a((Object) surface);
        this.f13901t = surface;
    }

    /* access modifiers changed from: private */
    public void a(Object obj) {
        boolean z10;
        ArrayList<oh> arrayList = new ArrayList<>();
        li[] liVarArr = this.f13883b;
        int length = liVarArr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            li liVar = liVarArr[i10];
            if (liVar.e() == 2) {
                arrayList.add(this.f13886e.a((oh.b) liVar).a(1).a(obj).j());
            }
            i10++;
        }
        Object obj2 = this.f13900s;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                for (oh a10 : arrayList) {
                    a10.a(this.f13896o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f13900s;
            Surface surface = this.f13901t;
            if (obj3 == surface) {
                surface.release();
                this.f13901t = null;
            }
        }
        this.f13900s = obj;
        if (z10) {
            this.f13886e.a(false, y7.a((RuntimeException) new e8(3), 1003));
        }
    }

    public void a(SurfaceView surfaceView) {
        SurfaceHolder surfaceHolder;
        Z();
        if (surfaceView instanceof uq) {
            W();
            a((Object) surfaceView);
            b(surfaceView.getHolder());
        } else if (surfaceView instanceof ok) {
            W();
            this.f13903v = (ok) surfaceView;
            this.f13886e.a((oh.b) this.f13888g).a(10000).a((Object) this.f13903v).j();
            this.f13903v.a((ok.b) this.f13887f);
            a((Object) this.f13903v.getVideoSurface());
            b(surfaceView.getHolder());
        } else {
            if (surfaceView == null) {
                surfaceHolder = null;
            } else {
                surfaceHolder = surfaceView.getHolder();
            }
            c(surfaceHolder);
        }
    }

    public void a(TextureView textureView) {
        Z();
        if (textureView == null) {
            R();
            return;
        }
        W();
        this.f13905x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            kc.d("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f13887f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
            return;
        }
        a(surfaceTexture);
        a(textureView.getWidth(), textureView.getHeight());
    }

    public void a(float f10) {
        Z();
        float a10 = yp.a(f10, 0.0f, 1.0f);
        if (this.G != a10) {
            this.G = a10;
            X();
            this.f13890i.a(a10);
            Iterator it = this.f13889h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(a10);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        this.f13886e.a(z11, i12, i11);
    }
}
