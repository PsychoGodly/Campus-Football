package com.applovin.impl.sdk;

import com.applovin.impl.oj;
import com.applovin.impl.zp;
import java.io.File;
import java.util.List;

public class NativeCrashReporter {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11455a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f11456b;

    /* renamed from: c  reason: collision with root package name */
    private static final NativeCrashReporter f11457c = new NativeCrashReporter();

    private NativeCrashReporter() {
    }

    public static void a(k kVar) {
        if (kVar != null) {
            if (((Boolean) kVar.a(oj.A4)).booleanValue() || zp.i(k.k())) {
                if (a()) {
                    List c10 = kVar.c(oj.B4);
                    int[] iArr = new int[c10.size()];
                    for (int i10 = 0; i10 < c10.size(); i10++) {
                        try {
                            iArr[i10] = Integer.parseInt((String) c10.get(i10));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    File file = new File(k.k().getCacheDir(), "al-reports");
                    if (file.exists()) {
                        a(file, kVar);
                    } else if (!file.mkdir()) {
                        kVar.L();
                        if (t.a()) {
                            kVar.L().b("NativeCrashReporter", "Failed to create reports directory");
                            return;
                        }
                        return;
                    }
                    try {
                        f11457c.enable(file.getAbsolutePath(), iArr);
                    } catch (Throwable th) {
                        kVar.L();
                        if (t.a()) {
                            kVar.L().a("NativeCrashReporter", "Failed to enable native crash reporter", th);
                        }
                        kVar.B().a("NativeCrashReporter", "enableInstance", th);
                    }
                }
            } else if (f11456b) {
                try {
                    f11457c.disable();
                } catch (Throwable th2) {
                    kVar.L();
                    if (t.a()) {
                        kVar.L().a("NativeCrashReporter", "Failed to disable native crash reporter", th2);
                    }
                    kVar.B().a("NativeCrashReporter", "disableInstance", th2);
                }
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr);

    private static native String symbolicateSource(String str);

    private static boolean a() {
        if (!f11455a) {
            f11455a = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                f11456b = true;
            } catch (Throwable th) {
                t.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return f11456b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r10, com.applovin.impl.sdk.k r11) {
        /*
            java.lang.String r0 = "Failed to delete native crash report: "
            java.io.File[] r10 = r10.listFiles()
            if (r10 != 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r10.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x00da
            r4 = r10[r3]
            com.applovin.impl.sdk.p r5 = r11.D()
            java.lang.String r5 = r5.e((java.io.File) r4)
            boolean r6 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            java.lang.String r7 = "NativeCrashReporter"
            if (r6 == 0) goto L_0x0063
            java.lang.String r6 = "@@@@@"
            r8 = 3
            java.lang.String[] r5 = r5.split(r6, r8)
            int r6 = r5.length
            if (r6 != r8) goto L_0x0063
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r8 = r5[r2]
            java.lang.String r9 = "error_message"
            r6.put(r9, r8)
            r8 = 1
            r8 = r5[r8]
            java.lang.String r9 = "details"
            r6.put(r9, r8)
            r8 = 2
            r5 = r5[r8]     // Catch:{ all -> 0x004f }
            java.lang.String r5 = symbolicateSource(r5)     // Catch:{ all -> 0x004f }
            com.applovin.impl.sdk.o r8 = r11.B()     // Catch:{ all -> 0x004f }
            com.applovin.impl.sdk.o$b r9 = com.applovin.impl.sdk.o.b.NATIVE_ERROR     // Catch:{ all -> 0x004f }
            r8.a((com.applovin.impl.sdk.o.b) r9, (java.lang.String) r5, (java.util.Map) r6)     // Catch:{ all -> 0x004f }
            goto L_0x0088
        L_0x004f:
            r5 = move-exception
            r11.L()
            boolean r6 = com.applovin.impl.sdk.t.a()
            if (r6 == 0) goto L_0x0088
            com.applovin.impl.sdk.t r6 = r11.L()
            java.lang.String r8 = "Failed to symbolicate native crash report"
            r6.a(r7, r8, r5)
            goto L_0x0088
        L_0x0063:
            r11.L()
            boolean r5 = com.applovin.impl.sdk.t.a()
            if (r5 == 0) goto L_0x0088
            com.applovin.impl.sdk.t r5 = r11.L()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Failed to read native crash error report: "
            r6.append(r8)
            java.lang.String r8 = r4.getAbsolutePath()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.b(r7, r6)
        L_0x0088:
            boolean r5 = r4.delete()     // Catch:{ all -> 0x00b2 }
            if (r5 != 0) goto L_0x00d6
            r11.L()     // Catch:{ all -> 0x00b2 }
            boolean r5 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x00d6
            com.applovin.impl.sdk.t r5 = r11.L()     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r6.<init>()     // Catch:{ all -> 0x00b2 }
            r6.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = r4.getAbsolutePath()     // Catch:{ all -> 0x00b2 }
            r6.append(r8)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b2 }
            r5.b(r7, r6)     // Catch:{ all -> 0x00b2 }
            goto L_0x00d6
        L_0x00b2:
            r5 = move-exception
            r11.L()
            boolean r6 = com.applovin.impl.sdk.t.a()
            if (r6 == 0) goto L_0x00d6
            com.applovin.impl.sdk.t r6 = r11.L()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r6.a(r7, r4, r5)
        L_0x00d6:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.NativeCrashReporter.a(java.io.File, com.applovin.impl.sdk.k):void");
    }
}
