package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzpm extends zzdf {
    private int zzd;
    private boolean zze;
    private byte[] zzf;
    private byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;

    public zzpm() {
        byte[] bArr = zzew.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    private final int zzq(long j10) {
        return (int) ((j10 * ((long) this.zzb.zzb)) / 1000000);
    }

    private final int zzr(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i10 = this.zzd;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    private final void zzs(byte[] bArr, int i10) {
        zzj(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.zzk = true;
        }
    }

    private final void zzt(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.zzj);
        int i11 = this.zzj - min;
        System.arraycopy(bArr, i10 - i11, this.zzg, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.zzg, i11, min);
    }

    public final void zze(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            int i10 = this.zzh;
            if (i10 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.zzf.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i11 = this.zzd;
                            position = ((limit2 / i11) * i11) + i11;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzh = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    zzj(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.zzk = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i10 != 1) {
                int limit3 = byteBuffer.limit();
                int zzr = zzr(byteBuffer);
                byteBuffer.limit(zzr);
                this.zzl += (long) (byteBuffer.remaining() / this.zzd);
                zzt(byteBuffer, this.zzg, this.zzj);
                if (zzr < limit3) {
                    zzs(this.zzg, this.zzj);
                    this.zzh = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int zzr2 = zzr(byteBuffer);
                int position2 = zzr2 - byteBuffer.position();
                byte[] bArr = this.zzf;
                int length = bArr.length;
                int i12 = this.zzi;
                int i13 = length - i12;
                if (zzr2 >= limit4 || position2 >= i13) {
                    int min = Math.min(position2, i13);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.zzf, this.zzi, min);
                    int i14 = this.zzi + min;
                    this.zzi = i14;
                    byte[] bArr2 = this.zzf;
                    if (i14 == bArr2.length) {
                        if (this.zzk) {
                            zzs(bArr2, this.zzj);
                            long j10 = this.zzl;
                            int i15 = this.zzi;
                            int i16 = this.zzj;
                            this.zzl = j10 + ((long) ((i15 - (i16 + i16)) / this.zzd));
                            i14 = i15;
                        } else {
                            this.zzl += (long) ((i14 - this.zzj) / this.zzd);
                        }
                        zzt(byteBuffer, this.zzf, i14);
                        this.zzi = 0;
                        this.zzh = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    zzs(bArr, i12);
                    this.zzi = 0;
                    this.zzh = 0;
                }
            }
        }
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final zzdc zzi(zzdc zzdc) throws zzdd {
        if (zzdc.zzd == 2) {
            return this.zze ? zzdc : zzdc.zza;
        }
        throw new zzdd(zzdc);
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        if (this.zze) {
            this.zzd = this.zzb.zze;
            int zzq = zzq(150000) * this.zzd;
            if (this.zzf.length != zzq) {
                this.zzf = new byte[zzq];
            }
            int zzq2 = zzq(20000) * this.zzd;
            this.zzj = zzq2;
            if (this.zzg.length != zzq2) {
                this.zzg = new byte[zzq2];
            }
        }
        this.zzh = 0;
        this.zzl = 0;
        this.zzi = 0;
        this.zzk = false;
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        int i10 = this.zzi;
        if (i10 > 0) {
            zzs(this.zzf, i10);
        }
        if (!this.zzk) {
            this.zzl += (long) (this.zzj / this.zzd);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        this.zze = false;
        this.zzj = 0;
        byte[] bArr = zzew.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    public final long zzo() {
        return this.zzl;
    }

    public final void zzp(boolean z10) {
        this.zze = z10;
    }
}
