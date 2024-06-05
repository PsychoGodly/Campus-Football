package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaze extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaze zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzaze zzaze = new zzaze();
        zzb = zzaze;
        zzgqm.zzaT(zzaze.class, zzaze);
    }

    private zzaze() {
    }

    public static zzazd zza() {
        return (zzazd) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaze zzaze, int i10) {
        zzaze.zzd |= 1;
        zzaze.zze = i10;
    }

    static /* synthetic */ void zze(zzaze zzaze, int i10) {
        zzaze.zzd |= 2;
        zzaze.zzf = i10;
    }

    static /* synthetic */ void zzf(zzaze zzaze, int i10) {
        zzaze.zzd |= 4;
        zzaze.zzg = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzaze();
        } else {
            if (i11 == 4) {
                return new zzazd((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
