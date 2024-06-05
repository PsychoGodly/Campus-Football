package com.startapp.sdk.adsbase.model;

import android.app.Activity;
import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.a;
import com.startapp.e0;
import com.startapp.f;
import com.startapp.j9;
import com.startapp.r6;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.t7;
import com.startapp.u1;
import com.startapp.u7;
import com.startapp.w0;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class GetAdRequest extends w0 {
    public boolean A0 = true;
    public boolean B0;
    public int C0 = 0;
    public Set<String> D0 = null;
    public Set<String> E0 = null;
    public Set<String> F0 = null;
    public Set<String> G0 = null;
    public Set<String> H0 = null;
    public Pair<String, String> I0;
    public boolean J0 = true;
    public long K0 = (System.currentTimeMillis() - t7.f17299d.b());
    public int L0;
    public String M0;
    public String N0;
    public String O0;
    public boolean P0;
    public Boolean Q0;
    public Boolean R0;
    public String S0;
    public Ad.AdType T0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public AdPreferences.Placement f17029j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f17030k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f17031l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f17032m0;

    /* renamed from: n0  reason: collision with root package name */
    public Integer f17033n0;

    /* renamed from: o0  reason: collision with root package name */
    public Long f17034o0;

    /* renamed from: p0  reason: collision with root package name */
    public Boolean f17035p0;

    /* renamed from: q0  reason: collision with root package name */
    public SDKAdPreferences.Gender f17036q0;

    /* renamed from: r0  reason: collision with root package name */
    public String f17037r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f17038s0 = 1;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f17039t0 = true;

    /* renamed from: u0  reason: collision with root package name */
    public Boolean f17040u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f17041v0 = AdsCommonMetaData.k().M();

    /* renamed from: w0  reason: collision with root package name */
    public Double f17042w0;

    /* renamed from: x0  reason: collision with root package name */
    public String f17043x0;

    /* renamed from: y0  reason: collision with root package name */
    public String f17044y0;

    /* renamed from: z0  reason: collision with root package name */
    public Integer f17045z0;

    /* compiled from: Sta */
    public enum VideoRequestMode {
        INTERSTITIAL,
        REWARDED
    }

    /* compiled from: Sta */
    public enum VideoRequestType {
        ENABLED,
        DISABLED,
        FORCED,
        FORCED_NONVAST
    }

    public GetAdRequest() {
        super(4);
        Map<Activity, Integer> map = j9.f15982a;
        this.L0 = f.a().b();
        this.M0 = MetaData.w().F();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb A[Catch:{ all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc A[Catch:{ all -> 0x00ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r4, com.startapp.sdk.adsbase.model.AdPreferences r5, com.startapp.sdk.adsbase.model.AdPreferences.Placement r6, com.startapp.sdk.common.utils.Pair<java.lang.String, java.lang.String> r7) {
        /*
            r3 = this;
            r3.f17029j0 = r6
            java.lang.String r6 = r5.getPlacementId()
            r3.f17030k0 = r6
            r3.I0 = r7
            java.lang.Boolean r6 = r5.getAi()
            r3.Q0 = r6
            java.lang.Boolean r6 = r5.getAs()
            r3.R0 = r6
            com.startapp.sdk.adsbase.SDKAdPreferences$Gender r6 = r5.getGender(r4)
            r3.f17036q0 = r6
            java.lang.String r6 = r5.getKeywords()
            r3.f17037r0 = r6
            boolean r6 = r5.isTestMode()
            r3.f17031l0 = r6
            java.util.Set r6 = r5.getCategories()
            r3.D0 = r6
            java.util.Set r6 = r5.getCategoriesExclude()
            r3.E0 = r6
            boolean r6 = r5.b()
            r3.f17039t0 = r6
            java.lang.Integer r6 = r5.a()
            r3.f17045z0 = r6
            int r6 = com.startapp.a0.f15596a
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = "auto_time"
            r0 = 1
            r1 = 0
            r2 = 17
            if (r6 < r2) goto L_0x0057
            android.content.ContentResolver r6 = r4.getContentResolver()
            int r6 = android.provider.Settings.Global.getInt(r6, r7, r1)
            if (r6 <= 0) goto L_0x0063
            goto L_0x0061
        L_0x0057:
            android.content.ContentResolver r6 = r4.getContentResolver()
            int r6 = android.provider.Settings.System.getInt(r6, r7, r1)
            if (r6 <= 0) goto L_0x0063
        L_0x0061:
            r6 = 1
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3.f17040u0 = r6
            java.lang.Double r6 = r5.getMinCpm()
            r3.f17042w0 = r6
            java.lang.String r6 = r5.getAdTag()
            r3.f17043x0 = r6
            java.lang.Object r6 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17063d
            java.lang.String r6 = "StartappMetadata"
            java.io.File r6 = r4.getFileStreamPath(r6)
            boolean r6 = r6.exists()
            r6 = r6 ^ r0
            r3.A0 = r6
            com.startapp.sdk.adsbase.Ad$AdType r6 = r5.type
            r3.T0 = r6
            java.lang.String r6 = r5.getCustomProductId()
            r3.f17446b = r6
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h
            com.startapp.sdk.adsbase.VideoConfig r6 = r6.G()
            if (r6 == 0) goto L_0x00a8
            java.lang.String r7 = r6.l()
            if (r7 == 0) goto L_0x00a8
            java.lang.String r6 = r6.l()
            java.lang.String r7 = "muted"
            boolean r6 = r6.equals(r7)
            goto L_0x00a9
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            if (r6 != 0) goto L_0x00c9
            java.lang.String r6 = "audio"
            java.lang.Object r6 = r4.getSystemService(r6)     // Catch:{ all -> 0x00c4 }
            boolean r7 = r6 instanceof android.media.AudioManager     // Catch:{ all -> 0x00c4 }
            if (r7 == 0) goto L_0x00cb
            android.media.AudioManager r6 = (android.media.AudioManager) r6     // Catch:{ all -> 0x00c4 }
            r7 = 3
            int r6 = r6.getStreamVolume(r7)     // Catch:{ all -> 0x00c4 }
            if (r6 <= 0) goto L_0x00c0
            r6 = 1
            goto L_0x00c1
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            r3.B0 = r6     // Catch:{ all -> 0x00c4 }
            goto L_0x00cb
        L_0x00c4:
            r6 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r6)
            goto L_0x00cb
        L_0x00c9:
            r3.B0 = r1
        L_0x00cb:
            java.lang.Object r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.D     // Catch:{ all -> 0x00ff }
            com.startapp.sdk.adsbase.StartAppSDKInternal r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.d.f16847a     // Catch:{ all -> 0x00ff }
            boolean r6 = r6.C     // Catch:{ all -> 0x00ff }
            if (r6 != 0) goto L_0x00fd
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r4)     // Catch:{ all -> 0x00ff }
            com.startapp.n4<com.startapp.d> r4 = r4.L     // Catch:{ all -> 0x00ff }
            java.lang.Object r4 = r4.a()     // Catch:{ all -> 0x00ff }
            com.startapp.d r4 = (com.startapp.d) r4     // Catch:{ all -> 0x00ff }
            com.startapp.i2<com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata> r6 = r4.f15718c     // Catch:{ all -> 0x00ff }
            java.lang.Object r6 = r6.a()     // Catch:{ all -> 0x00ff }
            com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata r6 = (com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata) r6     // Catch:{ all -> 0x00ff }
            if (r6 != 0) goto L_0x00ea
            goto L_0x00f8
        L_0x00ea:
            boolean r4 = r4.a()     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x00f8
            boolean r4 = r6.c()     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x00f8
            r4 = 1
            goto L_0x00f9
        L_0x00f8:
            r4 = 0
        L_0x00f9:
            if (r4 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            r3.f17032m0 = r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            java.util.Set<java.lang.String> r4 = r5.packageInclude
            r3.G0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.model.GetAdRequest.a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.model.AdPreferences$Placement, com.startapp.sdk.common.utils.Pair):void");
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        Ad.AdType adType = this.T0;
        return adType == Ad.AdType.VIDEO || adType == Ad.AdType.REWARDED_VIDEO;
    }

    public void f(Context context) {
        String str;
        u7 u10 = ComponentLocator.a(context).u();
        AdPreferences.Placement placement = this.f17029j0;
        if (placement == null) {
            str = null;
        } else {
            str = u10.f17374a.get(new u7.a(placement, -1));
        }
        this.f17044y0 = str;
    }

    public void g(Context context) {
        u1 g10 = ComponentLocator.a(context).g();
        this.f17033n0 = g10.b();
        this.f17034o0 = (!g10.d() || !g10.f17356b.contains("consentTimestamp")) ? null : Long.valueOf(g10.f17356b.getLong("consentTimestamp", 0));
        this.f17035p0 = g10.a();
    }

    public void a(r6 r6Var) throws SDKException {
        super.a(r6Var);
        r6Var.a("placement", (Object) this.f17029j0.name(), true, true);
        r6Var.a("placementId", (Object) this.f17030k0, false, true);
        r6Var.a("testMode", (Object) Boolean.toString(this.f17031l0), false, true);
        r6Var.a("gender", (Object) this.f17036q0, false, true);
        r6Var.a("keywords", (Object) this.f17037r0, false, true);
        r6Var.a("adsNumber", (Object) Integer.toString(this.f17038s0), false, true);
        r6Var.a("category", this.D0, false, true);
        r6Var.a("categoryExclude", this.E0, false, true);
        r6Var.a("packageExclude", this.F0, false, true);
        r6Var.a("campaignExclude", this.H0, false, true);
        r6Var.a("offset", (Object) Integer.toString(this.C0), false, true);
        r6Var.a("ai", (Object) this.Q0, false, true);
        r6Var.a("as", (Object) this.R0, false, true);
        Double d10 = this.f17042w0;
        Map<Activity, Integer> map = j9.f15982a;
        r6Var.a("minCPM", (Object) d10 != null ? String.format(Locale.US, "%.2f", new Object[]{d10}) : null, false, true);
        r6Var.a("adTag", (Object) this.f17043x0, false, true);
        r6Var.a("previousAdId", (Object) this.f17044y0, false, true);
        r6Var.a("twoClicks", (Object) Boolean.valueOf(!this.f17041v0), false, true);
        r6Var.a("engInclude", (Object) Boolean.toString(this.J0), false, true);
        Ad.AdType adType = this.T0;
        if (adType == Ad.AdType.INTERSTITIAL || adType == Ad.AdType.RICH_TEXT) {
            r6Var.a("type", (Object) adType, false, true);
        }
        r6Var.a("timeSinceSessionStart", (Object) Long.valueOf(this.K0), true, true);
        r6Var.a("adsDisplayed", (Object) Integer.valueOf(this.L0), true, true);
        r6Var.a("profileId", (Object) this.M0, false, true);
        r6Var.a("hardwareAccelerated", (Object) Boolean.valueOf(this.f17039t0), false, true);
        r6Var.a("autoLoadAmount", (Object) this.f17045z0, false, true);
        r6Var.a("dts", (Object) this.f17040u0, false, true);
        r6Var.a("downloadingMode", (Object) "CACHE", false, true);
        r6Var.a("primaryImg", (Object) this.N0, false, true);
        r6Var.a("moreImg", (Object) this.O0, false, true);
        r6Var.a("contentAd", (Object) Boolean.toString(this.P0), false, true);
        r6Var.a("ct", (Object) this.f17033n0, false, true);
        r6Var.a("tsc", (Object) this.f17034o0, false, true);
        r6Var.a("apc", (Object) this.f17035p0, false, true);
        if (this.f17032m0) {
            r6Var.a("testAdsEnabled", (Object) Boolean.TRUE, false, true);
        }
        String a10 = a.a();
        r6Var.a(a.f15590b, (Object) a10, true, true);
        String str = a.f15592d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17446b);
        sb2.append(this.f17029j0.name());
        String str2 = this.Q;
        if (str2 == null) {
            str2 = MaxReward.DEFAULT_LABEL;
        }
        sb2.append(str2);
        sb2.append(this.f17448c);
        sb2.append(a10);
        r6Var.a(str, (Object) a.a(sb2.toString()), true, false);
        r6Var.a("sound", (Object) Boolean.valueOf(this.B0), false, true);
        Set<String> set = this.G0;
        if (set != null) {
            r6Var.a("packageInclude", set, false, true);
        }
        r6Var.a("defaultMetaData", (Object) Boolean.valueOf(this.A0), true, true);
        Pair<String, String> pair = this.I0;
        r6Var.a((String) pair.first, (Object) pair.second, false, true);
        String str3 = this.S0;
        if (str3 != null) {
            r6Var.a("trv", (Object) str3, false, false);
        }
        e0 e0Var = this.f17457g0;
        if (e0Var != null) {
            Integer num = e0Var.f15773c.get(this.f17029j0);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 0) {
                r6Var.a("adsDisplayed", (Object) Integer.valueOf(intValue), false, false);
            }
        }
    }
}
