package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgvu extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgvu zzb;
    private zzgqv zzA = zzgqm.zzaM();
    private zzgur zzB;
    private String zzC = MaxReward.DEFAULT_LABEL;
    private zzguj zzD;
    private zzgqv zzE = zzgqm.zzaM();
    private byte zzF = 2;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = MaxReward.DEFAULT_LABEL;
    private String zzh = MaxReward.DEFAULT_LABEL;
    private String zzi = MaxReward.DEFAULT_LABEL;
    private zzgun zzj;
    private zzgqv zzk = zzgqm.zzaM();
    private zzgqv zzl = zzgqm.zzaM();
    private String zzm = MaxReward.DEFAULT_LABEL;
    private zzgvi zzn;
    private boolean zzo;
    private zzgqv zzp = zzgqm.zzaM();
    private String zzq = MaxReward.DEFAULT_LABEL;
    private boolean zzr;
    private boolean zzs;
    private zzgpe zzt = zzgpe.zzb;
    private zzgvq zzu;
    private boolean zzv;
    private String zzw = MaxReward.DEFAULT_LABEL;
    private zzgqv zzx = zzgqm.zzaM();
    private zzgqv zzy = zzgqm.zzaM();
    private zzgvt zzz;

    static {
        zzgvu zzgvu = new zzgvu();
        zzb = zzgvu;
        zzgqm.zzaT(zzgvu.class, zzgvu);
    }

    private zzgvu() {
    }

    public static zzgul zza() {
        return (zzgul) zzb.zzaA();
    }

    static /* synthetic */ void zzg(zzgvu zzgvu, String str) {
        str.getClass();
        zzgvu.zzd |= 4;
        zzgvu.zzg = str;
    }

    static /* synthetic */ void zzh(zzgvu zzgvu, String str) {
        str.getClass();
        zzgvu.zzd |= 8;
        zzgvu.zzh = str;
    }

    static /* synthetic */ void zzi(zzgvu zzgvu, zzgun zzgun) {
        zzgun.getClass();
        zzgvu.zzj = zzgun;
        zzgvu.zzd |= 32;
    }

    static /* synthetic */ void zzj(zzgvu zzgvu, zzgvo zzgvo) {
        zzgvo.getClass();
        zzgqv zzgqv = zzgvu.zzk;
        if (!zzgqv.zzc()) {
            zzgvu.zzk = zzgqm.zzaN(zzgqv);
        }
        zzgvu.zzk.add(zzgvo);
    }

    static /* synthetic */ void zzk(zzgvu zzgvu, String str) {
        zzgvu.zzd |= 64;
        zzgvu.zzm = str;
    }

    static /* synthetic */ void zzl(zzgvu zzgvu) {
        zzgvu.zzd &= -65;
        zzgvu.zzm = zzb.zzm;
    }

    static /* synthetic */ void zzm(zzgvu zzgvu, zzgvi zzgvi) {
        zzgvi.getClass();
        zzgvu.zzn = zzgvi;
        zzgvu.zzd |= 128;
    }

    static /* synthetic */ void zzn(zzgvu zzgvu, zzgvq zzgvq) {
        zzgvq.getClass();
        zzgvu.zzu = zzgvq;
        zzgvu.zzd |= 8192;
    }

    static /* synthetic */ void zzo(zzgvu zzgvu, Iterable iterable) {
        zzgqv zzgqv = zzgvu.zzx;
        if (!zzgqv.zzc()) {
            zzgvu.zzx = zzgqm.zzaN(zzgqv);
        }
        zzgon.zzav(iterable, zzgvu.zzx);
    }

    static /* synthetic */ void zzp(zzgvu zzgvu, Iterable iterable) {
        zzgqv zzgqv = zzgvu.zzy;
        if (!zzgqv.zzc()) {
            zzgvu.zzy = zzgqm.zzaN(zzgqv);
        }
        zzgon.zzav(iterable, zzgvu.zzy);
    }

    static /* synthetic */ void zzq(zzgvu zzgvu, int i10) {
        zzgvu.zze = i10 - 1;
        zzgvu.zzd |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzF);
        }
        byte b10 = 1;
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", zzgvo.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", zzgvj.zza, "zzf", zzguk.zza, "zzj", "zzm", "zzn", "zzt", "zzl", zzgvy.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", zzgwe.class, "zzB", "zzC", "zzD", "zzE", zzguv.class});
        } else if (i11 == 3) {
            return new zzgvu();
        } else {
            if (i11 == 4) {
                return new zzgul((zzgub) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzF = b10;
            return null;
        }
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzg;
    }

    public final List zzf() {
        return this.zzk;
    }
}
