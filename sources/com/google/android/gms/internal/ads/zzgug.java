package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgug extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgug zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgpe zzg = zzgpe.zzb;

    static {
        zzgug zzgug = new zzgug();
        zzb = zzgug;
        zzgqm.zzaT(zzgug.class, zzgug);
    }

    private zzgug() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", zzguf.zza, "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzgug();
        } else {
            if (i11 == 4) {
                return new zzgue((zzgub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
