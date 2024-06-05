package com.applovin.impl;

import com.applovin.impl.sm;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b50 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledThreadPoolExecutor f6645a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ sm.d f6646b;

    public /* synthetic */ b50(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, sm.d dVar) {
        this.f6645a = scheduledThreadPoolExecutor;
        this.f6646b = dVar;
    }

    public final void run() {
        this.f6645a.execute(this.f6646b);
    }
}
