package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class zzbyv implements zzbyy {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbyv(String str) {
        this.zza = str;
    }

    public final void zza(JsonWriter jsonWriter) {
        String str = this.zza;
        int i10 = zzbyz.zza;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
