package com.startapp.sdk.adsbase.mraid.bridge;

/* compiled from: Sta */
public enum MraidState {
    LOADING,
    DEFAULT,
    EXPANDED,
    RESIZED,
    HIDDEN;

    public String toString() {
        return name().toLowerCase();
    }
}
