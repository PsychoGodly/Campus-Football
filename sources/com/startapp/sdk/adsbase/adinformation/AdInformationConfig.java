package com.startapp.sdk.adsbase.adinformation;

import android.app.Activity;
import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.startapp.b1;
import com.startapp.d9;
import com.startapp.f3;
import com.startapp.j9;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class AdInformationConfig implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final String f16855b = "https://funnel-assets.startappservice.com/consent/index.html";
    private static final long serialVersionUID = 8911501868319500986L;
    @d9(type = ArrayList.class, value = ImageResourceConfig.class)
    private List<ImageResourceConfig> ImageResources = new ArrayList();
    @d9(key = AdPreferences.Placement.class, type = HashMap.class, value = AdInformationPositions.Position.class)
    public HashMap<AdPreferences.Placement, AdInformationPositions.Position> Positions = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public transient EnumMap<ImageResourceType, ImageResourceConfig> f16856a = new EnumMap<>(ImageResourceType.class);
    private Integer consentTypeInfo;
    private String dialogUrlSecured = f16855b;
    private boolean enabled = true;
    private String eulaUrlSecured = "https://www.startapp.com/policy/privacy-policy/";
    private float fatFingersFactor = 200.0f;

    /* compiled from: Sta */
    public enum ImageResourceType {
        INFO_S(17, 14),
        INFO_EX_S(88, 14),
        INFO_L(25, 21),
        INFO_EX_L(130, 21);
        
        private final int height;
        private final int width;

        private ImageResourceType(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static ImageResourceType getByName(String str) {
            ImageResourceType imageResourceType = INFO_S;
            for (ImageResourceType imageResourceType2 : values()) {
                if (imageResourceType2.name().toLowerCase().compareTo(str.toLowerCase()) == 0) {
                    imageResourceType = imageResourceType2;
                }
            }
            return imageResourceType;
        }

        public int getDefaultHeight() {
            return this.height;
        }

        public int getDefaultWidth() {
            return this.width;
        }
    }

    private AdInformationConfig() {
    }

    public static AdInformationConfig a() {
        AdInformationConfig adInformationConfig = new AdInformationConfig();
        a(adInformationConfig);
        return adInformationConfig;
    }

    public Integer b() {
        return this.consentTypeInfo;
    }

    public String c() {
        String str = this.dialogUrlSecured;
        return str != null ? str : f16855b;
    }

    public String d() {
        String str = this.eulaUrlSecured;
        return (str == null || str.equals(MaxReward.DEFAULT_LABEL)) ? "https://www.startapp.com/policy/privacy-policy/" : this.eulaUrlSecured;
    }

    public float e() {
        return this.fatFingersFactor / 100.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationConfig adInformationConfig = (AdInformationConfig) obj;
        if (this.enabled != adInformationConfig.enabled || Float.compare(adInformationConfig.fatFingersFactor, this.fatFingersFactor) != 0 || !j9.a(this.consentTypeInfo, adInformationConfig.consentTypeInfo) || !j9.a(this.dialogUrlSecured, adInformationConfig.dialogUrlSecured) || !j9.a(this.eulaUrlSecured, adInformationConfig.eulaUrlSecured) || !j9.a(this.Positions, adInformationConfig.Positions) || !j9.a(this.ImageResources, adInformationConfig.ImageResources)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.consentTypeInfo, Float.valueOf(this.fatFingersFactor), this.dialogUrlSecured, this.eulaUrlSecured, this.Positions, this.ImageResources};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public boolean b(Context context) {
        if (ComponentLocator.a(context).e().getBoolean("userDisabledAdInformation", false) || !this.enabled) {
            return false;
        }
        return true;
    }

    public static void a(AdInformationConfig adInformationConfig) {
        boolean z10;
        adInformationConfig.getClass();
        int i10 = 0;
        for (ImageResourceType imageResourceType : ImageResourceType.values()) {
            ImageResourceConfig imageResourceConfig = adInformationConfig.f16856a.get(imageResourceType);
            if (imageResourceConfig == null) {
                imageResourceConfig = ImageResourceConfig.a(imageResourceType.name());
                Iterator<ImageResourceConfig> it = adInformationConfig.ImageResources.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (ImageResourceType.getByName(it.next().c()).equals(imageResourceType)) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                adInformationConfig.f16856a.put(imageResourceType, imageResourceConfig);
                if (z10) {
                    adInformationConfig.ImageResources.add(imageResourceConfig);
                }
            }
            imageResourceConfig.b(imageResourceType.getDefaultWidth());
            imageResourceConfig.a(imageResourceType.getDefaultHeight());
            imageResourceConfig.b(imageResourceType.name().toLowerCase() + ".png");
        }
        ImageResourceType[] values = ImageResourceType.values();
        int length = values.length;
        while (i10 < length) {
            ImageResourceType imageResourceType2 = values[i10];
            if (adInformationConfig.f16856a.get(imageResourceType2) != null) {
                i10++;
            } else {
                throw new IllegalArgumentException(String.valueOf(imageResourceType2));
            }
        }
    }

    public AdInformationPositions.Position a(AdPreferences.Placement placement) {
        AdInformationPositions.Position position = this.Positions.get(placement);
        if (position != null) {
            return position;
        }
        AdInformationPositions.Position position2 = AdInformationPositions.Position.BOTTOM_LEFT;
        this.Positions.put(placement, position2);
        return position2;
    }

    public void a(Context context) {
        for (ImageResourceConfig next : this.ImageResources) {
            this.f16856a.put(ImageResourceType.getByName(next.c()), next);
            next.f16880a = null;
            new b1(context, next.b(), new f3(next), 0).a();
        }
    }

    public ImageResourceConfig a(ImageResourceType imageResourceType) {
        return this.f16856a.get(imageResourceType);
    }
}
