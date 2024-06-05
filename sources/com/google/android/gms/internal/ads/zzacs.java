package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzacs {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzacs() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzacr zzacr) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzacr.zza);
            String str = zzacr.zzb;
            if (str == null) {
                str = MaxReward.DEFAULT_LABEL;
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzacr.zzc);
            this.zzb.writeLong(zzacr.zzd);
            this.zzb.write(zzacr.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
