package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzawz extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzawz zzb;
    private zzgqv zzd = zzgqm.zzaM();

    static {
        zzawz zzawz = new zzawz();
        zzb = zzawz;
        zzgqm.zzaT(zzawz.class, zzawz);
    }

    private zzawz() {
    }

    public static zzawt zza() {
        return (zzawt) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzawz zzawz, zzaws zzaws) {
        zzaws.getClass();
        zzgqv zzgqv = zzawz.zzd;
        if (!zzgqv.zzc()) {
            zzawz.zzd = zzgqm.zzaN(zzgqv);
        }
        zzawz.zzd.add(zzaws);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzaws.class});
        } else if (i11 == 3) {
            return new zzawz();
        } else {
            if (i11 == 4) {
                return new zzawt((zzawl) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
