package com.unity3d.services.ads.api;

import android.view.InputEvent;
import com.unity3d.services.ads.measurements.MeasurementsErrors;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Measurements {
    private static final MeasurementsService measurementsService = ((MeasurementsService) Utilities.getService(MeasurementsService.class));

    @WebViewExposed
    public static void checkAvailability(WebViewCallback webViewCallback) {
        measurementsService.checkAvailability();
        webViewCallback.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void registerClick(String str, WebViewCallback webViewCallback) {
        if (AdUnit.getAdUnitActivity() == null) {
            webViewCallback.error(MeasurementsErrors.ERROR_AD_UNIT_NULL, new Object[0]);
        } else if (AdUnit.getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(MeasurementsErrors.ERROR_LAYOUT_NULL, new Object[0]);
        } else {
            InputEvent lastInputEvent = AdUnit.getAdUnitActivity().getLayout().getLastInputEvent();
            if (lastInputEvent == null) {
                webViewCallback.error(MeasurementsErrors.ERROR_LAST_INPUT_EVENT_NULL, new Object[0]);
                return;
            }
            measurementsService.registerClick(str, lastInputEvent);
            webViewCallback.invoke(new Object[0]);
        }
    }

    @WebViewExposed
    public static void registerView(String str, WebViewCallback webViewCallback) {
        measurementsService.registerView(str);
        webViewCallback.invoke(new Object[0]);
    }
}
