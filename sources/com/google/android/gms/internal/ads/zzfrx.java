package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfrx extends zzfqk {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzfrx(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final Object get(int i10) {
        zzfnu.zza(i10, this.zzc, "index");
        Object obj = this.zza[i10 + i10 + this.zzb];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }
}
