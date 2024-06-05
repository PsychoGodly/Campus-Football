package com.unity3d.services.core.cache;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* compiled from: CacheEventSender.kt */
public final class CacheEventSender implements Serializable {
    private final IEventSender eventSender;

    public CacheEventSender(IEventSender iEventSender) {
        m.e(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public final boolean sendEvent(CacheEvent cacheEvent, Object... objArr) {
        m.e(cacheEvent, "eventId");
        m.e(objArr, "params");
        return this.eventSender.sendEvent(WebViewEventCategory.CACHE, cacheEvent, Arrays.copyOf(objArr, objArr.length));
    }
}
