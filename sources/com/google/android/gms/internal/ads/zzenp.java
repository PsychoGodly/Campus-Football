package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzenp implements zzepn {
    private final zzfuu zza;
    private final Context zzb;
    private final Set zzc;

    public zzenp(zzfuu zzfuu, Context context, Set set) {
        this.zza = zzfuu;
        this.zzb = context;
        this.zzc = set;
    }

    public final int zza() {
        return 27;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzeno(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzenq zzc() throws Exception {
        zzbaj zzbaj = zzbar.zzeC;
        String str = null;
        if (((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                t.a();
                if (true == ((Boolean) a0.c().zzb(zzbaj)).booleanValue()) {
                    str = "a.1.3.37-google_20220829";
                }
                return new zzenq(str);
            }
        }
        return new zzenq((String) null);
    }
}
