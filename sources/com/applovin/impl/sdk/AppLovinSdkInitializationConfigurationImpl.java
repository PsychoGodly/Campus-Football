package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppLovinSdkInitializationConfigurationImpl implements AppLovinSdkInitializationConfiguration {

    /* renamed from: a  reason: collision with root package name */
    private final String f11419a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11420b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11421c;

    /* renamed from: d  reason: collision with root package name */
    private final AppLovinUserSegment f11422d;

    /* renamed from: e  reason: collision with root package name */
    private final AppLovinTargetingData f11423e;

    /* renamed from: f  reason: collision with root package name */
    private final List f11424f;

    /* renamed from: g  reason: collision with root package name */
    private final List f11425g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11426h;

    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f11427a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f11428b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f11429c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public AppLovinUserSegment f11430d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public AppLovinTargetingData f11431e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public List f11432f = Collections.emptyList();
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public List f11433g = Collections.emptyList();
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public boolean f11434h = true;

        public BuilderImpl(String str, Context context) {
            this.f11427a = str;
            t.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        public List<String> getAdUnitIds() {
            return this.f11433g;
        }

        public String getMediationProvider() {
            return this.f11428b;
        }

        public String getPluginVersion() {
            return this.f11429c;
        }

        public String getSdkKey() {
            return this.f11427a;
        }

        public AppLovinTargetingData getTargetingData() {
            return this.f11431e;
        }

        public List<String> getTestDeviceAdvertisingIds() {
            return this.f11432f;
        }

        public AppLovinUserSegment getUserSegment() {
            return this.f11430d;
        }

        public boolean isExceptionHandlerEnabled() {
            return this.f11434h;
        }

        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            t.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (StringUtils.isValidString(next) && next.length() > 0) {
                    if (next.length() == 16) {
                        arrayList.add(next);
                    } else {
                        t.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + next + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f11433g = arrayList;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            t.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
            this.f11434h = z10;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(String str) {
            t.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.f11428b = str;
                return this;
            }
            t.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(String str) {
            t.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f11429c = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f11427a = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setTargetingData(AppLovinTargetingData appLovinTargetingData) {
            t.e("AppLovinSdkInitializationConfiguration", "setTargetingData(targetingData=" + appLovinTargetingData + ")");
            this.f11431e = appLovinTargetingData;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            t.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (next == null || next.length() != 36) {
                    t.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + next + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(next);
                }
            }
            this.f11432f = arrayList;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setUserSegment(AppLovinUserSegment appLovinUserSegment) {
            t.e("AppLovinSdkInitializationConfiguration", "setUserSegment(userSegment=" + appLovinUserSegment + ")");
            this.f11430d = appLovinUserSegment;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f11427a + "mediationProvider=" + this.f11428b + "pluginVersion=" + this.f11429c + "testDeviceAdvertisingIdentifiers=" + this.f11432f + "adUnitIdentifiers=" + this.f11433g + "isExceptionHandlerEnabled=" + this.f11434h + "userSegment=" + this.f11430d + "targetingData=" + this.f11431e + "}";
        }
    }

    public List<String> getAdUnitIds() {
        return this.f11425g;
    }

    public String getMediationProvider() {
        return this.f11420b;
    }

    public String getPluginVersion() {
        return this.f11421c;
    }

    public String getSdkKey() {
        return this.f11419a;
    }

    public AppLovinTargetingData getTargetingData() {
        return this.f11423e;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f11424f;
    }

    public AppLovinUserSegment getUserSegment() {
        return this.f11422d;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f11426h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f11419a + ", mediationProvider=" + this.f11420b + ", pluginVersion=" + this.f11421c + ", testDeviceAdvertisingIdentifiers=" + this.f11424f + ", adUnitIdentifiers=" + this.f11425g + ", isExceptionHandlerEnabled=" + this.f11426h + ", userSegment=" + this.f11422d + ", targetingData=" + this.f11423e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f11419a = builderImpl.f11427a;
        this.f11420b = builderImpl.f11428b;
        this.f11421c = builderImpl.f11429c;
        this.f11422d = builderImpl.f11430d;
        this.f11423e = builderImpl.f11431e;
        this.f11424f = builderImpl.f11432f;
        this.f11425g = builderImpl.f11433g;
        this.f11426h = builderImpl.f11434h;
    }
}
