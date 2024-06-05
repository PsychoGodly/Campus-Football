package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgho extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgho zzb;
    private zzghr zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgho zzgho = new zzgho();
        zzb = zzgho;
        zzgqm.zzaT(zzgho.class, zzgho);
    }

    private zzgho() {
    }

    public static zzghn zzc() {
        return (zzghn) zzb.zzaA();
    }

    public static zzgho zze() {
        return zzb;
    }

    public static zzgho zzf(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgho) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzh(zzgho zzgho, zzghr zzghr) {
        zzghr.getClass();
        zzgho.zzd = zzghr;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgho();
        } else {
            if (i11 == 4) {
                return new zzghn((zzghm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzghr zzg() {
        zzghr zzghr = this.zzd;
        return zzghr == null ? zzghr.zze() : zzghr;
    }
}
