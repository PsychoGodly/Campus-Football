package com.unity3d.services.store;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.util.Arrays;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: StoreWebViewEventSender.kt */
public final class StoreWebViewEventSender {
    private final IEventSender _eventSender;

    public StoreWebViewEventSender() {
        this((IEventSender) null, 1, (h) null);
    }

    public StoreWebViewEventSender(IEventSender iEventSender) {
        m.e(iEventSender, "_eventSender");
        this._eventSender = iEventSender;
    }

    public final void send(StoreEvent storeEvent, Object... objArr) {
        m.e(storeEvent, "event");
        m.e(objArr, "params");
        this._eventSender.sendEvent(WebViewEventCategory.STORE, storeEvent, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreWebViewEventSender(IEventSender iEventSender, int i10, h hVar) {
        this((i10 & 1) != 0 ? SharedInstances.INSTANCE.getWebViewEventSender() : iEventSender);
    }
}
