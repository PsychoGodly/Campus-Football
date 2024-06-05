package androidx.media2.session;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.a;

public final class PlaybackInfoParcelizer {
    public static MediaController$PlaybackInfo read(a aVar) {
        MediaController$PlaybackInfo mediaController$PlaybackInfo = new MediaController$PlaybackInfo();
        mediaController$PlaybackInfo.f4211a = aVar.v(mediaController$PlaybackInfo.f4211a, 1);
        mediaController$PlaybackInfo.f4212b = aVar.v(mediaController$PlaybackInfo.f4212b, 2);
        mediaController$PlaybackInfo.f4213c = aVar.v(mediaController$PlaybackInfo.f4213c, 3);
        mediaController$PlaybackInfo.f4214d = aVar.v(mediaController$PlaybackInfo.f4214d, 4);
        mediaController$PlaybackInfo.f4215e = (AudioAttributesCompat) aVar.I(mediaController$PlaybackInfo.f4215e, 5);
        return mediaController$PlaybackInfo;
    }

    public static void write(MediaController$PlaybackInfo mediaController$PlaybackInfo, a aVar) {
        aVar.K(false, false);
        aVar.Y(mediaController$PlaybackInfo.f4211a, 1);
        aVar.Y(mediaController$PlaybackInfo.f4212b, 2);
        aVar.Y(mediaController$PlaybackInfo.f4213c, 3);
        aVar.Y(mediaController$PlaybackInfo.f4214d, 4);
        aVar.m0(mediaController$PlaybackInfo.f4215e, 5);
    }
}
