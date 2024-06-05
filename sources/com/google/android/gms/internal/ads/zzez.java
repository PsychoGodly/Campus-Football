package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzez extends zzfa {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzez(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    public final int zza(byte[] bArr, int i10, int i11) throws zzey {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzd;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, (long) i11);
            } catch (IOException e10) {
                throw new zzey(e10, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.zzc;
        int i12 = zzew.zza;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.zzd;
        if (j11 != -1) {
            this.zzd = j11 - ((long) read);
        }
        zzg(read);
        return read;
    }

    public final long zzb(zzfl zzfl) throws zzey {
        try {
            Uri uri = zzfl.zza;
            this.zzb = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                path = path.substring(1);
            }
            zzi(zzfl);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzfl.zzf) >= zzfl.zzf) {
                long j10 = zzfl.zzg;
                if (j10 != -1) {
                    this.zzd = j10;
                } else {
                    long available = (long) this.zzc.available();
                    this.zzd = available;
                    if (available == 2147483647L) {
                        this.zzd = -1;
                    }
                }
                this.zze = true;
                zzj(zzfl);
                return this.zzd;
            }
            throw new zzey((Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (zzey e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzey(e11, true != (e11 instanceof FileNotFoundException) ? AdError.SERVER_ERROR_CODE : 2005);
        }
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() throws zzey {
        this.zzb = null;
        try {
            InputStream inputStream = this.zzc;
            if (inputStream != null) {
                inputStream.close();
            }
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
        } catch (IOException e10) {
            throw new zzey(e10, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th;
        }
    }
}
