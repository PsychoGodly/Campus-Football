package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgip extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgip zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public zzgpe zze = zzgpe.zzb;

    static {
        zzgip zzgip = new zzgip();
        zzb = zzgip;
        zzgqm.zzaT(zzgip.class, zzgip);
    }

    private zzgip() {
    }

    public static zzgio zzc() {
        return (zzgio) zzb.zzaA();
    }

    public static zzgip zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgip) zzgqm.zzaG(zzb, zzgpe, zzgpy);
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
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgip();
        } else {
            if (i11 == 4) {
                return new zzgio((zzgin) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgpe zzf() {
        return this.zze;
    }
}
