package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.measurement.internal.y6;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class i4 extends y2 {

    /* renamed from: c  reason: collision with root package name */
    private String f24652c;

    /* renamed from: d  reason: collision with root package name */
    private String f24653d;

    /* renamed from: e  reason: collision with root package name */
    private int f24654e;

    /* renamed from: f  reason: collision with root package name */
    private String f24655f;

    /* renamed from: g  reason: collision with root package name */
    private String f24656g;

    /* renamed from: h  reason: collision with root package name */
    private long f24657h;

    /* renamed from: i  reason: collision with root package name */
    private long f24658i;

    /* renamed from: j  reason: collision with root package name */
    private List<String> f24659j;

    /* renamed from: k  reason: collision with root package name */
    private String f24660k;

    /* renamed from: l  reason: collision with root package name */
    private int f24661l;

    /* renamed from: m  reason: collision with root package name */
    private String f24662m;

    /* renamed from: n  reason: collision with root package name */
    private String f24663n;

    /* renamed from: o  reason: collision with root package name */
    private String f24664o;

    /* renamed from: p  reason: collision with root package name */
    private long f24665p = 0;

    /* renamed from: q  reason: collision with root package name */
    private String f24666q = null;

    i4(w5 w5Var, long j10) {
        super(w5Var);
        this.f24658i = j10;
    }

    private final String E() {
        if (!zzqe.zza() || !a().n(e0.f24519n0)) {
            try {
                Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{zza()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        zzj().H().a("Failed to retrieve Firebase Instance Id");
                        return null;
                    }
                } catch (Exception unused2) {
                    zzj().I().a("Failed to obtain Firebase Analytics instance");
                    return null;
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            zzj().F().a("Disabled IID for tests.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String A() {
        q();
        q.k(this.f24652c);
        return this.f24652c;
    }

    /* access modifiers changed from: package-private */
    public final String B() {
        i();
        q();
        q.k(this.f24662m);
        return this.f24662m;
    }

    /* access modifiers changed from: package-private */
    public final List<String> C() {
        return this.f24659j;
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        String str;
        i();
        if (!e().E().l(y6.a.ANALYTICS_STORAGE)) {
            zzj().A().a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            f().P0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        p4 A = zzj().A();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        A.a(String.format("Resetting session stitching token to %s", objArr));
        this.f24664o = str;
        this.f24665p = zzb().a();
    }

    /* access modifiers changed from: package-private */
    public final boolean F(String str) {
        String str2 = this.f24666q;
        boolean z10 = str2 != null && !str2.equals(str);
        this.f24666q = str;
        return z10;
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
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018b A[Catch:{ IllegalStateException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018c A[Catch:{ IllegalStateException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0195 A[Catch:{ IllegalStateException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ae A[Catch:{ IllegalStateException -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.zza()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.B()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.b(r9, r8)
        L_0x002c:
            r8 = r2
            goto L_0x008e
        L_0x002e:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0033 }
            goto L_0x0044
        L_0x0033:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.B()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.n4.q(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.b(r9, r8)
        L_0x0044:
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = "manual_install"
            goto L_0x0052
        L_0x0049:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0052
            r5 = r3
        L_0x0052:
            android.content.Context r7 = r11.zza()     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007a }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r7 == 0) goto L_0x002c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r9 != 0) goto L_0x0071
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x007a }
            goto L_0x0072
        L_0x0071:
            r8 = r2
        L_0x0072:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0077 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0077 }
            goto L_0x008e
        L_0x0077:
            r7 = r2
            r2 = r8
            goto L_0x007b
        L_0x007a:
            r7 = r2
        L_0x007b:
            com.google.android.gms.measurement.internal.n4 r8 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r8 = r8.B()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.n4.q(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.c(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x008e:
            r11.f24652c = r0
            r11.f24655f = r5
            r11.f24653d = r2
            r11.f24654e = r6
            r11.f24656g = r8
            r5 = 0
            r11.f24657h = r5
            com.google.android.gms.measurement.internal.w5 r2 = r11.f25124a
            java.lang.String r2 = r2.H()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r5 = 1
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.measurement.internal.w5 r2 = r11.f25124a
            java.lang.String r2 = r2.I()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00b9
            r2 = 1
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            com.google.android.gms.measurement.internal.w5 r6 = r11.f25124a
            int r6 = r6.s()
            switch(r6) {
                case 0: goto L_0x0150;
                case 1: goto L_0x0142;
                case 2: goto L_0x0134;
                case 3: goto L_0x0126;
                case 4: goto L_0x0118;
                case 5: goto L_0x010a;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00ee;
                case 8: goto L_0x00df;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled"
            r7.a(r8)
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.D()
            java.lang.String r8 = "Invalid scion state in identity"
            r7.a(r8)
            goto L_0x015d
        L_0x00df:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.a(r8)
            goto L_0x015d
        L_0x00ee:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.a(r8)
            goto L_0x015d
        L_0x00fc:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.H()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.a(r8)
            goto L_0x015d
        L_0x010a:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.F()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.a(r8)
            goto L_0x015d
        L_0x0118:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.a(r8)
            goto L_0x015d
        L_0x0126:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.E()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.a(r8)
            goto L_0x015d
        L_0x0134:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.F()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.a(r8)
            goto L_0x015d
        L_0x0142:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.E()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.a(r8)
            goto L_0x015d
        L_0x0150:
            com.google.android.gms.measurement.internal.n4 r7 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r7 = r7.F()
            java.lang.String r8 = "App measurement collection enabled"
            r7.a(r8)
        L_0x015d:
            if (r6 != 0) goto L_0x0161
            r6 = 1
            goto L_0x0162
        L_0x0161:
            r6 = 0
        L_0x0162:
            r11.f24662m = r3
            r11.f24663n = r3
            if (r2 == 0) goto L_0x0170
            com.google.android.gms.measurement.internal.w5 r2 = r11.f25124a
            java.lang.String r2 = r2.H()
            r11.f24663n = r2
        L_0x0170:
            android.content.Context r2 = r11.zza()     // Catch:{ IllegalStateException -> 0x01cb }
            com.google.android.gms.measurement.internal.w5 r7 = r11.f25124a     // Catch:{ IllegalStateException -> 0x01cb }
            java.lang.String r7 = r7.K()     // Catch:{ IllegalStateException -> 0x01cb }
            java.lang.String r8 = "google_app_id"
            r5.p r9 = new r5.p     // Catch:{ IllegalStateException -> 0x01cb }
            r9.<init>(r2, r7)     // Catch:{ IllegalStateException -> 0x01cb }
            java.lang.String r2 = r9.b(r8)     // Catch:{ IllegalStateException -> 0x01cb }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01cb }
            if (r7 == 0) goto L_0x018c
            goto L_0x018d
        L_0x018c:
            r3 = r2
        L_0x018d:
            r11.f24662m = r3     // Catch:{ IllegalStateException -> 0x01cb }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01cb }
            if (r2 != 0) goto L_0x01ac
            r5.p r2 = new r5.p     // Catch:{ IllegalStateException -> 0x01cb }
            android.content.Context r3 = r11.zza()     // Catch:{ IllegalStateException -> 0x01cb }
            com.google.android.gms.measurement.internal.w5 r7 = r11.f25124a     // Catch:{ IllegalStateException -> 0x01cb }
            java.lang.String r7 = r7.K()     // Catch:{ IllegalStateException -> 0x01cb }
            r2.<init>(r3, r7)     // Catch:{ IllegalStateException -> 0x01cb }
            java.lang.String r3 = "admob_app_id"
            java.lang.String r2 = r2.b(r3)     // Catch:{ IllegalStateException -> 0x01cb }
            r11.f24663n = r2     // Catch:{ IllegalStateException -> 0x01cb }
        L_0x01ac:
            if (r6 == 0) goto L_0x01dd
            com.google.android.gms.measurement.internal.n4 r2 = r11.zzj()     // Catch:{ IllegalStateException -> 0x01cb }
            com.google.android.gms.measurement.internal.p4 r2 = r2.F()     // Catch:{ IllegalStateException -> 0x01cb }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r11.f24652c     // Catch:{ IllegalStateException -> 0x01cb }
            java.lang.String r7 = r11.f24662m     // Catch:{ IllegalStateException -> 0x01cb }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x01cb }
            if (r7 == 0) goto L_0x01c5
            java.lang.String r7 = r11.f24663n     // Catch:{ IllegalStateException -> 0x01cb }
            goto L_0x01c7
        L_0x01c5:
            java.lang.String r7 = r11.f24662m     // Catch:{ IllegalStateException -> 0x01cb }
        L_0x01c7:
            r2.c(r3, r6, r7)     // Catch:{ IllegalStateException -> 0x01cb }
            goto L_0x01dd
        L_0x01cb:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n4 r3 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r3 = r3.B()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.n4.q(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r3.c(r6, r0, r2)
        L_0x01dd:
            r0 = 0
            r11.f24659j = r0
            com.google.android.gms.measurement.internal.f r0 = r11.a()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.D(r2)
            if (r0 == 0) goto L_0x021e
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0201
            com.google.android.gms.measurement.internal.n4 r2 = r11.zzj()
            com.google.android.gms.measurement.internal.p4 r2 = r2.H()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r2.a(r3)
        L_0x01ff:
            r5 = 0
            goto L_0x021e
        L_0x0201:
            java.util.Iterator r2 = r0.iterator()
        L_0x0205:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x021e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.ib r6 = r11.f()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.r0(r7, r3)
            if (r3 != 0) goto L_0x0205
            goto L_0x01ff
        L_0x021e:
            if (r5 == 0) goto L_0x0222
            r11.f24659j = r0
        L_0x0222:
            if (r1 == 0) goto L_0x022f
            android.content.Context r0 = r11.zza()
            boolean r0 = o5.a.a(r0)
            r11.f24661l = r0
            return
        L_0x022f:
            r11.f24661l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.t():void");
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.lb w(java.lang.String r47) {
        /*
            r46 = this;
            r0 = r46
            r46.i()
            com.google.android.gms.measurement.internal.y4 r1 = r46.e()
            com.google.android.gms.measurement.internal.y6 r1 = r1.E()
            boolean r2 = com.google.android.gms.internal.measurement.zznp.zza()
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.measurement.internal.f r2 = r46.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.e0.S0
            boolean r2 = r2.n(r3)
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.measurement.internal.y4 r2 = r46.e()
            com.google.android.gms.measurement.internal.v r2 = r2.D()
            java.lang.String r2 = r2.i()
            int r3 = r1.b()
            r39 = r2
            r38 = r3
            goto L_0x003c
        L_0x0034:
            java.lang.String r2 = ""
            r3 = 100
            r39 = r2
            r38 = 100
        L_0x003c:
            com.google.android.gms.measurement.internal.lb r2 = new com.google.android.gms.measurement.internal.lb
            java.lang.String r5 = r46.A()
            java.lang.String r6 = r46.B()
            r46.q()
            java.lang.String r7 = r0.f24653d
            int r3 = r46.y()
            long r8 = (long) r3
            r46.q()
            java.lang.String r3 = r0.f24655f
            com.google.android.gms.common.internal.q.k(r3)
            java.lang.String r10 = r0.f24655f
            r46.q()
            r46.i()
            long r3 = r0.f24657h
            r13 = 0
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0080
            com.google.android.gms.measurement.internal.w5 r3 = r0.f25124a
            com.google.android.gms.measurement.internal.ib r3 = r3.G()
            android.content.Context r4 = r46.zza()
            android.content.Context r15 = r46.zza()
            java.lang.String r15 = r15.getPackageName()
            long r3 = r3.u(r4, r15)
            r0.f24657h = r3
        L_0x0080:
            long r3 = r0.f24657h
            com.google.android.gms.measurement.internal.w5 r15 = r0.f25124a
            boolean r16 = r15.k()
            com.google.android.gms.measurement.internal.y4 r15 = r46.e()
            boolean r15 = r15.f25280r
            r17 = r15 ^ 1
            r46.i()
            com.google.android.gms.measurement.internal.w5 r15 = r0.f25124a
            boolean r15 = r15.k()
            r18 = 0
            if (r15 != 0) goto L_0x00a0
            r19 = r18
            goto L_0x00a6
        L_0x00a0:
            java.lang.String r15 = r46.E()
            r19 = r15
        L_0x00a6:
            r20 = 0
            com.google.android.gms.measurement.internal.w5 r15 = r0.f25124a
            com.google.android.gms.measurement.internal.y4 r11 = r15.A()
            com.google.android.gms.measurement.internal.d5 r11 = r11.f25267e
            long r11 = r11.a()
            int r24 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r24 != 0) goto L_0x00bb
            long r11 = r15.H
            goto L_0x00c1
        L_0x00bb:
            long r13 = r15.H
            long r11 = java.lang.Math.min(r13, r11)
        L_0x00c1:
            r26 = r11
            int r28 = r46.x()
            com.google.android.gms.measurement.internal.f r11 = r46.a()
            boolean r29 = r11.K()
            com.google.android.gms.measurement.internal.y4 r11 = r46.e()
            r11.i()
            android.content.SharedPreferences r11 = r11.A()
            java.lang.String r12 = "deferred_analytics_collection"
            r13 = 0
            boolean r30 = r11.getBoolean(r12, r13)
            java.lang.String r31 = r46.z()
            com.google.android.gms.measurement.internal.f r11 = r46.a()
            java.lang.String r12 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r11 = r11.A(r12)
            if (r11 != 0) goto L_0x00f4
            r32 = r18
            goto L_0x0100
        L_0x00f4:
            boolean r11 = r11.booleanValue()
            r11 = r11 ^ 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r32 = r11
        L_0x0100:
            long r14 = r0.f24658i
            java.util.List<java.lang.String> r11 = r0.f24659j
            r33 = 0
            java.lang.String r1 = r1.v()
            java.lang.String r12 = r0.f24660k
            if (r12 != 0) goto L_0x0118
            com.google.android.gms.measurement.internal.ib r12 = r46.f()
            java.lang.String r12 = r12.N0()
            r0.f24660k = r12
        L_0x0118:
            java.lang.String r12 = r0.f24660k
            boolean r34 = com.google.android.gms.internal.measurement.zzps.zza()
            if (r34 == 0) goto L_0x0167
            com.google.android.gms.measurement.internal.f r13 = r46.a()
            r35 = r3
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.e0.f24539x0
            boolean r3 = r13.n(r3)
            if (r3 == 0) goto L_0x0169
            r46.i()
            long r3 = r0.f24665p
            r24 = 0
            int r13 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r13 == 0) goto L_0x015a
            m5.e r3 = r46.zzb()
            long r3 = r3.a()
            r13 = r11
            r37 = r12
            long r11 = r0.f24665p
            long r3 = r3 - r11
            java.lang.String r11 = r0.f24664o
            if (r11 == 0) goto L_0x015d
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r18 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r18 <= 0) goto L_0x015d
            java.lang.String r3 = r0.f24666q
            if (r3 != 0) goto L_0x015d
            r46.D()
            goto L_0x015d
        L_0x015a:
            r13 = r11
            r37 = r12
        L_0x015d:
            java.lang.String r3 = r0.f24664o
            if (r3 != 0) goto L_0x0164
            r46.D()
        L_0x0164:
            java.lang.String r3 = r0.f24664o
            goto L_0x0170
        L_0x0167:
            r35 = r3
        L_0x0169:
            r13 = r11
            r37 = r12
            r24 = 0
            r3 = r18
        L_0x0170:
            com.google.android.gms.measurement.internal.f r4 = r46.a()
            java.lang.String r11 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r4 = r4.A(r11)
            if (r4 != 0) goto L_0x017f
            r40 = 0
            goto L_0x0185
        L_0x017f:
            boolean r4 = r4.booleanValue()
            r40 = r4
        L_0x0185:
            com.google.android.gms.measurement.internal.ib r4 = r46.f()
            java.lang.String r11 = r46.A()
            long r41 = r4.u0(r11)
            boolean r4 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r4 == 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.f r4 = r46.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.e0.M0
            boolean r4 = r4.n(r11)
            if (r4 == 0) goto L_0x01ad
            r46.f()
            int r4 = com.google.android.gms.measurement.internal.ib.t0()
            r43 = r4
            goto L_0x01af
        L_0x01ad:
            r43 = 0
        L_0x01af:
            boolean r4 = com.google.android.gms.internal.measurement.zzpg.zza()
            if (r4 == 0) goto L_0x01cc
            com.google.android.gms.measurement.internal.f r4 = r46.a()
            com.google.android.gms.measurement.internal.h4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.e0.M0
            boolean r4 = r4.n(r11)
            if (r4 == 0) goto L_0x01cc
            com.google.android.gms.measurement.internal.ib r4 = r46.f()
            long r11 = r4.D0()
            r44 = r11
            goto L_0x01ce
        L_0x01cc:
            r44 = r24
        L_0x01ce:
            r24 = r35
            r4 = r2
            r34 = r13
            r35 = r37
            r11 = 82001(0x14051, double:4.0514E-319)
            r36 = r14
            r13 = r24
            r15 = r47
            r18 = r19
            r19 = r20
            r21 = r26
            r23 = r28
            r24 = r29
            r25 = r30
            r26 = r31
            r27 = r32
            r28 = r36
            r30 = r34
            r31 = r33
            r32 = r1
            r33 = r35
            r34 = r3
            r35 = r40
            r36 = r41
            r40 = r43
            r41 = r44
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (long) r8, (java.lang.String) r10, (long) r11, (long) r13, (java.lang.String) r15, (boolean) r16, (boolean) r17, (java.lang.String) r18, (long) r19, (long) r21, (int) r23, (boolean) r24, (boolean) r25, (java.lang.String) r26, (java.lang.Boolean) r27, (long) r28, (java.util.List<java.lang.String>) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (java.lang.String) r34, (boolean) r35, (long) r36, (int) r38, (java.lang.String) r39, (int) r40, (long) r41)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i4.w(java.lang.String):com.google.android.gms.measurement.internal.lb");
    }

    /* access modifiers changed from: package-private */
    public final int x() {
        q();
        return this.f24661l;
    }

    /* access modifiers changed from: package-private */
    public final int y() {
        q();
        return this.f24654e;
    }

    /* access modifiers changed from: package-private */
    public final String z() {
        q();
        return this.f24663n;
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
