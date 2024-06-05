package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k8.c;
import n5.b;

/* compiled from: FcmExecutors */
class n {
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(str));
    }

    static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new b("Firebase-Messaging-Init"));
    }

    static ExecutorService d() {
        return k8.b.a().a(new b("Firebase-Messaging-Intent-Handle"), c.HIGH_SPEED);
    }

    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new b("Firebase-Messaging-Network-Io"));
    }

    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new b("Firebase-Messaging-Task"));
    }

    static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new b("Firebase-Messaging-Topics-Io"));
    }
}
