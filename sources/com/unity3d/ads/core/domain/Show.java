package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import sd.w;
import se.e;
import xd.d;

/* compiled from: Show.kt */
public interface Show {
    e<ShowEvent> invoke(Context context, AdObject adObject, UnityAdsShowOptions unityAdsShowOptions);

    Object terminate(AdObject adObject, d<? super w> dVar);
}
