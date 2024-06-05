package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzakj implements zzakg {
    zzakj() {
    }

    public final int zza(int i10, Object obj, Object obj2) {
        zzakh zzakh = (zzakh) obj;
        zzakf zzakf = (zzakf) obj2;
        if (zzakh.isEmpty()) {
            return 0;
        }
        Iterator it = zzakh.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Object zzb(Object obj) {
        return zzakh.zza().zzb();
    }

    public final Object zzc(Object obj) {
        ((zzakh) obj).zzc();
        return obj;
    }

    public final Map<?, ?> zzd(Object obj) {
        return (zzakh) obj;
    }

    public final Map<?, ?> zze(Object obj) {
        return (zzakh) obj;
    }

    public final boolean zzf(Object obj) {
        return !((zzakh) obj).zzd();
    }

    public final zzake<?, ?> zza(Object obj) {
        zzakf zzakf = (zzakf) obj;
        throw new NoSuchMethodError();
    }

    public final Object zza(Object obj, Object obj2) {
        zzakh zzakh = (zzakh) obj;
        zzakh zzakh2 = (zzakh) obj2;
        if (!zzakh2.isEmpty()) {
            if (!zzakh.zzd()) {
                zzakh = zzakh.zzb();
            }
            zzakh.zza(zzakh2);
        }
        return zzakh;
    }
}
