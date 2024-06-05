package com.unity3d.services.core.di;

import fe.l;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: ServicesRegistry.kt */
public final class ServicesRegistryKt {
    public static final ServicesRegistry registry(l<? super ServicesRegistry, w> lVar) {
        m.e(lVar, "registry");
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        lVar.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
