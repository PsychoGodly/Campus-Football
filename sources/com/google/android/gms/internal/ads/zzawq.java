package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzawq extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzawq zzb;
    private int zzd;
    private int zze;
    private int zzf = 1000;
    private zzaxg zzg;
    private zzaxi zzh;
    private zzgqv zzi = zzgqm.zzaM();
    private zzaxk zzj;
    private zzayu zzk;
    private zzayk zzl;
    private zzaxy zzm;
    private zzaya zzn;
    private zzgqv zzo = zzgqm.zzaM();

    static {
        zzawq zzawq = new zzawq();
        zzb = zzawq;
        zzgqm.zzaT(zzawq.class, zzawq);
    }

    private zzawq() {
    }

    public static zzawq zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzawq zzawq, zzawo zzawo) {
        zzawq.zze = zzawo.zza();
        zzawq.zzd |= 1;
    }

    static /* synthetic */ void zzf(zzawq zzawq, zzaxi zzaxi) {
        zzaxi.getClass();
        zzawq.zzh = zzaxi;
        zzawq.zzd |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzawo.zzc(), "zzf", zzaxr.zza, "zzg", "zzh", "zzi", zzaxe.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzazg.class});
        } else if (i11 == 3) {
            return new zzawq();
        } else {
            if (i11 == 4) {
                return new zzawp((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzaxi zzd() {
        zzaxi zzaxi = this.zzh;
        return zzaxi == null ? zzaxi.zzc() : zzaxi;
    }
}
