package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import na.a;
import na.b;

public class SamsungHomeBadger implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f28180b = {"_id", "class"};

    /* renamed from: a  reason: collision with root package name */
    private DefaultBadger f28181a;

    public SamsungHomeBadger() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f28181a = new DefaultBadger();
        }
    }

    private ContentValues c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    public List<String> a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    public void b(Context context, ComponentName componentName, int i10) throws b {
        DefaultBadger defaultBadger = this.f28181a;
        if (defaultBadger == null || !defaultBadger.c(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f28180b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z10 = false;
                    while (cursor.moveToNext()) {
                        int i11 = cursor.getInt(0);
                        contentResolver.update(parse, c(componentName, i10, false), "_id=?", new String[]{String.valueOf(i11)});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        contentResolver.insert(parse, c(componentName, i10, true));
                    }
                }
            } finally {
                oa.b.a(cursor);
            }
        } else {
            this.f28181a.b(context, componentName, i10);
        }
    }
}
