package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import e7.f0;
import e7.x;
import f7.a;
import f7.b;
import f7.c;
import f7.d;
import f7.e;
import f7.f;
import f7.g;
import f7.h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    static final x<ScheduledExecutorService> f26349a = new x<>(d.f32581a);

    /* renamed from: b  reason: collision with root package name */
    static final x<ScheduledExecutorService> f26350b = new x<>(c.f32580a);

    /* renamed from: c  reason: collision with root package name */
    static final x<ScheduledExecutorService> f26351c = new x<>(b.f32579a);

    /* renamed from: d  reason: collision with root package name */
    static final x<ScheduledExecutorService> f26352d = new x<>(a.f32578a);

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, (StrictMode.ThreadPolicy) null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f26352d.get());
    }

    public List<e7.c<?>> getComponents() {
        return Arrays.asList(new e7.c[]{e7.c.d(f0.a(a7.a.class, ScheduledExecutorService.class), f0.a(a7.a.class, ExecutorService.class), f0.a(a7.a.class, Executor.class)).f(h.f32585a).d(), e7.c.d(f0.a(a7.b.class, ScheduledExecutorService.class), f0.a(a7.b.class, ExecutorService.class), f0.a(a7.b.class, Executor.class)).f(e.f32582a).d(), e7.c.d(f0.a(a7.c.class, ScheduledExecutorService.class), f0.a(a7.c.class, ExecutorService.class), f0.a(a7.c.class, Executor.class)).f(g.f32584a).d(), e7.c.c(f0.a(a7.d.class, Executor.class)).f(f.f32583a).d()});
    }
}
