package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfqp extends zzfqf implements Set {
    private transient zzfqk zza;

    zzfqp() {
    }

    static int zzh(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        }
        zzfnu.zzf(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static zzfqo zzj(int i10) {
        return new zzfqo(i10);
    }

    public static zzfqp zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzs(array.length, array);
    }

    public static zzfqp zzm() {
        return zzfrz.zza;
    }

    public static zzfqp zzn(Object obj) {
        return new zzfsg(obj);
    }

    public static zzfqp zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzs(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfqp zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzs(12, objArr2);
    }

    /* access modifiers changed from: private */
    public static zzfqp zzs(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzfrz.zza;
        }
        if (i10 != 1) {
            int zzh = zzh(i10);
            Object[] objArr2 = new Object[zzh];
            int i11 = zzh - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object obj = objArr[i14];
                zzfrr.zza(obj, i14);
                int hashCode = obj.hashCode();
                int zza2 = zzfqc.zza(hashCode);
                while (true) {
                    int i15 = zza2 & i11;
                    Object obj2 = objArr2[i15];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza2++;
                    } else {
                        objArr[i13] = obj;
                        objArr2[i15] = obj;
                        i12 += hashCode;
                        i13++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzfsg(obj3);
            }
            if (zzh(i13) < zzh / 2) {
                return zzs(i13, objArr);
            }
            if (zzt(i13, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i13);
            }
            return new zzfrz(objArr, i12, objArr2, i11, i13);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new zzfsg(obj4);
    }

    /* access modifiers changed from: private */
    public static boolean zzt(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfqp) || !zzr() || !((zzfqp) obj).zzr() || hashCode() == obj.hashCode()) {
            return zzfsf.zzc(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return zzfsf.zza(this);
    }

    public zzfqk zzd() {
        zzfqk zzfqk = this.zza;
        if (zzfqk != null) {
            return zzfqk;
        }
        zzfqk zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    /* renamed from: zze */
    public abstract zzfsj iterator();

    /* access modifiers changed from: package-private */
    public zzfqk zzi() {
        return zzfqk.zzj(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean zzr() {
        return false;
    }
}
