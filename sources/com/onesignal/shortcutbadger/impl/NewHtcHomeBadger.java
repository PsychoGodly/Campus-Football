package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import na.a;
import na.b;

public class NewHtcHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i10);
        if (oa.a.a(context, intent) || oa.a.a(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
            return;
        }
        throw new b("unable to resolve intent: " + intent2.toString());
    }
}
