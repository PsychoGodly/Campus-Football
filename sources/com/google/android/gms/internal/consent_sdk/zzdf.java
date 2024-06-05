package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public abstract class zzdf extends zzdb implements Set {
    private transient zzde zza;

    zzdf() {
    }

    static int zzf(int i10) {
        int max = Math.max(i10, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static zzdf zzi() {
        return zzdi.zza;
    }

    public static zzdf zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    private static zzdf zzl(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzdi.zza;
        }
        if (i10 != 1) {
            int zzf = zzf(i10);
            Object[] objArr2 = new Object[zzf];
            int i11 = zzf - 1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < i10) {
                Object obj = objArr[i12];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int zza2 = zzda.zza(hashCode);
                    while (true) {
                        int i15 = zza2 & i11;
                        Object obj2 = objArr2[i15];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            zza2++;
                        } else {
                            objArr[i14] = obj;
                            objArr2[i15] = obj;
                            i13 += hashCode;
                            i14++;
                            break;
                        }
                    }
                    i12++;
                } else {
                    throw new NullPointerException("at index " + i12);
                }
            }
            Arrays.fill(objArr, i14, i10, (Object) null);
            if (i14 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new zzdj(obj3);
            }
            if (zzf(i14) < zzf / 2) {
                return zzl(i14, objArr);
            }
            if (i14 < 3) {
                objArr = Arrays.copyOf(objArr, i14);
            }
            return new zzdi(objArr, i13, objArr2, i11, i14);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new zzdj(obj4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdf) && zzk() && ((zzdf) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    /* renamed from: zzd */
    public abstract zzdk iterator();

    public final zzde zzg() {
        zzde zzde = this.zza;
        if (zzde != null) {
            return zzde;
        }
        zzde zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    /* access modifiers changed from: package-private */
    public zzde zzh() {
        Object[] array = toArray();
        int i10 = zzde.zzd;
        return zzde.zzg(array, array.length);
    }

    /* access modifiers changed from: package-private */
    public boolean zzk() {
        return false;
    }
}
