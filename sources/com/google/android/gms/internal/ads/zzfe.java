package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfe extends zzfa {
    private zzfl zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfe() {
        super(false);
    }

    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(zzew.zzH(this.zzb), this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    public final long zzb(zzfl zzfl) throws IOException {
        zzi(zzfl);
        this.zza = zzfl;
        Uri uri = zzfl.zza;
        String scheme = uri.getScheme();
        zzdl.zze(JsonStorageKeyNames.DATA_KEY.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] zzah = zzew.zzah(uri.getSchemeSpecificPart(), ",");
        if (zzah.length == 2) {
            String str = zzah[1];
            if (zzah[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw zzbu.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
                }
            } else {
                this.zzb = zzew.zzab(URLDecoder.decode(str, zzfnh.zza.name()));
            }
            long j10 = zzfl.zzf;
            int length = this.zzb.length;
            if (j10 <= ((long) length)) {
                int i10 = (int) j10;
                this.zzc = i10;
                int i11 = length - i10;
                this.zzd = i11;
                long j11 = zzfl.zzg;
                if (j11 != -1) {
                    this.zzd = (int) Math.min((long) i11, j11);
                }
                zzj(zzfl);
                long j12 = zzfl.zzg;
                return j12 != -1 ? j12 : (long) this.zzd;
            }
            this.zzb = null;
            throw new zzfh(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw zzbu.zzb("Unexpected URI format: ".concat(String.valueOf(uri)), (Throwable) null);
    }

    public final Uri zzc() {
        zzfl zzfl = this.zza;
        if (zzfl != null) {
            return zzfl.zza;
        }
        return null;
    }

    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
