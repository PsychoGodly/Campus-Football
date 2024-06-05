package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import m5.m;
import y6.f;

/* compiled from: Metadata */
class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26824a;

    /* renamed from: b  reason: collision with root package name */
    private String f26825b;

    /* renamed from: c  reason: collision with root package name */
    private String f26826c;

    /* renamed from: d  reason: collision with root package name */
    private int f26827d;

    /* renamed from: e  reason: collision with root package name */
    private int f26828e = 0;

    j0(Context context) {
        this.f26824a = context;
    }

    static String c(f fVar) {
        String f10 = fVar.r().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = fVar.r().c();
        if (!c10.startsWith("1:")) {
            return c10;
        }
        String[] split = c10.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f26824a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f26824a.getPackageName());
        if (f10 != null) {
            this.f26825b = Integer.toString(f10.versionCode);
            this.f26826c = f10.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.f26825b == null) {
            h();
        }
        return this.f26825b;
    }

    /* access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.f26826c == null) {
            h();
        }
        return this.f26826c;
    }

    /* access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f10;
        if (this.f26827d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f26827d = f10.versionCode;
        }
        return this.f26827d;
    }

    /* access modifiers changed from: package-private */
    public synchronized int e() {
        int i10 = this.f26828e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f26824a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!m.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f26828e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (m.i()) {
                this.f26828e = 2;
            } else {
                this.f26828e = 1;
            }
            return this.f26828e;
        }
        this.f26828e = 2;
        return 2;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}
