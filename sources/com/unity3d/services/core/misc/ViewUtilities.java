package com.unity3d.services.core.misc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.core.log.DeviceLog;

public class ViewUtilities {
    public static float dpFromPx(Context context, float f10) {
        return f10 / context.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(Context context, float f10) {
        return f10 * context.getResources().getDisplayMetrics().density;
    }

    public static void removeViewFromParent(View view) {
        if (view != null && view.getParent() != null) {
            try {
                ((ViewGroup) view.getParent()).removeView(view);
            } catch (Exception e10) {
                DeviceLog.exception("Error while removing view from it's parent", e10);
            }
        }
    }

    public static void setBackground(View view, Drawable drawable) {
        Class<View> cls = View.class;
        String str = Build.VERSION.SDK_INT < 16 ? "setBackgroundDrawable" : "setBackground";
        try {
            cls.getMethod(str, new Class[]{Drawable.class}).invoke(view, new Object[]{drawable});
        } catch (Exception e10) {
            DeviceLog.exception("Couldn't run" + str, e10);
        }
    }
}
