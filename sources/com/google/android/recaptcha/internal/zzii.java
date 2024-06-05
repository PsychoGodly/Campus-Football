package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzii extends zzek implements RandomAccess {
    private static final zzii zza = new zzii(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    zzii() {
        this(new Object[10], 0, true);
    }

    public static zzii zze() {
        return zza;
    }

    private final String zzf(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzg(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
    }

    public final void add(int i10, Object obj) {
        int i11;
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        Object[] objArr = this.zzb;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[(((i11 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.zzb, i10, objArr2, i10 + 1, this.zzc - i10);
            this.zzb = objArr2;
        }
        this.zzb[i10] = obj;
        this.zzc++;
        this.modCount++;
    }

    public final Object get(int i10) {
        zzg(i10);
        return this.zzb[i10];
    }

    public final Object remove(int i10) {
        zza();
        zzg(i10);
        Object[] objArr = this.zzb;
        Object obj = objArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i10, Object obj) {
        zza();
        zzg(i10);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzgv zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzii(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzii(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.zzb = objArr;
        this.zzc = i10;
    }

    public final boolean add(Object obj) {
        zza();
        int i10 = this.zzc;
        Object[] objArr = this.zzb;
        if (i10 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        objArr2[i11] = obj;
        this.modCount++;
        return true;
    }
}
