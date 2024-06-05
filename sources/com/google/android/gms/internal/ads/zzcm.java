package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcm {
    private static final String zzA = zzew.zzP(9);
    private static final String zzB = zzew.zzP(10);
    private static final String zzC = zzew.zzP(11);
    private static final String zzD = zzew.zzP(12);
    private static final String zzE = zzew.zzP(13);
    public static final Object zza = new Object();
    public static final zzn zzb = zzcl.zza;
    private static final Object zzq = new Object();
    private static final zzbg zzr;
    private static final String zzs = zzew.zzP(1);
    private static final String zzt = zzew.zzP(2);
    private static final String zzu = zzew.zzP(3);
    private static final String zzv = zzew.zzP(4);
    private static final String zzw = zzew.zzP(5);
    private static final String zzx = zzew.zzP(6);
    private static final String zzy = zzew.zzP(7);
    private static final String zzz = zzew.zzP(8);
    public Object zzc = zza;
    public zzbg zzd = zzr;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Deprecated
    public boolean zzj;
    public zzaw zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;

    static {
        zzaj zzaj = new zzaj();
        zzaj.zza("androidx.media3.common.Timeline");
        zzaj.zzb(Uri.EMPTY);
        zzr = zzaj.zzc();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcm.class.equals(obj.getClass())) {
            zzcm zzcm = (zzcm) obj;
            return zzew.zzU(this.zzc, zzcm.zzc) && zzew.zzU(this.zzd, zzcm.zzd) && zzew.zzU((Object) null, (Object) null) && zzew.zzU(this.zzk, zzcm.zzk) && this.zze == zzcm.zze && this.zzf == zzcm.zzf && this.zzg == zzcm.zzg && this.zzh == zzcm.zzh && this.zzi == zzcm.zzi && this.zzl == zzcm.zzl && this.zzn == zzcm.zzn && this.zzo == zzcm.zzo && this.zzp == zzcm.zzp;
        }
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((this.zzc.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzaw zzaw = this.zzk;
        if (zzaw == null) {
            i10 = 0;
        } else {
            i10 = zzaw.hashCode();
        }
        long j10 = this.zze;
        long j11 = this.zzf;
        long j12 = this.zzg;
        int i11 = (((((((((((((hashCode * 961) + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzl ? 1 : 0);
        long j13 = this.zzn;
        return ((((((i11 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzcm zza(Object obj, zzbg zzbg, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, zzaw zzaw, long j13, long j14, int i10, int i11, long j15) {
        zzaw zzaw2 = zzaw;
        this.zzc = obj;
        this.zzd = zzbg == null ? zzr : zzbg;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = zzaw2 != null;
        this.zzk = zzaw2;
        this.zzm = 0;
        this.zzn = j14;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzdl.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}
