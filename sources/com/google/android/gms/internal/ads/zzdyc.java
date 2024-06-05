package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.util.w0;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import m5.k;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdyc {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = MaxReward.DEFAULT_LABEL;
    public long zzd = -1;

    public static zzdyc zza(Reader reader) throws zzeyg {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            HashMap hashMap = new HashMap();
            long j10 = -1;
            String str = MaxReward.DEFAULT_LABEL;
            jsonReader.beginObject();
            int i10 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("response".equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if ("body".equals(nextName)) {
                    str = jsonReader.nextString();
                } else if ("latency".equals(nextName)) {
                    j10 = jsonReader.nextLong();
                } else if ("headers".equals(nextName)) {
                    hashMap = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        hashMap.put(jsonReader.nextName(), w0.d(jsonReader));
                    }
                    jsonReader.endObject();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            zzdyc zzdyc = new zzdyc();
            zzdyc.zza = i10;
            if (str != null) {
                zzdyc.zzc = str;
            }
            zzdyc.zzd = j10;
            zzdyc.zzb = hashMap;
            k.a(reader);
            return zzdyc;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e10) {
            throw new zzeyg("Unable to parse Response", e10);
        } catch (Throwable th) {
            k.a(reader);
            throw th;
        }
    }
}
