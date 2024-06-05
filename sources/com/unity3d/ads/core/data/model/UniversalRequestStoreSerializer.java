package com.unity3d.ads.core.data.model;

import com.google.protobuf.e0;
import h0.a;
import h0.k;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

/* compiled from: UniversalRequestStoreSerializer.kt */
public final class UniversalRequestStoreSerializer implements k<e> {
    private final e defaultValue;

    public UniversalRequestStoreSerializer() {
        e g02 = e.g0();
        m.d(g02, "getDefaultInstance()");
        this.defaultValue = g02;
    }

    public Object readFrom(InputStream inputStream, d<? super e> dVar) {
        try {
            e l02 = e.l0(inputStream);
            m.d(l02, "parseFrom(input)");
            return l02;
        } catch (e0 e10) {
            throw new a("Cannot read proto.", e10);
        }
    }

    public e getDefaultValue() {
        return this.defaultValue;
    }

    public Object writeTo(e eVar, OutputStream outputStream, d<? super w> dVar) {
        eVar.c(outputStream);
        return w.f38141a;
    }
}
