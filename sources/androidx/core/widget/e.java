package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* compiled from: ImageViewCompat */
public class e {

    /* compiled from: ImageViewCompat */
    static class a {
        static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    public static ColorStateList a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.a(imageView);
        }
        if (imageView instanceof n) {
            return ((n) imageView).getSupportImageTintList();
        }
        return null;
    }

    public static PorterDuff.Mode b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.b(imageView);
        }
        if (imageView instanceof n) {
            return ((n) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            a.c(imageView, colorStateList);
            if (i10 == 21 && (drawable = imageView.getDrawable()) != null && a.a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof n) {
            ((n) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            a.d(imageView, mode);
            if (i10 == 21 && (drawable = imageView.getDrawable()) != null && a.a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof n) {
            ((n) imageView).setSupportImageTintMode(mode);
        }
    }
}
