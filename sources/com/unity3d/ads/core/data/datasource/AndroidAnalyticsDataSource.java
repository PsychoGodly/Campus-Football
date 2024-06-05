package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;

/* compiled from: AndroidAnalyticsDataSource.kt */
public final class AndroidAnalyticsDataSource implements AnalyticsDataSource {
    public String getUserId() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + ".v2.playerprefs", "unity.cloud_userid");
    }
}
