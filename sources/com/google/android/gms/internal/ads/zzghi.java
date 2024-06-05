package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzghi extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzghi zzb;
    private zzgho zzd;
    private zzgkc zze;

    static {
        zzghi zzghi = new zzghi();
        zzb = zzghi;
        zzgqm.zzaT(zzghi.class, zzghi);
    }

    private zzghi() {
    }

    public static zzghh zza() {
        return (zzghh) zzb.zzaA();
    }

    public static zzghi zzd(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzghi) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzg(zzghi zzghi, zzgho zzgho) {
        zzgho.getClass();
        zzghi.zzd = zzgho;
    }

    static /* synthetic */ void zzh(zzghi zzghi, zzgkc zzgkc) {
        zzgkc.getClass();
        zzghi.zze = zzgkc;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzghi();
        } else {
            if (i11 == 4) {
                return new zzghh((zzghg) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgho zze() {
        zzgho zzgho = this.zzd;
        return zzgho == null ? zzgho.zze() : zzgho;
    }

    public final zzgkc zzf() {
        zzgkc zzgkc = this.zze;
        return zzgkc == null ? zzgkc.zze() : zzgkc;
    }
}
