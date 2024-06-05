package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzghx extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzghx zzb;
    private zzgia zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzghx zzghx = new zzghx();
        zzb = zzghx;
        zzgqm.zzaT(zzghx.class, zzghx);
    }

    private zzghx() {
    }

    public static zzghw zzc() {
        return (zzghw) zzb.zzaA();
    }

    public static zzghx zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzghx) zzgqm.zzaG(zzb, zzgpe, zzgpy);
    }

    static /* synthetic */ void zzg(zzghx zzghx, zzgia zzgia) {
        zzgia.getClass();
        zzghx.zzd = zzgia;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzghx();
        } else {
            if (i11 == 4) {
                return new zzghw((zzghv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgia zzf() {
        zzgia zzgia = this.zzd;
        return zzgia == null ? zzgia.zze() : zzgia;
    }
}
