package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;
import java.util.HashMap;

public class MobileAdsBridgeLegacy extends MobileAdsBridgeBase {
    public static final int CODE_20_0 = 210402000;
    public static final int CODE_21_0 = 221310000;
    public static final String versionStringMethodName = "getVersionString";

    public MobileAdsBridgeLegacy() {
        super(new HashMap<String, Class<?>[]>() {
            {
                try {
                    put(MobileAdsBridgeBase.initializeMethodName, new Class[]{Context.class, OnInitializationCompleteListener.class});
                } catch (ClassNotFoundException e10) {
                    DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", e10.getLocalizedMessage());
                }
                put(MobileAdsBridgeBase.initializationStatusMethodName, new Class[0]);
                put(MobileAdsBridgeLegacy.versionStringMethodName, new Class[0]);
            }
        });
    }

    public ScarAdapterVersion getAdapterVersion(int i10) {
        if (i10 < 210402000 || i10 >= 221310000) {
            return ScarAdapterVersion.NA;
        }
        return ScarAdapterVersion.V20;
    }

    public int getVersionCodeIndex() {
        return 1;
    }

    public String getVersionMethodName() {
        return versionStringMethodName;
    }

    public boolean hasSCARBiddingSupport() {
        return false;
    }

    public boolean shouldInitialize() {
        return true;
    }
}
