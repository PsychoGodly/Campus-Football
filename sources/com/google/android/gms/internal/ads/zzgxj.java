package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgxj implements zzgwy {
    private static final zzgwy zza = zzgwz.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    /* synthetic */ zzgxj(List list, List list2, zzgxh zzgxh) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzgxi zza(int i10, int i11) {
        return new zzgxi(i10, i11, (zzgxh) null);
    }

    /* renamed from: zzc */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzgxl) this.zzc.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet zza2 = zzgwv.zza(size);
        int size3 = this.zzb.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object zzb2 = ((zzgxl) this.zzb.get(i11)).zzb();
            Objects.requireNonNull(zzb2);
            zza2.add(zzb2);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object next : (Collection) arrayList.get(i12)) {
                Objects.requireNonNull(next);
                zza2.add(next);
            }
        }
        return Collections.unmodifiableSet(zza2);
    }
}
