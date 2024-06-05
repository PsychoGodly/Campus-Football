package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzamq extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzamq zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzamq zzamq = new zzamq();
        zzb = zzamq;
        zzgqm.zzaT(zzamq.class, zzamq);
    }

    private zzamq() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzd", "zze", zzamr.zza});
        } else if (i11 == 3) {
            return new zzamq();
        } else {
            if (i11 == 4) {
                return new zzamp((zzamm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
