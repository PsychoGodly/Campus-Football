package com.unity3d.ads.adplayer.model;

/* compiled from: WebViewEvent.kt */
public final class OnFocusChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_FOCUS_CHANGE";
    private final Object[] parameters;

    public OnFocusChangeEvent(boolean z10) {
        this.parameters = new Object[]{Boolean.valueOf(z10)};
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
