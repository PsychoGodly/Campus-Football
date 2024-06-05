package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.m;

/* compiled from: AndroidGenerateByteStringId.kt */
public final class AndroidGenerateByteStringId implements GetByteStringId {
    public i invoke() {
        UUID randomUUID = UUID.randomUUID();
        m.d(randomUUID, "randomUUID()");
        return ProtobufExtensionsKt.toByteString(randomUUID);
    }
}
