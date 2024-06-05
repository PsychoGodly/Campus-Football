package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzame extends zzgwh {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk = 1.0d;
    private float zzl = 1.0f;
    private zzgwr zzm = zzgwr.zza;
    private long zzn;

    public zzame() {
        super("mvhd");
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgwm.zza(zzama.zzf(byteBuffer));
            this.zzh = zzgwm.zza(zzama.zzf(byteBuffer));
            this.zzi = zzama.zze(byteBuffer);
            this.zzj = zzama.zzf(byteBuffer);
        } else {
            this.zza = zzgwm.zza(zzama.zze(byteBuffer));
            this.zzh = zzgwm.zza(zzama.zze(byteBuffer));
            this.zzi = zzama.zze(byteBuffer);
            this.zzj = zzama.zze(byteBuffer);
        }
        this.zzk = zzama.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((float) ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8)))))) / 256.0f;
        zzama.zzd(byteBuffer);
        zzama.zze(byteBuffer);
        zzama.zze(byteBuffer);
        double zzb = zzama.zzb(byteBuffer);
        double zzb2 = zzama.zzb(byteBuffer);
        double zza2 = zzama.zza(byteBuffer);
        this.zzm = new zzgwr(zzb, zzb2, zzama.zzb(byteBuffer), zzama.zzb(byteBuffer), zza2, zzama.zza(byteBuffer), zzama.zza(byteBuffer), zzama.zzb(byteBuffer), zzama.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzama.zze(byteBuffer);
    }
}
