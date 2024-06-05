package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final /* synthetic */ class k5 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ i5 f24742a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f24743b;

    public /* synthetic */ k5(i5 i5Var, String str) {
        this.f24742a = i5Var;
        this.f24743b = str;
    }

    public final Object call() {
        i5 i5Var = this.f24742a;
        String str = this.f24743b;
        r5 y02 = i5Var.l().y0(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        hashMap.put("gmp_version", 82001L);
        if (y02 != null) {
            String h10 = y02.h();
            if (h10 != null) {
                hashMap.put("app_version", h10);
            }
            hashMap.put("app_version_int", Long.valueOf(y02.z()));
            hashMap.put("dynamite_version", Long.valueOf(y02.c0()));
        }
        return hashMap;
    }
}
