package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.m;

/* compiled from: WebViewEvent.kt */
public final class OnPrivacyFsmChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_PRIVACY_FSM_CHANGE";
    private final Object[] parameters;

    public OnPrivacyFsmChangeEvent(String str) {
        m.e(str, "value");
        this.parameters = new Object[]{str};
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
