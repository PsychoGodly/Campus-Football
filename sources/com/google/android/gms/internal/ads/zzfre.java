package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzfre extends AbstractMap {
    private transient Set zza;
    private transient Set zzb;
    private transient Collection zzc;

    zzfre() {
    }

    public final Set entrySet() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzb2 = zzb();
        this.zza = zzb2;
        return zzb2;
    }

    public Set keySet() {
        Set set = this.zzb;
        if (set != null) {
            return set;
        }
        Set zze = zze();
        this.zzb = zze;
        return zze;
    }

    public final Collection values() {
        Collection collection = this.zzc;
        if (collection != null) {
            return collection;
        }
        zzfrd zzfrd = new zzfrd(this);
        this.zzc = zzfrd;
        return zzfrd;
    }

    /* access modifiers changed from: package-private */
    public abstract Set zzb();

    /* access modifiers changed from: package-private */
    public Set zze() {
        return new zzfrc(this);
    }
}
