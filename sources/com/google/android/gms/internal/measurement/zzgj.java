package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import r6.l;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class zzgj {

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
    public static class zza {
        private static volatile l<zzgh> zza;

        private zza() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static r6.l<com.google.android.gms.internal.measurement.zzgh> zza(android.content.Context r4) {
            /*
                java.lang.Class<com.google.android.gms.internal.measurement.zzgj$zza> r0 = com.google.android.gms.internal.measurement.zzgj.zza.class
                monitor-enter(r0)
                r6.l<com.google.android.gms.internal.measurement.zzgh> r1 = zza     // Catch:{ all -> 0x0056 }
                if (r1 != 0) goto L_0x0054
                com.google.android.gms.internal.measurement.zzgj r1 = new com.google.android.gms.internal.measurement.zzgj     // Catch:{ all -> 0x0056 }
                r1.<init>()     // Catch:{ all -> 0x0056 }
                java.lang.String r1 = android.os.Build.TYPE     // Catch:{ all -> 0x0056 }
                java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x0056 }
                java.lang.String r3 = "eng"
                boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x0056 }
                if (r3 != 0) goto L_0x0020
                java.lang.String r3 = "userdebug"
                boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0031
            L_0x0020:
                java.lang.String r1 = "dev-keys"
                boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0056 }
                if (r1 != 0) goto L_0x0033
                java.lang.String r1 = "test-keys"
                boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r1 = 0
                goto L_0x0034
            L_0x0033:
                r1 = 1
            L_0x0034:
                if (r1 != 0) goto L_0x003c
                r6.l r4 = r6.l.a()     // Catch:{ all -> 0x0056 }
            L_0x003a:
                r1 = r4
                goto L_0x0052
            L_0x003c:
                boolean r1 = com.google.android.gms.internal.measurement.zzfw.zza()     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x004d
                boolean r1 = r4.isDeviceProtectedStorage()     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0049
                goto L_0x004d
            L_0x0049:
                android.content.Context r4 = r4.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0056 }
            L_0x004d:
                r6.l r4 = com.google.android.gms.internal.measurement.zzgj.zza((android.content.Context) r4)     // Catch:{ all -> 0x0056 }
                goto L_0x003a
            L_0x0052:
                zza = r1     // Catch:{ all -> 0x0056 }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                return r1
            L_0x0056:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgj.zza.zza(android.content.Context):r6.l");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.zzgh zza(android.content.Context r11, java.io.File r12) {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00cf }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00cf }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00cf }
            r2.<init>(r12)     // Catch:{ IOException -> 0x00cf }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00cf }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00cf }
            r1 = 0
            r2 = 1
            androidx.collection.g r3 = new androidx.collection.g     // Catch:{ all -> 0x00b3 }
            r3.<init>()     // Catch:{ all -> 0x00b3 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x00b3 }
            r4.<init>()     // Catch:{ all -> 0x00b3 }
        L_0x001b:
            java.lang.String r5 = r0.readLine()     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = "HermeticFileOverrides"
            if (r5 == 0) goto L_0x0089
            java.lang.String r7 = " "
            r8 = 3
            java.lang.String[] r7 = r5.split(r7, r8)     // Catch:{ all -> 0x00b3 }
            int r9 = r7.length     // Catch:{ all -> 0x00b3 }
            if (r9 == r8) goto L_0x003f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            java.lang.String r8 = "Invalid: "
            r7.<init>(r8)     // Catch:{ all -> 0x00b3 }
            r7.append(r5)     // Catch:{ all -> 0x00b3 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x00b3 }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x00b3 }
            goto L_0x001b
        L_0x003f:
            r5 = r7[r1]     // Catch:{ all -> 0x00b3 }
            java.lang.String r5 = zza((java.lang.String) r5)     // Catch:{ all -> 0x00b3 }
            r6 = r7[r2]     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = zza((java.lang.String) r6)     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = android.net.Uri.decode(r6)     // Catch:{ all -> 0x00b3 }
            r8 = 2
            r9 = r7[r8]     // Catch:{ all -> 0x00b3 }
            java.lang.Object r9 = r4.get(r9)     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x00b3 }
            if (r9 != 0) goto L_0x0071
            r7 = r7[r8]     // Catch:{ all -> 0x00b3 }
            java.lang.String r7 = zza((java.lang.String) r7)     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = android.net.Uri.decode(r7)     // Catch:{ all -> 0x00b3 }
            int r8 = r9.length()     // Catch:{ all -> 0x00b3 }
            r10 = 1024(0x400, float:1.435E-42)
            if (r8 < r10) goto L_0x006e
            if (r9 != r7) goto L_0x0071
        L_0x006e:
            r4.put(r7, r9)     // Catch:{ all -> 0x00b3 }
        L_0x0071:
            boolean r7 = r3.containsKey(r5)     // Catch:{ all -> 0x00b3 }
            if (r7 != 0) goto L_0x007f
            androidx.collection.g r7 = new androidx.collection.g     // Catch:{ all -> 0x00b3 }
            r7.<init>()     // Catch:{ all -> 0x00b3 }
            r3.put(r5, r7)     // Catch:{ all -> 0x00b3 }
        L_0x007f:
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x00b3 }
            androidx.collection.g r5 = (androidx.collection.g) r5     // Catch:{ all -> 0x00b3 }
            r5.put(r6, r9)     // Catch:{ all -> 0x00b3 }
            goto L_0x001b
        L_0x0089:
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00b3 }
            java.lang.String r11 = r11.getPackageName()     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            java.lang.String r5 = "Parsed "
            r4.<init>(r5)     // Catch:{ all -> 0x00b3 }
            r4.append(r12)     // Catch:{ all -> 0x00b3 }
            java.lang.String r12 = " for Android package "
            r4.append(r12)     // Catch:{ all -> 0x00b3 }
            r4.append(r11)     // Catch:{ all -> 0x00b3 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x00b3 }
            android.util.Log.w(r6, r11)     // Catch:{ all -> 0x00b3 }
            com.google.android.gms.internal.measurement.zzgc r11 = new com.google.android.gms.internal.measurement.zzgc     // Catch:{ all -> 0x00b3 }
            r11.<init>(r3)     // Catch:{ all -> 0x00b3 }
            r0.close()     // Catch:{ IOException -> 0x00cf }
            return r11
        L_0x00b3:
            r11 = move-exception
            r0.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00ce
        L_0x00b8:
            r12 = move-exception
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r3 = "addSuppressed"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00ce }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r1] = r5     // Catch:{ Exception -> 0x00ce }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ Exception -> 0x00ce }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00ce }
            r2[r1] = r12     // Catch:{ Exception -> 0x00ce }
            r0.invoke(r11, r2)     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            throw r11     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgj.zza(android.content.Context, java.io.File):com.google.android.gms.internal.measurement.zzgh");
    }

    private static l<File> zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? l.d(file) : l.a();
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return l.a();
        }
    }

    static l<zzgh> zza(Context context) {
        l<zzgh> lVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            l<File> zzb = zzb(context);
            if (zzb.c()) {
                lVar = l.d(zza(context, zzb.b()));
            } else {
                lVar = l.a();
            }
            return lVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
