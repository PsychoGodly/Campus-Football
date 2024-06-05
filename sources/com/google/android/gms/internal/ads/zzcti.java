package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzcti implements zzfnj {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbzg zzb;
    public final /* synthetic */ zzeyx zzc;

    public /* synthetic */ zzcti(Context context, zzbzg zzbzg, zzeyx zzeyx) {
        this.zza = context;
        this.zzb = zzbzg;
        this.zzc = zzeyx;
    }

    public final Object apply(Object obj) {
        Context context = this.zza;
        zzbzg zzbzg = this.zzb;
        zzeyx zzeyx = this.zzc;
        zzeyc zzeyc = (zzeyc) obj;
        t tVar = new t(context);
        tVar.p(zzeyc.zzC);
        tVar.q(zzeyc.zzD.toString());
        tVar.o(zzbzg.zza);
        tVar.n(zzeyx.zzf);
        return tVar;
    }
}
