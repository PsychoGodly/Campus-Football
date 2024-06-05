package com.unity3d.services.core.configuration;

import android.content.Context;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import e1.a;
import java.util.List;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: AdsSdkInitializer.kt */
public final class AdsSdkInitializer implements a<w> {
    public List<Class<? extends a<?>>> dependencies() {
        return q.d();
    }

    public void create(Context context) {
        m.e(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
    }
}
