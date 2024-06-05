package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaxu extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaxu zzb;
    private int zzd;
    private int zze;
    private String zzf = MaxReward.DEFAULT_LABEL;
    private int zzg;
    private int zzh = 1000;
    private zzaze zzi;
    /* access modifiers changed from: private */
    public zzgqu zzj = zzgqm.zzaL();
    private zzaxm zzk;
    private zzaxp zzl;
    private zzayi zzm;
    private zzawq zzn;
    private zzays zzo;
    private zzazz zzp;
    private zzawz zzq;

    static {
        zzaxu zzaxu = new zzaxu();
        zzb = zzaxu;
        zzgqm.zzaT(zzaxu.class, zzaxu);
    }

    private zzaxu() {
    }

    public static zzaxt zzd() {
        return (zzaxt) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzaxu zzaxu, String str) {
        str.getClass();
        zzaxu.zzd |= 2;
        zzaxu.zzf = str;
    }

    static /* synthetic */ void zzh(zzaxu zzaxu, Iterable iterable) {
        zzgqu zzgqu = zzaxu.zzj;
        if (!zzgqu.zzc()) {
            int size = zzgqu.size();
            zzaxu.zzj = zzgqu.zza(size == 0 ? 10 : size + size);
        }
        zzgon.zzav(iterable, zzaxu.zzj);
    }

    static /* synthetic */ void zzj(zzaxu zzaxu, zzaxm zzaxm) {
        zzaxm.getClass();
        zzaxu.zzk = zzaxm;
        zzaxu.zzd |= 32;
    }

    static /* synthetic */ void zzk(zzaxu zzaxu, zzawq zzawq) {
        zzawq.getClass();
        zzaxu.zzn = zzawq;
        zzaxu.zzd |= 256;
    }

    static /* synthetic */ void zzl(zzaxu zzaxu, zzays zzays) {
        zzays.getClass();
        zzaxu.zzo = zzays;
        zzaxu.zzd |= 512;
    }

    static /* synthetic */ void zzm(zzaxu zzaxu, zzazz zzazz) {
        zzazz.getClass();
        zzaxu.zzp = zzazz;
        zzaxu.zzd |= 1024;
    }

    static /* synthetic */ void zzn(zzaxu zzaxu, zzawz zzawz) {
        zzawz.getClass();
        zzaxu.zzq = zzawz;
        zzaxu.zzd |= 2048;
    }

    public final zzawq zza() {
        zzawq zzawq = this.zzn;
        return zzawq == null ? zzawq.zzc() : zzawq;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzaxr.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        } else if (i11 == 3) {
            return new zzaxu();
        } else {
            if (i11 == 4) {
                return new zzaxt((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzaxm zzc() {
        zzaxm zzaxm = this.zzk;
        return zzaxm == null ? zzaxm.zzc() : zzaxm;
    }

    public final String zzf() {
        return this.zzf;
    }
}
