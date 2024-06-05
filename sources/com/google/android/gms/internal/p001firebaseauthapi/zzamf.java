package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzamf extends AbstractList<String> implements zzajt, RandomAccess {
    /* access modifiers changed from: private */
    public final zzajt zza;

    public zzamf(zzajt zzajt) {
        this.zza = zzajt;
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.zza.get(i10);
    }

    public final Iterator<String> iterator() {
        return new zzamh(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new zzami(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final void zza(zzahp zzahp) {
        throw new UnsupportedOperationException();
    }

    public final Object zzb(int i10) {
        return this.zza.zzb(i10);
    }

    public final zzajt zzd() {
        return this;
    }

    public final List<?> zze() {
        return this.zza.zze();
    }
}
