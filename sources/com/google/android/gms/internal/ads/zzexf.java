package com.google.android.gms.internal.ads;

import a5.a;
import com.google.android.gms.ads.internal.client.b5;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.client.i2;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzexf implements a, zzcwc, zzcur, zzcuo, zzcve, zzcwz, zzevq, zzdcc {
    private final zzfaf zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzexf(zzfaf zzfaf) {
        this.zza = zzfaf;
    }

    public final void onAdMetadataChanged() {
        zzevh.zza(this.zzb, zzewz.zza);
    }

    public final void zza(c3 c3Var) {
        int i10 = c3Var.f14427a;
        zzevh.zza(this.zzc, new zzewl(c3Var));
        zzevh.zza(this.zzc, new zzewm(i10));
        zzevh.zza(this.zze, new zzewn(i10));
    }

    public final void zzb(a aVar) {
        this.zzb.set(aVar);
    }

    public final void zzbG(zzevq zzevq) {
        throw null;
    }

    public final void zzbr() {
        zzevh.zza(this.zze, zzewu.zza);
    }

    public final void zzc(i2 i2Var) {
        this.zzh.set(i2Var);
    }

    public final void zzd(zzbuz zzbuz) {
        this.zzd.set(zzbuz);
    }

    public final void zze(zzbvd zzbvd) {
        this.zzc.set(zzbvd);
    }

    @Deprecated
    public final void zzf(zzbuj zzbuj) {
        this.zze.set(zzbuj);
    }

    @Deprecated
    public final void zzg(zzbue zzbue) {
        this.zzg.set(zzbue);
    }

    public final void zzh(b5 b5Var) {
        zzevh.zza(this.zzh, new zzewk(b5Var));
    }

    public final void zzi(zzbve zzbve) {
        this.zzf.set(zzbve);
    }

    public final void zzj() {
        this.zza.zza();
        zzevh.zza(this.zzd, zzewr.zza);
        zzevh.zza(this.zze, zzews.zza);
    }

    public final void zzk(c3 c3Var) {
        zzevh.zza(this.zzd, new zzewo(c3Var));
        zzevh.zza(this.zzd, new zzewp(c3Var));
    }

    public final void zzm() {
        zzevh.zza(this.zze, zzexa.zza);
    }

    public final void zzn() {
        zzevh.zza(this.zzc, zzewx.zza);
        zzevh.zza(this.zze, zzewy.zza);
    }

    public final void zzo() {
        zzevh.zza(this.zzd, zzewt.zza);
        zzevh.zza(this.zze, zzewv.zza);
        zzevh.zza(this.zzd, zzeww.zza);
    }

    public final void zzp(zzbud zzbud, String str, String str2) {
        zzevh.zza(this.zzd, new zzexb(zzbud));
        zzevh.zza(this.zzf, new zzexc(zzbud, str, str2));
        zzevh.zza(this.zze, new zzexd(zzbud));
        zzevh.zza(this.zzg, new zzexe(zzbud, str, str2));
    }

    public final void zzq() {
        zzevh.zza(this.zze, zzewq.zza);
    }

    public final void zzr() {
        zzevh.zza(this.zzd, zzewj.zza);
    }

    public final void zzs() {
    }
}
