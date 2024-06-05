package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgvo extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgvo zzb;
    private int zzd;
    private int zze;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private zzgvb zzg;
    private zzgvf zzh;
    private int zzi;
    private zzgqr zzj = zzgqm.zzaJ();
    private String zzk = MaxReward.DEFAULT_LABEL;
    private int zzl;
    private zzgqv zzm = zzgqm.zzaM();
    private byte zzn = 2;

    static {
        zzgvo zzgvo = new zzgvo();
        zzb = zzgvo;
        zzgqm.zzaT(zzgvo.class, zzgvo);
    }

    private zzgvo() {
    }

    public static zzgvn zzc() {
        return (zzgvn) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzgvo zzgvo, int i10) {
        zzgvo.zzd |= 1;
        zzgvo.zze = i10;
    }

    static /* synthetic */ void zzg(zzgvo zzgvo, String str) {
        str.getClass();
        zzgvo.zzd |= 2;
        zzgvo.zzf = str;
    }

    static /* synthetic */ void zzh(zzgvo zzgvo, zzgvb zzgvb) {
        zzgvb.getClass();
        zzgvo.zzg = zzgvb;
        zzgvo.zzd |= 4;
    }

    static /* synthetic */ void zzi(zzgvo zzgvo, String str) {
        str.getClass();
        zzgqv zzgqv = zzgvo.zzm;
        if (!zzgqv.zzc()) {
            zzgvo.zzm = zzgqm.zzaN(zzgqv);
        }
        zzgvo.zzm.add(str);
    }

    static /* synthetic */ void zzj(zzgvo zzgvo, int i10) {
        zzgvo.zzl = i10 - 1;
        zzgvo.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgvl.zza, "zzm"});
        } else if (i11 == 3) {
            return new zzgvo();
        } else {
            if (i11 == 4) {
                return new zzgvn((zzgub) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzn = b10;
            return null;
        }
    }

    public final String zze() {
        return this.zzf;
    }
}
