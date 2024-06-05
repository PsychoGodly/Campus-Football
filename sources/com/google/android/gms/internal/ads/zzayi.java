package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzayi extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzayi zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzayi zzayi = new zzayi();
        zzb = zzayi;
        zzgqm.zzaT(zzayi.class, zzayi);
    }

    private zzayi() {
    }

    public static zzayb zza() {
        return (zzayb) zzb.zzaA();
    }

    public static zzayi zzd() {
        return zzb;
    }

    static /* synthetic */ void zzi(zzayi zzayi, int i10) {
        zzayi.zze = i10 - 1;
        zzayi.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzayi zzayi, int i10) {
        zzayi.zzf = i10 - 1;
        zzayi.zzd |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", zzayg.zza, "zzf", zzayd.zza});
        } else if (i11 == 3) {
            return new zzayi();
        } else {
            if (i11 == 4) {
                return new zzayb((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int zza = zzaye.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzayh.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
