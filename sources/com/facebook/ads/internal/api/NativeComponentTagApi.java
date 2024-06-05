package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAdBase;

@Keep
public interface NativeComponentTagApi {
    void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag);
}
