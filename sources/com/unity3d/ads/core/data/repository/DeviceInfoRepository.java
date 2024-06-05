package com.unity3d.ads.core.data.repository;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import se.e;
import se.v;
import vb.a1;
import vb.b3;
import vb.m2;
import xd.d;

/* compiled from: DeviceInfoRepository.kt */
public interface DeviceInfoRepository {
    b3 cachedStaticDeviceInfo();

    v<vb.v> getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(d<? super i> dVar);

    Object getAuidString(d<? super String> dVar);

    String getConnectionTypeStr();

    a1 getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(d<? super String> dVar);

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    m2 getPiiData();

    int getRingerMode();

    e<VolumeSettingsChange> getVolumeSettingsChange();

    Object staticDeviceInfo(d<? super b3> dVar);
}
