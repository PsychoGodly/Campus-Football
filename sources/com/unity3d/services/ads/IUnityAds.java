package com.unity3d.services.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;

public interface IUnityAds {
    boolean getDebugMode();

    String getToken();

    void getToken(IUnityAdsTokenListener iUnityAdsTokenListener);

    String getVersion();

    void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener);

    boolean isInitialized();

    boolean isSupported();

    void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener);

    void setDebugMode(boolean z10);

    void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener);
}
