package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgld extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgld zzb;
    private String zzd = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public zzgpe zze = zzgpe.zzb;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgld zzgld = new zzgld();
        zzb = zzgld;
        zzgqm.zzaT(zzgld.class, zzgld);
    }

    private zzgld() {
    }

    public static zzglc zza() {
        return (zzglc) zzb.zzaA();
    }

    public static zzgld zzd() {
        return zzb;
    }

    static /* synthetic */ void zzh(zzgld zzgld, String str) {
        str.getClass();
        zzgld.zzd = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzgld();
        } else {
            if (i11 == 4) {
                return new zzglc((zzglb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgme zze() {
        zzgme zzb2 = zzgme.zzb(this.zzf);
        return zzb2 == null ? zzgme.UNRECOGNIZED : zzb2;
    }

    public final zzgpe zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
