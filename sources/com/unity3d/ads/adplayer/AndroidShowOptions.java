package com.unity3d.ads.adplayer;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: AndroidShowOptions.kt */
public final class AndroidShowOptions implements ShowOptions {
    private final Context context;
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(Context context2, Map<String, ? extends Object> map) {
        m.e(context2, "context");
        this.context = context2;
        this.unityAdsShowOptions = map;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Context context2, Map<String, Object> map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context2 = androidShowOptions.context;
        }
        if ((i10 & 2) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        return androidShowOptions.copy(context2, map);
    }

    public final Context component1() {
        return this.context;
    }

    public final Map<String, Object> component2() {
        return this.unityAdsShowOptions;
    }

    public final AndroidShowOptions copy(Context context2, Map<String, ? extends Object> map) {
        m.e(context2, "context");
        return new AndroidShowOptions(context2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return m.a(this.context, androidShowOptions.context) && m.a(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions);
    }

    public final Context getContext() {
        return this.context;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    public int hashCode() {
        int hashCode = this.context.hashCode() * 31;
        Map<String, Object> map = this.unityAdsShowOptions;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "AndroidShowOptions(context=" + this.context + ", unityAdsShowOptions=" + this.unityAdsShowOptions + ')';
    }
}
