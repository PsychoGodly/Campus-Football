package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgis extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgis zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        zzgis zzgis = new zzgis();
        zzb = zzgis;
        zzgqm.zzaT(zzgis.class, zzgis);
    }

    private zzgis() {
    }

    public static zzgir zzc() {
        return (zzgir) zzb.zzaA();
    }

    public static zzgis zze(zzgpe zzgpe, zzgpy zzgpy) throws zzgqy {
        return (zzgis) zzgqm.zzaG(zzb, zzgpe, zzgpy);
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
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzgis();
        } else {
            if (i11 == 4) {
                return new zzgir((zzgiq) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
