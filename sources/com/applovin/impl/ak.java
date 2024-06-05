package com.applovin.impl;

import java.nio.ByteBuffer;

public abstract class ak implements xe {
    public final we a(ze zeVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a1.a((Object) zeVar.f9906c);
        a1.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (zeVar.d()) {
            return null;
        }
        return a(zeVar, byteBuffer);
    }

    /* access modifiers changed from: protected */
    public abstract we a(ze zeVar, ByteBuffer byteBuffer);
}
