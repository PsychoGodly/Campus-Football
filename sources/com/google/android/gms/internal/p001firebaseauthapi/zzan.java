package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzan  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
class zzan<E> extends zzam<E> {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzan(int i10) {
        zzai.zza(4, "initialCapacity");
    }

    public zzan<E> zza(E e10) {
        zzy.zza(e10);
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        if (objArr.length < i10) {
            this.zza = Arrays.copyOf(objArr, zzam.zza(objArr.length, i10));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        objArr2[i11] = e10;
        return this;
    }
}
