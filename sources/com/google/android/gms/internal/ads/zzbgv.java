package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzbgv implements zzbhp {
    zzbgv() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzcei = (zzcei) obj;
        t.r();
        DisplayMetrics P = b2.P((WindowManager) zzcei.getContext().getSystemService("window"));
        int i10 = P.widthPixels;
        int i11 = P.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcei).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i10));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
        zzcei.zzd("locationReady", hashMap);
        zzbza.zzj("GET LOCATION COMPILED");
    }
}
