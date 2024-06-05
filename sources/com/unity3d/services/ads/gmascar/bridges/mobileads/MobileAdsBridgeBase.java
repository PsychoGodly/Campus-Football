package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.Map;

public abstract class MobileAdsBridgeBase extends GenericBridge implements IMobileAdsBridge {
    public static final String initializationStatusMethodName = "getInitializationStatus";
    public static final String initializeMethodName = "initialize";

    public MobileAdsBridgeBase(Map<String, Class<?>[]> map) {
        super(map);
    }

    public String getClassName() {
        return "com.google.android.gms.ads.MobileAds";
    }

    public Object getInitializationStatus() {
        return callNonVoidMethod(initializationStatusMethodName, (Object) null, new Object[0]);
    }

    public String getVersionString() {
        Object callNonVoidMethod = callNonVoidMethod(getVersionMethodName(), (Object) null, new Object[0]);
        if (callNonVoidMethod == null) {
            return "0.0.0";
        }
        return callNonVoidMethod.toString();
    }

    public abstract boolean hasSCARBiddingSupport();

    public void initialize(Context context, Object obj) {
        callVoidMethod(initializeMethodName, (Object) null, context, obj);
    }
}
