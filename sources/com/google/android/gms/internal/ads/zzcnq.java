package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;
import java.util.concurrent.Executor;
import m5.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcnq implements zzatf {
    private zzcei zza;
    private final Executor zzb;
    private final zzcnc zzc;
    private final e zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcnf zzg = new zzcnf();

    public zzcnq(Executor executor, zzcnc zzcnc, e eVar) {
        this.zzb = executor;
        this.zzc = zzcnc;
        this.zzd = eVar;
    }

    private final void zzg() {
        try {
            JSONObject zza2 = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new zzcnp(this, zza2));
            }
        } catch (JSONException e10) {
            n1.b("Failed to call video active view js", e10);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final void zzc(zzate zzate) {
        boolean z10;
        zzcnf zzcnf = this.zzg;
        if (this.zzf) {
            z10 = false;
        } else {
            z10 = zzate.zzj;
        }
        zzcnf.zza = z10;
        zzcnf.zzd = this.zzd.b();
        this.zzg.zzf = zzate;
        if (this.zze) {
            zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcei zzcei) {
        this.zza = zzcei;
    }
}
