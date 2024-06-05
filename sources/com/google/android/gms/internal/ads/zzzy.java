package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzzy {
    public static int zza(zzzv zzzv, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int zzb = zzzv.zzb(bArr, i10 + i12, i11 - i12);
            if (zzb == -1) {
                break;
            }
            i12 += zzb;
        }
        return i12;
    }

    public static void zzb(boolean z10, String str) throws zzbu {
        if (!z10) {
            throw zzbu.zza(str, (Throwable) null);
        }
    }

    public static boolean zzc(zzzv zzzv, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return zzzv.zzm(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean zzd(zzzv zzzv, byte[] bArr, int i10, int i11) throws IOException {
        try {
            ((zzzk) zzzv).zzn(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzzv zzzv, int i10) throws IOException {
        try {
            ((zzzk) zzzv).zzo(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
