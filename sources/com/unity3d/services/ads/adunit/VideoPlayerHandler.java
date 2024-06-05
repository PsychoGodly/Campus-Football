package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.ads.video.VideoPlayerView;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.ViewUtilities;

public class VideoPlayerHandler implements IAdUnitViewHandler {
    private RelativeLayout _videoContainer;
    private VideoPlayerView _videoView;

    public boolean create(IAdUnitActivity iAdUnitActivity) {
        DeviceLog.entered();
        if (this._videoContainer == null) {
            this._videoContainer = new RelativeLayout(iAdUnitActivity.getContext());
        }
        if (this._videoView != null) {
            return true;
        }
        this._videoView = new VideoPlayerView(iAdUnitActivity.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this._videoView.setLayoutParams(layoutParams);
        this._videoContainer.addView(this._videoView);
        VideoPlayer.setVideoPlayerView(this._videoView);
        return true;
    }

    public boolean destroy() {
        DeviceLog.entered();
        VideoPlayerView videoPlayerView = this._videoView;
        if (videoPlayerView != null) {
            videoPlayerView.stopVideoProgressTimer();
            this._videoView.stopPlayback();
            ViewUtilities.removeViewFromParent(this._videoView);
            if (this._videoView.equals(VideoPlayer.getVideoPlayerView())) {
                VideoPlayer.setVideoPlayerView((VideoPlayerView) null);
            }
            this._videoView = null;
        }
        RelativeLayout relativeLayout = this._videoContainer;
        if (relativeLayout == null) {
            return true;
        }
        ViewUtilities.removeViewFromParent(relativeLayout);
        this._videoContainer = null;
        return true;
    }

    public View getView() {
        return this._videoContainer;
    }

    public void onCreate(IAdUnitActivity iAdUnitActivity, Bundle bundle) {
        create(iAdUnitActivity);
    }

    public void onDestroy(IAdUnitActivity iAdUnitActivity) {
    }

    public void onPause(IAdUnitActivity iAdUnitActivity) {
        destroy();
    }

    public void onResume(IAdUnitActivity iAdUnitActivity) {
    }

    public void onStart(IAdUnitActivity iAdUnitActivity) {
    }

    public void onStop(IAdUnitActivity iAdUnitActivity) {
    }
}
