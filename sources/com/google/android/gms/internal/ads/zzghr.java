package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzghr extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzghr zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzghr zzghr = new zzghr();
        zzb = zzghr;
        zzgqm.zzaT(zzghr.class, zzghr);
    }

    private zzghr() {
    }

    public static zzghq zzc() {
        return (zzghq) zzb.zzaA();
    }

    public static zzghr zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzghr();
        } else {
            if (i11 == 4) {
                return new zzghq((zzghp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
