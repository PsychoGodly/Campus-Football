package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import h5.j;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbtx extends zzbty {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzblv zzd;

    public zzbtx(Context context, zzblv zzblv) {
        this.zzb = context.getApplicationContext();
        this.zzd = zzblv;
    }

    public static JSONObject zzc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbzg.zza().zza);
            jSONObject.put("mf", zzbck.zza.zze());
            jSONObject.put("cl", "513548808");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", j.f18843a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", j.f18843a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final zzfut zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (t.b().a() - this.zzc.getLong("js_last_update", 0) < ((Long) zzbck.zzb.zze()).longValue()) {
            return zzfuj.zzh((Object) null);
        }
        return zzfuj.zzl(this.zzd.zzb(zzc(this.zzb)), new zzbtw(this), zzbzn.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbar.zzd(this.zzb, 1, jSONObject);
        this.zzc.edit().putLong("js_last_update", t.b().a()).apply();
        return null;
    }
}
