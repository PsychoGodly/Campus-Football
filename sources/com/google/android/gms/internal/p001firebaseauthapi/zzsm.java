package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsm extends zzajc<zzsm, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsm zzc;
    private static volatile zzakw<zzsm> zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsm$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsm, zza> implements zzakp {
        private zza() {
            super(zzsm.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsm) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzsl zzsl) {
            this();
        }
    }

    static {
        zzsm zzsm = new zzsm();
        zzc = zzsm;
        zzajc.zza(zzsm.class, zzsm);
    }

    private zzsm() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzsm zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsm>] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsm> zzakw;
        switch (zzsl.zza[i10 - 1]) {
            case 1:
                return new zzsm();
            case 2:
                return new zza((zzsl) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsm> zzakw2 = zzd;
                zzakw<zzsm> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsm.class) {
                        zzakw<zzsm> zzakw4 = zzd;
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
        this.zze = i10;
    }
}
