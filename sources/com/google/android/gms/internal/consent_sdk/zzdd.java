package com.google.android.gms.internal.consent_sdk;

import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzdd extends zzde {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzde zzc;

    zzdd(zzde zzde, int i10, int i11) {
        this.zzc = zzde;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzcx.zza(i10, this.zzb, "index");
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
    public final Object[] zze() {
        return this.zzc.zze();
    }

    public final zzde zzf(int i10, int i11) {
        zzcx.zzc(i10, i11, this.zzb);
        zzde zzde = this.zzc;
        int i12 = this.zza;
        return zzde.subList(i10 + i12, i11 + i12);
    }
}
