package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
final class zzjy extends zzhg<Long> implements zzjg, zzkv, RandomAccess {
    private static final zzjy zza = new zzjy(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    zzjy() {
        this(new long[10], 0, true);
    }

    public static zzjy zzd() {
        return zza;
    }

    private final void zze(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzd(i10));
        }
        long[] jArr = this.zzb;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.zzb, i10, jArr2, i10 + 1, this.zzc - i10);
            this.zzb = jArr2;
        }
        this.zzb[i10] = longValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        zza();
        zziz.zza(collection);
        if (!(collection instanceof zzjy)) {
            return super.addAll(collection);
        }
        zzjy zzjy = (zzjy) collection;
        int i10 = zzjy.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.zzb;
            if (i12 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(zzjy.zzb, 0, this.zzb, this.zzc, zzjy.zzc);
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
        if (!(obj instanceof zzjy)) {
            return super.equals(obj);
        }
        zzjy zzjy = (zzjy) obj;
        if (this.zzc != zzjy.zzc) {
            return false;
        }
        long[] jArr = zzjy.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(zzb(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zziz.zza(this.zzb[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.zzb[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        zze(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i11, jArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zze(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.zzc;
    }

    public final long zzb(int i10) {
        zze(i10);
        return this.zzb[i10];
    }

    /* renamed from: zzc */
    public final zzjg zza(int i10) {
        if (i10 >= this.zzc) {
            return new zzjy(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzjy(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zzb = jArr;
        this.zzc = i10;
    }

    private final String zzd(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    public final void zza(long j10) {
        zza();
        int i10 = this.zzc;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        jArr3[i11] = j10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Long) obj).longValue());
        return true;
    }
}
