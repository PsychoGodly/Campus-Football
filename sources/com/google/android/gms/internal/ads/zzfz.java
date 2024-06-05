package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzfz extends zzfh {
    public final zzfl zzb;
    public final int zzc;

    public zzfz(zzfl zzfl, int i10, int i11) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzfl;
        this.zzc = 1;
    }

    public static zzfz zza(IOException iOException, zzfl zzfl, int i10) {
        String message = iOException.getMessage();
        boolean z10 = iOException instanceof SocketTimeoutException;
        int i11 = AdError.INTERNAL_ERROR_CODE;
        if (z10) {
            i11 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && zzfnb.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        }
        if (i11 == 2007) {
            return new zzfy(iOException, zzfl);
        }
        return new zzfz(iOException, zzfl, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE : i10;
    }

    public zzfz(IOException iOException, zzfl zzfl, int i10, int i11) {
        super((Throwable) iOException, zzb(i10, i11));
        this.zzb = zzfl;
        this.zzc = i11;
    }

    public zzfz(String str, zzfl zzfl, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = zzfl;
        this.zzc = i11;
    }

    public zzfz(String str, IOException iOException, zzfl zzfl, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = zzfl;
        this.zzc = i11;
    }
}
