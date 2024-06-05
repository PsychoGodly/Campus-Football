package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztm extends zzajc<zztm, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztm zzc;
    private static volatile zzakw<zztm> zzd;
    private int zze;
    private zzvb zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztm$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztm, zza> implements zzakp {
        private zza() {
            super(zztm.zzc);
        }

        public final zza zza(zzvb zzvb) {
            zzi();
            ((zztm) this.zza).zza(zzvb);
            return this;
        }

        /* synthetic */ zza(zztl zztl) {
            this();
        }
    }

    static {
        zztm zztm = new zztm();
        zzc = zztm;
        zzajc.zza(zztm.class, zztm);
    }

    private zztm() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zztm zzc() {
        return zzc;
    }

    public final zzvb zzd() {
        zzvb zzvb = this.zzf;
        return zzvb == null ? zzvb.zzc() : zzvb;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztm>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztm> zzakw;
        switch (zztl.zza[i10 - 1]) {
            case 1:
                return new zztm();
            case 2:
                return new zza((zztl) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztm> zzakw2 = zzd;
                zzakw<zztm> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztm.class) {
                        zzakw<zztm> zzakw4 = zzd;
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
    public final void zza(zzvb zzvb) {
        zzvb.getClass();
        this.zzf = zzvb;
        this.zze |= 1;
    }
}
