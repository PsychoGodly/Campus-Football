package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzax  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzax<E> extends zzap<E> {
    static final zzap<Object> zza = new zzax(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    zzax(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    public final E get(int i10) {
        zzy.zza(i10, this.zzc);
        E e10 = this.zzb[i10];
        e10.getClass();
        return e10;
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzc);
        return i10 + this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean zze() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzf() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzc;
    }
}
