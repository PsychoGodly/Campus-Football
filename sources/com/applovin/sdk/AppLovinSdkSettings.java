package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.f4;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.AppLovinSdkSettingsBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class AppLovinSdkSettings extends AppLovinSdkSettingsBase {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14096a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14097b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14098c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14099d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14100e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14101f = true;

    /* renamed from: g  reason: collision with root package name */
    private String f14102g;

    /* renamed from: h  reason: collision with root package name */
    private String f14103h;

    /* renamed from: i  reason: collision with root package name */
    private List f14104i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    private List f14105j = Collections.emptyList();

    /* renamed from: k  reason: collision with root package name */
    private final Map f14106k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private k f14107l;
    private final Map<String, Object> localSettings = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private String f14108m = MaxReward.DEFAULT_LABEL;
    private final Map<String, String> metaData = new HashMap();

    public AppLovinSdkSettings(Context context) {
        if (context == null) {
            t.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context d10 = zp.d(context);
        this.f14096a = zp.k(d10);
        this.backingConsentFlowSettings = f4.a(d10);
        this.f14108m = d10.getPackageName();
        a(d10);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier != 0) {
            String a10 = zp.a(identifier, context, (k) null);
            this.f14106k.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(a10) ? JsonUtils.jsonObjectFromJsonString(a10, new JSONObject()) : new JSONObject()));
        }
    }

    public void attachAppLovinSdk(k kVar) {
        this.f14107l = kVar;
        if (StringUtils.isValidString(this.f14102g)) {
            kVar.n0().a(Arrays.asList(this.f14102g.split(",")));
            this.f14102g = null;
        }
        if (this.f14103h != null) {
            kVar.L();
            if (t.a()) {
                t L = kVar.L();
                L.a("AppLovinSdkSettings", "Setting user id: " + this.f14103h);
            }
            kVar.t0().a(this.f14103h);
            this.f14103h = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f14106k) {
            map = CollectionUtils.map(this.f14106k);
        }
        return map;
    }

    @Deprecated
    public List<String> getInitializationAdUnitIds() {
        return this.f14105j;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        ((g4) this.backingConsentFlowSettings).a(g4.a.UNIFIED);
        return this.backingConsentFlowSettings;
    }

    @Deprecated
    public AppLovinTermsFlowSettings getTermsFlowSettings() {
        ((g4) this.backingConsentFlowSettings).a(g4.a.TERMS);
        return this.backingConsentFlowSettings;
    }

    @Deprecated
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f14104i;
    }

    public String getUserIdentifier() {
        k kVar = this.f14107l;
        if (kVar == null) {
            return this.f14103h;
        }
        return kVar.t0().c();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f14098c;
    }

    @Deprecated
    public boolean isExceptionHandlerEnabled() {
        return this.f14099d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f14100e;
    }

    public boolean isMuted() {
        return this.f14097b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f14096a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        t.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f14098c != z10) {
            this.f14098c = z10;
            k kVar = this.f14107l;
            if (kVar != null) {
                if (z10) {
                    kVar.v().l();
                } else {
                    kVar.v().k();
                }
            }
        }
    }

    @Deprecated
    public void setExceptionHandlerEnabled(boolean z10) {
        t.e("AppLovinSdkSettings", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
        this.f14099d = z10;
    }

    public void setExtraParameter(String str, String str2) {
        t.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            t.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f14107l == null) {
                this.f14102g = trim;
            } else if (StringUtils.isValidString(trim)) {
                this.f14107l.n0().a(Arrays.asList(trim.split(",")));
            } else {
                this.f14107l.n0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f14108m.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            t.a(Boolean.parseBoolean(trim));
        }
        this.f14106k.put(str, trim);
    }

    @Deprecated
    public void setInitializationAdUnitIds(List<String> list) {
        t.e("AppLovinSdkSettings", "setInitializationAdUnitIds(initializationAdUnitIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (StringUtils.isValidString(next) && next.length() > 0) {
                    if (next.length() == 16) {
                        arrayList.add(next);
                    } else {
                        t.h("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + next + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f14105j = arrayList;
            return;
        }
        this.f14105j = Collections.emptyList();
    }

    public void setLocationCollectionEnabled(boolean z10) {
        t.e("AppLovinSdkSettings", "setLocationCollectionEnabled(locationCollectionEnabled=" + z10 + ")");
        this.f14100e = z10;
    }

    public void setMuted(boolean z10) {
        t.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f14097b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        t.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f14101f = z10;
    }

    @Deprecated
    public void setTestDeviceAdvertisingIds(List<String> list) {
        t.e("AppLovinSdkSettings", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (next == null || next.length() != 36) {
                    t.h("AppLovinSdkSettings", "Unable to set test device advertising id (" + next + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(next);
                }
            }
            this.f14104i = arrayList;
            return;
        }
        this.f14104i = Collections.emptyList();
    }

    public void setUserIdentifier(String str) {
        t.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > zp.b(8)) {
            t.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + zp.b(8) + " maximum)");
        }
        k kVar = this.f14107l;
        if (kVar != null) {
            kVar.L();
            if (t.a()) {
                t L = this.f14107l.L();
                L.a("AppLovinSdkSettings", "Setting user id: " + str);
            }
            this.f14107l.t0().a(str);
            return;
        }
        this.f14103h = str;
    }

    public void setVerboseLogging(boolean z10) {
        t.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (zp.k()) {
            t.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            if (zp.k((Context) null) != z10) {
                t.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f14096a = z10;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f14101f;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f14096a + ", muted=" + this.f14097b + ", testDeviceAdvertisingIds=" + this.f14104i.toString() + ", initializationAdUnitIds=" + this.f14105j.toString() + ", creativeDebuggerEnabled=" + this.f14098c + ", exceptionHandlerEnabled=" + this.f14099d + ", locationCollectionEnabled=" + this.f14100e + '}';
    }
}
