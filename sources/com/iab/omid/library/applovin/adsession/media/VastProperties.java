package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f27359a;

    /* renamed from: b  reason: collision with root package name */
    private final Float f27360b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f27361c;

    /* renamed from: d  reason: collision with root package name */
    private final Position f27362d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f27359a = z10;
        this.f27360b = f10;
        this.f27361c = z11;
        this.f27362d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f27359a);
            if (this.f27359a) {
                jSONObject.put("skipOffset", this.f27360b);
            }
            jSONObject.put("autoPlay", this.f27361c);
            jSONObject.put("position", this.f27362d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f27362d;
    }

    public Float getSkipOffset() {
        return this.f27360b;
    }

    public boolean isAutoPlay() {
        return this.f27361c;
    }

    public boolean isSkippable() {
        return this.f27359a;
    }
}
