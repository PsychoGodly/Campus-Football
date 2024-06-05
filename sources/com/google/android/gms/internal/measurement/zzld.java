package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzld {
    private static final Class<?> zza = zzd();
    private static final zzma<?, ?> zzb = zzc();
    private static final zzma<?, ?> zzc = new zzmc();

    static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.zzb(i10, true);
    }

    static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzig.zzi(i10));
    }

    static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.zzf(i10, 0);
    }

    static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzig.zzc(i10, 0);
    }

    static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzig.zzi(i10));
    }

    static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzig.zzi(i10));
    }

    static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzig.zzi(i10));
    }

    static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzig.zzi(i10));
    }

    static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzig.zzi(i10));
    }

    static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzig.zzi(i10));
    }

    public static void zzk(int i10, List<Integer> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzk(i10, list, z10);
        }
    }

    public static void zzl(int i10, List<Long> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzl(i10, list, z10);
        }
    }

    public static void zzm(int i10, List<Integer> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzm(i10, list, z10);
        }
    }

    public static void zzn(int i10, List<Long> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzn(i10, list, z10);
        }
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i10, List<zzhm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = size * zzig.zzi(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzi += zzig.zzb(list.get(i11));
        }
        return zzi;
    }

    static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzja = (zzja) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzd(zzja.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzig.zzd(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static zzma<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzma) zze.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzja = (zzja) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzf(zzja.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzig.zzf(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjy = (zzjy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzd(zzjy.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzig.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzja = (zzja) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzh(zzja.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzig.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjy = (zzjy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzf(zzjy.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzig.zzf(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzja) {
            zzja zzja = (zzja) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzj(zzja.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzig.zzj(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjy) {
            zzjy zzjy = (zzjy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzig.zzg(zzjy.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzig.zzg(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzd(int i10, List<Integer> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzd(i10, list, z10);
        }
    }

    public static void zzc(int i10, List<Integer> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzc(i10, list, z10);
        }
    }

    static int zza(int i10, List<zzkj> list, zzlb zzlb) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzig.zzb(i10, list.get(i12), zzlb);
        }
        return i11;
    }

    static int zzb(int i10, List<?> list, zzlb zzlb) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzig.zzi(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof zzjn) {
                i11 = zzig.zza((zzjn) obj);
            } else {
                i11 = zzig.zza((zzkj) obj, zzlb);
            }
            zzi += i11;
        }
        return zzi;
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzf(int i10, List<Float> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzf(i10, list, z10);
        }
    }

    public static void zzg(int i10, List<Integer> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzg(i10, list, z10);
        }
    }

    public static void zzh(int i10, List<Long> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzh(i10, list, z10);
        }
    }

    public static void zzi(int i10, List<Integer> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzi(i10, list, z10);
        }
    }

    public static void zzj(int i10, List<Long> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzj(i10, list, z10);
        }
    }

    static int zza(int i10, Object obj, zzlb zzlb) {
        if (obj instanceof zzjn) {
            return zzig.zzb(i10, (zzjn) obj);
        }
        return zzig.zzc(i10, (zzkj) obj, zzlb);
    }

    public static void zze(int i10, List<Long> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zze(i10, list, z10);
        }
    }

    public static zzma<?, ?> zza() {
        return zzb;
    }

    static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzje zzje, UB ub2, zzma<UT, UB> zzma) {
        if (zzje == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzje.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = zza(obj, i10, intValue, ub2, zzma);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzje.zza(intValue2)) {
                    ub2 = zza(obj, i10, intValue2, ub2, zzma);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    static int zzb(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzig.zzi(i10) * size;
        if (list instanceof zzjp) {
            zzjp zzjp = (zzjp) list;
            while (i13 < size) {
                Object zzb2 = zzjp.zzb(i13);
                if (zzb2 instanceof zzhm) {
                    i12 = zzig.zzb((zzhm) zzb2);
                } else {
                    i12 = zzig.zzb((String) zzb2);
                }
                zzi += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof zzhm) {
                    i11 = zzig.zzb((zzhm) obj);
                } else {
                    i11 = zzig.zzb((String) obj);
                }
                zzi += i11;
                i13++;
            }
        }
        return zzi;
    }

    static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzma<UT, UB> zzma) {
        if (ub2 == null) {
            ub2 = zzma.zzc(obj);
        }
        zzma.zzb(ub2, i10, (long) i11);
        return ub2;
    }

    public static zzma<?, ?> zzb() {
        return zzc;
    }

    static <T, FT extends zzis<FT>> void zza(zzim<FT> zzim, T t10, T t11) {
        zziq<FT> zza2 = zzim.zza((Object) t11);
        if (!zza2.zza.isEmpty()) {
            zzim.zzb(t10).zza(zza2);
        }
    }

    public static void zzb(int i10, List<Double> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzb(i10, list, z10);
        }
    }

    public static void zzb(int i10, List<?> list, zzmw zzmw, zzlb zzlb) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzb(i10, list, zzlb);
        }
    }

    static <T> void zza(zzkg zzkg, T t10, T t11, long j10) {
        zzmg.zza((Object) t10, j10, zzkg.zza(zzmg.zze(t10, j10), zzmg.zze(t11, j10)));
    }

    public static void zzb(int i10, List<String> list, zzmw zzmw) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zzb(i10, list);
        }
    }

    static <T, UT, UB> void zza(zzma<UT, UB> zzma, T t10, T t11) {
        zzma.zzc(t10, zzma.zza(zzma.zzd(t10), zzma.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzix.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i10, List<Boolean> list, zzmw zzmw, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zza(i10, list, z10);
        }
    }

    public static void zza(int i10, List<zzhm> list, zzmw zzmw) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zza(i10, list);
        }
    }

    public static void zza(int i10, List<?> list, zzmw zzmw, zzlb zzlb) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzmw.zza(i10, list, zzlb);
        }
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
