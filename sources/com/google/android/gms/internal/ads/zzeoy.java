package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeoy implements zzepn {
    private final zzbxf zza;
    private final zzfuu zzb;
    private final Context zzc;

    public zzeoy(zzbxf zzbxf, zzfuu zzfuu, Context context) {
        this.zza = zzbxf;
        this.zzb = zzfuu;
        this.zzc = context;
    }

    public final int zza() {
        return 34;
    }

    public final zzfut zzb() {
        return this.zzb.zzb(new zzeox(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeoz zzc() throws Exception {
        if (!this.zza.zzu(this.zzc)) {
            return new zzeoz((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String zze = this.zza.zze(this.zzc);
        String str = zze == null ? MaxReward.DEFAULT_LABEL : zze;
        String zzc2 = this.zza.zzc(this.zzc);
        String str2 = zzc2 == null ? MaxReward.DEFAULT_LABEL : zzc2;
        String zza2 = this.zza.zza(this.zzc);
        String str3 = zza2 == null ? MaxReward.DEFAULT_LABEL : zza2;
        String zzb2 = this.zza.zzb(this.zzc);
        return new zzeoz(str, str2, str3, zzb2 == null ? MaxReward.DEFAULT_LABEL : zzb2, "TIME_OUT".equals(str2) ? (Long) a0.c().zzb(zzbar.zzad) : null);
    }
}
