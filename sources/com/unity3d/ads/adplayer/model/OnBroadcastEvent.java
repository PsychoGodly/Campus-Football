package com.unity3d.ads.adplayer.model;

import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.jvm.internal.m;

/* compiled from: WebViewEvent.kt */
public final class OnBroadcastEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name;
    private final Object[] parameters;

    public OnBroadcastEvent(String str, String str2) {
        m.e(str, MediationMetaData.KEY_NAME);
        this.name = str;
        this.parameters = new Object[]{str2};
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
