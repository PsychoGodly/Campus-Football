package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
public class d2 {
    public static void a(String str, boolean z10, String str2, String str3) {
        try {
            AdCallbacksConfig a10 = MetaData.f17070k.analytics.a();
            if (a10 != null) {
                if ((a10.a() || z10) && a10.a(str)) {
                    i3 i3Var = new i3(j3.f15951d);
                    i3Var.f15914d = "adCallback";
                    i3Var.f15919i = str;
                    i3Var.f15917g = str2;
                    i3Var.f15915e = str3;
                    i3Var.a();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
