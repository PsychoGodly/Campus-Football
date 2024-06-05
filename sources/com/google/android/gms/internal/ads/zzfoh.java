package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzfoh {
    /* access modifiers changed from: private */
    public final zzfng zza;
    private final zzfog zzb;

    private zzfoh(zzfog zzfog) {
        zzfnf zzfnf = zzfnf.zza;
        this.zzb = zzfog;
        this.zza = zzfnf;
    }

    public static zzfoh zzb(int i10) {
        return new zzfoh(new zzfod(4000));
    }

    public static zzfoh zzc(zzfng zzfng) {
        return new zzfoh(new zzfob(zzfng));
    }

    /* access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfoe(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
