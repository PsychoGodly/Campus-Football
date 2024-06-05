package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzug  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzug extends zzajc<zzug, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzug zzc;
    private static volatile zzakw<zzug> zzd;
    private int zze;
    private zzuh zzf;
    private int zzg;
    private int zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzug$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzug, zza> implements zzakp {
        private zza() {
            super(zzug.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzug) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzuf zzuf) {
            this();
        }

        public final zza zza(zzuh zzuh) {
            zzi();
            ((zzug) this.zza).zza(zzuh);
            return this;
        }
    }

    static {
        zzug zzug = new zzug();
        zzc = zzug;
        zzajc.zza(zzug.class, zzug);
    }

    private zzug() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzug zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzh;
    }

    public final zzuh zzf() {
        zzuh zzuh = this.zzf;
        return zzuh == null ? zzuh.zze() : zzuh;
    }

    public static zzug zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzug) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzug>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzug> zzakw;
        switch (zzuf.zza[i10 - 1]) {
            case 1:
                return new zzug();
            case 2:
                return new zza((zzuf) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzug> zzakw2 = zzd;
                zzakw<zzug> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzug.class) {
                        zzakw<zzug> zzakw4 = zzd;
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
    public final void zza(int i10) {
        this.zzg = i10;
    }

    /* access modifiers changed from: private */
    public final void zza(zzuh zzuh) {
        zzuh.getClass();
        this.zzf = zzuh;
        this.zze |= 1;
    }
}
