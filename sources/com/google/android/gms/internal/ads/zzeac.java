package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzeac implements zzfcd {
    public final /* synthetic */ zzeaf zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzeac(zzeaf zzeaf, String str) {
        this.zza = zzeaf;
        this.zzb = str;
    }

    public final Object zza(Object obj) {
        zzeaf.zzi((SQLiteDatabase) obj, this.zzb);
        return null;
    }
}
