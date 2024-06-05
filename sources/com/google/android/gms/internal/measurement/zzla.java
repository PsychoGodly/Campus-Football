package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzla<E> extends zzhg<E> implements RandomAccess {
    private static final zzla<Object> zza = new zzla<>(new Object[0], 0, false);
    private E[] zzb;
    private int zzc;

    zzla() {
        this(new Object[10], 0, true);
    }

    private final String zzb(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzc(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzb(i10));
        }
    }

    public static <E> zzla<E> zzd() {
        return zza;
    }

    public final void add(int i10, E e10) {
        int i11;
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i10));
        }
        E[] eArr = this.zzb;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[(((i11 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.zzb, i10, eArr2, i10 + 1, this.zzc - i10);
            this.zzb = eArr2;
        }
        this.zzb[i10] = e10;
        this.zzc++;
        this.modCount++;
    }

    public final E get(int i10) {
        zzc(i10);
        return this.zzb[i10];
    }

    public final E remove(int i10) {
        zza();
        zzc(i10);
        E[] eArr = this.zzb;
        E e10 = eArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        zza();
        zzc(i10);
        E[] eArr = this.zzb;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzjf zza(int i10) {
        if (i10 >= this.zzc) {
            return new zzla(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzla(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.zzb = eArr;
        this.zzc = i10;
    }

    public final boolean add(E e10) {
        zza();
        int i10 = this.zzc;
        E[] eArr = this.zzb;
        if (i10 == eArr.length) {
            this.zzb = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }
}
