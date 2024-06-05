package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;

public class CustomTabsHelper {
    static final String BETA_PACKAGE = "com.chrome.beta";
    static final String DEV_PACKAGE = "com.chrome.dev";
    protected static final String EXTRA_CUSTOM_TABS_KEEP_ALIVE = "android.support.customtabs.extra.KEEP_ALIVE";
    static final String LOCAL_PACKAGE = "com.google.android.apps.chrome";
    static final String STABLE_PACKAGE = "com.android.chrome";
    protected static final String TAG = "CustomTabsHelper";
    private static String sPackageNameToUse;

    private CustomTabsHelper() {
    }

    public static void addKeepAliveExtra(Context context, Intent intent) {
        intent.putExtra(EXTRA_CUSTOM_TABS_KEEP_ALIVE, new Intent().setClassName(context.getPackageName(), KeepAliveService.class.getCanonicalName()));
    }

    public static String getPackageNameToUse(Context context) {
        String str = sPackageNameToUse;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        intent.addCategory("android.intent.category.BROWSABLE");
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, Build.VERSION.SDK_INT >= 23 ? 131072 : 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(next.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            sPackageNameToUse = null;
        } else if (arrayList.size() == 1) {
            sPackageNameToUse = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2) && !hasSpecializedHandlerIntents(context, intent) && arrayList.contains(str2)) {
            sPackageNameToUse = str2;
        } else if (arrayList.contains(STABLE_PACKAGE)) {
            sPackageNameToUse = STABLE_PACKAGE;
        } else if (arrayList.contains(BETA_PACKAGE)) {
            sPackageNameToUse = BETA_PACKAGE;
        } else if (arrayList.contains(DEV_PACKAGE)) {
            sPackageNameToUse = DEV_PACKAGE;
        } else if (arrayList.contains(LOCAL_PACKAGE)) {
            sPackageNameToUse = LOCAL_PACKAGE;
        }
        return sPackageNameToUse;
    }

    public static String[] getPackages() {
        return new String[]{MaxReward.DEFAULT_LABEL, STABLE_PACKAGE, BETA_PACKAGE, DEV_PACKAGE, LOCAL_PACKAGE};
    }

    private static boolean hasSpecializedHandlerIntents(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo next : queryIntentActivities) {
                        IntentFilter intentFilter = next.filter;
                        if (intentFilter != null) {
                            if (intentFilter.countDataAuthorities() == 0) {
                                continue;
                            } else if (intentFilter.countDataPaths() != 0) {
                                if (next.activityInfo != null) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e(TAG, "Runtime exception while getting specialized handlers");
        }
    }
}
