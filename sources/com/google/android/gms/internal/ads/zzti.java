package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzti implements zzsq, zzsp {
    private final zzsq[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzsp zze;
    private zzur zzf;
    private zzsq[] zzg;
    private zzul zzh;
    private final zzsd zzi;

    public zzti(zzsd zzsd, long[] jArr, zzsq[] zzsqArr, byte... bArr) {
        this.zzi = zzsd;
        this.zza = zzsqArr;
        this.zzh = new zzsc(new zzul[0]);
        this.zzb = new IdentityHashMap();
        this.zzg = new zzsq[0];
        for (int i10 = 0; i10 < zzsqArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zza[i10] = new zztg(zzsqArr[i10], j10);
            }
        }
    }

    public final long zza(long j10, zzkq zzkq) {
        zzsq zzsq;
        zzsq[] zzsqArr = this.zzg;
        if (zzsqArr.length > 0) {
            zzsq = zzsqArr[0];
        } else {
            zzsq = this.zza[0];
        }
        return zzsq.zza(j10, zzkq);
    }

    public final long zzb() {
        return this.zzh.zzb();
    }

    public final long zzc() {
        return this.zzh.zzc();
    }

    public final long zzd() {
        long j10 = -9223372036854775807L;
        for (zzsq zzsq : this.zzg) {
            long zzd2 = zzsq.zzd();
            if (zzd2 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    zzsq[] zzsqArr = this.zzg;
                    int length = zzsqArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        zzsq zzsq2 = zzsqArr[i10];
                        if (zzsq2 == zzsq) {
                            break;
                        } else if (zzsq2.zze(zzd2) == zzd2) {
                            i10++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = zzd2;
                } else if (zzd2 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j10 == -9223372036854775807L || zzsq.zze(j10) == j10)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    public final long zze(long j10) {
        long zze2 = this.zzg[0].zze(j10);
        int i10 = 1;
        while (true) {
            zzsq[] zzsqArr = this.zzg;
            if (i10 >= zzsqArr.length) {
                return zze2;
            }
            if (zzsqArr[i10].zze(zze2) == zze2) {
                i10++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long zzf(zzwe[] zzweArr, boolean[] zArr, zzuj[] zzujArr, boolean[] zArr2, long j10) {
        int length;
        Integer num;
        int i10;
        zzwe[] zzweArr2 = zzweArr;
        zzuj[] zzujArr2 = zzujArr;
        int length2 = zzweArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i11 = 0;
        while (true) {
            length = zzweArr2.length;
            num = 0;
            if (i11 >= length) {
                break;
            }
            zzuj zzuj = zzujArr2[i11];
            if (zzuj != null) {
                num = (Integer) this.zzb.get(zzuj);
            }
            if (num == null) {
                i10 = -1;
            } else {
                i10 = num.intValue();
            }
            iArr[i11] = i10;
            iArr2[i11] = -1;
            zzwe zzwe = zzweArr2[i11];
            if (zzwe != null) {
                zzcp zzcp = (zzcp) this.zzd.get(zzwe.zze());
                Objects.requireNonNull(zzcp);
                int i12 = 0;
                while (true) {
                    zzsq[] zzsqArr = this.zza;
                    if (i12 >= zzsqArr.length) {
                        break;
                    } else if (zzsqArr[i12].zzh().zza(zzcp) != -1) {
                        iArr2[i11] = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            i11++;
        }
        this.zzb.clear();
        zzuj[] zzujArr3 = new zzuj[length];
        zzuj[] zzujArr4 = new zzuj[length];
        zzwe[] zzweArr3 = new zzwe[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j11 = j10;
        int i13 = 0;
        while (i13 < this.zza.length) {
            for (int i14 = 0; i14 < zzweArr2.length; i14++) {
                zzujArr4[i14] = iArr[i14] == i13 ? zzujArr2[i14] : num;
                if (iArr2[i14] == i13) {
                    zzwe zzwe2 = zzweArr2[i14];
                    Objects.requireNonNull(zzwe2);
                    zzcp zzcp2 = (zzcp) this.zzd.get(zzwe2.zze());
                    Objects.requireNonNull(zzcp2);
                    zzweArr3[i14] = new zztf(zzwe2, zzcp2);
                } else {
                    zzweArr3[i14] = num;
                }
            }
            int i15 = i13;
            ArrayList arrayList2 = arrayList;
            zzuj[] zzujArr5 = zzujArr4;
            zzwe[] zzweArr4 = zzweArr3;
            long zzf2 = this.zza[i13].zzf(zzweArr3, zArr, zzujArr4, zArr2, j11);
            if (i15 == 0) {
                j11 = zzf2;
            } else if (zzf2 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i16 = 0; i16 < zzweArr2.length; i16++) {
                boolean z11 = true;
                if (iArr2[i16] == i15) {
                    zzuj zzuj2 = zzujArr5[i16];
                    Objects.requireNonNull(zzuj2);
                    zzujArr3[i16] = zzuj2;
                    this.zzb.put(zzuj2, Integer.valueOf(i15));
                    z10 = true;
                } else if (iArr[i16] == i15) {
                    if (zzujArr5[i16] != null) {
                        z11 = false;
                    }
                    zzdl.zzf(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i15]);
            }
            i13 = i15 + 1;
            arrayList = arrayList2;
            zzujArr4 = zzujArr5;
            zzweArr3 = zzweArr4;
            num = null;
        }
        System.arraycopy(zzujArr3, 0, zzujArr2, 0, length);
        zzsq[] zzsqArr2 = (zzsq[]) arrayList.toArray(new zzsq[0]);
        this.zzg = zzsqArr2;
        this.zzh = new zzsc(zzsqArr2);
        return j11;
    }

    public final /* bridge */ /* synthetic */ void zzg(zzul zzul) {
        zzsq zzsq = (zzsq) zzul;
        zzsp zzsp = this.zze;
        Objects.requireNonNull(zzsp);
        zzsp.zzg(this);
    }

    public final zzur zzh() {
        zzur zzur = this.zzf;
        Objects.requireNonNull(zzur);
        return zzur;
    }

    public final void zzi(zzsq zzsq) {
        this.zzc.remove(zzsq);
        if (this.zzc.isEmpty()) {
            int i10 = 0;
            for (zzsq zzh2 : this.zza) {
                i10 += zzh2.zzh().zzc;
            }
            zzcp[] zzcpArr = new zzcp[i10];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zzsq[] zzsqArr = this.zza;
                if (i11 < zzsqArr.length) {
                    zzur zzh3 = zzsqArr[i11].zzh();
                    int i13 = zzh3.zzc;
                    int i14 = 0;
                    while (i14 < i13) {
                        zzcp zzb2 = zzh3.zzb(i14);
                        zzcp zzc2 = zzb2.zzc(i11 + ":" + zzb2.zzc);
                        this.zzd.put(zzc2, zzb2);
                        zzcpArr[i12] = zzc2;
                        i14++;
                        i12++;
                    }
                    i11++;
                } else {
                    this.zzf = new zzur(zzcpArr);
                    zzsp zzsp = this.zze;
                    Objects.requireNonNull(zzsp);
                    zzsp.zzi(this);
                    return;
                }
            }
        }
    }

    public final void zzj(long j10, boolean z10) {
        for (zzsq zzj : this.zzg) {
            zzj.zzj(j10, false);
        }
    }

    public final void zzk() throws IOException {
        for (zzsq zzk : this.zza) {
            zzk.zzk();
        }
    }

    public final void zzl(zzsp zzsp, long j10) {
        this.zze = zzsp;
        Collections.addAll(this.zzc, this.zza);
        for (zzsq zzl : this.zza) {
            zzl.zzl(this, j10);
        }
    }

    public final void zzm(long j10) {
        this.zzh.zzm(j10);
    }

    public final zzsq zzn(int i10) {
        zzsq zzsq = this.zza[i10];
        return zzsq instanceof zztg ? ((zztg) zzsq).zza : zzsq;
    }

    public final boolean zzo(long j10) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j10);
        }
        int size = this.zzc.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzsq) this.zzc.get(i10)).zzo(j10);
        }
        return false;
    }

    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
