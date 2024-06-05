package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import kotlin.jvm.internal.m;

/* compiled from: GatewayStoreExceptionHandler.kt */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    public void handleStoreException(StoreEvent storeEvent, int i10, Exception exc) {
        m.e(storeEvent, "storeEvent");
        m.e(exc, "exception");
        throw exc;
    }
}
