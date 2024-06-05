package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import na.a;
import na.b;

public class EverythingMeHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i10) throws b {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i10));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
