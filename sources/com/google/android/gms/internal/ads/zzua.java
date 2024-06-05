package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzua extends zzrt implements zztr {
    private final zzbg zza;
    private final zzay zzb;
    private final zzff zzc;
    private final zzpz zzd;
    private final int zze;
    private boolean zzf = true;
    private long zzg = -9223372036854775807L;
    private boolean zzh;
    private boolean zzi;
    private zzgi zzj;
    private final zztx zzk;
    private final zzwx zzl;

    /* synthetic */ zzua(zzbg zzbg, zzff zzff, zztx zztx, zzpz zzpz, zzwx zzwx, int i10, zztz zztz, byte[] bArr) {
        zzay zzay = zzbg.zzd;
        Objects.requireNonNull(zzay);
        this.zzb = zzay;
        this.zza = zzbg;
        this.zzc = zzff;
        this.zzk = zztx;
        this.zzd = zzpz;
        this.zzl = zzwx;
        this.zze = i10;
    }

    private final void zzv() {
        long j10 = this.zzg;
        boolean z10 = this.zzh;
        boolean z11 = this.zzi;
        zzbg zzbg = this.zza;
        zzun zzun = r1;
        zzun zzun2 = new zzun(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0, 0, z10, false, false, (Object) null, zzbg, z11 ? zzbg.zzf : null);
        zzo(this.zzf ? new zztw(this, zzun) : zzun);
    }

    public final void zzF(zzsq zzsq) {
        ((zztv) zzsq).zzM();
    }

    public final zzsq zzH(zzss zzss, zzwt zzwt, long j10) {
        zzfg zza2 = this.zzc.zza();
        zzgi zzgi = this.zzj;
        if (zzgi != null) {
            zza2.zzf(zzgi);
        }
        Uri uri = this.zzb.zza;
        zztx zztx = this.zzk;
        zzb();
        return new zztv(uri, zza2, new zzrv(zztx.zza), this.zzd, zzc(zzss), this.zzl, zze(zzss), this, zzwt, (String) null, this.zze, (byte[]) null);
    }

    public final zzbg zzI() {
        return this.zza;
    }

    public final void zza(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zzg;
        }
        if (this.zzf || this.zzg != j10 || this.zzh != z10 || this.zzi != z11) {
            this.zzg = j10;
            this.zzh = z10;
            this.zzi = z11;
            this.zzf = false;
            zzv();
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzgi zzgi) {
        this.zzj = zzgi;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzv();
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
    }

    public final void zzy() {
    }
}
