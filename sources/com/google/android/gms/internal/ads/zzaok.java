package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaok implements Runnable {
    private zzaok() {
    }

    /* synthetic */ zzaok(zzaoj zzaoj) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaol.zzc = MessageDigest.getInstance("MD5");
            countDownLatch = zzaol.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaol.zzb;
        } catch (Throwable th) {
            zzaol.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
