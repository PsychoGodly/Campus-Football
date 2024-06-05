package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdjh implements zzfnj {
    public final /* synthetic */ String zza;
    public final /* synthetic */ double zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdjh(String str, double d10, int i10, int i11) {
        this.zza = str;
        this.zzb = d10;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final Object apply(Object obj) {
        String str = this.zza;
        return new zzbdj(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzb, this.zzc, this.zzd);
    }
}
