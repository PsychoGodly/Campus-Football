package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f26607a = a.f26606a;

    static Executor a() {
        return f26607a;
    }

    static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new n5.b("firebase-iid-executor"));
    }
}
