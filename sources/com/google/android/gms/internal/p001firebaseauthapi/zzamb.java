package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzamb extends zzajc<zzamb, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzamb zzc;
    private static volatile zzakw<zzamb> zzd;
    private long zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamb$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzamb, zza> implements zzakp {
        private zza() {
            super(zzamb.zzc);
        }

        public final zza zza(int i10) {
            if (!this.zza.zzu()) {
                zzj();
            }
            ((zzamb) this.zza).zza(i10);
            return this;
        }

        /* synthetic */ zza(zzama zzama) {
            this();
        }

        public final zza zza(long j10) {
            if (!this.zza.zzu()) {
                zzj();
            }
            ((zzamb) this.zza).zza(j10);
            return this;
        }
    }

    static {
        zzamb zzamb = new zzamb();
        zzc = zzamb;
        zzajc.zza(zzamb.class, zzamb);
    }

    private zzamb() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzamb>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzamb> zzakw;
        switch (zzama.zza[i10 - 1]) {
            case 1:
                return new zzamb();
            case 2:
                return new zza((zzama) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzamb> zzakw2 = zzd;
                zzakw<zzamb> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzamb.class) {
                        zzakw<zzamb> zzakw4 = zzd;
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
        this.zzf = i10;
    }

    /* access modifiers changed from: private */
    public final void zza(long j10) {
        this.zze = j10;
    }
}
