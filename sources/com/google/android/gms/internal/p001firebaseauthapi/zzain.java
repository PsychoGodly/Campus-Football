package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzain  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzain implements zzana {
    private final zzaik zza;

    private zzain(zzaik zzaik) {
        zzaik zzaik2 = (zzaik) zzajf.zza(zzaik, "output");
        this.zza = zzaik2;
        zzaik2.zze = this;
    }

    public static zzain zza(zzaik zzaik) {
        zzain zzain = zzaik.zze;
        if (zzain != null) {
            return zzain;
        }
        return new zzain(zzaik);
    }

    public final void zzb(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zza(list.get(i13).doubleValue());
            }
            this.zza.zzn(i12);
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
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzc(list.get(i13).intValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzi(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzd(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzd(list.get(i13).intValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zze(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzc(list.get(i13).longValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzf(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zza(list.get(i13).floatValue());
            }
            this.zza.zzn(i12);
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
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zze(list.get(i13).intValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzi(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzh(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzd(list.get(i13).longValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzi(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzg(list.get(i13).intValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzj(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zze(list.get(i13).longValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzk(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzh(list.get(i13).intValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzm(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzl(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzf(list.get(i13).longValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzg(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void zzm(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzj(list.get(i13).intValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzn(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzl(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void zzn(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zzg(list.get(i13).longValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final int zza() {
        return zzand.zza;
    }

    public final void zza(int i10, boolean z10) throws IOException {
        this.zza.zzb(i10, z10);
    }

    public final void zza(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.zza.zzk(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzaik.zza(list.get(i13).booleanValue());
            }
            this.zza.zzn(i12);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void zzb(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    public final void zzd(int i10, int i11) throws IOException {
        this.zza.zzh(i10, i11);
    }

    public final void zze(int i10, int i11) throws IOException {
        this.zza.zzj(i10, i11);
    }

    public final void zzf(int i10, int i11) throws IOException {
        this.zza.zzl(i10, i11);
    }

    public final void zzb(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    public final void zze(int i10, long j10) throws IOException {
        this.zza.zzh(i10, j10);
    }

    public final void zzc(int i10, int i11) throws IOException {
        this.zza.zzi(i10, i11);
    }

    public final void zzd(int i10, long j10) throws IOException {
        this.zza.zzg(i10, j10);
    }

    public final void zzb(int i10, Object obj, zzalf zzalf) throws IOException {
        this.zza.zzc(i10, (zzakn) obj, zzalf);
    }

    public final void zzc(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    public final void zza(int i10, zzahp zzahp) throws IOException {
        this.zza.zzc(i10, zzahp);
    }

    public final void zzb(int i10, List<?> list, zzalf zzalf) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, (Object) list.get(i11), zzalf);
        }
    }

    public final void zza(int i10, List<zzahp> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Deprecated
    public final void zzb(int i10) throws IOException {
        this.zza.zzk(i10, 3);
    }

    public final void zza(int i10, double d10) throws IOException {
        this.zza.zzb(i10, d10);
    }

    public final void zzb(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof zzajt) {
            zzajt zzajt = (zzajt) list;
            while (i11 < list.size()) {
                Object zzb = zzajt.zzb(i11);
                if (zzb instanceof String) {
                    this.zza.zzb(i10, (String) zzb);
                } else {
                    this.zza.zzc(i10, (zzahp) zzb);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzb(i10, list.get(i11));
            i11++;
        }
    }

    @Deprecated
    public final void zza(int i10) throws IOException {
        this.zza.zzk(i10, 4);
    }

    public final void zza(int i10, int i11) throws IOException {
        this.zza.zzi(i10, i11);
    }

    public final void zza(int i10, long j10) throws IOException {
        this.zza.zzf(i10, j10);
    }

    public final void zza(int i10, float f10) throws IOException {
        this.zza.zzb(i10, f10);
    }

    public final void zza(int i10, Object obj, zzalf zzalf) throws IOException {
        zzaik zzaik = this.zza;
        zzaik.zzk(i10, 3);
        zzalf.zza((zzakn) obj, (zzana) zzaik.zze);
        zzaik.zzk(i10, 4);
    }

    public final void zza(int i10, List<?> list, zzalf zzalf) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, (Object) list.get(i11), zzalf);
        }
    }

    public final <K, V> void zza(int i10, zzake<K, V> zzake, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.zza.zzk(i10, 2);
            this.zza.zzn(zzakf.zza(zzake, next.getKey(), next.getValue()));
            zzakf.zza(this.zza, zzake, next.getKey(), next.getValue());
        }
    }

    public final void zza(int i10, Object obj) throws IOException {
        if (obj instanceof zzahp) {
            this.zza.zzd(i10, (zzahp) obj);
        } else {
            this.zza.zzb(i10, (zzakn) obj);
        }
    }

    public final void zza(int i10, String str) throws IOException {
        this.zza.zzb(i10, str);
    }
}
