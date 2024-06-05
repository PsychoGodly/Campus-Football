package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzau  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzau<E> extends zzak<E> implements Set<E> {
    private transient zzap<E> zza;

    zzau() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzbd.zza(this, obj);
    }

    public int hashCode() {
        return zzbd.zza(this);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public zzap<E> zzc() {
        zzap<E> zzap = this.zza;
        if (zzap != null) {
            return zzap;
        }
        zzap<E> zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    /* access modifiers changed from: package-private */
    public zzap<E> zzg() {
        return zzap.zza(toArray());
    }
}
