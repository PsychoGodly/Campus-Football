package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class h0 {

    /* renamed from: e  reason: collision with root package name */
    private static final Map f8161e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f8162f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f8163a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8164b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdSize f8165c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdType f8166d;

    private h0(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String str2;
        if (!TextUtils.isEmpty(str) || !(appLovinAdType == null || appLovinAdSize == null)) {
            this.f8165c = appLovinAdSize;
            this.f8166d = appLovinAdType;
            if (StringUtils.isValidString(str)) {
                str2 = str.trim().toLowerCase(Locale.ENGLISH);
            } else {
                str2 = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
            }
            if (z10) {
                str2 = str2 + "_bidding";
            }
            if (z11) {
                str2 = str2 + "_direct_sold";
            }
            this.f8164b = str2;
            return;
        }
        throw new IllegalArgumentException("No zone identifier or type or size specified");
    }

    public static h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, (String) null);
    }

    public static h0 b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static h0 c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static h0 h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static h0 j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static h0 k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static h0 l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static h0 m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize f10 = f();
        if (f10 == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (f10 == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (f10 == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (f10 == AppLovinAdSize.INTERSTITIAL) {
            if (g() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (g() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (g() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (g() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        } else if (f10 == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        } else {
            return null;
        }
    }

    public String e() {
        return this.f8164b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return this.f8164b.equalsIgnoreCase(((h0) obj).f8164b);
    }

    public AppLovinAdSize f() {
        if (this.f8165c == null && JsonUtils.valueExists(this.f8163a, "ad_size")) {
            this.f8165c = AppLovinAdSize.fromString(JsonUtils.getString(this.f8163a, "ad_size", (String) null));
        }
        return this.f8165c;
    }

    public AppLovinAdType g() {
        if (this.f8166d == null && JsonUtils.valueExists(this.f8163a, "ad_type")) {
            this.f8166d = AppLovinAdType.fromString(JsonUtils.getString(this.f8163a, "ad_type", (String) null));
        }
        return this.f8166d;
    }

    public int hashCode() {
        return this.f8164b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f8164b + ", zoneObject=" + this.f8163a + '}';
    }

    public static h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static h0 b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static h0 a(String str) {
        return a((AppLovinAdSize) null, (AppLovinAdType) null, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f8162f) {
                h0 h0Var = (h0) f8161e.get(JsonUtils.getString(jSONObject, "zone_id", MaxReward.DEFAULT_LABEL));
                if (h0Var != null) {
                    h0Var.f8165c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", MaxReward.DEFAULT_LABEL));
                    h0Var.f8166d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", MaxReward.DEFAULT_LABEL));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.applovin.impl.h0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.applovin.impl.h0 a(com.applovin.sdk.AppLovinAdSize r7, com.applovin.sdk.AppLovinAdType r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            com.applovin.impl.h0 r6 = new com.applovin.impl.h0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = f8162f
            monitor-enter(r7)
            java.lang.String r8 = r6.f8164b     // Catch:{ all -> 0x0025 }
            java.util.Map r9 = f8161e     // Catch:{ all -> 0x0025 }
            boolean r10 = r9.containsKey(r8)     // Catch:{ all -> 0x0025 }
            if (r10 == 0) goto L_0x0020
            java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x0025 }
            r6 = r8
            com.applovin.impl.h0 r6 = (com.applovin.impl.h0) r6     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x0020:
            r9.put(r8, r6)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r7)     // Catch:{ all -> 0x0025 }
            return r6
        L_0x0025:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0025 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h0.a(com.applovin.sdk.AppLovinAdSize, com.applovin.sdk.AppLovinAdType, java.lang.String, boolean, boolean):com.applovin.impl.h0");
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, new h0[]{c(), k(), j(), m(), b(), h(), l()});
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
