package com.unity3d.services.core.api;

import android.content.Context;
import com.unity3d.services.ads.adunit.AdUnitError;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.device.DeviceError;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import org.json.JSONArray;

public class Permissions {
    @WebViewExposed
    public static void checkPermission(String str, WebViewCallback webViewCallback) {
        if (ClientProperties.getApplicationContext() == null) {
            webViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            Context applicationContext = ClientProperties.getApplicationContext();
            webViewCallback.invoke(Integer.valueOf(applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName())));
        } catch (Exception e10) {
            webViewCallback.error(PermissionsError.ERROR_CHECKING_PERMISSION, e10.getMessage());
        }
    }

    @WebViewExposed
    public static void getPermissions(WebViewCallback webViewCallback) {
        if (ClientProperties.getApplicationContext() == null) {
            webViewCallback.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Context applicationContext = ClientProperties.getApplicationContext();
            String[] strArr = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String put : strArr) {
                    jSONArray.put(put);
                }
                webViewCallback.invoke(jSONArray);
                return;
            }
            webViewCallback.error(PermissionsError.NO_REQUESTED_PERMISSIONS, new Object[0]);
        } catch (Exception e10) {
            webViewCallback.error(PermissionsError.COULDNT_GET_PERMISSIONS, e10.getMessage());
        }
    }

    @WebViewExposed
    public static void requestPermissions(JSONArray jSONArray, Integer num, WebViewCallback webViewCallback) {
        if (AdUnit.getAdUnitActivity() == null) {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        } else if (jSONArray == null || jSONArray.length() < 1) {
            webViewCallback.error(PermissionsError.NO_REQUESTED_PERMISSIONS, new Object[0]);
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.getString(i10));
                }
                AdUnit.getAdUnitActivity().requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), num.intValue());
                webViewCallback.invoke(new Object[0]);
            } catch (Exception e10) {
                webViewCallback.error(PermissionsError.ERROR_REQUESTING_PERMISSIONS, e10.getMessage());
            }
        }
    }
}
