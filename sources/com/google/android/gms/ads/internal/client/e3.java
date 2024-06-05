package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final /* synthetic */ class e3 implements InitializationStatus {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m3 f14459a;

    public /* synthetic */ e3(m3 m3Var) {
        this.f14459a = m3Var;
    }

    public final Map getAdapterStatusMap() {
        m3 m3Var = this.f14459a;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new h3(m3Var));
        return hashMap;
    }
}
