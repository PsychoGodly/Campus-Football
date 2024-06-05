package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzggz extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzggz zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzghc zze;

    static {
        zzggz zzggz = new zzggz();
        zzb = zzggz;
        zzgqm.zzaT(zzggz.class, zzggz);
    }

    private zzggz() {
    }

    public static zzggy zzc() {
        return (zzggy) zzb.zzaA();
    }

    public static zzggz zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzggz) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzh(zzggz zzggz, zzghc zzghc) {
        zzghc.getClass();
        zzggz.zze = zzghc;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzggz();
        } else {
            if (i11 == 4) {
                return new zzggy((zzggx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzghc zzf() {
        zzghc zzghc = this.zze;
        return zzghc == null ? zzghc.zze() : zzghc;
    }
}
