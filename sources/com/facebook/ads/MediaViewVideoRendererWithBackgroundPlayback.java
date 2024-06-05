package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public final class MediaViewVideoRendererWithBackgroundPlayback extends MediaViewVideoRenderer {
    private DefaultMediaViewVideoRendererApi mDefaultMediaViewVideoRendererApi;

    public MediaViewVideoRendererWithBackgroundPlayback(Context context) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context) {
        DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi = DynamicLoaderFactory.makeLoader(context).createDefaultMediaViewVideoRendererApi();
        this.mDefaultMediaViewVideoRendererApi = createDefaultMediaViewVideoRendererApi;
        createDefaultMediaViewVideoRendererApi.initialize(context, this, getMediaViewVideoRendererApi(), 1);
    }

    public void onPrepared() {
        super.onPrepared();
        this.mDefaultMediaViewVideoRendererApi.onPrepared();
    }

    public boolean shouldAllowBackgroundPlayback() {
        return true;
    }

    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initialize(context);
    }

    public MediaViewVideoRendererWithBackgroundPlayback(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initialize(context);
    }
}
