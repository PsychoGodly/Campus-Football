package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzdu extends zzdp {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    zzdu(Iterable iterable, int i10) {
        this.zza = iterable;
        this.zzb = i10;
    }

    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i10 = this.zzb;
        Objects.requireNonNull(it);
        zzdi.zzb(i10 >= 0, "numberToAdvance must be nonnegative");
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            it.next();
        }
        return new zzdt(this, it);
    }
}
