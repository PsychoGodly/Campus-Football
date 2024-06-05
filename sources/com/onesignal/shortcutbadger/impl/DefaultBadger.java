package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import na.a;
import na.b;

public class DefaultBadger implements a {
    public List<String> a() {
        return new ArrayList(0);
    }

    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (oa.a.a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new b("unable to resolve intent: " + intent.toString());
    }

    /* access modifiers changed from: package-private */
    public boolean c(Context context) {
        return oa.a.a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"));
    }
}
