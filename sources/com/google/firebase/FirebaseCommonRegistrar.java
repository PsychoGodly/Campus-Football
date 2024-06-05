package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.applovin.mediation.MaxReward;
import com.google.firebase.components.ComponentRegistrar;
import e7.c;
import java.util.ArrayList;
import java.util.List;
import l8.e;
import l8.h;
import y6.i;
import y6.j;
import y6.k;
import z7.f;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : MaxReward.DEFAULT_LABEL;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? MaxReward.DEFAULT_LABEL : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 16 && context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (i10 >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i10 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? MaxReward.DEFAULT_LABEL : "embedded";
        }
        return "auto";
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : MaxReward.DEFAULT_LABEL;
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(l8.c.c());
        arrayList.add(f.g());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "20.4.2"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", i.f39382a));
        arrayList.add(h.c("android-min-sdk", j.f39383a));
        arrayList.add(h.c("android-platform", k.f39384a));
        arrayList.add(h.c("android-installer", y6.h.f39381a));
        String a10 = e.a();
        if (a10 != null) {
            arrayList.add(h.b("kotlin", a10));
        }
        return arrayList;
    }
}
