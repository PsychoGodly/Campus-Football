package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgso extends zzgpe {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};
    private final int zzc;
    /* access modifiers changed from: private */
    public final zzgpe zzd;
    /* access modifiers changed from: private */
    public final zzgpe zze;
    private final int zzf;
    private final int zzg;

    private zzgso(zzgpe zzgpe, zzgpe zzgpe2) {
        this.zzd = zzgpe;
        this.zze = zzgpe2;
        int zzd2 = zzgpe.zzd();
        this.zzf = zzd2;
        this.zzc = zzd2 + zzgpe2.zzd();
        this.zzg = Math.max(zzgpe.zzf(), zzgpe2.zzf()) + 1;
    }

    static zzgpe zzG(zzgpe zzgpe, zzgpe zzgpe2) {
        if (zzgpe2.zzd() == 0) {
            return zzgpe;
        }
        if (zzgpe.zzd() == 0) {
            return zzgpe2;
        }
        int zzd2 = zzgpe.zzd() + zzgpe2.zzd();
        if (zzd2 < 128) {
            return zzH(zzgpe, zzgpe2);
        }
        if (zzgpe instanceof zzgso) {
            zzgso zzgso = (zzgso) zzgpe;
            if (zzgso.zze.zzd() + zzgpe2.zzd() < 128) {
                return new zzgso(zzgso.zzd, zzH(zzgso.zze, zzgpe2));
            } else if (zzgso.zzd.zzf() > zzgso.zze.zzf() && zzgso.zzg > zzgpe2.zzf()) {
                return new zzgso(zzgso.zzd, new zzgso(zzgso.zze, zzgpe2));
            }
        }
        if (zzd2 >= zzc(Math.max(zzgpe.zzf(), zzgpe2.zzf()) + 1)) {
            return new zzgso(zzgpe, zzgpe2);
        }
        return zzgsk.zza(new zzgsk((zzgsj) null), zzgpe, zzgpe2);
    }

    private static zzgpe zzH(zzgpe zzgpe, zzgpe zzgpe2) {
        int zzd2 = zzgpe.zzd();
        int zzd3 = zzgpe2.zzd();
        byte[] bArr = new byte[(zzd2 + zzd3)];
        zzgpe.zzC(bArr, 0, 0, zzd2);
        zzgpe2.zzC(bArr, 0, zzd2, zzd3);
        return new zzgpa(bArr);
    }

    static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i10 >= 47) {
            return a.e.API_PRIORITY_OTHER;
        }
        return iArr[i10];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgpe)) {
            return false;
        }
        zzgpe zzgpe = (zzgpe) obj;
        if (this.zzc != zzgpe.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgpe.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgsm zzgsm = new zzgsm(this, (zzgsl) null);
        zzgoz zza2 = zzgsm.next();
        zzgsm zzgsm2 = new zzgsm(zzgpe, (zzgsl) null);
        zzgoz zza3 = zzgsm2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int zzd2 = zza2.zzd() - i10;
            int zzd3 = zza3.zzd() - i11;
            int min = Math.min(zzd2, zzd3);
            if (i10 == 0) {
                z10 = zza2.zzg(zza3, i11, min);
            } else {
                z10 = zza3.zzg(zza2, i10, min);
            }
            if (!z10) {
                return false;
            }
            i12 += min;
            int i13 = this.zzc;
            if (i12 < i13) {
                if (min == zzd2) {
                    zza2 = zzgsm.next();
                    i10 = 0;
                } else {
                    i10 += min;
                }
                if (min == zzd3) {
                    zza3 = zzgsm2.next();
                    i11 = 0;
                } else {
                    i11 += min;
                }
            } else if (i12 == i13) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzgsi(this);
    }

    public final byte zza(int i10) {
        zzgpe.zzB(i10, this.zzc);
        return zzb(i10);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        if (i10 < i11) {
            return this.zzd.zzb(i10);
        }
        return this.zze.zzb(i10 - i11);
    }

    public final int zzd() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.zze.zze(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzf() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    public final zzgpe zzk(int i10, int i11) {
        int zzq = zzgpe.zzq(i10, i11, this.zzc);
        if (zzq == 0) {
            return zzgpe.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i12 = this.zzf;
        if (i11 <= i12) {
            return this.zzd.zzk(i10, i11);
        }
        if (i10 >= i12) {
            return this.zze.zzk(i10 - i12, i11 - i12);
        }
        zzgpe zzgpe = this.zzd;
        return new zzgso(zzgpe.zzk(i10, zzgpe.zzd()), this.zze.zzk(0, i11 - this.zzf));
    }

    public final zzgpm zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        zzgsm zzgsm = new zzgsm(this, (zzgsl) null);
        while (zzgsm.hasNext()) {
            arrayList.add(zzgsm.next().zzn());
        }
        int i10 = zzgpm.zzd;
        boolean z10 = false;
        int i11 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i11 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z10 |= true;
            } else {
                z10 = byteBuffer.isDirect() ? z10 | true : z10 | true;
            }
        }
        if (z10) {
            return new zzgpi(arrayList, i11, true, (zzgph) null);
        }
        return zzgpm.zzH(new zzgqz(arrayList), 4096);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    public final ByteBuffer zzn() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgot zzgot) throws IOException {
        this.zzd.zzo(zzgot);
        this.zze.zzo(zzgot);
    }

    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgpe zzgpe = this.zze;
        if (zzgpe.zzj(zzj, 0, zzgpe.zzd()) == 0) {
            return true;
        }
        return false;
    }

    public final zzgoy zzs() {
        return new zzgsi(this);
    }
}
