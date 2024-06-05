package com.applovin.impl;

import android.media.MediaCodec;

public class ed extends m5 {

    /* renamed from: a  reason: collision with root package name */
    public final fd f7412a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7413b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ed(java.lang.Throwable r4, com.applovin.impl.fd r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            java.lang.String r2 = r5.f7722a
        L_0x0011:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f7412a = r5
            int r5 = com.applovin.impl.yp.f13662a
            r0 = 21
            if (r5 < r0) goto L_0x0027
            java.lang.String r1 = a(r4)
        L_0x0027:
            r3.f7413b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ed.<init>(java.lang.Throwable, com.applovin.impl.fd):void");
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
