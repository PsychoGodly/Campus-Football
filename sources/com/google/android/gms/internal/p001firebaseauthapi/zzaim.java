package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaim  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzaim extends zzahj<Double> implements zzakz, RandomAccess {
    private static final zzaim zza = new zzaim(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    zzaim() {
        this(new double[10], 0, true);
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

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i10));
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

    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzajf.zza(collection);
        if (!(collection instanceof zzaim)) {
            return super.addAll(collection);
        }
        zzaim zzaim = (zzaim) collection;
        int i10 = zzaim.zzc;
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
            System.arraycopy(zzaim.zzb, 0, this.zzb, this.zzc, zzaim.zzc);
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
        if (!(obj instanceof zzaim)) {
            return super.equals(obj);
        }
        zzaim zzaim = (zzaim) obj;
        if (this.zzc != zzaim.zzc) {
            return false;
        }
        double[] dArr = zzaim.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Double.doubleToLongBits(this.zzb[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzc(i10);
        return Double.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zzajf.zza(Double.doubleToLongBits(this.zzb[i11]));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.zzb[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        zzc(i10);
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
        zza();
        if (i11 >= i10) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i11, dArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzc(i10);
        double[] dArr = this.zzb;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzajj zza(int i10) {
        if (i10 >= this.zzc) {
            return new zzaim(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzaim(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.zzb = dArr;
        this.zzc = i10;
    }

    public final void zza(double d10) {
        zza();
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

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
