package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcr {
    public static final zzcr zza = new zzcr();
    private static List zzb = q.d();

    private zzcr() {
    }

    public static final void acx(int[] iArr) {
        zzb(iArr);
    }

    public static final int zza(int[] iArr) {
        Iterator it = y.C(zzb, m.P(iArr)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() ^ ((Number) it.next()).intValue());
            }
            return ((Number) next).intValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final void zzb(int[] iArr) {
        zzb = m.P(iArr);
    }
}
