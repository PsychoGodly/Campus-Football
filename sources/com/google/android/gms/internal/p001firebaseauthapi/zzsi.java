package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsi extends zzajc<zzsi, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsi zzc;
    private static volatile zzakw<zzsi> zzd;
    private int zze;
    private int zzf;
    private zzsm zzg;
    private zzahp zzh = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsi$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsi, zza> implements zzakp {
        private zza() {
            super(zzsi.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzsi) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzsh zzsh) {
            this();
        }

        public final zza zza(zzsm zzsm) {
            zzi();
            ((zzsi) this.zza).zza(zzsm);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsi) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzsi zzsi = new zzsi();
        zzc = zzsi;
        zzajc.zza(zzsi.class, zzsi);
    }

    private zzsi() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzsi zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsm zze() {
        zzsm zzsm = this.zzg;
        return zzsm == null ? zzsm.zzd() : zzsm;
    }

    public final zzahp zzf() {
        return this.zzh;
    }

    public static zzsi zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsi) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsi>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsi> zzakw;
        switch (zzsh.zza[i10 - 1]) {
            case 1:
                return new zzsi();
            case 2:
                return new zza((zzsh) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsi> zzakw2 = zzd;
                zzakw<zzsi> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsi.class) {
                        zzakw<zzsi> zzakw4 = zzd;
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
    public final void zza(zzsm zzsm) {
        zzsm.getClass();
        this.zzg = zzsm;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
