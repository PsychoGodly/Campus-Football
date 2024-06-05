package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgig extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgig zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzgig zzgig = new zzgig();
        zzb = zzgig;
        zzgqm.zzaT(zzgig.class, zzgig);
    }

    private zzgig() {
    }

    public static zzgif zzc() {
        return (zzgif) zzb.zzaA();
    }

    public static zzgig zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgig) zzgqm.zzaG(zzb, zzgpe, zzgpy);
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
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgig();
        } else {
            if (i11 == 4) {
                return new zzgif((zzgie) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
