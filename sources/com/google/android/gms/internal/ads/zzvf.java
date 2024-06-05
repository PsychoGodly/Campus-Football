package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzvf implements Comparator {
    public static final /* synthetic */ zzvf zza = new zzvf();

    private /* synthetic */ zzvf() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        zzfpz zzj = zzfpz.zzj();
        zzvz zzvz = zzvz.zza;
        zzfpz zzb = zzj.zzc((zzwb) Collections.max(list, zzvz), (zzwb) Collections.max(list2, zzvz), zzvz).zzb(list.size(), list2.size());
        zzwa zzwa = zzwa.zza;
        return zzb.zzc((zzwb) Collections.max(list, zzwa), (zzwb) Collections.max(list2, zzwa), zzwa).zza();
    }
}
