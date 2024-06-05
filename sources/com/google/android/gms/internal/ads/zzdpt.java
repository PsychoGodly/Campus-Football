package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdpt {
    private final e zza;

    public zzdpt(e eVar) {
        this.zza = eVar;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbco.zza.zze()).booleanValue()) {
            long a10 = this.zza.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a10);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj2 = objArr[i10];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e10) {
                zzbza.zzh("unable to log", e10);
            }
            zzbza.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
