package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzasl {
    protected static final String zza = "zzasl";
    private final zzaqx zzb;
    private final String zzc;
    private final String zzd;
    private volatile Method zze = null;
    private final Class[] zzf;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzasl(zzaqx zzaqx, String str, String str2, Class... clsArr) {
        this.zzb = zzaqx;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzaqx.zzk().submit(new zzask(this));
    }

    static /* bridge */ /* synthetic */ void zzb(zzasl zzasl) {
        CountDownLatch countDownLatch;
        try {
            zzaqx zzaqx = zzasl.zzb;
            Class loadClass = zzaqx.zzi().loadClass(zzasl.zzc(zzaqx.zzu(), zzasl.zzc));
            if (loadClass == null) {
                countDownLatch = zzasl.zzg;
            } else {
                zzasl.zze = loadClass.getMethod(zzasl.zzc(zzasl.zzb.zzu(), zzasl.zzd), zzasl.zzf);
                if (zzasl.zze == null) {
                    countDownLatch = zzasl.zzg;
                }
                countDownLatch = zzasl.zzg;
            }
        } catch (zzaqb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzasl.zzg;
        } catch (Throwable th) {
            zzasl.zzg.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzaqb, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (!this.zzg.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zze;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
