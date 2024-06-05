package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfes extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzfes zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public long zzf;
    /* access modifiers changed from: private */
    public int zzg;
    private String zzh = MaxReward.DEFAULT_LABEL;
    private String zzi = MaxReward.DEFAULT_LABEL;
    private String zzj = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public int zzk;
    private int zzl;
    /* access modifiers changed from: private */
    public int zzm;
    /* access modifiers changed from: private */
    public long zzn;
    private int zzo;
    private String zzp = MaxReward.DEFAULT_LABEL;
    private String zzq = MaxReward.DEFAULT_LABEL;
    private String zzr = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public String zzs = MaxReward.DEFAULT_LABEL;
    private String zzt = MaxReward.DEFAULT_LABEL;
    private String zzu = MaxReward.DEFAULT_LABEL;
    private String zzv = MaxReward.DEFAULT_LABEL;
    private String zzw = MaxReward.DEFAULT_LABEL;

    static {
        zzfes zzfes = new zzfes();
        zzb = zzfes;
        zzgqm.zzaT(zzfes.class, zzfes);
    }

    private zzfes() {
    }

    public static zzfer zza() {
        return (zzfer) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzh = str;
    }

    static /* synthetic */ void zze(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzi = str;
    }

    static /* synthetic */ void zzf(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzj = str;
    }

    static /* synthetic */ void zzj(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzp = str;
    }

    static /* synthetic */ void zzk(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzq = str;
    }

    static /* synthetic */ void zzl(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzr = str;
    }

    static /* synthetic */ void zzo(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzt = str;
    }

    static /* synthetic */ void zzp(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzu = str;
    }

    static /* synthetic */ void zzq(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzv = str;
    }

    static /* synthetic */ void zzr(zzfes zzfes, String str) {
        str.getClass();
        zzfes.zzw = str;
    }

    static /* synthetic */ void zzu(zzfes zzfes, int i10) {
        if (i10 != 1) {
            zzfes.zzl = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    static /* synthetic */ void zzv(zzfes zzfes, int i10) {
        if (i10 != 1) {
            zzfes.zzo = i10 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0014\u0000\u0000\u0001\u0014\u0014\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw"});
        } else if (i11 == 3) {
            return new zzfes();
        } else {
            if (i11 == 4) {
                return new zzfer((zzfeq) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
