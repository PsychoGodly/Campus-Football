package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public MaxAdFormat f14012a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f14013b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f14014c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f14015d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f14016e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public MaxNativeAdImage f14017f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public View f14018g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public View f14019h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public View f14020i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public MaxNativeAdImage f14021j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public float f14022k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public Double f14023l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f14012a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f14014c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f14015d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f14016e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f14017f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f14018g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f14021j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f14022k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f14020i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f14019h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.f14023l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f14013b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f14012a;
        this.title = builder.f14013b;
        this.advertiser = builder.f14014c;
        this.body = builder.f14015d;
        this.callToAction = builder.f14016e;
        this.icon = builder.f14017f;
        this.iconView = builder.f14018g;
        this.optionsView = builder.f14019h;
        this.mediaView = builder.f14020i;
        this.mainImage = builder.f14021j;
        this.mediaContentAspectRatio = builder.f14022k;
        Double d10 = builder.f14023l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView != null && (callToActionButton = maxNativeAdView.getCallToActionButton()) != null) {
            callToActionButton.performClick();
        }
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    public static class MaxNativeAdImage {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f14024a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f14025b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f14024a = drawable;
        }

        public Drawable getDrawable() {
            return this.f14024a;
        }

        public Uri getUri() {
            return this.f14025b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f14025b = uri;
        }
    }
}
