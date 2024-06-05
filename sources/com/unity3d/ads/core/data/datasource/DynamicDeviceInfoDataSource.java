package com.unity3d.ads.core.data.datasource;

import se.e;
import vb.a1;

/* compiled from: DynamicDeviceInfoDataSource.kt */
public interface DynamicDeviceInfoDataSource {
    a1 fetch();

    String getConnectionTypeStr();

    String getOrientation();

    int getRingerMode();

    e<VolumeSettingsChange> getVolumeSettingsChange();

    boolean hasInternet();
}
