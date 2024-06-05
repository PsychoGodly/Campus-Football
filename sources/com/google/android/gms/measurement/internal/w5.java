package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzoi;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import m5.e;
import m5.h;
import o5.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public class w5 implements w6 {
    private static volatile w5 I;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private int F;
    private AtomicInteger G = new AtomicInteger(0);
    final long H;

    /* renamed from: a  reason: collision with root package name */
    private final Context f25187a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25188b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25189c;

    /* renamed from: d  reason: collision with root package name */
    private final String f25190d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f25191e;

    /* renamed from: f  reason: collision with root package name */
    private final e f25192f;

    /* renamed from: g  reason: collision with root package name */
    private final f f25193g;

    /* renamed from: h  reason: collision with root package name */
    private final y4 f25194h;

    /* renamed from: i  reason: collision with root package name */
    private final n4 f25195i;

    /* renamed from: j  reason: collision with root package name */
    private final q5 f25196j;

    /* renamed from: k  reason: collision with root package name */
    private final da f25197k;

    /* renamed from: l  reason: collision with root package name */
    private final ib f25198l;

    /* renamed from: m  reason: collision with root package name */
    private final m4 f25199m;

    /* renamed from: n  reason: collision with root package name */
    private final e f25200n;

    /* renamed from: o  reason: collision with root package name */
    private final o8 f25201o;

    /* renamed from: p  reason: collision with root package name */
    private final b7 f25202p;

    /* renamed from: q  reason: collision with root package name */
    private final x f25203q;

    /* renamed from: r  reason: collision with root package name */
    private final k8 f25204r;

    /* renamed from: s  reason: collision with root package name */
    private final String f25205s;

    /* renamed from: t  reason: collision with root package name */
    private l4 f25206t;

    /* renamed from: u  reason: collision with root package name */
    private v8 f25207u;

    /* renamed from: v  reason: collision with root package name */
    private y f25208v;

    /* renamed from: w  reason: collision with root package name */
    private i4 f25209w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f25210x = false;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f25211y;

    /* renamed from: z  reason: collision with root package name */
    private long f25212z;

    private w5(a7 a7Var) {
        long j10;
        Bundle bundle;
        boolean z10 = false;
        q.k(a7Var);
        e eVar = new e(a7Var.f24359a);
        this.f25192f = eVar;
        f4.f24575a = eVar;
        Context context = a7Var.f24359a;
        this.f25187a = context;
        this.f25188b = a7Var.f24360b;
        this.f25189c = a7Var.f24361c;
        this.f25190d = a7Var.f24362d;
        this.f25191e = a7Var.f24366h;
        this.A = a7Var.f24363e;
        this.f25205s = a7Var.f24368j;
        this.D = true;
        zzdd zzdd = a7Var.f24365g;
        if (!(zzdd == null || (bundle = zzdd.zzg) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzdd.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        zzgn.zzb(context);
        e d10 = h.d();
        this.f25200n = d10;
        Long l10 = a7Var.f24367i;
        if (l10 != null) {
            j10 = l10.longValue();
        } else {
            j10 = d10.a();
        }
        this.H = j10;
        this.f25193g = new f(this);
        y4 y4Var = new y4(this);
        y4Var.k();
        this.f25194h = y4Var;
        n4 n4Var = new n4(this);
        n4Var.k();
        this.f25195i = n4Var;
        ib ibVar = new ib(this);
        ibVar.k();
        this.f25198l = ibVar;
        this.f25199m = new m4(new z6(a7Var, this));
        this.f25203q = new x(this);
        o8 o8Var = new o8(this);
        o8Var.r();
        this.f25201o = o8Var;
        b7 b7Var = new b7(this);
        b7Var.r();
        this.f25202p = b7Var;
        da daVar = new da(this);
        daVar.r();
        this.f25197k = daVar;
        k8 k8Var = new k8(this);
        k8Var.k();
        this.f25204r = k8Var;
        q5 q5Var = new q5(this);
        q5Var.k();
        this.f25196j = q5Var;
        zzdd zzdd2 = a7Var.f24365g;
        if (!(zzdd2 == null || zzdd2.zzb == 0)) {
            z10 = true;
        }
        boolean z11 = !z10;
        if (context.getApplicationContext() instanceof Application) {
            b7 C2 = C();
            if (C2.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) C2.zza().getApplicationContext();
                if (C2.f24388c == null) {
                    C2.f24388c = new f8(C2);
                }
                if (z11) {
                    application.unregisterActivityLifecycleCallbacks(C2.f24388c);
                    application.registerActivityLifecycleCallbacks(C2.f24388c);
                    C2.zzj().F().a("Registered activity lifecycle callback");
                }
            }
        } else {
            zzj().G().a("Application context is not an Application");
        }
        q5Var.y(new x5(this, a7Var));
    }

    public static w5 a(Context context, zzdd zzdd, Long l10) {
        Bundle bundle;
        if (zzdd != null && (zzdd.zze == null || zzdd.zzf == null)) {
            zzdd = new zzdd(zzdd.zza, zzdd.zzb, zzdd.zzc, zzdd.zzd, (String) null, (String) null, zzdd.zzg, (String) null);
        }
        q.k(context);
        q.k(context.getApplicationContext());
        if (I == null) {
            synchronized (w5.class) {
                if (I == null) {
                    I = new w5(new a7(context, zzdd, l10));
                }
            }
        } else if (!(zzdd == null || (bundle = zzdd.zzg) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            q.k(I);
            I.h(zzdd.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        q.k(I);
        return I;
    }

    private static void c(y2 y2Var) {
        if (y2Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!y2Var.u()) {
            String valueOf = String.valueOf(y2Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    static /* synthetic */ void d(w5 w5Var, a7 a7Var) {
        w5Var.zzl().i();
        y yVar = new y(w5Var);
        yVar.k();
        w5Var.f25208v = yVar;
        i4 i4Var = new i4(w5Var, a7Var.f24364f);
        i4Var.r();
        w5Var.f25209w = i4Var;
        l4 l4Var = new l4(w5Var);
        l4Var.r();
        w5Var.f25206t = l4Var;
        v8 v8Var = new v8(w5Var);
        v8Var.r();
        w5Var.f25207u = v8Var;
        w5Var.f25198l.l();
        w5Var.f25194h.l();
        w5Var.f25209w.s();
        w5Var.zzj().E().b("App measurement initialized, version", 82001L);
        w5Var.zzj().E().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String A2 = i4Var.A();
        if (TextUtils.isEmpty(w5Var.f25188b)) {
            if (w5Var.G().A0(A2)) {
                w5Var.zzj().E().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                p4 E2 = w5Var.zzj().E();
                E2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + A2);
            }
        }
        w5Var.zzj().A().a("Debug-level message logging enabled");
        if (w5Var.E != w5Var.G.get()) {
            w5Var.zzj().B().c("Not all components initialized", Integer.valueOf(w5Var.E), Integer.valueOf(w5Var.G.get()));
        }
        w5Var.f25210x = true;
    }

    private static void e(u6 u6Var) {
        if (u6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!u6Var.m()) {
            String valueOf = String.valueOf(u6Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    private static void f(v6 v6Var) {
        if (v6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private final k8 q() {
        e(this.f25204r);
        return this.f25204r;
    }

    public final y4 A() {
        f(this.f25194h);
        return this.f25194h;
    }

    /* access modifiers changed from: package-private */
    public final q5 B() {
        return this.f25196j;
    }

    public final b7 C() {
        c(this.f25202p);
        return this.f25202p;
    }

    public final o8 D() {
        c(this.f25201o);
        return this.f25201o;
    }

    public final v8 E() {
        c(this.f25207u);
        return this.f25207u;
    }

    public final da F() {
        c(this.f25197k);
        return this.f25197k;
    }

    public final ib G() {
        f(this.f25198l);
        return this.f25198l;
    }

    public final String H() {
        return this.f25188b;
    }

    public final String I() {
        return this.f25189c;
    }

    public final String J() {
        return this.f25190d;
    }

    public final String K() {
        return this.f25205s;
    }

    /* access modifiers changed from: package-private */
    public final void L() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void M() {
        this.G.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d8, code lost:
        if (r1.z() != false) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.internal.measurement.zzdd r10) {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.q5 r0 = r9.zzl()
            r0.i()
            boolean r0 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.f r0 = r9.f25193g
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.e0.M0
            boolean r0 = r0.n(r1)
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.ib r0 = r9.G()
            boolean r0 = r0.Q0()
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.ib r0 = r9.G()
            r0.i()
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r1.addAction(r2)
            r5.h0 r2 = new r5.h0
            com.google.android.gms.measurement.internal.w5 r3 = r0.f25124a
            r2.<init>(r3)
            android.content.Context r3 = r0.zza()
            r4 = 2
            androidx.core.content.a.registerReceiver(r3, r2, r1, r4)
            com.google.android.gms.measurement.internal.n4 r0 = r0.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.A()
            java.lang.String r1 = "Registered app receiver"
            r0.a(r1)
        L_0x004e:
            com.google.android.gms.measurement.internal.y4 r0 = r9.A()
            com.google.android.gms.measurement.internal.y6 r0 = r0.E()
            int r1 = r0.b()
            com.google.android.gms.measurement.internal.f r2 = r9.f25193g
            java.lang.String r3 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r2 = r2.A(r3)
            com.google.android.gms.measurement.internal.f r3 = r9.f25193g
            java.lang.String r4 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r3 = r3.A(r4)
            r4 = -10
            r5 = 0
            r6 = 30
            if (r2 != 0) goto L_0x0073
            if (r3 == 0) goto L_0x0083
        L_0x0073:
            com.google.android.gms.measurement.internal.y4 r7 = r9.A()
            boolean r7 = r7.s(r4)
            if (r7 == 0) goto L_0x0083
            com.google.android.gms.measurement.internal.y6 r1 = new com.google.android.gms.measurement.internal.y6
            r1.<init>(r2, r3, r4)
            goto L_0x00dc
        L_0x0083:
            com.google.android.gms.measurement.internal.i4 r2 = r9.w()
            java.lang.String r2 = r2.B()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00b0
            if (r1 == 0) goto L_0x00a1
            if (r1 == r6) goto L_0x00a1
            r2 = 10
            if (r1 == r2) goto L_0x00a1
            if (r1 == r6) goto L_0x00a1
            if (r1 == r6) goto L_0x00a1
            r2 = 40
            if (r1 != r2) goto L_0x00b0
        L_0x00a1:
            com.google.android.gms.measurement.internal.b7 r1 = r9.C()
            com.google.android.gms.measurement.internal.y6 r2 = new com.google.android.gms.measurement.internal.y6
            r2.<init>(r5, r5, r4)
            long r7 = r9.H
            r1.F(r2, r7)
            goto L_0x00db
        L_0x00b0:
            com.google.android.gms.measurement.internal.i4 r1 = r9.w()
            java.lang.String r1 = r1.B()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00db
            if (r10 == 0) goto L_0x00db
            android.os.Bundle r1 = r10.zzg
            if (r1 == 0) goto L_0x00db
            com.google.android.gms.measurement.internal.y4 r1 = r9.A()
            boolean r1 = r1.s(r6)
            if (r1 == 0) goto L_0x00db
            android.os.Bundle r1 = r10.zzg
            com.google.android.gms.measurement.internal.y6 r1 = com.google.android.gms.measurement.internal.y6.c(r1, r6)
            boolean r2 = r1.z()
            if (r2 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r1 = r5
        L_0x00dc:
            if (r1 == 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.b7 r0 = r9.C()
            long r2 = r9.H
            r0.F(r1, r2)
            r0 = r1
        L_0x00e8:
            com.google.android.gms.measurement.internal.b7 r1 = r9.C()
            r1.E(r0)
            boolean r0 = com.google.android.gms.internal.measurement.zznp.zza()
            r1 = 0
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.f r0 = r9.f25193g
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.e0.S0
            boolean r0 = r0.n(r2)
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.y4 r0 = r9.A()
            com.google.android.gms.measurement.internal.v r0 = r0.D()
            int r0 = r0.a()
            com.google.android.gms.measurement.internal.f r2 = r9.f25193g
            java.lang.String r3 = "google_analytics_default_allow_ad_user_data"
            java.lang.Boolean r2 = r2.A(r3)
            if (r2 == 0) goto L_0x012a
            boolean r3 = com.google.android.gms.measurement.internal.y6.k(r4, r0)
            if (r3 == 0) goto L_0x012a
            com.google.android.gms.measurement.internal.b7 r10 = r9.C()
            com.google.android.gms.measurement.internal.v r0 = new com.google.android.gms.measurement.internal.v
            r0.<init>((java.lang.Boolean) r2, (int) r4)
            r10.D(r0)
            goto L_0x01ad
        L_0x012a:
            com.google.android.gms.measurement.internal.i4 r2 = r9.w()
            java.lang.String r2 = r2.B()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0149
            if (r0 == 0) goto L_0x013c
            if (r0 != r6) goto L_0x0149
        L_0x013c:
            com.google.android.gms.measurement.internal.b7 r10 = r9.C()
            com.google.android.gms.measurement.internal.v r0 = new com.google.android.gms.measurement.internal.v
            r0.<init>((java.lang.Boolean) r5, (int) r4)
            r10.D(r0)
            goto L_0x01ad
        L_0x0149:
            com.google.android.gms.measurement.internal.i4 r2 = r9.w()
            java.lang.String r2 = r2.B()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0176
            if (r10 == 0) goto L_0x0176
            android.os.Bundle r2 = r10.zzg
            if (r2 == 0) goto L_0x0176
            boolean r0 = com.google.android.gms.measurement.internal.y6.k(r6, r0)
            if (r0 == 0) goto L_0x0176
            android.os.Bundle r0 = r10.zzg
            com.google.android.gms.measurement.internal.v r0 = com.google.android.gms.measurement.internal.v.b(r0, r6)
            boolean r2 = r0.j()
            if (r2 == 0) goto L_0x0176
            com.google.android.gms.measurement.internal.b7 r2 = r9.C()
            r2.D(r0)
        L_0x0176:
            com.google.android.gms.measurement.internal.i4 r0 = r9.w()
            java.lang.String r0 = r0.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01ad
            if (r10 == 0) goto L_0x01ad
            android.os.Bundle r0 = r10.zzg
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.y4 r0 = r9.A()
            com.google.android.gms.measurement.internal.e5 r0 = r0.f25275m
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x01ad
            android.os.Bundle r0 = r10.zzg
            java.lang.Boolean r0 = com.google.android.gms.measurement.internal.v.d(r0)
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.b7 r2 = r9.C()
            java.lang.String r10 = r10.zze
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "allow_personalized_ads"
            r2.U(r10, r3, r0, r1)
        L_0x01ad:
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.d5 r10 = r10.f25267e
            long r2 = r10.a()
            r6 = 0
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.n4 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.p4 r10 = r10.F()
            long r2 = r9.H
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "Persisting first open"
            r10.b(r2, r0)
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.d5 r10 = r10.f25267e
            long r2 = r9.H
            r10.b(r2)
        L_0x01db:
            com.google.android.gms.measurement.internal.b7 r10 = r9.C()
            com.google.android.gms.measurement.internal.qb r10 = r10.f24399n
            r10.c()
            boolean r10 = r9.n()
            if (r10 != 0) goto L_0x026f
            boolean r10 = r9.k()
            if (r10 == 0) goto L_0x03df
            com.google.android.gms.measurement.internal.ib r10 = r9.G()
            java.lang.String r0 = "android.permission.INTERNET"
            boolean r10 = r10.z0(r0)
            if (r10 != 0) goto L_0x0209
            com.google.android.gms.measurement.internal.n4 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.p4 r10 = r10.B()
            java.lang.String r0 = "App is missing INTERNET permission"
            r10.a(r0)
        L_0x0209:
            com.google.android.gms.measurement.internal.ib r10 = r9.G()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r10 = r10.z0(r0)
            if (r10 != 0) goto L_0x0222
            com.google.android.gms.measurement.internal.n4 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.p4 r10 = r10.B()
            java.lang.String r0 = "App is missing ACCESS_NETWORK_STATE permission"
            r10.a(r0)
        L_0x0222:
            android.content.Context r10 = r9.f25187a
            o5.b r10 = o5.c.a(r10)
            boolean r10 = r10.g()
            if (r10 != 0) goto L_0x0260
            com.google.android.gms.measurement.internal.f r10 = r9.f25193g
            boolean r10 = r10.N()
            if (r10 != 0) goto L_0x0260
            android.content.Context r10 = r9.f25187a
            boolean r10 = com.google.android.gms.measurement.internal.ib.X(r10)
            if (r10 != 0) goto L_0x024b
            com.google.android.gms.measurement.internal.n4 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.p4 r10 = r10.B()
            java.lang.String r0 = "AppMeasurementReceiver not registered/enabled"
            r10.a(r0)
        L_0x024b:
            android.content.Context r10 = r9.f25187a
            boolean r10 = com.google.android.gms.measurement.internal.ib.Y(r10, r1)
            if (r10 != 0) goto L_0x0260
            com.google.android.gms.measurement.internal.n4 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.p4 r10 = r10.B()
            java.lang.String r0 = "AppMeasurementService not registered/enabled"
            r10.a(r0)
        L_0x0260:
            com.google.android.gms.measurement.internal.n4 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.p4 r10 = r10.B()
            java.lang.String r0 = "Uploading is not possible. App measurement disabled"
            r10.a(r0)
            goto L_0x03df
        L_0x026f:
            com.google.android.gms.measurement.internal.i4 r10 = r9.w()
            java.lang.String r10 = r10.B()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x028b
            com.google.android.gms.measurement.internal.i4 r10 = r9.w()
            java.lang.String r10 = r10.z()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x030b
        L_0x028b:
            r9.G()
            com.google.android.gms.measurement.internal.i4 r10 = r9.w()
            java.lang.String r10 = r10.B()
            com.google.android.gms.measurement.internal.y4 r0 = r9.A()
            java.lang.String r0 = r0.K()
            com.google.android.gms.measurement.internal.i4 r1 = r9.w()
            java.lang.String r1 = r1.z()
            com.google.android.gms.measurement.internal.y4 r2 = r9.A()
            java.lang.String r2 = r2.J()
            boolean r10 = com.google.android.gms.measurement.internal.ib.g0(r10, r0, r1, r2)
            if (r10 == 0) goto L_0x02ed
            com.google.android.gms.measurement.internal.n4 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.p4 r10 = r10.E()
            java.lang.String r0 = "Rechecking which service to use due to a GMP App Id change"
            r10.a(r0)
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            r10.L()
            com.google.android.gms.measurement.internal.l4 r10 = r9.x()
            r10.C()
            com.google.android.gms.measurement.internal.v8 r10 = r9.f25207u
            r10.U()
            com.google.android.gms.measurement.internal.v8 r10 = r9.f25207u
            r10.T()
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.d5 r10 = r10.f25267e
            long r0 = r9.H
            r10.b(r0)
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.e5 r10 = r10.f25269g
            r10.b(r5)
        L_0x02ed:
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.i4 r0 = r9.w()
            java.lang.String r0 = r0.B()
            r10.B(r0)
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.i4 r0 = r9.w()
            java.lang.String r0 = r0.z()
            r10.y(r0)
        L_0x030b:
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.y6 r10 = r10.E()
            com.google.android.gms.measurement.internal.y6$a r0 = com.google.android.gms.measurement.internal.y6.a.ANALYTICS_STORAGE
            boolean r10 = r10.l(r0)
            if (r10 != 0) goto L_0x0324
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.e5 r10 = r10.f25269g
            r10.b(r5)
        L_0x0324:
            com.google.android.gms.measurement.internal.b7 r10 = r9.C()
            com.google.android.gms.measurement.internal.y4 r0 = r9.A()
            com.google.android.gms.measurement.internal.e5 r0 = r0.f25269g
            java.lang.String r0 = r0.a()
            r10.M(r0)
            boolean r10 = com.google.android.gms.internal.measurement.zznv.zza()
            if (r10 == 0) goto L_0x0375
            com.google.android.gms.measurement.internal.f r10 = r9.f25193g
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r0 = com.google.android.gms.measurement.internal.e0.f24523p0
            boolean r10 = r10.n(r0)
            if (r10 == 0) goto L_0x0375
            com.google.android.gms.measurement.internal.ib r10 = r9.G()
            boolean r10 = r10.R0()
            if (r10 != 0) goto L_0x0375
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.e5 r10 = r10.f25284v
            java.lang.String r10 = r10.a()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0375
            com.google.android.gms.measurement.internal.n4 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.p4 r10 = r10.G()
            java.lang.String r0 = "Remote config removed with active feature rollouts"
            r10.a(r0)
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.e5 r10 = r10.f25284v
            r10.b(r5)
        L_0x0375:
            com.google.android.gms.measurement.internal.i4 r10 = r9.w()
            java.lang.String r10 = r10.B()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0391
            com.google.android.gms.measurement.internal.i4 r10 = r9.w()
            java.lang.String r10 = r10.z()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x03df
        L_0x0391:
            boolean r10 = r9.k()
            com.google.android.gms.measurement.internal.y4 r0 = r9.A()
            boolean r0 = r0.w()
            if (r0 != 0) goto L_0x03b0
            com.google.android.gms.measurement.internal.f r0 = r9.f25193g
            boolean r0 = r0.M()
            if (r0 != 0) goto L_0x03b0
            com.google.android.gms.measurement.internal.y4 r0 = r9.A()
            r1 = r10 ^ 1
            r0.z(r1)
        L_0x03b0:
            if (r10 == 0) goto L_0x03b9
            com.google.android.gms.measurement.internal.b7 r10 = r9.C()
            r10.i0()
        L_0x03b9:
            com.google.android.gms.measurement.internal.da r10 = r9.F()
            com.google.android.gms.measurement.internal.la r10 = r10.f24486e
            r10.a()
            com.google.android.gms.measurement.internal.v8 r10 = r9.E()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r10.J(r0)
            com.google.android.gms.measurement.internal.v8 r10 = r9.E()
            com.google.android.gms.measurement.internal.y4 r0 = r9.A()
            com.google.android.gms.measurement.internal.a5 r0 = r0.f25287y
            android.os.Bundle r0 = r0.a()
            r10.x(r0)
        L_0x03df:
            boolean r10 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r10 == 0) goto L_0x040d
            com.google.android.gms.measurement.internal.f r10 = r9.f25193g
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r0 = com.google.android.gms.measurement.internal.e0.M0
            boolean r10 = r10.n(r0)
            if (r10 == 0) goto L_0x040d
            com.google.android.gms.measurement.internal.ib r10 = r9.G()
            boolean r10 = r10.Q0()
            if (r10 == 0) goto L_0x040d
            java.lang.Thread r10 = new java.lang.Thread
            com.google.android.gms.measurement.internal.b7 r0 = r9.C()
            r0.getClass()
            com.google.android.gms.measurement.internal.v5 r1 = new com.google.android.gms.measurement.internal.v5
            r1.<init>(r0)
            r10.<init>(r1)
            r10.start()
        L_0x040d:
            com.google.android.gms.measurement.internal.y4 r10 = r9.A()
            com.google.android.gms.measurement.internal.b5 r10 = r10.f25277o
            r0 = 1
            r10.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w5.b(com.google.android.gms.internal.measurement.zzdd):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str, int i10, Throwable th, byte[] bArr, Map map) {
        if (!((i10 == 200 || i10 == 204 || i10 == 304) && th == null)) {
            zzj().G().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
            return;
        }
        A().f25282t.a(true);
        if (bArr == null || bArr.length == 0) {
            zzj().A().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", MaxReward.DEFAULT_LABEL);
            String optString2 = jSONObject.optString("gclid", MaxReward.DEFAULT_LABEL);
            String optString3 = jSONObject.optString("gbraid", MaxReward.DEFAULT_LABEL);
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                zzj().A().a("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (!zzoi.zza() || !this.f25193g.n(e0.Z0)) {
                if (!G().F0(optString)) {
                    zzj().G().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                }
            } else if (!G().F0(optString)) {
                zzj().G().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } else {
                bundle.putString("gbraid", optString3);
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f25202p.u0("auto", "_cmp", bundle);
            ib G2 = G();
            if (!TextUtils.isEmpty(optString) && G2.c0(optString, optDouble)) {
                G2.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e10) {
            zzj().B().b("Failed to parse the Deferred Deep Link response. exception", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(boolean z10) {
        this.A = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.E++;
    }

    public final boolean j() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean k() {
        return s() == 0;
    }

    public final boolean l() {
        zzl().i();
        return this.D;
    }

    public final boolean m() {
        return TextUtils.isEmpty(this.f25188b);
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        if (this.f25210x) {
            zzl().i();
            Boolean bool = this.f25211y;
            if (bool == null || this.f25212z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f25200n.b() - this.f25212z) > 1000)) {
                this.f25212z = this.f25200n.b();
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(G().z0("android.permission.INTERNET") && G().z0("android.permission.ACCESS_NETWORK_STATE") && (c.a(this.f25187a).g() || this.f25193g.N() || (ib.X(this.f25187a) && ib.Y(this.f25187a, false))));
                this.f25211y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!G().e0(w().B(), w().z()) && TextUtils.isEmpty(w().z())) {
                        z10 = false;
                    }
                    this.f25211y = Boolean.valueOf(z10);
                }
            }
            return this.f25211y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean o() {
        return this.f25191e;
    }

    public final boolean p() {
        zzl().i();
        e(q());
        String A2 = w().A();
        Pair<String, Boolean> p10 = A().p(A2);
        boolean z10 = false;
        if (!this.f25193g.K() || ((Boolean) p10.second).booleanValue() || TextUtils.isEmpty((CharSequence) p10.first)) {
            zzj().A().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        } else if (!q().r()) {
            zzj().G().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (zznp.zza() && this.f25193g.n(e0.U0)) {
                Bundle bundle = null;
                b7 C2 = C();
                C2.i();
                r5.c Q = C2.o().Q();
                if (Q != null) {
                    bundle = Q.f29766a;
                }
                int i10 = 1;
                if (bundle == null) {
                    int i11 = this.F;
                    this.F = i11 + 1;
                    if (i11 < 10) {
                        z10 = true;
                    }
                    p4 A3 = zzj().A();
                    String str = z10 ? "Retrying." : "Skipping.";
                    A3.b("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.F));
                    return z10;
                }
                y6 c10 = y6.c(bundle, 100);
                sb2.append("&gcs=");
                sb2.append(c10.w());
                v b10 = v.b(bundle, 100);
                sb2.append("&dma=");
                sb2.append(b10.g() == Boolean.FALSE ? 0 : 1);
                if (!TextUtils.isEmpty(b10.h())) {
                    sb2.append("&dma_cps=");
                    sb2.append(b10.h());
                }
                if (v.d(bundle) == Boolean.TRUE) {
                    i10 = 0;
                }
                sb2.append("&npa=");
                sb2.append(i10);
                zzj().F().b("Consent query parameters to Bow", sb2);
            }
            ib G2 = G();
            w();
            URL E2 = G2.E(82001, A2, (String) p10.first, A().f25283u.a() - 1, sb2.toString());
            if (E2 != null) {
                k8 q10 = q();
                y5 y5Var = new y5(this);
                q10.i();
                q10.j();
                q.k(E2);
                q.k(y5Var);
                q10.zzl().u(new m8(q10, A2, E2, (byte[]) null, (Map<String, String>) null, y5Var));
            }
            return false;
        }
    }

    public final void r(boolean z10) {
        zzl().i();
        this.D = z10;
    }

    public final int s() {
        zzl().i();
        if (this.f25193g.M()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!l()) {
            return 8;
        }
        Boolean H2 = A().H();
        if (H2 == null) {
            Boolean A2 = this.f25193g.A("firebase_analytics_collection_enabled");
            if (A2 == null) {
                Boolean bool2 = this.B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (this.A == null || this.A.booleanValue()) {
                    return 0;
                } else {
                    return 7;
                }
            } else if (A2.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (H2.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    public final x t() {
        x xVar = this.f25203q;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final f u() {
        return this.f25193g;
    }

    public final y v() {
        e(this.f25208v);
        return this.f25208v;
    }

    public final i4 w() {
        c(this.f25209w);
        return this.f25209w;
    }

    public final l4 x() {
        c(this.f25206t);
        return this.f25206t;
    }

    public final m4 y() {
        return this.f25199m;
    }

    public final n4 z() {
        n4 n4Var = this.f25195i;
        if (n4Var == null || !n4Var.m()) {
            return null;
        }
        return this.f25195i;
    }

    public final Context zza() {
        return this.f25187a;
    }

    public final e zzb() {
        return this.f25200n;
    }

    public final e zzd() {
        return this.f25192f;
    }

    public final n4 zzj() {
        e(this.f25195i);
        return this.f25195i;
    }

    public final q5 zzl() {
        e(this.f25196j);
        return this.f25196j;
    }
}
