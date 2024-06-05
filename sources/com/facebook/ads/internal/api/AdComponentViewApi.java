package com.facebook.ads.internal.api;

import androidx.annotation.Keep;

@Keep
public interface AdComponentViewApi extends AdComponentViewParentApi {
    void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi);
}
