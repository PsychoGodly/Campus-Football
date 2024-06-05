package com.onesignal;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.File;

/* compiled from: RootToolsInternalMethods */
class j4 {
    static boolean a() {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        int i10 = 0;
        while (i10 < 8) {
            try {
                String str = strArr[i10];
                if (new File(str + AndroidStaticDeviceInfoDataSource.BINARY_SU).exists()) {
                    return true;
                }
                i10++;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
