package com.google.android.gms.internal.ads;

import android.content.Context;
import android.provider.Settings;
import android.util.JsonWriter;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import m5.c;
import m5.e;
import m5.h;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbyz {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb = new Object();
    private static boolean zzc = false;
    private static boolean zzd = false;
    private static final e zze = h.d();
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));
    private final List zzg;

    public zzbyz() {
        this((String) null);
    }

    static /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzs(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(c.c(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void zzb(int i10, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i10);
        jsonWriter.endObject();
        zzs(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void zzi() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzbza.zzj("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzj(boolean z10) {
        synchronized (zzb) {
            zzc = true;
            zzd = z10;
        }
    }

    public static boolean zzk(Context context) {
        if (!((Boolean) zzbcg.zza.zze()).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            zzbza.zzk("Fail to determine debug setting.", e10);
            return false;
        }
    }

    public static boolean zzl() {
        boolean z10;
        synchronized (zzb) {
            z10 = false;
            if (zzc && zzd) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean zzm() {
        boolean z10;
        synchronized (zzb) {
            z10 = zzc;
        }
        return z10;
    }

    private static synchronized void zzn(String str) {
        synchronized (zzbyz.class) {
            zzbza.zzi("GMA Debug BEGIN");
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 4000;
                zzbza.zzi("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i10, Math.min(i11, str.length())))));
                i10 = i11;
            }
            zzbza.zzi("GMA Debug FINISH");
        }
    }

    private final void zzo(String str, zzbyy zzbyy) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zze.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.zzg) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            zzbyy.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e10) {
            zzbza.zzh("unable to log", e10);
        }
        zzn(stringWriter.toString());
    }

    private final void zzp(String str) {
        zzo("onNetworkRequestError", new zzbyv(str));
    }

    private final void zzq(String str, String str2, Map map, byte[] bArr) {
        zzo("onNetworkRequest", new zzbyw(str, str2, map, bArr));
    }

    private final void zzr(Map map, int i10) {
        zzo("onNetworkResponse", new zzbyu(i10, map));
    }

    private static void zzs(JsonWriter jsonWriter, Map map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (!zzf.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            zzbza.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (zzl()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            zzq(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    public final void zzd(String str, String str2, Map map, byte[] bArr) {
        if (zzl()) {
            zzq(str, "GET", map, bArr);
        }
    }

    public final void zze(HttpURLConnection httpURLConnection, int i10) {
        HashMap hashMap;
        if (zzl()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            zzr(hashMap, i10);
            if (i10 < 200 || i10 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e10) {
                    zzbza.zzj("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e10.getMessage())));
                }
                zzp(str);
            }
        }
    }

    public final void zzf(Map map, int i10) {
        if (zzl()) {
            zzr(map, i10);
            if (i10 < 200 || i10 >= 300) {
                zzp((String) null);
            }
        }
    }

    public final void zzg(String str) {
        if (zzl() && str != null) {
            zzh(str.getBytes());
        }
    }

    public final void zzh(byte[] bArr) {
        zzo("onNetworkResponseBody", new zzbyx(bArr));
    }

    public zzbyz(String str) {
        List list;
        if (!zzl()) {
            list = new ArrayList();
        } else {
            list = Arrays.asList(new String[]{"network_request_".concat(String.valueOf(UUID.randomUUID().toString()))});
        }
        this.zzg = list;
    }
}
