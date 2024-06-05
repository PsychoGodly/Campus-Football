package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfpp extends AbstractSet {
    final /* synthetic */ zzfpu zza;

    zzfpp(zzfpu zzfpu) {
        this.zza = zzfpu;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzc = this.zza.zzp(entry.getKey());
            if (zzc != -1) {
                Object[] objArr = this.zza.zzc;
                objArr.getClass();
                if (zzfnp.zza(objArr[zzc], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Iterator iterator() {
        zzfpu zzfpu = this.zza;
        Map zzj = zzfpu.zzj();
        if (zzj != null) {
            return zzj.entrySet().iterator();
        }
        return new zzfpn(zzfpu);
    }

    public final boolean remove(Object obj) {
        Map zzj = this.zza.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfpu zzfpu = this.zza;
        if (zzfpu.zzn()) {
            return false;
        }
        int zzd = zzfpu.zzo();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object zzi = zzfpu.zzi(this.zza);
        zzfpu zzfpu2 = this.zza;
        int[] iArr = zzfpu2.zza;
        iArr.getClass();
        Object[] objArr = zzfpu2.zzb;
        objArr.getClass();
        Object[] objArr2 = zzfpu2.zzc;
        objArr2.getClass();
        int zzb = zzfpv.zzb(key, value, zzd, zzi, iArr, objArr, objArr2);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzm(zzb, zzd);
        zzfpu.zzb(this.zza);
        this.zza.zzk();
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
