package com.google.android.gms.internal.common;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzad extends zzaa {
    public zzad() {
        super(4);
    }

    public final zzad zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    public final zzad zzc(Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    zzad(int i10) {
        super(4);
    }
}
