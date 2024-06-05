package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzgl implements zzgd {
    final int zza;
    final zzjv zzb;

    zzgl(zzgr zzgr, int i10, zzjv zzjv, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zzjv;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzgl) obj).zza;
    }

    public final int zza() {
        return this.zza;
    }

    public final zzhx zzb(zzhx zzhx, zzhy zzhy) {
        ((zzgi) zzhx).zzg((zzgo) zzhy);
        return zzhx;
    }

    public final zzid zzc(zzid zzid, zzid zzid2) {
        throw new UnsupportedOperationException();
    }

    public final zzjv zzd() {
        return this.zzb;
    }

    public final zzjw zze() {
        return this.zzb.zza();
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg() {
        return false;
    }
}
