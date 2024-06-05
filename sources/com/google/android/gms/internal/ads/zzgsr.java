package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgsr {
    private static final Class zza;
    private static final zzgtg zzb = zzab(false);
    private static final zzgtg zzc = zzab(true);
    private static final zzgtg zzd = new zzgti();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzgtg zzA() {
        return zzc;
    }

    public static zzgtg zzB() {
        return zzd;
    }

    static Object zzC(Object obj, int i10, List list, zzgqq zzgqq, Object obj2, zzgtg zzgtg) {
        if (zzgqq == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgqq.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzD(obj, i10, intValue, obj2, zzgtg);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgqq.zza(intValue2)) {
                    obj2 = zzD(obj, i10, intValue2, obj2, zzgtg);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzD(Object obj, int i10, int i11, Object obj2, zzgtg zzgtg) {
        if (obj2 == null) {
            obj2 = zzgtg.zzc(obj);
        }
        zzgtg.zzl(obj2, i10, (long) i11);
        return obj2;
    }

    static void zzE(zzgpz zzgpz, Object obj, Object obj2) {
        zzgpz.zza(obj2);
        throw null;
    }

    static void zzF(zzgtg zzgtg, Object obj, Object obj2) {
        zzgtg.zzo(obj, zzgtg.zze(zzgtg.zzd(obj), zzgtg.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgqm.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void zzI(zzgrr zzgrr, Object obj, Object obj2, long j10) {
        zzgtq.zzv(obj, j10, zzgrr.zzc(zzgtq.zzh(obj, j10), zzgtq.zzh(obj2, j10)));
    }

    public static void zzJ(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzc(i10, list, z10);
        }
    }

    public static void zzK(int i10, List list, zzgpu zzgpu) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zze(i10, list);
        }
    }

    public static void zzL(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzg(i10, list, z10);
        }
    }

    public static void zzM(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzj(i10, list, z10);
        }
    }

    public static void zzN(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzl(i10, list, z10);
        }
    }

    public static void zzO(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzn(i10, list, z10);
        }
    }

    public static void zzP(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzp(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List list, zzgpu zzgpu, zzgsp zzgsp) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzgpu.zzq(i10, list.get(i11), zzgsp);
            }
        }
    }

    public static void zzR(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzs(i10, list, z10);
        }
    }

    public static void zzS(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzu(i10, list, z10);
        }
    }

    public static void zzT(int i10, List list, zzgpu zzgpu, zzgsp zzgsp) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzgpu.zzv(i10, list.get(i11), zzgsp);
            }
        }
    }

    public static void zzU(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzx(i10, list, z10);
        }
    }

    public static void zzV(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzz(i10, list, z10);
        }
    }

    public static void zzW(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzB(i10, list, z10);
        }
    }

    public static void zzX(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzD(i10, list, z10);
        }
    }

    public static void zzY(int i10, List list, zzgpu zzgpu) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzG(i10, list);
        }
    }

    public static void zzZ(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzI(i10, list, z10);
        }
    }

    static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i10 << 3) + 1);
    }

    public static void zzaa(int i10, List list, zzgpu zzgpu, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzgpu.zzK(i10, list, z10);
        }
    }

    private static zzgtg zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgtg) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzgpt.zzD(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzD += zzgpt.zzw((zzgpe) list.get(i11));
        }
        return zzD;
    }

    static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgpt.zzD(i10));
    }

    static int zze(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgpt.zzy(zzgqn.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgpt.zzy(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzf(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i10 << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgpt.zzE(i10 << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i10, List list, zzgsp zzgsp) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzgpt.zzx(i10, (zzgrw) list.get(i12), zzgsp);
        }
        return i11;
    }

    static int zzk(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgpt.zzD(i10));
    }

    static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgpt.zzy(zzgqn.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgpt.zzy(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzm(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgpt.zzD(i10));
    }

    static int zzn(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrl = (zzgrl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgpt.zzF(zzgrl.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgpt.zzF(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzo(int i10, Object obj, zzgsp zzgsp) {
        if (obj instanceof zzgrc) {
            int i11 = zzgpt.zzf;
            int zza2 = ((zzgrc) obj).zza();
            return zzgpt.zzE(i10 << 3) + zzgpt.zzE(zza2) + zza2;
        }
        return zzgpt.zzE(i10 << 3) + zzgpt.zzA((zzgrw) obj, zzgsp);
    }

    static int zzp(int i10, List list, zzgsp zzgsp) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgpt.zzD(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof zzgrc) {
                i11 = zzgpt.zzz((zzgrc) obj);
            } else {
                i11 = zzgpt.zzA((zzgrw) obj, zzgsp);
            }
            zzD += i11;
        }
        return zzD;
    }

    static int zzq(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgpt.zzD(i10));
    }

    static int zzr(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzgqn.zze(i11);
                i10 += zzgpt.zzE((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 = i10 + zzgpt.zzE((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzs(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzgpt.zzD(i10));
    }

    static int zzt(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrl = (zzgrl) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzgrl.zze(i11);
                i10 += zzgpt.zzF((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + zzgpt.zzF((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzu(int i10, List list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof zzgre;
        int zzD = zzgpt.zzD(i10) * size;
        if (z10) {
            zzgre zzgre = (zzgre) list;
            while (i13 < size) {
                Object zzf = zzgre.zzf(i13);
                if (zzf instanceof zzgpe) {
                    i12 = zzgpt.zzw((zzgpe) zzf);
                } else {
                    i12 = zzgpt.zzC((String) zzf);
                }
                zzD += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof zzgpe) {
                    i11 = zzgpt.zzw((zzgpe) obj);
                } else {
                    i11 = zzgpt.zzC((String) obj);
                }
                zzD += i11;
                i13++;
            }
        }
        return zzD;
    }

    static int zzv(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzgpt.zzD(i10));
    }

    static int zzw(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgqn) {
            zzgqn zzgqn = (zzgqn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgpt.zzE(zzgqn.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgpt.zzE(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzx(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzgpt.zzD(i10));
    }

    static int zzy(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgrl) {
            zzgrl zzgrl = (zzgrl) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgpt.zzF(zzgrl.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzgpt.zzF(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzgtg zzz() {
        return zzb;
    }
}
