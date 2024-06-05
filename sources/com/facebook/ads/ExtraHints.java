package com.facebook.ads;

import android.text.TextUtils;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
@Keep
public class ExtraHints {
    private static final String HINTS_JSON_KEY = "hints";
    private static final int KEYWORDS_MAX_COUNT = 5;
    private static final String KEYWORD_SEPARATOR = ";";
    private final String mHintsSerialized;
    private final String mMediationData;

    @Keep
    @Deprecated
    public static class Builder {
        private HashMap<HintType, String> mHints = new HashMap<>();
        private String mMediationData;

        public ExtraHints build() {
            return new ExtraHints(this.mHints, this.mMediationData);
        }

        public Builder contentUrl(String str) {
            if (str == null) {
                return this;
            }
            this.mHints.put(HintType.CONTENT_URL, str);
            return this;
        }

        public Builder extraData(String str) {
            if (str == null) {
                return this;
            }
            this.mHints.put(HintType.EXTRA_DATA, str);
            return this;
        }

        @Deprecated
        public Builder keywords(List<Keyword> list) {
            return this;
        }

        public Builder mediationData(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            this.mMediationData = str;
            return this;
        }
    }

    public enum HintType {
        KEYWORDS("keywords"),
        CONTENT_URL("content_url"),
        EXTRA_DATA("extra_data");
        
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f14126a;

        private HintType(String str) {
            this.f14126a = str;
        }
    }

    @Keep
    @Deprecated
    public enum Keyword {
        ACCESSORIES("accessories"),
        ART_HISTORY("art_history"),
        AUTOMOTIVE("automotive"),
        BEAUTY("beauty"),
        BIOLOGY("biology"),
        BOARD_GAMES("board_games"),
        BUSINESS_SOFTWARE("business_software"),
        BUYING_SELLING_HOMES("buying_selling_homes"),
        CATS("cats"),
        CELEBRITIES("celebrities"),
        CLOTHING("clothing"),
        COMIC_BOOKS("comic_books"),
        DESKTOP_VIDEO("desktop_video"),
        DOGS("dogs"),
        EDUCATION("education"),
        EMAIL("email"),
        ENTERTAINMENT("entertainment"),
        FAMILY_PARENTING("family_parenting"),
        FASHION("fashion"),
        FINE_ART("fine_art"),
        FOOD_DRINK("food_drink"),
        FRENCH_CUISINE("french_cuisine"),
        GOVERNMENT("government"),
        HEALTH_FITNESS("health_fitness"),
        HOBBIES("hobbies"),
        HOME_GARDEN("home_garden"),
        HUMOR("humor"),
        INTERNET_TECHNOLOGY("internet_technology"),
        LARGE_ANIMALS("large_animals"),
        LAW("law"),
        LEGAL_ISSUES("legal_issues"),
        LITERATURE("literature"),
        MARKETING("marketing"),
        MOVIES("movies"),
        MUSIC("music"),
        NEWS("news"),
        PERSONAL_FINANCE("personal_finance"),
        PETS("pets"),
        PHOTOGRAPHY("photography"),
        POLITICS("politics"),
        REAL_ESTATE("real_estate"),
        ROLEPLAYING_GAMES("roleplaying_games"),
        SCIENCE("science"),
        SHOPPING("shopping"),
        SOCIETY("society"),
        SPORTS("sports"),
        TECHNOLOGY("technology"),
        TELEVISION("television"),
        TRAVEL("travel"),
        VIDEO_COMPUTER_GAMES("video_computer_games");
        
        private String mKeyword;

        private Keyword(String str) {
            this.mKeyword = str;
        }
    }

    private static String join(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        for (String append : list) {
            sb2.append(append);
            sb2.append(KEYWORD_SEPARATOR);
        }
        return sb2.toString();
    }

    public String getHints() {
        return this.mHintsSerialized;
    }

    public String getMediationData() {
        return this.mMediationData;
    }

    private ExtraHints(HashMap<HintType, String> hashMap, String str) {
        this.mMediationData = str;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry next : hashMap.entrySet()) {
            try {
                jSONObject2.put(((HintType) next.getKey()).f14126a, next.getValue());
            } catch (JSONException unused) {
            }
        }
        try {
            jSONObject.put(HINTS_JSON_KEY, jSONObject2);
        } catch (JSONException unused2) {
        }
        this.mHintsSerialized = jSONObject.toString();
    }
}
