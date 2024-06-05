package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.measurement.internal.y6;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import m5.e;
import m5.f;
import r5.g0;
import r5.p;
import r5.r;
import r5.s;
import r5.u;
import r5.v;
import r5.w;
import r5.x;
import r5.y;
import v0.a;
import w6.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class b7 extends y2 {

    /* renamed from: c  reason: collision with root package name */
    protected f8 f24388c;

    /* renamed from: d  reason: collision with root package name */
    private v f24389d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<u> f24390e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    private boolean f24391f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<String> f24392g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    private final Object f24393h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f24394i = false;

    /* renamed from: j  reason: collision with root package name */
    private PriorityQueue<na> f24395j;

    /* renamed from: k  reason: collision with root package name */
    private y6 f24396k = y6.f25289c;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicLong f24397l = new AtomicLong(0);

    /* renamed from: m  reason: collision with root package name */
    private long f24398m = -1;

    /* renamed from: n  reason: collision with root package name */
    final qb f24399n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f24400o = true;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public u f24401p;

    /* renamed from: q  reason: collision with root package name */
    private final kb f24402q = new x7(this);

    protected b7(w5 w5Var) {
        super(w5Var);
        this.f24399n = new qb(w5Var);
    }

    static /* synthetic */ void G(b7 b7Var, y6 y6Var, long j10, boolean z10, boolean z11) {
        b7Var.i();
        b7Var.q();
        y6 E = b7Var.e().E();
        if (j10 <= b7Var.f24398m && y6.k(E.b(), y6Var.b())) {
            b7Var.zzj().E().b("Dropped out-of-date consent setting, proposed settings", y6Var);
        } else if (b7Var.e().v(y6Var)) {
            b7Var.f24398m = j10;
            b7Var.o().P(z10);
            if (z11) {
                b7Var.o().J(new AtomicReference());
            }
        } else {
            b7Var.zzj().E().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(y6Var.b()));
        }
    }

    static /* synthetic */ void H(b7 b7Var, y6 y6Var, y6 y6Var2) {
        y6.a aVar = y6.a.ANALYTICS_STORAGE;
        y6.a aVar2 = y6.a.AD_STORAGE;
        boolean m10 = y6Var.m(y6Var2, aVar, aVar2);
        boolean r10 = y6Var.r(y6Var2, aVar, aVar2);
        if (m10 || r10) {
            b7Var.k().D();
        }
    }

    /* access modifiers changed from: private */
    public final void L(Boolean bool, boolean z10) {
        i();
        q();
        zzj().A().b("Setting app measurement enabled (FE)", bool);
        e().q(bool);
        if (z10) {
            e().x(bool);
        }
        if (this.f25124a.l() || (bool != null && !bool.booleanValue())) {
            o0();
        }
    }

    private final void P(String str, String str2, long j10, Object obj) {
        zzl().y(new o7(this, str, str2, obj, j10));
    }

    private final PriorityQueue<na> n0() {
        if (this.f24395j == null) {
            this.f24395j = new PriorityQueue<>(Comparator.comparing(w.f29784a, x.f29785a));
        }
        return this.f24395j;
    }

    /* access modifiers changed from: private */
    public final void o0() {
        i();
        String a10 = e().f25275m.a();
        if (a10 != null) {
            if ("unset".equals(a10)) {
                T("app", "_npa", (Object) null, zzb().a());
            } else {
                T("app", "_npa", Long.valueOf("true".equals(a10) ? 1 : 0), zzb().a());
            }
        }
        if (!this.f25124a.k() || !this.f24400o) {
            zzj().A().a("Updating Scion state (FE)");
            o().W();
            return;
        }
        zzj().A().a("Recording app launch after enabling measurement for the first time (FE)");
        i0();
        if (zzoh.zza() && a().n(e0.f24525q0)) {
            p().f24486e.a();
        }
        zzl().y(new n7(this));
    }

    private final void r0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        zzl().y(new p7(this, str, str2, j10, ib.y(bundle), z10, z11, z12, str3));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void A(Bundle bundle) {
        if (bundle == null) {
            e().f25287y.b(new Bundle());
            return;
        }
        Bundle a10 = e().f25287y.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                f();
                if (ib.b0(obj)) {
                    f();
                    ib.S(this.f24402q, 27, (String) null, (String) null, 0);
                }
                zzj().H().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (ib.C0(str)) {
                zzj().H().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a10.remove(str);
            } else if (f().f0("param", str, a().o(this.f25124a.w().A()), obj)) {
                f().I(a10, str, obj);
            }
        }
        f();
        if (ib.a0(a10, a().z())) {
            f();
            ib.S(this.f24402q, 26, (String) null, (String) null, 0);
            zzj().H().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        e().f25287y.b(a10);
        o().x(a10);
    }

    /* access modifiers changed from: package-private */
    public final void B(Bundle bundle, int i10, long j10) {
        q();
        String i11 = y6.i(bundle);
        if (i11 != null) {
            zzj().H().b("Ignoring invalid consent setting", i11);
            zzj().H().a("Valid consent values are 'granted', 'denied'");
        }
        y6 c10 = y6.c(bundle, i10);
        if (!zznp.zza() || !a().n(e0.S0)) {
            F(c10, j10);
            return;
        }
        if (c10.z()) {
            F(c10, j10);
        }
        v b10 = v.b(bundle, i10);
        if (b10.j()) {
            D(b10);
        }
        Boolean d10 = v.d(bundle);
        if (d10 != null) {
            U("app", "allow_personalized_ads", d10.toString(), false);
        }
    }

    public final void C(Bundle bundle, long j10) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        q.k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().G().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        q.k(bundle2);
        r5.q.a(bundle2, "app_id", cls2, null);
        r5.q.a(bundle2, "origin", cls2, null);
        r5.q.a(bundle2, MediationMetaData.KEY_NAME, cls2, null);
        r5.q.a(bundle2, "value", Object.class, null);
        r5.q.a(bundle2, "trigger_event_name", cls2, null);
        r5.q.a(bundle2, "trigger_timeout", cls, 0L);
        r5.q.a(bundle2, "timed_out_event_name", cls2, null);
        r5.q.a(bundle2, "timed_out_event_params", Bundle.class, null);
        r5.q.a(bundle2, "triggered_event_name", cls2, null);
        r5.q.a(bundle2, "triggered_event_params", Bundle.class, null);
        r5.q.a(bundle2, "time_to_live", cls, 0L);
        r5.q.a(bundle2, "expired_event_name", cls2, null);
        r5.q.a(bundle2, "expired_event_params", Bundle.class, null);
        q.g(bundle2.getString(MediationMetaData.KEY_NAME));
        q.g(bundle2.getString("origin"));
        q.k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString(MediationMetaData.KEY_NAME);
        Object obj = bundle2.get("value");
        if (f().l0(string) != 0) {
            zzj().B().b("Invalid conditional user property name", d().g(string));
        } else if (f().r(string, obj) != 0) {
            zzj().B().c("Invalid conditional user property value", d().g(string), obj);
        } else {
            Object v02 = f().v0(string, obj);
            if (v02 == null) {
                zzj().B().c("Unable to normalize conditional user property value", d().g(string), obj);
                return;
            }
            r5.q.b(bundle2, v02);
            long j11 = bundle2.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle2.getString("trigger_event_name")) || (j11 <= 15552000000L && j11 >= 1)) {
                long j12 = bundle2.getLong("time_to_live");
                if (j12 > 15552000000L || j12 < 1) {
                    zzj().B().c("Invalid conditional user property time to live", d().g(string), Long.valueOf(j12));
                } else {
                    zzl().y(new u7(this, bundle2));
                }
            } else {
                zzj().B().c("Invalid conditional user property timeout", d().g(string), Long.valueOf(j11));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void D(v vVar) {
        zzl().y(new e8(this, vVar));
    }

    /* access modifiers changed from: package-private */
    public final void E(y6 y6Var) {
        i();
        boolean z10 = (y6Var.y() && y6Var.x()) || o().Z();
        if (z10 != this.f25124a.l()) {
            this.f25124a.r(z10);
            Boolean G = e().G();
            if (!z10 || G == null || G.booleanValue()) {
                L(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void F(y6 y6Var, long j10) {
        y6 y6Var2;
        boolean z10;
        boolean z11;
        boolean z12;
        y6 y6Var3 = y6Var;
        q();
        int b10 = y6Var.b();
        if (b10 != -10 && y6Var.s() == null && y6Var.u() == null) {
            zzj().H().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f24393h) {
            y6Var2 = this.f24396k;
            z10 = true;
            z11 = false;
            if (y6.k(b10, y6Var2.b())) {
                boolean t10 = y6Var3.t(this.f24396k);
                if (y6Var.y() && !this.f24396k.y()) {
                    z11 = true;
                }
                y6Var3 = y6Var3.p(this.f24396k);
                this.f24396k = y6Var3;
                z12 = z11;
                z11 = t10;
            } else {
                z10 = false;
                z12 = false;
            }
        }
        if (!z10) {
            zzj().E().b("Ignoring lower-priority consent settings, proposed settings", y6Var3);
            return;
        }
        long andIncrement = this.f24397l.getAndIncrement();
        if (z11) {
            M((String) null);
            zzl().B(new d8(this, y6Var3, j10, andIncrement, z12, y6Var2));
            return;
        }
        g8 g8Var = new g8(this, y6Var3, andIncrement, z12, y6Var2);
        if (b10 == 30 || b10 == -10) {
            zzl().B(g8Var);
        } else {
            zzl().y(g8Var);
        }
    }

    public final void K(Boolean bool) {
        q();
        zzl().y(new b8(this, bool));
    }

    /* access modifiers changed from: package-private */
    public final void M(String str) {
        this.f24392g.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void N(String str, String str2, long j10, Bundle bundle) {
        i();
        O(str, str2, j10, bundle, true, this.f24389d == null || ib.C0(str2), true, (String) null);
    }

    /* access modifiers changed from: protected */
    public final void O(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        String str4;
        long j11;
        b7 b7Var;
        String str5;
        String str6;
        String str7;
        boolean z14;
        Class<?> cls;
        String str8 = str;
        String str9 = str2;
        long j12 = j10;
        Bundle bundle2 = bundle;
        q.g(str);
        q.k(bundle);
        i();
        q();
        if (!this.f25124a.k()) {
            zzj().A().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> C = k().C();
        if (C == null || C.contains(str9)) {
            int i10 = 0;
            if (!this.f24391f) {
                this.f24391f = true;
                try {
                    if (!this.f25124a.o()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, new Class[]{Context.class}).invoke((Object) null, new Object[]{zza()});
                    } catch (Exception e10) {
                        zzj().G().b("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    zzj().E().a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str9)) {
                if (bundle2.containsKey("gclid")) {
                    T("auto", "_lgclid", bundle2.getString("gclid"), zzb().a());
                }
                if (zzoi.zza() && a().n(e0.Z0) && bundle2.containsKey("gbraid")) {
                    T("auto", "_gbraid", bundle2.getString("gbraid"), zzb().a());
                }
            }
            if (z10 && ib.G0(str2)) {
                f().H(bundle2, e().f25287y.a());
            }
            if (!z12 && !"_iap".equals(str9)) {
                ib G = this.f25124a.G();
                int i11 = 2;
                if (G.x0("event", str9)) {
                    if (!G.j0("event", r.f29774a, r.f29775b, str9)) {
                        i11 = 13;
                    } else if (G.d0("event", 40, str9)) {
                        i11 = 0;
                    }
                }
                if (i11 != 0) {
                    zzj().C().b("Invalid public event name. Event will not be logged (FE)", d().c(str9));
                    this.f25124a.G();
                    String D = ib.D(str9, 40, true);
                    if (str9 != null) {
                        i10 = str2.length();
                    }
                    this.f25124a.G();
                    ib.S(this.f24402q, i11, "_ev", D, i10);
                    return;
                }
            }
            p8 x10 = n().x(false);
            if (x10 != null && !bundle2.containsKey("_sc")) {
                x10.f24935d = true;
            }
            ib.R(x10, bundle2, z10 && !z12);
            boolean equals = "am".equals(str8);
            boolean C0 = ib.C0(str2);
            if (z10 && this.f24389d != null && !C0 && !equals) {
                zzj().A().c("Passing event to registered event handler (FE)", d().c(str9), d().a(bundle2));
                q.k(this.f24389d);
                this.f24389d.a(str, str2, bundle, j10);
            } else if (this.f25124a.n()) {
                int q10 = f().q(str9);
                if (q10 != 0) {
                    zzj().C().b("Invalid event name. Event will not be logged (FE)", d().c(str9));
                    f();
                    String D2 = ib.D(str9, 40, true);
                    if (str9 != null) {
                        i10 = str2.length();
                    }
                    this.f25124a.G();
                    ib.T(this.f24402q, str3, q10, "_ev", D2, i10);
                    return;
                }
                Bundle z15 = f().z(str3, str2, bundle, f.c("_o", "_sn", "_sc", "_si"), z12);
                q.k(z15);
                if (n().x(false) != null && "_ae".equals(str9)) {
                    ja jaVar = p().f24487f;
                    long b10 = jaVar.f24730d.zzb().b();
                    long j13 = b10 - jaVar.f24728b;
                    jaVar.f24728b = b10;
                    if (j13 > 0) {
                        f().G(z15, j13);
                    }
                }
                if (zznv.zza() && a().n(e0.f24523p0)) {
                    if (!"auto".equals(str8) && "_ssr".equals(str9)) {
                        ib f10 = f();
                        String string = z15.getString("_ffr");
                        if (m5.q.b(string)) {
                            str7 = null;
                        } else {
                            str7 = string != null ? string.trim() : string;
                        }
                        if (g0.a(str7, f10.e().f25284v.a())) {
                            f10.zzj().A().a("Not logging duplicate session_start_with_rollout event");
                            z14 = false;
                        } else {
                            f10.e().f25284v.b(str7);
                            z14 = true;
                        }
                        if (!z14) {
                            return;
                        }
                    } else if ("_ae".equals(str9)) {
                        String a10 = f().e().f25284v.a();
                        if (!TextUtils.isEmpty(a10)) {
                            z15.putString("_ffr", a10);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(z15);
                if (a().n(e0.Q0)) {
                    z13 = p().A();
                } else {
                    z13 = e().f25281s.b();
                }
                if (e().f25278p.a() <= 0 || !e().t(j12) || !z13) {
                    j11 = 0;
                    str4 = "_ae";
                } else {
                    zzj().F().a("Current session is expired, remove the session number, ID, and engagement time");
                    j11 = 0;
                    str4 = "_ae";
                    T("auto", "_sid", (Object) null, zzb().a());
                    T("auto", "_sno", (Object) null, zzb().a());
                    T("auto", "_se", (Object) null, zzb().a());
                    e().f25279q.b(0);
                }
                if (z15.getLong("extend_session", j11) == 1) {
                    zzj().F().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    b7Var = this;
                    b7Var.f25124a.F().f24486e.b(j12, true);
                } else {
                    b7Var = this;
                }
                ArrayList arrayList2 = new ArrayList(z15.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    String str10 = (String) obj;
                    if (str10 != null) {
                        f();
                        Bundle[] s02 = ib.s0(z15.get(str10));
                        if (s02 != null) {
                            z15.putParcelableArray(str10, s02);
                        }
                    }
                }
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    Bundle bundle3 = (Bundle) arrayList.get(i13);
                    if (i13 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle3.putString("_o", str5);
                    if (z11) {
                        bundle3 = f().m0(bundle3);
                    }
                    Bundle bundle4 = bundle3;
                    o().D(new d0(str6, new z(bundle4), str, j10), str3);
                    if (!equals) {
                        for (u a11 : b7Var.f24390e) {
                            a11.a(str, str2, new Bundle(bundle4), j10);
                            String str11 = str3;
                        }
                    }
                    i13++;
                }
                if (n().x(false) != null) {
                    if (str4.equals(str2)) {
                        p().z(true, true, zzb().b());
                    }
                }
            }
        } else {
            zzj().A().c("Dropping non-safelisted event. event name, origin", str9, str8);
        }
    }

    public final void Q(String str, String str2, Bundle bundle) {
        long a10 = zzb().a();
        q.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().y(new t7(this, bundle2));
    }

    public final void R(String str, String str2, Bundle bundle, String str3) {
        h();
        r0(str, str2, zzb().a(), bundle, false, true, true, str3);
    }

    public final void S(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str2;
        String str4 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str3 == "screen_view" || (str3 != null && str2.equals("screen_view"))) {
            n().D(bundle2, j10);
            return;
        }
        long j11 = j10;
        r0(str4, str2, j10, bundle2, z11, !z11 || this.f24389d == null || ib.C0(str2), z10, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void T(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.q.g(r9)
            com.google.android.gms.common.internal.q.g(r10)
            r8.i()
            r8.q()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0060
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0050
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0035
            r4 = r2
            goto L_0x0037
        L_0x0035:
            r4 = 0
        L_0x0037:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.y4 r0 = r8.e()
            com.google.android.gms.measurement.internal.e5 r0 = r0.f25275m
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004b
            java.lang.String r11 = "true"
        L_0x004b:
            r0.b(r11)
            r6 = r10
            goto L_0x005e
        L_0x0050:
            if (r11 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.y4 r10 = r8.e()
            com.google.android.gms.measurement.internal.e5 r10 = r10.f25275m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L_0x005e:
            r3 = r1
            goto L_0x0062
        L_0x0060:
            r3 = r10
            r6 = r11
        L_0x0062:
            com.google.android.gms.measurement.internal.w5 r10 = r8.f25124a
            boolean r10 = r10.k()
            if (r10 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.n4 r9 = r8.zzj()
            com.google.android.gms.measurement.internal.p4 r9 = r9.F()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x0078:
            com.google.android.gms.measurement.internal.w5 r10 = r8.f25124a
            boolean r10 = r10.n()
            if (r10 != 0) goto L_0x0081
            return
        L_0x0081:
            com.google.android.gms.measurement.internal.hb r10 = new com.google.android.gms.measurement.internal.hb
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.v8 r9 = r8.o()
            r9.H(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b7.T(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void U(String str, String str2, Object obj, boolean z10) {
        V(str, str2, obj, z10, zzb().a());
    }

    public final void V(String str, String str2, Object obj, boolean z10, long j10) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i10 = 6;
        int i11 = 0;
        if (z10) {
            i10 = f().l0(str2);
        } else {
            ib f10 = f();
            if (f10.x0("user property", str2)) {
                if (!f10.i0("user property", s.f29778a, str2)) {
                    i10 = 15;
                } else if (f10.d0("user property", 24, str2)) {
                    i10 = 0;
                }
            }
        }
        if (i10 != 0) {
            f();
            String D = ib.D(str2, 24, true);
            if (str2 != null) {
                i11 = str2.length();
            }
            this.f25124a.G();
            ib.S(this.f24402q, i10, "_ev", D, i11);
        } else if (obj != null) {
            int r10 = f().r(str2, obj);
            if (r10 != 0) {
                f();
                String D2 = ib.D(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i11 = String.valueOf(obj).length();
                }
                this.f25124a.G();
                ib.S(this.f24402q, r10, "_ev", D2, i11);
                return;
            }
            Object v02 = f().v0(str2, obj);
            if (v02 != null) {
                P(str3, str2, j10, v02);
            }
        } else {
            P(str3, str2, j10, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void W(List list) {
        i();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> C = e().C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                na naVar = (na) it.next();
                if (!C.contains(naVar.f24872c) || C.get(naVar.f24872c).longValue() < naVar.f24871b) {
                    n0().add(naVar);
                }
            }
            m0();
        }
    }

    public final void X(u uVar) {
        q();
        q.k(uVar);
        if (!this.f24390e.add(uVar)) {
            zzj().G().a("OnEventListener already registered");
        }
    }

    public final void Y(v vVar) {
        v vVar2;
        i();
        q();
        if (!(vVar == null || vVar == (vVar2 = this.f24389d))) {
            q.o(vVar2 == null, "EventInterceptor already set.");
        }
        this.f24389d = vVar;
    }

    public final Boolean Z() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().q(atomicReference, 15000, "boolean test flag value", new j7(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final Double a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().q(atomicReference, 15000, "double test flag value", new c8(this, atomicReference));
    }

    public final Integer b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().q(atomicReference, 15000, "int test flag value", new z7(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final Long c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().q(atomicReference, 15000, "long test flag value", new a8(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final String d0() {
        return this.f24392g.get();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final String e0() {
        p8 K = this.f25124a.D().K();
        if (K != null) {
            return K.f24933b;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final String f0() {
        p8 K = this.f25124a.D().K();
        if (K != null) {
            return K.f24932a;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final String g0() {
        if (this.f25124a.H() != null) {
            return this.f25124a.H();
        }
        try {
            return new p(zza(), this.f25124a.K()).b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f25124a.zzj().B().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final String h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().q(atomicReference, 15000, "String test flag value", new r7(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final void i0() {
        i();
        q();
        if (this.f25124a.n()) {
            if (a().n(e0.f24513k0)) {
                Boolean A = a().A("google_analytics_deferred_deep_link_enabled");
                if (A != null && A.booleanValue()) {
                    zzj().A().a("Deferred Deep Link feature enabled.");
                    zzl().y(new y(this));
                }
            }
            o().S();
            this.f24400o = false;
            String I = e().I();
            if (!TextUtils.isEmpty(I)) {
                c().j();
                if (!I.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", I);
                    u0("auto", "_ou", bundle);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    public final void j0() {
        if ((zza().getApplicationContext() instanceof Application) && this.f24388c != null) {
            ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f24388c);
        }
    }

    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    /* access modifiers changed from: package-private */
    public final void k0() {
        if (zzpg.zza() && a().n(e0.M0)) {
            if (zzl().E()) {
                zzj().B().a("Cannot get trigger URIs from analytics worker thread");
            } else if (e.a()) {
                zzj().B().a("Cannot get trigger URIs from main thread");
            } else {
                q();
                zzj().F().a("Getting trigger URIs (FE)");
                AtomicReference atomicReference = new AtomicReference();
                zzl().q(atomicReference, UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS, "get trigger URIs", new c7(this, atomicReference));
                List list = (List) atomicReference.get();
                if (list == null) {
                    zzj().B().a("Timed out waiting for get trigger URIs");
                } else {
                    zzl().y(new e7(this, list));
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    public final void l0() {
        i();
        if (e().f25282t.b()) {
            zzj().A().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a10 = e().f25283u.a();
        e().f25283u.b(1 + a10);
        if (a10 >= 5) {
            zzj().G().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            e().f25282t.a(true);
        } else if (!zznp.zza() || !a().n(e0.U0)) {
            this.f25124a.p();
        } else {
            if (this.f24401p == null) {
                this.f24401p = new q7(this, this.f25124a);
            }
            this.f24401p.b(0);
        }
    }

    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
    }

    /* access modifiers changed from: package-private */
    public final void m0() {
        na poll;
        a L0;
        i();
        if (!n0().isEmpty() && !this.f24394i && (poll = n0().poll()) != null && (L0 = f().L0()) != null) {
            this.f24394i = true;
            zzj().F().b("Registering trigger URI", poll.f24870a);
            w6.f<sd.w> c10 = L0.c(Uri.parse(poll.f24870a));
            if (c10 == null) {
                this.f24394i = false;
                n0().add(poll);
                return;
            }
            SparseArray<Long> C = e().C();
            C.put(poll.f24872c, Long.valueOf(poll.f24871b));
            y4 e10 = e();
            int[] iArr = new int[C.size()];
            long[] jArr = new long[C.size()];
            for (int i10 = 0; i10 < C.size(); i10++) {
                iArr[i10] = C.keyAt(i10);
                jArr[i10] = C.valueAt(i10).longValue();
            }
            Bundle bundle = new Bundle();
            bundle.putIntArray("uriSources", iArr);
            bundle.putLongArray("uriTimestamps", jArr);
            e10.f25276n.b(bundle);
            d.a(c10, new l7(this, poll), new h7(this));
        }
    }

    public final /* bridge */ /* synthetic */ o8 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ v8 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ da p() {
        return super.p();
    }

    public final void p0(Bundle bundle) {
        C(bundle, zzb().a());
    }

    public final void s0(String str, String str2, Bundle bundle) {
        S(str, str2, bundle, true, true, zzb().a());
    }

    public final void t0(u uVar) {
        q();
        q.k(uVar);
        if (!this.f24390e.remove(uVar)) {
            zzj().G().a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: package-private */
    public final void u0(String str, String str2, Bundle bundle) {
        i();
        N(str, str2, zzb().a(), bundle);
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final ArrayList<Bundle> x(String str, String str2) {
        if (zzl().E()) {
            zzj().B().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (e.a()) {
            zzj().B().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f25124a.zzl().q(atomicReference, UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS, "get conditional user properties", new w7(this, atomicReference, (String) null, str, str2));
            List list = (List) atomicReference.get();
            if (list != null) {
                return ib.o0(list);
            }
            zzj().B().b("Timed out waiting for get conditional user properties", (Object) null);
            return new ArrayList<>();
        }
    }

    public final Map<String, Object> y(String str, String str2, boolean z10) {
        if (zzl().E()) {
            zzj().B().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (e.a()) {
            zzj().B().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f25124a.zzl().q(atomicReference, UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS, "get user properties", new v7(this, atomicReference, (String) null, str, str2, z10));
            List<hb> list = (List) atomicReference.get();
            if (list == null) {
                zzj().B().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                return Collections.emptyMap();
            }
            androidx.collection.a aVar = new androidx.collection.a(list.size());
            for (hb hbVar : list) {
                Object v10 = hbVar.v();
                if (v10 != null) {
                    aVar.put(hbVar.f24640b, v10);
                }
            }
            return aVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void z(long j10, boolean z10) {
        i();
        q();
        zzj().A().a("Resetting analytics data (FE)");
        da p10 = p();
        p10.i();
        p10.f24487f.b();
        if (zzps.zza() && a().n(e0.f24539x0)) {
            k().D();
        }
        boolean k10 = this.f25124a.k();
        y4 e10 = e();
        e10.f25267e.b(j10);
        if (!TextUtils.isEmpty(e10.e().f25284v.a())) {
            e10.f25284v.b((String) null);
        }
        if (zzoh.zza() && e10.a().n(e0.f24525q0)) {
            e10.f25278p.b(0);
        }
        e10.f25279q.b(0);
        if (!e10.a().M()) {
            e10.z(!k10);
        }
        e10.f25285w.b((String) null);
        e10.f25286x.b(0);
        e10.f25287y.b((Bundle) null);
        if (z10) {
            o().V();
        }
        if (zzoh.zza() && a().n(e0.f24525q0)) {
            p().f24486e.a();
        }
        this.f24400o = !k10;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
