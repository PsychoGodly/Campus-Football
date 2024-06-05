package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbmi implements zzbic {
    final /* synthetic */ zzbmj zza;
    private final zzbll zzb;
    private final zzbzs zzc;

    public zzbmi(zzbmj zzbmj, zzbll zzbll, zzbzs zzbzs) {
        this.zza = zzbmj;
        this.zzb = zzbll;
        this.zzc = zzbzs;
    }

    public final void zza(String str) {
        zzbll zzbll;
        if (str == null) {
            try {
                this.zzc.zze(new zzblu());
            } catch (IllegalStateException unused) {
                zzbll = this.zzb;
            } catch (Throwable th) {
                this.zzb.zzb();
                throw th;
            }
        } else {
            this.zzc.zze(new zzblu(str));
        }
        zzbll = this.zzb;
        zzbll.zzb();
    }

    public final void zzb(JSONObject jSONObject) {
        zzbll zzbll;
        try {
            this.zzc.zzd(this.zza.zza.zza(jSONObject));
            zzbll = this.zzb;
        } catch (IllegalStateException unused) {
            zzbll = this.zzb;
        } catch (JSONException e10) {
            this.zzc.zze(e10);
            zzbll = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbll.zzb();
    }
}
