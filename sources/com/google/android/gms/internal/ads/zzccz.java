package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzccz {
    private final ArrayList zza = new ArrayList();
    private long zzb;

    zzccz() {
    }

    /* access modifiers changed from: package-private */
    public final long zza() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((zzft) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.zzb = Math.max(this.zzb, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzft zzft) {
        this.zza.add(zzft);
    }
}
