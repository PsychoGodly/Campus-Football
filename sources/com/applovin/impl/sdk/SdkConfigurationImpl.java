package com.applovin.impl.sdk;

import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;
import lombok.NonNull;

public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* renamed from: a  reason: collision with root package name */
    private final List f11458a;

    /* renamed from: b  reason: collision with root package name */
    private final k f11459b;

    public SdkConfigurationImpl(List<String> list, k kVar) {
        this.f11458a = list;
        this.f11459b = kVar;
    }

    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.f11459b.g0().getExtraParameters().get("consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f11459b.a(oj.f10406s6);
        }
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentDialogState.APPLIES;
        }
        if ("does_not_apply".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY;
        }
        return AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography getConsentFlowUserGeography() {
        String str = (String) this.f11459b.a(oj.f10406s6);
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("does_not_apply".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    public String getCountryCode() {
        return (String) this.f11459b.a(oj.f10414t6);
    }

    public List<String> getEnabledAmazonAdUnitIds() {
        return this.f11458a;
    }

    public boolean isTestModeEnabled() {
        return this.f11459b.n0().c();
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + ", testModeEnabled=" + isTestModeEnabled() + '}';
    }
}
