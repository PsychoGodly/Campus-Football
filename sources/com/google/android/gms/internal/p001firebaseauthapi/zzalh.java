package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzalh {
    private static final Class<?> zza = zzd();
    private static final zzame<?, ?> zzb = zzc();
    private static final zzame<?, ?> zzc = new zzamg();

    static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zza(i10, true);
    }

    static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzaik.zzi(i10));
    }

    static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zzc(i10, 0);
    }

    static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzaik.zza(i10, 0);
    }

    static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzaik.zzi(i10));
    }

    static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzaik.zzi(i10));
    }

    static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzaik.zzi(i10));
    }

    static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzaik.zzi(i10));
    }

    static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzaik.zzi(i10));
    }

    static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzaik.zzi(i10));
    }

    public static void zzk(int i10, List<Integer> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzk(i10, list, z10);
        }
    }

    public static void zzl(int i10, List<Long> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzl(i10, list, z10);
        }
    }

    public static void zzm(int i10, List<Integer> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzm(i10, list, z10);
        }
    }

    public static void zzn(int i10, List<Long> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzn(i10, list, z10);
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

    static int zza(int i10, List<zzahp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = size * zzaik.zzi(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzi += zzaik.zza(list.get(i11));
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
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzc(zzajd.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaik.zzc(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static zzame<?, ?> zzc() {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzame) zze.getConstructor(new Class[0]).newInstance(new Object[0]);
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
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zze(zzajd.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaik.zze(list.get(i11).intValue());
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
        if (list instanceof zzajy) {
            zzajy zzajy = (zzajy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzd(zzajy.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaik.zzd(list.get(i11).longValue());
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
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzh(zzajd.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaik.zzh(list.get(i11).intValue());
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
        if (list instanceof zzajy) {
            zzajy zzajy = (zzajy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzf(zzajy.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaik.zzf(list.get(i11).longValue());
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
        if (list instanceof zzajd) {
            zzajd zzajd = (zzajd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzj(zzajd.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaik.zzj(list.get(i11).intValue());
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
        if (list instanceof zzajy) {
            zzajy zzajy = (zzajy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzaik.zzg(zzajy.zzb(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzaik.zzg(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzd(int i10, List<Integer> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzd(i10, list, z10);
        }
    }

    public static void zzc(int i10, List<Integer> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzc(i10, list, z10);
        }
    }

    static int zza(int i10, List<zzakn> list, zzalf zzalf) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzaik.zza(i10, list.get(i12), zzalf);
        }
        return i11;
    }

    static int zzb(int i10, List<?> list, zzalf zzalf) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzaik.zzi(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof zzajr) {
                i11 = zzaik.zza((zzajr) obj);
            } else {
                i11 = zzaik.zza((zzakn) obj, zzalf);
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

    public static void zzf(int i10, List<Float> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzf(i10, list, z10);
        }
    }

    public static void zzg(int i10, List<Integer> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzg(i10, list, z10);
        }
    }

    public static void zzh(int i10, List<Long> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzh(i10, list, z10);
        }
    }

    public static void zzi(int i10, List<Integer> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzi(i10, list, z10);
        }
    }

    public static void zzj(int i10, List<Long> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzj(i10, list, z10);
        }
    }

    static int zza(int i10, Object obj, zzalf zzalf) {
        if (obj instanceof zzajr) {
            return zzaik.zzb(i10, (zzajr) obj);
        }
        return zzaik.zzb(i10, (zzakn) obj, zzalf);
    }

    public static void zze(int i10, List<Long> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zze(i10, list, z10);
        }
    }

    public static zzame<?, ?> zza() {
        return zzb;
    }

    static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzajg zzajg, UB ub2, zzame<UT, UB> zzame) {
        if (zzajg == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzajg.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = zza(obj, i10, intValue, ub2, zzame);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzajg.zza(intValue2)) {
                    ub2 = zza(obj, i10, intValue2, ub2, zzame);
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
        int zzi = zzaik.zzi(i10) * size;
        if (list instanceof zzajt) {
            zzajt zzajt = (zzajt) list;
            while (i13 < size) {
                Object zzb2 = zzajt.zzb(i13);
                if (zzb2 instanceof zzahp) {
                    i12 = zzaik.zza((zzahp) zzb2);
                } else {
                    i12 = zzaik.zza((String) zzb2);
                }
                zzi += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof zzahp) {
                    i11 = zzaik.zza((zzahp) obj);
                } else {
                    i11 = zzaik.zza((String) obj);
                }
                zzi += i11;
                i13++;
            }
        }
        return zzi;
    }

    static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzame<UT, UB> zzame) {
        if (ub2 == null) {
            ub2 = zzame.zzc(obj);
        }
        zzame.zzb(ub2, i10, (long) i11);
        return ub2;
    }

    public static zzame<?, ?> zzb() {
        return zzc;
    }

    static <T, FT extends zzaix<FT>> void zza(zzaiq<FT> zzaiq, T t10, T t11) {
        zzaiv<FT> zza2 = zzaiq.zza((Object) t11);
        if (!zza2.zza.isEmpty()) {
            zzaiq.zzb(t10).zza(zza2);
        }
    }

    public static void zzb(int i10, List<Double> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzb(i10, list, z10);
        }
    }

    public static void zzb(int i10, List<?> list, zzana zzana, zzalf zzalf) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzb(i10, list, zzalf);
        }
    }

    static <T> void zza(zzakg zzakg, T t10, T t11, long j10) {
        zzamk.zza((Object) t10, j10, zzakg.zza(zzamk.zze(t10, j10), zzamk.zze(t11, j10)));
    }

    public static void zzb(int i10, List<String> list, zzana zzana) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zzb(i10, list);
        }
    }

    static <T, UT, UB> void zza(zzame<UT, UB> zzame, T t10, T t11) {
        zzame.zzc(t10, zzame.zza(zzame.zzd(t10), zzame.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzajc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i10, List<Boolean> list, zzana zzana, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zza(i10, list, z10);
        }
    }

    public static void zza(int i10, List<zzahp> list, zzana zzana) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zza(i10, list);
        }
    }

    public static void zza(int i10, List<?> list, zzana zzana, zzalf zzalf) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzana.zza(i10, list, zzalf);
        }
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
