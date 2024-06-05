package com.unity3d.ads.adplayer.model;

/* compiled from: WebViewEvent.kt */
public final class OnVolumeChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_VOLUME_CHANGE";
    private final Object[] parameters;

    public OnVolumeChangeEvent(double d10) {
        this.parameters = new Object[]{Double.valueOf(d10)};
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
