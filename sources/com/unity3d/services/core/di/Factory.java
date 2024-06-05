package com.unity3d.services.core.di;

import fe.a;
import kotlin.jvm.internal.m;
import sd.g;

/* compiled from: ServiceFactory.kt */
final class Factory<T> implements g<T> {
    private final a<T> initializer;

    public Factory(a<? extends T> aVar) {
        m.e(aVar, "initializer");
        this.initializer = aVar;
    }

    public T getValue() {
        return this.initializer.invoke();
    }

    public boolean isInitialized() {
        return false;
    }
}
