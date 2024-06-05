package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgos extends zzgoo implements RandomAccess, zzgsd {
    private static final zzgos zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzgos zzgos = new zzgos(new boolean[0], 0);
        zza = zzgos;
        zzgos.zzb();
    }

    zzgos() {
        this(new boolean[10], 0);
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

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbH();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        boolean[] zArr = this.zzb;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.zzb, i10, zArr2, i10 + 1, this.zzc - i10);
            this.zzb = zArr2;
        }
        this.zzb[i10] = booleanValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzbH();
        zzgqw.zze(collection);
        if (!(collection instanceof zzgos)) {
            return super.addAll(collection);
        }
        zzgos zzgos = (zzgos) collection;
        int i10 = zzgos.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.zzb;
            if (i12 > zArr.length) {
                this.zzb = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(zzgos.zzb, 0, this.zzb, this.zzc, zzgos.zzc);
            this.zzc = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgos)) {
            return super.equals(obj);
        }
        zzgos zzgos = (zzgos) obj;
        if (this.zzc != zzgos.zzc) {
            return false;
        }
        boolean[] zArr = zzgos.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Boolean.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zzgqw.zza(this.zzb[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbH();
        zzg(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zzbH();
        if (i11 >= i10) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i11, zArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbH();
        zzg(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzgqv zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzgos(Arrays.copyOf(this.zzb, i10), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zzbH();
        int i10 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zArr3[i11] = z10;
    }

    private zzgos(boolean[] zArr, int i10) {
        this.zzb = zArr;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
