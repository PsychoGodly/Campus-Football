package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final /* synthetic */ class z9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ aa f25325a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ n4 f25326b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ JobParameters f25327c;

    public /* synthetic */ z9(aa aaVar, n4 n4Var, JobParameters jobParameters) {
        this.f25325a = aaVar;
        this.f25326b = n4Var;
        this.f25327c = jobParameters;
    }

    public final void run() {
        this.f25325a.e(this.f25326b, this.f25327c);
    }
}
