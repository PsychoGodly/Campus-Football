package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzpc {
    private final Class<?> zza;
    private final Class<? extends zzov> zzb;

    private zzpc(Class<?> cls, Class<? extends zzov> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpc)) {
            return false;
        }
        zzpc zzpc = (zzpc) obj;
        if (!zzpc.zza.equals(this.zza) || !zzpc.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = this.zzb.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
