package com.google.android.gms.internal.ads;

import android.os.Build;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfhk {
    protected static final byte[] zza = {61, 122, Ascii.DC2, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    protected static final byte[] zzb = {-110, -13, -34, 70, -83, 43, 97, Ascii.NAK, -44, Ascii.DLE, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] zza2 = zzaju.zza(file.getAbsolutePath());
            if (zza2.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(zza2[0][0].getEncoded());
                if (!Arrays.equals(this.zzd, digest)) {
                    return !"user".equals(Build.TYPE) && Arrays.equals(this.zzc, digest);
                }
                return true;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzajr e10) {
            throw new GeneralSecurityException("Package is not signed", e10);
        } catch (IOException | RuntimeException e11) {
            throw new GeneralSecurityException("Failed to verify signatures", e11);
        }
    }
}
