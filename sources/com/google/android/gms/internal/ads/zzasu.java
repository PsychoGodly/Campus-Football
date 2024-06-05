package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasu extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzasu zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzasu zzasu = new zzasu();
        zzb = zzasu;
        zzgqm.zzaT(zzasu.class, zzasu);
    }

    private zzasu() {
    }

    public static zzast zze() {
        return (zzast) zzb.zzaA();
    }

    public static zzasu zzg() {
        return zzb;
    }

    public static zzasu zzh(zzgpe zzgpe) throws zzgqy {
        return (zzasu) zzgqm.zzaE(zzb, zzgpe);
    }

    public static zzasu zzi(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzasu) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzl(zzasu zzasu, String str) {
        str.getClass();
        zzasu.zzd |= 1;
        zzasu.zze = str;
    }

    static /* synthetic */ void zzm(zzasu zzasu, long j10) {
        zzasu.zzd |= 16;
        zzasu.zzi = j10;
    }

    static /* synthetic */ void zzn(zzasu zzasu, String str) {
        str.getClass();
        zzasu.zzd |= 2;
        zzasu.zzf = str;
    }

    static /* synthetic */ void zzo(zzasu zzasu, long j10) {
        zzasu.zzd |= 4;
        zzasu.zzg = j10;
    }

    static /* synthetic */ void zzp(zzasu zzasu, long j10) {
        zzasu.zzd |= 8;
        zzasu.zzh = j10;
    }

    public final long zza() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzasu();
        } else {
            if (i11 == 4) {
                return new zzast((zzass) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final long zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zze;
    }
}
