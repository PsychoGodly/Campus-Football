package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.w0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeyf {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzeye zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;

    zzeyf(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i10 = 0;
        String str = MaxReward.DEFAULT_LABEL;
        String str2 = str;
        String str3 = str2;
        zzeye zzeye = null;
        long j10 = 0;
        boolean z10 = false;
        String str4 = str3;
        String str5 = str4;
        int i11 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = w0.d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i10 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str4 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str5 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z10 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i11 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j10 = jsonReader.nextLong();
            } else {
                String str6 = str3;
                if (!((Boolean) a0.c().zzb(zzbar.zzhF)).booleanValue() || !"public_error".equals(nextName) || jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    JsonReader jsonReader2 = jsonReader;
                    if ("bidding_data".equals(nextName)) {
                        str = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) a0.c().zzb(zzbar.zzgs)).booleanValue()) {
                            try {
                                Bundle a10 = w0.a(w0.h(jsonReader));
                                if (a10 != null) {
                                    bundle = a10;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) a0.c().zzb(zzbar.zziy)).booleanValue()) {
                            str3 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) a0.c().zzb(zzbar.zziy)).booleanValue()) {
                            str2 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    zzeye = new zzeye(jsonReader);
                }
                str3 = str6;
            }
            JsonReader jsonReader3 = jsonReader;
        }
        JsonReader jsonReader4 = jsonReader;
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i10;
        this.zzb = str4;
        this.zzd = str5;
        this.zze = i11;
        this.zzf = j10;
        this.zzi = zzeye;
        this.zzg = z10;
        this.zzh = str;
        this.zzj = bundle;
        this.zzk = str2;
        this.zzl = str3;
    }
}
