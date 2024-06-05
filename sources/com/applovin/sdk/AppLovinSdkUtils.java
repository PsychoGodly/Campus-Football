package com.applovin.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.applovin.impl.qj;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.un;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLovinSdkUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f14109a = new Handler(Looper.getMainLooper());

    public static final class Size {
        public static final Size ZERO = new Size(0, 0);

        /* renamed from: a  reason: collision with root package name */
        private int f14110a;

        /* renamed from: b  reason: collision with root package name */
        private int f14111b;

        public Size(int i10, int i11) {
            this.f14110a = i10;
            this.f14111b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            if (this.f14110a == size.getWidth() && this.f14111b == size.getHeight()) {
                return true;
            }
            return false;
        }

        public int getHeight() {
            return this.f14111b;
        }

        public int getWidth() {
            return this.f14110a;
        }

        public int hashCode() {
            int i10 = this.f14111b;
            int i11 = this.f14110a;
            return i10 ^ ((i11 >>> 16) | (i11 << 16));
        }

        public String toString() {
            return this.f14110a + "x" + this.f14111b;
        }
    }

    private static boolean a(String str, String str2) {
        return StringUtils.startsWithAtLeastOnePrefix(str, CollectionUtils.explode(str2));
    }

    public static int dpToPx(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    @Deprecated
    public static Boolean getAdditionalConsentStatus(int i10, Context context) {
        return un.a(i10, (String) sj.a(qj.f11016t, (Object) null, PreferenceManager.getDefaultSharedPreferences(context), false));
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    @Deprecated
    public static Boolean getTcfConsentStatus(int i10, Context context) {
        String str = (String) sj.a(qj.f11017u, (Object) null, PreferenceManager.getDefaultSharedPreferences(context), false);
        if (str != null) {
            return Boolean.valueOf(un.a(str, i10 - 1));
        }
        return null;
    }

    public static boolean isEmulator() {
        return a(Build.DEVICE, "goldfish,vbox") || a(Build.HARDWARE, "ranchu,generic,vbox") || a(Build.MANUFACTURER, "Genymotion") || a(Build.MODEL, "Android SDK built for x86");
    }

    public static boolean isFireOS(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= zp.f(str);
    }

    public static boolean isTablet(Context context) {
        Point b10 = x3.b(context);
        return Math.min(b10.x, b10.y) >= dpToPx(context, 600);
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (x3.f()) {
            return packageManager.hasSystemFeature("android.software.leanback");
        }
        return packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i10) {
        return (int) Math.ceil((double) (((float) i10) / context.getResources().getDisplayMetrics().density));
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j10) {
        runOnUiThreadDelayed(runnable, j10, f14109a);
    }

    public static void setImageUrl(String str, ImageView imageView, AppLovinSdk appLovinSdk) {
        ImageViewUtils.setImageUri(imageView, Uri.parse(str), appLovinSdk.a());
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }

    public static void runOnUiThread(boolean z10, Runnable runnable) {
        if (z10 || !zp.h()) {
            f14109a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j10, Handler handler) {
        if (j10 > 0) {
            handler.postDelayed(runnable, j10);
        } else if (zp.h()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
