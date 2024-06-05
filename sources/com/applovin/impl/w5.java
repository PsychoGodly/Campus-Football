package com.applovin.impl;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.impl.v5;
import com.applovin.impl.w6;
import com.applovin.impl.x6;
import com.applovin.impl.x7;
import com.applovin.impl.y6;
import com.applovin.impl.z6;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class w5 implements z6 {

    /* renamed from: c  reason: collision with root package name */
    private final UUID f12966c;

    /* renamed from: d  reason: collision with root package name */
    private final x7.c f12967d;

    /* renamed from: e  reason: collision with root package name */
    private final ld f12968e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap f12969f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f12970g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f12971h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f12972i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final g f12973j;

    /* renamed from: k  reason: collision with root package name */
    private final hc f12974k;

    /* renamed from: l  reason: collision with root package name */
    private final h f12975l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final long f12976m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final List f12977n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Set f12978o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Set f12979p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f12980q;

    /* renamed from: r  reason: collision with root package name */
    private x7 f12981r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public v5 f12982s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public v5 f12983t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Looper f12984u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public Handler f12985v;

    /* renamed from: w  reason: collision with root package name */
    private int f12986w;

    /* renamed from: x  reason: collision with root package name */
    private byte[] f12987x;

    /* renamed from: y  reason: collision with root package name */
    volatile d f12988y;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap f12989a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private UUID f12990b = r2.f11116d;

        /* renamed from: c  reason: collision with root package name */
        private x7.c f12991c = k9.f8930d;

        /* renamed from: d  reason: collision with root package name */
        private boolean f12992d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f12993e = new int[0];

        /* renamed from: f  reason: collision with root package name */
        private boolean f12994f;

        /* renamed from: g  reason: collision with root package name */
        private hc f12995g = new e6();

        /* renamed from: h  reason: collision with root package name */
        private long f12996h = 300000;

        public b a(boolean z10) {
            this.f12992d = z10;
            return this;
        }

        public b b(boolean z10) {
            this.f12994f = z10;
            return this;
        }

        public b a(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (!(i10 == 2 || i10 == 1)) {
                    z10 = false;
                }
                a1.a(z10);
            }
            this.f12993e = (int[]) iArr.clone();
            return this;
        }

        public b a(UUID uuid, x7.c cVar) {
            this.f12990b = (UUID) a1.a((Object) uuid);
            this.f12991c = (x7.c) a1.a((Object) cVar);
            return this;
        }

        public w5 a(ld ldVar) {
            return new w5(this.f12990b, this.f12991c, ldVar, this.f12989a, this.f12992d, this.f12993e, this.f12994f, this.f12995g, this.f12996h);
        }
    }

    private class c implements x7.b {
        private c() {
        }

        public void a(x7 x7Var, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) a1.a((Object) w5.this.f12988y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (v5 v5Var : w5.this.f12977n) {
                    if (v5Var.a(bArr)) {
                        v5Var.a(message.what);
                        return;
                    }
                }
            }
        }
    }

    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    private class h implements v5.b {
        private h() {
        }

        public void b(v5 v5Var, int i10) {
            if (i10 == 1 && w5.this.f12980q > 0 && w5.this.f12976m != -9223372036854775807L) {
                w5.this.f12979p.add(v5Var);
                ((Handler) a1.a((Object) w5.this.f12985v)).postAtTime(new c70(v5Var), v5Var, SystemClock.uptimeMillis() + w5.this.f12976m);
            } else if (i10 == 0) {
                w5.this.f12977n.remove(v5Var);
                if (w5.this.f12982s == v5Var) {
                    v5 unused = w5.this.f12982s = null;
                }
                if (w5.this.f12983t == v5Var) {
                    v5 unused2 = w5.this.f12983t = null;
                }
                w5.this.f12973j.b(v5Var);
                if (w5.this.f12976m != -9223372036854775807L) {
                    ((Handler) a1.a((Object) w5.this.f12985v)).removeCallbacksAndMessages(v5Var);
                    w5.this.f12979p.remove(v5Var);
                }
            }
            w5.this.c();
        }

        public void a(v5 v5Var, int i10) {
            if (w5.this.f12976m != -9223372036854775807L) {
                w5.this.f12979p.remove(v5Var);
                ((Handler) a1.a((Object) w5.this.f12985v)).removeCallbacksAndMessages(v5Var);
            }
        }
    }

    private w5(UUID uuid, x7.c cVar, ld ldVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, hc hcVar, long j10) {
        a1.a((Object) uuid);
        a1.a(!r2.f11114b.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f12966c = uuid;
        this.f12967d = cVar;
        this.f12968e = ldVar;
        this.f12969f = hashMap;
        this.f12970g = z10;
        this.f12971h = iArr;
        this.f12972i = z11;
        this.f12974k = hcVar;
        this.f12973j = new g();
        this.f12975l = new h();
        this.f12986w = 0;
        this.f12977n = new ArrayList();
        this.f12978o = nj.b();
        this.f12979p = nj.b();
        this.f12976m = j10;
    }

    private class f implements z6.b {

        /* renamed from: b  reason: collision with root package name */
        private final y6.a f12999b;

        /* renamed from: c  reason: collision with root package name */
        private x6 f13000c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13001d;

        public f(y6.a aVar) {
            this.f12999b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(d9 d9Var) {
            if (w5.this.f12980q != 0 && !this.f13001d) {
                w5 w5Var = w5.this;
                this.f13000c = w5Var.a((Looper) a1.a((Object) w5Var.f12984u), this.f12999b, d9Var, false);
                w5.this.f12978o.add(this);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (!this.f13001d) {
                x6 x6Var = this.f13000c;
                if (x6Var != null) {
                    x6Var.a(this.f12999b);
                }
                w5.this.f12978o.remove(this);
                this.f13001d = true;
            }
        }

        public void a(d9 d9Var) {
            ((Handler) a1.a((Object) w5.this.f12985v)).post(new b70(this, d9Var));
        }

        public void a() {
            yp.a((Handler) a1.a((Object) w5.this.f12985v), (Runnable) new a70(this));
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        if (this.f12981r != null && this.f12980q == 0 && this.f12977n.isEmpty() && this.f12978o.isEmpty()) {
            ((x7) a1.a((Object) this.f12981r)).a();
            this.f12981r = null;
        }
    }

    private void d() {
        qp it = eb.a((Collection) this.f12979p).iterator();
        while (it.hasNext()) {
            ((x6) it.next()).a((y6.a) null);
        }
    }

    private void e() {
        qp it = eb.a((Collection) this.f12978o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private void b(Looper looper) {
        if (this.f12988y == null) {
            this.f12988y = new d(looper);
        }
    }

    public x6 a(Looper looper, y6.a aVar, d9 d9Var) {
        a1.b(this.f12980q > 0);
        a(looper);
        return a(looper, aVar, d9Var, true);
    }

    public z6.b b(Looper looper, y6.a aVar, d9 d9Var) {
        a1.b(this.f12980q > 0);
        a(looper);
        f fVar = new f(aVar);
        fVar.a(d9Var);
        return fVar;
    }

    private class g implements v5.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set f13003a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private v5 f13004b;

        public g() {
        }

        public void a() {
            this.f13004b = null;
            ab a10 = ab.a((Collection) this.f13003a);
            this.f13003a.clear();
            qp it = a10.iterator();
            while (it.hasNext()) {
                ((v5) it.next()).i();
            }
        }

        public void b(v5 v5Var) {
            this.f13003a.remove(v5Var);
            if (this.f13004b == v5Var) {
                this.f13004b = null;
                if (!this.f13003a.isEmpty()) {
                    v5 v5Var2 = (v5) this.f13003a.iterator().next();
                    this.f13004b = v5Var2;
                    v5Var2.k();
                }
            }
        }

        public void a(Exception exc, boolean z10) {
            this.f13004b = null;
            ab a10 = ab.a((Collection) this.f13003a);
            this.f13003a.clear();
            qp it = a10.iterator();
            while (it.hasNext()) {
                ((v5) it.next()).b(exc, z10);
            }
        }

        public void a(v5 v5Var) {
            this.f13003a.add(v5Var);
            if (this.f13004b == null) {
                this.f13004b = v5Var;
                v5Var.k();
            }
        }
    }

    /* access modifiers changed from: private */
    public x6 a(Looper looper, y6.a aVar, d9 d9Var, boolean z10) {
        List list;
        b(looper);
        w6 w6Var = d9Var.f7156p;
        if (w6Var == null) {
            return a(df.e(d9Var.f7153m), z10);
        }
        v5 v5Var = null;
        if (this.f12987x == null) {
            list = a((w6) a1.a((Object) w6Var), this.f12966c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f12966c);
                kc.a("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.a((Exception) eVar);
                }
                return new s7(new x6.a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f12970g) {
            Iterator it = this.f12977n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v5 v5Var2 = (v5) it.next();
                if (yp.a((Object) v5Var2.f12677a, (Object) list)) {
                    v5Var = v5Var2;
                    break;
                }
            }
        } else {
            v5Var = this.f12983t;
        }
        if (v5Var == null) {
            v5Var = a(list, false, aVar, z10);
            if (!this.f12970g) {
                this.f12983t = v5Var;
            }
            this.f12977n.add(v5Var);
        } else {
            v5Var.b(aVar);
        }
        return v5Var;
    }

    public final void b() {
        int i10 = this.f12980q;
        this.f12980q = i10 + 1;
        if (i10 == 0) {
            if (this.f12981r == null) {
                x7 a10 = this.f12967d.a(this.f12966c);
                this.f12981r = a10;
                a10.a((x7.b) new c());
            } else if (this.f12976m != -9223372036854775807L) {
                for (int i11 = 0; i11 < this.f12977n.size(); i11++) {
                    ((v5) this.f12977n.get(i11)).b((y6.a) null);
                }
            }
        }
    }

    private static boolean a(x6 x6Var) {
        if (x6Var.b() != 1 || (yp.f13662a >= 19 && !(((x6.a) a1.a((Object) x6Var.getError())).getCause() instanceof ResourceBusyException))) {
            return false;
        }
        return true;
    }

    private boolean a(w6 w6Var) {
        if (this.f12987x != null) {
            return true;
        }
        if (a(w6Var, this.f12966c, true).isEmpty()) {
            if (w6Var.f13011d != 1 || !w6Var.a(0).a(r2.f11114b)) {
                return false;
            }
            kc.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f12966c);
        }
        String str = w6Var.f13010c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (yp.f13662a >= 25) {
                return true;
            }
            return false;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    private v5 a(List list, boolean z10, y6.a aVar) {
        a1.a((Object) this.f12981r);
        List list2 = list;
        v5 v5Var = new v5(this.f12966c, this.f12981r, this.f12973j, this.f12975l, list2, this.f12986w, this.f12972i | z10, z10, this.f12987x, this.f12969f, this.f12968e, (Looper) a1.a((Object) this.f12984u), this.f12974k);
        v5Var.b(aVar);
        if (this.f12976m != -9223372036854775807L) {
            v5Var.b((y6.a) null);
        }
        return v5Var;
    }

    private v5 a(List list, boolean z10, y6.a aVar, boolean z11) {
        v5 a10 = a(list, z10, aVar);
        if (a((x6) a10) && !this.f12979p.isEmpty()) {
            d();
            a((x6) a10, aVar);
            a10 = a(list, z10, aVar);
        }
        if (!a((x6) a10) || !z11 || this.f12978o.isEmpty()) {
            return a10;
        }
        e();
        if (!this.f12979p.isEmpty()) {
            d();
        }
        a((x6) a10, aVar);
        return a(list, z10, aVar);
    }

    public int a(d9 d9Var) {
        int c10 = ((x7) a1.a((Object) this.f12981r)).c();
        w6 w6Var = d9Var.f7156p;
        if (w6Var == null) {
            if (yp.a(this.f12971h, df.e(d9Var.f7153m)) != -1) {
                return c10;
            }
            return 0;
        } else if (a(w6Var)) {
            return c10;
        } else {
            return 1;
        }
    }

    private synchronized void a(Looper looper) {
        Looper looper2 = this.f12984u;
        if (looper2 == null) {
            this.f12984u = looper;
            this.f12985v = new Handler(looper);
        } else {
            a1.b(looper2 == looper);
            a1.a((Object) this.f12985v);
        }
    }

    private x6 a(int i10, boolean z10) {
        x7 x7Var = (x7) a1.a((Object) this.f12981r);
        if ((x7Var.c() == 2 && j9.f8708d) || yp.a(this.f12971h, i10) == -1 || x7Var.c() == 1) {
            return null;
        }
        v5 v5Var = this.f12982s;
        if (v5Var == null) {
            v5 a10 = a((List) ab.h(), true, (y6.a) null, z10);
            this.f12977n.add(a10);
            this.f12982s = a10;
        } else {
            v5Var.b((y6.a) null);
        }
        return this.f12982s;
    }

    public final void a() {
        int i10 = this.f12980q - 1;
        this.f12980q = i10;
        if (i10 == 0) {
            if (this.f12976m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f12977n);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((v5) arrayList.get(i11)).a((y6.a) null);
                }
            }
            e();
            c();
        }
    }

    public void a(int i10, byte[] bArr) {
        a1.b(this.f12977n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            a1.a((Object) bArr);
        }
        this.f12986w = i10;
        this.f12987x = bArr;
    }

    private void a(x6 x6Var, y6.a aVar) {
        x6Var.a(aVar);
        if (this.f12976m != -9223372036854775807L) {
            x6Var.a((y6.a) null);
        }
    }

    private static List a(w6 w6Var, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(w6Var.f13011d);
        for (int i10 = 0; i10 < w6Var.f13011d; i10++) {
            w6.b a10 = w6Var.a(i10);
            if ((a10.a(uuid) || (r2.f11115c.equals(uuid) && a10.a(r2.f11114b))) && (a10.f13016f != null || z10)) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }
}
