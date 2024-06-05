package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzajc;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzua  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzua extends zzajc<zzua, zza> implements zzakp {
    /* access modifiers changed from: private */
    public static final zzua zzc;
    private static volatile zzakw<zzua> zzd;
    private int zze;
    private zzahp zzf = zzahp.zza;
    private zzvj zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzua$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza extends zzajc.zza<zzua, zza> implements zzakp {
        private zza() {
            super(zzua.zzc);
        }

        public final zza zza(zzahp zzahp) {
            zzi();
            ((zzua) this.zza).zza(zzahp);
            return this;
        }

        /* synthetic */ zza(zztz zztz) {
            this();
        }

        public final zza zza(zzvj zzvj) {
            zzi();
            ((zzua) this.zza).zza(zzvj);
            return this;
        }
    }

    static {
        zzua zzua = new zzua();
        zzc = zzua;
        zzajc.zza(zzua.class, zzua);
    }

    private zzua() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzahp zzc() {
        return this.zzf;
    }

    public static zzua zza(InputStream inputStream, zzaio zzaio) throws IOException {
        return (zzua) zzajc.zza(zzc, inputStream, zzaio);
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.firebase-auth-api.zzakw<com.google.android.gms.internal.firebase-auth-api.zzua>, com.google.android.gms.internal.firebase-auth-api.zzajc$zzc] */
    /* access modifiers changed from: protected */
    public final Object zza(int i10, Object obj, Object obj2) {
        zzakw<zzua> zzakw;
        switch (zztz.zza[i10 - 1]) {
            case 1:
                return new zzua();
            case 2:
                return new zza((zztz) null);
            case 3:
                return zzajc.zza((zzakn) zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakw<zzua> zzakw2 = zzd;
                zzakw<zzua> zzakw3 = zzakw2;
                if (zzakw2 == null) {
                    synchronized (zzua.class) {
                        zzakw<zzua> zzakw4 = zzd;
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
    public final void zza(zzahp zzahp) {
        zzahp.getClass();
        this.zzf = zzahp;
    }

    /* access modifiers changed from: private */
    public final void zza(zzvj zzvj) {
        zzvj.getClass();
        this.zzg = zzvj;
        this.zze |= 1;
    }
}
