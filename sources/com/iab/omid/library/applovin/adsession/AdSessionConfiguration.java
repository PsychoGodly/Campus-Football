package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONObject;

public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z10) {
        this.creativeType = creativeType2;
        this.impressionType = impressionType2;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z10;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType2, ImpressionType impressionType2, Owner owner, Owner owner2, boolean z10) {
        g.a((Object) creativeType2, "CreativeType is null");
        g.a((Object) impressionType2, "ImpressionType is null");
        g.a((Object) owner, "Impression owner is null");
        g.a(owner, creativeType2, impressionType2);
        return new AdSessionConfiguration(creativeType2, impressionType2, owner, owner2, z10);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "impressionOwner", this.impressionOwner);
        c.a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        c.a(jSONObject, "creativeType", this.creativeType);
        c.a(jSONObject, "impressionType", this.impressionType);
        c.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
