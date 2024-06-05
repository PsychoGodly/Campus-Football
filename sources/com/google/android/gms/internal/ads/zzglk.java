package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzglk extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzglk zzb;
    private zzgky zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzglk zzglk = new zzglk();
        zzb = zzglk;
        zzgqm.zzaT(zzglk.class, zzglk);
    }

    private zzglk() {
    }

    public static zzglj zzd() {
        return (zzglj) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzglk zzglk, zzgky zzgky) {
        zzgky.getClass();
        zzglk.zzd = zzgky;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzglk();
        } else {
            if (i11 == 4) {
                return new zzglj((zzglh) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgky zzc() {
        zzgky zzgky = this.zzd;
        return zzgky == null ? zzgky.zze() : zzgky;
    }

    public final zzgme zzf() {
        zzgme zzb2 = zzgme.zzb(this.zzg);
        return zzb2 == null ? zzgme.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return this.zzd != null;
    }

    public final int zzk() {
        int i10 = this.zze;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
