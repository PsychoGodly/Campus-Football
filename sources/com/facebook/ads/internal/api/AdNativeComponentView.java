package com.facebook.ads.internal.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
public abstract class AdNativeComponentView extends RelativeLayout implements AdComponentView {
    /* access modifiers changed from: protected */
    public AdComponentViewApi mAdComponentViewApi;
    private final AdComponentViewParentApi mAdComponentViewParentApi = new a();

    class a implements AdComponentViewParentApi {
        a() {
        }

        public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            AdNativeComponentView.super.addView(view, i10, layoutParams);
        }

        public void bringChildToFront(View view) {
            AdNativeComponentView.super.bringChildToFront(view);
        }

        public void onAttachedToWindow() {
            AdNativeComponentView.super.onAttachedToWindow();
        }

        public void onDetachedFromWindow() {
            AdNativeComponentView.super.onDetachedFromWindow();
        }

        public void onMeasure(int i10, int i11) {
            AdNativeComponentView.super.onMeasure(i10, i11);
        }

        public void onVisibilityChanged(View view, int i10) {
            AdNativeComponentView.super.onVisibilityChanged(view, i10);
        }

        public void onWindowFocusChanged(boolean z10) {
            AdNativeComponentView.super.onWindowFocusChanged(z10);
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            AdNativeComponentView.super.setLayoutParams(layoutParams);
        }

        public void setMeasuredDimension(int i10, int i11) {
            AdNativeComponentView.super.setMeasuredDimension(i10, i11);
        }

        public void addView(View view) {
            AdNativeComponentView.super.addView(view);
        }

        public void addView(View view, int i10) {
            AdNativeComponentView.super.addView(view, i10);
        }

        public void addView(View view, ViewGroup.LayoutParams layoutParams) {
            AdNativeComponentView.super.addView(view, layoutParams);
        }

        public void addView(View view, int i10, int i11) {
            AdNativeComponentView.super.addView(view, i10, i11);
        }
    }

    public AdNativeComponentView(Context context) {
        super(context);
    }

    public void addView(View view) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view);
        } else {
            super.addView(view);
        }
    }

    /* access modifiers changed from: protected */
    public void attachAdComponentViewApi(AdComponentViewApiProvider adComponentViewApiProvider) {
        if (!DynamicLoaderFactory.isFallbackMode()) {
            if (this.mAdComponentViewApi == null) {
                adComponentViewApiProvider.getAdComponentViewApi().onAttachedToView(this, this.mAdComponentViewParentApi);
                this.mAdComponentViewApi = adComponentViewApiProvider.getAdComponentViewApi();
                return;
            }
            throw new IllegalStateException("AdComponentViewApi can't be attached more then once.");
        }
    }

    public void bringChildToFront(View view) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.bringChildToFront(view);
        } else {
            super.bringChildToFront(view);
        }
    }

    public abstract View getAdContentsView();

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onDetachedFromWindow();
        } else {
            super.onDetachedFromWindow();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onVisibilityChanged(view, i10);
        } else {
            super.onVisibilityChanged(view, i10);
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onWindowFocusChanged(z10);
        } else {
            super.onWindowFocusChanged(z10);
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.setLayoutParams(layoutParams);
        } else {
            super.setLayoutParams(layoutParams);
        }
    }

    public AdNativeComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void addView(View view, int i10) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i10);
        } else {
            super.addView(view, i10);
        }
    }

    public AdNativeComponentView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public AdNativeComponentView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    public void addView(View view, int i10, int i11) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i10, i11);
        } else {
            super.addView(view, i10, i11);
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }
}
