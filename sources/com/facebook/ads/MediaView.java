package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public class MediaView extends AdNativeComponentView {
    /* access modifiers changed from: private */
    public AdViewConstructorParams mConstructorParams;
    /* access modifiers changed from: private */
    public MediaViewApi mMediaViewApi;

    class a implements Runnable {
        a() {
        }

        public void run() {
            MediaView.this.removeAllViews();
            AdComponentViewApi unused = MediaView.this.mAdComponentViewApi = null;
            MediaView mediaView = MediaView.this;
            MediaViewApi unused2 = mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(mediaView.mConstructorParams.getContext()).createMediaViewApi();
            MediaView mediaView2 = MediaView.this;
            mediaView2.attachAdComponentViewApi(mediaView2.mMediaViewApi);
            MediaView.this.mMediaViewApi.initialize(MediaView.this.mConstructorParams, MediaView.this);
        }
    }

    public MediaView(Context context) {
        super(context);
        initializeSelf(new AdViewConstructorParams(context));
    }

    private void initializeSelf(AdViewConstructorParams adViewConstructorParams) {
        this.mConstructorParams = adViewConstructorParams;
        MediaViewApi createMediaViewApi = DynamicLoaderFactory.makeLoader(adViewConstructorParams.getContext()).createMediaViewApi();
        this.mMediaViewApi = createMediaViewApi;
        attachAdComponentViewApi(createMediaViewApi);
        this.mMediaViewApi.initialize(adViewConstructorParams, this);
    }

    public void destroy() {
        this.mMediaViewApi.destroy();
    }

    public View getAdContentsView() {
        return this.mMediaViewApi.getAdContentsView();
    }

    public int getMediaHeight() {
        return this.mMediaViewApi.getMediaHeight();
    }

    public MediaViewApi getMediaViewApi() {
        return this.mMediaViewApi;
    }

    public int getMediaWidth() {
        return this.mMediaViewApi.getMediaWidth();
    }

    public void repair(Throwable th) {
        post(new a());
    }

    public void setListener(MediaViewListener mediaViewListener) {
        this.mMediaViewApi.setListener(mediaViewListener);
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        this.mMediaViewApi.setVideoRenderer(mediaViewVideoRenderer);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(new AdViewConstructorParams(context, attributeSet));
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initializeSelf(new AdViewConstructorParams(context, attributeSet, i10));
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initializeSelf(new AdViewConstructorParams(context, attributeSet, i10, i11));
    }
}
