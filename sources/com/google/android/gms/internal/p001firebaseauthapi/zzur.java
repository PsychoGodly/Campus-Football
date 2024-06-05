package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzur  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzur extends zzajc<zzur, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzur zzc;
    private static volatile zzakw<zzur> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzur$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzur, zza> implements zzakp {
        private zza() {
            super(zzur.zzc);
        }

        public final zza zza(zzuk zzuk) {
            zzi();
            ((zzur) this.zza).zza(zzuk);
            return this;
        }

        /* synthetic */ zza(zzus zzus) {
            this();
        }

        public final zza zza(zzum zzum) {
            zzi();
            ((zzur) this.zza).zza(zzum);
            return this;
        }

        public final zza zza(zzuo zzuo) {
            zzi();
            ((zzur) this.zza).zza(zzuo);
            return this;
        }
    }

    static {
        zzur zzur = new zzur();
        zzc = zzur;
        zzajc.zza(zzur.class, zzur);
    }

    private zzur() {
    }

    public static zza zzd() {
        return (zza) zzc.zzm();
    }

    public static zzur zzf() {
        return zzc;
    }

    public final zzuk zza() {
        zzuk zza2 = zzuk.zza(this.zzg);
        return zza2 == null ? zzuk.UNRECOGNIZED : zza2;
    }

    public final zzum zzb() {
        zzum zza2 = zzum.zza(this.zzf);
        return zza2 == null ? zzum.UNRECOGNIZED : zza2;
    }

    public final zzuo zzc() {
        zzuo zza2 = zzuo.zza(this.zze);
        return zza2 == null ? zzuo.UNRECOGNIZED : zza2;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzur>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzur> zzakw;
        switch (zzus.zza[i10 - 1]) {
            case 1:
                return new zzur();
            case 2:
                return new zza((zzus) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzur> zzakw2 = zzd;
                zzakw<zzur> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzur.class) {
                        zzakw<zzur> zzakw4 = zzd;
                        zzakw = zzakw4;
                        if (zzakw4 == null) {
                            ? zzc2 = new zzajc.zzc(zzc);
                            zzd = zzc2;
                            zzakw = zzc2;
                        }
                    }
                    zzakw3 = zzakw;
                }
                return zzakw3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: private */
    public final void zza(zzuk zzuk) {
        this.zzg = zzuk.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(zzum zzum) {
        this.zzf = zzum.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(zzuo zzuo) {
        this.zze = zzuo.zza();
    }
}
