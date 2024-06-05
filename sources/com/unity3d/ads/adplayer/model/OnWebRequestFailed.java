package com.unity3d.ads.adplayer.model;

import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: WebViewEvent.kt */
public final class OnWebRequestFailed implements WebViewEvent {
    private final String category = "REQUEST";
    private final String name = "FAILED";
    private final Object[] parameters;

    public OnWebRequestFailed(List<? extends Object> list) {
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
