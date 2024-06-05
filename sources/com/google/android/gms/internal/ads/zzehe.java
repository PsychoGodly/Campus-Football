package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.g1;
import com.google.android.gms.ads.internal.client.h0;
import com.google.android.gms.ads.internal.client.n0;
import com.google.android.gms.ads.internal.client.p0;
import com.google.android.gms.ads.internal.client.z4;
import q4.a;
import q4.h;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzehe extends p0 {
    final zzeyv zza;
    final zzdgr zzb = new zzdgr();
    private final Context zzc;
    private final zzcgd zzd;
    private h0 zze;

    public zzehe(zzcgd zzcgd, Context context, String str) {
        zzeyv zzeyv = new zzeyv();
        this.zza = zzeyv;
        this.zzd = zzcgd;
        zzeyv.zzs(str);
        this.zzc = context;
    }

    public final n0 zze() {
        zzdgt zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzeyv zzeyv = this.zza;
        if (zzeyv.zzg() == null) {
            zzeyv.zzr(z4.w());
        }
        return new zzehf(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    public final void zzf(zzbev zzbev) {
        this.zzb.zza(zzbev);
    }

    public final void zzg(zzbey zzbey) {
        this.zzb.zzb(zzbey);
    }

    public final void zzh(String str, zzbfe zzbfe, zzbfb zzbfb) {
        this.zzb.zzc(str, zzbfe, zzbfb);
    }

    public final void zzi(zzbkg zzbkg) {
        this.zzb.zzd(zzbkg);
    }

    public final void zzj(zzbfi zzbfi, z4 z4Var) {
        this.zzb.zze(zzbfi);
        this.zza.zzr(z4Var);
    }

    public final void zzk(zzbfl zzbfl) {
        this.zzb.zzf(zzbfl);
    }

    public final void zzl(h0 h0Var) {
        this.zze = h0Var;
    }

    public final void zzm(a aVar) {
        this.zza.zzq(aVar);
    }

    public final void zzn(zzbjx zzbjx) {
        this.zza.zzv(zzbjx);
    }

    public final void zzo(zzbdl zzbdl) {
        this.zza.zzA(zzbdl);
    }

    public final void zzp(h hVar) {
        this.zza.zzD(hVar);
    }

    public final void zzq(g1 g1Var) {
        this.zza.zzQ(g1Var);
    }
}
