package com.applovin.mediation.nativeAds;

import android.view.View;

public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final View f14043a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14044b;

        /* renamed from: c  reason: collision with root package name */
        private int f14045c;

        /* renamed from: d  reason: collision with root package name */
        private int f14046d;

        /* renamed from: e  reason: collision with root package name */
        private int f14047e;

        /* renamed from: f  reason: collision with root package name */
        private int f14048f;

        /* renamed from: g  reason: collision with root package name */
        private int f14049g;

        /* renamed from: h  reason: collision with root package name */
        private int f14050h;

        /* renamed from: i  reason: collision with root package name */
        private int f14051i;

        /* renamed from: j  reason: collision with root package name */
        private int f14052j;

        /* renamed from: k  reason: collision with root package name */
        private int f14053k;

        /* renamed from: l  reason: collision with root package name */
        private int f14054l;

        /* renamed from: m  reason: collision with root package name */
        private int f14055m;

        /* renamed from: n  reason: collision with root package name */
        private String f14056n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f14043a, this.f14044b, this.f14045c, this.f14046d, this.f14047e, this.f14048f, this.f14049g, this.f14052j, this.f14050h, this.f14051i, this.f14053k, this.f14054l, this.f14055m, this.f14056n);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f14046d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f14047e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f14055m = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setIconContentViewId(int i10) {
            this.f14049g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f14048f = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i10) {
            this.f14054l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f14053k = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i10) {
            this.f14051i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f14050h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i10) {
            this.f14052j = i10;
            return this;
        }

        /* access modifiers changed from: protected */
        public Builder setTemplateType(String str) {
            this.f14056n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f14045c = i10;
            return this;
        }

        public Builder(int i10) {
            this(i10, (View) null);
        }

        private Builder(int i10, View view) {
            this.f14045c = -1;
            this.f14046d = -1;
            this.f14047e = -1;
            this.f14048f = -1;
            this.f14049g = -1;
            this.f14050h = -1;
            this.f14051i = -1;
            this.f14052j = -1;
            this.f14053k = -1;
            this.f14054l = -1;
            this.f14055m = -1;
            this.f14044b = i10;
            this.f14043a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
