package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzbar;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class g2 extends e2 {
    static final /* synthetic */ WindowInsets n(Activity activity, View view, WindowInsets windowInsets) {
        if (t.q().zzh().zzm() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = MaxReward.DEFAULT_LABEL;
            if (displayCutout != null) {
                p1 zzh = t.q().zzh();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzh.g(str);
            } else {
                t.q().zzh().g(str);
            }
        }
        o(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void o(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = 1;
        if (true != z10) {
            i11 = 2;
        }
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    public final int i(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    public final void j(Activity activity) {
        if (((Boolean) a0.c().zzb(zzbar.zzaZ)).booleanValue() && t.q().zzh().zzm() == null && !activity.isInMultiWindowMode()) {
            o(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new f2(this, activity));
        }
    }
}
