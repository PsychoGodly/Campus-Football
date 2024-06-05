package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsj extends zzajc<zzsj, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsj zzc;
    private static volatile zzakw<zzsj> zzd;
    private int zze;
    private zzsm zzf;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsj$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsj, zza> implements zzakp {
        private zza() {
            super(zzsj.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsj) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzsk zzsk) {
            this();
        }

        public final zza zza(zzsm zzsm) {
            zzi();
            ((zzsj) this.zza).zza(zzsm);
            return this;
        }
    }

    static {
        zzsj zzsj = new zzsj();
        zzc = zzsj;
        zzajc.zza(zzsj.class, zzsj);
    }

    private zzsj() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzsj zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzsm zze() {
        zzsm zzsm = this.zzf;
        return zzsm == null ? zzsm.zzd() : zzsm;
    }

    public static zzsj zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzsj) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsj>] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsj> zzakw;
        switch (zzsk.zza[i10 - 1]) {
            case 1:
                return new zzsj();
            case 2:
                return new zza((zzsk) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsj> zzakw2 = zzd;
                zzakw<zzsj> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsj.class) {
                        zzakw<zzsj> zzakw4 = zzd;
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
    public final void zza(zzsm zzsm) {
        zzsm.getClass();
        this.zzf = zzsm;
        this.zze |= 1;
    }
}
