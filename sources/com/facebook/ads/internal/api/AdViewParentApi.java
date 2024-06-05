package com.facebook.ads.internal.api;

import android.content.res.Configuration;
import androidx.annotation.Keep;

@Keep
public interface AdViewParentApi {
    void onConfigurationChanged(Configuration configuration);
}
