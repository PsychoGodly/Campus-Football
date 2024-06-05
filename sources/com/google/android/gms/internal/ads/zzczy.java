package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzczy {
    protected final Map zza = new HashMap();

    protected zzczy(Set set) {
        zzo(set);
    }

    public final synchronized void zzj(zzdbu zzdbu) {
        zzm(zzdbu.zza, zzdbu.zzb);
    }

    public final synchronized void zzm(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzo(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzj((zzdbu) it.next());
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzp(zzczx zzczx) {
        for (Map.Entry entry : this.zza.entrySet()) {
            ((Executor) entry.getValue()).execute(new zzczw(zzczx, entry.getKey()));
        }
    }
}
