package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbz implements zzby {
    public static final zzbz zza = new zzbz();

    private zzbz() {
    }

    public static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return m.M((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return m.S((short[]) obj);
        }
        if (obj instanceof int[]) {
            return m.P((int[]) obj);
        }
        if (obj instanceof long[]) {
            return m.Q((long[]) obj);
        }
        if (obj instanceof float[]) {
            return m.O((float[]) obj);
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        return m.N((double[]) obj);
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 2) {
            Object obj = objArr[0];
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                Object obj2 = objArr[1];
                if (true != (obj2 instanceof Object)) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    zzbl.zzc().zzf(i10, zzb(obj, obj2));
                    return;
                }
                throw new zzt(4, 5, (Throwable) null);
            }
            throw new zzt(4, 5, (Throwable) null);
        }
        throw new zzt(4, 3, (Throwable) null);
    }

    public final Object zzb(Object obj, Object obj2) throws zzt {
        List<Number> zzc = zzc(obj);
        List<Number> zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(r.j(zzc2, 10));
                for (Number doubleValue : zzc2) {
                    arrayList.add(Double.valueOf(Math.pow(doubleValue.doubleValue(), ((Number) obj).doubleValue())));
                }
                return (Serializable) arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(r.j(zzc, 10));
            for (Number doubleValue2 : zzc) {
                arrayList2.add(Double.valueOf(Math.pow(doubleValue2.doubleValue(), ((Number) obj2).doubleValue())));
            }
            return (Serializable) arrayList2.toArray(new Double[0]);
        } else if (zzc == null || zzc2 == null) {
            throw new zzt(4, 5, (Throwable) null);
        } else {
            zzbx.zzb(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
            }
            return (Serializable) dArr;
        }
    }
}
