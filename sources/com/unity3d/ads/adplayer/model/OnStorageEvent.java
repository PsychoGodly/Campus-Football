package com.unity3d.ads.adplayer.model;

import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.m;

/* compiled from: WebViewEvent.kt */
public final class OnStorageEvent implements WebViewEvent {
    private final String category = "STORAGE";
    private final String name;
    private final Object[] parameters;

    public OnStorageEvent(StorageEvent storageEvent, StorageManager.StorageType storageType, Object obj) {
        m.e(storageEvent, "eventType");
        m.e(storageType, "storageType");
        this.name = storageEvent.name();
        this.parameters = new Object[]{storageType.name(), obj};
    }

    public String getCategory() {
        return this.category;
    }

    public String getName() {
        return this.name;
    }

    public Object[] getParameters() {
        return this.parameters;
    }
}
