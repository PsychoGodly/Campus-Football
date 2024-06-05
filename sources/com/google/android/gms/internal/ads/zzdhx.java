package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class zzdhx implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzcei zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ WindowManager.LayoutParams zzd;
    public final /* synthetic */ int zze;
    public final /* synthetic */ WindowManager zzf;

    public /* synthetic */ zzdhx(View view, zzcei zzcei, String str, WindowManager.LayoutParams layoutParams, int i10, WindowManager windowManager) {
        this.zza = view;
        this.zzb = zzcei;
        this.zzc = str;
        this.zzd = layoutParams;
        this.zze = i10;
        this.zzf = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.zza;
        zzcei zzcei = this.zzb;
        String str = this.zzc;
        WindowManager.LayoutParams layoutParams = this.zzd;
        int i10 = this.zze;
        WindowManager windowManager = this.zzf;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && zzcei.zzF().getWindowToken() != null) {
            if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str)) {
                layoutParams.y = rect.bottom - i10;
            } else {
                layoutParams.y = rect.top - i10;
            }
            windowManager.updateViewLayout(zzcei.zzF(), layoutParams);
        }
    }
}
