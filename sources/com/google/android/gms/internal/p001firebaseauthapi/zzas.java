package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzas  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzas<K, V> {
    zzav zza;
    private Object[] zzb;
    private int zzc;
    private boolean zzd;

    public zzas() {
        this(4);
    }

    public final zzas<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry entry : iterable) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            zza(this.zzc + 1);
            zzai.zza(key, value);
            Object[] objArr = this.zzb;
            int i10 = this.zzc;
            objArr[i10 * 2] = key;
            objArr[(i10 * 2) + 1] = value;
            this.zzc = i10 + 1;
        }
        return this;
    }

    zzas(int i10) {
        this.zzb = new Object[(i10 * 2)];
        this.zzc = 0;
        this.zzd = false;
    }

    public final zzat<K, V> zza() {
        zzav zzav = this.zza;
        if (zzav == null) {
            int i10 = this.zzc;
            Object[] objArr = this.zzb;
            this.zzd = true;
            zzaw zza2 = zzaw.zza(i10, objArr, this);
            zzav zzav2 = this.zza;
            if (zzav2 == null) {
                return zza2;
            }
            throw zzav2.zza();
        }
        throw zzav.zza();
    }

    private final void zza(int i10) {
        int i11 = i10 << 1;
        Object[] objArr = this.zzb;
        if (i11 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzam.zza(objArr.length, i11));
            this.zzd = false;
        }
    }
}
