package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class s5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f25044a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q5 f25045b;

    public s5(q5 q5Var, String str) {
        this.f25045b = q5Var;
        q.k(str);
        this.f25044a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f25045b.zzj().B().b(this.f25044a, th);
    }
}
