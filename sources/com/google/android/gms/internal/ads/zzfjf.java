package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import m5.k;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfjf {
    public static File zza(File file, boolean z10) {
        if (z10 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File zzb(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zzc(str, file), str2);
    }

    public static File zzc(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        zza(file2, false);
        return file2;
    }

    public static boolean zzd(File file) {
        boolean z10;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z10 = true;
            for (int i10 = 0; i10 < listFiles.length; i10++) {
                File file2 = listFiles[i10];
                z10 = file2 != null && zzd(file2) && z10;
            }
        } else {
            z10 = true;
        }
        if (!file.delete() || !z10) {
            return false;
        }
        return true;
    }

    public static boolean zze(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                k.a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                k.a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                k.a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            k.a(fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            k.a(fileOutputStream);
            throw th;
        }
    }
}
