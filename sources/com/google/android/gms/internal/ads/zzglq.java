package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzglq extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzglq zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgqv zze = zzgqm.zzaM();

    static {
        zzglq zzglq = new zzglq();
        zzb = zzglq;
        zzgqm.zzaT(zzglq.class, zzglq);
    }

    private zzglq() {
    }

    public static zzgln zza() {
        return (zzgln) zzb.zzaA();
    }

    static /* synthetic */ void zze(zzglq zzglq, zzglp zzglp) {
        zzglp.getClass();
        zzgqv zzgqv = zzglq.zze;
        if (!zzgqv.zzc()) {
            zzglq.zze = zzgqm.zzaN(zzgqv);
        }
        zzglq.zze.add(zzglp);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzglp.class});
        } else if (i11 == 3) {
            return new zzglq();
        } else {
            if (i11 == 4) {
                return new zzgln((zzglm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
