package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzajd extends zzahj<Integer> implements zzakz, RandomAccess {
    private static final zzajd zza = new zzajd(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    zzajd() {
        this(new int[10], 0, true);
    }

    private final String zzd(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zze(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzd(i10));
        }
        int[] iArr = this.zzb;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.zzb, i10, iArr2, i10 + 1, this.zzc - i10);
            this.zzb = iArr2;
        }
        this.zzb[i10] = intValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zza();
        zzajf.zza(collection);
        if (!(collection instanceof zzajd)) {
            return super.addAll(collection);
        }
        zzajd zzajd = (zzajd) collection;
        int i10 = zzajd.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.zzb;
            if (i12 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(zzajd.zzb, 0, this.zzb, this.zzc, zzajd.zzc);
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
        if (!(obj instanceof zzajd)) {
            return super.equals(obj);
        }
        zzajd zzajd = (zzajd) obj;
        if (this.zzc != zzajd.zzc) {
            return false;
        }
        int[] iArr = zzajd.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(zzb(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + this.zzb[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.zzb[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        zze(i10);
        int[] iArr = this.zzb;
        int i11 = iArr[i10];
        int i12 = this.zzc;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i11, iArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zze(i10);
        int[] iArr = this.zzb;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzajj zza(int i10) {
        if (i10 >= this.zzc) {
            return new zzajd(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zzb(int i10) {
        zze(i10);
        return this.zzb[i10];
    }

    public final void zzc(int i10) {
        zza();
        int i11 = this.zzc;
        int[] iArr = this.zzb;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        iArr3[i12] = i10;
    }

    private zzajd(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.zzb = iArr;
        this.zzc = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zzc(((Integer) obj).intValue());
        return true;
    }
}
