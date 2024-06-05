package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbyt;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class d2 extends c2 {
    static final boolean m(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    public final boolean e(Activity activity, Configuration configuration) {
        if (!((Boolean) a0.c().zzb(zzbar.zzes)).booleanValue()) {
            return false;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzeu)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        x.b();
        int zzy = zzbyt.zzy(activity, configuration.screenHeightDp);
        int zzy2 = zzbyt.zzy(activity, configuration.screenWidthDp);
        t.r();
        DisplayMetrics P = b2.P((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i10 = P.heightPixels;
        int i11 = P.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) a0.c().zzb(zzbar.zzeq)).intValue();
        if (!m(i10, zzy + dimensionPixelSize, round) || !m(i11, zzy2, round)) {
            return true;
        }
        return false;
    }
}
