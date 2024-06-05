package com.unity3d.ads.core.domain;

import android.content.Context;
import kotlin.jvm.internal.m;

/* compiled from: AndroidHandleOpenUrl.kt */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;

    public AndroidHandleOpenUrl(Context context2) {
        m.e(context2, "context");
        this.context = context2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if ((r5.length() > 0) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.m.e(r4, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto L_0x0019
            int r2 = r5.length()
            if (r2 <= 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            if (r2 == 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r5 = r1
        L_0x001a:
            r0.setPackage(r5)
            java.lang.String r5 = "android.intent.action.VIEW"
            r0.setAction(r5)
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r0.setData(r4)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r4)
            android.content.Context r4 = r3.context
            r4.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleOpenUrl.invoke(java.lang.String, java.lang.String):void");
    }
}
