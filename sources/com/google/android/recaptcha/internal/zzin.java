package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzin {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzjf zzc = zzZ(false);
    private static final zzjf zzd = zzZ(true);
    private static final zzjf zze = new zzjh();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
    }

    public static zzjf zzA() {
        return zze;
    }

    static Object zzB(Object obj, int i10, List list, zzgs zzgs, Object obj2, zzjf zzjf) {
        if (zzgs == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgs.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzC(obj, i10, intValue, obj2, zzjf);
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
                if (!zzgs.zza()) {
                    obj2 = zzC(obj, i10, intValue2, obj2, zzjf);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzC(Object obj, int i10, int i11, Object obj2, zzjf zzjf) {
        if (obj2 == null) {
            obj2 = zzjf.zzc(obj);
        }
        zzjf.zzl(obj2, i10, (long) i11);
        return obj2;
    }

    static void zzD(zzga zzga, Object obj, Object obj2) {
        zzge zzb2 = zzga.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzga.zzc(obj).zzh(zzb2);
        }
    }

    static void zzE(zzjf zzjf, Object obj, Object obj2) {
        zzjf.zzo(obj, zzjf.zze(zzjf.zzd(obj), zzjf.zzd(obj2)));
    }

    public static void zzF(Class cls) {
        Class cls2;
        if (!zzgo.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzG(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzc(i10, list, z10);
        }
    }

    public static void zzH(int i10, List list, zzjx zzjx) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zze(i10, list);
        }
    }

    public static void zzI(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzg(i10, list, z10);
        }
    }

    public static void zzJ(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzj(i10, list, z10);
        }
    }

    public static void zzK(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzl(i10, list, z10);
        }
    }

    public static void zzL(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzn(i10, list, z10);
        }
    }

    public static void zzM(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzp(i10, list, z10);
        }
    }

    public static void zzN(int i10, List list, zzjx zzjx, zzil zzil) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzfl) zzjx).zzq(i10, list.get(i11), zzil);
            }
        }
    }

    public static void zzO(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzs(i10, list, z10);
        }
    }

    public static void zzP(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzu(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List list, zzjx zzjx, zzil zzil) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzfl) zzjx).zzv(i10, list.get(i11), zzil);
            }
        }
    }

    public static void zzR(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzy(i10, list, z10);
        }
    }

    public static void zzS(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzA(i10, list, z10);
        }
    }

    public static void zzT(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzC(i10, list, z10);
        }
    }

    public static void zzU(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzE(i10, list, z10);
        }
    }

    public static void zzV(int i10, List list, zzjx zzjx) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzH(i10, list);
        }
    }

    public static void zzW(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzJ(i10, list, z10);
        }
    }

    public static void zzX(int i10, List list, zzjx zzjx, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzjx.zzL(i10, list, z10);
        }
    }

    static boolean zzY(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private static zzjf zzZ(boolean z10) {
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
            return (zzjf) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfk.zzy(i10 << 3) + 1);
    }

    static int zzb(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = size * zzfk.zzy(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int zzd2 = ((zzez) list.get(i11)).zzd();
            zzy += zzfk.zzy(zzd2) + zzd2;
        }
        return zzy;
    }

    static int zzc(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzfk.zzy(i10 << 3));
    }

    static int zzd(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzu(zzgp.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzfk.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zze(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfk.zzy(i10 << 3) + 4);
    }

    static int zzf(List list) {
        return list.size() * 4;
    }

    static int zzg(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfk.zzy(i10 << 3) + 8);
    }

    static int zzh(List list) {
        return list.size() * 8;
    }

    static int zzi(int i10, List list, zzil zzil) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzfk.zzt(i10, (zzhy) list.get(i12), zzil);
        }
        return i11;
    }

    static int zzj(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzfk.zzy(i10 << 3));
    }

    static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzu(zzgp.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzfk.zzu(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzl(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzfk.zzy(i10 << 3));
    }

    static int zzm(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhn = (zzhn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzz(zzhn.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzfk.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzn(int i10, Object obj, zzil zzil) {
        if (obj instanceof zzhe) {
            int i11 = zzfk.zzb;
            int zza2 = ((zzhe) obj).zza();
            return zzfk.zzy(i10 << 3) + zzfk.zzy(zza2) + zza2;
        }
        return zzfk.zzy(i10 << 3) + zzfk.zzw((zzhy) obj, zzil);
    }

    static int zzo(int i10, List list, zzil zzil) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzfk.zzy(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzhe) {
                int zza2 = ((zzhe) obj).zza();
                zzy += zzfk.zzy(zza2) + zza2;
            } else {
                zzy += zzfk.zzw((zzhy) obj, zzil);
            }
        }
        return zzy;
    }

    static int zzp(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzfk.zzy(i10 << 3));
    }

    static int zzq(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            i10 = 0;
            while (i11 < size) {
                int zze2 = zzgp.zze(i11);
                i10 += zzfk.zzy((zze2 >> 31) ^ (zze2 + zze2));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i12 = i10 + zzfk.zzy((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzr(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzfk.zzy(i10 << 3));
    }

    static int zzs(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhn = (zzhn) list;
            i10 = 0;
            while (i11 < size) {
                long zze2 = zzhn.zze(i11);
                i10 += zzfk.zzz((zze2 >> 63) ^ (zze2 + zze2));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i12 = i10 + zzfk.zzz((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzt(int i10, List list) {
        int zzx;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int i12 = zzfk.zzb;
        boolean z10 = list instanceof zzhg;
        int zzy = zzfk.zzy(i10 << 3) * size;
        if (z10) {
            zzhg zzhg = (zzhg) list;
            while (i11 < size) {
                Object zzf = zzhg.zzf(i11);
                if (zzf instanceof zzez) {
                    int zzd2 = ((zzez) zzf).zzd();
                    zzy += zzfk.zzy(zzd2) + zzd2;
                } else {
                    zzy += zzfk.zzx((String) zzf);
                }
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzez) {
                    int zzd3 = ((zzez) obj).zzd();
                    zzx = zzy + zzfk.zzy(zzd3) + zzd3;
                } else {
                    zzx = zzy + zzfk.zzx((String) obj);
                }
                i11++;
            }
        }
        return zzy;
    }

    static int zzu(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzfk.zzy(i10 << 3));
    }

    static int zzv(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgp) {
            zzgp zzgp = (zzgp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzy(zzgp.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzfk.zzy(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzw(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzfk.zzy(i10 << 3));
    }

    static int zzx(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhn) {
            zzhn zzhn = (zzhn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzfk.zzz(zzhn.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzfk.zzz(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzjf zzy() {
        return zzc;
    }

    public static zzjf zzz() {
        return zzd;
    }
}
