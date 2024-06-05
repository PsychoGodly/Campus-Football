package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfex extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzfex zzb;
    /* access modifiers changed from: private */
    public zzgqv zzd = zzgqm.zzaM();

    static {
        zzfex zzfex = new zzfex();
        zzb = zzfex;
        zzgqm.zzaT(zzfex.class, zzfex);
    }

    private zzfex() {
    }

    public static zzfeu zzc() {
        return (zzfeu) zzb.zzaA();
    }

    static /* synthetic */ void zzf(zzfex zzfex, zzfew zzfew) {
        zzfew.getClass();
        zzgqv zzgqv = zzfex.zzd;
        if (!zzgqv.zzc()) {
            zzfex.zzd = zzgqm.zzaN(zzgqv);
        }
        zzfex.zzd.add(zzfew);
    }

    public final int zza() {
        return this.zzd.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfew.class});
        } else if (i11 == 3) {
            return new zzfex();
        } else {
            if (i11 == 4) {
                return new zzfeu((zzfet) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
