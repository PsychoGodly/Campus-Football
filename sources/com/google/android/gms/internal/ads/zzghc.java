package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzghc extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzghc zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzghc zzghc = new zzghc();
        zzb = zzghc;
        zzgqm.zzaT(zzghc.class, zzghc);
    }

    private zzghc() {
    }

    public static zzghb zzc() {
        return (zzghb) zzb.zzaA();
    }

    public static zzghc zze() {
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
            return new zzghc();
        } else {
            if (i11 == 4) {
                return new zzghb((zzgha) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
