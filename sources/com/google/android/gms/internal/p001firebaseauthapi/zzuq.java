package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzuq extends zzajc<zzuq, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzuq zzc;
    private static volatile zzakw<zzuq> zzd;
    private int zze;
    private zzur zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuq$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzuq, zza> implements zzakp {
        private zza() {
            super(zzuq.zzc);
        }

        public final zza zza(zzur zzur) {
            zzi();
            ((zzuq) this.zza).zza(zzur);
            return this;
        }

        /* synthetic */ zza(zzup zzup) {
            this();
        }
    }

    static {
        zzuq zzuq = new zzuq();
        zzc = zzuq;
        zzajc.zza(zzuq.class, zzuq);
    }

    private zzuq() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzur zzc() {
        zzur zzur = this.zzf;
        return zzur == null ? zzur.zzf() : zzur;
    }

    public static zzuq zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zzuq) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzuq>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzuq> zzakw;
        switch (zzup.zza[i10 - 1]) {
            case 1:
                return new zzuq();
            case 2:
                return new zza((zzup) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzuq> zzakw2 = zzd;
                zzakw<zzuq> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzuq.class) {
                        zzakw<zzuq> zzakw4 = zzd;
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
    public final void zza(zzur zzur) {
        zzur.getClass();
        this.zzf = zzur;
        this.zze |= 1;
    }
}
