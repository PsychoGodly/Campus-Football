package com.startapp;

import java.io.File;

/* compiled from: Sta */
public class v6 {

    /* renamed from: a  reason: collision with root package name */
    public static t6 f17412a;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r11) {
        /*
            android.content.Context r0 = com.startapp.h0.a(r11)
            if (r0 == 0) goto L_0x0007
            r11 = r0
        L_0x0007:
            com.startapp.t6 r0 = f17412a
            if (r0 != 0) goto L_0x0012
            com.startapp.t6 r0 = new com.startapp.t6
            r0.<init>(r11)
            f17412a = r0
        L_0x0012:
            com.startapp.t6 r0 = f17412a
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String[] r2 = com.startapp.u6.f17370a
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.addAll(r2)
            boolean r1 = r0.a((java.util.List<java.lang.String>) r1)
            java.lang.String r2 = "test-keys"
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x007f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String[] r5 = com.startapp.u6.f17371b
            java.util.List r5 = java.util.Arrays.asList(r5)
            r1.addAll(r5)
            boolean r1 = r0.a((java.util.List<java.lang.String>) r1)
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "su"
            boolean r1 = r0.a((java.lang.String) r1)
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "busybox"
            boolean r1 = r0.a((java.lang.String) r1)
            if (r1 != 0) goto L_0x007f
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x007f
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L_0x006b
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x006b
            r1 = 1
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            if (r1 != 0) goto L_0x007f
            boolean r1 = r0.c()
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "magisk"
            boolean r0 = r0.a((java.lang.String) r1)
            if (r0 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r0 = 0
            goto L_0x0080
        L_0x007f:
            r0 = 1
        L_0x0080:
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = android.os.Build.TAGS
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x008e
            r0 = 1
            goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            if (r0 != 0) goto L_0x00dc
            boolean r0 = a()
            if (r0 != 0) goto L_0x00dc
            boolean r0 = a()
            if (r0 != 0) goto L_0x00dc
            boolean r0 = b()
            if (r0 != 0) goto L_0x00dc
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "/system/app/Superuser.apk"
            r0.<init>(r1)     // Catch:{ all -> 0x00af }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00af }
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r0 != 0) goto L_0x00dc
            r0 = 6
            java.lang.String r5 = "com.noshufou.android.su"
            java.lang.String r6 = "com.thirdparty.superuser"
            java.lang.String r7 = "eu.chainfire.supersu"
            java.lang.String r8 = "com.koushikdutta.superuser"
            java.lang.String r9 = "com.zachspong.temprootremovejb"
            java.lang.String r10 = "com.ramdroid.appquarantine"
            java.lang.String[] r1 = new java.lang.String[]{r5, r6, r7, r8, r9, r10}
            r2 = 0
        L_0x00c4:
            if (r2 >= r0) goto L_0x00d9
            r5 = r1[r2]
            android.content.pm.PackageManager r6 = r11.getPackageManager()
            r6.getPackageInfo(r5, r4)     // Catch:{ all -> 0x00d1 }
            r5 = 1
            goto L_0x00d2
        L_0x00d1:
            r5 = 0
        L_0x00d2:
            if (r5 == 0) goto L_0x00d6
            r11 = 1
            goto L_0x00da
        L_0x00d6:
            int r2 = r2 + 1
            goto L_0x00c4
        L_0x00d9:
            r11 = 0
        L_0x00da:
            if (r11 == 0) goto L_0x00dd
        L_0x00dc:
            r3 = 1
        L_0x00dd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.v6.a(android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b() {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "/system/xbin/which"
            java.lang.String r3 = "su"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ all -> 0x002c }
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ all -> 0x002c }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x002a }
            java.io.InputStream r4 = r1.getInputStream()     // Catch:{ all -> 0x002a }
            r3.<init>(r4)     // Catch:{ all -> 0x002a }
            r2.<init>(r3)     // Catch:{ all -> 0x002a }
            java.lang.String r2 = r2.readLine()     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0026
            r0 = 1
        L_0x0026:
            r1.destroy()
            return r0
        L_0x002a:
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.destroy()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.v6.b():boolean");
    }

    public static boolean a() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (new File(strArr[i10]).exists()) {
                return true;
            }
        }
        return false;
    }
}
