package com.unity3d.services.ads.measurements;

import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.m;

/* compiled from: MeasurementsStatusReceiver.kt */
public final class MeasurementsStatusReceiver implements OutcomeReceiver<Integer, Exception> {
    private final IEventSender eventSender;

    public MeasurementsStatusReceiver(IEventSender iEventSender) {
        m.e(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(((Number) obj).intValue());
    }

    public void onError(Exception exc) {
        m.e(exc, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXCEPTION, exc.toString());
    }

    public void onResult(int i10) {
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.AVAILABLE, Integer.valueOf(i10));
    }
}
