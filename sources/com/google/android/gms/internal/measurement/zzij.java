package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzij implements zzmw {
    private final zzig zza;

    private zzij(zzig zzig) {
        zzig zzig2 = (zzig) zziz.zza(zzig, "output");
        this.zza = zzig2;
        zzig2.zza = this;
    }

    public static zzij zza(zzig zzig) {
        zzij zzij = zzig.zza;
        if (zzij != null) {
            return zzij;
        }
        return new zzij(zzig);
    }

    public final void zzb(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zza(list.get(i13).doubleValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    public final void zzc(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzd(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzd(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zze(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zze(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzc(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzf(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zza(list.get(i13).floatValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    public final void zzg(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzf(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzh(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzd(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzi(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzg(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzj(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zze(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zza(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzk(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzh(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzk(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzl(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzf(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzm(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzj(list.get(i13).intValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzc(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzn(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zzg(list.get(i13).longValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final int zza() {
        return zzmz.zza;
    }

    public final void zza(int i10, boolean z10) throws IOException {
        this.zza.zza(i10, z10);
    }

    public final void zza(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzc(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzig.zza(list.get(i13).booleanValue());
            }
            this.zza.zzc(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zza(i10, i11);
    }

    public final void zzd(int i10, int i11) throws IOException {
        this.zza.zza(i10, i11);
    }

    public final void zze(int i10, int i11) throws IOException {
        this.zza.zzk(i10, i11);
    }

    public final void zzf(int i10, int i11) throws IOException {
        this.zza.zzd(i10, i11);
    }

    public final void zzb(int i10, long j10) throws IOException {
        this.zza.zzb(i10, j10);
    }

    public final void zze(int i10, long j10) throws IOException {
        this.zza.zzb(i10, j10);
    }

    public final void zzc(int i10, int i11) throws IOException {
        this.zza.zzb(i10, i11);
    }

    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    public final void zzb(int i10, Object obj, zzlb zzlb) throws IOException {
        this.zza.zza(i10, (zzkj) obj, zzlb);
    }

    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zza(i10, j10);
    }

    public final void zza(int i10, zzhm zzhm) throws IOException {
        this.zza.zza(i10, zzhm);
    }

    public final void zzb(int i10, List<?> list, zzlb zzlb) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, (Object) list.get(i11), zzlb);
        }
    }

    public final void zza(int i10, List<zzhm> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zza(i10, list.get(i11));
        }
    }

    @Deprecated
    public final void zzb(int i10) throws IOException {
        this.zza.zzc(i10, 3);
    }

    public final void zza(int i10, double d10) throws IOException {
        this.zza.zzb(i10, d10);
    }

    public final void zzb(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof zzjp) {
            zzjp zzjp = (zzjp) list;
            while (i11 < list.size()) {
                Object zzb = zzjp.zzb(i11);
                if (zzb instanceof String) {
                    this.zza.zza(i10, (String) zzb);
                } else {
                    this.zza.zza(i10, (zzhm) zzb);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zza(i10, list.get(i11));
            i11++;
        }
    }

    @Deprecated
    public final void zza(int i10) throws IOException {
        this.zza.zzc(i10, 4);
    }

    public final void zza(int i10, int i11) throws IOException {
        this.zza.zzb(i10, i11);
    }

    public final void zza(int i10, long j10) throws IOException {
        this.zza.zza(i10, j10);
    }

    public final void zza(int i10, float f10) throws IOException {
        this.zza.zzb(i10, f10);
    }

    public final void zza(int i10, Object obj, zzlb zzlb) throws IOException {
        zzig zzig = this.zza;
        zzig.zzc(i10, 3);
        zzlb.zza((zzkj) obj, (zzmw) zzig.zza);
        zzig.zzc(i10, 4);
    }

    public final void zza(int i10, List<?> list, zzlb zzlb) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, (Object) list.get(i11), zzlb);
        }
    }

    public final <K, V> void zza(int i10, zzke<K, V> zzke, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.zza.zzc(i10, 2);
            this.zza.zzc(zzkb.zza(zzke, next.getKey(), next.getValue()));
            zzkb.zza(this.zza, zzke, next.getKey(), next.getValue());
        }
    }

    public final void zza(int i10, Object obj) throws IOException {
        if (obj instanceof zzhm) {
            this.zza.zzb(i10, (zzhm) obj);
        } else {
            this.zza.zza(i10, (zzkj) obj);
        }
    }

    public final void zza(int i10, String str) throws IOException {
        this.zza.zza(i10, str);
    }
}
