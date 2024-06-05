package com.unity3d.ads.core.domain;

import android.os.SystemClock;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.jvm.internal.m;
import vb.e3;
import vb.g3;

/* compiled from: GetAndroidSharedDataTimestamps.kt */
public final class GetAndroidSharedDataTimestamps implements GetSharedDataTimestamps {
    public g3 invoke() {
        e3.a aVar = e3.f38939b;
        g3.a j02 = g3.j0();
        m.d(j02, "newBuilder()");
        e3 a10 = aVar.a(j02);
        a10.c(TimestampExtensionsKt.fromMillis(System.currentTimeMillis()));
        a10.b(SystemClock.elapsedRealtime() - SdkProperties.getInitializationTime());
        return a10.a();
    }
}
