package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import n4.h;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class ve {

    /* renamed from: a  reason: collision with root package name */
    private static final TreeMap f12735a;

    /* renamed from: b  reason: collision with root package name */
    private static final List f12736b;

    /* renamed from: c  reason: collision with root package name */
    private static JSONArray f12737c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f12738d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final Map f12739e = Collections.synchronizedMap(new HashMap(1));

    static {
        TreeMap treeMap = new TreeMap();
        f12735a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.BigoAdsMediationAdapter", "Bigo Ads");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        treeMap.put("com.applovin.mediation.adapters.MolocoMediationAdapter", "Moloco");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.NimbusMediationAdapter", "Nimbus");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.TaboolaMediationAdapter", "Taboola");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        f12736b = new ArrayList(treeMap.keySet());
    }

    public static MaxAdapter a(String str, k kVar) {
        Class<MaxAdapter> cls = MaxAdapter.class;
        if (TextUtils.isEmpty(str)) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return (MaxAdapter) cls2.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{kVar.v0()});
            }
            kVar.L();
            if (t.a()) {
                t L = kVar.L();
                L.b("AppLovinSdk", str + " error: not an instance of '" + cls.getName() + "'.");
            }
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            kVar.L();
            if (t.a()) {
                t L2 = kVar.L();
                L2.a("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    public static JSONObject b(String str, k kVar) {
        JSONArray a10 = a(kVar);
        for (int i10 = 0; i10 < a10.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a10, i10, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", (String) null))) {
                return jSONObject;
            }
        }
        return null;
    }

    public static boolean b(Object obj) {
        return (obj instanceof b) && StringUtils.isValidString(((b) obj).H());
    }

    private static void b(k kVar) {
        MaxAdapter a10;
        for (int i10 = 0; i10 < f12737c.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f12737c, i10, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", MaxReward.DEFAULT_LABEL);
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", MaxReward.DEFAULT_LABEL)) && (a10 = a(string, kVar)) != null) {
                String a11 = a(a10);
                if (StringUtils.isValidString(a11)) {
                    synchronized (f12738d) {
                        JsonUtils.putString(jSONObject, "sdk_version", a11);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static String a(MaxAdapter maxAdapter) {
        try {
            return StringUtils.emptyIfNull(maxAdapter.getSdkVersion());
        } catch (Throwable th) {
            t.c("MediationUtils", "Failed to retrieve SDK version for adapter: " + maxAdapter, th);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public static AppLovinSdkUtils.Size a(int i10, MaxAdFormat maxAdFormat, Context context) {
        if (i10 < 0) {
            try {
                i10 = AppLovinSdkUtils.pxToDp(context, x3.a(context).x);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Map map = f12739e;
        AppLovinSdkUtils.Size size = (AppLovinSdkUtils.Size) map.get(Integer.valueOf(i10));
        if (size != null) {
            return size;
        }
        Class<h> cls = h.class;
        h hVar = h.f20927i;
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", new Class[]{Context.class, Integer.TYPE});
        Method method2 = cls.getMethod("getWidth", new Class[0]);
        Method method3 = cls.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke((Object) null, new Object[]{context, Integer.valueOf(i10)});
        AppLovinSdkUtils.Size size2 = new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
        map.put(Integer.valueOf(i10), size2);
        return size2;
    }

    public static boolean a(Object obj) {
        return (obj instanceof be) && "APPLOVIN".equals(((be) obj).k());
    }

    public static boolean a(JSONObject jSONObject, String str, k kVar) {
        if (!JsonUtils.containsJSONObjectContainingInt(jSONObject.optJSONArray("no_fill_reason"), 1035, "code")) {
            return false;
        }
        kVar.B().a(o.b.INTEGRATION_ERROR, "invalid_or_disabled_ad_unit_id", (Map) CollectionUtils.hashMap("ad_unit_id", str), "invalid_or_disabled_ad_unit_id" + str);
        return true;
    }

    public static JSONArray a(k kVar) {
        if (f12737c != null) {
            b(kVar);
            return f12737c;
        }
        f12737c = new JSONArray();
        for (String str : f12736b) {
            MaxAdapter a10 = a(str, kVar);
            if (a10 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(MediationMetaData.KEY_NAME, f12735a.get(str));
                    jSONObject.put("class", str);
                    jSONObject.put("sdk_version", a(a10));
                    jSONObject.put("version", a10.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f12738d) {
                    f12737c.put(jSONObject);
                }
            }
        }
        return f12737c;
    }
}
