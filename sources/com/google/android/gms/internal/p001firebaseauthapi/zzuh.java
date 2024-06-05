package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzuh extends zzajc<zzuh, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzuh zzc;
    private static volatile zzakw<zzuh> zzd;
    private int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzuh, zza> implements zzakp {
        private zza() {
            super(zzuh.zzc);
        }

        public final zza zza(zzub zzub) {
            zzi();
            ((zzuh) this.zza).zza(zzub);
            return this;
        }

        /* synthetic */ zza(zzui zzui) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzuh) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzuh zzuh = new zzuh();
        zzc = zzuh;
        zzajc.zza(zzuh.class, zzuh);
    }

    private zzuh() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzuh zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzub zzb() {
        zzub zza2 = zzub.zza(this.zze);
        return zza2 == null ? zzub.UNRECOGNIZED : zza2;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuh>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuh> zzakw;
        switch (zzui.zza[i10 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza((zzui) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuh> zzakw2 = zzd;
                zzakw<zzuh> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzuh.class) {
                        zzakw<zzuh> zzakw4 = zzd;
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
    public final void zza(zzub zzub) {
        this.zze = zzub.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
