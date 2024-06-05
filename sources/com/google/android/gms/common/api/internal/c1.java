package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class c1 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f15082a;

    public /* synthetic */ c1(Handler handler) {
        this.f15082a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f15082a.post(runnable);
    }
}
