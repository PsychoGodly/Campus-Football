package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;

/* compiled from: StoreExceptionHandler.kt */
public interface StoreExceptionHandler {
    void handleStoreException(StoreEvent storeEvent, int i10, Exception exc);
}
