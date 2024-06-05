package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import m5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class zzbyx implements zzbyy {
    public final /* synthetic */ byte[] zza;

    public /* synthetic */ zzbyx(byte[] bArr) {
        this.zza = bArr;
    }

    public final void zza(JsonWriter jsonWriter) {
        byte[] bArr = this.zza;
        int i10 = zzbyz.zza;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String c10 = c.c(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(c10);
        } else {
            String zze = zzbyt.zze(c10);
            if (zze != null) {
                jsonWriter.name("bodydigest").value(zze);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
