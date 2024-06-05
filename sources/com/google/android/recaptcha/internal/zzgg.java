package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzgg extends zzek implements RandomAccess, zzig {
    private static final zzgg zza = new zzgg(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    zzgg() {
        this(new float[10], 0, true);
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
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        float[] fArr = this.zzb;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.zzb, i10, fArr2, i10 + 1, this.zzc - i10);
            this.zzb = fArr2;
        }
        this.zzb[i10] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzgw.zzd;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzgg)) {
            return super.addAll(collection);
        }
        zzgg zzgg = (zzgg) collection;
        int i10 = zzgg.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.zzb;
            if (i12 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(zzgg.zzb, 0, this.zzb, this.zzc, zzgg.zzc);
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
        if (!(obj instanceof zzgg)) {
            return super.equals(obj);
        }
        zzgg zzgg = (zzgg) obj;
        if (this.zzc != zzgg.zzc) {
            return false;
        }
        float[] fArr = zzgg.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Float.floatToIntBits(this.zzb[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Float.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.zzb[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzg(i10);
        float[] fArr = this.zzb;
        float f10 = fArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i11, fArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzg(i10);
        float[] fArr = this.zzb;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzgv zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzgg(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f10) {
        zza();
        int i10 = this.zzc;
        float[] fArr = this.zzb;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        fArr3[i11] = f10;
    }

    private zzgg(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zzb = fArr;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
