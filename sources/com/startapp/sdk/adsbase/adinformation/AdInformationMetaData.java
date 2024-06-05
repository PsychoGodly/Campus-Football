package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.d9;
import com.startapp.f2;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j9;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: Sta */
public class AdInformationMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile AdInformationMetaData f16857a = new AdInformationMetaData();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f16858b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;
    @d9(complex = true)
    private AdInformationConfig AdInformation = AdInformationConfig.a();
    private String adInformationMetadataUpdateVersion = "4.10.12";

    public static AdInformationMetaData c() {
        return f16857a;
    }

    public AdInformationConfig a() {
        return this.AdInformation;
    }

    public String b() {
        return this.AdInformation.d();
    }

    public String d() {
        AdInformationConfig adInformationConfig = this.AdInformation;
        EnumMap<AdInformationConfig.ImageResourceType, ImageResourceConfig> enumMap = adInformationConfig.f16856a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        return (!enumMap.containsKey(imageResourceType) || adInformationConfig.f16856a.get(imageResourceType).b().equals(MaxReward.DEFAULT_LABEL)) ? "https://info.startappservice.com/InApp/resources/info_l.png" : adInformationConfig.f16856a.get(imageResourceType).b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
        if (!j9.a(this.AdInformation, adInformationMetaData.AdInformation) || !j9.a(this.adInformationMetadataUpdateVersion, adInformationMetaData.adInformationMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) f2.a(context, "StartappAdInfoMetadata", AdInformationMetaData.class);
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean b10 = j9.b(adInformationMetaData, adInformationMetaData2);
            if (!(!"4.10.12".equals(adInformationMetaData.adInformationMetadataUpdateVersion)) && b10) {
                i3 i3Var = new i3(j3.f15952e);
                i3Var.f15914d = "metadata_null";
                i3Var.a();
            }
            AdInformationConfig adInformationConfig = adInformationMetaData.AdInformation;
            adInformationConfig.getClass();
            adInformationConfig.f16856a = new EnumMap<>(AdInformationConfig.ImageResourceType.class);
            f16857a = adInformationMetaData;
        } else {
            f16857a = adInformationMetaData2;
        }
        f16857a.AdInformation.a(context);
    }

    public static void a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (f16858b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "4.10.12";
            f16857a = adInformationMetaData;
            AdInformationConfig.a(f16857a.AdInformation);
            f16857a.AdInformation.a(context);
            f2.a(context, "StartappAdInfoMetadata", (Serializable) adInformationMetaData);
        }
    }
}
