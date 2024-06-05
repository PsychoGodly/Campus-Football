package com.unity3d.services.ads.topics;

import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.ext.SdkExtensions;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.jvm.internal.m;
import pe.u1;

/* compiled from: TopicsService.kt */
public final class TopicsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final TopicsManager topicsManager;

    public TopicsService(Context context, ISDKDispatchers iSDKDispatchers, IEventSender iEventSender) {
        m.e(context, "context");
        m.e(iSDKDispatchers, "dispatchers");
        m.e(iEventSender, "eventSender");
        this.dispatchers = iSDKDispatchers;
        this.eventSender = iEventSender;
        this.topicsManager = getTopicsManager(context);
    }

    private final TopicsManager getTopicsManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (TopicsManager) context.getSystemService(TopicsManager.class);
        }
        return null;
    }

    public final TopicsStatus checkAvailability() {
        if (Device.getApiLevel() < 33) {
            return TopicsStatus.ERROR_API_BELOW_33;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return TopicsStatus.ERROR_EXTENSION_BELOW_4;
        }
        if (this.topicsManager == null) {
            return TopicsStatus.ERROR_TOPICSMANAGER_NULL;
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return TopicsStatus.ERROR_AD_SERVICES_DISABLED;
        }
        return TopicsStatus.TOPICS_AVAILABLE;
    }

    public final void getTopics(String str, boolean z10) {
        m.e(str, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(str).setShouldRecordObservation(z10).build();
        m.d(build, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager2 = this.topicsManager;
            if (topicsManager2 != null) {
                topicsManager2.getTopics(build, u1.a(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (Exception e10) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e10.toString());
            DeviceLog.debug("Failed to get topics with error: " + e10);
        }
    }
}
