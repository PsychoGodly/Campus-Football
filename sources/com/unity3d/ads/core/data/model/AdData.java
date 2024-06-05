package com.unity3d.ads.core.data.model;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.m;

/* compiled from: AdContext.kt */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ AdData m11boximpl(String str) {
        return new AdData(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m12constructorimpl(String str) {
        m.e(str, JsonStorageKeyNames.DATA_KEY);
        return str;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m13equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && m.a(str, ((AdData) obj).m17unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m14equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m15hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m16toStringimpl(String str) {
        return "AdData(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m13equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m15hashCodeimpl(this.data);
    }

    public String toString() {
        return m16toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m17unboximpl() {
        return this.data;
    }
}
