package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzse  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzse extends zzajc<zzse, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzse zzc;
    private static volatile zzakw<zzse> zzd;
    private int zze;
    private int zzf;
    private zzsi zzg;
    private zzuc zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzse$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzse, zza> implements zzakp {
        private zza() {
            super(zzse.zzc);
        }

        public final zza zza(zzsi zzsi) {
            zzi();
            ((zzse) this.zza).zza(zzsi);
            return this;
        }

        /* synthetic */ zza(zzsd zzsd) {
            this();
        }

        public final zza zza(zzuc zzuc) {
            zzi();
            ((zzse) this.zza).zza(zzuc);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zzse) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzse zzse = new zzse();
        zzc = zzse;
        zzajc.zza(zzse.class, zzse);
    }

    private zzse() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsi zzd() {
        zzsi zzsi = this.zzg;
        return zzsi == null ? zzsi.zzd() : zzsi;
    }

    public final zzuc zze() {
        zzuc zzuc = this.zzh;
        return zzuc == null ? zzuc.zzd() : zzuc;
    }

    public static zzse zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzse) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzse>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzse> zzakw;
        switch (zzsd.zza[i10 - 1]) {
            case 1:
                return new zzse();
            case 2:
                return new zza((zzsd) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzse> zzakw2 = zzd;
                zzakw<zzse> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzse.class) {
                        zzakw<zzse> zzakw4 = zzd;
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
    public final void zza(zzsi zzsi) {
        zzsi.getClass();
        this.zzg = zzsi;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(zzuc zzuc) {
        zzuc.getClass();
        this.zzh = zzuc;
        this.zze |= 2;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
