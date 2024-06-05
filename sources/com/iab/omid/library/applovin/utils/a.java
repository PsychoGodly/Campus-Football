package com.iab.omid.library.applovin.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.applovin.adsession.DeviceCategory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static UiModeManager f27428a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f27428a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV;
        }
        return DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f27428a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
