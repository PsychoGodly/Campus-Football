package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.m;

/* compiled from: OperationType.kt */
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    UNIVERSAL_EVENT;

    public String toString() {
        String str = super.toString();
        Locale locale = Locale.getDefault();
        m.d(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
