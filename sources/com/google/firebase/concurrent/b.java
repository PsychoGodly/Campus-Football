package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CustomThreadFactory */
class b implements ThreadFactory {

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f26355f = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f26356a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final String f26357b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26358c;

    /* renamed from: d  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f26359d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f26357b = str;
        this.f26358c = i10;
        this.f26359d = threadPolicy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f26358c);
        StrictMode.ThreadPolicy threadPolicy = this.f26359d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f26355f.newThread(new a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f26357b, Long.valueOf(this.f26356a.getAndIncrement())}));
        return newThread;
    }
}
