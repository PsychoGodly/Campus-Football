package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.bq;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.R;

public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final t logger;
    protected final k sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, Context context) {
        super(context);
        setBackgroundColor(-16777216);
        this.sdk = kVar;
        this.logger = kVar.L();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        bq vastAd = appLovinNativeAdImpl.getVastAd();
        Uri s02 = vastAd != null ? vastAd.s0() : null;
        if (mainImageUri == null && s02 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) kVar.a(oj.S2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(kVar, oj.D0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView2;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(imageView2, mainImageUri);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        removeAllViews();
    }

    public float getAspectRatio() {
        Drawable drawable;
        ImageView imageView2 = this.imageView;
        if (imageView2 == null || (drawable = imageView2.getDrawable()) == null) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }
}
