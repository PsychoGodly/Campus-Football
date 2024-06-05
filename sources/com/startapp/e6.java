package com.startapp;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;

/* compiled from: Sta */
public final class e6 {

    /* renamed from: a  reason: collision with root package name */
    public static db f15779a = new db();

    public static void a(Context context) {
        db dbVar = f15779a;
        Context applicationContext = context.getApplicationContext();
        fc.a((Object) applicationContext, "Application Context cannot be null");
        if (!dbVar.f15765a) {
            dbVar.f15765a = true;
            kc a10 = kc.a();
            a10.f16072c.getClass();
            lb lbVar = new lb();
            hc hcVar = a10.f16071b;
            Handler handler = new Handler();
            hcVar.getClass();
            a10.f16073d = new cc(handler, applicationContext, lbVar, a10);
            nb nbVar = nb.f16187d;
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(nbVar);
            }
            WindowManager windowManager = qb.f16328a;
            qb.f16330c = applicationContext.getResources().getDisplayMetrics().density;
            qb.f16328a = (WindowManager) applicationContext.getSystemService("window");
            zb.f17611b.f17612a = applicationContext.getApplicationContext();
        }
    }
}
