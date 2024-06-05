package com.unity3d.ads.core.data.model;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.m;

/* compiled from: AdContext.kt */
public final class AdDataRefreshToken {
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m18boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m19constructorimpl(String str) {
        m.e(str, JsonStorageKeyNames.DATA_KEY);
        return str;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m20equalsimpl(String str, Object obj) {
        return (obj instanceof AdDataRefreshToken) && m.a(str, ((AdDataRefreshToken) obj).m24unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m21equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m22hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m23toStringimpl(String str) {
        return "AdDataRefreshToken(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m20equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m22hashCodeimpl(this.data);
    }

    public String toString() {
        return m23toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m24unboximpl() {
        return this.data;
    }
}
