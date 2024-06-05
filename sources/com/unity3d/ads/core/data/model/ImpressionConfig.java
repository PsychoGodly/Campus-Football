package com.unity3d.ads.core.data.model;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.m;

/* compiled from: AdContext.kt */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m25boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m26constructorimpl(String str) {
        m.e(str, JsonStorageKeyNames.DATA_KEY);
        return str;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m27equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && m.a(str, ((ImpressionConfig) obj).m31unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m28equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m29hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m30toStringimpl(String str) {
        return "ImpressionConfig(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m27equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m29hashCodeimpl(this.data);
    }

    public String toString() {
        return m30toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m31unboximpl() {
        return this.data;
    }
}
