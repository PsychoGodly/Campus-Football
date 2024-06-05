package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class zzbyu implements zzbyy {
    public final /* synthetic */ int zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzbyu(int i10, Map map) {
        this.zza = i10;
        this.zzb = map;
    }

    public final void zza(JsonWriter jsonWriter) {
        zzbyz.zzb(this.zza, this.zzb, jsonWriter);
    }
}
