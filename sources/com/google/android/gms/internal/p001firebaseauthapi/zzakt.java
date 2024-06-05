package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzakt<T> implements zzalf<T> {
    private final zzakn zza;
    private final zzame<?, ?> zzb;
    private final boolean zzc;
    private final zzaiq<?> zzd;

    private zzakt(zzame<?, ?> zzame, zzaiq<?> zzaiq, zzakn zzakn) {
        this.zzb = zzame;
        this.zzc = zzaiq.zza(zzakn);
        this.zzd = zzaiq;
        this.zza = zzakn;
    }

    public final int zza(T t10) {
        zzame<?, ?> zzame = this.zzb;
        int zzb2 = zzame.zzb(zzame.zzd(t10)) + 0;
        return this.zzc ? zzb2 + this.zzd.zza((Object) t10).zza() : zzb2;
    }

    public final int zzb(T t10) {
        int hashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza((Object) t10).hashCode() : hashCode;
    }

    public final void zzc(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    public final boolean zzd(T t10) {
        return this.zzd.zza((Object) t10).zzg();
    }

    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza((Object) t10).equals(this.zzd.zza((Object) t11));
        }
        return true;
    }

    static <T> zzakt<T> zza(zzame<?, ?> zzame, zzaiq<?> zzaiq, zzakn zzakn) {
        return new zzakt<>(zzame, zzaiq, zzakn);
    }

    public final T zza() {
        zzakn zzakn = this.zza;
        if (zzakn instanceof zzajc) {
            return ((zzajc) zzakn).zzo();
        }
        return zzakn.zzq().zzg();
    }

    public final void zza(T t10, T t11) {
        zzalh.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzalh.zza(this.zzd, t10, t11);
        }
    }

    public final void zza(T t10, zzalc zzalc, zzaio zzaio) throws IOException {
        boolean z10;
        zzame<?, ?> zzame = this.zzb;
        zzaiq<?> zzaiq = this.zzd;
        Object zzc2 = zzame.zzc(t10);
        zzaiv<?> zzb2 = zzaiq.zzb(t10);
        do {
            try {
                if (zzalc.zzc() == Integer.MAX_VALUE) {
                    zzame.zzb((Object) t10, zzc2);
                    return;
                }
                int zzd2 = zzalc.zzd();
                if (zzd2 == 11) {
                    int i10 = 0;
                    Object obj = null;
                    zzahp zzahp = null;
                    while (zzalc.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzalc.zzd();
                        if (zzd3 == 16) {
                            i10 = zzalc.zzj();
                            obj = zzaiq.zza(zzaio, this.zza, i10);
                        } else if (zzd3 == 26) {
                            if (obj != null) {
                                zzaiq.zza(zzalc, obj, zzaio, zzb2);
                            } else {
                                zzahp = zzalc.zzp();
                            }
                        } else if (!zzalc.zzt()) {
                            break;
                        }
                    }
                    if (zzalc.zzd() != 12) {
                        throw zzaji.zzb();
                    } else if (zzahp != null) {
                        if (obj != null) {
                            zzaiq.zza(zzahp, obj, zzaio, zzb2);
                        } else {
                            zzame.zza(zzc2, i10, zzahp);
                        }
                    }
                } else if ((zzd2 & 7) == 2) {
                    Object zza2 = zzaiq.zza(zzaio, this.zza, zzd2 >>> 3);
                    if (zza2 != null) {
                        zzaiq.zza(zzalc, zza2, zzaio, zzb2);
                    } else {
                        z10 = zzame.zza(zzc2, zzalc);
                        continue;
                    }
                } else {
                    z10 = zzalc.zzt();
                    continue;
                }
                z10 = true;
                continue;
            } finally {
                zzame.zzb((Object) t10, zzc2);
            }
        } while (z10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.firebase-auth-api.zzajc$zzd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p001firebaseauthapi.zzahk r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzajc r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzajc) r0
            com.google.android.gms.internal.firebase-auth-api.zzamd r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzamd r2 = com.google.android.gms.internal.p001firebaseauthapi.zzamd.zzc()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.firebase-auth-api.zzamd r1 = com.google.android.gms.internal.p001firebaseauthapi.zzamd.zzd()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.firebase-auth-api.zzajc$zzb r10 = (com.google.android.gms.internal.p001firebaseauthapi.zzajc.zzb) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaio r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzakn r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzajc$zzd r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzajc.zzd) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.p001firebaseauthapi.zzamd) r6, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.p001firebaseauthapi.zzalb.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r2, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzahp r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzahp) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.p001firebaseauthapi.zzalb.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzaiq<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzaio r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzakn r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzajc$zzd r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzajc.zzd) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.p001firebaseauthapi.zzahl.zza((int) r5, (byte[]) r11, (int) r4, (int) r13, (com.google.android.gms.internal.p001firebaseauthapi.zzahk) r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza((int) r12, (java.lang.Object) r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.firebase-auth-api.zzaji r10 = com.google.android.gms.internal.p001firebaseauthapi.zzaji.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzakt.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzahk):void");
    }

    public final void zza(T t10, zzana zzana) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd2 = this.zzd.zza((Object) t10).zzd();
        while (zzd2.hasNext()) {
            Map.Entry next = zzd2.next();
            zzaix zzaix = (zzaix) next.getKey();
            if (zzaix.zzc() != zzanb.MESSAGE || zzaix.zze() || zzaix.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzajm) {
                zzana.zza(zzaix.zza(), (Object) ((zzajm) next).zza().zzc());
            } else {
                zzana.zza(zzaix.zza(), next.getValue());
            }
        }
        zzame<?, ?> zzame = this.zzb;
        zzame.zza(zzame.zzd(t10), zzana);
    }
}
