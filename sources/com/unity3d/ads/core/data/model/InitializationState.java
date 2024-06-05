package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.m;

/* compiled from: InitializationState.kt */
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    public String toString() {
        String str = super.toString();
        Locale locale = Locale.getDefault();
        m.d(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
