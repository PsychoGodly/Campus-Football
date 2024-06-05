package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfmf extends zzasv implements zzfmh {
    zzfmf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    public final void zze(Bundle bundle, zzfmj zzfmj) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzasx.zzg(zza, zzfmj);
        zzbi(2, zza);
    }

    public final void zzf(String str, Bundle bundle, zzfmj zzfmj) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zze(zza, bundle);
        zzasx.zzg(zza, zzfmj);
        zzbi(1, zza);
    }

    public final void zzg(Bundle bundle, zzfmj zzfmj) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzasx.zzg(zza, zzfmj);
        zzbi(3, zza);
    }
}
