package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class v7 extends ak {
    public u7 a(yg ygVar) {
        return new u7((String) a1.a((Object) ygVar.t()), (String) a1.a((Object) ygVar.t()), ygVar.s(), ygVar.s(), Arrays.copyOfRange(ygVar.c(), ygVar.d(), ygVar.e()));
    }

    /* access modifiers changed from: protected */
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        return new we(a(new yg(byteBuffer.array(), byteBuffer.limit())));
    }
}
