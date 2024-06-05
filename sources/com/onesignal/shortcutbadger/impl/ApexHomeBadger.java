package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import na.a;
import na.b;

public class ApexHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", componentName.getClassName());
        if (oa.a.a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new b("unable to resolve intent: " + intent.toString());
    }
}
