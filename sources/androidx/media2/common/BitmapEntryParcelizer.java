package androidx.media2.common;

import android.graphics.Bitmap;
import androidx.media2.common.MediaMetadata;
import androidx.versionedparcelable.a;

public final class BitmapEntryParcelizer {
    public static MediaMetadata.BitmapEntry read(a aVar) {
        MediaMetadata.BitmapEntry bitmapEntry = new MediaMetadata.BitmapEntry();
        bitmapEntry.f4155a = aVar.E(bitmapEntry.f4155a, 1);
        bitmapEntry.f4156b = (Bitmap) aVar.A(bitmapEntry.f4156b, 2);
        return bitmapEntry;
    }

    public static void write(MediaMetadata.BitmapEntry bitmapEntry, a aVar) {
        aVar.K(false, false);
        aVar.h0(bitmapEntry.f4155a, 1);
        aVar.d0(bitmapEntry.f4156b, 2);
    }
}
