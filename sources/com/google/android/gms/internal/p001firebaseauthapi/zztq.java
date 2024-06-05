package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztq extends zzajc<zztq, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztq zzc;
    private static volatile zzakw<zztq> zzd;
    private int zze;
    private zztv zzf;
    private zztm zzg;
    private int zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztq$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztq, zza> implements zzakp {
        private zza() {
            super(zztq.zzc);
        }

        public final zza zza(zztm zztm) {
            zzi();
            ((zztq) this.zza).zza(zztm);
            return this;
        }

        /* synthetic */ zza(zztp zztp) {
            this();
        }

        public final zza zza(zztk zztk) {
            zzi();
            ((zztq) this.zza).zza(zztk);
            return this;
        }

        public final zza zza(zztv zztv) {
            zzi();
            ((zztq) this.zza).zza(zztv);
            return this;
        }
    }

    static {
        zztq zztq = new zztq();
        zzc = zztq;
        zzajc.zza(zztq.class, zztq);
    }

    private zztq() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zztq zze() {
        return zzc;
    }

    public final zztk zza() {
        zztk zza2 = zztk.zza(this.zzh);
        return zza2 == null ? zztk.UNRECOGNIZED : zza2;
    }

    public final zztm zzb() {
        zztm zztm = this.zzg;
        return zztm == null ? zztm.zzc() : zztm;
    }

    public final zztv zzf() {
        zztv zztv = this.zzf;
        return zztv == null ? zztv.zzc() : zztv;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztq>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztq> zzakw;
        switch (zztp.zza[i10 - 1]) {
            case 1:
                return new zztq();
            case 2:
                return new zza((zztp) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztq> zzakw2 = zzd;
                zzakw<zztq> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztq.class) {
                        zzakw<zztq> zzakw4 = zzd;
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
    public final void zza(zztm zztm) {
        zztm.getClass();
        this.zzg = zztm;
        this.zze |= 2;
    }

    /* access modifiers changed from: private */
    public final void zza(zztk zztk) {
        this.zzh = zztk.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(zztv zztv) {
        zztv.getClass();
        this.zzf = zztv;
        this.zze |= 1;
    }
}
