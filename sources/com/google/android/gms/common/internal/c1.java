package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final int f15350a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f15351b;

    public c1(c cVar, int i10) {
        this.f15351b = cVar;
        this.f15350a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m mVar;
        c cVar = this.f15351b;
        if (iBinder == null) {
            c.zzk(cVar, 16);
            return;
        }
        synchronized (cVar.zzq) {
            c cVar2 = this.f15351b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof m)) {
                mVar = new s0(iBinder);
            } else {
                mVar = (m) queryLocalInterface;
            }
            cVar2.zzr = mVar;
        }
        this.f15351b.zzl(0, (Bundle) null, this.f15350a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f15351b.zzq) {
            this.f15351b.zzr = null;
        }
        Handler handler = this.f15351b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f15350a, 1));
    }
}
