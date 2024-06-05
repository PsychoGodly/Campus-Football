package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: ServiceStarter */
public class u0 {

    /* renamed from: e  reason: collision with root package name */
    private static u0 f26897e;

    /* renamed from: a  reason: collision with root package name */
    private String f26898a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f26899b = null;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f26900c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Intent> f26901d = new ArrayDeque();

    private u0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentName;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f10);
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                componentName = f1.h(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            return 401;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
            return 402;
        }
    }

    static synchronized u0 b() {
        u0 u0Var;
        synchronized (u0.class) {
            if (f26897e == null) {
                f26897e = new u0();
            }
            u0Var = f26897e;
        }
        return u0Var;
    }

    private synchronized String f(Context context, Intent intent) {
        String str = this.f26898a;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (serviceInfo != null) {
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str2 = serviceInfo.name;
                    if (str2 != null) {
                        if (str2.startsWith(".")) {
                            this.f26898a = context.getPackageName() + serviceInfo.name;
                        } else {
                            this.f26898a = serviceInfo.name;
                        }
                        return this.f26898a;
                    }
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH + serviceInfo.name);
                return null;
            }
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* access modifiers changed from: package-private */
    public Intent c() {
        return this.f26901d.poll();
    }

    /* access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.f26900c == null) {
            this.f26900c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f26899b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f26900c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean e(Context context) {
        if (this.f26899b == null) {
            this.f26899b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f26899b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f26899b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f26901d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
