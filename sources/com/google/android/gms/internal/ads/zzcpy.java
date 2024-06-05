package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcpy extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcpy(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcpy zza(Context context, View view, zzeyc zzeyc) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcpy zzcpy = new zzcpy(context);
        if (!(zzeyc.zzv.isEmpty() || (resources = zzcpy.zza.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            zzeyd zzeyd = (zzeyd) zzeyc.zzv.get(0);
            float f10 = displayMetrics.density;
            zzcpy.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) zzeyd.zza) * f10), (int) (((float) zzeyd.zzb) * f10)));
        }
        zzcpy.zzb = view;
        zzcpy.addView(view);
        t.z();
        zzcaa.zzb(zzcpy, zzcpy);
        t.z();
        zzcaa.zza(zzcpy, zzcpy);
        JSONObject jSONObject = zzeyc.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcpy.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcpy.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcpy.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcpy.addView(relativeLayout);
        return zzcpy;
    }

    private final int zzb(double d10) {
        x.b();
        return zzbyt.zzy(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", MaxReward.DEFAULT_LABEL));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb2 = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb2, 0, zzb2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }
}
