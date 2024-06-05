package com.applovin.impl.communicator;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f7020a = new b();

    private /* synthetic */ b() {
    }

    public final Thread newThread(Runnable runnable) {
        return MessagingServiceImpl.a(runnable);
    }
}
