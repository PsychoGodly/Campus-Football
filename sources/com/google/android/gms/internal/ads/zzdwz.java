package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import h5.b;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzdwz implements c.a, c.b {
    protected final zzbzs zza = new zzbzs();
    protected boolean zzb = false;
    protected boolean zzc = false;
    protected zzbsq zzd;
    protected Context zze;
    protected Looper zzf;
    protected ScheduledExecutorService zzg;

    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public final void onConnectionFailed(b bVar) {
        String format = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", new Object[]{Integer.valueOf(bVar.v())});
        zzbza.zze(format);
        this.zza.zze(new zzdvi(1, format));
    }

    public void onConnectionSuspended(int i10) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", new Object[]{Integer.valueOf(i10)});
        zzbza.zze(format);
        this.zza.zze(new zzdvi(1, format));
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzb() {
        if (this.zzd == null) {
            this.zzd = new zzbsq(this.zze, this.zzf, this, this);
        }
        this.zzd.checkAvailabilityAndConnect();
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzc() {
        this.zzc = true;
        zzbsq zzbsq = this.zzd;
        if (zzbsq != null) {
            if (zzbsq.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
