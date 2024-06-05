package com.unity3d.services.core.di;

import fe.a;
import kotlin.jvm.internal.m;
import sd.g;

/* compiled from: ServiceFactory.kt */
public final class ServiceFactoryKt {
    public static final <T> g<T> factoryOf(a<? extends T> aVar) {
        m.e(aVar, "initializer");
        return new Factory(aVar);
    }
}
