package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfqj extends zzfqk {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfqk zzc;

    zzfqj(zzfqk zzfqk, int i10, int i11) {
        this.zzc = zzfqk;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzfnu.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    public final zzfqk zzh(int i10, int i11) {
        zzfnu.zzg(i10, i11, this.zzb);
        zzfqk zzfqk = this.zzc;
        int i12 = this.zza;
        return zzfqk.subList(i10 + i12, i11 + i12);
    }
}
