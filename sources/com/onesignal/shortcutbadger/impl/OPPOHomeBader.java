package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import na.a;
import na.b;

public class OPPOHomeBader implements a {

    /* renamed from: a  reason: collision with root package name */
    private int f28179a = -1;

    private void c(Context context, ComponentName componentName, int i10) throws b {
        if (i10 == 0) {
            i10 = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i10);
        intent.putExtra("upgradeNumber", i10);
        oa.a.c(context, intent);
    }

    private void d(Context context, int i10) throws b {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i10);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new b("Unable to execute Badge By Content Provider");
        }
    }

    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    public void b(Context context, ComponentName componentName, int i10) throws b {
        if (this.f28179a != i10) {
            this.f28179a = i10;
            if (Build.VERSION.SDK_INT >= 11) {
                d(context, i10);
            } else {
                c(context, componentName, i10);
            }
        }
    }
}
