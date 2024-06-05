package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzarb {
    private static final char[] zza = "0123456789abcdef".toCharArray();

    public static long zza(double d10, int i10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }

    public static Activity zzb(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        int i10 = 0;
        while ((context instanceof ContextWrapper) && i10 < 10) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i10++;
        }
        return null;
    }

    public static String zzc(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10] & 255;
            char[] cArr2 = zza;
            int i11 = i10 + i10;
            cArr[i11] = cArr2[b10 >>> 4];
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static String zzd(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return zzaoh.zza(bArr, true);
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean zzf() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zzg(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zzh(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static byte[] zzi(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }
}
