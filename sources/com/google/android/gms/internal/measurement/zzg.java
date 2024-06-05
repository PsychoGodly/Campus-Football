package com.google.android.gms.internal.measurement;

import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzg {
    public static double zza(double d10) {
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == -0.0d) {
            return d10;
        }
        return ((double) (i10 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static int zzb(double d10) {
        int i10;
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i10 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d));
    }

    public static long zzc(double d10) {
        return ((long) zzb(d10)) & 4294967295L;
    }

    public static void zzc(String str, int i10, List<zzaq> list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static void zzb(zzbv zzbv, int i10, List<zzaq> list) {
        zzb(zzbv.name(), i10, list);
    }

    public static int zza(zzh zzh) {
        int zzb = zzb(zzh.zza("runtime.counter").zze().doubleValue() + 1.0d);
        if (zzb <= 1000000) {
            zzh.zzc("runtime.counter", new zzai(Double.valueOf((double) zzb)));
            return zzb;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static void zzb(String str, int i10, List<zzaq> list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static zzbv zza(String str) {
        zzbv zza = (str == null || str.isEmpty()) ? null : zzbv.zza(Integer.parseInt(str));
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static boolean zzb(zzaq zzaq) {
        if (zzaq == null) {
            return false;
        }
        Double zze = zzaq.zze();
        if (zze.isNaN() || zze.doubleValue() < 0.0d || !zze.equals(Double.valueOf(Math.floor(zze.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static Object zza(zzaq zzaq) {
        if (zzaq.zzd.equals(zzaq)) {
            return null;
        }
        if (zzaq.zzc.equals(zzaq)) {
            return MaxReward.DEFAULT_LABEL;
        }
        if (zzaq instanceof zzap) {
            return zza((zzap) zzaq);
        }
        if (zzaq instanceof zzaf) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzaq> it = ((zzaf) zzaq).iterator();
            while (it.hasNext()) {
                Object zza = zza(it.next());
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
            return arrayList;
        } else if (!zzaq.zze().isNaN()) {
            return zzaq.zze();
        } else {
            return zzaq.zzf();
        }
    }

    public static Map<String, Object> zza(zzap zzap) {
        HashMap hashMap = new HashMap();
        for (String next : zzap.zza()) {
            Object zza = zza(zzap.zza(next));
            if (zza != null) {
                hashMap.put(next, zza);
            }
        }
        return hashMap;
    }

    public static void zza(zzbv zzbv, int i10, List<zzaq> list) {
        zza(zzbv.name(), i10, list);
    }

    public static void zza(String str, int i10, List<zzaq> list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static boolean zza(zzaq zzaq, zzaq zzaq2) {
        if (!zzaq.getClass().equals(zzaq2.getClass())) {
            return false;
        }
        if ((zzaq instanceof zzax) || (zzaq instanceof zzao)) {
            return true;
        }
        if (zzaq instanceof zzai) {
            if (Double.isNaN(zzaq.zze().doubleValue()) || Double.isNaN(zzaq2.zze().doubleValue())) {
                return false;
            }
            return zzaq.zze().equals(zzaq2.zze());
        } else if (zzaq instanceof zzas) {
            return zzaq.zzf().equals(zzaq2.zzf());
        } else {
            if (zzaq instanceof zzag) {
                return zzaq.zzd().equals(zzaq2.zzd());
            }
            if (zzaq == zzaq2) {
                return true;
            }
            return false;
        }
    }
}
