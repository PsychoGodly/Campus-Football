package com.google.android.gms.internal.ads;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcer implements zzftp {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzapw zzb;
    public final /* synthetic */ zzbzg zzc;
    public final /* synthetic */ a zzd;
    public final /* synthetic */ String zze;

    public /* synthetic */ zzcer(Context context, zzapw zzapw, zzbzg zzbzg, a aVar, String str) {
        this.zza = context;
        this.zzb = zzapw;
        this.zzc = zzbzg;
        this.zzd = aVar;
        this.zze = str;
    }

    public final zzfut zza() {
        Context context = this.zza;
        zzapw zzapw = this.zzb;
        zzbzg zzbzg = this.zzc;
        a aVar = this.zzd;
        String str = this.zze;
        t.B();
        zzcei zza2 = zzceu.zza(context, zzcfx.zza(), MaxReward.DEFAULT_LABEL, false, false, zzapw, (zzbbt) null, zzbzg, (zzbbj) null, (l) null, aVar, zzawe.zza(), (zzeyc) null, (zzeyf) null);
        zzbzr zza3 = zzbzr.zza(zza2);
        zza2.zzN().zzA(new zzces(zza3));
        zza2.loadUrl(str);
        return zza3;
    }
}
