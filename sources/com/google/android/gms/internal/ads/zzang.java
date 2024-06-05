package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzang extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzang zzb;
    private int zzd;
    private long zze = -1;

    static {
        zzang zzang = new zzang();
        zzb = zzang;
        zzgqm.zzaT(zzang.class, zzang);
    }

    private zzang() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzang();
        } else {
            if (i11 == 4) {
                return new zzanf((zzamu) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
