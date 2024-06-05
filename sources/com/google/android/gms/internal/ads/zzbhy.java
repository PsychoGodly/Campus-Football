package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbhy {
    public static final Intent zza(Uri uri, Context context, zzapw zzapw, View view) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final Intent zzb(Intent intent, ResolveInfo resolveInfo, Context context, zzapw zzapw, View view) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final ResolveInfo zzc(Intent intent, Context context, zzapw zzapw, View view) {
        return zzd(intent, new ArrayList(), context, zzapw, view);
    }

    public static final ResolveInfo zzd(Intent intent, ArrayList arrayList, Context context, zzapw zzapw, View view) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            t.q().zzu(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }
}
