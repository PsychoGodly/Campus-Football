package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzvk extends zzajc<zzvk, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzvk zzc;
    private static volatile zzakw<zzvk> zzd;
    private int zze;
    private int zzf;
    private zzvn zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvk$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzvk, zza> implements zzakp {
        private zza() {
            super(zzvk.zzc);
        }

        public final zza zza(zzvn zzvn) {
            zzi();
            ((zzvk) this.zza).zza(zzvn);
            return this;
        }

        /* synthetic */ zza(zzvl zzvl) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzvk) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzvk zzvk = new zzvk();
        zzc = zzvk;
        zzajc.zza(zzvk.class, zzvk);
    }

    private zzvk() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvn zzd() {
        zzvn zzvn = this.zzg;
        return zzvn == null ? zzvn.zzc() : zzvn;
    }

    public static zzvk zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzvk) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzvk>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzvk> zzakw;
        switch (zzvl.zza[i10 - 1]) {
            case 1:
                return new zzvk();
            case 2:
                return new zza((zzvl) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzvk> zzakw2 = zzd;
                zzakw<zzvk> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzvk.class) {
                        zzakw<zzvk> zzakw4 = zzd;
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
    public final void zza(zzvn zzvn) {
        zzvn.getClass();
        this.zzg = zzvn;
        this.zze |= 1;
    }

    /* access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}
