package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzazx extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzazx zzb;
    private int zzd;
    private int zze = 1000;
    private zzazl zzf;

    static {
        zzazx zzazx = new zzazx();
        zzb = zzazx;
        zzgqm.zzaT(zzazx.class, zzazx);
    }

    private zzazx() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzaxr.zza, "zzf"});
        } else if (i11 == 3) {
            return new zzazx();
        } else {
            if (i11 == 4) {
                return new zzazw((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
