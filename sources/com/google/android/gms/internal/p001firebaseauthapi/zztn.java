package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zztn extends zzajc<zztn, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zztn zzc;
    private static volatile zzakw<zztn> zzd;
    private int zze;
    private zztq zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztn$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zztn, zza> implements zzakp {
        private zza() {
            super(zztn.zzc);
        }

        public final zza zza(zztq zztq) {
            zzi();
            ((zztn) this.zza).zza(zztq);
            return this;
        }

        /* synthetic */ zza(zzto zzto) {
            this();
        }
    }

    static {
        zztn zztn = new zztn();
        zzc = zztn;
        zzajc.zza(zztn.class, zztn);
    }

    private zztn() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zztq zzc() {
        zztq zztq = this.zzf;
        return zztq == null ? zztq.zze() : zztq;
    }

    public static zztn zza(zzahp zzahp, zzaio zzaio) throws zzaji {
        return (zztn) zzajc.zza(zzc, zzahp, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzajc$zzc, com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zztn>] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zztn> zzakw;
        switch (zzto.zza[i10 - 1]) {
            case 1:
                return new zztn();
            case 2:
                return new zza((zzto) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakw<zztn> zzakw2 = zzd;
                zzakw<zztn> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zztn.class) {
                        zzakw<zztn> zzakw4 = zzd;
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
    public final void zza(zztq zztq) {
        zztq.getClass();
        this.zzf = zztq;
        this.zze |= 1;
    }
}
