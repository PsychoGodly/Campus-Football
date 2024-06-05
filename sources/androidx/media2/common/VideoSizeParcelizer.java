package androidx.media2.common;

import androidx.versionedparcelable.a;

public final class VideoSizeParcelizer {
    public static VideoSize read(a aVar) {
        VideoSize videoSize = new VideoSize();
        videoSize.f4170a = aVar.v(videoSize.f4170a, 1);
        videoSize.f4171b = aVar.v(videoSize.f4171b, 2);
        return videoSize;
    }

    public static void write(VideoSize videoSize, a aVar) {
        aVar.K(false, false);
        aVar.Y(videoSize.f4170a, 1);
        aVar.Y(videoSize.f4171b, 2);
    }
}
