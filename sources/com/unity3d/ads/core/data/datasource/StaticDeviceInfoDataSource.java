package com.unity3d.ads.core.data.datasource;

import java.util.List;
import vb.b3;
import xd.d;

/* compiled from: StaticDeviceInfoDataSource.kt */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, d<? super b3> dVar);

    b3 fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(d<? super String> dVar);

    Object getIdfi(d<? super String> dVar);

    String getManufacturer();

    String getModel();

    String getOsVersion();
}
