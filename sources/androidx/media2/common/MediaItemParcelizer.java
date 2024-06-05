package androidx.media2.common;

import androidx.versionedparcelable.a;

public final class MediaItemParcelizer {
    public static MediaItem read(a aVar) {
        MediaItem mediaItem = new MediaItem();
        mediaItem.f4144b = (MediaMetadata) aVar.I(mediaItem.f4144b, 1);
        mediaItem.f4145c = aVar.y(mediaItem.f4145c, 2);
        mediaItem.f4146d = aVar.y(mediaItem.f4146d, 3);
        mediaItem.c();
        return mediaItem;
    }

    public static void write(MediaItem mediaItem, a aVar) {
        aVar.K(false, false);
        mediaItem.d(aVar.g());
        aVar.m0(mediaItem.f4144b, 1);
        aVar.b0(mediaItem.f4145c, 2);
        aVar.b0(mediaItem.f4146d, 3);
    }
}
