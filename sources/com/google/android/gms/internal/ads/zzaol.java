package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaol {
    static boolean zza = false;
    static final CountDownLatch zzb = new CountDownLatch(1);
    /* access modifiers changed from: private */
    public static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();

    static String zza(zzans zzans, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] zzax = zzans.zzax();
        if (((Boolean) a0.c().zzb(zzbar.zzcO)).booleanValue()) {
            Vector zzb2 = zzb(zzax, 255);
            if (zzb2 == null || zzb2.size() == 0) {
                bArr = zzg(zzf(4096).zzax(), str, true);
            } else {
                zzaoe zza2 = zzaof.zza();
                int size = zzb2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    zza2.zza(zzgpe.zzv(zzg((byte[]) zzb2.get(i10), str, false)));
                }
                zza2.zzb(zzgpe.zzv(zze(zzax)));
                bArr = ((zzaof) zza2.zzal()).zzax();
            }
        } else if (zzaqz.zza != null) {
            byte[] zza3 = zzaqz.zza.zza(zzax, str != null ? str.getBytes() : new byte[0]);
            zzaoe zza4 = zzaof.zza();
            zza4.zza(zzgpe.zzv(zza3));
            zza4.zzc(3);
            bArr = ((zzaof) zza4.zzal()).zzax();
        } else {
            throw new GeneralSecurityException();
        }
        return zzaoh.zza(bArr, true);
    }

    static Vector zzb(byte[] bArr, int i10) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        int i12 = 0;
        while (i12 < i11 / 255) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
                i12++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzaok((zzaoj) null)).start();
            }
        }
    }

    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (zzd) {
            zzd();
            MessageDigest messageDigest = null;
            try {
                if (zzb.await(2, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest2 = zzc;
                    if (messageDigest2 != null) {
                        messageDigest = messageDigest2;
                    }
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest != null) {
                messageDigest.reset();
                messageDigest.update(bArr);
                digest = zzc.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    static zzans zzf(int i10) {
        zzamv zza2 = zzans.zza();
        zza2.zzD(4096);
        return (zzans) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        if (length > i10) {
            bArr = zzf(4096).zzax();
        }
        int length2 = bArr.length;
        if (length2 < i10) {
            byte[] bArr3 = new byte[(i10 - length2)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i10 + 1).put((byte) length2).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i10 + 1).put((byte) length2).put(bArr).array();
        }
        if (z10) {
            bArr2 = ByteBuffer.allocate(256).put(zze(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        zzaom[] zzaomArr = new zzapl().zzcG;
        int length3 = zzaomArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            zzaomArr[i11].zza(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgol(str.getBytes("UTF-8")).zza(bArr4);
        }
        return bArr4;
    }
}
