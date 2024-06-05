package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfpu extends AbstractMap implements Serializable {
    /* access modifiers changed from: private */
    public static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    /* access modifiers changed from: private */
    public transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzfpu() {
        zzl(3);
    }

    static /* synthetic */ int zzb(zzfpu zzfpu) {
        int i10 = zzfpu.zzg;
        zzfpu.zzg = i10 - 1;
        return i10;
    }

    static /* synthetic */ Object zzi(zzfpu zzfpu) {
        Object obj = zzfpu.zze;
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: private */
    public final int zzo() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public final int zzp(Object obj) {
        if (zzn()) {
            return -1;
        }
        int zzb2 = zzfqc.zzb(obj);
        int zzo = zzo();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc2 = zzfpv.zzc(obj2, zzb2 & zzo);
        if (zzc2 != 0) {
            int i10 = ~zzo;
            int i11 = zzb2 & i10;
            do {
                int i12 = zzc2 - 1;
                int[] iArr = this.zza;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.zzb;
                    objArr.getClass();
                    if (zzfnp.zza(obj, objArr[i12])) {
                        return i12;
                    }
                }
                zzc2 = i13 & zzo;
            } while (zzc2 != 0);
        }
        return -1;
    }

    private final int zzq(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object zzd2 = zzfpv.zzd(i11);
        if (i13 != 0) {
            zzfpv.zze(zzd2, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int zzc2 = zzfpv.zzc(obj, i15);
            while (zzc2 != 0) {
                int i16 = zzc2 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int zzc3 = zzfpv.zzc(zzd2, i19);
                zzfpv.zze(zzd2, i19, zzc2);
                iArr[i16] = ((~i14) & i18) | (zzc3 & i14);
                zzc2 = i17 & i10;
            }
        }
        this.zze = zzd2;
        zzs(i14);
        return i14;
    }

    /* access modifiers changed from: private */
    public final Object zzr(Object obj) {
        if (zzn()) {
            return zzd;
        }
        int zzo = zzo();
        Object obj2 = this.zze;
        obj2.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        int zzb2 = zzfpv.zzb(obj, (Object) null, zzo, obj2, iArr, objArr, (Object[]) null);
        if (zzb2 == -1) {
            return zzd;
        }
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        Object obj3 = objArr2[zzb2];
        zzm(zzb2, zzo);
        this.zzg--;
        zzk();
        return obj3;
    }

    private final void zzs(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & -32);
    }

    public final void clear() {
        if (!zzn()) {
            zzk();
            Map zzj2 = zzj();
            if (zzj2 == null) {
                Object[] objArr = this.zzb;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.zzg, (Object) null);
                Object[] objArr2 = this.zzc;
                objArr2.getClass();
                Arrays.fill(objArr2, 0, this.zzg, (Object) null);
                Object obj = this.zze;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.zza;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.zzg, 0);
                this.zzg = 0;
                return;
            }
            this.zzf = zzfsr.zzb(size(), 3, 1073741823);
            zzj2.clear();
            this.zze = null;
            this.zzg = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map zzj2 = zzj();
        if (zzj2 != null) {
            return zzj2.containsKey(obj);
        }
        return zzp(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map zzj2 = zzj();
        if (zzj2 != null) {
            return zzj2.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.zzg; i10++) {
            Object[] objArr = this.zzc;
            objArr.getClass();
            if (zzfnp.zza(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzfpp zzfpp = new zzfpp(this);
        this.zzi = zzfpp;
        return zzfpp;
    }

    public final Object get(Object obj) {
        Map zzj2 = zzj();
        if (zzj2 != null) {
            return zzj2.get(obj);
        }
        int zzp = zzp(obj);
        if (zzp == -1) {
            return null;
        }
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr[zzp];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzfpr zzfpr = new zzfpr(this);
        this.zzh = zzfpr;
        return zzfpr;
    }

    public final Object put(Object obj, Object obj2) {
        int min;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (zzn()) {
            zzfnu.zzi(zzn(), "Arrays already allocated");
            int i10 = this.zzf;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfpv.zzd(max2);
            zzs(max2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map zzj2 = zzj();
        if (zzj2 != null) {
            return zzj2.put(obj3, obj4);
        }
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int zzb2 = zzfqc.zzb(obj);
        int zzo = zzo();
        int i13 = zzb2 & zzo;
        Object obj5 = this.zze;
        obj5.getClass();
        int zzc2 = zzfpv.zzc(obj5, i13);
        if (zzc2 != 0) {
            int i14 = ~zzo;
            int i15 = zzb2 & i14;
            int i16 = 0;
            while (true) {
                int i17 = zzc2 - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 != i15 || !zzfnp.zza(obj3, objArr[i17])) {
                    int i20 = i18 & zzo;
                    i16++;
                    if (i20 != 0) {
                        zzc2 = i20;
                    } else if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzo() + 1, 1.0f);
                        for (int zze2 = zze(); zze2 >= 0; zze2 = zzf(zze2)) {
                            Object[] objArr3 = this.zzb;
                            objArr3.getClass();
                            Object obj6 = objArr3[zze2];
                            Object[] objArr4 = this.zzc;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[zze2]);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzk();
                        return linkedHashMap.put(obj3, obj4);
                    } else if (i12 > zzo) {
                        zzo = zzq(zzo, zzfpv.zza(zzo), zzb2, i11);
                    } else {
                        iArr[i17] = (i12 & zzo) | i19;
                    }
                } else {
                    Object obj7 = objArr2[i17];
                    objArr2[i17] = obj4;
                    return obj7;
                }
            }
        } else if (i12 > zzo) {
            zzo = zzq(zzo, zzfpv.zza(zzo), zzb2, i11);
        } else {
            Object obj8 = this.zze;
            obj8.getClass();
            zzfpv.zze(obj8, i13, i12);
        }
        int[] iArr2 = this.zza;
        iArr2.getClass();
        int length = iArr2.length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.zza;
            iArr3.getClass();
            this.zza = Arrays.copyOf(iArr3, min);
            Object[] objArr5 = this.zzb;
            objArr5.getClass();
            this.zzb = Arrays.copyOf(objArr5, min);
            Object[] objArr6 = this.zzc;
            objArr6.getClass();
            this.zzc = Arrays.copyOf(objArr6, min);
        }
        int[] iArr4 = this.zza;
        iArr4.getClass();
        iArr4[i11] = (~zzo) & zzb2;
        Object[] objArr7 = this.zzb;
        objArr7.getClass();
        objArr7[i11] = obj3;
        Object[] objArr8 = this.zzc;
        objArr8.getClass();
        objArr8[i11] = obj4;
        this.zzg = i12;
        zzk();
        return null;
    }

    public final Object remove(Object obj) {
        Map zzj2 = zzj();
        if (zzj2 != null) {
            return zzj2.remove(obj);
        }
        Object zzr = zzr(obj);
        if (zzr == zzd) {
            return null;
        }
        return zzr;
    }

    public final int size() {
        Map zzj2 = zzj();
        return zzj2 != null ? zzj2.size() : this.zzg;
    }

    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzfpt zzfpt = new zzfpt(this);
        this.zzj = zzfpt;
        return zzfpt;
    }

    /* access modifiers changed from: package-private */
    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public final int zzf(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final Map zzj() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zzk() {
        this.zzf += 32;
    }

    /* access modifiers changed from: package-private */
    public final void zzl(int i10) {
        this.zzf = zzfsr.zzb(8, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    public final void zzm(int i10, int i11) {
        Object obj = this.zze;
        obj.getClass();
        int[] iArr = this.zza;
        iArr.getClass();
        Object[] objArr = this.zzb;
        objArr.getClass();
        Object[] objArr2 = this.zzc;
        objArr2.getClass();
        int size = size() - 1;
        if (i10 < size) {
            Object obj2 = objArr[size];
            objArr[i10] = obj2;
            objArr2[i10] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            iArr[i10] = iArr[size];
            iArr[size] = 0;
            int zzb2 = zzfqc.zzb(obj2) & i11;
            int zzc2 = zzfpv.zzc(obj, zzb2);
            int i12 = size + 1;
            if (zzc2 != i12) {
                while (true) {
                    int i13 = zzc2 - 1;
                    int i14 = iArr[i13];
                    int i15 = i14 & i11;
                    if (i15 != i12) {
                        zzc2 = i15;
                    } else {
                        iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                        return;
                    }
                }
            } else {
                zzfpv.zze(obj, zzb2, i10 + 1);
            }
        } else {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzn() {
        return this.zze == null;
    }

    zzfpu(int i10) {
        zzl(8);
    }
}
