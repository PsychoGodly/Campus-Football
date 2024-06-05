package com.google.firebase.iid;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class d implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f26611a = new d();

    private d() {
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
