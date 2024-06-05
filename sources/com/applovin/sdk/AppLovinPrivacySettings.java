package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.y3;

public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i10) {
        k kVar = k.A0;
        if (kVar != null) {
            return kVar.m0().a(i10);
        }
        t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i10) {
        k kVar = k.A0;
        if (kVar != null) {
            return kVar.m0().b(i10);
        }
        t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i10) {
        k kVar = k.A0;
        if (kVar != null) {
            return kVar.m0().c(i10);
        }
        t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i10) {
        k kVar = k.A0;
        if (kVar != null) {
            return kVar.m0().d(i10);
        }
        t.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static boolean hasUserConsent(Context context) {
        Boolean b10 = y3.b().b(context);
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        Boolean b10 = y3.c().b(context);
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUserSet(Context context) {
        return y3.c().b(context) != null;
    }

    public static boolean isDoNotSell(Context context) {
        Boolean b10 = y3.a().b(context);
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(Context context) {
        return y3.a().b(context) != null;
    }

    public static boolean isUserConsentSet(Context context) {
        return y3.b().b(context) != null;
    }

    public static void setDoNotSell(boolean z10, Context context) {
        t.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (y3.a(z10, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, (Boolean) null, Boolean.valueOf(z10));
        }
    }

    public static void setHasUserConsent(boolean z10, Context context) {
        t.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (y3.b(z10, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z10), (Boolean) null, (Boolean) null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z10, Context context) {
        t.g("AppLovinPrivacySettings", "setIsAgeRestrictedUser()");
        if (y3.c(z10, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, Boolean.valueOf(z10), (Boolean) null);
        }
    }
}
