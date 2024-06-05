package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzctp implements zzcwc, zzcvj {
    private final Context zza;
    private final zzeyc zzb;
    private final zzbrh zzc;

    public zzctp(Context context, zzeyc zzeyc, zzbrh zzbrh, byte[] bArr) {
        this.zza = context;
        this.zzb = zzeyc;
        this.zzc = zzbrh;
    }

    public final void zzbn(Context context) {
    }

    public final void zzbp(Context context) {
    }

    public final void zzbq(Context context) {
    }

    public final void zzn() {
        zzbri zzbri = this.zzb.zzae;
        if (zzbri != null && zzbri.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zzb.zzae.zzb.isEmpty()) {
                arrayList.add(this.zzb.zzae.zzb);
            }
        }
    }
}
