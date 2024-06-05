package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import x9.f;
import x9.i;
import x9.k;

/* compiled from: AndroidOmInteraction.kt */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final f getCreativeType(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("creativeType");
        if (optInt == 1) {
            return f.DEFINED_BY_JAVASCRIPT;
        }
        if (optInt == 2) {
            return f.HTML_DISPLAY;
        }
        if (optInt == 3) {
            return f.NATIVE_DISPLAY;
        }
        if (optInt == 4) {
            return f.VIDEO;
        }
        if (optInt == 5) {
            return f.AUDIO;
        }
        throw new IllegalArgumentException("Invalid creativeType");
    }

    private final i getImpressionType(JSONObject jSONObject) {
        switch (jSONObject.optInt("impressionType")) {
            case 1:
                return i.DEFINED_BY_JAVASCRIPT;
            case 2:
                return i.UNSPECIFIED;
            case 3:
                return i.LOADED;
            case 4:
                return i.BEGIN_TO_RENDER;
            case 5:
                return i.ONE_PIXEL;
            case 6:
                return i.VIEWABLE;
            case 7:
                return i.AUDIBLE;
            case 8:
                return i.OTHER;
            default:
                throw new IllegalArgumentException("Invalid impressionType");
        }
    }

    private final k getImpressionsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("impressionOwner");
            if (optInt == 1) {
                return k.JAVASCRIPT;
            }
            if (optInt == 2) {
                return k.NATIVE;
            }
            if (optInt == 3) {
                return k.NONE;
            }
            throw new IllegalArgumentException("Invalid impressionOwner");
        } catch (IllegalArgumentException unused) {
            return k.NONE;
        }
    }

    private final k getMediaEventsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("mediaEventsOwner");
            if (optInt == 1) {
                return k.JAVASCRIPT;
            }
            if (optInt == 2) {
                return k.NATIVE;
            }
            if (optInt == 3) {
                return k.NONE;
            }
            throw new IllegalArgumentException("Invalid mediaEventsOwner");
        } catch (IllegalArgumentException unused) {
            return k.NONE;
        }
    }

    private final k getVideoEventsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("videoEventsOwner");
            if (optInt == 1) {
                return k.JAVASCRIPT;
            }
            if (optInt == 2) {
                return k.NATIVE;
            }
            if (optInt == 3) {
                return k.NONE;
            }
            throw new IllegalArgumentException("Invalid videoEventsOwner");
        } catch (IllegalArgumentException unused) {
            return k.NONE;
        }
    }

    public OmidOptions getOMidOptions(JSONObject jSONObject) {
        m.e(jSONObject, "options");
        return new OmidOptions(jSONObject.optBoolean("isolateVerificationScripts"), getImpressionsOwner(jSONObject), getVideoEventsOwner(jSONObject), jSONObject.optString("customReferenceData"), getImpressionType(jSONObject), getCreativeType(jSONObject), getMediaEventsOwner(jSONObject));
    }

    public WebView getWebview(AdObject adObject) {
        m.e(adObject, "adObject");
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof AndroidEmbeddableWebViewAdPlayer) {
            return ((AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }
}
