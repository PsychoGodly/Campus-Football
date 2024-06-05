package com.unity3d.ads.core.data.model;

import com.google.protobuf.e0;
import h0.a;
import h0.k;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

/* compiled from: WebViewConfigurationStoreSerializer.kt */
public final class WebViewConfigurationStoreSerializer implements k<g> {
    private final g defaultValue;

    public WebViewConfigurationStoreSerializer() {
        g l02 = g.l0();
        m.d(l02, "getDefaultInstance()");
        this.defaultValue = l02;
    }

    public Object readFrom(InputStream inputStream, d<? super g> dVar) {
        try {
            g p02 = g.p0(inputStream);
            m.d(p02, "parseFrom(input)");
            return p02;
        } catch (e0 e10) {
            throw new a("Cannot read proto.", e10);
        }
    }

    public g getDefaultValue() {
        return this.defaultValue;
    }

    public Object writeTo(g gVar, OutputStream outputStream, d<? super w> dVar) {
        gVar.c(outputStream);
        return w.f38141a;
    }
}
