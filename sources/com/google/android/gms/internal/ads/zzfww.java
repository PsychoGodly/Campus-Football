package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfww {
    private final Class zza;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzfwx zzc;
    private zzggl zzd;

    /* synthetic */ zzfww(Class cls, zzfwv zzfwv) {
        this.zza = cls;
        this.zzd = zzggl.zza;
    }

    private final zzfww zze(Object obj, Object obj2, zzglk zzglk, boolean z10) throws GeneralSecurityException {
        byte[] bArr;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        } else if (zzglk.zzk() == 3) {
            ConcurrentMap concurrentMap = this.zzb;
            Integer valueOf = Integer.valueOf(zzglk.zza());
            if (zzglk.zzf() == zzgme.RAW) {
                valueOf = null;
            }
            zzfvx zza2 = zzgdf.zzb().zza(zzgdz.zza(zzglk.zzc().zzg(), zzglk.zzc().zzf(), zzglk.zzc().zzc(), zzglk.zzf(), valueOf), zzfxg.zza());
            int ordinal = zzglk.zzf().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = zzfvt.zza;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzglk.zza()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzglk.zza()).array();
            }
            zzfwx zzfwx = new zzfwx(obj, obj2, bArr, zzglk.zzk(), zzglk.zzf(), zzglk.zza(), zzglk.zzc().zzg(), zza2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzfwx);
            zzfwz zzfwz = new zzfwz(zzfwx.zzg(), (zzfwy) null);
            List list = (List) concurrentMap.put(zzfwz, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzfwx);
                concurrentMap.put(zzfwz, Collections.unmodifiableList(arrayList2));
            }
            if (z10) {
                if (this.zzc == null) {
                    this.zzc = zzfwx;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public final zzfww zza(Object obj, Object obj2, zzglk zzglk) throws GeneralSecurityException {
        zze(obj, obj2, zzglk, false);
        return this;
    }

    public final zzfww zzb(Object obj, Object obj2, zzglk zzglk) throws GeneralSecurityException {
        zze(obj, obj2, zzglk, true);
        return this;
    }

    public final zzfww zzc(zzggl zzggl) {
        if (this.zzb != null) {
            this.zzd = zzggl;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzfxb zzd() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzfxb zzfxb = new zzfxb(concurrentMap, this.zzc, this.zzd, this.zza, (zzfxa) null);
            this.zzb = null;
            return zzfxb;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
