package com.applovin.impl.adview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

public class AppLovinVideoView extends VideoView {
    public AppLovinVideoView(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public void setVideoSize(int i10, int i11) {
        getHolder().setFixedSize(i10, i11);
        requestLayout();
        invalidate();
    }
}
