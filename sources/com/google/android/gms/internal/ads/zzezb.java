package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.z4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.h;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzezb {
    public static z4 zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzeyd zzeyd = (zzeyd) it.next();
            if (zzeyd.zzc) {
                arrayList.add(h.f20934p);
            } else {
                arrayList.add(new h(zzeyd.zza, zzeyd.zzb));
            }
        }
        return new z4(context, (h[]) arrayList.toArray(new h[arrayList.size()]));
    }

    public static zzeyd zzb(z4 z4Var) {
        return z4Var.f14654j ? new zzeyd(-3, 0, true) : new zzeyd(z4Var.f14650f, z4Var.f14647b, false);
    }
}
