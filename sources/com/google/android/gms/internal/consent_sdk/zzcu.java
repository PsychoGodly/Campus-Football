package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzcu {
    private static Boolean zza;

    private zzcu() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zza(android.webkit.WebView r3, java.lang.String r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x002c
            java.lang.Class<com.google.android.gms.internal.consent_sdk.zzcu> r0 = com.google.android.gms.internal.consent_sdk.zzcu.class
            monitor-enter(r0)
            java.lang.Boolean r1 = zza     // Catch:{ all -> 0x0029 }
            r2 = 0
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "(function(){})()"
            r3.evaluateJavascript(r1, r2)     // Catch:{ IllegalStateException -> 0x0018 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x0018 }
            zza = r1     // Catch:{ IllegalStateException -> 0x0018 }
            goto L_0x001c
        L_0x0018:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0029 }
            zza = r1     // Catch:{ all -> 0x0029 }
        L_0x001c:
            java.lang.Boolean r1 = zza     // Catch:{ all -> 0x0029 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x002c
            r3.evaluateJavascript(r4, r2)
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        L_0x002c:
            java.lang.String r0 = "javascript:"
            java.lang.String r4 = r0.concat(r4)
            r3.loadUrl(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzcu.zza(android.webkit.WebView, java.lang.String):void");
    }
}
