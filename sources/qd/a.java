package qd;

import android.graphics.Bitmap;

/* compiled from: CompressFormats.kt */
public final class a {
    public static final Bitmap.CompressFormat a(int i10) {
        if (i10 == 0) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (i10 == 1) {
            return Bitmap.CompressFormat.PNG;
        }
        if (i10 != 2) {
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.WEBP;
    }
}
