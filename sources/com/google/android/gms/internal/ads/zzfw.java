package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfw extends zzfa {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzfw() {
        super(false);
    }

    public final int zza(byte[] bArr, int i10, int i11) throws zzfv {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzc;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i12 = zzew.zza;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, (long) i11));
            if (read > 0) {
                this.zzc -= (long) read;
                zzg(read);
            }
            return read;
        } catch (IOException e10) {
            throw new zzfv(e10, AdError.SERVER_ERROR_CODE);
        }
    }

    public final long zzb(zzfl zzfl) throws zzfv {
        Uri uri = zzfl.zza;
        this.zzb = uri;
        zzi(zzfl);
        int i10 = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            Objects.requireNonNull(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzfl.zzf);
                long j10 = zzfl.zzg;
                if (j10 == -1) {
                    j10 = this.zza.length() - zzfl.zzf;
                }
                this.zzc = j10;
                if (j10 >= 0) {
                    this.zzd = true;
                    zzj(zzfl);
                    return this.zzc;
                }
                throw new zzfv((String) null, (Throwable) null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e10) {
                throw new zzfv(e10, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e11) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new zzfv(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e11, 1004);
            }
            if (zzew.zza < 21 || !zzfu.zzb(e11.getCause())) {
                i10 = 2005;
            }
            throw new zzfv(e11, i10);
        } catch (SecurityException e12) {
            throw new zzfv(e12, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e13) {
            throw new zzfv(e13, AdError.SERVER_ERROR_CODE);
        }
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() throws zzfv {
        this.zzb = null;
        try {
            RandomAccessFile randomAccessFile = this.zza;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
        } catch (IOException e10) {
            throw new zzfv(e10, AdError.SERVER_ERROR_CODE);
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
