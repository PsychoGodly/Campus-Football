package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzsr extends zzajc<zzsr, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzsr zzc;
    private static volatile zzakw<zzsr> zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsr$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzsr, zza> implements zzakp {
        private zza() {
            super(zzsr.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsr) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzss zzss) {
            this();
        }
    }

    static {
        zzsr zzsr = new zzsr();
        zzc = zzsr;
        zzajc.zza(zzsr.class, zzsr);
    }

    private zzsr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzsr zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzsr>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzsr> zzakw;
        switch (zzss.zza[i10 - 1]) {
            case 1:
                return new zzsr();
            case 2:
                return new zza((zzss) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzsr> zzakw2 = zzd;
                zzakw<zzsr> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzsr.class) {
                        zzakw<zzsr> zzakw4 = zzd;
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
