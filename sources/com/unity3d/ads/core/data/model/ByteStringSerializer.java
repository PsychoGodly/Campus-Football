package com.unity3d.ads.core.data.model;

import com.google.protobuf.e0;
import h0.a;
import h0.k;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

/* compiled from: ByteStringSerializer.kt */
public final class ByteStringSerializer implements k<c> {
    private final c defaultValue;

    public ByteStringSerializer() {
        c h02 = c.h0();
        m.d(h02, "getDefaultInstance()");
        this.defaultValue = h02;
    }

    public Object readFrom(InputStream inputStream, d<? super c> dVar) {
        try {
            c j02 = c.j0(inputStream);
            m.d(j02, "parseFrom(input)");
            return j02;
        } catch (e0 e10) {
            throw new a("Cannot read proto.", e10);
        }
    }

    public c getDefaultValue() {
        return this.defaultValue;
    }

    public Object writeTo(c cVar, OutputStream outputStream, d<? super w> dVar) {
        cVar.c(outputStream);
        return w.f38141a;
    }
}
