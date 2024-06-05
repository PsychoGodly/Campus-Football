package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j9;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.t7;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: Sta */
public class StartAppSDK {
    public static void addWrapper(Context context, String str, String str2) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.d.f16847a;
        if (startAppSDKInternal.f16823q == null) {
            startAppSDKInternal.f16823q = new TreeMap();
        }
        startAppSDKInternal.f16823q.put(str, str2);
        e e10 = ComponentLocator.a(context).e();
        Map<String, String> map = startAppSDKInternal.f16823q;
        Map<Activity, Integer> map2 = j9.f15982a;
        String jSONObject = new JSONObject(map).toString();
        e.a a10 = e10.edit();
        a10.a("sharedPrefsWrappers", jSONObject);
        a10.f17013a.putString("sharedPrefsWrappers", jSONObject);
        a10.apply();
    }

    public static void enableReturnAds(boolean z10) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.a(z10);
    }

    public static SharedPreferences getExtras(Context context) {
        return ComponentLocator.a(context).k();
    }

    public static String getVersion() {
        return "4.10.12";
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void init(Context context, String str) {
        init(context, str, new SDKAdPreferences());
    }

    public static void setTestAdsEnabled(boolean z10) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.C = z10;
    }

    public static void setUserConsent(Context context, String str, long j10, boolean z10) {
        String str2;
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            e e10 = ComponentLocator.a(context).e();
            String string = e10.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", (String) null);
            String str3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            if (string != null) {
                if (string.equals(z10 ? str3 : "0")) {
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            sb2.append(str2);
            sb2.append("M");
            String sb3 = sb2.toString();
            i3 i3Var = new i3(j3.f15951d);
            i3Var.f15914d = "User consent: " + str;
            i3Var.f15915e = sb3;
            i3Var.a();
            e.a a10 = e10.edit();
            if (!z10) {
                str3 = "0";
            }
            a10.a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str3);
            a10.f17013a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str3);
            a10.apply();
            t7.f17299d.a(context, MetaDataRequest.RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.b(context, MetaDataRequest.RequestReason.CUSTOM);
    }

    public static void inAppPurchaseMade(Context context, double d10) {
        e e10 = ComponentLocator.a(context).e();
        float f10 = e10.getFloat("inAppPurchaseAmount", 0.0f);
        e.a a10 = e10.edit();
        float f11 = (float) (((double) f10) + d10);
        a10.a("inAppPurchaseAmount", Float.valueOf(f11));
        a10.f17013a.putFloat("inAppPurchaseAmount", f11);
        a10.a("payingUser", Boolean.TRUE);
        a10.f17013a.putBoolean("payingUser", true);
        a10.apply();
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.b(context, MetaDataRequest.RequestReason.IN_APP_PURCHASE);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    public static void init(Context context, String str, boolean z10) {
        init(context, (String) null, str, z10);
    }

    public static void init(Context context, String str, String str2, boolean z10) {
        init(context, str, str2, new SDKAdPreferences(), z10);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences, boolean z10) {
        init(context, (String) null, str, sDKAdPreferences, z10);
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z10) {
        Object obj = StartAppSDKInternal.D;
        StartAppSDKInternal.d.f16847a.a(context, str, str2, sDKAdPreferences, z10);
    }
}
