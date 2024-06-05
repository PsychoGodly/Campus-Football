package com.startapp.sdk.common;

import android.net.Uri;

/* compiled from: Sta */
public class SDKException extends Exception {
    private static final long serialVersionUID = 1203685012128929267L;
    private String method;
    private boolean retry;
    private int statusCode;
    private Uri uri;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SDKException(java.lang.String r5, android.net.Uri r6, int r7, boolean r8, java.lang.Throwable r9) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r1 = 32
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x0026
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ", status "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            r0.append(r2)
            if (r8 == 0) goto L_0x002e
            java.lang.String r1 = ", retry"
        L_0x002e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r9)
            r4.method = r5
            r4.uri = r6
            r4.statusCode = r7
            r4.retry = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.SDKException.<init>(java.lang.String, android.net.Uri, int, boolean, java.lang.Throwable):void");
    }

    public int a() {
        return this.statusCode;
    }

    public Uri b() {
        return this.uri;
    }

    public SDKException() {
    }

    public SDKException(String str, Throwable th) {
        super(str, th);
    }
}
