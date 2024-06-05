package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzdv {
    public static boolean zza(Collection collection, Iterator it) {
        Objects.requireNonNull(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }
}
