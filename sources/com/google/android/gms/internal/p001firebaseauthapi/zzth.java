package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzth  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzth extends zzajc<zzth, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzth zzc;
    private static volatile zzakw<zzth> zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzth$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzth, zza> implements zzakp {
        private zza() {
            super(zzth.zzc);
        }

        /* synthetic */ zza(zzti zzti) {
            this();
        }
    }

    static {
        zzth zzth = new zzth();
        zzc = zzth;
        zzajc.zza(zzth.class, zzth);
    }

    private zzth() {
    }

    public static zzth zzb() {
        return zzc;
    }

    public static zzth zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzth) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzth>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzth> zzakw;
        switch (zzti.zza[i10 - 1]) {
            case 1:
                return new zzth();
            case 2:
                return new zza((zzti) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzakw<zzth> zzakw2 = zzd;
                zzakw<zzth> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzth.class) {
                        zzakw<zzth> zzakw4 = zzd;
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
