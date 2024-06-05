package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfse extends AbstractSet {
    zzfse() {
    }

    public boolean removeAll(Collection collection) {
        return zzfsf.zzd(this, collection);
    }

    public boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
