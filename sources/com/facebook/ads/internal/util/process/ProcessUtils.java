package com.facebook.ads.internal.util.process;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
public final class ProcessUtils {
    private static String sProcessName;
    private static final AtomicBoolean sRemoteRenderingProcess = new AtomicBoolean();

    private ProcessUtils() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        return getProcessNameAPI28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r3 = r3.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if ((r3 instanceof android.app.Application) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        r3 = getProcessNameViaReflection((android.app.Application) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        sProcessName = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getProcessName(android.content.Context r3) {
        /*
            java.lang.Class<com.facebook.ads.internal.util.process.ProcessUtils> r0 = com.facebook.ads.internal.util.process.ProcessUtils.class
            monitor-enter(r0)
            java.lang.String r1 = sProcessName     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r1
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0015
            java.lang.String r3 = getProcessNameAPI28()
            return r3
        L_0x0015:
            android.content.Context r3 = r3.getApplicationContext()
            boolean r1 = r3 instanceof android.app.Application
            if (r1 == 0) goto L_0x002b
            android.app.Application r3 = (android.app.Application) r3
            java.lang.String r3 = getProcessNameViaReflection(r3)
            monitor-enter(r0)
            sProcessName = r3     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r3
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        L_0x002b:
            r3 = 0
            return r3
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.util.process.ProcessUtils.getProcessName(android.content.Context):java.lang.String");
    }

    private static String getProcessNameAPI28() {
        try {
            return (String) Application.class.getMethod("getProcessName", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String getProcessNameViaReflection(Application application) {
        try {
            Field field = application.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(application);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            return (String) obj2.getClass().getDeclaredMethod("getProcessName", (Class[]) null).invoke(obj2, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getProcessSpecificName(String str, Context context) {
        String packageName = context.getPackageName();
        String processName = getProcessName(context);
        if (TextUtils.isEmpty(processName) || packageName.equals(processName)) {
            return str;
        }
        if (processName.contains(":")) {
            processName = processName.split(":")[1];
        }
        return str + "_" + processName;
    }

    public static boolean isRemoteRenderingProcess() {
        return sRemoteRenderingProcess.get();
    }

    public static void setRemoteRenderingProcess(boolean z10) {
        sRemoteRenderingProcess.set(z10);
    }
}
