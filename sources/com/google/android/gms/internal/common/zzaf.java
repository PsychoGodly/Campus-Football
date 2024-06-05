package com.google.android.gms.internal.common;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class zzaf extends zzag {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzag zzc;

    zzaf(zzag zzag, int i10, int i11) {
        this.zzc = zzag;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzs.zza(i10, this.zzb, "index");
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

    public final zzag zzh(int i10, int i11) {
        zzs.zzc(i10, i11, this.zzb);
        zzag zzag = this.zzc;
        int i12 = this.zza;
        return zzag.subList(i10 + i12, i11 + i12);
    }
}
