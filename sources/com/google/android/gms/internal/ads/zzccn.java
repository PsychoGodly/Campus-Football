package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzccn implements Iterable {
    private final List zza = new ArrayList();

    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* access modifiers changed from: package-private */
    public final zzccm zza(zzcbj zzcbj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccm zzccm = (zzccm) it.next();
            if (zzccm.zza == zzcbj) {
                return zzccm;
            }
        }
        return null;
    }

    public final void zzb(zzccm zzccm) {
        this.zza.add(zzccm);
    }

    public final void zzc(zzccm zzccm) {
        this.zza.remove(zzccm);
    }

    public final boolean zzd(zzcbj zzcbj) {
        ArrayList<zzccm> arrayList = new ArrayList<>();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccm zzccm = (zzccm) it.next();
            if (zzccm.zza == zzcbj) {
                arrayList.add(zzccm);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzccm zzccm2 : arrayList) {
            zzccm2.zzb.zzf();
        }
        return true;
    }
}
