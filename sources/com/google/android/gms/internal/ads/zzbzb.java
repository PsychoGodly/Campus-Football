package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.p;
import java.lang.reflect.Array;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbzb {
    public static boolean zza(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            if (obj instanceof Bundle) {
                if (!(obj2 instanceof Bundle) || !zza((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                    return false;
                }
                for (int i10 = 0; i10 < length; i10++) {
                    if (!p.a(Array.get(obj, i10), Array.get(obj2, i10))) {
                        return false;
                    }
                }
                continue;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}
