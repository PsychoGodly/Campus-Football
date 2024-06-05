package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzahn extends zzahj<Boolean> implements zzakz, RandomAccess {
    private static final zzahn zza = new zzahn(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    zzahn() {
        this(new boolean[10], 0, true);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzb(i10));
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

    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzajf.zza(collection);
        if (!(collection instanceof zzahn)) {
            return super.addAll(collection);
        }
        zzahn zzahn = (zzahn) collection;
        int i10 = zzahn.zzc;
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
            System.arraycopy(zzahn.zzb, 0, this.zzb, this.zzc, zzahn.zzc);
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
        if (!(obj instanceof zzahn)) {
            return super.equals(obj);
        }
        zzahn zzahn = (zzahn) obj;
        if (this.zzc != zzahn.zzc) {
            return false;
        }
        boolean[] zArr = zzahn.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzc(i10);
        return Boolean.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zzajf.zza(this.zzb[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.zzb[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        zzc(i10);
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
        zza();
        if (i11 >= i10) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i11, zArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzc(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzajj zza(int i10) {
        if (i10 >= this.zzc) {
            return new zzahn(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzahn(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zzb = zArr;
        this.zzc = i10;
    }

    public final void zza(boolean z10) {
        zza();
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

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
