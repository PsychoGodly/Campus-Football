package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzvd implements Comparator {
    public static final /* synthetic */ zzvd zza = new zzvd();

    private /* synthetic */ zzvd() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((zzvk) Collections.max((List) obj)).compareTo((zzvk) Collections.max((List) obj2));
    }
}
