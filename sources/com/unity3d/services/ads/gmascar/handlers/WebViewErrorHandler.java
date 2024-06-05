package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

public class WebViewErrorHandler implements d<m> {
    private final IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    public void handleError(m mVar) {
        this._eventSender.sendEvent(WebViewEventCategory.valueOf(mVar.getDomain()), mVar.getErrorCategory(), mVar.getErrorArguments());
    }
}
