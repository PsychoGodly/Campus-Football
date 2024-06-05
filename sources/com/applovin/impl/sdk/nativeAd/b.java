package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.bn;
import com.applovin.impl.bq;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class b extends xl implements a.C0138a, AppLovinAdLoadListener {
    private final List A = new ArrayList();
    private final List B = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final JSONObject f11853h;

    /* renamed from: i  reason: collision with root package name */
    private final JSONObject f11854i;

    /* renamed from: j  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f11855j;

    /* renamed from: k  reason: collision with root package name */
    private String f11856k = MaxReward.DEFAULT_LABEL;

    /* renamed from: l  reason: collision with root package name */
    private String f11857l = MaxReward.DEFAULT_LABEL;

    /* renamed from: m  reason: collision with root package name */
    private String f11858m = MaxReward.DEFAULT_LABEL;

    /* renamed from: n  reason: collision with root package name */
    private Double f11859n = null;

    /* renamed from: o  reason: collision with root package name */
    private String f11860o = MaxReward.DEFAULT_LABEL;

    /* renamed from: p  reason: collision with root package name */
    private Uri f11861p = null;

    /* renamed from: q  reason: collision with root package name */
    private Uri f11862q = null;

    /* renamed from: r  reason: collision with root package name */
    private bq f11863r;

    /* renamed from: s  reason: collision with root package name */
    private Uri f11864s = null;

    /* renamed from: t  reason: collision with root package name */
    private Uri f11865t = null;

    /* renamed from: u  reason: collision with root package name */
    private Uri f11866u = null;

    /* renamed from: v  reason: collision with root package name */
    private Uri f11867v = null;

    /* renamed from: w  reason: collision with root package name */
    private final List f11868w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private final List f11869x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    private final List f11870y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    private final List f11871z = new ArrayList();

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f11853h = jSONObject;
        this.f11854i = jSONObject2;
        this.f11855j = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            String string = JsonUtils.getString(jSONObject, "url", (String) null);
            if (StringUtils.isValidString(string)) {
                this.f11866u = Uri.parse(string);
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str = this.f13422b;
                    tVar.a(str, "Processed click destination URL: " + this.f11866u);
                }
            }
            String string2 = JsonUtils.getString(jSONObject, "fallback", (String) null);
            if (StringUtils.isValidString(string2)) {
                this.f11867v = Uri.parse(string2);
                if (t.a()) {
                    t tVar2 = this.f13423c;
                    String str2 = this.f13422b;
                    tVar2.a(str2, "Processed click destination backup URL: " + this.f11867v);
                }
            }
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", (JSONArray) null);
            if (jSONArray != null) {
                try {
                    this.f11868w.addAll(JsonUtils.toList(jSONArray));
                    if (t.a()) {
                        t tVar3 = this.f13423c;
                        String str3 = this.f13422b;
                        tVar3.a(str3, "Processed click tracking URLs: " + this.f11868w);
                    }
                } catch (Throwable th) {
                    if (t.a()) {
                        this.f13423c.a(this.f13422b, "Failed to render click tracking URLs", th);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (t.a()) {
            this.f13423c.a(this.f13422b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f11855j.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f13421a.B().a(this.f13422b, "prepareNativeComponents", th);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new i(this, appLovinNativeAdImpl));
    }

    private void e() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f11853h), JsonUtils.shallowCopy(this.f11854i), this.f13421a).setTitle(this.f11856k).setAdvertiser(this.f11857l).setBody(this.f11858m).setCallToAction(this.f11860o).setStarRating(this.f11859n).setIconUri(this.f11861p).setMainImageUri(this.f11862q).setPrivacyIconUri(this.f11864s).setVastAd(this.f11863r).setPrivacyDestinationUri(this.f11865t).setClickDestinationUri(this.f11866u).setClickDestinationBackupUri(this.f11867v).setClickTrackingUrls(this.f11868w).setJsTrackers(this.f11869x).setImpressionRequests(this.f11870y).setViewableMRC50Requests(this.f11871z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        build.getAdEventTracker().e();
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Starting cache task for type: " + build.getType() + "...");
        }
        this.f13421a.l0().a((xl) new a(build, this.f13421a, this), sm.b.CORE);
    }

    public void adReceived(AppLovinAd appLovinAd) {
        if (t.a()) {
            this.f13423c.a(this.f13422b, "VAST ad rendered successfully");
        }
        this.f11863r = (bq) appLovinAd;
        e();
    }

    public void failedToReceiveAd(int i10) {
        if (t.a()) {
            this.f13423c.b(this.f13422b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v12, types: [org.json.JSONObject, java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v30 */
    public void run() {
        ? r32 = 0;
        String string = JsonUtils.getString(this.f11853h, "privacy_icon_url", (String) null);
        if (URLUtil.isValidUrl(string)) {
            this.f11864s = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f11853h, "privacy_url", (String) null);
        if (URLUtil.isValidUrl(string2)) {
            this.f11865t = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f11853h, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.b(str, "No oRtb response provided: " + this.f11853h);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", (String) null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (t.a()) {
            t tVar2 = this.f13423c;
            String str2 = this.f13422b;
            tVar2.a(str2, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", (JSONArray) null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (t.a()) {
                t tVar3 = this.f13423c;
                String str3 = this.f13422b;
                tVar3.b(str3, "Unable to retrieve assets - failing ad load: " + this.f11853h);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str4 = MaxReward.DEFAULT_LABEL;
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r32);
            if (jSONObject4.has("title")) {
                this.f11856k = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r32), "text", r32);
                if (t.a()) {
                    t tVar4 = this.f13423c;
                    String str5 = this.f13422b;
                    tVar4.a(str5, "Processed title: " + this.f11856k);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r32));
            } else if (jSONObject4.has("img")) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r32);
                int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r32);
                if (i12 == 1 || 3 == i11) {
                    this.f11861p = Uri.parse(string4);
                    if (t.a()) {
                        t tVar5 = this.f13423c;
                        String str6 = this.f13422b;
                        tVar5.a(str6, "Processed icon URL: " + this.f11861p);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f11862q = Uri.parse(string4);
                    if (t.a()) {
                        t tVar6 = this.f13423c;
                        String str7 = this.f13422b;
                        tVar6.a(str7, "Processed main image URL: " + this.f11862q);
                    }
                } else {
                    if (t.a()) {
                        t tVar7 = this.f13423c;
                        String str8 = this.f13422b;
                        tVar7.k(str8, "Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i13 <= 0 || i14 <= 0) {
                        if (t.a()) {
                            this.f13423c.k(this.f13422b, "Skipping...");
                        }
                    } else if (((double) (((float) i13) / ((float) i14))) > 1.0d) {
                        if (t.a()) {
                            t tVar8 = this.f13423c;
                            String str9 = this.f13422b;
                            tVar8.a(str9, "Inferring main image from " + i13 + "x" + i14 + "...");
                        }
                        this.f11862q = Uri.parse(string4);
                    } else {
                        if (t.a()) {
                            t tVar9 = this.f13423c;
                            String str10 = this.f13422b;
                            tVar9.a(str10, "Inferring icon image from " + i13 + "x" + i14 + "...");
                        }
                        this.f11861p = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has(MimeTypes.BASE_TYPE_VIDEO)) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, MimeTypes.BASE_TYPE_VIDEO, (JSONObject) null), "vasttag", (String) null);
                if (StringUtils.isValidString(string5)) {
                    if (t.a()) {
                        this.f13423c.a(this.f13422b, "Processed VAST video");
                    }
                } else if (t.a()) {
                    t tVar10 = this.f13423c;
                    String str11 = this.f13422b;
                    tVar10.k(str11, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str4 = string5;
            } else if (jSONObject4.has(JsonStorageKeyNames.DATA_KEY)) {
                int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, JsonStorageKeyNames.DATA_KEY, (JSONObject) null);
                int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", (String) null);
                if (i16 == 1 || i15 == 8) {
                    this.f11857l = string6;
                    if (t.a()) {
                        t tVar11 = this.f13423c;
                        String str12 = this.f13422b;
                        tVar11.a(str12, "Processed advertiser: " + this.f11857l);
                    }
                } else if (i16 == 2 || i15 == 4) {
                    this.f11858m = string6;
                    if (t.a()) {
                        t tVar12 = this.f13423c;
                        String str13 = this.f13422b;
                        tVar12.a(str13, "Processed body: " + this.f11858m);
                    }
                } else if (i16 == 12 || i15 == 5) {
                    this.f11860o = string6;
                    if (t.a()) {
                        t tVar13 = this.f13423c;
                        String str14 = this.f13422b;
                        tVar13.a(str14, "Processed cta: " + this.f11860o);
                    }
                } else if (i16 == 3 || i15 == 6) {
                    double a10 = zp.a(string6, -1.0d);
                    if (a10 != -1.0d) {
                        this.f11859n = Double.valueOf(a10);
                        if (t.a()) {
                            t tVar14 = this.f13423c;
                            String str15 = this.f13422b;
                            tVar14.a(str15, "Processed star rating: " + this.f11859n);
                        }
                    } else if (t.a()) {
                        t tVar15 = this.f13423c;
                        String str16 = this.f13422b;
                        tVar15.a(str16, "Received invalid star rating: " + string6);
                    }
                } else if (t.a()) {
                    t tVar16 = this.f13423c;
                    String str17 = this.f13422b;
                    tVar16.k(str17, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (t.a()) {
                t tVar17 = this.f13423c;
                String str18 = this.f13422b;
                tVar17.b(str18, "Unsupported asset object: " + jSONObject4);
            }
            i10++;
            r32 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", (String) null);
        if (StringUtils.isValidString(string7)) {
            this.f11869x.add(string7);
            if (t.a()) {
                t tVar18 = this.f13423c;
                String str19 = this.f13422b;
                tVar18.a(str19, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", (JSONArray) null);
        if (jSONArray2 != null) {
            int i17 = 0;
            while (i17 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                if (objectAtIndex instanceof String) {
                    String str20 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str20)) {
                        this.f11870y.add(new e.a(this.f13421a).b(str20).b(false).a(false).a());
                        if (t.a()) {
                            t tVar19 = this.f13423c;
                            String str21 = this.f13422b;
                            tVar19.a(str21, "Processed imptracker URL: " + str20);
                        }
                    }
                }
                i17++;
                obj = null;
            }
        }
        ? r33 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", (JSONArray) null);
        if (jSONArray3 != null) {
            int i18 = 0;
            while (i18 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r33);
                int i19 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r33);
                if (!TextUtils.isEmpty(string8)) {
                    if (i20 == 1 || i20 == 2) {
                        if (i20 != 2 || !string8.startsWith("<script")) {
                            e b10 = new e.a(this.f13421a).b(string8).b(false).a(false).h(i20 == 2).a();
                            if (i19 == 1) {
                                this.f11870y.add(b10);
                                if (t.a()) {
                                    t tVar20 = this.f13423c;
                                    String str22 = this.f13422b;
                                    tVar20.a(str22, "Processed impression URL: " + string8);
                                }
                            } else if (i19 == 2) {
                                this.f11871z.add(b10);
                                if (t.a()) {
                                    t tVar21 = this.f13423c;
                                    String str23 = this.f13422b;
                                    tVar21.a(str23, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i19 == 3) {
                                this.A.add(b10);
                                if (t.a()) {
                                    t tVar22 = this.f13423c;
                                    String str24 = this.f13422b;
                                    tVar22.a(str24, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else {
                                if (i19 == 4) {
                                    this.B.add(b10);
                                    if (t.a()) {
                                        t tVar23 = this.f13423c;
                                        String str25 = this.f13422b;
                                        tVar23.a(str25, "Processed viewable video 50 URL: " + string8);
                                    }
                                } else if (i19 == 555) {
                                    if (t.a()) {
                                        t tVar24 = this.f13423c;
                                        String str26 = this.f13422b;
                                        tVar24.a(str26, "Ignoring processing of OMID URL: " + string8);
                                    }
                                } else if (t.a()) {
                                    t tVar25 = this.f13423c;
                                    String str27 = this.f13422b;
                                    tVar25.b(str27, "Unsupported event tracker: " + jSONObject7);
                                }
                                i18++;
                                r33 = 0;
                            }
                            i18++;
                            r33 = 0;
                        } else {
                            this.f11869x.add(string8);
                        }
                    } else if (t.a()) {
                        t tVar26 = this.f13423c;
                        String str28 = this.f13422b;
                        tVar26.b(str28, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i18++;
                r33 = 0;
            }
        }
        if (StringUtils.isValidString(str4)) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Processing VAST video...");
            }
            this.f13421a.l0().a((xl) bn.a(str4, JsonUtils.shallowCopy(this.f11853h), JsonUtils.shallowCopy(this.f11854i), this, this.f13421a));
            return;
        }
        e();
    }

    private void b(String str) {
        this.f11855j.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (t.a()) {
            this.f13423c.a(this.f13422b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
