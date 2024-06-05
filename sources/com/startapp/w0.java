package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.SystemClock;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinEventTypes;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.components.x;
import com.startapp.t1;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Sta */
public abstract class w0 {

    /* renamed from: i0  reason: collision with root package name */
    public static final Collection<Integer> f17443i0;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K = "android";
    public int L;
    public int M;
    public float N;
    public Boolean O;
    public int P = 3;
    public String Q;
    public String R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public String X;
    public String Y;
    public final int Z;

    /* renamed from: a  reason: collision with root package name */
    public String f17444a;

    /* renamed from: a0  reason: collision with root package name */
    public Long f17445a0;

    /* renamed from: b  reason: collision with root package name */
    public String f17446b;

    /* renamed from: b0  reason: collision with root package name */
    public Integer f17447b0;

    /* renamed from: c  reason: collision with root package name */
    public String f17448c = "4.10.12";

    /* renamed from: c0  reason: collision with root package name */
    public Boolean f17449c0;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f17450d = new TreeMap();

    /* renamed from: d0  reason: collision with root package name */
    public Boolean f17451d0;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, ?> f17452e;

    /* renamed from: e0  reason: collision with root package name */
    public Boolean f17453e0;

    /* renamed from: f  reason: collision with root package name */
    public String f17454f;

    /* renamed from: f0  reason: collision with root package name */
    public Boolean f17455f0;

    /* renamed from: g  reason: collision with root package name */
    public u f17456g;

    /* renamed from: g0  reason: collision with root package name */
    public e0 f17457g0;

    /* renamed from: h  reason: collision with root package name */
    public String f17458h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f17459h0;

    /* renamed from: i  reason: collision with root package name */
    public String f17460i;

    /* renamed from: j  reason: collision with root package name */
    public String f17461j;

    /* renamed from: k  reason: collision with root package name */
    public String f17462k;

    /* renamed from: l  reason: collision with root package name */
    public String f17463l;

    /* renamed from: m  reason: collision with root package name */
    public String f17464m;

    /* renamed from: n  reason: collision with root package name */
    public String f17465n;

    /* renamed from: o  reason: collision with root package name */
    public String f17466o;

    /* renamed from: p  reason: collision with root package name */
    public String f17467p;

    /* renamed from: q  reason: collision with root package name */
    public Boolean f17468q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f17469r;

    /* renamed from: s  reason: collision with root package name */
    public String f17470s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f17471t;

    /* renamed from: u  reason: collision with root package name */
    public int f17472u;

    /* renamed from: v  reason: collision with root package name */
    public String f17473v;

    /* renamed from: w  reason: collision with root package name */
    public String f17474w;

    /* renamed from: x  reason: collision with root package name */
    public String f17475x;

    /* renamed from: y  reason: collision with root package name */
    public String f17476y;

    /* renamed from: z  reason: collision with root package name */
    public String f17477z;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            arrayList.add(23);
        }
        if (i10 >= 26) {
            arrayList.add(22);
        }
        if (i10 >= 23) {
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(7);
            arrayList.add(8);
        }
        f17443i0 = Collections.unmodifiableCollection(arrayList);
    }

    public w0(int i10) {
        new HashMap();
        this.Z = i10;
    }

    public void a(String str) {
        this.Y = str;
    }

    public boolean a() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        r2 = r2.getActiveNetworkInfo();
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013e A[SYNTHETIC, Splitter:B:59:0x013e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r6, com.startapp.sdk.adsbase.model.AdPreferences r7) {
        /*
            r5 = this;
            com.startapp.t7 r0 = com.startapp.t7.f17299d
            java.lang.String r0 = r0.f17300a
            r5.Q = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r5.f17463l = r0
            java.lang.String r0 = android.os.Build.MODEL
            r5.f17462k = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r5.f17464m = r0
            if (r7 == 0) goto L_0x001e
            java.lang.String r7 = r7.getAge(r6)
            r5.f17454f = r7
        L_0x001e:
            com.startapp.sdk.components.ComponentLocator r7 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r6)
            com.startapp.n4<com.startapp.b8> r7 = r7.f17152o
            java.lang.Object r7 = r7.a()
            com.startapp.b8 r7 = (com.startapp.b8) r7
            java.lang.Object r7 = r7.b()
            com.startapp.a8 r7 = (com.startapp.a8) r7
            java.lang.String r7 = r7.f15609a
            r5.f17460i = r7
            int r7 = com.startapp.a0.f15596a
            r7 = 0
            r0 = 0
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r6.getPackageName()     // Catch:{ all -> 0x0047 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r1.versionName     // Catch:{ all -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r1 = r7
        L_0x0048:
            r5.R = r1
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r6.getPackageName()     // Catch:{ all -> 0x0059 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0059 }
            int r1 = r1.versionCode     // Catch:{ all -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r5.S = r1
            boolean r1 = com.startapp.a0.b((android.content.Context) r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r5.f17468q = r1
            r1 = 1
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0084 }
            r3 = 17
            java.lang.String r4 = "adb_enabled"
            if (r2 >= r3) goto L_0x0078
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch:{ all -> 0x0084 }
            int r2 = android.provider.Settings.Secure.getInt(r2, r4, r0)     // Catch:{ all -> 0x0084 }
            goto L_0x0080
        L_0x0078:
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch:{ all -> 0x0084 }
            int r2 = android.provider.Settings.Global.getInt(r2, r4, r0)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            if (r2 == 0) goto L_0x0084
            r2 = 1
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            r5.T = r2
            boolean r2 = com.startapp.v6.a(r6)     // Catch:{ all -> 0x008c }
            goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            r5.U = r2
            boolean r2 = com.startapp.a0.c(r6)
            r5.V = r2
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r6.getSystemService(r2)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 == 0) goto L_0x00bc
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r3 = com.startapp.a0.a((android.content.Context) r6, (java.lang.String) r3)
            if (r3 == 0) goto L_0x00bc
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L_0x00bc
            boolean r3 = r2.isConnected()
            if (r3 == 0) goto L_0x00bc
            boolean r2 = r2.isRoaming()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x00bd
        L_0x00bc:
            r2 = r7
        L_0x00bd:
            r5.f17469r = r2
            boolean r2 = com.startapp.j9.f((android.content.Context) r6)
            r5.W = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 13
            if (r2 >= r3) goto L_0x00cc
            goto L_0x00e5
        L_0x00cc:
            java.lang.String r2 = "uimode"
            java.lang.Object r2 = r6.getSystemService(r2)     // Catch:{ all -> 0x00e1 }
            boolean r3 = r2 instanceof android.app.UiModeManager     // Catch:{ all -> 0x00e1 }
            if (r3 == 0) goto L_0x00e5
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2     // Catch:{ all -> 0x00e1 }
            int r2 = r2.getCurrentModeType()     // Catch:{ all -> 0x00e1 }
            r3 = 4
            if (r2 != r3) goto L_0x00e5
            r0 = 1
            goto L_0x00e5
        L_0x00e1:
            r1 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r1)
        L_0x00e5:
            r5.f17459h0 = r0
            android.content.res.Resources r0 = r6.getResources()
            if (r0 == 0) goto L_0x00ff
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L_0x00ff
            int r1 = r0.widthPixels
            r5.L = r1
            int r1 = r0.heightPixels
            r5.M = r1
            float r0 = r0.density
            r5.N = r0
        L_0x00ff:
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r6)
            com.startapp.y4 r1 = r0.p()
            java.lang.Object r1 = r1.b()
            com.startapp.x4 r1 = (com.startapp.x4) r1
            java.lang.String r2 = r1.f17531a
            r5.f17465n = r2
            java.lang.String r1 = r1.f17532b
            r5.f17466o = r1
            com.startapp.n4<com.startapp.x3> r1 = r0.f17141d
            java.lang.Object r1 = r1.a()
            com.startapp.x3 r1 = (com.startapp.x3) r1
            java.lang.Object r1 = r1.b()
            com.startapp.w3 r1 = (com.startapp.w3) r1
            java.lang.String r1 = r1.f17484a
            r5.f17467p = r1
            com.startapp.sdk.adsbase.e r0 = r0.e()
            java.lang.String r1 = "USER_CONSENT_PERSONALIZED_ADS_SERVING"
            java.lang.String r1 = r0.getString(r1, r7)
            r5.X = r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.f17450d
            java.lang.String r2 = "sharedPrefsWrappers"
            java.lang.String r7 = r0.getString(r2, r7)
            if (r7 != 0) goto L_0x013e
            goto L_0x015d
        L_0x013e:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x015d }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x015d }
            java.util.Iterator r7 = r0.keys()     // Catch:{ JSONException -> 0x015d }
        L_0x0147:
            boolean r2 = r7.hasNext()     // Catch:{ JSONException -> 0x015d }
            if (r2 == 0) goto L_0x015d
            java.lang.Object r2 = r7.next()     // Catch:{ JSONException -> 0x015d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x015d }
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x015d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x015d }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x015d }
            goto L_0x0147
        L_0x015d:
            boolean r6 = com.startapp.j9.e((android.content.Context) r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.O = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.w0.b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public void c(Context context) {
        if (!(this.f17446b != null)) {
            b0 c10 = ComponentLocator.a(context).c();
            String str = c10.f15625c;
            if (str == null) {
                synchronized (c10.f15623a) {
                    str = c10.f15625c;
                    if (str == null) {
                        str = c10.f15624b.getString("c88d4eab540fab77", (String) null);
                    }
                }
            }
            this.f17444a = str;
            String str2 = c10.f15626d;
            if (str2 == null) {
                synchronized (c10.f15623a) {
                    str2 = c10.f15626d;
                    if (str2 == null && (str2 = c10.f15624b.getString("2696a7f502faed4b", (String) null)) == null) {
                        str2 = c10.f15624b.getString("31721150b470a3b9", (String) null);
                    }
                }
            }
            this.f17446b = str2;
        }
        this.f17458h = context.getPackageName();
    }

    public void d(Context context) {
        NetworkCapabilities networkCapabilities;
        String str = "e105";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                str = "e100";
            } else if (a0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (!(activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null)) {
                        if (!networkCapabilities.hasTransport(1)) {
                            if (networkCapabilities.hasTransport(0)) {
                                str = z5.a(context);
                            }
                        }
                    }
                    str = "e102";
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        if (typeName.toLowerCase().compareTo("WIFI".toLowerCase()) != 0) {
                            if (typeName.toLowerCase().compareTo("MOBILE".toLowerCase()) == 0) {
                                str = z5.a(context);
                            }
                        }
                    }
                    str = "e102";
                }
                str = "WIFI";
            }
        } catch (Exception unused) {
        }
        this.f17470s = str;
        String str2 = ComponentLocator.a(context).w().f16057h;
        this.H = str2;
        this.f17473v = str2;
        int i10 = -1;
        try {
            t1.a aVar = ComponentLocator.a(context).f().f17281e;
            if (aVar != null) {
                i10 = aVar.a();
            }
        } catch (Throwable th) {
            if (!j9.a(th, (Class<? extends Throwable>) RemoteException.class)) {
                i3.a(th);
            }
        }
        this.f17472u = i10;
    }

    public void e(Context context) {
        f8 f8Var = (f8) ComponentLocator.a(context).v().b();
        if (f8Var.a(7) == 5) {
            this.f17474w = f8Var.b(8);
            this.f17475x = f8Var.b(9);
            this.f17476y = f8Var.b(15);
            this.f17477z = f8Var.b(16);
        }
        int a10 = f8Var.a(10);
        if (!(a10 == 0 || a10 == 2)) {
            this.A = f8Var.b(11);
            this.B = f8Var.b(12);
        }
        this.C = f8Var.b(4);
        this.D = f8Var.b(3);
        this.E = f8Var.b(5);
        boolean z10 = true;
        this.F = f8Var.b(1);
        this.G = f8Var.b(2);
        this.I = f8Var.b(13);
        if (f8Var.a(14) != 1) {
            z10 = false;
        }
        this.f17471t = z10;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r2, com.startapp.sdk.adsbase.model.AdPreferences r3) {
        /*
            r1 = this;
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)     // Catch:{ all -> 0x000b }
            com.startapp.e0 r0 = r0.d()     // Catch:{ all -> 0x000b }
            r1.f17457g0 = r0     // Catch:{ all -> 0x000b }
            goto L_0x000f
        L_0x000b:
            r0 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r0)
        L_0x000f:
            r1.c(r2)
            r1.b(r2, r3)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r1.d(r2)     // Catch:{ all -> 0x0019 }
            goto L_0x001d
        L_0x0019:
            r3 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r3)
        L_0x001d:
            r1.e(r2)     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r3 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r3)
        L_0x0025:
            com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r2)     // Catch:{ all -> 0x0034 }
            com.startapp.c7 r3 = r3.s()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = r3.a((java.lang.Object) r1)     // Catch:{ all -> 0x0034 }
            r1.J = r3     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r3 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r3)
        L_0x0038:
            r1.a((android.content.Context) r2)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r3 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r3)
        L_0x0040:
            r1.b(r2)     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r2 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r2)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.w0.a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public void a(r6 r6Var) throws SDKException {
        Map<String, ?> map = this.f17452e;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                r6Var.a((String) next.getKey(), next.getValue(), false, true);
            }
        }
        r6Var.a("publisherId", (Object) this.f17444a, false, true);
        r6Var.a(InAppPurchaseMetaData.KEY_PRODUCT_ID, (Object) this.f17446b, a(), true);
        r6Var.a("os", (Object) this.K, true, true);
        r6Var.a("sdkVersion", (Object) this.f17448c, false, true);
        r6Var.a("flavor", (Object) 1023, false, true);
        Map<String, String> map2 = this.f17450d;
        if (map2 != null && !map2.isEmpty()) {
            String str = MaxReward.DEFAULT_LABEL;
            for (String next2 : this.f17450d.keySet()) {
                str = str + next2 + ":" + this.f17450d.get(next2) + ";";
            }
            r6Var.a("frameworksData", (Object) str.substring(0, str.length() - 1), false, false);
        }
        r6Var.a("packageId", (Object) this.f17458h, false, true);
        r6Var.a("installerPkg", (Object) this.f17460i, false, true);
        r6Var.a("age", (Object) this.f17454f, false, true);
        u uVar = this.f17456g;
        if (uVar != null) {
            r6Var.a("userAdvertisingId", (Object) uVar.f17341a, false, true);
            boolean z10 = this.f17456g.f17343c;
            if (z10) {
                r6Var.a("limat", (Object) Boolean.valueOf(z10), false, true);
            }
            r6Var.a("advertisingIdSource", (Object) this.f17456g.f17342b, false, true);
        }
        String str2 = this.f17461j;
        if (str2 != null) {
            r6Var.a("duid", (Object) str2, false, true);
        }
        r6Var.a("model", (Object) this.f17462k, false, true);
        r6Var.a("manufacturer", (Object) this.f17463l, false, true);
        r6Var.a("deviceVersion", (Object) this.f17464m, false, true);
        r6Var.a("locale", (Object) this.f17465n, false, true);
        r6Var.a("localeList", (Object) this.f17466o, false, true);
        r6Var.a("inputLangs", (Object) this.f17467p, false, true);
        r6Var.a("isp", (Object) this.f17474w, false, true);
        r6Var.a("ispName", (Object) this.f17475x, false, true);
        r6Var.a("ispCarrId", (Object) this.f17476y, false, true);
        r6Var.a("ispCarrIdName", (Object) this.f17477z, false, true);
        r6Var.a("netOper", (Object) this.A, false, true);
        r6Var.a("networkOperName", (Object) this.B, false, true);
        r6Var.a("cid", (Object) this.C, false, true);
        r6Var.a("lac", (Object) this.D, false, true);
        r6Var.a("tac", (Object) this.E, false, true);
        r6Var.a("blat", (Object) this.F, false, true);
        r6Var.a("blon", (Object) this.G, false, true);
        r6Var.a("subPublisherId", (Object) null, false, true);
        r6Var.a("subProductId", (Object) null, false, true);
        r6Var.a("retryCount", (Object) null, false, true);
        r6Var.a("roaming", (Object) this.f17469r, false, true);
        r6Var.a("grid", (Object) this.f17470s, false, true);
        if (this.f17471t) {
            r6Var.a("c5g", (Object) UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, false, false);
        }
        int i10 = this.f17472u;
        if (i10 >= 0) {
            r6Var.a("transport", (Object) String.valueOf(i10), false, false);
        }
        if (this.f17459h0) {
            r6Var.a("tv", (Object) Boolean.TRUE, false, false);
        }
        r6Var.a("silev", (Object) this.f17473v, false, true);
        r6Var.a("cellSignalLevel", (Object) this.H, false, true);
        r6Var.a("cellTimingAdv", (Object) this.I, false, true);
        r6Var.a("outsource", (Object) this.f17468q, false, true);
        r6Var.a("width", (Object) String.valueOf(this.L), false, true);
        r6Var.a("height", (Object) String.valueOf(this.M), false, true);
        r6Var.a("density", (Object) String.valueOf(this.N), false, true);
        r6Var.a("fgApp", (Object) this.O, false, true);
        r6Var.a("sdkId", (Object) String.valueOf(this.P), true, true);
        r6Var.a("clientSessionId", (Object) this.Q, false, true);
        r6Var.a("appVersion", (Object) this.R, false, true);
        r6Var.a("appCode", (Object) Integer.valueOf(this.S), false, true);
        r6Var.a("timeSinceBoot", (Object) Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        r6Var.a("udbg", (Object) Boolean.valueOf(this.T), false, true);
        r6Var.a("root", (Object) Boolean.valueOf(this.U), false, true);
        r6Var.a("smltr", (Object) Boolean.valueOf(this.V), false, true);
        r6Var.a("isddbg", (Object) Boolean.valueOf(this.W), false, true);
        r6Var.a("pas", (Object) this.X, false, true);
        r6Var.a("prm", (Object) this.Y, false, false);
        r6Var.a("free", (Object) this.f17445a0, false, false);
        r6Var.a("chr", (Object) this.f17449c0, false, false);
        r6Var.a("blp", (Object) this.f17447b0, false, false);
        r6Var.a("hs", (Object) this.f17451d0, false, false);
        r6Var.a("lpm", (Object) this.f17453e0, false, false);
        r6Var.a("dm", (Object) this.f17455f0, false, false);
        e0 e0Var = this.f17457g0;
        if (e0Var != null) {
            long j10 = 0;
            if (e0Var.f15774d > 0) {
                ((x) e0Var.f15771a).getClass();
                j10 = SystemClock.elapsedRealtime() - e0Var.f15774d;
            }
            r6Var.a("appSessionDuration", (Object) Long.valueOf(j10 / 1000), false, false);
        }
        r6Var.a("rsc", (Object) this.J, false, true);
    }

    public void b(Context context) {
        boolean z10;
        try {
            this.f17445a0 = null;
            if (Build.VERSION.SDK_INT >= 18) {
                this.f17445a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
            }
        } catch (Throwable th) {
            i3.a(th);
        }
        boolean z11 = true;
        try {
            this.f17449c0 = null;
            this.f17447b0 = null;
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra("status")) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    if (intExtra != 2) {
                        if (intExtra != 5) {
                            z10 = false;
                            this.f17449c0 = Boolean.valueOf(z10);
                        }
                    }
                    z10 = true;
                    this.f17449c0 = Boolean.valueOf(z10);
                }
                if (registerReceiver.hasExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL) && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f17447b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            i3.a(th2);
        }
        try {
            this.f17451d0 = null;
            Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (systemService instanceof AudioManager) {
                AudioManager audioManager = (AudioManager) systemService;
                if (Build.VERSION.SDK_INT >= 23) {
                    AudioDeviceInfo[] devices = audioManager.getDevices(2);
                    if (devices != null) {
                        int length = devices.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                AudioDeviceInfo audioDeviceInfo = devices[i10];
                                if (audioDeviceInfo != null && f17443i0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                                    break;
                                }
                                i10++;
                            } else {
                                break;
                            }
                        }
                        this.f17451d0 = Boolean.valueOf(z11);
                    }
                    z11 = false;
                    this.f17451d0 = Boolean.valueOf(z11);
                }
            }
        } catch (Throwable th3) {
            i3.a(th3);
        }
        try {
            this.f17453e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                PowerManager powerManager = (PowerManager) systemService2;
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f17453e0 = Boolean.valueOf(powerManager.isPowerSaveMode());
                }
            }
        } catch (Throwable th4) {
            i3.a(th4);
        }
        try {
            this.f17455f0 = null;
            int i11 = context.getResources().getConfiguration().uiMode & 48;
            if (i11 == 32) {
                this.f17455f0 = Boolean.TRUE;
            } else if (i11 == 16) {
                this.f17455f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            i3.a(th5);
        }
    }

    public void a(Context context) {
        if (!MetaData.f17070k.p()) {
            this.f17456g = ComponentLocator.a(context).a().a();
            try {
                this.f17461j = ComponentLocator.a(context).f17147j.a().a();
            } catch (Throwable th) {
                i3.a(th);
            }
            try {
                this.f17452e = ComponentLocator.a(context).k().getAll();
            } catch (Throwable th2) {
                i3.a(th2);
            }
        }
    }
}
