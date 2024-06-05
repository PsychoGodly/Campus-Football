package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzach extends zzacg {
    private final zzen zzb = new zzen(zzaar.zza);
    private final zzen zzc = new zzen(4);
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzach(zzabb zzabb) {
        super(zzabb);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzen zzen) throws zzacf {
        int zzk = zzen.zzk();
        int i10 = zzk >> 4;
        int i11 = zzk & 15;
        if (i11 == 7) {
            this.zzg = i10;
            return i10 != 5;
        }
        throw new zzacf("Video format not supported: " + i11);
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzen zzen, long j10) throws zzbu {
        int zzk = zzen.zzk();
        long zzf2 = (long) zzen.zzf();
        if (zzk == 0) {
            if (!this.zze) {
                zzen zzen2 = new zzen(new byte[zzen.zza()]);
                zzen.zzB(zzen2.zzH(), 0, zzen.zza());
                zzyz zza = zzyz.zza(zzen2);
                this.zzd = zza.zzb;
                zzad zzad = new zzad();
                zzad.zzS(MimeTypes.VIDEO_H264);
                zzad.zzx(zza.zzf);
                zzad.zzX(zza.zzc);
                zzad.zzF(zza.zzd);
                zzad.zzP(zza.zze);
                zzad.zzI(zza.zza);
                this.zza.zzk(zzad.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzk == 1 && this.zze) {
            int i10 = this.zzg == 1 ? 1 : 0;
            if (!this.zzf && i10 == 0) {
                return false;
            }
            byte[] zzH = this.zzc.zzH();
            zzH[0] = 0;
            zzH[1] = 0;
            zzH[2] = 0;
            int i11 = 4 - this.zzd;
            int i12 = 0;
            while (zzen.zza() > 0) {
                zzen.zzB(this.zzc.zzH(), i11, this.zzd);
                this.zzc.zzF(0);
                int zzn = this.zzc.zzn();
                this.zzb.zzF(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzen, zzn);
                i12 = i12 + 4 + zzn;
            }
            this.zza.zzs(j10 + (zzf2 * 1000), i10, i12, 0, (zzaba) null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
