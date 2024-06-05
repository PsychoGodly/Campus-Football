package com.startapp.sdk.ads.splash;

import android.app.Activity;
import android.content.Context;
import com.startapp.d9;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class SplashMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile SplashMetaData f16587a = new SplashMetaData();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f16588b = new Object();
    private static final long serialVersionUID = 5949259263399692883L;
    @d9(complex = true)
    private SplashConfig SplashConfig = new SplashConfig();
    private String splashMetadataUpdateVersion = "4.10.12";

    public SplashConfig a() {
        return this.SplashConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashMetaData splashMetaData = (SplashMetaData) obj;
        if (!j9.a(this.SplashConfig, splashMetaData.SplashConfig) || !j9.a(this.splashMetadataUpdateVersion, splashMetaData.splashMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.SplashConfig, this.splashMetadataUpdateVersion};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, SplashMetaData splashMetaData) {
        synchronized (f16588b) {
            splashMetaData.splashMetadataUpdateVersion = "4.10.12";
            f16587a = splashMetaData;
            f2.a(context, "StartappSplashMetadata", (Serializable) splashMetaData);
        }
    }

    public static void a(Context context) {
        SplashMetaData splashMetaData = (SplashMetaData) f2.a(context, "StartappSplashMetadata", SplashMetaData.class);
        SplashMetaData splashMetaData2 = new SplashMetaData();
        if (splashMetaData != null) {
            boolean b10 = j9.b(splashMetaData, splashMetaData2);
            if (!(!"4.10.12".equals(splashMetaData.splashMetadataUpdateVersion)) && b10) {
                i3 i3Var = new i3(j3.f15952e);
                i3Var.f15914d = "metadata_null";
                i3Var.a();
            }
            f16587a = splashMetaData;
            return;
        }
        f16587a = splashMetaData2;
    }
}
