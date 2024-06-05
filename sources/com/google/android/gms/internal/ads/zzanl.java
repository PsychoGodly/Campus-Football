package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzanl extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzanl zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzanl zzanl = new zzanl();
        zzb = zzanl;
        zzgqm.zzaT(zzanl.class, zzanl);
    }

    private zzanl() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzana.zza, "zzf"});
        } else if (i11 == 3) {
            return new zzanl();
        } else {
            if (i11 == 4) {
                return new zzank((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
