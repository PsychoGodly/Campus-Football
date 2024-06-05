package androidx.media2.common;

import androidx.versionedparcelable.ParcelImpl;
import i1.a;
import i1.b;

public class MediaParcelUtils {

    private static class MediaItemParcelImpl extends ParcelImpl {

        /* renamed from: b  reason: collision with root package name */
        private final MediaItem f4157b;

        MediaItemParcelImpl(MediaItem mediaItem) {
            super((b) new MediaItem(mediaItem));
            this.f4157b = mediaItem;
        }

        /* renamed from: d */
        public MediaItem c() {
            return this.f4157b;
        }
    }

    public static <T extends b> T a(ParcelImpl parcelImpl) {
        return a.a(parcelImpl);
    }

    public static ParcelImpl b(b bVar) {
        if (bVar instanceof MediaItem) {
            return new MediaItemParcelImpl((MediaItem) bVar);
        }
        return (ParcelImpl) a.d(bVar);
    }
}
