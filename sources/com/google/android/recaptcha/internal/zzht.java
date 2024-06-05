package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzht {
    zzht() {
    }

    public static final int zza(int i10, Object obj, Object obj2) {
        zzhs zzhs = (zzhs) obj;
        zzhr zzhr = (zzhr) obj2;
        if (zzhs.isEmpty()) {
            return 0;
        }
        Iterator it = zzhs.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzhs) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzhs zzhs = (zzhs) obj;
        zzhs zzhs2 = (zzhs) obj2;
        if (!zzhs2.isEmpty()) {
            if (!zzhs.zze()) {
                zzhs = zzhs.zzb();
            }
            zzhs.zzd(zzhs2);
        }
        return zzhs;
    }
}
