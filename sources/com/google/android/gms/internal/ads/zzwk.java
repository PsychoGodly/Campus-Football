package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzwk {
    private zzwj zza;
    private zzws zzb;

    public void zzh() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzi(zzk zzk) {
        throw null;
    }

    public boolean zzl() {
        throw null;
    }

    public abstract zzwl zzn(zzko[] zzkoArr, zzur zzur, zzss zzss, zzcn zzcn) throws zzhj;

    public abstract void zzo(Object obj);

    /* access modifiers changed from: protected */
    public final zzws zzp() {
        zzws zzws = this.zzb;
        zzdl.zzb(zzws);
        return zzws;
    }

    public final void zzq(zzwj zzwj, zzws zzws) {
        this.zza = zzwj;
        this.zzb = zzws;
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        zzwj zzwj = this.zza;
        if (zzwj != null) {
            zzwj.zzj();
        }
    }
}
