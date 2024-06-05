package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvo extends zzajc<zzvo, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvo zzc;
    private static volatile zzakw<zzvo> zzd;
    private int zze;
    private int zzf;
    private zzvr zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvo$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvo, zza> implements zzakp {
        private zza() {
            super(zzvo.zzc);
        }

        public final zza zza(zzvr zzvr) {
            zzi();
            ((zzvo) this.zza).zza(zzvr);
            return this;
        }

        /* synthetic */ zza(zzvp zzvp) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzvo) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzvo zzvo = new zzvo();
        zzc = zzvo;
        zzajc.zza(zzvo.class, zzvo);
    }

    private zzvo() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvr zzd() {
        zzvr zzvr = this.zzg;
        return zzvr == null ? zzvr.zzd() : zzvr;
    }

    public static zzvo zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzvo) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvo>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvo> zzakw;
        switch (zzvp.zza[i10 - 1]) {
            case 1:
                return new zzvo();
            case 2:
                return new zza((zzvp) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvo> zzakw2 = zzd;
                zzakw<zzvo> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvo.class) {
                        zzakw<zzvo> zzakw4 = zzd;
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
    public final void zza(zzvr zzvr) {
        zzvr.getClass();
        this.zzg = zzvr;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
