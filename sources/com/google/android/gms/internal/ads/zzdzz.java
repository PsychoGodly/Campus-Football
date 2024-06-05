package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdzz implements Runnable {
    public final /* synthetic */ SQLiteDatabase zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbzf zzc;

    public /* synthetic */ zzdzz(SQLiteDatabase sQLiteDatabase, String str, zzbzf zzbzf) {
        this.zza = sQLiteDatabase;
        this.zzb = str;
        this.zzc = zzbzf;
    }

    public final void run() {
        zzeaf.zzf(this.zza, this.zzb, this.zzc);
    }
}
