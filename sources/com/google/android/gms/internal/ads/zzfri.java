package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfri extends zzfrm {
    final /* synthetic */ Comparator zza;

    zzfri(Comparator comparator) {
        this.zza = comparator;
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
