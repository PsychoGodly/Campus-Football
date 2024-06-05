package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzays extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzays zzb;
    private int zzd;
    private zzgqv zze = zzgqm.zzaM();
    private int zzf;
    private int zzg;
    private long zzh;
    private String zzi = MaxReward.DEFAULT_LABEL;
    private String zzj = MaxReward.DEFAULT_LABEL;
    private long zzk;
    private int zzl;

    static {
        zzays zzays = new zzays();
        zzb = zzays;
        zzgqm.zzaT(zzays.class, zzays);
    }

    private zzays() {
    }

    public static zzayo zza() {
        return (zzayo) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzays zzays, Iterable iterable) {
        zzgqv zzgqv = zzays.zze;
        if (!zzgqv.zzc()) {
            zzays.zze = zzgqm.zzaN(zzgqv);
        }
        zzgon.zzav(iterable, zzays.zze);
    }

    static /* synthetic */ void zze(zzays zzays, int i10) {
        zzays.zzd |= 1;
        zzays.zzf = i10;
    }

    static /* synthetic */ void zzf(zzays zzays, int i10) {
        zzays.zzd |= 2;
        zzays.zzg = i10;
    }

    static /* synthetic */ void zzg(zzays zzays, long j10) {
        zzays.zzd |= 4;
        zzays.zzh = j10;
    }

    static /* synthetic */ void zzh(zzays zzays, String str) {
        str.getClass();
        zzays.zzd |= 8;
        zzays.zzi = str;
    }

    static /* synthetic */ void zzi(zzays zzays, String str) {
        str.getClass();
        zzays.zzd |= 16;
        zzays.zzj = str;
    }

    static /* synthetic */ void zzj(zzays zzays, long j10) {
        zzays.zzd |= 32;
        zzays.zzk = j10;
    }

    static /* synthetic */ void zzk(zzays zzays, int i10) {
        zzays.zzd |= 64;
        zzays.zzl = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzayn.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i11 == 3) {
            return new zzays();
        } else {
            if (i11 == 4) {
                return new zzayo((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
