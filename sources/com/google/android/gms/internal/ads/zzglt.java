package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzglt extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzglt zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzglw zze;

    static {
        zzglt zzglt = new zzglt();
        zzb = zzglt;
        zzgqm.zzaT(zzglt.class, zzglt);
    }

    private zzglt() {
    }

    public static zzgls zzc() {
        return (zzgls) zzb.zzaA();
    }

    public static zzglt zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzglt) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzh(zzglt zzglt, zzglw zzglw) {
        zzglw.getClass();
        zzglt.zze = zzglw;
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
            return new zzglt();
        } else {
            if (i11 == 4) {
                return new zzgls((zzglr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzglw zzf() {
        zzglw zzglw = this.zze;
        return zzglw == null ? zzglw.zzc() : zzglw;
    }
}
