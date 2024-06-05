package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.util.w0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m5.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeyn {
    public final List zza;
    public final zzeyf zzb;
    public final List zzc;

    zzeyn(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzeyf zzeyf = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzeyc(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzeyf = new zzeyf(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if (MediationMetaData.KEY_NAME.equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = w0.h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzeym(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzeyf == null ? new zzeyf(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzeyf;
    }

    public static zzeyn zza(Reader reader) throws zzeyg {
        try {
            zzeyn zzeyn = new zzeyn(new JsonReader(reader));
            k.a(reader);
            return zzeyn;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e10) {
            throw new zzeyg("unable to parse ServerResponse", e10);
        } catch (Throwable th) {
            k.a(reader);
            throw th;
        }
    }
}
