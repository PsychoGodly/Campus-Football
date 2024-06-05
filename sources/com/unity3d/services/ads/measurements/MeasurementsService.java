package com.unity3d.services.ads.measurements;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.m;
import pe.u1;

/* compiled from: MeasurementsService.kt */
public final class MeasurementsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final MeasurementManager measurementManager;

    public MeasurementsService(Context context, ISDKDispatchers iSDKDispatchers, IEventSender iEventSender) {
        m.e(context, "context");
        m.e(iSDKDispatchers, "dispatchers");
        m.e(iEventSender, "eventSender");
        this.dispatchers = iSDKDispatchers;
        this.eventSender = iEventSender;
        this.measurementManager = getMeasurementManager(context);
    }

    private final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }

    public final void checkAvailability() {
        if (Device.getApiLevel() < 33) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_API_BELOW_33);
        } else if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXTENSION_BELOW_4);
        } else if (this.measurementManager == null) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_MANAGER_NULL);
        } else if (!AdServicesState.isAdServicesStateEnabled()) {
            this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_AD_SERVICES_DISABLED);
        } else {
            this.measurementManager.getMeasurementApiStatus(u1.a(this.dispatchers.getDefault()), new MeasurementsStatusReceiver(this.eventSender));
        }
    }

    public final void registerClick(String str, InputEvent inputEvent) {
        m.e(str, "url");
        m.e(inputEvent, "inputEvent");
        MeasurementManager measurementManager2 = this.measurementManager;
        if (measurementManager2 != null) {
            measurementManager2.registerSource(Uri.parse(str), inputEvent, u1.a(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementsEvents.CLICK_SUCCESSFUL, MeasurementsEvents.CLICK_ERROR));
        }
    }

    public final void registerView(String str) {
        m.e(str, "url");
        MeasurementManager measurementManager2 = this.measurementManager;
        if (measurementManager2 != null) {
            measurementManager2.registerSource(Uri.parse(str), (InputEvent) null, u1.a(this.dispatchers.getDefault()), new MeasurementsReceiver(this.eventSender, MeasurementsEvents.VIEW_SUCCESSFUL, MeasurementsEvents.VIEW_ERROR));
        }
    }
}
