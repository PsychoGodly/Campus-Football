package com.applovin.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u10 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f12481a;

    public /* synthetic */ u10(Handler handler) {
        this.f12481a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f12481a.post(runnable);
    }
}
