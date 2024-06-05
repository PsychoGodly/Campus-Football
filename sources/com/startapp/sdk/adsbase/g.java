package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.startapp.c4;
import com.startapp.e;
import com.startapp.f;
import com.startapp.j9;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.c;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.x1;
import java.util.Map;

/* compiled from: Sta */
public class g extends x1 {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z10;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f16847a;
        startAppSDKInternal.getClass();
        boolean z11 = true;
        if (activity.getClass().getName().equals(j9.c((Context) activity))) {
            startAppSDKInternal.f16831y = true;
        }
        startAppSDKInternal.f16824r = bundle;
        Map<Activity, Integer> map = j9.f15982a;
        c cVar = c.a.f16921a;
        boolean equals = activity.getClass().getName().equals(j9.c((Context) activity));
        if (bundle == null) {
            String[] split = c.class.getName().split("\\.");
            if (split.length < 3) {
                z10 = false;
            } else {
                z10 = activity.getClass().getName().startsWith(split[0] + "." + split[1] + "." + split[2]);
            }
            if (!z10 && !equals) {
                cVar.f16919d++;
                if (cVar.f16916a && AdsCommonMetaData.f16770h.I()) {
                    if (cVar.f16917b == null) {
                        cVar.f16917b = new AutoInterstitialPreferences();
                    }
                    boolean z12 = cVar.f16918c <= 0 || System.currentTimeMillis() >= cVar.f16918c + ((long) (cVar.f16917b.getSecondsBetweenAds() * 1000));
                    int i10 = cVar.f16919d;
                    boolean z13 = i10 <= 0 || i10 >= cVar.f16917b.getActivitiesBetweenAds();
                    if (!z12 || !z13) {
                        z11 = false;
                    }
                    if (z11) {
                        if (cVar.f16920e == null) {
                            cVar.f16920e = new StartAppAd(activity);
                        }
                        cVar.f16920e.loadAd(StartAppAd.AdMode.AUTOMATIC, new AdPreferences().setAi(Boolean.TRUE), new c4(cVar));
                    }
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f16847a;
        if (startAppSDKInternal.a(activity)) {
            startAppSDKInternal.f16830x = false;
        }
        if (startAppSDKInternal.f16815i.size() == 0) {
            startAppSDKInternal.f16810d = false;
        }
    }

    public void onActivityPaused(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f16847a;
        startAppSDKInternal.getClass();
        startAppSDKInternal.f16813g = System.currentTimeMillis();
        startAppSDKInternal.f16818l = null;
    }

    public void onActivityResumed(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f16847a;
        if (startAppSDKInternal.f16808b && startAppSDKInternal.f16811e) {
            startAppSDKInternal.f16811e = false;
            d dVar = d.f16928h;
            if (!dVar.f16932d) {
                synchronized (dVar.f16929a) {
                    for (h b10 : dVar.f16929a.values()) {
                        b10.b();
                    }
                }
            }
        }
        if (startAppSDKInternal.f16819m) {
            startAppSDKInternal.f16819m = false;
            SimpleTokenUtils.f(activity);
        }
        startAppSDKInternal.f16818l = activity;
    }

    public void onActivityStarted(Activity activity) {
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f16847a;
        boolean a10 = startAppSDKInternal.a(activity);
        boolean z10 = !startAppSDKInternal.f16830x && a10 && startAppSDKInternal.f16824r == null && startAppSDKInternal.f16815i.size() == 0 && StartAppSDKInternal.E == StartAppSDKInternal.InitState.EXPLICIT;
        if (z10) {
            ComponentLocator.a((Context) activity).g().a(false, (String) null, (String) null, (String) null);
        }
        Map<Activity, Integer> map = j9.f15982a;
        if (!ComponentLocator.a((Context) activity).g().f17358d && !AdsCommonMetaData.f16770h.L() && !startAppSDKInternal.f16829w && !startAppSDKInternal.a("MoPub") && !startAppSDKInternal.a("AdMob") && !startAppSDKInternal.f16828v && z10) {
            StartAppAd.a(activity, startAppSDKInternal.f16824r, new SplashConfig(), new AdPreferences(), (SplashHideListener) null, false);
        }
        if (a10) {
            startAppSDKInternal.f16831y = false;
            startAppSDKInternal.f16830x = true;
        }
        if (startAppSDKInternal.f16810d) {
            if (MetaData.f17070k.b() && startAppSDKInternal.f16827u && !AdsCommonMetaData.f16770h.K() && !startAppSDKInternal.f16821o) {
                if (System.currentTimeMillis() - startAppSDKInternal.f16813g > AdsCommonMetaData.f16770h.x()) {
                    d c10 = d.f16928h.c(startAppSDKInternal.f16826t);
                    startAppSDKInternal.f16832z = c10;
                    if (c10 != null && c10.isReady()) {
                        AdRules b10 = AdsCommonMetaData.f16770h.b();
                        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_RETURN;
                        AdRulesResult a11 = b10.a(placement, (String) null);
                        if (!a11.b()) {
                            a.a(((ReturnAd) startAppSDKInternal.f16832z).trackingUrls, (String) null, 0, a11.a());
                        } else if (startAppSDKInternal.f16832z.a((String) null)) {
                            f.f15802d.a(new e(placement, (String) null));
                        }
                    }
                }
            }
            if (System.currentTimeMillis() - startAppSDKInternal.f16813g > MetaData.f17070k.J()) {
                startAppSDKInternal.b(activity, MetaDataRequest.RequestReason.APP_IDLE);
            }
        }
        startAppSDKInternal.f16812f = false;
        startAppSDKInternal.f16810d = false;
        if (startAppSDKInternal.f16815i.get(Integer.valueOf(activity.hashCode())) == null) {
            startAppSDKInternal.f16815i.put(Integer.valueOf(activity.hashCode()), Integer.valueOf(new Integer(0).intValue() + 1));
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.app.Activity, code=android.content.Context, for r7v0, types: [android.content.Context, java.lang.Object, android.app.Activity] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityStopped(android.content.Context r7) {
        /*
            r6 = this;
            com.startapp.sdk.adsbase.StartAppSDKInternal r0 = com.startapp.sdk.adsbase.StartAppSDKInternal.d.f16847a
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f16815i
            int r2 = r7.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0091
            int r1 = r1.intValue()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r1.intValue()
            if (r3 != 0) goto L_0x0032
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f16815i
            int r3 = r7.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.remove(r3)
            goto L_0x003f
        L_0x0032:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r3 = r0.f16815i
            int r4 = r7.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r4, r1)
        L_0x003f:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r0.f16815i
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0091
            boolean r1 = r0.f16812f
            if (r1 != 0) goto L_0x0050
            r0.f16810d = r2
            r0.f(r7)
        L_0x0050:
            boolean r1 = r0.f16808b
            if (r1 == 0) goto L_0x0091
            android.content.Context r1 = com.startapp.h0.a(r7)
            if (r1 == 0) goto L_0x005b
            r7 = r1
        L_0x005b:
            com.startapp.sdk.adsbase.cache.d r1 = com.startapp.sdk.adsbase.cache.d.f16928h
            boolean r3 = r0.f16812f
            r1.getClass()
            boolean r4 = r1.f16931c     // Catch:{ all -> 0x008b }
            if (r4 != 0) goto L_0x0074
            com.startapp.sdk.adsbase.cache.CacheMetaData r4 = com.startapp.sdk.adsbase.cache.CacheMetaData.f16922a     // Catch:{ all -> 0x008b }
            com.startapp.sdk.adsbase.cache.ACMConfig r4 = r4.a()     // Catch:{ all -> 0x008b }
            boolean r4 = r4.f()     // Catch:{ all -> 0x008b }
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0087
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r7)     // Catch:{ all -> 0x008b }
            java.util.concurrent.Executor r4 = r4.j()     // Catch:{ all -> 0x008b }
            com.startapp.c r5 = new com.startapp.c     // Catch:{ all -> 0x008b }
            r5.<init>(r1, r7)     // Catch:{ all -> 0x008b }
            r4.execute(r5)     // Catch:{ all -> 0x008b }
        L_0x0087:
            r1.a((boolean) r3)     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r7 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r7)
        L_0x008f:
            r0.f16811e = r2
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.g.onActivityStopped(android.app.Activity):void");
    }
}
