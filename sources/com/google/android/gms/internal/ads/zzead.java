package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzead implements zzfcd {
    public final /* synthetic */ zzeaf zza;
    public final /* synthetic */ zzbzf zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzead(zzeaf zzeaf, zzbzf zzbzf, String str) {
        this.zza = zzeaf;
        this.zzb = zzbzf;
        this.zzc = str;
    }

    public final Object zza(Object obj) {
        this.zza.zzg((SQLiteDatabase) obj, this.zzb, this.zzc);
        return null;
    }
}
