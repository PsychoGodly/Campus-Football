package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzrw extends zzajc<zzrw, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzrw zzc;
    private static volatile zzakw<zzrw> zzd;
    private int zze;
    private int zzf;
    private zzahp zzg = zzahp.zza;
    private zzsb zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrw$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzrw, zza> implements zzakp {
        private zza() {
            super(zzrw.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzrw) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzry zzry) {
            this();
        }

        public final zza zza(zzsb zzsb) {
            zzi();
            ((zzrw) this.zza).zza(zzsb);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zzrw) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzrw zzrw = new zzrw();
        zzc = zzrw;
        zzajc.zza(zzrw.class, zzrw);
    }

    private zzrw() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsb zzd() {
        zzsb zzsb = this.zzh;
        return zzsb == null ? zzsb.zzd() : zzsb;
    }

    public final zzahp zze() {
        return this.zzg;
    }

    public static zzrw zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzrw) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzrw>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzrw> zzakw;
        switch (zzry.zza[i10 - 1]) {
            case 1:
                return new zzrw();
            case 2:
                return new zza((zzry) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzrw> zzakw2 = zzd;
                zzakw<zzrw> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzrw.class) {
                        zzakw<zzrw> zzakw4 = zzd;
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
    public final void zza(zzahp zzahp) {
        zzahp.getClass();
        this.zzg = zzahp;
    }

    /* access modifiers changed from: private */
    public final void zza(zzsb zzsb) {
        zzsb.getClass();
        this.zzh = zzsb;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = 0;
    }
}
