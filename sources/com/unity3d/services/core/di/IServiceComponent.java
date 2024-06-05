package com.unity3d.services.core.di;

/* compiled from: IServiceComponent.kt */
public interface IServiceComponent {

    /* compiled from: IServiceComponent.kt */
    public static final class DefaultImpls {
        public static IServiceProvider getServiceProvider(IServiceComponent iServiceComponent) {
            return ServiceProvider.INSTANCE;
        }
    }

    IServiceProvider getServiceProvider();
}
