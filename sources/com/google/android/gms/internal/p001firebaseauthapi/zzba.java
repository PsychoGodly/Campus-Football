package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzba  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzba extends zzap<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzba(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final Object get(int i10) {
        zzy.zza(i10, this.zzc);
        Object obj = this.zza[(i10 * 2) + this.zzb];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return true;
    }
}
