package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

public class GMAEventSender {
    private final IEventSender _eventSender;

    public GMAEventSender() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public void send(c cVar, Object... objArr) {
        this._eventSender.sendEvent(WebViewEventCategory.GMA, cVar, objArr);
    }

    public void sendVersion(String str) {
        this._eventSender.sendEvent(WebViewEventCategory.INIT_GMA, c.VERSION, str);
    }

    public GMAEventSender(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }
}
