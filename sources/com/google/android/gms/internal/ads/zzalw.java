package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzalw extends ThreadLocal {
    zzalw(zzalx zzalx) {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
