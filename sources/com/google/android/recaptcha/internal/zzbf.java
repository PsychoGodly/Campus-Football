package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbf implements zzbi {
    private final zzdo zza;

    public zzbf() {
        this(1);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        return y.L(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }

    public zzbf(int i10) {
        this.zza = zzdo.zza(i10);
    }
}
