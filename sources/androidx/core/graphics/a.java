package androidx.core.graphics;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: BitmapCompat */
public final class a {

    /* renamed from: androidx.core.graphics.a$a  reason: collision with other inner class name */
    /* compiled from: BitmapCompat */
    static class C0034a {
        static int a(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    public static int a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0034a.a(bitmap);
        }
        return bitmap.getByteCount();
    }
}
