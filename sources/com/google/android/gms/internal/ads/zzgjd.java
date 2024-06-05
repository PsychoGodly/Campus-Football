package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgjd extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgjd zzb;
    private zzgld zzd;

    static {
        zzgjd zzgjd = new zzgjd();
        zzb = zzgjd;
        zzgqm.zzaT(zzgjd.class, zzgjd);
    }

    private zzgjd() {
    }

    public static zzgjc zza() {
        return (zzgjc) zzb.zzaA();
    }

    public static zzgjd zzd() {
        return zzb;
    }

    static /* synthetic */ void zzf(zzgjd zzgjd, zzgld zzgld) {
        zzgld.getClass();
        zzgjd.zzd = zzgld;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        } else if (i11 == 3) {
            return new zzgjd();
        } else {
            if (i11 == 4) {
                return new zzgjc((zzgjb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgld zze() {
        zzgld zzgld = this.zzd;
        return zzgld == null ? zzgld.zzd() : zzgld;
    }
}
