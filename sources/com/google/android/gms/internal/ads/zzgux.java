package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgux extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgux zzb;
    private int zzd;
    private zzgpe zze;
    private zzgpe zzf;
    private byte zzg = 2;

    static {
        zzgux zzgux = new zzgux();
        zzb = zzgux;
        zzgqm.zzaT(zzgux.class, zzgux);
    }

    private zzgux() {
        zzgpe zzgpe = zzgpe.zzb;
        this.zze = zzgpe;
        this.zzf = zzgpe;
    }

    public static zzguw zza() {
        return (zzguw) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzgux zzgux, zzgpe zzgpe) {
        zzgux.zzd |= 1;
        zzgux.zze = zzgpe;
    }

    static /* synthetic */ void zze(zzgux zzgux, zzgpe zzgpe) {
        zzgux.zzd |= 2;
        zzgux.zzf = zzgpe;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgux();
        } else {
            if (i11 == 4) {
                return new zzguw((zzgub) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzg = b10;
            return null;
        }
    }
}
