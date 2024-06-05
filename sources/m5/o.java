package m5;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static String f20104a;

    /* renamed from: b  reason: collision with root package name */
    private static int f20105b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = f20104a
            if (r0 != 0) goto L_0x0058
            int r0 = f20105b
            if (r0 != 0) goto L_0x000e
            int r0 = android.os.Process.myPid()
            f20105b = r0
        L_0x000e:
            r1 = 0
            if (r0 > 0) goto L_0x0012
            goto L_0x0056
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            r2.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            r2.append(r0)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0048 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0048 }
            r4.<init>(r0)     // Catch:{ all -> 0x0048 }
            r3.<init>(r4)     // Catch:{ all -> 0x0048 }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0053, all -> 0x0045 }
            com.google.android.gms.common.internal.q.k(r0)     // Catch:{ IOException -> 0x0053, all -> 0x0045 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException -> 0x0053, all -> 0x0045 }
            goto L_0x0053
        L_0x0045:
            r0 = move-exception
            r1 = r3
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            throw r0     // Catch:{ IOException -> 0x0052, all -> 0x004d }
        L_0x004d:
            r0 = move-exception
        L_0x004e:
            m5.k.a(r1)
            throw r0
        L_0x0052:
            r3 = r1
        L_0x0053:
            m5.k.a(r3)
        L_0x0056:
            f20104a = r1
        L_0x0058:
            java.lang.String r0 = f20104a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.o.a():java.lang.String");
    }
}
