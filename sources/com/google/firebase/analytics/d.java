package com.google.firebase.analytics;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
final class d implements Callable<Long> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f26146a;

    d(FirebaseAnalytics firebaseAnalytics) {
        this.f26146a = firebaseAnalytics;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f26146a.f26127a.zzc();
    }
}
