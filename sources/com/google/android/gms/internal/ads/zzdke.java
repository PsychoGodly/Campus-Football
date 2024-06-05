package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdke implements Runnable {
    public final /* synthetic */ zzdkg zza;

    public /* synthetic */ zzdke(zzdkg zzdkg) {
        this.zza = zzdkg;
    }

    public final void run() {
        try {
            this.zza.zzd();
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }
}
