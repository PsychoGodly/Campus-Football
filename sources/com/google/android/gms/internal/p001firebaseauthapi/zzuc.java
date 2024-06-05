package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzuc extends zzajc<zzuc, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzuc zzc;
    private static volatile zzakw<zzuc> zzd;
    private int zze;
    private int zzf;
    private zzuh zzg;
    private zzahp zzh = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuc$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzuc, zza> implements zzakp {
        private zza() {
            super(zzuc.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzuc) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzue zzue) {
            this();
        }

        public final zza zza(zzuh zzuh) {
            zzi();
            ((zzuc) this.zza).zza(zzuh);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zzuc) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzuc zzuc = new zzuc();
        zzc = zzuc;
        zzajc.zza(zzuc.class, zzuc);
    }

    private zzuc() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzuc zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzuh zze() {
        zzuh zzuh = this.zzg;
        return zzuh == null ? zzuh.zze() : zzuh;
    }

    public final zzahp zzf() {
        return this.zzh;
    }

    public static zzuc zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzuc) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuc>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuc> zzakw;
        switch (zzue.zza[i10 - 1]) {
            case 1:
                return new zzuc();
            case 2:
                return new zza((zzue) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuc> zzakw2 = zzd;
                zzakw<zzuc> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzuc.class) {
                        zzakw<zzuc> zzakw4 = zzd;
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
        this.zzh = zzahp;
    }

    /* access modifiers changed from: private */
    public final void zza(zzuh zzuh) {
        zzuh.getClass();
        this.zzg = zzuh;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
