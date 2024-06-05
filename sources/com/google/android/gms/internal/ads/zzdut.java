package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.c;
import h5.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzdut implements c.a, c.b {
    protected final zzbzs zza = new zzbzs();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbtn zze;
    protected zzbsn zzf;

    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(b bVar) {
        zzbza.zze("Disconnected from remote ad request service.");
        this.zza.zze(new zzdvi(1));
    }

    public final void onConnectionSuspended(int i10) {
        zzbza.zze("Cannot connect to remote service, fallback to local instance.");
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
