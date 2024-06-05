package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public abstract class fq {

    /* renamed from: f  reason: collision with root package name */
    private static final List f7841f = Arrays.asList(new String[]{"video/mp4", MimeTypes.VIDEO_WEBM, "video/3gpp", "video/x-matroska"});

    /* renamed from: a  reason: collision with root package name */
    private final k f7842a;

    /* renamed from: b  reason: collision with root package name */
    protected List f7843b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f7844c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f7845d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7846e = System.currentTimeMillis();

    public fq(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        this.f7842a = kVar;
        this.f7844c = jSONObject;
        this.f7845d = jSONObject2;
    }

    public List a() {
        return this.f7843b;
    }

    public JSONObject b() {
        return this.f7844c;
    }

    public long c() {
        return this.f7846e;
    }

    public int d() {
        return this.f7843b.size();
    }

    public JSONObject e() {
        return this.f7845d;
    }

    public List f() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f7844c, "vast_preferred_video_types", (String) null));
        return !explode.isEmpty() ? explode : f7841f;
    }

    public int g() {
        return zp.a(JsonUtils.getInt(this.f7844c, "video_completion_percent", -1));
    }
}
