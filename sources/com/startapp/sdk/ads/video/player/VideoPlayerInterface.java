package com.startapp.sdk.ads.video.player;

/* compiled from: Sta */
public interface VideoPlayerInterface {

    /* compiled from: Sta */
    public enum VideoPlayerErrorType {
        UNKNOWN,
        SERVER_DIED,
        BUFFERING_TIMEOUT
    }

    /* compiled from: Sta */
    public interface a {
    }

    /* compiled from: Sta */
    public interface b {
    }

    /* compiled from: Sta */
    public interface c {
    }

    /* compiled from: Sta */
    public interface d {
    }

    /* compiled from: Sta */
    public interface e {
    }

    /* compiled from: Sta */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public VideoPlayerErrorType f16701a;

        /* renamed from: b  reason: collision with root package name */
        public String f16702b;

        /* renamed from: c  reason: collision with root package name */
        public int f16703c;

        public f(VideoPlayerErrorType videoPlayerErrorType, String str, int i10) {
            this.f16701a = videoPlayerErrorType;
            this.f16702b = str;
            this.f16703c = i10;
        }
    }
}
