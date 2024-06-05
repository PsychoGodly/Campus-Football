package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.internal.q;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m5.e;
import r5.c0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class o8 extends y2 {

    /* renamed from: c  reason: collision with root package name */
    private volatile p8 f24891c;

    /* renamed from: d  reason: collision with root package name */
    private volatile p8 f24892d;

    /* renamed from: e  reason: collision with root package name */
    protected p8 f24893e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Activity, p8> f24894f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private Activity f24895g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f24896h;

    /* renamed from: i  reason: collision with root package name */
    private volatile p8 f24897i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public p8 f24898j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f24899k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f24900l = new Object();

    public o8(w5 w5Var) {
        super(w5Var);
    }

    private final void B(Activity activity, p8 p8Var, boolean z10) {
        p8 p8Var2;
        p8 p8Var3 = p8Var;
        p8 p8Var4 = this.f24891c == null ? this.f24892d : this.f24891c;
        if (p8Var3.f24933b == null) {
            p8Var2 = new p8(p8Var3.f24932a, activity != null ? y(activity.getClass(), "Activity") : null, p8Var3.f24934c, p8Var3.f24936e, p8Var3.f24937f);
        } else {
            p8Var2 = p8Var3;
        }
        this.f24892d = this.f24891c;
        this.f24891c = p8Var2;
        zzl().y(new s8(this, p8Var2, p8Var4, zzb().b(), z10));
    }

    static /* synthetic */ void E(o8 o8Var, Bundle bundle, p8 p8Var, p8 p8Var2, long j10) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        o8Var.I(p8Var, p8Var2, j10, true, o8Var.f().z((String) null, "screen_view", bundle, (List<String>) null, false));
    }

    /* access modifiers changed from: private */
    public final void I(p8 p8Var, p8 p8Var2, long j10, boolean z10, Bundle bundle) {
        Bundle bundle2;
        long j11;
        p8 p8Var3 = p8Var;
        p8 p8Var4 = p8Var2;
        long j12 = j10;
        Bundle bundle3 = bundle;
        i();
        boolean z11 = false;
        boolean z12 = p8Var4 == null || p8Var4.f24934c != p8Var3.f24934c || !c0.a(p8Var4.f24933b, p8Var3.f24933b) || !c0.a(p8Var4.f24932a, p8Var3.f24932a);
        if (z10 && this.f24893e != null) {
            z11 = true;
        }
        if (z12) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            ib.R(p8Var3, bundle4, true);
            if (p8Var4 != null) {
                String str = p8Var4.f24932a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = p8Var4.f24933b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", p8Var4.f24934c);
            }
            if (z11) {
                long a10 = p().f24487f.a(j12);
                if (a10 > 0) {
                    f().G(bundle4, a10);
                }
            }
            if (!a().L()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = p8Var3.f24936e ? "app" : "auto";
            long a11 = zzb().a();
            if (p8Var3.f24936e) {
                long j13 = p8Var3.f24937f;
                if (j13 != 0) {
                    j11 = j13;
                    m().N(str3, "_vs", j11, bundle4);
                }
            }
            j11 = a11;
            m().N(str3, "_vs", j11, bundle4);
        }
        if (z11) {
            J(this.f24893e, true, j12);
        }
        this.f24893e = p8Var3;
        if (p8Var3.f24936e) {
            this.f24898j = p8Var3;
        }
        o().E(p8Var3);
    }

    /* access modifiers changed from: private */
    public final void J(p8 p8Var, boolean z10, long j10) {
        j().q(zzb().b());
        if (p().z(p8Var != null && p8Var.f24935d, z10, j10) && p8Var != null) {
            p8Var.f24935d = false;
        }
    }

    private final p8 O(Activity activity) {
        q.k(activity);
        p8 p8Var = this.f24894f.get(activity);
        if (p8Var == null) {
            p8 p8Var2 = new p8((String) null, y(activity.getClass(), "Activity"), f().K0());
            this.f24894f.put(activity, p8Var2);
            p8Var = p8Var2;
        }
        return this.f24897i != null ? this.f24897i : p8Var;
    }

    private final String y(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : MaxReward.DEFAULT_LABEL;
        return str2.length() > a().o((String) null) ? str2.substring(0, a().o((String) null)) : str2;
    }

    public final void A(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (a().L() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f24894f.put(activity, new p8(bundle2.getString(MediationMetaData.KEY_NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @Deprecated
    public final void C(Activity activity, String str, String str2) {
        if (!a().L()) {
            zzj().H().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        p8 p8Var = this.f24891c;
        if (p8Var == null) {
            zzj().H().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f24894f.get(activity) == null) {
            zzj().H().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = y(activity.getClass(), "Activity");
            }
            boolean a10 = c0.a(p8Var.f24933b, str2);
            boolean a11 = c0.a(p8Var.f24932a, str);
            if (a10 && a11) {
                zzj().H().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > a().o((String) null))) {
                zzj().H().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= a().o((String) null))) {
                zzj().F().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                p8 p8Var2 = new p8(str, str2, f().K0());
                this.f24894f.put(activity, p8Var2);
                B(activity, p8Var2, true);
            } else {
                zzj().H().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        r0 = zzj().F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
        if (r3 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if (r4 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        r5 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d7, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
        r0.c("Logging screen view with name, class", r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (r12.f24891c != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r0 = r12.f24892d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r0 = r12.f24891c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        r2 = new com.google.android.gms.measurement.internal.p8(r3, r4, f().K0(), true, r14);
        r12.f24891c = r2;
        r12.f24892d = r0;
        r12.f24897i = r2;
        zzl().y(new com.google.android.gms.measurement.internal.q8(r12, r13, r2, r0, zzb().b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0113, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f24900l
            monitor-enter(r0)
            boolean r1 = r12.f24899k     // Catch:{ all -> 0x0114 }
            if (r1 != 0) goto L_0x0016
            com.google.android.gms.measurement.internal.n4 r13 = r12.zzj()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.p4 r13 = r13.H()     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.a(r14)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x0016:
            r1 = 0
            if (r13 == 0) goto L_0x0082
            java.lang.String r2 = "screen_name"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x004c
            int r3 = r2.length()     // Catch:{ all -> 0x0114 }
            if (r3 <= 0) goto L_0x0035
            int r3 = r2.length()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.f r4 = r12.a()     // Catch:{ all -> 0x0114 }
            int r4 = r4.o(r1)     // Catch:{ all -> 0x0114 }
            if (r3 <= r4) goto L_0x004c
        L_0x0035:
            com.google.android.gms.measurement.internal.n4 r13 = r12.zzj()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.p4 r13 = r13.H()     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x0114 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0114 }
            r13.b(r14, r15)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x004c:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r13.getString(r3)     // Catch:{ all -> 0x0114 }
            if (r3 == 0) goto L_0x007f
            int r4 = r3.length()     // Catch:{ all -> 0x0114 }
            if (r4 <= 0) goto L_0x0068
            int r4 = r3.length()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.f r5 = r12.a()     // Catch:{ all -> 0x0114 }
            int r1 = r5.o(r1)     // Catch:{ all -> 0x0114 }
            if (r4 <= r1) goto L_0x007f
        L_0x0068:
            com.google.android.gms.measurement.internal.n4 r13 = r12.zzj()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.p4 r13 = r13.H()     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x0114 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0114 }
            r13.b(r14, r15)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x007f:
            r1 = r3
            r3 = r2
            goto L_0x0083
        L_0x0082:
            r3 = r1
        L_0x0083:
            if (r1 != 0) goto L_0x0096
            android.app.Activity r1 = r12.f24895g     // Catch:{ all -> 0x0114 }
            if (r1 == 0) goto L_0x0094
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.y(r1, r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0096
        L_0x0094:
            java.lang.String r1 = "Activity"
        L_0x0096:
            r4 = r1
            com.google.android.gms.measurement.internal.p8 r1 = r12.f24891c     // Catch:{ all -> 0x0114 }
            boolean r2 = r12.f24896h     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x00c1
            if (r1 == 0) goto L_0x00c1
            r2 = 0
            r12.f24896h = r2     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = r1.f24933b     // Catch:{ all -> 0x0114 }
            boolean r2 = r5.c0.a(r2, r4)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = r1.f24932a     // Catch:{ all -> 0x0114 }
            boolean r1 = r5.c0.a(r1, r3)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x00c1
            if (r1 == 0) goto L_0x00c1
            com.google.android.gms.measurement.internal.n4 r13 = r12.zzj()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.p4 r13 = r13.H()     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.a(r14)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x00c1:
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.n4 r0 = r12.zzj()
            com.google.android.gms.measurement.internal.p4 r0 = r0.F()
            java.lang.String r1 = "Logging screen view with name, class"
            if (r3 != 0) goto L_0x00d1
            java.lang.String r2 = "null"
            goto L_0x00d2
        L_0x00d1:
            r2 = r3
        L_0x00d2:
            if (r4 != 0) goto L_0x00d7
            java.lang.String r5 = "null"
            goto L_0x00d8
        L_0x00d7:
            r5 = r4
        L_0x00d8:
            r0.c(r1, r2, r5)
            com.google.android.gms.measurement.internal.p8 r0 = r12.f24891c
            if (r0 != 0) goto L_0x00e2
            com.google.android.gms.measurement.internal.p8 r0 = r12.f24892d
            goto L_0x00e4
        L_0x00e2:
            com.google.android.gms.measurement.internal.p8 r0 = r12.f24891c
        L_0x00e4:
            com.google.android.gms.measurement.internal.p8 r1 = new com.google.android.gms.measurement.internal.p8
            com.google.android.gms.measurement.internal.ib r2 = r12.f()
            long r5 = r2.K0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f24891c = r1
            r12.f24892d = r0
            r12.f24897i = r1
            m5.e r14 = r12.zzb()
            long r10 = r14.b()
            com.google.android.gms.measurement.internal.q5 r14 = r12.zzl()
            com.google.android.gms.measurement.internal.q8 r15 = new com.google.android.gms.measurement.internal.q8
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.y(r15)
            return
        L_0x0114:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.o8.D(android.os.Bundle, long):void");
    }

    public final p8 K() {
        return this.f24891c;
    }

    public final void L(Activity activity) {
        synchronized (this.f24900l) {
            this.f24899k = false;
            this.f24896h = true;
        }
        long b10 = zzb().b();
        if (!a().L()) {
            this.f24891c = null;
            zzl().y(new u8(this, b10));
            return;
        }
        p8 O = O(activity);
        this.f24892d = this.f24891c;
        this.f24891c = null;
        zzl().y(new t8(this, O, b10));
    }

    public final void M(Activity activity, Bundle bundle) {
        p8 p8Var;
        if (a().L() && bundle != null && (p8Var = this.f24894f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", p8Var.f24934c);
            bundle2.putString(MediationMetaData.KEY_NAME, p8Var.f24932a);
            bundle2.putString("referrer_name", p8Var.f24933b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void N(Activity activity) {
        synchronized (this.f24900l) {
            this.f24899k = true;
            if (activity != this.f24895g) {
                synchronized (this.f24900l) {
                    this.f24895g = activity;
                    this.f24896h = false;
                }
                if (a().L()) {
                    this.f24897i = null;
                    zzl().y(new w8(this));
                }
            }
        }
        if (!a().L()) {
            this.f24891c = this.f24897i;
            zzl().y(new r8(this));
            return;
        }
        B(activity, O(activity), false);
        x j10 = j();
        j10.zzl().y(new w0(j10, j10.zzb().b()));
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
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

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final p8 x(boolean z10) {
        q();
        i();
        if (!z10) {
            return this.f24893e;
        }
        p8 p8Var = this.f24893e;
        return p8Var != null ? p8Var : this.f24898j;
    }

    public final void z(Activity activity) {
        synchronized (this.f24900l) {
            if (activity == this.f24895g) {
                this.f24895g = null;
            }
        }
        if (a().L()) {
            this.f24894f.remove(activity);
        }
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
