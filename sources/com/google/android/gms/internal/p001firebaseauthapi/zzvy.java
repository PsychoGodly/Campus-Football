package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvy extends zzajc<zzvy, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvy zzc;
    private static volatile zzakw<zzvy> zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvy, zza> implements zzakp {
        private zza() {
            super(zzvy.zzc);
        }

        /* synthetic */ zza(zzvz zzvz) {
            this();
        }
    }

    static {
        zzvy zzvy = new zzvy();
        zzc = zzvy;
        zzajc.zza(zzvy.class, zzvy);
    }

    private zzvy() {
    }

    public static zzvy zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzvy zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzvy) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvy>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvy> zzakw;
        switch (zzvz.zza[i10 - 1]) {
            case 1:
                return new zzvy();
            case 2:
                return new zza((zzvz) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvy> zzakw2 = zzd;
                zzakw<zzvy> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvy.class) {
                        zzakw<zzvy> zzakw4 = zzd;
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
}
