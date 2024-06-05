package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbmj implements zzblv {
    /* access modifiers changed from: private */
    public final zzblx zza;
    private final zzbly zzb;
    private final zzblr zzc;
    private final String zzd;

    zzbmj(zzblr zzblr, String str, zzbly zzbly, zzblx zzblx) {
        this.zzc = zzblr;
        this.zzd = str;
        this.zzb = zzbly;
        this.zza = zzblx;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbmj zzbmj, zzbll zzbll, zzbls zzbls, Object obj, zzbzs zzbzs) {
        try {
            t.r();
            String uuid = UUID.randomUUID().toString();
            zzbho.zzo.zzc(uuid, new zzbmi(zzbmj, zzbll, zzbzs));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbmj.zzb.zzb(obj));
            zzbls.zzl(zzbmj.zzd, jSONObject);
        } catch (Exception e10) {
            zzbzs.zze(e10);
            zzbza.zzh("Unable to invokeJavascript", e10);
            zzbll.zzb();
        } catch (Throwable th) {
            zzbll.zzb();
            throw th;
        }
    }

    public final zzfut zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfut zzb(Object obj) {
        zzbzs zzbzs = new zzbzs();
        zzbll zzb2 = this.zzc.zzb((zzapw) null);
        zzb2.zzi(new zzbmg(this, zzb2, obj, zzbzs), new zzbmh(this, zzbzs, zzb2));
        return zzbzs;
    }
}
