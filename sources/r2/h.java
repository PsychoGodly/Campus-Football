package r2;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import j4.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k4.n0;
import k4.r;
import k4.v;
import n2.i;
import n2.r1;
import o2.u1;
import r2.g;
import r2.g0;
import r2.m;
import r2.o;
import r2.w;
import r2.y;
import s6.d1;
import s6.u;
import s6.y0;

/* compiled from: DefaultDrmSessionManager */
public class h implements y {

    /* renamed from: c  reason: collision with root package name */
    private final UUID f22019c;

    /* renamed from: d  reason: collision with root package name */
    private final g0.c f22020d;

    /* renamed from: e  reason: collision with root package name */
    private final n0 f22021e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, String> f22022f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f22023g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f22024h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f22025i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final g f22026j;

    /* renamed from: k  reason: collision with root package name */
    private final j4.g0 f22027k;

    /* renamed from: l  reason: collision with root package name */
    private final C0228h f22028l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final long f22029m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final List<g> f22030n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Set<f> f22031o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Set<g> f22032p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f22033q;

    /* renamed from: r  reason: collision with root package name */
    private g0 f22034r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public g f22035s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public g f22036t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Looper f22037u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public Handler f22038v;

    /* renamed from: w  reason: collision with root package name */
    private int f22039w;

    /* renamed from: x  reason: collision with root package name */
    private byte[] f22040x;

    /* renamed from: y  reason: collision with root package name */
    private u1 f22041y;

    /* renamed from: z  reason: collision with root package name */
    volatile d f22042z;

    /* compiled from: DefaultDrmSessionManager */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f22043a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private UUID f22044b = i.f20439d;

        /* renamed from: c  reason: collision with root package name */
        private g0.c f22045c = k0.f22064d;

        /* renamed from: d  reason: collision with root package name */
        private boolean f22046d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f22047e = new int[0];

        /* renamed from: f  reason: collision with root package name */
        private boolean f22048f;

        /* renamed from: g  reason: collision with root package name */
        private j4.g0 f22049g = new x();

        /* renamed from: h  reason: collision with root package name */
        private long f22050h = 300000;

        public h a(n0 n0Var) {
            return new h(this.f22044b, this.f22045c, n0Var, this.f22043a, this.f22046d, this.f22047e, this.f22048f, this.f22049g, this.f22050h);
        }

        public b b(boolean z10) {
            this.f22046d = z10;
            return this;
        }

        public b c(boolean z10) {
            this.f22048f = z10;
            return this;
        }

        public b d(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (!(i10 == 2 || i10 == 1)) {
                    z10 = false;
                }
                k4.a.a(z10);
            }
            this.f22047e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, g0.c cVar) {
            this.f22044b = (UUID) k4.a.e(uuid);
            this.f22045c = (g0.c) k4.a.e(cVar);
            return this;
        }
    }

    /* compiled from: DefaultDrmSessionManager */
    private class c implements g0.b {
        private c() {
        }

        public void a(g0 g0Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) k4.a.e(h.this.f22042z)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* compiled from: DefaultDrmSessionManager */
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (g gVar : h.this.f22030n) {
                    if (gVar.s(bArr)) {
                        gVar.A(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* compiled from: DefaultDrmSessionManager */
    private class f implements y.b {

        /* renamed from: b  reason: collision with root package name */
        private final w.a f22053b;

        /* renamed from: c  reason: collision with root package name */
        private o f22054c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f22055d;

        public f(w.a aVar) {
            this.f22053b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(r1 r1Var) {
            if (h.this.f22033q != 0 && !this.f22055d) {
                h hVar = h.this;
                this.f22054c = hVar.t((Looper) k4.a.e(hVar.f22037u), this.f22053b, r1Var, false);
                h.this.f22031o.add(this);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e() {
            if (!this.f22055d) {
                o oVar = this.f22054c;
                if (oVar != null) {
                    oVar.e(this.f22053b);
                }
                h.this.f22031o.remove(this);
                this.f22055d = true;
            }
        }

        public void c(r1 r1Var) {
            ((Handler) k4.a.e(h.this.f22038v)).post(new j(this, r1Var));
        }

        public void release() {
            n0.L0((Handler) k4.a.e(h.this.f22038v), new i(this));
        }
    }

    /* compiled from: DefaultDrmSessionManager */
    private class g implements g.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<g> f22057a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private g f22058b;

        public g(h hVar) {
        }

        public void a(Exception exc, boolean z10) {
            this.f22058b = null;
            u<g> u10 = u.u(this.f22057a);
            this.f22057a.clear();
            d1<g> m10 = u10.iterator();
            while (m10.hasNext()) {
                m10.next().C(exc, z10);
            }
        }

        public void b(g gVar) {
            this.f22057a.add(gVar);
            if (this.f22058b == null) {
                this.f22058b = gVar;
                gVar.G();
            }
        }

        public void c() {
            this.f22058b = null;
            u<g> u10 = u.u(this.f22057a);
            this.f22057a.clear();
            d1<g> m10 = u10.iterator();
            while (m10.hasNext()) {
                m10.next().B();
            }
        }

        public void d(g gVar) {
            this.f22057a.remove(gVar);
            if (this.f22058b == gVar) {
                this.f22058b = null;
                if (!this.f22057a.isEmpty()) {
                    g next = this.f22057a.iterator().next();
                    this.f22058b = next;
                    next.G();
                }
            }
        }
    }

    /* renamed from: r2.h$h  reason: collision with other inner class name */
    /* compiled from: DefaultDrmSessionManager */
    private class C0228h implements g.b {
        private C0228h() {
        }

        public void a(g gVar, int i10) {
            if (h.this.f22029m != -9223372036854775807L) {
                h.this.f22032p.remove(gVar);
                ((Handler) k4.a.e(h.this.f22038v)).removeCallbacksAndMessages(gVar);
            }
        }

        public void b(g gVar, int i10) {
            if (i10 == 1 && h.this.f22033q > 0 && h.this.f22029m != -9223372036854775807L) {
                h.this.f22032p.add(gVar);
                ((Handler) k4.a.e(h.this.f22038v)).postAtTime(new k(gVar), gVar, SystemClock.uptimeMillis() + h.this.f22029m);
            } else if (i10 == 0) {
                h.this.f22030n.remove(gVar);
                if (h.this.f22035s == gVar) {
                    g unused = h.this.f22035s = null;
                }
                if (h.this.f22036t == gVar) {
                    g unused2 = h.this.f22036t = null;
                }
                h.this.f22026j.d(gVar);
                if (h.this.f22029m != -9223372036854775807L) {
                    ((Handler) k4.a.e(h.this.f22038v)).removeCallbacksAndMessages(gVar);
                    h.this.f22032p.remove(gVar);
                }
            }
            h.this.C();
        }
    }

    private o A(int i10, boolean z10) {
        g0 g0Var = (g0) k4.a.e(this.f22034r);
        if ((g0Var.m() == 2 && h0.f22060d) || n0.z0(this.f22024h, i10) == -1 || g0Var.m() == 1) {
            return null;
        }
        g gVar = this.f22035s;
        if (gVar == null) {
            g x10 = x(u.y(), true, (w.a) null, z10);
            this.f22030n.add(x10);
            this.f22035s = x10;
        } else {
            gVar.a((w.a) null);
        }
        return this.f22035s;
    }

    private void B(Looper looper) {
        if (this.f22042z == null) {
            this.f22042z = new d(looper);
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        if (this.f22034r != null && this.f22033q == 0 && this.f22030n.isEmpty() && this.f22031o.isEmpty()) {
            ((g0) k4.a.e(this.f22034r)).release();
            this.f22034r = null;
        }
    }

    private void D() {
        d1<g> m10 = s6.x.p(this.f22032p).iterator();
        while (m10.hasNext()) {
            m10.next().e((w.a) null);
        }
    }

    private void E() {
        d1<f> m10 = s6.x.p(this.f22031o).iterator();
        while (m10.hasNext()) {
            m10.next().release();
        }
    }

    private void G(o oVar, w.a aVar) {
        oVar.e(aVar);
        if (this.f22029m != -9223372036854775807L) {
            oVar.e((w.a) null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f22037u == null) {
            r.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
        } else if (Thread.currentThread() != ((Looper) k4.a.e(this.f22037u)).getThread()) {
            r.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f22037u.getThread().getName(), new IllegalStateException());
        }
    }

    /* access modifiers changed from: private */
    public o t(Looper looper, w.a aVar, r1 r1Var, boolean z10) {
        List<m.b> list;
        B(looper);
        m mVar = r1Var.f20657p;
        if (mVar == null) {
            return A(v.k(r1Var.f20654m), z10);
        }
        g gVar = null;
        if (this.f22040x == null) {
            list = y((m) k4.a.e(mVar), this.f22019c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f22019c);
                r.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new e0(new o.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f22023g) {
            Iterator<g> it = this.f22030n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g next = it.next();
                if (n0.c(next.f21981a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f22036t;
        }
        if (gVar == null) {
            gVar = x(list, false, aVar, z10);
            if (!this.f22023g) {
                this.f22036t = gVar;
            }
            this.f22030n.add(gVar);
        } else {
            gVar.a(aVar);
        }
        return gVar;
    }

    private static boolean u(o oVar) {
        if (oVar.getState() != 1 || (n0.f19738a >= 19 && !(((o.a) k4.a.e(oVar.getError())).getCause() instanceof ResourceBusyException))) {
            return false;
        }
        return true;
    }

    private boolean v(m mVar) {
        if (this.f22040x != null) {
            return true;
        }
        if (y(mVar, this.f22019c, true).isEmpty()) {
            if (mVar.f22080d != 1 || !mVar.e(0).d(i.f20437b)) {
                return false;
            }
            r.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f22019c);
        }
        String str = mVar.f22079c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (n0.f19738a >= 25) {
                return true;
            }
            return false;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    private g w(List<m.b> list, boolean z10, w.a aVar) {
        k4.a.e(this.f22034r);
        List<m.b> list2 = list;
        g gVar = new g(this.f22019c, this.f22034r, this.f22026j, this.f22028l, list2, this.f22039w, this.f22025i | z10, z10, this.f22040x, this.f22022f, this.f22021e, (Looper) k4.a.e(this.f22037u), this.f22027k, (u1) k4.a.e(this.f22041y));
        gVar.a(aVar);
        if (this.f22029m != -9223372036854775807L) {
            gVar.a((w.a) null);
        }
        return gVar;
    }

    private g x(List<m.b> list, boolean z10, w.a aVar, boolean z11) {
        g w10 = w(list, z10, aVar);
        if (u(w10) && !this.f22032p.isEmpty()) {
            D();
            G(w10, aVar);
            w10 = w(list, z10, aVar);
        }
        if (!u(w10) || !z11 || this.f22031o.isEmpty()) {
            return w10;
        }
        E();
        if (!this.f22032p.isEmpty()) {
            D();
        }
        G(w10, aVar);
        return w(list, z10, aVar);
    }

    private static List<m.b> y(m mVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(mVar.f22080d);
        for (int i10 = 0; i10 < mVar.f22080d; i10++) {
            m.b e10 = mVar.e(i10);
            if ((e10.d(uuid) || (i.f20438c.equals(uuid) && e10.d(i.f20437b))) && (e10.f22085f != null || z10)) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        Looper looper2 = this.f22037u;
        if (looper2 == null) {
            this.f22037u = looper;
            this.f22038v = new Handler(looper);
        } else {
            k4.a.f(looper2 == looper);
            k4.a.e(this.f22038v);
        }
    }

    public void F(int i10, byte[] bArr) {
        k4.a.f(this.f22030n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            k4.a.e(bArr);
        }
        this.f22039w = i10;
        this.f22040x = bArr;
    }

    public final void a() {
        H(true);
        int i10 = this.f22033q;
        this.f22033q = i10 + 1;
        if (i10 == 0) {
            if (this.f22034r == null) {
                g0 a10 = this.f22020d.a(this.f22019c);
                this.f22034r = a10;
                a10.d(new c());
            } else if (this.f22029m != -9223372036854775807L) {
                for (int i11 = 0; i11 < this.f22030n.size(); i11++) {
                    this.f22030n.get(i11).a((w.a) null);
                }
            }
        }
    }

    public int b(r1 r1Var) {
        H(false);
        int m10 = ((g0) k4.a.e(this.f22034r)).m();
        m mVar = r1Var.f20657p;
        if (mVar == null) {
            if (n0.z0(this.f22024h, v.k(r1Var.f20654m)) != -1) {
                return m10;
            }
            return 0;
        } else if (v(mVar)) {
            return m10;
        } else {
            return 1;
        }
    }

    public void c(Looper looper, u1 u1Var) {
        z(looper);
        this.f22041y = u1Var;
    }

    public y.b d(w.a aVar, r1 r1Var) {
        k4.a.f(this.f22033q > 0);
        k4.a.h(this.f22037u);
        f fVar = new f(aVar);
        fVar.c(r1Var);
        return fVar;
    }

    public o e(w.a aVar, r1 r1Var) {
        boolean z10 = false;
        H(false);
        if (this.f22033q > 0) {
            z10 = true;
        }
        k4.a.f(z10);
        k4.a.h(this.f22037u);
        return t(this.f22037u, aVar, r1Var, true);
    }

    public final void release() {
        H(true);
        int i10 = this.f22033q - 1;
        this.f22033q = i10;
        if (i10 == 0) {
            if (this.f22029m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f22030n);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((g) arrayList.get(i11)).e((w.a) null);
                }
            }
            E();
            C();
        }
    }

    private h(UUID uuid, g0.c cVar, n0 n0Var, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, j4.g0 g0Var, long j10) {
        k4.a.e(uuid);
        k4.a.b(!i.f20437b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f22019c = uuid;
        this.f22020d = cVar;
        this.f22021e = n0Var;
        this.f22022f = hashMap;
        this.f22023g = z10;
        this.f22024h = iArr;
        this.f22025i = z11;
        this.f22027k = g0Var;
        this.f22026j = new g(this);
        this.f22028l = new C0228h();
        this.f22039w = 0;
        this.f22030n = new ArrayList();
        this.f22031o = y0.h();
        this.f22032p = y0.h();
        this.f22029m = j10;
    }
}
