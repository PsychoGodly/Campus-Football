package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Arrays;
import java.util.List;
import na.a;
import na.b;

public class VivoHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i10);
        context.sendBroadcast(intent);
    }
}
