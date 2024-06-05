package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import o5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15487a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f15488b;

    /* renamed from: c  reason: collision with root package name */
    private static String f15489c;

    /* renamed from: d  reason: collision with root package name */
    private static int f15490d;

    public static int a(Context context) {
        b(context);
        return f15490d;
    }

    private static void b(Context context) {
        synchronized (f15487a) {
            if (!f15488b) {
                f15488b = true;
                try {
                    Bundle bundle = c.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f15489c = bundle.getString("com.google.app.id");
                        f15490d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            }
        }
    }
}
