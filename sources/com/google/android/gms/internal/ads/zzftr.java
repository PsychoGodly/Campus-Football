package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzftr extends zzftt {
    zzftr(zzfqf zzfqf, boolean z10) {
        super(zzfqf, true);
        zzw();
    }

    public final /* bridge */ /* synthetic */ Object zzH(List list) {
        ArrayList zza = zzfqy.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfts zzfts = (zzfts) it.next();
            zza.add(zzfts != null ? zzfts.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
