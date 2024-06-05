package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public interface DefaultMediaViewVideoRendererApi {
    public static final int MEDIA_VIEW_RENDERER_CHILD_TYPE_BACKGROUND_PLAYBACK = 1;
    public static final int MEDIA_VIEW_RENDERER_CHILD_TYPE_DEFAULT = 0;

    void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i10);

    void onPrepared();
}
