package com.unity3d.services.ads.measurements;

import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.m;

/* compiled from: MeasurementsReceiver.kt */
public final class MeasurementsReceiver implements OutcomeReceiver<Object, Exception> {
    private final MeasurementsEvents errorEvent;
    private final IEventSender eventSender;
    private final MeasurementsEvents successEvent;

    public MeasurementsReceiver(IEventSender iEventSender, MeasurementsEvents measurementsEvents, MeasurementsEvents measurementsEvents2) {
        m.e(iEventSender, "eventSender");
        m.e(measurementsEvents, "successEvent");
        m.e(measurementsEvents2, "errorEvent");
        this.eventSender = iEventSender;
        this.successEvent = measurementsEvents;
        this.errorEvent = measurementsEvents2;
    }

    public void onResult(Object obj) {
        m.e(obj, "p0");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.successEvent, new Object[0]);
    }

    public void onError(Exception exc) {
        m.e(exc, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.errorEvent, exc.toString());
    }
}
