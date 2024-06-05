package com.applovin.sdk;

import com.applovin.sdk.AppLovinSdkConfiguration;

public interface AppLovinTermsAndPrivacyPolicyFlowSettings extends AppLovinTermsFlowSettings {
    AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography();

    void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography);
}
