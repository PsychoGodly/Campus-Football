package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import com.google.android.gms.internal.p001firebaseauthapi.zzvg;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzbx {
    private final zzvg zza;
    private final List<zzbz> zzb;
    private final zzrn zzc = zzrn.zza;

    private zzbx(zzvg zzvg, List<zzbz> list) {
        this.zza = zzvg;
        this.zzb = list;
    }

    static final zzbx zza(zzvg zzvg) throws GeneralSecurityException {
        zzc(zzvg);
        return new zzbx(zzvg, zzb(zzvg));
    }

    public final String toString() {
        return zzcx.zza(this.zza).toString();
    }

    /* access modifiers changed from: package-private */
    public final zzvg zzb() {
        return this.zza;
    }

    public final zzvj zzc() {
        return zzcx.zza(this.zza);
    }

    private static List<zzbz> zzb(zzvg zzvg) {
        zzbv zzbv;
        ArrayList arrayList = new ArrayList(zzvg.zza());
        for (zzvg.zzb next : zzvg.zze()) {
            int zza2 = next.zza();
            try {
                zzbt zza3 = zznu.zza().zza(zza(next), zzcs.zza());
                int i10 = zzbw.zza[next.zzc().ordinal()];
                if (i10 == 1) {
                    zzbv = zzbv.zza;
                } else if (i10 == 2) {
                    zzbv = zzbv.zzb;
                } else if (i10 == 3) {
                    zzbv = zzbv.zzc;
                } else {
                    throw new GeneralSecurityException("Unknown key status");
                }
                arrayList.add(new zzbz(zza3, zzbv, zza2, zza2 == zzvg.zzb()));
            } catch (GeneralSecurityException unused) {
                arrayList.add((Object) null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzc(zzvg zzvg) throws GeneralSecurityException {
        if (zzvg == null || zzvg.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final zzbx zza() throws GeneralSecurityException {
        if (this.zza != null) {
            zzvg.zza zzc2 = zzvg.zzc();
            for (zzvg.zzb next : this.zza.zze()) {
                zzuy zzb2 = next.zzb();
                if (zzb2.zzb() == zzuy.zza.ASYMMETRIC_PRIVATE) {
                    zzuy zza2 = zzct.zza(zzb2.zzf(), zzb2.zze());
                    zzct.zza(zza2);
                    zzc2.zza((zzvg.zzb) ((zzajc) ((zzvg.zzb.zza) next.zzn()).zza(zza2).zzf()));
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            zzc2.zza(this.zza.zzb());
            return zza((zzvg) ((zzajc) zzc2.zzf()));
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    public static final zzbx zza(zzca zzca, zzbg zzbg) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzua zza2 = zzca.zza();
        if (zza2 != null && zza2.zzc().zzb() != 0) {
            return zza(zza(zza2, zzbg, bArr));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static zzos zza(zzvg.zzb zzb2) {
        try {
            return zzos.zza(zzb2.zzb().zzf(), zzb2.zzb().zze(), zzb2.zzb().zzb(), zzb2.zzf(), zzb2.zzf() == zzvs.RAW ? null : Integer.valueOf(zzb2.zza()));
        } catch (GeneralSecurityException e10) {
            throw new zzpd("Creating a protokey serialization failed", e10);
        }
    }

    private static zzua zza(zzvg zzvg, zzbg zzbg, byte[] bArr) throws GeneralSecurityException {
        byte[] zzb2 = zzbg.zzb(zzvg.zzj(), bArr);
        try {
            if (zzvg.zza(zzbg.zza(zzb2, bArr), zzaio.zza()).equals(zzvg)) {
                return (zzua) ((zzajc) zzua.zza().zza(zzahp.zza(zzb2)).zza(zzcx.zza(zzvg)).zzf());
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzaji unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static zzvg zza(zzua zzua, zzbg zzbg, byte[] bArr) throws GeneralSecurityException {
        try {
            zzvg zza2 = zzvg.zza(zzbg.zza(zzua.zzc().zzg(), bArr), zzaio.zza());
            zzc(zza2);
            return zza2;
        } catch (zzaji unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static <B> B zza(zzmp zzmp, zzbt zzbt, Class<B> cls) throws GeneralSecurityException {
        try {
            return zzmp.zza(zzbt, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static <B> B zza(zzmp zzmp, zzvg.zzb zzb2, Class<B> cls) throws GeneralSecurityException {
        try {
            return zzmp.zza(zzb2.zzb(), cls);
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final <P> P zza(Class<P> cls) throws GeneralSecurityException {
        zzow zza2 = zzow.zza();
        if (zza2 instanceof zzmp) {
            Class<?> zza3 = zza2.zza(cls);
            if (zza3 != null) {
                zzcx.zzb(this.zza);
                zzcj zzcj = new zzcj(zza3);
                zzcj.zza(this.zzc);
                for (int i10 = 0; i10 < this.zza.zza(); i10++) {
                    zzvg.zzb zza4 = this.zza.zza(i10);
                    if (zza4.zzc().equals(zzuz.ENABLED)) {
                        Object zza5 = zza((zzmp) zza2, zza4, zza3);
                        Object zza6 = this.zzb.get(i10) != null ? zza((zzmp) zza2, this.zzb.get(i10).zza(), zza3) : null;
                        if (zza6 == null && zza5 == null) {
                            String valueOf = String.valueOf(zza3);
                            String zzf = zza4.zzb().zzf();
                            throw new GeneralSecurityException("Unable to get primitive " + valueOf + " for key of type " + zzf);
                        } else if (zza4.zza() == this.zza.zzb()) {
                            zzcj.zzb(zza6, zza5, zza4);
                        } else {
                            zzcj.zza(zza6, zza5, zza4);
                        }
                    }
                }
                return zza2.zza(zzcj.zza(), cls);
            }
            String name = cls.getName();
            throw new GeneralSecurityException("No wrapper found for " + name);
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    public final void zza(zzcd zzcd, zzbg zzbg) throws GeneralSecurityException, IOException {
        zzcd.zza(zza(this.zza, zzbg, new byte[0]));
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.p001firebaseauthapi.zzcd r5) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            r4 = this;
            com.google.android.gms.internal.firebase-auth-api.zzvg r0 = r4.zza
            java.util.List r0 = r0.zze()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.zzvg$zzb r1 = (com.google.android.gms.internal.p001firebaseauthapi.zzvg.zzb) r1
            com.google.android.gms.internal.firebase-auth-api.zzuy r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzuy$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzuy$zza r3 = com.google.android.gms.internal.p001firebaseauthapi.zzuy.zza.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzuy r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzuy$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzuy$zza r3 = com.google.android.gms.internal.p001firebaseauthapi.zzuy.zza.SYMMETRIC
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzuy r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzuy$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzuy$zza r3 = com.google.android.gms.internal.p001firebaseauthapi.zzuy.zza.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L_0x003b
            goto L_0x000a
        L_0x003b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            com.google.android.gms.internal.firebase-auth-api.zzuy r3 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzuy$zza r3 = r3.zzb()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.zzuy r1 = r1.zzb()
            java.lang.String r1 = r1.zzf()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L_0x0064:
            com.google.android.gms.internal.firebase-auth-api.zzvg r0 = r4.zza
            r5.zza((com.google.android.gms.internal.p001firebaseauthapi.zzvg) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzbx.zza(com.google.android.gms.internal.firebase-auth-api.zzcd):void");
    }
}
