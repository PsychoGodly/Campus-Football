package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
final class a implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f26137a;

    a(FirebaseAnalytics firebaseAnalytics) {
        this.f26137a = firebaseAnalytics;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f26137a.f26127a.zze();
    }
}
