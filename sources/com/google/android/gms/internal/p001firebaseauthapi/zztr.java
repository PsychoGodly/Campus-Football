package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztr extends zzajc<zztr, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztr zzc;
    private static volatile zzakw<zztr> zzd;
    private int zze;
    private int zzf;
    private zztu zzg;
    private zzahp zzh = zzahp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztr$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztr, zza> implements zzakp {
        private zza() {
            super(zztr.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zztr) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zzts zzts) {
            this();
        }

        public final zza zza(zztu zztu) {
            zzi();
            ((zztr) this.zza).zza(zztu);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zztr) this.zza).zza(0);
            return this;
        }
    }

    static {
        zztr zztr = new zztr();
        zzc = zztr;
        zzajc.zza(zztr.class, zztr);
    }

    private zztr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztu zzd() {
        zztu zztu = this.zzg;
        return zztu == null ? zztu.zze() : zztu;
    }

    public final zzahp zze() {
        return this.zzh;
    }

    public static zztr zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zztr) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztr>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztr> zzakw;
        switch (zzts.zza[i10 - 1]) {
            case 1:
                return new zztr();
            case 2:
                return new zza((zzts) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztr> zzakw2 = zzd;
                zzakw<zztr> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztr.class) {
                        zzakw<zztr> zzakw4 = zzd;
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
    public final void zza(zztu zztu) {
        zztu.getClass();
        this.zzg = zztu;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
