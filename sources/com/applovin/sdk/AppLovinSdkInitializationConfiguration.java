package com.applovin.sdk;

import java.util.List;

public interface AppLovinSdkInitializationConfiguration {

    public interface Builder {
        AppLovinSdkInitializationConfiguration build();

        List<String> getAdUnitIds();

        String getMediationProvider();

        String getPluginVersion();

        String getSdkKey();

        AppLovinTargetingData getTargetingData();

        List<String> getTestDeviceAdvertisingIds();

        AppLovinUserSegment getUserSegment();

        boolean isExceptionHandlerEnabled();

        Builder setAdUnitIds(List<String> list);

        Builder setExceptionHandlerEnabled(boolean z10);

        Builder setMediationProvider(String str);

        Builder setPluginVersion(String str);

        Builder setTargetingData(AppLovinTargetingData appLovinTargetingData);

        Builder setTestDeviceAdvertisingIds(List<String> list);

        Builder setUserSegment(AppLovinUserSegment appLovinUserSegment);
    }

    List<String> getAdUnitIds();

    String getMediationProvider();

    String getPluginVersion();

    String getSdkKey();

    AppLovinTargetingData getTargetingData();

    List<String> getTestDeviceAdvertisingIds();

    AppLovinUserSegment getUserSegment();

    boolean isExceptionHandlerEnabled();
}
