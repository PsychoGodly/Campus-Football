package com.unity3d.services.ads.api;

import android.os.Build;
import com.unity3d.services.ads.video.VideoPlayerError;
import com.unity3d.services.ads.video.VideoPlayerEvent;
import com.unity3d.services.ads.video.VideoPlayerView;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class VideoPlayer {
    private static VideoPlayerView _videoPlayerView;

    @WebViewExposed
    public static void getCurrentPosition(WebViewCallback webViewCallback) {
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(Integer.valueOf(getVideoPlayerView().getCurrentPosition()));
            return;
        }
        webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getProgressEventInterval(WebViewCallback webViewCallback) {
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(Integer.valueOf(getVideoPlayerView().getProgressEventInterval()));
            return;
        }
        webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    public static VideoPlayerView getVideoPlayerView() {
        return _videoPlayerView;
    }

    @WebViewExposed
    public static void getVideoViewRectangle(WebViewCallback webViewCallback) {
        VideoPlayerView videoPlayerView = getVideoPlayerView();
        if (videoPlayerView != null) {
            int[] videoViewRectangle = videoPlayerView.getVideoViewRectangle();
            webViewCallback.invoke(Integer.valueOf(videoViewRectangle[0]), Integer.valueOf(videoViewRectangle[1]), Integer.valueOf(videoViewRectangle[2]), Integer.valueOf(videoViewRectangle[3]));
            return;
        }
        webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getVolume(WebViewCallback webViewCallback) {
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(Float.valueOf(getVideoPlayerView().getVolume()));
            return;
        }
        webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void pause(WebViewCallback webViewCallback) {
        DeviceLog.debug("Pausing current video");
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                if (VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().pause();
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void play(WebViewCallback webViewCallback) {
        DeviceLog.debug("Starting playback of prepared video");
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                if (VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().play();
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void prepare(String str, Double d10, WebViewCallback webViewCallback) {
        prepare(str, d10, 0, webViewCallback);
    }

    @WebViewExposed
    public static void seekTo(final Integer num, WebViewCallback webViewCallback) {
        DeviceLog.debug("Seeking video to time: " + num);
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                if (VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().seekTo(num.intValue());
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setInfoListenerEnabled(boolean z10, WebViewCallback webViewCallback) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 16) {
            webViewCallback.error(VideoPlayerError.API_LEVEL_ERROR, Integer.valueOf(i10), Boolean.valueOf(z10));
        } else if (getVideoPlayerView() != null) {
            getVideoPlayerView().setInfoListenerEnabled(z10);
            webViewCallback.invoke(WebViewEventCategory.VIDEOPLAYER, VideoPlayerEvent.INFO, Boolean.valueOf(z10));
        } else {
            webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setProgressEventInterval(final Integer num, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                if (VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().setProgressEventInterval(num.intValue());
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    public static void setVideoPlayerView(VideoPlayerView videoPlayerView) {
        _videoPlayerView = videoPlayerView;
    }

    @WebViewExposed
    public static void setVolume(Double d10, WebViewCallback webViewCallback) {
        DeviceLog.debug("Setting video volume: " + d10);
        if (getVideoPlayerView() != null) {
            getVideoPlayerView().setVolume(Float.valueOf(d10.floatValue()));
            webViewCallback.invoke(d10);
            return;
        }
        webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void stop(WebViewCallback webViewCallback) {
        DeviceLog.debug("Stopping current video");
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                if (VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().stop();
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void prepare(final String str, final Double d10, final Integer num, WebViewCallback webViewCallback) {
        DeviceLog.debug("Preparing video for playback: " + str);
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                if (VideoPlayer.getVideoPlayerView() != null) {
                    VideoPlayer.getVideoPlayerView().prepare(str, d10.floatValue(), num.intValue());
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(str);
            return;
        }
        webViewCallback.error(VideoPlayerError.VIDEOVIEW_NULL, new Object[0]);
    }
}
