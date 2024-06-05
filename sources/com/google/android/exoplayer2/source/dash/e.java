package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import j4.i;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k4.a0;
import k4.n0;
import n2.r1;
import n2.s1;
import n2.y2;
import p3.p0;
import r3.f;
import s2.d0;
import s2.e0;

/* compiled from: PlayerEmsgHandler */
public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final j4.b f14305a;

    /* renamed from: b  reason: collision with root package name */
    private final b f14306b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h3.b f14307c = new h3.b();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Handler f14308d = n0.x(this);

    /* renamed from: f  reason: collision with root package name */
    private final TreeMap<Long, Long> f14309f = new TreeMap<>();

    /* renamed from: g  reason: collision with root package name */
    private t3.c f14310g;

    /* renamed from: h  reason: collision with root package name */
    private long f14311h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14312i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14313j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14314k;

    /* compiled from: PlayerEmsgHandler */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f14315a;

        /* renamed from: b  reason: collision with root package name */
        public final long f14316b;

        public a(long j10, long j11) {
            this.f14315a = j10;
            this.f14316b = j11;
        }
    }

    /* compiled from: PlayerEmsgHandler */
    public interface b {
        void a();

        void b(long j10);
    }

    /* compiled from: PlayerEmsgHandler */
    public final class c implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private final p0 f14317a;

        /* renamed from: b  reason: collision with root package name */
        private final s1 f14318b = new s1();

        /* renamed from: c  reason: collision with root package name */
        private final f3.e f14319c = new f3.e();

        /* renamed from: d  reason: collision with root package name */
        private long f14320d = -9223372036854775807L;

        c(j4.b bVar) {
            this.f14317a = p0.l(bVar);
        }

        private f3.e g() {
            this.f14319c.g();
            if (this.f14317a.S(this.f14318b, this.f14319c, 0, false) != -4) {
                return null;
            }
            this.f14319c.s();
            return this.f14319c;
        }

        private void k(long j10, long j11) {
            e.this.f14308d.sendMessage(e.this.f14308d.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f14317a.K(false)) {
                f3.e g10 = g();
                if (g10 != null) {
                    long j10 = g10.f21757f;
                    f3.a a10 = e.this.f14307c.a(g10);
                    if (a10 != null) {
                        h3.a aVar = (h3.a) a10.d(0);
                        if (e.h(aVar.f18736a, aVar.f18737b)) {
                            m(j10, aVar);
                        }
                    }
                }
            }
            this.f14317a.s();
        }

        private void m(long j10, h3.a aVar) {
            long c10 = e.f(aVar);
            if (c10 != -9223372036854775807L) {
                k(j10, c10);
            }
        }

        public void a(r1 r1Var) {
            this.f14317a.a(r1Var);
        }

        public void b(long j10, int i10, int i11, int i12, e0.a aVar) {
            this.f14317a.b(j10, i10, i11, i12, aVar);
            l();
        }

        public int c(i iVar, int i10, boolean z10, int i11) throws IOException {
            return this.f14317a.e(iVar, i10, z10);
        }

        public /* synthetic */ void d(a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        public /* synthetic */ int e(i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }

        public void f(a0 a0Var, int i10, int i11) {
            this.f14317a.d(a0Var, i10);
        }

        public boolean h(long j10) {
            return e.this.j(j10);
        }

        public void i(f fVar) {
            long j10 = this.f14320d;
            if (j10 == -9223372036854775807L || fVar.f22134h > j10) {
                this.f14320d = fVar.f22134h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j10 = this.f14320d;
            return e.this.n(j10 != -9223372036854775807L && j10 < fVar.f22133g);
        }

        public void n() {
            this.f14317a.T();
        }
    }

    public e(t3.c cVar, b bVar, j4.b bVar2) {
        this.f14310g = cVar;
        this.f14306b = bVar;
        this.f14305a = bVar2;
    }

    private Map.Entry<Long, Long> e(long j10) {
        return this.f14309f.ceilingEntry(Long.valueOf(j10));
    }

    /* access modifiers changed from: private */
    public static long f(h3.a aVar) {
        try {
            return n0.J0(n0.D(aVar.f18740f));
        } catch (y2 unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = this.f14309f.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f14309f.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f14309f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str2) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f14312i) {
            this.f14313j = true;
            this.f14312i = false;
            this.f14306b.a();
        }
    }

    private void l() {
        this.f14306b.b(this.f14311h);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f14309f.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) it.next().getKey()).longValue() < this.f14310g.f22593h) {
                it.remove();
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f14314k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f14315a, aVar.f14316b);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j(long j10) {
        t3.c cVar = this.f14310g;
        boolean z10 = false;
        if (!cVar.f22589d) {
            return false;
        }
        if (this.f14313j) {
            return true;
        }
        Map.Entry<Long, Long> e10 = e(cVar.f22593h);
        if (e10 != null && e10.getValue().longValue() < j10) {
            this.f14311h = e10.getKey().longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f14305a);
    }

    /* access modifiers changed from: package-private */
    public void m(f fVar) {
        this.f14312i = true;
    }

    /* access modifiers changed from: package-private */
    public boolean n(boolean z10) {
        if (!this.f14310g.f22589d) {
            return false;
        }
        if (this.f14313j) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f14314k = true;
        this.f14308d.removeCallbacksAndMessages((Object) null);
    }

    public void q(t3.c cVar) {
        this.f14313j = false;
        this.f14311h = -9223372036854775807L;
        this.f14310g = cVar;
        p();
    }
}
