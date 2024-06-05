package com.google.android.gms.common.api.internal;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class x1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f15323a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f15324b;

    public /* synthetic */ x1(l lVar, IBinder iBinder) {
        this.f15323a = lVar;
        this.f15324b = iBinder;
    }

    public final void run() {
        this.f15323a.e(this.f15324b);
    }
}
