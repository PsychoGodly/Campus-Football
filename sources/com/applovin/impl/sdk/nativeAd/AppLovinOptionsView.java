package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.up;
import com.applovin.sdk.R;

public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final Uri privacyDestinationUri;
    private final k sdk;

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, Context context) {
        super(context);
        this.sdk = kVar;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            ImageViewUtils.setImageUri(imageView, privacyIconUri, kVar);
        } else {
            imageView.setImageResource(R.drawable.applovin_ic_privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnClickListener((View.OnClickListener) null);
        removeAllViews();
    }

    public void onClick(View view) {
        up.a(this.privacyDestinationUri, k.k(), this.sdk);
    }
}
