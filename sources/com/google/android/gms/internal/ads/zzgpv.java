package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgpv extends zzgoo implements RandomAccess, zzgsd {
    private static final zzgpv zza;
    private double[] zzb;
    private int zzc;

    static {
        zzgpv zzgpv = new zzgpv(new double[0], 0);
        zza = zzgpv;
        zzgpv.zzb();
    }

    zzgpv() {
        this(new double[10], 0);
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
        double doubleValue = ((Double) obj).doubleValue();
        zzbH();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        double[] dArr = this.zzb;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.zzb, i10, dArr2, i10 + 1, this.zzc - i10);
            this.zzb = dArr2;
        }
        this.zzb[i10] = doubleValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzbH();
        zzgqw.zze(collection);
        if (!(collection instanceof zzgpv)) {
            return super.addAll(collection);
        }
        zzgpv zzgpv = (zzgpv) collection;
        int i10 = zzgpv.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.zzb;
            if (i12 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(zzgpv.zzb, 0, this.zzb, this.zzc, zzgpv.zzc);
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
        if (!(obj instanceof zzgpv)) {
            return super.equals(obj);
        }
        zzgpv zzgpv = (zzgpv) obj;
        if (this.zzc != zzgpv.zzc) {
            return false;
        }
        double[] dArr = zzgpv.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Double.doubleToLongBits(this.zzb[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Double.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zzgqw.zzc(Double.doubleToLongBits(this.zzb[i11]));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbH();
        zzg(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zzbH();
        if (i11 >= i10) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i11, dArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbH();
        zzg(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzgqv zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzgpv(Arrays.copyOf(this.zzb, i10), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d10) {
        zzbH();
        int i10 = this.zzc;
        double[] dArr = this.zzb;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        dArr3[i11] = d10;
    }

    private zzgpv(double[] dArr, int i10) {
        this.zzb = dArr;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
