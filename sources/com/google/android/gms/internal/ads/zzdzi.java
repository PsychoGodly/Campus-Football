package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdzi implements zzfcd {
    public final /* synthetic */ zzdzj zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzdzi(zzdzj zzdzj, long j10) {
        this.zza = zzdzj;
        this.zzb = j10;
    }

    public final Object zza(Object obj) {
        zzdzj zzdzj = this.zza;
        long j10 = this.zzb;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzdzj.zzf()) {
            return null;
        }
        zzaym zzg = zzayn.zzg();
        zzg.zzh(j10);
        byte[] zzax = ((zzayn) zzg.zzal()).zzax();
        zzdzq.zzg(sQLiteDatabase, false, false);
        zzdzq.zzd(sQLiteDatabase, j10, zzax);
        return null;
    }
}
