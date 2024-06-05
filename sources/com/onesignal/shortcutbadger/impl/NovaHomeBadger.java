package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.List;
import na.a;
import na.b;

public class NovaHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i10) throws b {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", componentName.getPackageName() + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i10));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
