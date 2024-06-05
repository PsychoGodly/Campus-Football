package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeae implements zzfuf {
    final /* synthetic */ zzfcd zza;

    zzeae(zzeaf zzeaf, zzfcd zzfcd) {
        this.zza = zzfcd;
    }

    public final void zza(Throwable th) {
        zzbza.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            zzbza.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
