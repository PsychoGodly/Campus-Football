package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;

public class t0 {

    /* renamed from: e  reason: collision with root package name */
    private static t0 f12200e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f12201f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f12202a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12203b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12204c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12205d;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[SYNTHETIC, Splitter:B:21:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private t0(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "AndroidManifest"
            r9.<init>()
            r1 = 0
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0023, all -> 0x001f }
            java.lang.String r3 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x0023, all -> 0x001f }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0023, all -> 0x001f }
            android.os.Bundle r3 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0023, all -> 0x001f }
            java.lang.String r1 = r2.processName     // Catch:{ NameNotFoundException -> 0x001d }
            r9.f12202a = r3
            r9.f12205d = r1
            goto L_0x002e
        L_0x001d:
            r2 = move-exception
            goto L_0x0025
        L_0x001f:
            r10 = move-exception
            r3 = r1
            goto L_0x00a7
        L_0x0023:
            r2 = move-exception
            r3 = r1
        L_0x0025:
            java.lang.String r4 = "Failed to get meta data."
            com.applovin.impl.sdk.t.c(r0, r4, r2)     // Catch:{ all -> 0x00a6 }
            r9.f12202a = r3
            r9.f12205d = r1
        L_0x002e:
            r1 = 0
            android.content.res.AssetManager r10 = r10.getAssets()     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r10 = r10.openXmlResourceParser(r2)     // Catch:{ all -> 0x0094 }
            int r2 = r10.getEventType()     // Catch:{ all -> 0x0094 }
            r3 = 0
            r4 = 0
        L_0x003f:
            r5 = 2
            r6 = 1
            if (r5 != r2) goto L_0x0086
            java.lang.String r2 = r10.getName()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = "application"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0086
            r2 = 0
        L_0x0050:
            int r5 = r10.getAttributeCount()     // Catch:{ all -> 0x0091 }
            if (r2 >= r5) goto L_0x0086
            java.lang.String r5 = r10.getAttributeName(r2)     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = r10.getAttributeValue(r2)     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = "networkSecurityConfig"
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0091 }
            if (r8 == 0) goto L_0x0073
            java.lang.String r5 = r7.substring(r6)     // Catch:{ all -> 0x0091 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0091 }
            int r3 = r5.intValue()     // Catch:{ all -> 0x0091 }
            goto L_0x0083
        L_0x0073:
            java.lang.String r8 = "usesCleartextTraffic"
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x0083
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0091 }
            boolean r4 = r5.booleanValue()     // Catch:{ all -> 0x0091 }
        L_0x0083:
            int r2 = r2 + 1
            goto L_0x0050
        L_0x0086:
            int r2 = r10.next()     // Catch:{ all -> 0x0091 }
            if (r2 != r6) goto L_0x003f
            r9.f12203b = r3
            r9.f12204c = r4
            goto L_0x009f
        L_0x0091:
            r10 = move-exception
            r1 = r4
            goto L_0x0096
        L_0x0094:
            r10 = move-exception
            r3 = 0
        L_0x0096:
            java.lang.String r2 = "Failed to parse AndroidManifest.xml."
            com.applovin.impl.sdk.t.c(r0, r2, r10)     // Catch:{ all -> 0x00a0 }
            r9.f12203b = r3
            r9.f12204c = r1
        L_0x009f:
            return
        L_0x00a0:
            r10 = move-exception
            r9.f12203b = r3
            r9.f12204c = r1
            throw r10
        L_0x00a6:
            r10 = move-exception
        L_0x00a7:
            r9.f12202a = r3
            r9.f12205d = r1
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.t0.<init>(android.content.Context):void");
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f12202a;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }

    public String a(String str, String str2) {
        Bundle bundle = this.f12202a;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public String a() {
        return this.f12205d;
    }

    public boolean a(String str) {
        Bundle bundle = this.f12202a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public static t0 a(Context context) {
        t0 t0Var;
        synchronized (f12201f) {
            if (f12200e == null) {
                f12200e = new t0(context);
            }
            t0Var = f12200e;
        }
        return t0Var;
    }
}
