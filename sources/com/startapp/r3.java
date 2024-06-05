package com.startapp;

import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Map;

/* compiled from: Sta */
public class r3 extends w0 {

    /* renamed from: j0  reason: collision with root package name */
    public final i3 f16341j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f16342k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f16343l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f16344m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f16345n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f16346o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f16347p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f16348q0;

    /* renamed from: r0  reason: collision with root package name */
    public Map<String, String> f16349r0;

    public r3(i3 i3Var) {
        super(8);
        this.f16341j0 = i3Var;
    }

    public void a(r6 r6Var) throws SDKException {
        super.a(r6Var);
        i3 i3Var = this.f16341j0;
        Long l10 = i3Var.f15918h;
        String l11 = l10 != null ? l10.toString() : a.a();
        r6Var.a(a.f15590b, (Object) l11, true, true);
        r6Var.a(a.f15591c, (Object) a.a(l11), true, true);
        r6Var.a("category", (Object) i3Var.f15911a.f15965a, true, true);
        r6Var.a("value", (Object) i3Var.f15914d, false, true);
        r6Var.a("d", (Object) i3Var.f15917g, false, true);
        r6Var.a("appActivity", (Object) i3Var.f15919i, false, true);
        r6Var.a("details", (Object) i3Var.f15915e, false, true);
        r6Var.a("details_json", i3Var.f15916f, false, true);
        r6Var.a("isService", (Object) Boolean.valueOf(i3Var.f15920j), false, true);
        r6Var.a(AdUnitActivity.EXTRA_ORIENTATION, (Object) this.f16342k0, false, true);
        r6Var.a("usedRam", (Object) this.f16343l0, false, true);
        r6Var.a("freeRam", (Object) this.f16344m0, false, true);
        r6Var.a("sessionTime", (Object) null, false, true);
        r6Var.a("cellScanRes", (Object) this.f16345n0, false, true);
        r6Var.a("sens", (Object) this.f16346o0, false, true);
        r6Var.a("bt", (Object) this.f16347p0, false, true);
        r6Var.a("packagingType", (Object) this.f16348q0, false, true);
        Pair<String, String> a10 = SimpleTokenUtils.a();
        Pair<String, String> b10 = SimpleTokenUtils.b();
        r6Var.a((String) a10.first, (Object) a10.second, false, true);
        r6Var.a((String) b10.first, (Object) b10.second, false, true);
        Map<String, String> map = this.f16349r0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                r6Var.a((String) next.getKey(), next.getValue(), false, true);
            }
        }
        r6Var.a("rcd", (Object) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[Catch:{ all -> 0x0064 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r9, com.startapp.sdk.adsbase.model.AdPreferences r10) {
        /*
            r8 = this;
            super.b(r9, r10)
            android.content.res.Resources r10 = r9.getResources()
            r0 = 1
            if (r10 == 0) goto L_0x001d
            android.content.res.Configuration r10 = r10.getConfiguration()
            if (r10 == 0) goto L_0x001d
            int r10 = r10.orientation
            r1 = 2
            if (r10 != r1) goto L_0x0018
            java.lang.String r10 = "landscape"
            goto L_0x001f
        L_0x0018:
            if (r10 != r0) goto L_0x001d
            java.lang.String r10 = "portrait"
            goto L_0x001f
        L_0x001d:
            java.lang.String r10 = "undefined"
        L_0x001f:
            r8.f16342k0 = r10
            r10 = 0
            java.lang.String[] r1 = new java.lang.String[]{r10, r10}
            r2 = 0
            java.lang.String r3 = "activity"
            java.lang.Object r9 = r9.getSystemService(r3)     // Catch:{ all -> 0x0064 }
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0079
            android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x0064 }
            r3.<init>()     // Catch:{ all -> 0x0064 }
            r9.getMemoryInfo(r3)     // Catch:{ all -> 0x0064 }
            long r4 = r3.availMem     // Catch:{ all -> 0x0064 }
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r4 / r6
            java.lang.String r9 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0064 }
            r1[r2] = r9     // Catch:{ all -> 0x0064 }
            int r9 = com.startapp.a0.f15596a     // Catch:{ all -> 0x0064 }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0064 }
            r4 = 16
            if (r9 < r4) goto L_0x0053
            long r9 = r3.totalMem     // Catch:{ all -> 0x0064 }
            java.lang.Long r10 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0064 }
        L_0x0053:
            if (r10 == 0) goto L_0x0079
            long r9 = r10.longValue()     // Catch:{ all -> 0x0064 }
            long r3 = r3.availMem     // Catch:{ all -> 0x0064 }
            long r9 = r9 - r3
            long r9 = r9 / r6
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x0064 }
            r1[r0] = r9     // Catch:{ all -> 0x0064 }
            goto L_0x0079
        L_0x0064:
            r9 = move-exception
            java.lang.Class<java.lang.SecurityException> r10 = java.lang.SecurityException.class
            boolean r10 = com.startapp.j9.a((java.lang.Throwable) r9, (java.lang.Class<? extends java.lang.Throwable>) r10)
            if (r10 != 0) goto L_0x0079
            java.lang.Class<android.os.RemoteException> r10 = android.os.RemoteException.class
            boolean r10 = com.startapp.j9.a((java.lang.Throwable) r9, (java.lang.Class<? extends java.lang.Throwable>) r10)
            if (r10 == 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            com.startapp.i3.a((java.lang.Throwable) r9)
        L_0x0079:
            r9 = r1[r2]
            r8.f16344m0 = r9
            r9 = r1[r0]
            r8.f16343l0 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.r3.b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public String toString() {
        return this.f16341j0.toString();
    }
}
