package androidx.media2.common;

import androidx.versionedparcelable.a;

public final class MediaMetadataParcelizer {
    public static MediaMetadata read(a aVar) {
        MediaMetadata mediaMetadata = new MediaMetadata();
        mediaMetadata.f4153b = aVar.k(mediaMetadata.f4153b, 1);
        mediaMetadata.f4154c = (ParcelImplListSlice) aVar.A(mediaMetadata.f4154c, 2);
        mediaMetadata.c();
        return mediaMetadata;
    }

    public static void write(MediaMetadata mediaMetadata, a aVar) {
        aVar.K(false, false);
        mediaMetadata.d(aVar.g());
        aVar.O(mediaMetadata.f4153b, 1);
        aVar.d0(mediaMetadata.f4154c, 2);
    }
}
