package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.p1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzbxg {
    static zzbxg zza;

    public static synchronized zzbxg zzd(Context context) {
        synchronized (zzbxg.class) {
            zzbxg zzbxg = zza;
            if (zzbxg != null) {
                return zzbxg;
            }
            Context applicationContext = context.getApplicationContext();
            zzbar.zzc(applicationContext);
            p1 zzh = t.q().zzh();
            zzh.l(applicationContext);
            zzbwk zzbwk = new zzbwk((zzbwj) null);
            zzbwk.zzb(applicationContext);
            zzbwk.zzc(t.b());
            zzbwk.zza(zzh);
            zzbwk.zzd(t.p());
            zzbxg zze = zzbwk.zze();
            zza = zze;
            zze.zza().zza();
            zza.zzb().zzc();
            zzbxk zzc = zza.zzc();
            if (((Boolean) a0.c().zzb(zzbar.zzao)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) a0.c().zzb(zzbar.zzaq));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                String optString = optJSONArray.optString(i10);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String zzc2 : hashMap.keySet()) {
                        zzc.zzc(zzc2);
                    }
                    zzc.zzd(new zzbxi(zzc, hashMap));
                } catch (JSONException e10) {
                    zzbza.zzf("Failed to parse listening list", e10);
                }
            }
            zzbxg zzbxg2 = zza;
            return zzbxg2;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract zzbwd zza();

    /* access modifiers changed from: package-private */
    public abstract zzbwh zzb();

    /* access modifiers changed from: package-private */
    public abstract zzbxk zzc();
}
