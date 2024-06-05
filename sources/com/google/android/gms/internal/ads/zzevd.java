package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.n1;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzevd implements zzfuf {
    zzevd(zzevf zzevf) {
    }

    public final void zza(Throwable th) {
        n1.a("Notification of cache hit failed.");
    }

    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        n1.a("Notification of cache hit successful.");
    }
}
