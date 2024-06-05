package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzghu extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzghu zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgia zze;
    /* access modifiers changed from: private */
    public zzgpe zzf = zzgpe.zzb;

    static {
        zzghu zzghu = new zzghu();
        zzb = zzghu;
        zzgqm.zzaT(zzghu.class, zzghu);
    }

    private zzghu() {
    }

    public static zzght zzc() {
        return (zzght) zzb.zzaA();
    }

    public static zzghu zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzghu) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzi(zzghu zzghu, zzgia zzgia) {
        zzgia.getClass();
        zzghu.zze = zzgia;
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
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzghu();
        } else {
            if (i11 == 4) {
                return new zzght((zzghs) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgia zzf() {
        zzgia zzgia = this.zze;
        return zzgia == null ? zzgia.zze() : zzgia;
    }

    public final zzgpe zzg() {
        return this.zzf;
    }
}
