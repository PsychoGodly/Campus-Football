package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzuy extends zzajc<zzuy, zzb> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzuy zzc;
    private static volatile zzakw<zzuy> zzd;
    private String zze = MaxReward.DEFAULT_LABEL;
    private zzahp zzf = zzahp.zza;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuy$zzb */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zzb extends zzajc.zza<zzuy, zzb> implements zzakp {
        private zzb() {
            super(zzuy.zzc);
        }

        public final zzb zza(zza zza) {
            zzi();
            ((zzuy) this.zza).zza(zza);
            return this;
        }

        /* synthetic */ zzb(zzux zzux) {
            this();
        }

        public final zzb zza(String str) {
            zzi();
            ((zzuy) this.zza).zza(str);
            return this;
        }

        public final zzb zza(zzahp zzahp) {
            zzi();
            ((zzuy) this.zza).zza(zzahp);
            return this;
        }
    }

    static {
        zzuy zzuy = new zzuy();
        zzc = zzuy;
        zzajc.zza(zzuy.class, zzuy);
    }

    private zzuy() {
    }

    public static zzb zza() {
        return (zzb) zzc.zzm();
    }

    public static zzuy zzd() {
        return zzc;
    }

    public final zza zzb() {
        zza zza2 = zza.zza(this.zzg);
        return zza2 == null ? zza.UNRECOGNIZED : zza2;
    }

    public final zzahp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuy>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuy> zzakw;
        switch (zzux.zza[i10 - 1]) {
            case 1:
                return new zzuy();
            case 2:
                return new zzb((zzux) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuy> zzakw2 = zzd;
                zzakw<zzuy> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzuy.class) {
                        zzakw<zzuy> zzakw4 = zzd;
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuy$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public enum zza implements zzaje {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzajh<zza> zzg = null;
        private final int zzi;

        static {
            zzg = new zzva();
        }

        private zza(int i10) {
            this.zzi = i10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(zza.class.getName());
            sb2.append('@');
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb2.append(" number=");
                sb2.append(zza());
            }
            sb2.append(" name=");
            sb2.append(name());
            sb2.append('>');
            return sb2.toString();
        }

        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzi;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zza zza(int i10) {
            if (i10 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i10 == 1) {
                return SYMMETRIC;
            }
            if (i10 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i10 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i10 != 4) {
                return null;
            }
            return REMOTE;
        }
    }

    /* access modifiers changed from: private */
    public final void zza(zza zza2) {
        this.zzg = zza2.zza();
    }

    /* access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void zza(zzahp zzahp) {
        zzahp.getClass();
        this.zzf = zzahp;
    }
}
