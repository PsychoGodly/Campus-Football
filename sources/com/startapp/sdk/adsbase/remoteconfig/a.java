package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.a3;
import com.startapp.g2;
import com.startapp.i3;
import com.startapp.p0;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.splash.SplashMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.z5;
import java.util.Collections;
import java.util.List;

/* compiled from: Sta */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17108a;

    /* renamed from: b  reason: collision with root package name */
    public final AdPreferences f17109b;

    /* renamed from: c  reason: collision with root package name */
    public final MetaDataRequest.RequestReason f17110c;

    /* renamed from: d  reason: collision with root package name */
    public MetaData f17111d = null;

    /* renamed from: e  reason: collision with root package name */
    public BannerMetaData f17112e = null;

    /* renamed from: f  reason: collision with root package name */
    public SplashMetaData f17113f;

    /* renamed from: g  reason: collision with root package name */
    public CacheMetaData f17114g = null;

    /* renamed from: h  reason: collision with root package name */
    public AdInformationMetaData f17115h = null;

    /* renamed from: i  reason: collision with root package name */
    public AdsCommonMetaData f17116i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17117j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17118k = false;

    public a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason) {
        this.f17108a = context;
        this.f17109b = adPreferences;
        this.f17110c = requestReason;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|(24:38|39|40|(1:42)|46|47|48|(1:50)|54|55|56|(1:58)|59|(1:61)|65|66|67|(1:69)|73|74|75|(1:77)|81|82)|83|84) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0153 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean a() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f17108a     // Catch:{ all -> 0x015a }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r0)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.e r0 = r0.e()     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest r1 = new com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest     // Catch:{ all -> 0x015a }
            android.content.Context r2 = r5.f17108a     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason r3 = r5.f17110c     // Catch:{ all -> 0x015a }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r5.f17108a     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.model.AdPreferences r2 = r5.f17109b     // Catch:{ all -> 0x015a }
            r1.a(r0, r2)     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r5.f17108a     // Catch:{ all -> 0x015a }
            com.startapp.z5$a r0 = a(r0, r1)     // Catch:{ all -> 0x015a }
            if (r0 != 0) goto L_0x0025
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
            return r0
        L_0x0025:
            java.lang.String r0 = r0.f17586b     // Catch:{ all -> 0x015a }
            if (r0 != 0) goto L_0x002c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
            return r0
        L_0x002c:
            java.lang.Class<com.startapp.sdk.adsbase.remoteconfig.MetaData> r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.class
            java.lang.Object r1 = com.startapp.g4.a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = (com.startapp.sdk.adsbase.remoteconfig.MetaData) r1     // Catch:{ all -> 0x015a }
            r5.f17111d = r1     // Catch:{ all -> 0x015a }
            if (r1 != 0) goto L_0x003b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015a }
            return r0
        L_0x003b:
            java.lang.String r1 = r1.j()     // Catch:{ all -> 0x015a }
            if (r1 == 0) goto L_0x006e
            android.content.Context r1 = r5.f17108a     // Catch:{ all -> 0x015a }
            com.startapp.sdk.components.ComponentLocator r1 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r1)     // Catch:{ all -> 0x015a }
            com.startapp.b0 r1 = r1.c()     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = r5.f17111d     // Catch:{ all -> 0x015a }
            java.lang.String r2 = r2.j()     // Catch:{ all -> 0x015a }
            if (r2 == 0) goto L_0x0057
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x015a }
        L_0x0057:
            java.lang.Object r3 = r1.f15623a     // Catch:{ all -> 0x015a }
            monitor-enter(r3)     // Catch:{ all -> 0x015a }
            android.content.SharedPreferences r1 = r1.f15624b     // Catch:{ all -> 0x006b }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "31721150b470a3b9"
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r2)     // Catch:{ all -> 0x006b }
            r1.commit()     // Catch:{ all -> 0x006b }
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            goto L_0x006e
        L_0x006b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x015a }
        L_0x006e:
            java.util.Map<android.app.Activity, java.lang.Integer> r1 = com.startapp.j9.f15982a     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.adsbase.AdsCommonMetaData> r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.class
            java.lang.Object r1 = com.startapp.g4.a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = (com.startapp.sdk.adsbase.AdsCommonMetaData) r1     // Catch:{ all -> 0x015a }
            r5.f17116i = r1     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.ads.banner.BannerMetaData> r1 = com.startapp.sdk.ads.banner.BannerMetaData.class
            java.lang.Object r1 = com.startapp.g4.a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.ads.banner.BannerMetaData r1 = (com.startapp.sdk.ads.banner.BannerMetaData) r1     // Catch:{ all -> 0x015a }
            r5.f17112e = r1     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.ads.splash.SplashMetaData> r1 = com.startapp.sdk.ads.splash.SplashMetaData.class
            java.lang.Object r1 = com.startapp.g4.a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.ads.splash.SplashMetaData r1 = (com.startapp.sdk.ads.splash.SplashMetaData) r1     // Catch:{ all -> 0x015a }
            r5.f17113f = r1     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.adsbase.cache.CacheMetaData> r1 = com.startapp.sdk.adsbase.cache.CacheMetaData.class
            java.lang.Object r1 = com.startapp.g4.a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r1 = (com.startapp.sdk.adsbase.cache.CacheMetaData) r1     // Catch:{ all -> 0x015a }
            r5.f17114g = r1     // Catch:{ all -> 0x015a }
            java.lang.Class<com.startapp.sdk.adsbase.adinformation.AdInformationMetaData> r1 = com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.class
            java.lang.Object r0 = com.startapp.g4.a(r0, r1)     // Catch:{ all -> 0x015a }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r0 = (com.startapp.sdk.adsbase.adinformation.AdInformationMetaData) r0     // Catch:{ all -> 0x015a }
            r5.f17115h = r0     // Catch:{ all -> 0x015a }
            java.lang.Object r0 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17063d
            monitor-enter(r0)
            boolean r1 = r5.f17117j     // Catch:{ all -> 0x0157 }
            if (r1 != 0) goto L_0x0153
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = r5.f17111d     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x0153
            android.content.Context r1 = r5.f17108a     // Catch:{ all -> 0x0157 }
            if (r1 == 0) goto L_0x0153
            r1 = 1
            com.startapp.sdk.adsbase.AdsCommonMetaData r2 = com.startapp.sdk.adsbase.AdsCommonMetaData.f16770h     // Catch:{ all -> 0x00c6 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = r5.f17116i     // Catch:{ all -> 0x00c6 }
            boolean r2 = com.startapp.j9.a(r2, r3)     // Catch:{ all -> 0x00c6 }
            if (r2 != 0) goto L_0x00ca
            r5.f17118k = r1     // Catch:{ all -> 0x00c6 }
            android.content.Context r2 = r5.f17108a     // Catch:{ all -> 0x00c6 }
            com.startapp.sdk.adsbase.AdsCommonMetaData r3 = r5.f17116i     // Catch:{ all -> 0x00c6 }
            com.startapp.sdk.adsbase.AdsCommonMetaData.a(r2, r3)     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r2 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0157 }
        L_0x00ca:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.j9.f15982a     // Catch:{ all -> 0x0157 }
            com.startapp.sdk.ads.banner.BannerMetaData r2 = com.startapp.sdk.ads.banner.BannerMetaData.f16423b     // Catch:{ all -> 0x00e0 }
            com.startapp.sdk.ads.banner.BannerMetaData r3 = r5.f17112e     // Catch:{ all -> 0x00e0 }
            boolean r2 = com.startapp.j9.a(r2, r3)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x00e4
            r5.f17118k = r1     // Catch:{ all -> 0x00e0 }
            android.content.Context r2 = r5.f17108a     // Catch:{ all -> 0x00e0 }
            com.startapp.sdk.ads.banner.BannerMetaData r3 = r5.f17112e     // Catch:{ all -> 0x00e0 }
            com.startapp.sdk.ads.banner.BannerMetaData.a(r2, r3)     // Catch:{ all -> 0x00e0 }
            goto L_0x00e4
        L_0x00e0:
            r2 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0157 }
        L_0x00e4:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.j9.f15982a     // Catch:{ all -> 0x0157 }
            com.startapp.sdk.ads.splash.SplashMetaData r2 = r5.f17113f     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x00f1
            com.startapp.sdk.ads.splash.SplashMetaData r2 = new com.startapp.sdk.ads.splash.SplashMetaData     // Catch:{ all -> 0x0110 }
            r2.<init>()     // Catch:{ all -> 0x0110 }
            r5.f17113f = r2     // Catch:{ all -> 0x0110 }
        L_0x00f1:
            com.startapp.sdk.ads.splash.SplashMetaData r2 = r5.f17113f     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashConfig r2 = r2.a()     // Catch:{ all -> 0x0110 }
            android.content.Context r3 = r5.f17108a     // Catch:{ all -> 0x0110 }
            r2.setDefaults(r3)     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashMetaData r2 = com.startapp.sdk.ads.splash.SplashMetaData.f16587a     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashMetaData r3 = r5.f17113f     // Catch:{ all -> 0x0110 }
            boolean r2 = com.startapp.j9.a(r2, r3)     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x0114
            r5.f17118k = r1     // Catch:{ all -> 0x0110 }
            android.content.Context r2 = r5.f17108a     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashMetaData r3 = r5.f17113f     // Catch:{ all -> 0x0110 }
            com.startapp.sdk.ads.splash.SplashMetaData.a(r2, r3)     // Catch:{ all -> 0x0110 }
            goto L_0x0114
        L_0x0110:
            r2 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0157 }
        L_0x0114:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.j9.f15982a     // Catch:{ all -> 0x0157 }
            com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f16922a     // Catch:{ all -> 0x012a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r3 = r5.f17114g     // Catch:{ all -> 0x012a }
            boolean r2 = com.startapp.j9.a(r2, r3)     // Catch:{ all -> 0x012a }
            if (r2 != 0) goto L_0x012e
            r5.f17118k = r1     // Catch:{ all -> 0x012a }
            android.content.Context r2 = r5.f17108a     // Catch:{ all -> 0x012a }
            com.startapp.sdk.adsbase.cache.CacheMetaData r3 = r5.f17114g     // Catch:{ all -> 0x012a }
            com.startapp.sdk.adsbase.cache.CacheMetaData.a(r2, r3)     // Catch:{ all -> 0x012a }
            goto L_0x012e
        L_0x012a:
            r2 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r2)     // Catch:{ all -> 0x0157 }
        L_0x012e:
            java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.j9.f15982a     // Catch:{ all -> 0x0157 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r2 = com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.f16857a     // Catch:{ all -> 0x0144 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r3 = r5.f17115h     // Catch:{ all -> 0x0144 }
            boolean r2 = com.startapp.j9.a(r2, r3)     // Catch:{ all -> 0x0144 }
            if (r2 != 0) goto L_0x0148
            r5.f17118k = r1     // Catch:{ all -> 0x0144 }
            android.content.Context r1 = r5.f17108a     // Catch:{ all -> 0x0144 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData r2 = r5.f17115h     // Catch:{ all -> 0x0144 }
            com.startapp.sdk.adsbase.adinformation.AdInformationMetaData.a(r1, r2)     // Catch:{ all -> 0x0144 }
            goto L_0x0148
        L_0x0144:
            r1 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r1)     // Catch:{ all -> 0x0157 }
        L_0x0148:
            android.content.Context r1 = r5.f17108a     // Catch:{ Exception -> 0x0153 }
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = r5.f17111d     // Catch:{ Exception -> 0x0153 }
            java.lang.String r2 = r2.h()     // Catch:{ Exception -> 0x0153 }
            com.startapp.sdk.adsbase.remoteconfig.MetaData.a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0153 }
        L_0x0153:
            monitor-exit(r0)     // Catch:{ all -> 0x0157 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0157:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0157 }
            throw r1
        L_0x015a:
            r0 = move-exception
            com.startapp.i3.a((java.lang.Throwable) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.a.a():java.lang.Boolean");
    }

    public void a(Boolean bool) {
        MetaData metaData;
        Context context;
        synchronized (MetaData.f17063d) {
            if (!this.f17117j) {
                if (!bool.booleanValue() || (metaData = this.f17111d) == null || (context = this.f17108a) == null) {
                    MetaData.a(this.f17110c);
                } else {
                    try {
                        MetaData.a(context, metaData, this.f17110c, this.f17118k);
                    } catch (Throwable th) {
                        i3.a(th);
                    }
                }
            }
        }
    }

    public static z5.a a(Context context, MetaDataRequest metaDataRequest) {
        z5.a aVar;
        List<String> list = MetaData.f17070k.metaDataHosts;
        if (list == null || list.size() < 1) {
            list = MetaData.f17066g;
        }
        for (T a10 : Collections.unmodifiableList(list)) {
            a3 m10 = ComponentLocator.a(context).m();
            StringBuilder a11 = p0.a(a10);
            a11.append(AdsConstants.f16774d);
            try {
                aVar = m10.a(a11.toString(), metaDataRequest, (g2<Throwable, Void>) null);
            } catch (Throwable th) {
                if (m10.a(1)) {
                    i3.a(th);
                }
                aVar = null;
            }
            if (aVar == null) {
                if (!ComponentLocator.a(context).f().a()) {
                    break;
                }
            } else {
                return aVar;
            }
        }
        return null;
    }
}
