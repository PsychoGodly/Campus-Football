package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbm {
    private final Map zza;
    private final Set zzb = new LinkedHashSet();
    private final Map zzc;

    public zzbm() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zza = linkedHashMap;
        this.zzc = linkedHashMap;
    }

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(r.j(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzmu) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzmu zzmu) throws zzt {
        int zzN = zzmu.zzN();
        int i10 = zzN - 1;
        if (zzN != 0) {
            switch (i10) {
                case 0:
                    return this.zza.get(Integer.valueOf(zzmu.zzi()));
                case 1:
                    return Boolean.valueOf(zzmu.zzL());
                case 2:
                    byte[] zzo = zzmu.zzH().zzo();
                    if (zzo.length == 1) {
                        return Byte.valueOf(zzo[0]);
                    }
                    throw new zzt(4, 6, (Throwable) null);
                case 3:
                    String zzJ = zzmu.zzJ();
                    if (zzJ.length() == 1) {
                        return Character.valueOf(zzJ.charAt(0));
                    }
                    throw new zzt(4, 6, (Throwable) null);
                case 4:
                    int zzj = zzmu.zzj();
                    if (zzj >= -32768 && zzj <= 32767) {
                        return Short.valueOf((short) zzj);
                    }
                    throw new zzt(4, 6, (Throwable) null);
                case 5:
                    return Integer.valueOf(zzmu.zzk());
                case 6:
                case 8:
                    throw new zzt(4, 6, (Throwable) null);
                case 7:
                    return Long.valueOf(zzmu.zzG());
                case 9:
                    return Float.valueOf(zzmu.zzg());
                case 10:
                    return Double.valueOf(zzmu.zzf());
                case 11:
                    return zzmu.zzK();
                case 12:
                    return null;
                default:
                    throw new zzt(4, 5, (Throwable) null);
            }
        } else {
            throw null;
        }
    }

    public final Object zzb(int i10) {
        return this.zza.remove(Integer.valueOf(i10));
    }

    public final Map zzc() {
        return this.zzc;
    }

    public final void zzd() {
        this.zza.clear();
    }

    public final void zze(int i10, Object obj) {
        zzf(173, obj);
        this.zzb.add(173);
    }

    public final void zzf(int i10, Object obj) {
        this.zza.put(Integer.valueOf(i10), obj);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
