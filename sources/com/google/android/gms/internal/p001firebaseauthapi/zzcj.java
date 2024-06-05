package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzvg;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzcj<P> {
    private final Class<P> zza;
    private ConcurrentMap<zzck, List<zzcl<P>>> zzb;
    private final List<zzcl<P>> zzc;
    private zzcl<P> zzd;
    private zzrn zze;

    private zzcj(Class<P> cls) {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zzrn.zza;
    }

    public final zzcj<P> zza(P p10, P p11, zzvg.zzb zzb2) throws GeneralSecurityException {
        return zza(p10, p11, zzb2, false);
    }

    public final zzcj<P> zzb(P p10, P p11, zzvg.zzb zzb2) throws GeneralSecurityException {
        return zza(p10, p11, zzb2, true);
    }

    private final zzcj<P> zza(P p10, P p11, zzvg.zzb zzb2, boolean z10) throws GeneralSecurityException {
        byte[] bArr;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (p10 == null && p11 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        } else if (zzb2.zzc() == zzuz.ENABLED) {
            Integer valueOf = Integer.valueOf(zzb2.zza());
            if (zzb2.zzf() == zzvs.RAW) {
                valueOf = null;
            }
            zzbt zza2 = zznu.zza().zza(zzos.zza(zzb2.zzb().zzf(), zzb2.zzb().zze(), zzb2.zzb().zzb(), zzb2.zzf(), valueOf), zzcs.zza());
            int i10 = zzbm.zza[zzb2.zzf().ordinal()];
            if (i10 == 1 || i10 == 2) {
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzb2.zza()).array();
            } else if (i10 == 3) {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzb2.zza()).array();
            } else if (i10 == 4) {
                bArr = zzbn.zza;
            } else {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzcl zzcl = new zzcl(p10, p11, bArr, zzb2.zzc(), zzb2.zzf(), zzb2.zza(), zzb2.zzb().zzf(), zza2);
            ConcurrentMap<zzck, List<zzcl<P>>> concurrentMap = this.zzb;
            List<zzcl<P>> list = this.zzc;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzcl);
            zzck zzck = new zzck(zzcl.zzh());
            List list2 = (List) concurrentMap.put(zzck, Collections.unmodifiableList(arrayList));
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list2);
                arrayList2.add(zzcl);
                concurrentMap.put(zzck, Collections.unmodifiableList(arrayList2));
            }
            list.add(zzcl);
            if (z10) {
                if (this.zzd == null) {
                    this.zzd = zzcl;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public final zzcj<P> zza(zzrn zzrn) {
        if (this.zzb != null) {
            this.zze = zzrn;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzcg<P> zza() throws GeneralSecurityException {
        ConcurrentMap<zzck, List<zzcl<P>>> concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzcg zzcg = new zzcg(concurrentMap, this.zzc, this.zzd, this.zze, this.zza);
            this.zzb = null;
            return zzcg;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
