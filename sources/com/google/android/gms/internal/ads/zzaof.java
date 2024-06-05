package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaof extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaof zzb;
    private int zzd;
    private zzgqv zze = zzgqm.zzaM();
    private zzgpe zzf = zzgpe.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzaof zzaof = new zzaof();
        zzb = zzaof;
        zzgqm.zzaT(zzaof.class, zzaof);
    }

    private zzaof() {
    }

    public static zzaoe zza() {
        return (zzaoe) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaof zzaof, zzgpe zzgpe) {
        zzgqv zzgqv = zzaof.zze;
        if (!zzgqv.zzc()) {
            zzaof.zze = zzgqm.zzaN(zzgqv);
        }
        zzaof.zze.add(zzgpe);
    }

    static /* synthetic */ void zze(zzaof zzaof, zzgpe zzgpe) {
        zzaof.zzd |= 1;
        zzaof.zzf = zzgpe;
    }

    static /* synthetic */ void zzf(zzaof zzaof, int i10) {
        zzaof.zzh = i10 - 1;
        zzaof.zzd |= 4;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzanz.zza, "zzh", zzanx.zza});
        } else if (i11 == 3) {
            return new zzaof();
        } else {
            if (i11 == 4) {
                return new zzaoe((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
