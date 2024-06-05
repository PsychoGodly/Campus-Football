package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import kotlin.jvm.internal.m;

/* compiled from: UnityAds.kt */
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();

    /* compiled from: UnityAds.kt */
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* compiled from: UnityAds.kt */
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* compiled from: UnityAds.kt */
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* compiled from: UnityAds.kt */
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        m.d(version, "getInstance().version");
        return version;
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final void initialize(Context context, String str) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, (IUnityAdsInitializationListener) null);
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final void load(String str) {
        load(str, new UnityAds$load$1());
    }

    public static final void setDebugMode(boolean z10) {
        UnityAdsImplementation.getInstance().setDebugMode(z10);
    }

    public static final void show(Activity activity, String str) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), (IUnityAdsShowListener) null);
    }

    public static final void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
    }

    public static final void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public static final void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static final void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    public static final void initialize(Context context, String str, boolean z10) {
        UnityAdsImplementation.getInstance().initialize(context, str, z10, (IUnityAdsInitializationListener) null);
    }

    public static final void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        IUnityAds instance = UnityAdsImplementation.getInstance();
        if (unityAdsLoadOptions == null) {
            unityAdsLoadOptions = new UnityAdsLoadOptions();
        }
        instance.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, (IUnityAdsShowListener) null);
    }

    public static final void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, z10, iUnityAdsInitializationListener);
    }

    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }
}
