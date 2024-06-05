package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.d9;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j9;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class CacheMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile CacheMetaData f16922a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;
    @d9(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private String cacheMetaDataUpdateVersion = "4.10.12";
    private float sendCacheSizeProb = 20.0f;

    public static CacheMetaData b() {
        return f16922a;
    }

    public static boolean d() {
        ACMConfig aCMConfig = f16922a.ACM;
        if (aCMConfig != null) {
            Object obj = StartAppSDKInternal.D;
            if (aCMConfig.a(StartAppSDKInternal.d.f16847a.f16823q)) {
                return true;
            }
        }
        return false;
    }

    public ACMConfig a() {
        return this.ACM;
    }

    public float c() {
        return this.sendCacheSizeProb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheMetaData cacheMetaData = (CacheMetaData) obj;
        if (Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) != 0 || !j9.a(this.ACM, cacheMetaData.ACM) || !j9.a(this.cacheMetaDataUpdateVersion, cacheMetaData.cacheMetaDataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "4.10.12";
        f16922a = cacheMetaData;
        f2.a(context, "StartappCacheMetadata", (Serializable) cacheMetaData);
    }

    public static void a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) f2.a(context, "StartappCacheMetadata", CacheMetaData.class);
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean b10 = j9.b(cacheMetaData, cacheMetaData2);
            if (!(!"4.10.12".equals(cacheMetaData.cacheMetaDataUpdateVersion)) && b10) {
                i3 i3Var = new i3(j3.f15952e);
                i3Var.f15914d = "metadata_null";
                i3Var.a();
            }
            f16922a = cacheMetaData;
            return;
        }
        f16922a = cacheMetaData2;
    }
}
