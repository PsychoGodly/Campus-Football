package com.google.firebase.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import y6.f;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f26634a;

    /* renamed from: b  reason: collision with root package name */
    private String f26635b;

    /* renamed from: c  reason: collision with root package name */
    private String f26636c;

    /* renamed from: d  reason: collision with root package name */
    private int f26637d;

    /* renamed from: e  reason: collision with root package name */
    private int f26638e = 0;

    public n(Context context) {
        this.f26634a = context;
    }

    public static String c(f fVar) {
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
            return this.f26634a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f10 = f(this.f26634a.getPackageName());
        if (f10 != null) {
            this.f26635b = Integer.toString(f10.versionCode);
            this.f26636c = f10.versionName;
        }
    }

    public synchronized String a() {
        if (this.f26635b == null) {
            h();
        }
        return this.f26635b;
    }

    public synchronized String b() {
        if (this.f26636c == null) {
            h();
        }
        return this.f26636c;
    }

    public synchronized int d() {
        PackageInfo f10;
        if (this.f26637d == 0 && (f10 = f("com.google.android.gms")) != null) {
            this.f26637d = f10.versionCode;
        }
        return this.f26637d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int e() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f26638e     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f26634a     // Catch:{ all -> 0x0079 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r2 = "com.google.android.gms"
            int r1 = r0.checkPermission(r1, r2)     // Catch:{ all -> 0x0079 }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0022
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r3
        L_0x0022:
            boolean r1 = m5.m.i()     // Catch:{ all -> 0x0079 }
            r2 = 1
            if (r1 != 0) goto L_0x0046
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0079 }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0046
            int r1 = r1.size()     // Catch:{ all -> 0x0079 }
            if (r1 > 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            r5.f26638e = r2     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r2
        L_0x0046:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x0079 }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x0079 }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x0079 }
            r1 = 2
            if (r0 == 0) goto L_0x0064
            int r0 = r0.size()     // Catch:{ all -> 0x0079 }
            if (r0 > 0) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            r5.f26638e = r1     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x0079 }
            boolean r0 = m5.m.i()     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0075
            r5.f26638e = r1     // Catch:{ all -> 0x0079 }
            r2 = 2
            goto L_0x0077
        L_0x0075:
            r5.f26638e = r2     // Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r5)
            return r2
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.n.e():int");
    }

    public boolean g() {
        return e() != 0;
    }
}
