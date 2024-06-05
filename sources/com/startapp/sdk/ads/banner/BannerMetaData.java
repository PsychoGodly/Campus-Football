package com.startapp.sdk.ads.banner;

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
public class BannerMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static Object f16422a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile BannerMetaData f16423b = new BannerMetaData();
    private static final long serialVersionUID = -6987543640616659467L;
    @d9(complex = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = "4.10.12";

    public BannerOptions a() {
        return this.BannerOptions;
    }

    public BannerOptions b() {
        return new BannerOptions(this.BannerOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerMetaData bannerMetaData = (BannerMetaData) obj;
        if (!j9.a(this.BannerOptions, bannerMetaData.BannerOptions) || !j9.a(this.bannerMetadataUpdateVersion, bannerMetaData.bannerMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.BannerOptions, this.bannerMetadataUpdateVersion};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, BannerMetaData bannerMetaData) {
        synchronized (f16422a) {
            bannerMetaData.bannerMetadataUpdateVersion = "4.10.12";
            f16423b = bannerMetaData;
            f2.a(context, "StartappBannerMetadata", (Serializable) bannerMetaData);
        }
    }

    public static void a(Context context) {
        BannerMetaData bannerMetaData = (BannerMetaData) f2.a(context, "StartappBannerMetadata", BannerMetaData.class);
        BannerMetaData bannerMetaData2 = new BannerMetaData();
        if (bannerMetaData != null) {
            boolean b10 = j9.b(bannerMetaData, bannerMetaData2);
            if (!(!"4.10.12".equals(bannerMetaData.bannerMetadataUpdateVersion)) && b10) {
                i3 i3Var = new i3(j3.f15952e);
                i3Var.f15914d = "metadata_null";
                i3Var.a();
            }
            f16423b = bannerMetaData;
            return;
        }
        f16423b = bannerMetaData2;
    }
}
