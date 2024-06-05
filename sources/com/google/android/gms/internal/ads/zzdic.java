package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.util.z0;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdic {
    private final zzdmq zza;
    private final zzdlf zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdic(zzdmq zzdmq, zzdlf zzdlf) {
        this.zza = zzdmq;
        this.zzb = zzdlf;
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        x.b();
        return zzbyt.zzy(context, i10);
    }

    public final View zza(View view, WindowManager windowManager) throws zzcet {
        zzcei zza2 = this.zza.zza(z4.w(), (zzeyc) null, (zzeyf) null);
        View view2 = (View) zza2;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza2.zzad("/sendMessageToSdk", new zzdhy(this));
        zza2.zzad("/hideValidatorOverlay", new zzdhz(this, windowManager, view));
        zza2.zzad("/open", new zzbhz((b) null, (zzbpz) null, (zzeaf) null, (zzdpi) null, (zzfdk) null));
        this.zzb.zzj(new WeakReference(zza2), "/loadNativeAdPolicyViolations", new zzdia(this, view, windowManager));
        this.zzb.zzj(new WeakReference(zza2), "/showValidatorOverlay", zzdib.zza);
        return (View) zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcei zzcei, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcei zzcei, Map map) {
        zzbza.zze("Hide native ad policy validator overlay.");
        zzcei.zzF().setVisibility(8);
        if (zzcei.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcei.zzF());
        }
        zzcei.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(View view, WindowManager windowManager, zzcei zzcei, Map map) {
        int i10;
        zzcei.zzN().zzA(new zzdhw(this, map));
        if (map != null) {
            Context context = view.getContext();
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) a0.c().zzb(zzbar.zzhu)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) a0.c().zzb(zzbar.zzhv)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcei.zzag(zzcfx.zzb(zzf, zzf2));
            try {
                zzcei.zzG().getSettings().setUseWideViewPort(((Boolean) a0.c().zzb(zzbar.zzhw)).booleanValue());
                zzcei.zzG().getSettings().setLoadWithOverviewMode(((Boolean) a0.c().zzb(zzbar.zzhx)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams b10 = z0.b();
            b10.x = zzf3;
            b10.y = zzf4;
            windowManager.updateViewLayout(zzcei.zzF(), b10);
            String str = (String) map.get(AdUnitActivity.EXTRA_ORIENTATION);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str)) {
                    i10 = rect.bottom;
                } else {
                    i10 = rect.top;
                }
                this.zzc = new zzdhx(view, zzcei, str, b10, i10 - zzf4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcei.loadUrl(str2);
            }
        }
    }
}
