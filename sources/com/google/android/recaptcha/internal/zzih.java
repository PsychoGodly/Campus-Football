package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzih {
    public static final /* synthetic */ int zza = 0;
    private static final zzih zzb = new zzih();
    private final zzim zzc = new zzhq();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    private zzih() {
    }

    public static zzih zza() {
        return zzb;
    }

    public final zzil zzb(Class cls) {
        zzgw.zzc(cls, "messageType");
        zzil zzil = (zzil) this.zzd.get(cls);
        if (zzil == null) {
            zzil = this.zzc.zza(cls);
            zzgw.zzc(cls, "messageType");
            zzgw.zzc(zzil, "schema");
            zzil zzil2 = (zzil) this.zzd.putIfAbsent(cls, zzil);
            return zzil2 == null ? zzil : zzil2;
        }
    }
}
