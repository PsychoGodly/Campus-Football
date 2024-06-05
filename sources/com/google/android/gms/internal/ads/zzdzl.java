package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdzl implements zzfcd {
    public final /* synthetic */ zzdzm zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ zzayi zzd;
    public final /* synthetic */ zzayr zze;

    public /* synthetic */ zzdzl(zzdzm zzdzm, boolean z10, ArrayList arrayList, zzayi zzayi, zzayr zzayr) {
        this.zza = zzdzm;
        this.zzb = z10;
        this.zzc = arrayList;
        this.zzd = zzayi;
        this.zze = zzayr;
    }

    public final Object zza(Object obj) {
        zzdzm zzdzm = this.zza;
        boolean z10 = this.zzb;
        ArrayList arrayList = this.zzc;
        zzayi zzayi = this.zzd;
        zzayr zzayr = this.zze;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzdzm.zzb.zzf()) {
            return null;
        }
        byte[] zze2 = zzdzn.zze(zzdzm.zzb, z10, arrayList, zzayi, zzayr);
        zzdzq.zzg(sQLiteDatabase, z10, true);
        zzdzq.zzd(sQLiteDatabase, zzdzm.zzb.zzf.zzd(), zze2);
        return null;
    }
}
