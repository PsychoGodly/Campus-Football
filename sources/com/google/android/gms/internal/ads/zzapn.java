package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzapn implements zzfjk {
    final /* synthetic */ zzfhk zza;

    zzapn(zzapp zzapp, zzfhk zzfhk) {
        this.zza = zzfhk;
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
