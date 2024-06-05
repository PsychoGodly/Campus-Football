package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgrr {
    zzgrr() {
    }

    public static final int zza(int i10, Object obj, Object obj2) {
        zzgrq zzgrq = (zzgrq) obj;
        zzgrp zzgrp = (zzgrp) obj2;
        if (zzgrq.isEmpty()) {
            return 0;
        }
        Iterator it = zzgrq.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgrq) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgrq zzgrq = (zzgrq) obj;
        zzgrq zzgrq2 = (zzgrq) obj2;
        if (!zzgrq2.isEmpty()) {
            if (!zzgrq.zze()) {
                zzgrq = zzgrq.zzb();
            }
            zzgrq.zzd(zzgrq2);
        }
        return zzgrq;
    }
}
