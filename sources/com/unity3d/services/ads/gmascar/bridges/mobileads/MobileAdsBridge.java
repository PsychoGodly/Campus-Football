package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import java.util.HashMap;

public class MobileAdsBridge extends MobileAdsBridgeBase {
    public static final int CODE_21 = 21;
    public static final String versionMethodName = "getVersion";
    private ConfigurationReader _configurationReader = new ConfigurationReader();

    public MobileAdsBridge() {
        super(new HashMap<String, Class<?>[]>() {
            {
                try {
                    put(MobileAdsBridgeBase.initializeMethodName, new Class[]{Context.class, OnInitializationCompleteListener.class});
                } catch (ClassNotFoundException e10) {
                    DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", e10.getLocalizedMessage());
                }
                put(MobileAdsBridgeBase.initializationStatusMethodName, new Class[0]);
                put(MobileAdsBridge.versionMethodName, new Class[0]);
            }
        });
    }

    public ScarAdapterVersion getAdapterVersion(int i10) {
        if (i10 == -1) {
            return ScarAdapterVersion.NA;
        }
        if (i10 < 23) {
            return ScarAdapterVersion.V21;
        }
        return ScarAdapterVersion.V23;
    }

    public int getVersionCodeIndex() {
        return 0;
    }

    public String getVersionMethodName() {
        return versionMethodName;
    }

    public boolean hasSCARBiddingSupport() {
        return true;
    }

    public boolean shouldInitialize() {
        return this._configurationReader.getCurrentConfiguration().getExperiments().isScarInitEnabled();
    }
}
