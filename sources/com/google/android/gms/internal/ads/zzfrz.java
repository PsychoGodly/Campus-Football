package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfrz extends zzfqp {
    static final zzfrz zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfrz(objArr, 0, objArr, 0, 0);
    }

    zzfrz(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.zzb = objArr;
        this.zze = i10;
        this.zzc = objArr2;
        this.zzf = i11;
        this.zzg = i12;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zzb2 = zzfqc.zzb(obj);
        while (true) {
            int i10 = zzb2 & this.zzf;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzb2 = i10 + 1;
        }
    }

    public final int hashCode() {
        return this.zze;
    }

    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    public final int size() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzg);
        return i10 + this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return 0;
    }

    public final zzfsj zze() {
        return zzd().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzfqk zzi() {
        return zzfqk.zzk(this.zzb, this.zzg);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzr() {
        return true;
    }
}
