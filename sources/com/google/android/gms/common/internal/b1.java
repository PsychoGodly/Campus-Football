package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class b1 extends r0 {

    /* renamed from: a  reason: collision with root package name */
    private c f15345a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15346b;

    public b1(c cVar, int i10) {
        this.f15345a = cVar;
        this.f15346b = i10;
    }

    public final void E0(int i10, IBinder iBinder, f1 f1Var) {
        c cVar = this.f15345a;
        q.l(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        q.k(f1Var);
        c.zzj(cVar, f1Var);
        w0(i10, iBinder, f1Var.f15397a);
    }

    public final void a0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void w0(int i10, IBinder iBinder, Bundle bundle) {
        q.l(this.f15345a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f15345a.onPostInitHandler(i10, iBinder, bundle, this.f15346b);
        this.f15345a = null;
    }
}
