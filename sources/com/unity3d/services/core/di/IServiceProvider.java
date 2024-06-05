package com.unity3d.services.core.di;

/* compiled from: IServiceProvider.kt */
public interface IServiceProvider {
    IServicesRegistry getRegistry();

    IServicesRegistry initialize();
}
