package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.ee;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a  reason: collision with root package name */
    private final View f14027a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f14028b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f14029c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f14030d;

    /* renamed from: f  reason: collision with root package name */
    private final Button f14031f;

    /* renamed from: g  reason: collision with root package name */
    private final ImageView f14032g;

    /* renamed from: h  reason: collision with root package name */
    private final FrameLayout f14033h;

    /* renamed from: i  reason: collision with root package name */
    private final ViewGroup f14034i;

    /* renamed from: j  reason: collision with root package name */
    private final FrameLayout f14035j;

    /* renamed from: k  reason: collision with root package name */
    private final ViewGroup f14036k;

    /* renamed from: l  reason: collision with root package name */
    private final ViewGroup f14037l;

    /* renamed from: m  reason: collision with root package name */
    private final FrameLayout f14038m;

    /* renamed from: n  reason: collision with root package name */
    private b f14039n;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f14040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f14041b;

        a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f14040a = weakReference;
            this.f14041b = viewGroup;
        }

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f14040a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                k.A0.L();
                if (t.a()) {
                    k.A0.L().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f14040a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f14041b.getLayoutParams();
            layoutParams.height = ((View) this.f14041b.getParent()).getWidth();
            this.f14041b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup != null) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
            }
        }
    }

    public b getAdViewTracker() {
        return this.f14039n;
    }

    public TextView getAdvertiserTextView() {
        return this.f14029c;
    }

    public TextView getBodyTextView() {
        return this.f14030d;
    }

    public Button getCallToActionButton() {
        return this.f14031f;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f14028b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f14029c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f14030d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f14031f;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f14032g;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f14033h;
    }

    public ImageView getIconImageView() {
        return this.f14032g;
    }

    public View getMainView() {
        return this.f14027a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f14038m;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f14037l;
        return viewGroup != null ? viewGroup : this.f14038m;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f14035j;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f14034i;
        return viewGroup != null ? viewGroup : this.f14035j;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f14036k;
    }

    public TextView getTitleTextView() {
        return this.f14028b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f14039n;
        if (bVar != null) {
            bVar.c();
        }
        if (!isHardwareAccelerated()) {
            t.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void recycle() {
        setOnClickListener((View.OnClickListener) null);
        b bVar = this.f14039n;
        if (bVar != null) {
            bVar.a();
            this.f14039n = null;
        }
        View view = this.f14027a;
        if (view != null && view.getParent() != this) {
            ViewGroup viewGroup = (ViewGroup) this.f14027a.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                removeView(viewGroup);
            }
            addView(this.f14027a);
        }
    }

    public void render(ee eeVar, a.C0126a aVar, k kVar) {
        recycle();
        if (!eeVar.p0().get() || !eeVar.n0().get()) {
            this.f14039n = new b(eeVar, this, aVar, kVar);
        }
        MaxNativeAd nativeAd = eeVar.getNativeAd();
        if (eeVar.q0() && nativeAd.isContainerClickable()) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new a(nativeAd));
        }
        if (StringUtils.isValidString(eeVar.o0())) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
            return;
        }
        kVar.L();
        if (t.a()) {
            kVar.L().a("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        TextView textView = this.f14028b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f14030d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f14029c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f14031f;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f14032g;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable((Drawable) null);
            } else if (icon.getDrawable() != null) {
                this.f14032g.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                ImageViewUtils.setAndDownscaleImageUri(this.f14032g, icon.getUri());
            } else {
                this.f14032g.setImageDrawable((Drawable) null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f14037l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f14037l.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f14034i;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f14034i.addView(optionsView);
                this.f14034i.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f14036k;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f14036k.addView(appLovinStarRatingView);
            }
        }
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) {
                return R.layout.max_native_ad_media_banner_view;
            }
            if ("vertical_media_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_media_banner_view;
            }
            return R.layout.max_native_ad_banner_view;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            if ("vertical_leader_template".equals(str)) {
                return R.layout.max_native_ad_vertical_leader_view;
            }
            return R.layout.max_native_ad_leader_view;
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd r3, java.lang.String r4, android.content.Context r5) {
        /*
            r2 = this;
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r0 = new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder
            r1 = -1
            r0.<init>((int) r1)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r0.setTemplateType(r4)
            int r0 = com.applovin.sdk.R.id.applovin_native_title_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setTitleTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_advertiser_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setAdvertiserTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_body_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setBodyTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_cta_button
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setCallToActionButtonId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_icon_image_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconImageViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_icon_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconContentViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_options_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_star_rating_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setStarRatingContentViewGroupId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_media_content_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentFrameLayoutId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r4.build()
            r2.<init>((com.applovin.mediation.nativeAds.MaxNativeAd) r3, (com.applovin.mediation.nativeAds.MaxNativeAdViewBinder) r4, (android.content.Context) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.MaxNativeAdView.<init>(com.applovin.mediation.nativeAds.MaxNativeAd, java.lang.String, android.content.Context):void");
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        int i10;
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f14027a = view;
        } else {
            if (z10) {
                i10 = a(maxNativeAdViewBinder.templateType, format);
            } else {
                i10 = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f14027a = LayoutInflater.from(context).inflate(i10, this, false);
        }
        addView(this.f14027a);
        this.f14028b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f14029c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f14030d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f14031f = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f14032g = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f14033h = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f14034i = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f14035j = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f14036k = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f14037l = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f14038m = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        if (this.f14028b == null) {
            t.j("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f14028b.setText(maxNativeAd.getTitle());
        } else {
            this.f14028b.setVisibility(8);
        }
        if (this.f14029c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f14029c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f14029c.setVisibility(8);
            }
        }
        if (this.f14030d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f14030d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f14030d.setVisibility(8);
            } else {
                this.f14030d.setVisibility(4);
            }
        }
        if (this.f14031f != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f14031f.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f14031f.setVisibility(8);
            } else {
                this.f14031f.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f14033h;
        if (frameLayout != null) {
            if (icon == null || this.f14032g == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f14033h.removeAllViews();
                    this.f14033h.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f14032g.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f14033h.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f14032g, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f14035j;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f14035j.addView(optionsView);
            this.f14035j.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f14038m != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f14038m.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f14038m.setVisibility(8);
            }
        }
        if (this.f14036k != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f14036k.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f14036k.addView(appLovinStarRatingView);
            } else {
                this.f14036k.setVisibility(8);
            }
        }
        b();
        postDelayed(new b(this), 2000);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }
}
