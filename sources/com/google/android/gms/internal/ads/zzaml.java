package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaml extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzaml zzb;
    private int zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private long zzf;
    private String zzg = MaxReward.DEFAULT_LABEL;
    private String zzh = MaxReward.DEFAULT_LABEL;
    private String zzi = MaxReward.DEFAULT_LABEL;
    private long zzj;
    private long zzk;
    private String zzl = MaxReward.DEFAULT_LABEL;
    private long zzm;
    private String zzn = MaxReward.DEFAULT_LABEL;
    private String zzo = MaxReward.DEFAULT_LABEL;
    private zzgqv zzp = zzgqm.zzaM();
    private int zzq;

    static {
        zzaml zzaml = new zzaml();
        zzb = zzaml;
        zzgqm.zzaT(zzaml.class, zzaml);
    }

    private zzaml() {
    }

    public static zzamh zza() {
        return (zzamh) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzaml zzaml, long j10) {
        zzaml.zzd |= 2;
        zzaml.zzf = j10;
    }

    static /* synthetic */ void zze(zzaml zzaml, String str) {
        str.getClass();
        zzaml.zzd |= 4;
        zzaml.zzg = str;
    }

    static /* synthetic */ void zzf(zzaml zzaml, String str) {
        str.getClass();
        zzaml.zzd |= 8;
        zzaml.zzh = str;
    }

    static /* synthetic */ void zzg(zzaml zzaml, String str) {
        zzaml.zzd |= 16;
        zzaml.zzi = str;
    }

    static /* synthetic */ void zzh(zzaml zzaml, String str) {
        zzaml.zzd |= 1024;
        zzaml.zzo = str;
    }

    static /* synthetic */ void zzi(zzaml zzaml, String str) {
        str.getClass();
        zzaml.zzd |= 1;
        zzaml.zze = str;
    }

    static /* synthetic */ void zzj(zzaml zzaml, int i10) {
        zzaml.zzq = i10 - 1;
        zzaml.zzd |= 2048;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzamj.class, "zzq", zzamk.zza});
        } else if (i11 == 3) {
            return new zzaml();
        } else {
            if (i11 == 4) {
                return new zzamh((zzamg) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
