package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbmr implements zzftq {
    private final zzblx zza;
    private final zzbly zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfut zzd;

    zzbmr(zzfut zzfut, String str, zzbly zzbly, zzblx zzblx) {
        this.zzd = zzfut;
        this.zzb = zzbly;
        this.zza = zzblx;
    }

    public final zzfut zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfut zzb(Object obj) {
        return zzfuj.zzm(this.zzd, new zzbmp(this, obj), zzbzn.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(Object obj, zzbls zzbls) throws Exception {
        zzbzs zzbzs = new zzbzs();
        t.r();
        String uuid = UUID.randomUUID().toString();
        zzbho.zzo.zzc(uuid, new zzbmq(this, zzbzs));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbls.zzl(this.zzc, jSONObject);
        return zzbzs;
    }
}
