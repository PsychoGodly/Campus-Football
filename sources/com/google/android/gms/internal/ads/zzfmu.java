package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfmu implements ServiceConnection {
    final /* synthetic */ zzfmv zza;

    /* synthetic */ zzfmu(zzfmv zzfmv, zzfmt zzfmt) {
        this.zza = zzfmv;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.zzc.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzfmv zzfmv = this.zza;
        zzfmv.zzc().post(new zzfmr(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zzc.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzfmv zzfmv = this.zza;
        zzfmv.zzc().post(new zzfms(this));
    }
}
