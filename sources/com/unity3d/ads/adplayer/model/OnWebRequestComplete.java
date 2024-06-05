package com.unity3d.ads.adplayer.model;

import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: WebViewEvent.kt */
public final class OnWebRequestComplete implements WebViewEvent {
    private final String category = "REQUEST";
    private final String name = "COMPLETE";
    private final Object[] parameters;

    public OnWebRequestComplete(List<? extends Object> list) {
        m.e(list, "value");
        this.parameters = list.toArray(new Object[0]);
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
