package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.q0;
import java.util.concurrent.Executor;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdis {
    private final q0 zza;
    private final e zzb;
    private final Executor zzc;

    public zzdis(q0 q0Var, e eVar, Executor executor) {
        this.zza = q0Var;
        this.zzb = eVar;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long b10 = this.zzb.b();
        boolean z10 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b11 = this.zzb.b();
        if (decodeByteArray != null) {
            long j10 = b11 - b10;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            }
            n1.a("Decoded image w: " + width + " h:" + height + " bytes: " + allocationByteCount + " time: " + j10 + " on ui thread: " + z10);
        }
        return decodeByteArray;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Bitmap zza(double d10, boolean z10, zzakk zzakk) {
        byte[] bArr = zzakk.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzfI)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) a0.c().zzb(zzbar.zzfJ)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final zzfut zzb(String str, double d10, boolean z10) {
        return zzfuj.zzl(this.zza.a(str), new zzdir(this, d10, z10), this.zzc);
    }
}
