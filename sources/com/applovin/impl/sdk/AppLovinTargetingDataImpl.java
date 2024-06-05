package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinTargetingData;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* renamed from: a  reason: collision with root package name */
    private AppLovinTargetingData.Gender f11435a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinTargetingData.AdContentRating f11436b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f11437c;

    /* renamed from: d  reason: collision with root package name */
    private String f11438d;

    /* renamed from: e  reason: collision with root package name */
    private String f11439e;

    /* renamed from: f  reason: collision with root package name */
    private List f11440f;

    /* renamed from: g  reason: collision with root package name */
    private List f11441g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f11442h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f11443i;

    public static class BuilderImpl implements AppLovinTargetingData.Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public AppLovinTargetingData.Gender f11444a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public AppLovinTargetingData.AdContentRating f11445b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Integer f11446c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f11447d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f11448e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public List f11449f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public List f11450g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final Map f11451h = new HashMap();

        public AppLovinTargetingData build() {
            return new AppLovinTargetingDataImpl(this);
        }

        public String getEmail() {
            return this.f11447d;
        }

        public AppLovinTargetingData.Gender getGender() {
            return this.f11444a;
        }

        public List<String> getInterests() {
            return this.f11450g;
        }

        public Map<String, String> getJsonData() {
            return this.f11451h;
        }

        public List<String> getKeywords() {
            return this.f11449f;
        }

        public AppLovinTargetingData.AdContentRating getMaximumAdContentRating() {
            return this.f11445b;
        }

        public String getPhoneNumber() {
            return this.f11448e;
        }

        public Integer getYearOfBirth() {
            return this.f11446c;
        }

        public AppLovinTargetingData.Builder setEmail(String str) {
            a("email", str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase(Locale.getDefault()).trim()) : str);
            this.f11447d = str;
            return this;
        }

        public AppLovinTargetingData.Builder setGender(AppLovinTargetingData.Gender gender) {
            String str;
            if (gender != null) {
                if (gender == AppLovinTargetingData.Gender.FEMALE) {
                    str = "F";
                } else if (gender == AppLovinTargetingData.Gender.MALE) {
                    str = "M";
                } else if (gender == AppLovinTargetingData.Gender.OTHER) {
                    str = "O";
                }
                a("gender", str);
                this.f11444a = gender;
                return this;
            }
            str = null;
            a("gender", str);
            this.f11444a = gender;
            return this;
        }

        public AppLovinTargetingData.Builder setInterests(List<String> list) {
            a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
            this.f11450g = list;
            return this;
        }

        public AppLovinTargetingData.Builder setKeywords(List<String> list) {
            a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
            this.f11449f = list;
            return this;
        }

        public AppLovinTargetingData.Builder setMaximumAdContentRating(AppLovinTargetingData.AdContentRating adContentRating) {
            a("maximum_ad_content_rating", (adContentRating == null || adContentRating == AppLovinTargetingData.AdContentRating.NONE) ? null : Integer.toString(adContentRating.ordinal()));
            this.f11445b = adContentRating;
            return this;
        }

        public AppLovinTargetingData.Builder setPhoneNumber(String str) {
            a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", MaxReward.DEFAULT_LABEL)) : str);
            this.f11448e = str;
            return this;
        }

        public AppLovinTargetingData.Builder setYearOfBirth(Integer num) {
            a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
            this.f11446c = num;
            return this;
        }

        private void a(String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                if (StringUtils.isValidString(str2)) {
                    this.f11451h.put(str, str2);
                } else {
                    this.f11451h.remove(str);
                }
            }
        }
    }

    private void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (StringUtils.isValidString(str2)) {
                this.f11442h.put(str, str2);
            } else {
                this.f11442h.remove(str);
            }
        }
    }

    public void clearAll() {
        this.f11442h.clear();
        this.f11437c = null;
        this.f11435a = null;
        this.f11436b = null;
        this.f11438d = null;
        this.f11439e = null;
        this.f11440f = null;
        this.f11441g = null;
    }

    @Deprecated
    public Map<String, String> getAllData() {
        HashMap hashMap;
        synchronized (this.f11442h) {
            hashMap = new HashMap(this.f11442h);
        }
        return hashMap;
    }

    public String getEmail() {
        return this.f11438d;
    }

    public AppLovinTargetingData.Gender getGender() {
        return this.f11435a;
    }

    public List<String> getInterests() {
        return this.f11441g;
    }

    public Map<String, String> getJsonData() {
        return this.f11443i;
    }

    public List<String> getKeywords() {
        return this.f11440f;
    }

    public AppLovinTargetingData.AdContentRating getMaximumAdContentRating() {
        return this.f11436b;
    }

    public String getPhoneNumber() {
        return this.f11439e;
    }

    public Integer getYearOfBirth() {
        return this.f11437c;
    }

    public void setEmail(String str) {
        a("email", str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f11438d = str;
    }

    public void setGender(AppLovinTargetingData.Gender gender) {
        String str;
        if (gender != null) {
            if (gender == AppLovinTargetingData.Gender.FEMALE) {
                str = "F";
            } else if (gender == AppLovinTargetingData.Gender.MALE) {
                str = "M";
            } else if (gender == AppLovinTargetingData.Gender.OTHER) {
                str = "O";
            }
            a("gender", str);
            this.f11435a = gender;
        }
        str = null;
        a("gender", str);
        this.f11435a = gender;
    }

    public void setInterests(List<String> list) {
        a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f11441g = list;
    }

    public void setKeywords(List<String> list) {
        a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f11440f = list;
    }

    public void setMaximumAdContentRating(AppLovinTargetingData.AdContentRating adContentRating) {
        a("maximum_ad_content_rating", (adContentRating == null || adContentRating == AppLovinTargetingData.AdContentRating.NONE) ? null : Integer.toString(adContentRating.ordinal()));
        this.f11436b = adContentRating;
    }

    public void setPhoneNumber(String str) {
        a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", MaxReward.DEFAULT_LABEL)) : str);
        this.f11439e = str;
    }

    public void setYearOfBirth(Integer num) {
        a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f11437c = num;
    }

    public String toString() {
        return "AppLovinTargetingDataImpl{gender=" + this.f11435a + ", maximumAdContentRating=" + this.f11436b + ", yearOfBirth=" + this.f11437c + ", email='" + this.f11438d + '\'' + ", phoneNumber='" + this.f11439e + '\'' + ", keywords=" + this.f11440f + ", interests=" + this.f11441g + ", parameters=" + this.f11443i + "}";
    }

    private AppLovinTargetingDataImpl(BuilderImpl builderImpl) {
        this.f11442h = Collections.synchronizedMap(new HashMap());
        this.f11435a = builderImpl.f11444a;
        this.f11436b = builderImpl.f11445b;
        this.f11437c = builderImpl.f11446c;
        this.f11438d = builderImpl.f11447d;
        this.f11439e = builderImpl.f11448e;
        this.f11440f = builderImpl.f11449f;
        this.f11441g = builderImpl.f11450g;
        this.f11443i = builderImpl.f11451h;
    }

    @Deprecated
    protected AppLovinTargetingDataImpl() {
        this.f11442h = Collections.synchronizedMap(new HashMap());
        this.f11443i = new HashMap();
    }
}
